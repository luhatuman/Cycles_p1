public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        for (int f = 1; f <= 10; f++) {
            System.out.println(f);
        }
        //Task 2
        System.out.println();
        System.out.println("Task 2");
        for (int f = 10; f >= 1; f--) {
            System.out.println(f);
        }
        //Task 3
        System.out.println();
        System.out.println("Task 3");
        for (int f = 0; f <= 17; f += 2) {
            System.out.println(f);
        }
        //Task 4
        System.out.println();
        System.out.println("Task 4");
        for (int f = 10; f >= -10; f--) {
            System.out.print(" " + f);
        }
        //Task 5 Високосные годы 1904 - 2096
        System.out.println("\n");
        System.out.println("Task 5");
        for (int a = 1904; a <= 2096; a ++) {
            if (a %4 == 0) {
                System.out.println(a + " год является високосным");
            }
        }
        //Task 6 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println();
        System.out.println("Task 6");
        for (int n = 7; n <= 98; n += 7) {
            System.out.print(" " + n);

        }
    }
}