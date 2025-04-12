// I worked on the homework assignment alone, using only course materials.
/**
 * Class that represents weight machines.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public class WeightMachine implements Adjustable, Comparable<WeightMachine> {
    private String weightMachineID;
    private int weightIncrement;
    private int maxWeight;
    private int currentWeight;

    /**
     * constructor for the WeightMachine class.
     *
     * @param weightMachineID of type String
     * @param weightIncrement of type int
     * @param maxWeight of type int
     */
    public WeightMachine(String weightMachineID, int weightIncrement, int maxWeight) {
        this.weightMachineID = weightMachineID;
        this.weightIncrement = weightIncrement;
        this.maxWeight = maxWeight;
        currentWeight = 0;
    }

    /**
     * overwriting the compareTo method.
     *
     * @param other the object to be compared.
     * @return a type int
     */
    public int compareTo(WeightMachine other) {
        if (this.maxWeight - other.maxWeight != 0) {
            return this.maxWeight - other.maxWeight;
        } else if (other.currentWeight - this.currentWeight != 0) {
            return other.currentWeight - this.currentWeight;
        } else if (this.weightMachineID.compareTo(other.weightMachineID) != 0) {
            return this.weightMachineID.compareTo(other.weightMachineID);
        } else {
            return 0;
        }
    }

    /**
     * Defining the adjusting weight method from adjustable.
     *
     * @param weightAdjustment of type int, how much we want to change the weight by
     * @return boolean if we changed the weight or not
     */
    public boolean adjustWeight(int weightAdjustment) {
        if (weightAdjustment < 0 || weightAdjustment > maxWeight || weightAdjustment % weightIncrement != 0) {
            return false;
        } else {
            currentWeight += weightAdjustment;
            return true;
        }
    }

    /**
     * overwriting the toString() method.
     *
     * @return type String
     */
    public String toString() {
        return String.format("%s: %d lb. weight machine", weightMachineID, currentWeight);
    }

    /**
     * getter for weight machine ID.
     *
     * @return of type String
     */
    public String getWeightMachineID() {
        return weightMachineID;
    }

    /**
     * getter for current weight.
     *
     * @return type int
     */
    public int getCurrentWeight() {
        return currentWeight;
    }

    /**
     * getter for weight increment.
     *
     * @return type int
     */
    public int getWeightIncrement() {
        return weightIncrement;
    }

    /**
     * getter for maximum weight.
     *
     * @return type int
     */
    public int getMaxWeight() {
        return maxWeight;
    }
}
