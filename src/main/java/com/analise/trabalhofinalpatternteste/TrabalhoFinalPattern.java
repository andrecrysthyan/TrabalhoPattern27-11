package com.analise.trabalhofinalpatternteste;

/**
 *
 * @author Andre
 */
public class TrabalhoFinalPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
CarroBuilder builder = new CarroBuilder();
        Carro c = builder.criaCarroSedan();
        c.salvarCarro();
        Carro d = builder.criaCarroHatch();
        d.salvarCarro();
    }
    
}
