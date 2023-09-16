package in.java.bean;

import org.springframework.stereotype.Component;

@Component("bdart")
public class BlueDart implements Courier {

	public String deliver(Integer otp) {
		// TODO Auto-generated method stub
		return " Delivering " + otp + " Order ID purchased using BLUEDART... " ; 
	}
	
	@Override
	public String toString() {
		return "BlueDart []";
	}

	static {
		System.out.println("BLUEDART.class file is loading...");
	}
	
	public BlueDart() {
		System.out.println("BLUEDART::OBJECT CREATED");
	}

}
