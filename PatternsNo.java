
// 11111
// 11111
// 11111
// 11111
// 11111
class PatternsNo {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("1");
            }
            System.out.println("1");

        }
    }
}

// 11111
// 00000
// 11111
// 00000
// 11111
class PatternaNo2 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();

        }

    }
}

// 01010
// 01010
// 01010
// 01010
// 01010
class PatternNo3 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}

// 11111
// 10001
// 10001
// 10001
// 11111
class PatternNo4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}

// 11111
// 11111
// 11011
// 11111
// 11111
class PatternNo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 && j == 3) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }
}

// 10101
// 01010
// 10101
// 01010
// 10101
class PatternNo6 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 4; j++) {
                {
                    System.out.print(k);
                    if (k == 1) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }
    }
}

// 11011
// 11011
// 00000
// 11011
// 11011
class PatternNo7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= 1 && j == 3 || j >= 1 && i == 3 || i != 1) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }
}

// 10001
// 01010
// 00100
// 01010
// 10001
class PatternaNo8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || i + j == 6) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

// 01110
// 10001
// 10001
// 10001
// 01110

class PatternaNo9 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if ((i == 1 || i == 5) && (j == 1 || j == 5)) {
                    System.out.print("0");
                } else if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("1");
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

// 11111
// 22222
// 33333
// 44444
// 55555

class PatternaNo10 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}

// 12345
// 12345
// 12345
// 12345
// 12345

class PatternaNo11 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// 12345
// 23456
// 34567
// 45678
// 56789

class PatternaNo12 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25

class PatternaNo13 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}

// 55555
// 54444
// 54333
// 54322
// 54321
class PatternaNo14 {
    public static void main(String[] args) {
        int i, j, rows, cols;
        rows = 0;
        cols = 0;
        for (i = 1; i <= rows; i++) {
            for (j = cols; j > cols - i; j--) {
                System.out.println("j");
            }

            for (j = 1; j <= cols - i; j++) {

                System.out.println(rows - i + 1);
            }

            System.out.println();

        }

    }
}


        // 1 1
        // 2 2
        // 3 3
        // 4 4
        // 5
        // 4 4
        // 3 3
        // 2 2
        // 1 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i == j || i + j == 2 * n + 1) {
                    System.out.print(i);

                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i == j || i + j == 2 * n + 1) {
                    System.out.print(i);

                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
        System.out.println()
