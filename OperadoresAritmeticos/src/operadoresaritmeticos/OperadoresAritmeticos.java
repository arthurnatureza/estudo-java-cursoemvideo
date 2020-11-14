package operadoresaritmeticos;

/**
 *
 * @author ArthurNatureza <arthurnatureza@gmail.com>
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A média entre n1 e n2 é " + m);
        System.out.print("\n");
        
        int numero = 5;
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);
        int valor = 5 + numero++;
        System.out.println(valor);
        numero--;
        valor = 5 + ++numero;
        System.out.println(valor);
        valor = 5 + numero--;
        System.out.println(valor);
        numero++;
        valor = 5 + --numero;
        System.out.println(valor);
        System.out.print("\n");
        
        int x = 4;
        x += 2;//x=x+2
        System.out.println(x);
        System.out.print("\n");
        
        float v = 8.3f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        ar = (int) Math.ceil(v);
        System.out.println(ar);
        ar = (int) Math.round(v);
        System.out.println(ar);
        int neg = -10;
        int abso = Math.abs(neg);
        System.out.println(abso);
        System.out.print("\n");
        
        double ale = Math.random();
        System.out.println(ale);
        double alea = Math.random();
        int n = (int) (5+alea*(10-5));//Vai mostrar um numero entre 5 e 10
        //pode aparecer o 5, mas não aparece o 10
        System.out.println(n);
        
    }
    
}
