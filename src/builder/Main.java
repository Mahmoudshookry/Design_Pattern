package builder;

public class Main {

	public static void main(String[] args) {
		
		User mohamed = new User.UserBuilder("Mohamed", "Khalil")
			    .age(30)
			    .phone("1234567")
			    .address("Fake address 1234")
			    .build();
		
		
		System.out.println(mohamed.toString());

	}

}
