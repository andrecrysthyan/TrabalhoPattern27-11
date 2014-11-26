/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.analise.trabalhofinalpatternteste;

/**
 *
 * @author vinicius.gomes
 */
public class CarroBuilder {
    
    public Carro criaCarroSedan(){
        Carro c = new CriaCarro();
        c.setPosMontar(new Sedan());
        return c;
    }
    
    public Carro criaCarroHatch(){
        Carro c = new CriaCarro();
        c.setPosMontar(new Hatch());
        return c;
    }
    
}