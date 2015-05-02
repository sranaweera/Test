package vmoc.customer;

import javax.ejb.Stateless;
import javax.ws.rs.*;




@Stateless
@Path("/LocalMessageSender")
public class Customer {
	
	@GET
	@Path("/singleton")
	@Produces("application/xml")
	public String singletonTest() 
	{
		System.out.println("I am a customer");
		return "all done";
	}
}
	