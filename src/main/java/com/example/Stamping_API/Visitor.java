
package com.example.Stamping_API;

public interface Visitor {
    abstract int signature_apply(Sinature s);
    abstract int group_apply(Group g);
}
