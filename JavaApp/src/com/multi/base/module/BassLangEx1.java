package com.multi.base.module;

public class BassLangEx1 {

    public void objectMethod1() {
        Object object = new Object();
        System.out.println(object.equals(object));
        System.out.println(object.hashCode());
        System.out.println(new Object().hashCode());
        System.out.println(object.toString());

    }

    public void objectMethod2(Object data) {
        if (data instanceof String) {
            System.out.println((String) data);
        }
        if (data instanceof Integer) {
            System.out.println((Integer) data);
        }
        if (data instanceof Double) {
            System.out.println((Double) data);
        }
    }

    public void objectMethod3(Object data) {
        String string1 = new String("abc");
        //명시적 선언
        String string2 = new String("abc");
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        // hashcode는 key value로 관리.
        System.out.println(string1.hashCode() == string2.hashCode());
        //암시적 선언 -> operator 연산자 작동으로, 새로운 객체 생성.
        String string3 = "java";
        String stirng4 = "spring";
        System.out.println(string3.startsWith("j"));
        System.out.println(string3.equals("JAVA"));

    }

    public void objectMethod4() {
        String string = "abc";
        System.out.println(string.charAt(4));
    }


    public static void main(String[] args) {
        BassLangEx1 bassLangEx1 = new BassLangEx1();
//        bassLangEx1.objectMethod1();
//        bassLangEx1.objectMethod2("objectMethod2");
        bassLangEx1.objectMethod3("objectMethod3");
        bassLangEx1.objectMethod4();


    }


}
