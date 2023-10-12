import java.util.ArrayList;
import java.util.List;

class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

interface Command {
    void execute();
}

class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

class RemoteController {
    private List<Command> onCommands;
    private List<Command> offCommands;

    public RemoteController() {
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void pressButton(int slot) {
        onCommands.get(slot).execute();
        offCommands.get(slot).execute();
    }
}

class CommandPattern {
    public static void main(String[] args) {
        
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteController remote = new RemoteController();

        remote.setCommand(0, lightOnCommand, lightOffCommand);
    
        remote.pressButton(0); 
        remote.pressButton(1); 
        remote.pressButton(0); 
        remote.pressButton(1);
    }
}

