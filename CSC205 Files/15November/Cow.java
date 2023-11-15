public class Cow implements Animal {

    @Override
        public String GetSound() {
            return "Moo!";
        }
        
        @Override
        public boolean CanSwim() {
            return Animal.super.CanSwim();
        }
}