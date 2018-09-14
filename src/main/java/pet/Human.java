package pet;

public class Human {
    public void expressAffectionTowards(Pet pet) {
        if (pet != null){
            pet.feed();
            pet.stroke();
        }
    }
}
