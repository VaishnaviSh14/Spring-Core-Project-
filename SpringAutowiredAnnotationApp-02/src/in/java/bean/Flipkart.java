package in.java.bean;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value ="fpkt")
public class Flipkart {
	
	@Autowired
	@Qualifier("dtdc")
	private Courier courier;
	
	@Autowired
	private Date myDate;
	
	static {
		System.out.println("Flipkart.class file is loading...");
	}
	
	public Flipkart() {
		System.out.println("Flipkart Object is ");
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", myDate=" + myDate + "]";
	}
	
	public String shopping(String[] items, float[] prices) {
		float billAmount =0.0f;
		for(float price :prices) {
			billAmount+=price;
		}
		
		String msg = courier.deliver(new Random().nextInt(1000));
		
		return Arrays.toString(items)+ "With Price " + Arrays.toString(prices)+ "having billamount" + billAmount+ ":::: "+msg;
				
	}
	

}
