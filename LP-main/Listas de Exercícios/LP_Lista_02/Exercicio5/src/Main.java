import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double speed;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A VELOCIDADE DE KM/H PARA M/S<--");
        System.out.println("Digite a velocidade em km/h: ");
        speed = in.nextDouble();

        System.out.println("A velocidade convertida de km/h para m/s é: " +(speed/3.6));
    }
}