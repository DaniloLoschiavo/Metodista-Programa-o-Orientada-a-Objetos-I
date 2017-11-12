import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * 1) Crie um programa em Java que leia um valor de temperatura da cor de uma lâmpada em Kelvin. 
 * Feito isto, informe ao usuário a cor correspondente a esta lâmpada.
 *
 * a. Tabela referência de cores:
 *
 * de 0 a 1000 – Vermelho Intenso
 * de 1001 a 2000 – Luz de Velas
 * de 2001 a 4000 – Por do sol
 * de 4001 a 5000 – Lâmpada Fluorescente
 * de 5001 a 6500 – Luz do meio dia
 * de 6501 a 8000 – Céu azul
 * de 8001 a 9600 – Céu nublado
 *
 * Qualquer valor diferente dos acima listados deve gerar uma mensagem de valor inválido ao usuário.
 */
public class POO_PS_IND14_Exec1 {

    public static void main(String[] args) {
        //Crie um programa em Java que leia um valor de temperatura da cor de uma lâmpada em Kelvin.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, insira o valor de temperatura da cor de uma lâmpada em Kelvin.");
        int temperatura = entrada.nextInt();
        
        if(temperatura < 0 || temperatura > 9600){
			//Qualquer valor diferente deve gerar uma mensagem de valor inválido ao usuário.
            System.out.println("Valor inválido");
        }else if(temperatura <= 1000){
            //de 0 a 1000 – Vermelho Intenso
            System.out.println("Vermelho Intenso");
        }else if(temperatura <= 2000){
            //de 1001 a 2000 – Luz de Velas
            System.out.println("Luz de Velas");
        }else if(temperatura <= 4000){
            //de 2001 a 4000 – Por do sol
            System.out.println("Por do sol");
        }else if(temperatura <= 5000){
            //de 4001 a 5000 – Lâmpada Fluorescente
            System.out.println("Lâmpada Fluorescente");
        }else if(temperatura <= 6500){
            //de 5001 a 6500 – Luz do meio dia    
            System.out.println("Luz do meio dia");
        }else if(temperatura <= 8000){
            //de 6501 a 8000 – Céu azul
            System.out.println("Céu azul");
        }else if(temperatura <= 9600){
            //de 8001 a 9600 – Céu nublado
            System.out.println("Céu nublado");
        }
    }    
}