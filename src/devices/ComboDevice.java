package devices;

public class ComboDevice extends Device{
    
    public ComboDevice(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }
}
