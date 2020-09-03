/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author arthu
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30;
        //String valor = idade; Esses formatos não funcionam
        //String valor = (String) idade; Não funciona
        //O método abaixo é utilizado para converter Número para String
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String val = "32";
        //int num = val; não funciona
        //int num = (int) val; não funciona
        //O método abaixo é utilizado para converter String para Integer
        int num = Integer.parseInt(val);
        System.out.println(num);
        
        String va = "30.5";
        //O método abaixo é utilizado para converter String para Float
        float id = Float.parseFloat(va);
        System.out.printf("%.3f\n", id);
    }
    
}
