public interface Presentable {
    String Present();
}

public class A implements Presentable {
    private String AString;
    private String PresentString;

    public A(String AString, String PresentString) {
        this.AString = AString;
        this.PresentString = PresentString;
    }

    @Override
    public String Present() {
        return AString + PresentString;
    }
}

public class B extends A {
    private String BString;
    private String PresentBString;

    // Constructor with parameters
    public B(String AString, String PresentString, String BString, String PresentBString) {
        super(AString, PresentString);
        this.BString = BString;
        this.PresentBString = PresentBString;
    }

    // Another constructor (assuming you intended to use AString and PresentString parameters)
    public B(String AString, String PresentString, String BString, String PresentBString, String string2) {
        super(AString, PresentString);
        this.BString = BString;
        this.PresentBString = PresentBString;
        // Assuming you intended to use string2 for something
    }

    @Override
    public String Present() {
        // Assuming that Present() method is present in class A
        return super.Present() + BString + PresentBString;
    }
}