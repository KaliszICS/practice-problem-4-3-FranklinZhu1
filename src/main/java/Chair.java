public class Chair {

    /**
     * A class to describe a chair with some number of legs and the material that it's made of.
     */

    private int legs;
    private String material;

    /**
     * A constructor that takes in no arguments and sets the legs to 4 and the material to wood.
     */

    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * A constructor that sets the chair's number of legs and assigns its material as wood.
     * 
     * @param legs the number of legs of the chair
     */

    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * A constructor for the class that sets both the chair's legs and materials.
     * 
     * @param legs the number of legs of the chair
     * @param material the material of the chair
     */

    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
     * A method that gets the number of legs of the chair.
     * 
     * @return the number of legs of the chair, as an integer
     */

    public int getLegs() {
        return this.legs;
    }

    /**
     * A method that returns the material of the chair.
     * 
     * @return the material of the chair, as a string
     */

    public String getMaterial() {
        return this.material;
    }

}