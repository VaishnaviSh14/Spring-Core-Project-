package in.java.bean;

import org.springframework.stereotype.Component;

@Component("dtdc")

public class DTDC implements Courier {

	public String deliver(Integer otp) {
		
		return " Delivering " + otp + " Order ID purchased using DTDC... " ; 
	}
	
	static {
		System.out.println("DTDC.class file is loading...");
	}

	public DTDC() {
		System.out.println("DTDC::OBJECT CREATED");
	}

	@Override
	public String toString() {
		return "DTDC []";
	}
	
}
