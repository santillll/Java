import java.util.Scanner;

public class Media {
  public static void main(String[] args) {
       //Declaração de variáveis
       double n1, n2, media;
       
       //Objeto de entrada
       Scanner entrada = new Scanner(System.in);

       //Apresentação
       System.out.println("\n\t\t\t - - Média de Notas - - \n");

       //Entradas
       System.out.print("Informe a 1º nota:");
       n1 = entrada.nextDouble();

       System.out.print("Informe a 2º nota:");
       n2 = entrada.nextDouble();


       //Processamento
       media = (n1 + n2)/2;


      //Saída
      System.out.println("Nota 1:" + n1);
      System.out.println("Nota 2:" + n2);

      System.out.printf("\nMédia %.2f\n", media);
      

      
    }
}