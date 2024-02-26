import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Optiunea?");
        String opt = scanner.nextLine();

        if (Objects.equals(opt, "info"))
            Ajutor.info();
        else if(Objects.equals(opt, "afisare"))
            Ajutor.afisare();

        Tester test;
        int result = Tester.getRng(5);


    }
}