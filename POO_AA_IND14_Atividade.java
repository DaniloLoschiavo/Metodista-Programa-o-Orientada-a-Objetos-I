import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * 1) Crie um programa em Java que leia um valor de um ano informado pelo usuário. 
 * Feito isto, diga se o ano é ou não bissexto.
 * 
 * a. Para o cálculo dos anos bissextos:
 * 
 * De 4 em 4 anos é ano bissexto.
 * De 100 em 100 anos não é ano bissexto.
 * De 400 em 400 anos é ano bissexto.
 * Prevalecem as últimas regras sobre as primeiras.
 * 
 */
public class POO_AA_IND14_Atividade {

    public static void main(String[] args) {
        //Crie um programa em Java que leia um valor de um ano informado pelo usuário. 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, insira o ano.");
        int ano = entrada.nextInt();
        
        //diga se o ano é ou não bissexto.
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
            System.out.println("É ano bissexto.");
        else
            System.out.println("Não é ano bissexto");
    }
}