import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        //Declaração de variáveis
        double cel, fah; //cel - temperatura em graus celsius; fah - temperatura em graus fahreinheit
        int op; //Opção de usuário


        //Criação e instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação dos programas
        System.out.println("\n\t\t\t -- Conversor --\n");

       //Menu
       System.out.println("1. °C para °F");
       System.out.println("2. °F para °C");
       System.out.println("3. sair");

       //Ler a opção escolhida do usuário
       System.out.print("\nOpção");
       op = entrada.nextInt();

       if(op ==1){
        //Entradas
        System.out.print("Informe a temperatura em °C: ");
        cel = entrada.nextDouble();

        //Processamento
        fah = cel * 9 / 5 + 32;

        //Saida
        System.out.println("\n" + cel + "°C - " + fah + "°F\n");
    } else if (op ==2){
       
        
    
       //Converter Fahrenheit para Celcius
       System.out.println("Em construção aguarde");
    }else if (op ==3){
        System.out.println("\nAbraço Fiot!"); 
    } else {
        System.out.println("Opção" + op +"Incorreta");
    }





    }

    }   


