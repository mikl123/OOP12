package com.example.Stamping_API;


public class Sinature implements Task {
    int x;
    int y;
    public Sinature(int x, int y){
        this.x = x;
        this.y = y;
    }
    int get_x(){return x;}
    int get_y(){return y;}
    @Override
    public int apply(Visitor v) {
        return  v.signature_apply(this);
    }
}
