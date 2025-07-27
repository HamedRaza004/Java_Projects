public class IdentifierCheck {
    public static void main(String[] args) {
        String[] ids = {"name", "2cool", "class", "_count", "total$", "user-name"};

        for (String id : ids) {
            boolean valid = Character.isJavaIdentifierStart(id.charAt(0)) &&
                    id.chars().allMatch(Character::isJavaIdentifierPart) &&
                    !id.equals("class"); // example keyword check

            System.out.println(id + " → " + (valid ? "Valid" : "Invalid"));
        }
    }
}
