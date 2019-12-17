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
public class Productor extends Thread {
  private Buffer buffer;
  private int id;
  private final String letras="abcdefghijklmnopqrstuvxyz";
  public Productor(Buffer buffer, int id) {
    this.buffer=buffer;
    this.id = id;
  }
    public void run() {
        for(int i=0; i<30; i++){
            char c=letras.charAt((int)(Math.random()*letras.length()));
            buffer.poner(c);
            System.out.println(i+" Productor"+this.id+": " +c);
            try {
                sleep(2000);
            } catch (InterruptedException e) { }
        }
    }
}
