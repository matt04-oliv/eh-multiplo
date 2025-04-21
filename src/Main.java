import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 % numero2 == 0){
            System.out.println(numero1 + " é múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " não é múltiplo de " + numero2);
        }
        scanner.close();
    }
}