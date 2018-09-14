import pet.Dog;
import pet.Pet;
import org.junit.jupiter.api.Test;
import pet.Human;

import static org.fest.assertions.Assertions.assertThat;


public class PetNullObjectsTest {
    @Test
    public void ownerShouldActOnPet(){
        Pet pet = new Dog();
        Human owner = new Human();

        owner.expressAffectionTowards(pet);

        assertThat(pet.isHappy()).isTrue();
    }

    @Test
    public void ownerShouldActOnNullPet(){
        Pet pet = null;
        Human owner = new Human();

        owner.expressAffectionTowards(pet);

        //assertThat(pet.isHappy()).isTrue();
        //also remove the comment here ^^
    }

}
