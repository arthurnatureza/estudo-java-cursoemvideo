package calculadoraidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author arthurnatureza
 */
public class CalculadoraIdade {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Calendar dataAtual = Calendar.getInstance();
        int ano = dataAtual.get(Calendar.YEAR);
        
        System.out.println("Informe o seu ano de nascimento: ");
        int anoNasc = teclado.nextInt();
        
        System.out.printf("De acordo com anos, você tem %d anos de idade.\n", 
                (ano - anoNasc));
        
        
    }
    
}
