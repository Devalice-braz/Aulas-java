import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a sua nota da questão 1: ");
        int q1 = sc.nextInt(); 

        System.out.println("digite a sua nota da questão 2: ");
        int q2 = sc.nextInt();

        System.out.println("digite a sua nota da questão 3: ");
        int q3 = sc.nextInt();

        System.out.println("digite a sua nota da questão 4:" );
        int q4 = sc.nextInt();

        int somaNotas = (q1 + q2 + q3 + q4);
        
        if (q1 < 0 || q1 > 25 || q2 < 0 || q2 > 25 || q3 < 0 || q3 > 25 || q4 < 0 || q4 > 25) {
            System.out.println("Inválido");
        } else { 
            if (somaNotas < 50){
                System.out.println("Reprovado");
            } else if ((somaNotas >= 50 && somaNotas <= 74) && (q1 != 0 && q2 != 0 && q3 != 0 && q4 != 0)){
                System.out.println("Regular"); 
            } else if ((somaNotas >= 75 && somaNotas <= 89) && (q1 == 25 || q2 == 25 || q3 == 25 || q4 == 25)){
                System.out.println("Bom");
            } else if ((somaNotas >= 90) && (q1 >20 && q2 > 20 && q3 > 20 && q4 > 20)){
                System.out.println("Excelente");                
            }
        
        }
    } 
}