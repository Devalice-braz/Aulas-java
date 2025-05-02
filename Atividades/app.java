import java.util.Scanner;
public class app {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    
    //Exercício 01
    System.out.println("digite seu nome: ");
    String nome = scanner.nextLine();
    System.out.println("olá, " + nome + ". Seja bem vindo.");

    //Exercício 02
    System.out.println("digite num1: ");
    int num1 = scanner.nextInt();
    System.out.println("digite num2: ");
    int num2 = scanner.nextInt();
    int soma = num1+num2; 
    System.out.println("a soma entre " + num1 + " e " + num2 + " é: " + soma);

    //Exercício 03
    System.out.println("digite sua idade em anos: ");
    int idade = scanner.nextInt();
    int idadeDias = idade*365;
    System.out.println("sua idade em dias equivale a: " + idadeDias);

    }
}