// I worked on the homework assignment alone, using only course materials.
/**
 * Interface named adjustable which is implemented by FreeWeight and Weight Machine subclasses.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public interface Adjustable {
    /**
     * Method used to change weight, defined in each class & subclass that implements Adjustable.
     *
     * @param weightAdjustment of type int, how much we want to change the weight by
     * @return if the weight has been adjusted, it will return a boolean true
     */
    boolean adjustWeight(int weightAdjustment);
}
