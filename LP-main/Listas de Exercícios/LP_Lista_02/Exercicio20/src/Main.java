import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double raiz_1;
        double raiz_2;

        Scanner in = new Scanner(System.in);

        System.out.println("ENCONTRA OS VALORES DOS COEFICIENTES A PARTIR DAS RAÍZES INSERIDAS");
        System.out.println("ax + bx + c = 0");
        System.out.println("Digite o valor da raiz '1': ");
        raiz_1 = in.nextDouble();
        System.out.println("Digite o valor da raiz '2': ");
        raiz_2 = in.nextDouble();


        double coeficiente_b = -(raiz_1+raiz_2);
        double coeficiente_c = (raiz_1*raiz_2);


        System.out.printf("A Equação de Segundo Grau é: x²" +coeficiente_b +"x +" + coeficiente_c);

    }
}