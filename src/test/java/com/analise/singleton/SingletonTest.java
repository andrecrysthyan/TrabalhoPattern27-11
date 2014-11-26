package com.analise.singleton;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
/**
 *
 * @author Marco
 */
public class SingletonTest extends TestCase {
    
    private Singleton instancia, segundaInstancia;
    
    public void getDataPrimeiraTemQueSerIgualSegunda(){
        
        instancia = Singleton.getInstance();
        Long date = instancia.getData();
        segundaInstancia = Singleton.getInstance();
        Long dateSecondTime = segundaInstancia.getData();
        
        assertEquals(date, dateSecondTime);
    }
    
    public SingletonTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetInstance() {
        
        instancia = Singleton.getInstance();
        segundaInstancia = Singleton.getInstance();
        assertEquals(instancia, segundaInstancia);
    }
    
    
}
