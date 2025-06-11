import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double distance;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A VELOCIDADE DE MI PARA KM<--");
        System.out.println("Digite a distância em MI: ");
        distance = in.nextDouble();

        System.out.println("A distância convertida de mi para km é: " +(distance*1.609));
    }
}