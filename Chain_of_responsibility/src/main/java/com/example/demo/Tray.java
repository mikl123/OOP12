package com.example.demo;

public class Tray{
private Tray next;
private int denomination;
public Tray(int denomination){
    this.denomination = denomination;
}
public void setNext(Tray next){
    this.next = next;

}
public void process(int amount){
    int number = amount/denomination;
    System.out.println(denomination+" - "+ number);
    if (next != null){
    next.process(amount - number*denomination);
        }
    }
}