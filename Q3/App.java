package Q3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da venda 1: ");
        double v1 = input.nextDouble();

        System.out.print("Digite o valor da venda 2: ");
        double v2 = input.nextDouble();

        System.out.print("Digite o valor da venda 3: ");
        double v3 = input.nextDouble();

        System.out.print("Digite o valor da venda 4: ");
        double v4 = input.nextDouble();

        System.out.print("Digite o valor da venda 5: ");
        double v5 = input.nextDouble();

        double maior = v1;

        if (v2 > maior) maior = v2;
        if (v3 > maior) maior = v3;
        if (v4 > maior) maior = v4;
        if (v5 > maior) maior = v5;

        System.out.println("\nA maior venda realizada foi: R$ " + maior);

        input.close();
    }
}
