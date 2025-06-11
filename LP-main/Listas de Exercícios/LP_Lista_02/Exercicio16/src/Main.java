import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double circle;

        double altura;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A ÁREA DE UM CONE A PARTIR DE SEU RAIO E ALTURA<--");
        System.out.println("Digite o raio em cm do cone: ");
        circle = in.nextDouble();
        System.out.println("Digite a altura em cm do cone: ");
        altura = in.nextDouble();

        double areacircle = Math.PI * Math.pow(circle, 2);
        System.out.println("A área do cone é: " + (((areacircle)*altura)/3) + " cm²");
    }
}