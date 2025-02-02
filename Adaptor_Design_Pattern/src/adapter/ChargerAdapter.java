package adapter;

public class ChargerAdapter implements ChargingInterface {
    private MicroUSBCharger microUSBCharger;

    // Constructor that takes a MicroUSBCharger instance
    public ChargerAdapter(MicroUSBCharger microUSBCharger) {
        this.microUSBCharger = microUSBCharger;
    }

    @Override
    public void charge() {
        microUSBCharger.microUSBCharge();  // Convert the call to the MicroUSBCharger's method
    }
}
