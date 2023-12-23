package com.example.task1;

public class Tray{
private Tray next;
private int denomination;
public Tray(int denomination){
    this.denomination = denomination;
}
public void setNext(Tray next){
    this.next = next;

}
public int process(int amount){
    int number = amount/denomination;
    System.out.println(denomination+" - "+ number);
    if (next != null){
    next.process(amount - number*denomination);
        } 
    return number;
    }
   
}