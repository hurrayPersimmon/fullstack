package com.multi.Anonymous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class AnonymousEx2 extends ArrayList {
    ArrayList list = new ArrayList(){
        @Override
        public Iterator iterator() {
            return super.iterator();
        }
    };

    Vector vector = new Vector(){
        @Override
        public synchronized boolean isEmpty() {
            return super.isEmpty();
        }
    };

    public AnonymousEx2(){

    }

}
