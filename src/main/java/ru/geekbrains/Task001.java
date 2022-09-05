// 1. Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива такой,
// что сумма элементов с индексами < i равна сумме элементов с индексами > i.

package ru.geekbrains;

public class Task001 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                sum1 += nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                sum2 += nums[k];
            }
            if (sum1 == sum2) {
                System.out.printf("Индекс i, при котором сумма элементов с индексами < i равна сумме элементов с индексами > i = %d", i);
            }
            else {
                sum1 = 0;
                sum2 = 0;
            }
        }
    }
}
