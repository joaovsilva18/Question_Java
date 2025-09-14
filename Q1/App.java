import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = input.next();

        System.out.println("digite sua idade:");
        int idade = input.nextInt();

        System.out.println("Nome:" + nome);
        System.out.println("idade:" + idade);
        if (idade >= 18) {
            System.out.println("Voce é maior de idade");
        } else {
            System.out.println("voce eh menor de idade");
        }

        input.close();

    }
    /*
     * Método para realizar cálculo de média
     * //
     */
    // public static void main(String[] args) throws Exception {
    // Scanner input = new Scanner(System.in);

    // for(int cont= 1;cont <=5; cont++){
    // System.out.print("Digite o seu nome:");
    // String nome = input.next();

    // System.out.print("Digite a nota 1:");
    // double nota1 = input.nextDouble();

    // System.out.print("Digite a nota 2:");
    // double nota2 = input.nextDouble();

    // double media = (nota1+ nota2)/2;

    // System.out.println("Nome:" + nome);
    // System.out.println("Media:" + media);

    // boolean aprovado;
    // if(media >= 7){
    // aprovado = true;
    // }else{
    // aprovado = false;
    // }

    // System.out.println("Aprovado:" + aprovado);

    // }

    // input.close();
    // }

}