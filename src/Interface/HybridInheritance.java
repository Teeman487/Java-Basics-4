package Interface;
class A1 {
    void m1() {
        System.out.println("This is m1 method from A1 class");
    }
}

    interface B1
    {
        void  m2();
    }

    interface B2
    {
        void m3();
    }
public class HybridInheritance extends A1 implements B1,B2{
    @Override
    public void m2() {
        System.out.println("This is m2 method from B1 interface");
    }

    @Override
    public void m3() {
        System.out.println("This is m3 method from B2 interface");
    }

    public static void main(String[] args) {

        HybridInheritance mi = new HybridInheritance();
        mi.m2();
        mi.m3();
        mi.m1();
    }
}

//Hybrid Inheritance.....
