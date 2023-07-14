public class Toyota extends Vehicle 
{
    String model; // Variable declaration

    // Constructor with parameters
    public Toyota(String name, String model) { 
        // Calling superclass constructor
        super(name); 
        this.model = model;
    }

    // Method without parameters
    public void rev() { 
        System.out.println("Ratatata!");
    }

    // Method with parameter
    public void accelerate(int speed) { 
        System.out.println(name + " is accelerating to " + speed + " km/h.");
    }
}
