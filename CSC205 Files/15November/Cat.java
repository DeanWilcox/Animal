public class Cat implements Animal {

    @Override
        public String GetSound() {
            return "Meow!";
        }
        
        @Override
        public boolean CanSwim() {
            return Animal.super.CanSwim();
        }
}