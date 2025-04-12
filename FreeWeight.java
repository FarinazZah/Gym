// I worked on the homework assignment alone, using only course materials.
/**
 * Parent class for dumbbell and barbell subclasses.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public abstract class FreeWeight implements Comparable<FreeWeight> {
    private final String freeWeightID;
    private final int category;
    private final int weight;

    /**
     * Constructor for the free weight class that takes in all 3 instance variables.
     *
     * @param freeWeightID of type String that identifies the free weight
     * @param category of type int
     * @param weight of type int
     */
    public FreeWeight(String freeWeightID, int category, int weight) {
        this.freeWeightID = freeWeightID;
        this.category = category;
        this.weight = weight;
    }

    /**
     * Overwriting the compareTo method.
     *
     * @param otherFreeWeight the object to be compared.
     * @return type int
     */
    public int compareTo(FreeWeight otherFreeWeight) {
        if (this.category - otherFreeWeight.category != 0) {
            return this.category - otherFreeWeight.category;
        } else if (this.weight - otherFreeWeight.weight != 0) {
            return this.weight - otherFreeWeight.weight;
        } else {
            return 0;
        }
    }

    /**
     * Overwriting the to String method.
     *
     * @return a String
     */
    public String toString() {
        return String.format("%s: %d lb.", freeWeightID, weight);
    }

    /**
     * getter for the freeWeightID.
     *
     * @return a String
     */
    public String getFreeWeightID() {
        return freeWeightID;
    }

    /**
     * getter for weight.
     *
     * @return an int that represents the weight
     */
    public int getWeight() {
        return weight;
    }

}
