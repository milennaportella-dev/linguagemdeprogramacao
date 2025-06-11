import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in);
        double number1 = in.nextDouble();
        System.out.println("Digite outro número: ");
        double number2 = in.nextDouble();
        if(number1>number2){
            System.out.println("O primeiro número é maior! ");
        }
        else if(number2>number1){
            System.out.println("O segundo número é maio!");
        }
        else{
            System.out.println("Os números são iguais!");
        }
    }
}