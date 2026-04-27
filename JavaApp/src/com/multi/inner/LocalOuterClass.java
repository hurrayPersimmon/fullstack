package com.multi.inner;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LocalOuterClass {

    private int outerValue;
    public void method(){
        int localValue = 100;
        class LocalInner extends JButton {
            public LocalInner(){
                // outer class field access allowed
                outerValue = 100;
            }
        }
    }
    public void method1(){
        class LocalInner2 extends JPanel{

        }
        LocalInner2 localInner2 = new LocalInner2();

    }


}
