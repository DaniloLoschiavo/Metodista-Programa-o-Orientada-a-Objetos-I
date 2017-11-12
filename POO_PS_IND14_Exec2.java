import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * 2) Crie um programa em Java que leia um valor de um mês. 
 * Feito isso, exiba em tela o valor correspondente ao bimestre daquele mês utilizando um condicional do tipo SWITCH.
 * 
 */
public class POO_PS_IND14_Exec2 {

    public static void main(String[] args) {
        //Crie um programa em Java que leia um valor de um mês. 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, insira o número referente ao mês para saber o bimestre.");
        int mes = entrada.nextInt();

        //exiba em tela o valor correspondente ao bimestre daquele mês utilizando um condicional do tipo SWITCH.
        switch(mes){
            case 1://Janeiro
            case 2://Fevereiro
                System.out.println("Primeiro bimestre.");
                break;
            case 3://Março
            case 4://Abril
                System.out.println("Segundo bimestre.");
                break;
            case 5://Maio
            case 6://Junho
                System.out.println("Terceiro bimestre.");
                break;
            case 7://Julho
            case 8://Agosto
                System.out.println("Quarto bimestre.");
                break;
            case 9://Setembro
            case 10://Outubro
                System.out.println("Quinto bimestre.");
                break;
            case 11://Novembro
            case 12://Dezembro
                System.out.println("Sexto bimestre.");
                break;
            default:
                System.out.println("Valor inválido.");
                break;
        }
    }
}