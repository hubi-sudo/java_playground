import java.io.*;

public class iostream {
    static int n;
    static long[] bit1, bit2, val;
    static int[] cap;

    // BIT point update
    static void upd(long[] b, int i, long d) {
        for (; i <= n; i += i & -i) b[i] += d;
    }

    // BIT prefix sum query
    static long qry(long[] b, int i) {
        long s = 0;
        for (; i > 0; i -= i & -i) s += b[i];
        return s;
    }

    // ---- Fast I/O ----
    static final int BUF = 1 << 22; // 4 MB buffer
    static byte[] ibuf = new byte[BUF];
    static int ipos, ilen;

    static int rb() throws IOException {
        if (ipos == ilen) { ilen = System.in.read(ibuf, 0, BUF); ipos = 0; }
        return ipos < ilen ? ibuf[ipos++] & 0xff : -1;
    }

    static int ri() throws IOException {
        int c = rb(), v = 0;
        while (c <= ' ') c = rb();
        while (c >= '0') { v = v * 10 + c - '0'; c = rb(); }
        return v;
    }

    static long rl() throws IOException {
        int c = rb();
        long v = 0;
        while (c <= ' ') c = rb();
        while (c >= '0') { v = v * 10 + c - '0'; c = rb(); }
        return v;
    }

    static int rc() throws IOException {
        int c = rb();
        while (c <= ' ') c = rb();
        return c;
    }

    // ---- Main ----
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out, 1 << 22));

        n = ri();
        int q = ri();

        /*
         * We maintain two Fenwick trees:
         *   bit1[r] = val[r]  where val[r] = accum[r] - cap[r] * last_time[r]
         *   bit2[r] = cap[r]  (current capacity, 0 if inactive)
         *
         * For query Q i j t:
         *   answer = sum_{r=i}^{j} (val[r] + cap[r]*t)
         *          = BIT1.range(i,j) + t * BIT2.range(i,j)
         *
         * For update P i p t:
         *   new_val[i] = accum + cap*(t-last) - p*t = val + (cap-p)*t
         *   => delta_bit1 = (cap[i]-p)*t,  delta_bit2 = p-cap[i]
         *
         * For cancel C i t:
         *   Remove route i from both BITs (set contribution to 0).
         *
         * For assign A i p t:
         *   Route i restarts: new_val[i] = 0 - p*t = -p*t
         *   => delta_bit1 = -p*t - val[i],  delta_bit2 = p - cap[i]
         *
         * Note: val[] is maintained as a plain array (O(1) access) to avoid
         * extra BIT point-queries on C and A operations.
         */

        bit1 = new long[n + 1];
        bit2 = new long[n + 1];
        val  = new long[n + 1];
        cap  = new int [n + 1];

        // Initial state: airplane i assigned to route i at t=0 with capacity p_i
        // val[i] = 0 - p_i * 0 = 0 => BIT1 stays zero
        for (int i = 1; i <= n; i++) {
            cap[i] = ri();
            upd(bit2, i, cap[i]);
        }

        for (int k = 0; k < q; k++) {
            int type = rc(); // 'P', 'C', 'A', or 'Q'

            if (type == 'P') {
                // P i p t  —  change capacity of airplane i to p at time t
                int i = ri(), p = ri();
                long t = rl();
                long d = (long)(cap[i] - p) * t;
                upd(bit1, i, d);
                val[i] += d;
                upd(bit2, i, p - cap[i]);
                cap[i] = p;

            } else if (type == 'C') {
                // C i t  —  deactivate airplane i (t consumed but not needed for BIT removal)
                int i = ri();
                rl(); // consume t
                upd(bit1, i, -val[i]);
                val[i] = 0;
                upd(bit2, i, -cap[i]);
                cap[i] = 0;

            } else if (type == 'A') {
                // A i p t  —  reactivate airplane i with capacity p from day t
                int i = ri(), p = ri();
                long t = rl();
                long nv = -(long)p * t;       // new val[i] = 0 - p*t
                upd(bit1, i, nv - val[i]);
                val[i] = nv;
                upd(bit2, i, p - cap[i]);
                cap[i] = p;

            } else { // 'Q'
                // Q i j t  —  sum of seat-days for active routes [i..j] from day 0 to day t
                int i = ri(), j = ri();
                long t = rl();
                long sv = qry(bit1, j) - qry(bit1, i - 1); // sum of val[r]
                long sc = qry(bit2, j) - qry(bit2, i - 1); // sum of cap[r]
                out.println(sv + t * sc);
            }
        }

        out.flush();
    }
}