import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double measure;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A MEDIDA DE MILIMETROS PARA POLEGADA<--");
        System.out.println("Digite a medida em milimetros: ");
        measure = in.nextDouble();

        System.out.println("A medida convertida de milimetro para polegada é: " +(measure/25.4));
    }
}