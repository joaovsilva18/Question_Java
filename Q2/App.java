package Q2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        
          if (num2 != 0 && num1 != 0) {
            double division = num1 / num2;

            System.out.println("Soma: " + addition);
            System.out.println("Subtração: " + subtraction);
            System.out.println("Multiplicação: " + multiplication);
            System.out.println("Divisão: " + division);
        } else {
            System.out.println("Soma: " + addition);
            System.out.println("Subtração: " + subtraction);
            System.out.println("Multiplicação: " + multiplication);
            System.out.println("Erro: não é possível dividir por zero.");
        }

        input.close();
    }
}
