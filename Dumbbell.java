// I worked on the homework assignment alone, using only course materials.
/**
 * Subclass of free weight that is a representation of a physical dumbbell.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public class Dumbbell extends FreeWeight {
    private String gripType;

    /**
     * constructor for the dumbbell class.
     *
     * @param freeWeightID type String
     * @param weight type int
     * @param gripType type String
     */
    public Dumbbell(String freeWeightID, int weight, String gripType) {
        super(freeWeightID, 2, weight);
        this.gripType = gripType;
    }

    /**
     * overwriting the compareTo() method.
     *
     * @param other the object to be compared.
     * @return type int
     */
    public int compareTo(FreeWeight other) {
        if (super.compareTo(other) == 0) {
            Dumbbell otherDumbbell = (Dumbbell) other;
            if (this.gripType.compareTo(otherDumbbell.gripType) != 0) {
                return this.gripType.compareTo(otherDumbbell.gripType);
            } else if (this.getFreeWeightID().compareTo(otherDumbbell.getFreeWeightID()) != 0) {
                return this.getFreeWeightID().compareTo(otherDumbbell.getFreeWeightID());
            } else {
                return 0;
            }
        } else {
            return super.compareTo(other);
        }
    }

    /**
     * overwriting the toString() method.
     *
     * @return a type String
     */
    public String toString() {
        return super.toString() + " dumbbell with " + gripType + " grip";
    }

    /**
     * getter for the grip type.
     *
     * @return a String
     */
    public String getGripType() {
        return gripType;
    }
}
