import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double speed;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A VELOCIDADE DE M/S PARA KM/H<--");
        System.out.println("Digite a velocidade em m/s: ");
        speed = in.nextDouble();

        System.out.println("A velocidade convertida de m/s para km/h é: " +(speed*3.6));
    }
}