interface LivingBeing {
    void oxygenIntake();
}

class AquaticAnimal {
    private String species;

    public AquaticAnimal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void consumeFood() {
        System.out.println(species + " потребляет пищу.");
    }
}

class Dolphin extends AquaticAnimal implements LivingBeing {
    public Dolphin(String species) {
        super(species);
    }

    @Override
    public void oxygenIntake() {
        System.out.println(getSpecies() + " вдыхает воздух.");
    }
}

class Tuna extends AquaticAnimal {
    public Tuna(String species) {
        super(species);
    }

    public void navigate() {
        System.out.println(getSpecies() + " плавает в воде.");
    }
}

public class Main {
    public static void main(String[] args) {
        AquaticAnimal dolphin = new Dolphin("Дельфин");
        AquaticAnimal tuna = new Tuna("Тунец");

        if (dolphin instanceof LivingBeing) {
            ((LivingBeing) dolphin).oxygenIntake();
        }

        if (tuna instanceof Tuna) {
            ((Tuna) tuna).navigate();
        }

        dolphin.consumeFood();
        tuna.consumeFood();
    }
}
