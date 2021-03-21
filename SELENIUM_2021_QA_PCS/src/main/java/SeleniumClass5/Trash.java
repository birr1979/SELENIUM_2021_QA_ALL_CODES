package SeleniumClass5;

public class Trash {
    static int x = 9;

    public static void main(String[] args) {

        //1
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= x; j++) {
                System.out.print(" M ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //2
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" # ");
            }
            System.out.println("");
        }

        //3
        System.out.println("\n");
        for (int i = 0; i < x; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" B");
            }
            System.out.println(" ");

        }
        for (int i = x; i >= 0; i--) {
            for (int j = i + 1; j > 0; j--) {
                System.out.print(" B");
            }
            System.out.println(" ");
        }

        System.out.println("\n");


        //4
        for (int i = x; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(" ? ");
            }
            System.out.println("");
        }

        System.out.println("\n");

        //5
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" * * ");
            }
            System.out.println(" * * * ");
        }
        System.out.println("\n");

        //6

        for (int i = 0; i < x + 6; i++) {
            for (int j = 0; j < x; j++) {
                if (i == x / 2 || j == x / 2) {
                    System.out.print(" E**E ");
                } else {
                    System.out.print("   x  ");
                }

            }
            System.out.println("");
        }

        System.out.println("\n");

        //7
        for (int i = 0; i < x + 6; i++) {
            for (int j = 0; j < x; j++) {
                if (i == (int) x / 2 || j == (int) x / 2) {
                    System.out.print(" E**E ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println("");
        }

        System.out.println("\n");


        //8
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= x; j++) {
                if (i == 0 || j == 0 || i == x || i == x || j == x) {
                    System.out.print(" ** ");
                    System.out.print("*");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");


        //9
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= x; j++) {
                if (i == 0 || j == 0 || i == x || i == x || j == x) {
                    System.out.print(" ** ");
                    System.out.print("*");
                } else {
                    System.out.print("   @ ");
                }
            }
            System.out.println("");
        }


    }

}
