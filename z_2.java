package dz1;

// Вывести все простые числа от 1 до 1000

public class z_2 {
    public static void main(String args[]) {
        noun(1, 10);
}

    public static void noun(int x, int y) {
        int counter = 0;
        while (counter < y) {
            if (simple(x)) {
                System.out.println("i = " + x*x);
                counter++;
            }
            x++;
        }
    }

    public static boolean simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}
