package com.syl.thread;

/**
 * P 20
 */
public class TransferRunnable implements   Runnable {
    public void run () {
        Bank bank = new Bank();
        int toAccount = (int) (bank.size()*Math.random());
       // double
    }
}
