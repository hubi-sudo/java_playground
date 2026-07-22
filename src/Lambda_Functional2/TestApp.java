package Lambda_Functional2;

import java.util.Arrays;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {

        Sum sum = (a, b) -> a + b;

        System.out.println(sum.calculate(2,5));

        System.out.println("----------------------------");

        Factor factor = a -> a * a;

        System.out.println(factor.factor(8));

        System.out.println("----------------------------");

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        integerList.forEach(element -> System.out.println(element));

        System.out.println("----------------------------");

        integerList.forEach(element -> {
            int x = 5;
            element += x;
            System.out.println(element * 10);
        });

        System.out.println("----------------------------");

        NothingSpecial nothingSpecial = TestApp::printMessage;

        nothingSpecial.nothing();

    }

    private static void printMessage() {
        System.out.println("Hello");
    }

}
