import java.util.Scanner;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число типа float: ");
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        if (!data.isEmpty()){
            System.out.println("Введено " + data);
        } else {
            throw new RuntimeException("Вы не ввели данных.");
        }
    }
}