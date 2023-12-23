
package com.example.Stamping_API;

import java.util.ArrayList;

public class Group implements Task{
    ArrayList<Sinature> myList;
    public Group(){
         myList = new ArrayList<>();
    }
public void add_signature(Sinature s){
    myList.add(s);
}
ArrayList<Sinature> get_signatures(){
    return myList;
}
@Override
public int apply(Visitor v) {
    
    return v.group_apply(this);
}
}
