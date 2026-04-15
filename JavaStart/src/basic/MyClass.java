package basic;

// variable, operator, control statement, array
public class MyClass {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
//        myClass.unaryOperator();
        myClass.logicalOperator(1, 2, 3, 4);
        myClass.bitwiseOperator(1, 2, 3, 4);
    }

    // ++,--, +, -, ~, !
    public void unaryOperator(){
        int x = 1, y = 2, z = 3;
        int result = ++x + y-- + ++z;
        System.out.println(result);
    }

    public void ternaryOperator(){

    }

    public void logicalOperator(int x, int y, int z, int k){
        boolean result = ++x == ++y && --z < ++k;

        System.out.println(result);
        System.out.println(x+ ", " + y +", "+ z +", " +k);
    }

    public void bitwiseOperator(int x, int y, int z, int k){
        boolean result = ++x == ++y & --z < ++k;

        System.out.println(result);
        System.out.println("bit : "+x+ ", " + y +", "+ z +", " +k);
    }

}
