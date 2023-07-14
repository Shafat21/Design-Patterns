public class Vehicle 
{
    // Variable declaration with access modifier
    protected String name; 

    // Constructor with parameter
    public Vehicle(String name) { 
        this.name = name;
    }
    
    // Method without parameters
    public void drive() { 
        System.out.println(name + " is being driven.");
    }
}
