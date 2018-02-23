package com.syl.thread;

public class Bank {

    int [] accounts;
    public  void transfer(int from, int to, double amount){
        System.out.print(Thread.currentThread());
        accounts[from] -=amount;
        System.out.printf(" %10.2f %d to %d ",amount,from,to);
        accounts[to] +=amount;
        //System.out.printf("Total balance: %10.2f%n",getBalance());
        System.out.println(accounts[from]);
        System.out.println(accounts[to]);

    }

    public  int size(){

        System.out.println("ddddd");

        return accounts.length;
    }
}
