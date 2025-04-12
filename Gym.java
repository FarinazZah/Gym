// I worked on the homework assignment alone, using only course materials.
import java.util.Arrays;

/**
 * Creates a gym where we have both free weights and weight machines.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public class Gym {
    private FreeWeight[] freeWeights;
    private WeightMachine[] weightMachines;

    /**
     * 2 arg constructor for gym.
     *
     * @param freeWeights free weight array
     * @param weightMachines weight machine array
     */
    public Gym(FreeWeight[] freeWeights, WeightMachine[] weightMachines) {
        this.freeWeights = freeWeights;
        this.weightMachines = weightMachines;
        Arrays.sort(freeWeights);
        Arrays.sort(weightMachines);
    }

    /**
     * 0 arg constructor for gym.
     */
    public Gym() {
        freeWeights = new FreeWeight[0];
        weightMachines = new WeightMachine[0];
    }

    /**
     * lists out all our gym equipment.
     */
    public void browseGymEquipment() {
        for (FreeWeight fw : freeWeights) {
            System.out.println(fw);
        }
        for (WeightMachine wm : weightMachines) {
            System.out.println(wm);
        }
    }

    /**
     * used to add a free weight.
     *
     * @param newOne of type freeWeight
     */

    public void addEquipment(FreeWeight newOne) {
        // Check if the array length is 0, which means no equipment has been added yet
        if (freeWeights.length == 0) {
            // Create a new array with a length of 1 and add the new equipment
            freeWeights = new FreeWeight[1];
            freeWeights[0] = newOne;
        } else {
            // Temporarily store the old array
            FreeWeight[] tempArray = freeWeights;
            // Resize the original array to hold one more element
            freeWeights = new FreeWeight[tempArray.length + 1];
            // Copy the contents of the old array to the new, resized array
            for (int i = 0; i < tempArray.length; i++) {
                freeWeights[i] = tempArray[i];
            }
            // Add the new equipment at the end of the new array
            freeWeights[tempArray.length] = newOne;
        }
        // Sort the array to maintain the natural order of elements
        Arrays.sort(freeWeights);
    }


    /**
     * used to add a weight machine.
     *
     * @param newOne type weightMachine
     */

    public void addEquipment(WeightMachine newOne) {
        if (weightMachines.length == 0) {
            // If the array is empty, initialize it with a size of 1
            weightMachines = new WeightMachine[1];
            weightMachines[0] = newOne;
        } else {
            // Temporarily store the old array
            WeightMachine[] tempArray = weightMachines;
            // Resize the original array to hold one more element
            weightMachines = new WeightMachine[tempArray.length + 1];
            // Copy the contents of the old array to the new, resized array
            for (int i = 0; i < tempArray.length; i++) {
                weightMachines[i] = tempArray[i];
            }
            // Add the new equipment at the end of the new array
            weightMachines[tempArray.length] = newOne;
        }
        // Sort the array after adding the new equipment
        Arrays.sort(weightMachines);
    }



    /**
     * getter for an entire free weight.
     *
     * @param input free weight ID
     * @return a free weight type
     */
    public FreeWeight getFreeWeight(String input) {
        for (FreeWeight fw : freeWeights) {
            if (fw.getFreeWeightID().equals(input)) {
                return fw;
            }
        }
        return null;
    }

    /**
     * getter for an entire weight machine.
     *
     * @param input weight machine ID
     * @return weight Machine type
     */
    public WeightMachine getWeightMachine(String input) {
        for (WeightMachine wm : weightMachines) {
            if (wm.getWeightMachineID().equals(input)) {
                return wm;
            }
        }
        return null;
    }

    /**
     * getter for the equipment count.
     *
     * @return type int
     */
    public int getEquipmentCount() {
        return freeWeights.length + weightMachines.length;
    }


}
