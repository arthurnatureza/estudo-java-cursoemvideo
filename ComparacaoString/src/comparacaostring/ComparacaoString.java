/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author ArthurNatureza <arthurnatureza@gmail.com>
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Arthur";
        String nome2 = "Arthur";
        String nome3 = new String("Arthur");
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
    
}
