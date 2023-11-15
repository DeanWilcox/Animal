public class B extends A {

    private String BString;
    private String PresentBString;

    // Another constructor
    public B(String AString, String PresentString, String BString, String PresentBString) {
        super(AString, PresentString);
        this.BString = BString;
        this.PresentBString = PresentBString;
        // No need for the string2 parameter here
    }

    @Override
    public String Present() {
        // Assuming that Present() method is present in class A
        return super.Present() + BString + PresentBString;
    }
}
