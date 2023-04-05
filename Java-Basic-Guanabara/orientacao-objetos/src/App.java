public class App {
    public static void main(String[] args) throws Exception {
        
       User[] users = new User[9];

       for (int i = 0; i < users.length; i++) {
        User actual = new User();
        actual.setFirstName("firstName " + i);
        actual.setLastName("lastName " + i);
        users[i] = actual;
       }

       System.out.println(users[2].getFirstName());
       System.out.println(users[2].getLastName());
        
    }
}
