import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car =new Car("BMW",3);

        car.setNewPrice("Model 1",4000);

        int[] price = car.getPriceModel();
        for(int i=0; i<price.length;i++){
            System.out.println(price[i]);
        }
        car.newName("Model 1","Mers");
        car.addModel("Popa",123);
        car.deleteModel("Model 2");
        String[] name = car.getNameModel();
        for(int i=0; i<name.length;i++){
            System.out.println(name[i]);
        }

        System.out.println(car.getPriceByName("Model 2"));
    }
}