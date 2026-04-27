package com.multi.base.module;

public class StringEx {
    private char []value;
    public StringEx() {

    }
    public StringEx(char []value) {
        this.value = value;
    }

    public char charAt(int index) throws StringIndexOutOfBoundsException {
        if(index >= value.length || index < 0) {
            throw new StringIndexOutOfBoundsException();
        }
        return value[index];
    }

    public boolean equals(Object object){
        if(this == object) return true;
        if(object instanceof String){
            char[] temp = ((String)object).toCharArray();
            if(value.length == temp.length){
                for(int i=0;i<value.length;i++){
                    if(value[i] != temp[i]){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        StringEx str1 = new StringEx("abc".toCharArray());
        StringEx str2 = new StringEx("def".toCharArray());
        System.out.println(str1.equals("abc"));
        System.out.println(str1.equals(str2));
        System.out.println(str2.charAt(-1));
    }

}
