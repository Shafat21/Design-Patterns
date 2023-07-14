public class Main{
    public static void main(String[] args) 
    {
        // Object creation
        Toyota toyota = new Toyota("Supra Mark 4", "2018");
        
        // Accessing inherited variable
        System.out.println("Name: " + toyota.name);
        
        // Accessing variable of child class
        System.out.println("Model: " + toyota.model);
        
        // Accessing inherited method
        toyota.drive();
        
        // Accessing method of child class
        toyota.rev();
        
        // Accessing method with parameter
        toyota.accelerate(250);
    }
}