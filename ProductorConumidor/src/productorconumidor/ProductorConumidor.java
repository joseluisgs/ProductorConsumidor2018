/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconumidor;

/**
 *
 * @author joseluisgs
 */
public class ProductorConumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buffer b=new Buffer();
        Productor p=new Productor(b, 1);
        Productor a=new Productor(b, 2);
        Consumidor c=new Consumidor(b, 1);
        Consumidor d=new Consumidor(b, 2);
        
        p.start();
        c.start();
        d.start();
        a.start();
    }
    
}
