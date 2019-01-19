package pl.sda.watki;

import java.util.Random;

public class DwaWatki extends Thread {

    public void run(){

        Random random = new Random();
        int i = random.nextInt();

        System.out.println("Liczba ta to: " + i + " a wynik to: " + i*2 + " thread: " + Thread.currentThread().getName());

    }
}
