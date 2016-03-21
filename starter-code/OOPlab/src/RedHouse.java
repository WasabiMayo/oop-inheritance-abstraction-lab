/**
 * Created by Wasabi on 3/21/2016.
 */
public class RedHouse extends HouseHold implements HouseHoldInterface {

    private String pet;

    public RedHouse(double income, String pet) {
        super(income);
        this.pet = pet;
    }

    @Override
    public void generateIncome() {
        System.out.println("Red won in a poke battle! Got " + getIncome() + " as a reward");

    }

    @Override
    public void trainPokemon() {
        System.out.println("Trained Red's pet " + pet);

    }

    @Override
    public void feedPet() {
        System.out.println("Fed Red's pet " + pet);

    }
}