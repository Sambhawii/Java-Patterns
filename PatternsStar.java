
/* 
 *****
 *****
 *****
 *****
 *****
 */
public class PatternsStar {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i < 6; i++) {
            for (j = 1; j < 5; j++)
                System.out.print("*");
            System.out.println("*");
        }
    }
}

/*
 *
 **
 ***
 ****
 *****
 */

class Patterns2 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i < 6; i++) {
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
}

/*
 
*****
****
***
**
*
     */

class Patterns3 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i < 6; i++) {
            for (j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
}

// *
// **
// ***
// ****
// *****

class Patterns4 {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 8 - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

// *****
// * *
// * *
// * *
// *****
class Patterns6 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i < 6; i++) {
            for (j = 1; j < 6; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5 || i == 3 && j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println(" ");

        }
    }
}
