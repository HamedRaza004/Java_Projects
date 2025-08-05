public class AccessModifierDemo {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        // Accessing variables
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        obj.showAccess();
    }
}
