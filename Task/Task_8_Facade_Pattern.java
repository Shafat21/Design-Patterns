class CPU {
    public void start() {
        System.out.println("CPU started");
    }

    public void shutdown() {
        System.out.println("CPU shutdown");
    }
}

class Memory {
    public void load() {
        System.out.println("Memory loaded");
    }

    public void unload() {
        System.out.println("Memory unloaded");
    }
}

class HardDrive {
    public void read() {
        System.out.println("Hard Drive read");
    }

    public void write() {
        System.out.println("Hard Drive write");
    }
}

class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer started");
    }

    public void shutdownComputer() {
        cpu.shutdown();
        memory.unload();
        hardDrive.write();
        System.out.println("Computer shutdown");
    }
}

class FacadePatternDemo {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();

        System.out.println("----- Starting the computer -----");
        computerFacade.startComputer();

        System.out.println("\n----- Shutting down the computer -----");
        computerFacade.shutdownComputer();
    }
}
