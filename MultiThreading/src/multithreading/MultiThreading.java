/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithreading;

/**
 *
 * @author PHIEO_o
 */
public class MultiThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        System.out.println("LEts Race\n");
        thread1.start();
        thread2.start();
    }
}
class Thread1 extends Thread{
    public void run(){
        int i = 1;
        while(i< 10000){
            System.out.println("Thread1: I'm first: "+ i);
            try{
                Thread.sleep(10);
            }
                catch(InterruptedException e){
                    }
            i++;
            }
        }
    }

class Thread2 extends Thread{
    public void run(){
        int i = 1;
        while(i< 10000){
            System.out.println("\t\t\t\t\t\t\tThread2: I'm first: "+ i);
            try{
                Thread.sleep(10);
            }
                catch(InterruptedException e){
                    }
            i++;
            }
        }
    }

        
