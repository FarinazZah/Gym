// I worked on the homework assignment alone, using only course materials.
/**
 * Subclass of free weight. Represents a physical barbell.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public class Barbell extends FreeWeight implements Adjustable {
    private int loadCapacity;
    private int loadedWeight;

    /**
     * constructor for Barbell class that takes in three variables, and sets a default value for loadedWeight.
     *
     * @param freeWeightID String
     * @param weight type int
     * @param loadCapacity type int
     */
    public Barbell(String freeWeightID, int weight, int loadCapacity) {
        super(freeWeightID, 1, weight);
        this.loadCapacity = loadCapacity;
        loadedWeight = 0;
    }

    /**
     * Overwriting the compareTo method.
     *
     * @param other the object to be compared.
     * @return type int
     */
    public int compareTo(FreeWeight other) {
        if (super.compareTo(other) == 0) {
            Barbell otherRealBarbell = (Barbell) other;
            if (this.loadCapacity - otherRealBarbell.loadCapacity != 0) {
                return this.loadCapacity - otherRealBarbell.loadCapacity;
            } else if (otherRealBarbell.loadedWeight - this.loadedWeight != 0) {
                return otherRealBarbell.loadedWeight - this.loadedWeight;
            } else if (this.getFreeWeightID().compareTo(otherRealBarbell.getFreeWeightID()) != 0) {
                return this.getFreeWeightID().compareTo(otherRealBarbell.getFreeWeightID());
            } else {
                return 0;
            }
        } else {
            return super.compareTo(other);
        }
    }

    /**
     * Defining the weight adjustment method from the Adjustment interface.
     *
     * @param weightAdjustment of type int, how much we want to change the weight by
     * @return if we have changed the weight returning boolean
     */
    public boolean adjustWeight(int weightAdjustment) {
        if (weightAdjustment < 0 || weightAdjustment > loadCapacity) {
            return false;
        } else {
            loadedWeight += weightAdjustment;
            return true;
        }
    }

    /**
     * overwriting java's toString() method.
     *
     * @return a type String
     */
    public String toString() {
        return super.toString() + " barbell";
    }
    /**
     * getter method for getLoadCapacity.
     *
     * @return a type int
     */

    public int getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * getter method for loaded weight.
     *
     * @return a type int
     */

    public int getLoadedWeight() {
        return loadedWeight;
    }
}
