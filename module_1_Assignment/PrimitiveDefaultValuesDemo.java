class PrimitiveDefaults {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    void printDefaults() {
        System.out.println("byte default: " + b);
        System.out.println("short default: " + s);
        System.out.println("int default: " + i);
        System.out.println("long default: " + l);
        System.out.println("float default: " + f);
        System.out.println("double default: " + d);
        System.out.println("char default: '" + c + "'");
        System.out.println("boolean default: " + bool);
    }
}

public class PrimitiveDefaultValuesDemo {
    public static void main(String[] args) {
        PrimitiveDefaults pd = new PrimitiveDefaults();
        pd.printDefaults();
    }
}
