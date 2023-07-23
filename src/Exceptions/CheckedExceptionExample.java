package Exceptions;
// un checked: handled only one way using true catch block
// checkedException[Thread.sleep] : handles try catch & throws keyword
public class CheckedExceptionExample {
    public static void main(String[] args) throws InterruptedException { //
        System.out.println("program is started");
        System.out.println("Program is in progress");

        try {
            Thread.sleep(5000); // equiv 5secs
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
        /*Thread.sleep(5000);
        System.out.println("program is completed");
        System.out.println("program is exied");*/
    }
}
