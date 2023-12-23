
package com.example.task_2_my;
import java.security.Signature;
import java.time.format.SignStyle;
import java.util.ArrayList;

public class Protocol1 implements Visitor {
@Override
public int signature_apply(Sinature s) {
    int x = s.get_x();
    int y = s.get_y();
    System.out.println(" Signature res " + (x+y));
    return 2;
}
@Override
public int group_apply(Group g) {
    ArrayList<Sinature> list = g.get_signatures();
    for(int i = 0; i<list.size();i++){
        Sinature s = list.get(i);
        int x = s.get_x();
        int y = s.get_y();
        System.out.println(" Group res " + (x+y));
    }
    return 1;
}
}
