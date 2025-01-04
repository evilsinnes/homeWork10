public class Main {
    public static void main(String[] args) {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);




    }
}