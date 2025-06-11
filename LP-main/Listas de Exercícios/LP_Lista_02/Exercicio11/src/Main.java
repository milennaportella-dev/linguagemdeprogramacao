import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double temperature;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A TEMPERATURA DE GRAUS CELSIUS PARA FAHRENHEIT<--");
        System.out.println("Digite a temperatura em graus Celsius: ");
        temperature = in.nextDouble();

        System.out.println("A temperatura convertida de graus celsius para fahrenheit é: " +(temperature*1.8+32));
    }
}