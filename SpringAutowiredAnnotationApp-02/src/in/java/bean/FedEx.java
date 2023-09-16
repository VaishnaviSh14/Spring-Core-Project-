package in.java.bean;

import org.springframework.stereotype.Component;

@Component("fedex")

public class FedEx implements Courier {

	public String deliver(Integer otp) {
		return " Delivering " + otp + " Order ID purchased using FedEx... " ; 
	}
	
	@Override
	public String toString() {
		return "FedEx []";
	}

	static {
		System.out.println("FedEx.class file is loading...");
	}
	
	public FedEx() {
		System.out.println("FEDEX::OBJECT CREATED");
	}
	
	

}
