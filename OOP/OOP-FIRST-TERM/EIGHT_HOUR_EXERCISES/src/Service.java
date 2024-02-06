import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    private ArrayList<Device> devices;
    private ArrayList<BrokenDevice> brokenDevices;

    public Service(ArrayList<Device> devices, ArrayList<BrokenDevice> brokenDevices) {
        this.devices = devices;
        this.brokenDevices = brokenDevices;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public ArrayList<BrokenDevice> getBrokenDevices() {
        return brokenDevices;
    }

    public void setBrokenDevices(ArrayList<BrokenDevice> brokenDevices) {
        this.brokenDevices = brokenDevices;
    }

    public void addTicket(Scanner scanner){
        String type = scanner.nextLine();
        if (type.equals("broken")){
            brokenDevices.add(new BrokenDevice(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), scanner.nextLine(),Integer.parseInt(scanner.nextLine())));
        }else if (type.equals("new")){
            devices.add(new Device(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine())));
        }
    }
    public void repairedDevice(BrokenDevice device){
        for (BrokenDevice curr: brokenDevices) {
            if (curr.getModel().equals(device.getModel())){
                brokenDevices.remove(curr);
                devices.add(curr);
            }
        }
    }
    public void printBrokenDeviceWithSymptoms(String symptom){
        for (BrokenDevice curr: brokenDevices) {
                if (curr.getSymptoms().equals(symptom)){
                    System.out.println(curr);
                }
        }
    }
    public Double sumAllDevices(){
        double sum = 0;
        for (Device curr:
             devices) {
            sum+=curr.getPrice();
        }
        return sum;
    }

    public Double income(Double pricePerDevice){
        double sum = 0;
        sum = devices.size()*pricePerDevice;
        return sum;
    }

}
