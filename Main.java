import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов в группе: ");
        int numberOfStudents = scanner.nextInt();
        double[] grades = new double[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Введите оценку студента " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        double average = total / numberOfStudents;
        int countAboveAverage = 0;
        for (double grade : grades) {
            if (grade > average) {
                countAboveAverage++;
            }
        }
        System.out.printf("Средний балл по группе: %.2f%n", average);
        System.out.println("Количество студентов, получивших оценку выше среднего: " + countAboveAverage);
    }
}