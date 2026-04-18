package ch07.sec07.exam01;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}


public class PromotionExample {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
    C c1 = e;

    //Class E는 Class B를 부모로 하지 않으므로 업캐스팅 불가능
//    B b3 = e;
    //Class D는 Class C를 부모로 하지 않으므로 업캐스팅 불간으
//    C c2 = d;
}
