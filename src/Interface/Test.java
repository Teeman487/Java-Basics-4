package Interface;
interface A
{
    int a=10; // by default variables interface are static and final
    void m1(); // abstract method, by default public
}

public class Test implements A{


    @Override
    public void m1()
    {
        System.out.println();

    }

    public static void main(String[] args) {

        /*Test t = new Test();
        t.m1();*/

        A a = new Test();
        a.m1();

    }
}

// Interface doesnt have memory,likewise class, except object
