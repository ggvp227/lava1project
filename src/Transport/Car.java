package Transport;
import java.util.Arrays;
import java.util.Random;

public class Car {
    private String mark;
    private Model[] models;

    public Car(String mark, int size){
        this.mark = mark;
        models = new Model[size];

        for (int i=0; i < models.length; i++){
            models[i] = new Model("Model "+ (i+1), (i+1)*100);
        }
    }

    public String getMark(){
        return mark;
    }
    public void setMark(String mark){
        this.mark=mark;
    }
    public class Model{
        private String name;
        private int price;
        public Model(String name, int price){
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getPrice(){
            return price;
        }
        public void setPrice(int price){
            this.price = price;
        }
    }
    public int[] getPriceModel(){
        int[] price = new int[getSize()];
        for (int i = 0; i < price.length; i++) {
            price[i] = models[i].getPrice();
        }
        return price;
    }
    public int getSize(){
        return models.length;
    }
    public String[] getNameModel(){
        String[] name = new String[getSize()];
        for(int i=0; i< name.length;i++){
            name[i]= models[i].getName();
        }
        return name;
    }
    public void setNewPrice(String name, int newPrice){
        for (int i=0;i<models.length;i++){
            if (models[i].getName().contains(name)){
                models[i].setPrice(newPrice);
            }
        }
    }
    public int getPriceByName(String name){
        int price=0;
        for (int i=0; i< models.length;i++){
            if(models[i].getName().contains(name)){
                price=models[i].getPrice();
            }
        }
        return price;
    }
    public void newName(String name, String newName){
        for(int i=0; i<models.length;i++){
            if (models[i].getName().contains(name)){
                models[i].setName(newName);
            }
        }
    }
    public void addModel(String name, int price){
        Model[] model1 = Arrays.copyOf(models, models.length + 1);


        model1[models.length] = new Model(name, price);


        models = model1;

    }
    public void deleteModel(String name){
        int index;
        for(int i=0;i<models.length;i++){
            if(models[i].getName().contains(name)){
                index=i;
                System.arraycopy(models,index+1, models, index, models.length-index-1);
                models=Arrays.copyOf(models,models.length-1);
            }
        }

    }
}
