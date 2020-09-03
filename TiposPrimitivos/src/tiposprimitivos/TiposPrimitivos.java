/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author arthur
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "Arthur";
        float nota = 8.5f;
        System.out.println("Sua nota é: " + nota);
        System.out.printf("Sua nota é %.2f: \n", nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
    }
    
}
