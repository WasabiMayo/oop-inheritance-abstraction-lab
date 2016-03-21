/**
 * Created by Wasabi on 3/21/2016.
 */
public class Driver {
    public static void main(String[] args) {
        //Create households and add to list or array
        AshHouse ashHouse = new AshHouse(2000.00, "Charmander");
        RedHouse redHouse = new RedHouse(1200.00, "Squirtle");
        SatoshiHouse satoshiHouse = new SatoshiHouse(2000.00, "Pikachu");

        HouseHold[] houseHolds = new HouseHold[]{satoshiHouse,redHouse,ashHouse};
        HouseHoldInterface[] houseHoldInterfaces = new HouseHoldInterface[]{satoshiHouse,redHouse,ashHouse};

        //iterate through list or array and perform required actions
        for (int i = 0; i <houseHolds.length ; i++) {
            houseHolds[i].generateIncome();
            houseHolds[i].payTaxesAgain();
            houseHolds[i].trainPokemon();
            houseHoldInterfaces[i].feedPet();
            System.out.println("\n");
        }
    }
}
