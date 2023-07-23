package Interface;
interface ABC
{
    int x=100;
    void mi();  // public
}

interface  XYZ
{
    int y=200;
    void m2();
}

public class MultipleInheritanceTest implements ABC,XYZ{

    @Override
    public void mi() {

        System.out.println(x);
    }

    @Override
    public void m2() {

        System.out.println(y);
    }

    public static void main(String[] args) {

        MultipleInheritanceTest test = new MultipleInheritanceTest();

        test.mi();
        test.m2();
    }
}
