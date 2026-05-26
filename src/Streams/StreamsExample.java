package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample {

    // Lista pracowników jako pole klasy
    private List<Employee> employees = new ArrayList<>();

    // Metoda setup inicjalizująca dane
    public void setUp() {
        Employee employee1 = new Employee("Honkytonk", "Cumbercooch", 25, List.of("Java", "Spring"));
        Employee employee2 = new Employee("Brewery", "Chickenstrips", 31, List.of("C#", ".NET"));
        Employee employee3 = new Employee("Beetlejuice", "Snugglesnatch", 23, List.of("JavaScript", "TypeScript"));
        Employee employee4 = new Employee("Boobytrap", "Humperdinck", 42, List.of("PHP", "Laravel"));
        Employee employee5 = new Employee("Buttermilk", "Bumbersplat", 38, List.of("Java", "Kotlin"));
        Employee employee6 = new Employee("Rinkydink", "Curdlesnoot", 30, List.of("C", "C++"));
        Employee employee7 = new Employee("Cogglesnatch", "Splishnsplash", 27, List.of("Python", "Django"));
        Employee employee8 = new Employee("Tiddleywomp", "Charmander", 51, List.of("Java", "Scala"));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
    }

    // Metoda getter dająca dostęp do listy pracowników
    public List<Employee> getEmployees() {
        return employees;
    }

    public void firstStream() {
        employees.stream()
                .forEach(employee -> System.out.println(employee));
    }

    // PUNKT STARTOWY PROGRAMU - To pozwala odpalić kod w IntelliJ
    public static void main(String[] args) {
        // 1. Tworzymy obiekt naszej klasy
        StreamsExample example = new StreamsExample();

        // 2. Wypełniamy listę employees danymi
        example.setUp();

        // 3. Odpalamy strumień, który wypisze pracowników w konsoli
        example.firstStream();
    }
}