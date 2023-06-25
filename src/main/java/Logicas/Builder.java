package Logicas;

public class Builder {

        private Zoo zoo;

        public Builder() {
            zoo = new Zoo();
        }
        public Builder addCage(Habitats a) {
            zoo.addHab(a);
            return this;
        }

        public Builder addAnimal(Habitats a, Animales animal) {
            a.addAnimal(animal);
            return this;
        }

        public Zoo build() {
            return zoo;
        }

}
