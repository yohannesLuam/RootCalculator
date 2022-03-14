import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class RootsOfQuadraticEquations {
    public static void main(String[] args) throws IOException {
        double a, b, c, delta, x1, x2; char rootsNumber=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program calculates the roots of the quadratic equation, ax^2+bx+c=0");
        System.out.println("Enter the value of a (and press Enter):");
        a = Double.parseDouble(br.readLine());

        if (a==0){
            System.out.println("Illegal value of the coefficient a.");
        } else {
            System.out.println("Enter the value of b (and press Enter):");
            b = Double.parseDouble(br.readLine());
            System.out.println("Enter the value of c (and press Enter):");
            c = Double.parseDouble(br.readLine());

            delta = pow(b, 2)-4*a*c;

            if (delta<0) rootsNumber = 0;
            if (delta==0) rootsNumber = 1;
            if (delta>0) rootsNumber = 2;

            switch (rootsNumber){
                case 0: System.out.println("There are no real roots."); break;
                case 1: {
                    x1 = -b/(2*a);
                    System.out.printf("For a = " + "%4.2f,", a);
                    System.out.printf("b = " + "%4.2f,", b);
                    System.out.printf("c = " + "%4.2f,", c);
                    System.out.print("It has one double root = ");
                    System.out.printf("%4.2f. \n", x1);
                } break;
                case 2: {
                    x1 = (-b-Math.sqrt(delta))/(2*a);
                    x2 = (-b+sqrt(delta))/(2*a);
                    System.out.printf("For a " + "%4.2f,", a);
                    System.out.printf("b = " + "%4.2f,", b);
                    System.out.printf("c = " + "%4.2f. \n", c);
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f. \n", x1);
                    System.out.print("x2 = ");
                    System.out.printf("%4.2f. \n", x2);
                } break;
            }
        }
    }
}
