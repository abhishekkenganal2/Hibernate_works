package one_to_many.controller;

import java.util.Arrays;
import java.util.List;

import one_to_many_uni.dto.Mobile;
import one_to_many_uni.dto.Sim;

public class MobileController {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		
		Sim sim1 = new Sim();
		Sim sim2 = new Sim();
		
		sim1.setName("Jio");
		sim1.setProvider("Reliance");
		
		sim2.setName("Vadafone");
		sim2.setProvider("V-India");
		
		List<Sim> sim = Arrays.asList(sim1,sim2);
		
		mobile.setName("Samsung");
		mobile.setModel("M1");
		
		
	}

}
