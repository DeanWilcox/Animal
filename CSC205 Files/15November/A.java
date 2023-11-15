public class A {

    private String AString;
    private String PresentString;

    // Constructor with parameters
    public A(String AString, String PresentString) {
        this.AString = AString;
        this.PresentString = PresentString;
    }

    // Method for presenting
    public String Present() {
        return AString + PresentString;
    }
}

// Subclass B extending A
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
        // If not, you can remove the parameter from the constructor
    }

    @Override
    public String Present() {
        return super.Present() + BString + PresentBString;
    }

    public String getBString() {
        return BString;
    }

    public void setBString(String bString) {
        BString = bString;
    }

    public String getPresentBString() {
        return PresentBString;
    }

    public void setPresentBString(String presentBString) {
        PresentBString = presentBString;
    }
}
