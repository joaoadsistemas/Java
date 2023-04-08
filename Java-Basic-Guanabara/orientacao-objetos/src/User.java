public class User {
    
   private int firstName;
   private String lastName;
   
   
    public void setFirstName(String firstName) {
        this.firstName = firstName.length();
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName.length();
        this.lastName = lastName;
    }

    public int getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    public String getLastName() {
        return lastName;
    }

}
