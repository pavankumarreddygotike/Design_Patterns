package client;

import adapter.ChargerAdapter;
import adapter.ChargingInterface;
import adapter.MicroUSBCharger;

public class AdapterPatternExample {
	public static void main(String[] args) {
		// The client wants to use the ChargingInterface (target)
		ChargingInterface charger = new ChargerAdapter(new MicroUSBCharger());

		// Now the client can charge using the MicroUSBCharger through the Adapter
		charger.charge();
	}
}
