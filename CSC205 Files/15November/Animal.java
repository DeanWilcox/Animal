public interface Animal {
    
    public String GetSound();

    default public boolean CanSwim() {
        return true;
    }
    
}