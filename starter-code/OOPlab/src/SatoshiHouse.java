/**
 * Created by Wasabi on 3/21/2016.
 */
public class SatoshiHouse extends HouseHold implements HouseHoldInterface{

    private String pet;

    public SatoshiHouse(double income, String pet) {
        super(income);
        this.pet = pet;
    }

    @Override
    public void generateIncome() {
        System.out.println("Satoshi won in a poke battle! Got "+ getIncome()+" as a reward");
    }

    @Override
    public void trainPokemon() {
        System.out.println("Trained Satoshi's pet " + pet);
    }

    @Override
    public void feedPet() {
        System.out.println("Fed Satoshi's pet "+pet);
    }

}

