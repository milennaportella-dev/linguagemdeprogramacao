import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double measure;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A MEDIDA DE POLEGADA PARA MILIMETRO<--");
        System.out.println("Digite a medida em polegada: ");
        measure = in.nextDouble();

        System.out.println("A medida convertida de polegada para milimetro é: " +(measure*25.4));
    }
}