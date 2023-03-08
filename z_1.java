package dz1;

//Вычислить n-ое треугольное число (сумма чисел от 1 до n),
//а также n! (произведение чисел от 1 до n)
// Ввод: 5
// Треугольное число (1+2+3+4+5) = 15
// n! 1*2*3*4*5 = 120

import java.util.Scanner;

public class z_1 {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
   
    
