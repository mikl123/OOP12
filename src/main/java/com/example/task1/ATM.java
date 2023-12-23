package com.example.task1;

public class ATM{
    public Tray firstTray;
    public Tray secondTray;
    public Tray thirdTray;
    public ATM(){
        firstTray = new Tray_100();
        secondTray = new Tray_50();
        thirdTray = new Tray_2();
        firstTray.setNext(secondTray);
        secondTray.setNext(thirdTray);
    }
    public int process(int i) {
        return firstTray.process(i);
    }
}