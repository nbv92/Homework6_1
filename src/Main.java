// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static String firstName = "Ivan";
    static String middleName = "Ivanovich";
    static String lastName = "Ivanov";
    public static void task1() {
        System.out.println("Task1");
        String[] fullName = new String [] {firstName + ' ' + middleName + ' ' + lastName + ' '};
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Task2");
        String[] fullName = new String [] {firstName + ' ' + middleName + ' ' + lastName + ' '};
        System.out.println("Данные ФИО сотрудника для заполнения отчета — ");
        System.out.println(fullName.toUpperCase());//Cannot resolve method 'toUpperCase' in 'String'
    }

    public static void task3() {
        System.out.println("Task3");
        System.out.println("Данные ФИО сотрудника — ");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");
        System.out.print(fullName);
    }
}