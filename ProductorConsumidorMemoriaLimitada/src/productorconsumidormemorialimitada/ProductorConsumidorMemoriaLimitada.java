/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidormemorialimitada;

/**
 *
 * @author link
 */
public class ProductorConsumidorMemoriaLimitada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ranuras = 10; // Tamaño de la memoria compartida
        Buffer monitor = new Buffer (ranuras);

        Productor p = new Productor(monitor);
        Consumidor c = new Consumidor(monitor);
        p.start();
        c.start();
    }
    
}
