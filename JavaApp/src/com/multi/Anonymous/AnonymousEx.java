package com.multi.Anonymous;

import com.multi.inner.Outer;
import java.util.ArrayList;
import java.util.Iterator;

public class AnonymousEx extends Outer {

    // 다중 상속이 불가능하기 때문에,
    // 원하는 메소드만 익명변수로 가져와서
    // extend하지 않고 override를 진행한다.
    ArrayList list = new ArrayList(){
        @Override
        public Iterator iterator() {
            return super.iterator();
        }
    };

    public void listAdd(){

        System.out.println(this.toString());

    }

    public static void main(String[] args) {
        AnonymousEx ex = new AnonymousEx();
        ex.listAdd();
    }

}
