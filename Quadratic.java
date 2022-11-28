public class Quadratic {

    public static void findRoots(int a, int b, int c) {
        double discriminant = (b * b) - (4 * a * c);
        double root1, root2;
        double imaginary, real;
        int root1Int, root2Int, imaginaryInt, realInt;

        if (discriminant >= 0) {
            root1 = (-b + Math.sqrt(discriminant))/(2 * a);
            root2 = (-b - Math.sqrt(discriminant))/(2 * a);

            if (root1 == Math.rint(root1)) {
                root1Int = (int) root1;
                System.out.print(root1Int + ", ");

                if (root2 == Math.rint(root2)) {
                    root2Int = (int) root2;
                    System.out.print(root2Int + "\n");
                }

                else {
                    System.out.print(root2 + "\n");
                }
            }

            else if (root2 == Math.rint(root2)) {
                root2Int = (int) root2;
                System.out.print(root1 + ", " + root2Int + "\n");
            }

            else 
                System.out.println(root1 + ", " + root2);
        }
        else {
            if (b == 0) {
                root1 = (Math.sqrt(-discriminant))/(2 * a);
                root2 = (-Math.sqrt(-discriminant))/(2 * a);

                if (root1 == Math.rint(root1)) {
                    root1Int = (int) root1;
                    System.out.print(root1Int + "i, ");
    
                    if (root2 == Math.rint(root2)) {
                        root2Int = (int) root2;
                        System.out.print(root2Int + "i" + "\n");
                    }

                    else {
                        System.out.print(root2 + "i" + "\n");
                    }
                }
    
                else if (root2 == Math.rint(root2)) {
                    root2Int = (int) root2;
                    System.out.print(root1 + "i, " + root2Int + "i" + "\n");
                }
    
                else 
                    System.out.println(root1 + "i, " + root2 + "i");

            }

            else {
                imaginary = (Math.sqrt(-discriminant))/(2 * a);
                real = (double) -b/ (double) (2 * a);

                if (real == Math.rint(real)) {
                    realInt = (int) real;

                    if (imaginary == Math.rint(imaginary)) {
                        imaginaryInt = (int) imaginary;
                        if (imaginary == 1) 
                            System.out.println(realInt + " + i, " + realInt + " - i");
                        else 
                            System.out.printf("%d + %di, %d - %di \n", realInt, imaginaryInt, realInt, imaginaryInt);
                    }
                }

                else if (imaginary == Math.rint(imaginary)) {
                    imaginaryInt = (int) imaginary;

                    if (imaginary == 1)
                        System.out.println(real + " + i, " + real + " - i \n");

                    else
                        System.out.printf("%f + %di, %f - %di \n", real, imaginaryInt, real, imaginaryInt);
                }

                else 
                    System.out.println(real + " + " + imaginary + "i, " + real + " - " + imaginary + "i");
            }
        }
    }
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        findRoots(a, b, c);
    }
}