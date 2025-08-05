public class AccessExample {
    public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable"; // package-private
    private String privateVar = "Private Variable";

    public void showAccess() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}
