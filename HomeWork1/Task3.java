/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {10,9,8,7,6,5};
        System.out.println(Arrays.toString(getArraysDifference(array1, array2)));
    }

    static int[] getArraysDifference(int[] array1, int[] array2) {
        if (array1.length != array2.length){
            throw new RuntimeException("Длины массивов не равны!");
        }
        int[] diffArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++){
            diffArray[i] = array2[i] - array1[i];
        }
        return diffArray;
    }
}
