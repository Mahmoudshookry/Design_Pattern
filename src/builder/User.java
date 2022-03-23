package builder;

public class User {
	
	//All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
    private final String profession; // optional
    
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.profession = builder.profession;
    }
    
    // getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    
    public String getProfession() {
    	return profession;
    }
    
    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }
    
    // inner class
    public static class UserBuilder 
    {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;
        private String profession;
 
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public UserBuilder profession(String profession) {
            this.profession = profession;
            return this;
        }
        
        // Return the finally consrcuted User object
        public User build() {
            User user =  new User(this);
            if(validateUserObject(user)) {
            	return user;
            } else {
            	return null;
            }
        }
        
        private boolean validateUserObject(User user) {
            System.out.println("do what ever u want");
            return true;
        }
    }

}
