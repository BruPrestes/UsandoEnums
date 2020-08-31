package Pj03Intermediario;

import Pj02Intermediario.DiaSemana;

/**
 *
 * @author bpopr
 */
public class TesteEnum2 {
    public static void main(String[] args) {
        DiaSemana dia;
        
        System.out.println("Dia da semana é " + Enum.valueOf(DiaSemana.class, "DOMINGO"));
        
        
    }
}
