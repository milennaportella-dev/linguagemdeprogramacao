import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite os valores de a, b e c separados por espaço: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = Math.pow(b,2)-4*a*c;
        x1 = (-b+Math.sqrt(delta))/2*a;
        x2 = (-b+Math.sqrt(delta))/2*a;


    }
}