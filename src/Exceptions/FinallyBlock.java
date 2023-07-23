package Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        System.out.println("Program started");

        int a=100;
        try {
            System.out.println(a / 0);
        }
        catch (Exception e)
        {
            System.out.println("Entered Into Catch Block");
        }
        finally {
            System.out.println("Program exited");
        }
    }
}
