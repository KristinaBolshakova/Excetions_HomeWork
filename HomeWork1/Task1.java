//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task1 {
    public static void main(String[] args) {
        getFirstException();  //ArithmeticException: / by zero
        getSecondException();   //NumberFormatException: For input string: "333abc"
        getThirdException(); //ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
    }

    static void getFirstException(){
        System.out.println(10/0);
    }

    static void getSecondException() {
        String num = "111abc";
        int result = Integer.parseInt(num);
        System.out.println(result);
    }

    static void getThirdException() {
        int[] mas = new int[5];
        System.out.println(mas[10]);
    }
}
