package in.ineuron.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.VoterVerifier;

public class ClientApp {

	public static void main(String[] args) {

		System.out.println("Starting the container....");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		
		
		VoterVerifier voterVerifier = applicationContext.getBean("voterVerifier", VoterVerifier.class);
		System.out.println(voterVerifier);

		String status = voterVerifier.checkEligibility();
		System.out.println(status);

		applicationContext.close();
		System.out.println("Stopping the container....");
	}
}
