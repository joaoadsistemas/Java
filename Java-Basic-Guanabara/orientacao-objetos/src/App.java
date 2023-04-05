public class App {
    public static void main(String[] args) throws Exception {
        
        Smartphone cell1 = new Smartphone();

        cell1.name = "Samsung";
        cell1.memory = 128;
        cell1.ram = 6;

        String desc = cell1.descrptionAll();
        System.out.println(desc);


    }
}
