import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * 3) Crie um programa em Java que leia um valor de um mês e de um ano. 
 * Feito isto, utilizando um condicional do tipo SWITCH, exiba para o usuário a quantidade de dias que um mês possui.  
 * Lembre-se que o mês de fevereiro pode possuir 28 ou 29 dias a depender do ano.
 * 
 */
public class POO_PS_IND14_Exec3 {

    public static void main(String[] args) {
        //Crie um programa em Java que leia um valor de um mês e de um ano.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, insira o número referente ao mês.");
        int mes = entrada.nextInt();
        System.out.println("Agora insira o ano.");
        int ano = entrada.nextInt();
        
        //utilizando um condicional do tipo SWITCH, exiba para o usuário a quantidade de dias que um mês possui.
        switch(mes){
            case 2://Fevereiro
                //o mês de fevereiro pode possuir 28 ou 29 dias a depender do ano.
                if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
                    System.out.println("Possui 29 dias.");
                else
                    System.out.println("Possui 28 dias.");
                break;
            case 4://Abril
            case 6://Junho
            case 9://Setembro
            case 11://Novembro
                System.out.println("Possui 31 dias.");
                break;
            case 1://Janeiro
            case 3://Março
            case 5://Maio
            case 7://Julho
            case 8://Agosto
            case 10://Outubro
            case 12://Dezembro
                System.out.println("Possui 30 dias.");
                break;
            default:
                System.out.println("Mês inválido.");
                break;
        }
    }
    
}