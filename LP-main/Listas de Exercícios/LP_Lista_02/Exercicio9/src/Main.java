import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double distance;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A VELOCIDADE DE KM PARA MI<--");
        System.out.println("Digite a distância em KM: ");
        distance = in.nextDouble();

        System.out.println("A distância convertida de km para mi é: " +(distance/1.609));
    }
}