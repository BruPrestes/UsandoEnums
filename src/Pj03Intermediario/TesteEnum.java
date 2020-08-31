package Pj03Intermediario;

/**
 *
 * @author bpopr
 */

import Pj02Intermediario.DiaSemana;
public class TesteEnum {
    
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();
        /*
        Metodo values retorna um array de 
        enums
        */
        
        for (int i = 0; i <dias.length; i++) {
            System.out.println(dias[i]);
        }
        System.out.println();
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
    }
    
}
