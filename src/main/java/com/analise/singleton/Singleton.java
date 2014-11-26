package com.analise.singleton;

/**
 *
 * @author Marco
 */
public class Singleton {
    private static Singleton instance = null;
    
    private static Singleton getInstance(){
        if(instance==null){
            return new Singleton();
    } else{
    return instance;
}
    }
}
