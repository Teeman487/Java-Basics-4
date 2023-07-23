package AccessModifier;
class A
{

    private int dat=10;
     private void m4(){
         System.out.println("Protecetd");
     }
    /*int data =10;
    void m1(){
        System.out.println(data);
    }*/

    protected int data =10;
    protected void m1(){
        System.out.println(data);
    }
}


public class Simple{ // 2nd class
    public static void main(String[] args) {
        A aobj = new A();
       // aobj.data;  // compile time error(can't reference a variable)
        aobj.m1(); // compile time error


        aobj.m1();
        System.out.println(aobj.data);
        //aobj.dat // compile time error(can't reference a variable)

//        aobj.m4();
    }
}
