/**
 * Created by Wasabi on 3/21/2016.
 */
public class AshHouse extends HouseHold implements HouseHoldInterface{
    private String pet;

    public AshHouse(double income, String pet) {
        super(income);
        this.pet = pet;
    }

    @Override
    public void generateIncome() {
        System.out.println("Ash won in a poke battle! Got "+ getIncome()+" as a reward");
    }

    @Override
    public void trainPokemon() {
        System.out.println("Trained Ash's pet " + pet);
    }

    @Override
    public void feedPet() {
        System.out.println("Fed Ash's pet "+pet);
    }
}
