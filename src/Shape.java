public class Shape {
    // PROPERTIES
    private String type;
    private int sides;
    private double height;
    private double width;
    private int PIN = 1111;

    // CONSTRUCTOR
    public Shape(String what, int sides, double height, double width) {
        type = what;
        this.sides = sides;
        this.height = height;
        this.width = width;
    }
    


    public static void main(String[] args) {
        
    }

    // MUTATOR
    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    // ACCESSOR
    public int getPIN() {
        // "give me the code"
        return 1342;
    }
}
