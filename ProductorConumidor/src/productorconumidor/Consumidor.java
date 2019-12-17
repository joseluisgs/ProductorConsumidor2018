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
public class Consumidor extends Thread {
  private Buffer buffer;
  private int id;
  public Consumidor(Buffer buffer, int id) {
    this.id = id;
    this.buffer=buffer;
  }
  public void run(){
    char valor;
    for(int i=0; i<10; i++){
        valor=buffer.recoger();
        System.out.println(i+ " Consumidor"+this.id+" : "+valor);
        try{
            sleep(100);
        }catch (InterruptedException e) { }
    }
  }
}