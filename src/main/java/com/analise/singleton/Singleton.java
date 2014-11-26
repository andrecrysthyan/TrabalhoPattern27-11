package com.analise.singleton;

/**
 *
 * @author Marco
 */
public class Singleton {
    private static Singleton instance = null;
    private long date;
    
    private Singleton() 
    {
        date = System.currentTimeMillis();
    }

    public Long getData() {

        return date;
    }
    
    public static Singleton getInstance(){
        if(instance==null){
            return new Singleton();
    } else{
    return instance;
}
    }
}
