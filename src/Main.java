//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Ex1
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника - " + fullName);
        System.out.println();

        //Ex2
        System.out.println("Задача 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        System.out.println();

        //Ex3
        System.out.println("Задача 3");

        System.out.println("Данные Ф. И. О. сотрудника - " + fullName.replace("ё", "е"));
        System.out.println();
    }
}