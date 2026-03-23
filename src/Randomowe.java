import java.util.Random;

public class Randomowe{
    public static void main(String[] args) {

        Random random = new Random();

        boolean isHeads;

        isHeads = random.nextBoolean();


        //System.out.println(isHeads);

        if(isHeads){
            System.out.println("You won");
        }
        else{
            System.out.println("You lost");
        }

        System.out.println("test");
    }

}