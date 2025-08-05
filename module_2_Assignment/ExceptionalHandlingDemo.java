public class ExceptionalHandlingDemo {

    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.You Entered:" +age);
        }
        else{
            System.out.println("The age" +age+ "is valid.");
        }
    }
    public static void main(String[] args) {
        try{
            System.out.println("Attempting to validate a valid age(25)...");
            validateAge(25);
        }catch(IllegalArgumentException e){
            System.out.println("Caught an Exception:" + e.getMessage());
        }
        System.out.println("/n--------------------------------------/n");

        try{
            System.out.println("Attempting to validate an invalid age(-5)...");
            validateAge(-5);
        }catch(IllegalArgumentException e){
            System.out.println("Exception handled Successfully.");
            System.out.println("Printed Exception:"  +e.getMessage());
        }
    }
}
