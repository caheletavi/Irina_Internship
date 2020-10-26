package ZooPark.java;
import java.time.LocalDateTime;
import java.time.Month;

public class Zoo {

    public static void main(String[] args) {
        LocalDateTime birthDayOfGiraffe = LocalDateTime.of(2017, Month.JUNE, 1, 13, 39);
        LocalDateTime birthDayOfElephant = LocalDateTime.of(2015, Month.JUNE, 17, 13, 10);

        Giraffe giraffe1 = new Giraffe("Ghena", 500, 250f, 300.25, 'M', birthDayOfGiraffe, true);
        Giraffe giraffe2 = new Giraffe("Vasea", 'M');
        Giraffe giraffe3 = new Giraffe();

        System.out.println(giraffe1);
        System.out.println(giraffe2);
        System.out.println(giraffe3);

        Elephant elephant1 = new Elephant("Eduard", 500, 250f, 300.25, 'M', birthDayOfElephant, true);
        Elephant elephant2 = new Elephant("Robert", true);
        Elephant elephant3 = new Elephant();

        System.out.println();
        System.out.println(elephant1);
        System.out.println(elephant2);
        System.out.println(elephant3);
    }
}
