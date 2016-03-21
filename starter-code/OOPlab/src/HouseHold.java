/**
 * Created by Wasabi on 3/21/2016.
 */
public abstract class HouseHold {

    private double income;

    public HouseHold(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }


    public abstract void generateIncome();
    public abstract void trainPokemon();

    public void payTaxesAgain(){
        double tax = this.income * 0.2;
        System.out.println("Confiscated 20% of your income : $"+tax);
    }
}
