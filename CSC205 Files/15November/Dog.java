public class Dog implements Animal {

    @Override
        public String GetSound() {
            return "Woof Woof!";
        }
        
        @Override
        public boolean CanSwim() {
            return Animal.super.CanSwim();
        }
}