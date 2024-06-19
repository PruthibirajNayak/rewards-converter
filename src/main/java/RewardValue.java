public class RewardValue {
    public double cashValue;
    public double milesValue;
    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value of the RewardValue
    public double getMilesValue() {
        return milesValue;
    }

    // Private method to convert cash value to miles
    private double convertToMiles(double cashValue) {
        return cashValue/0.0035;
}

}
