public class Cat {
    double weight;
    String name;
    int age;
    String color;

    public Cat() {
        //weight = 3000;
        //name = "Barsik";
        //age = 1;
        //color = "Grey";
        this(3000,"Bars",1, "grey");
    }

    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.color = color;
        this.name = name;
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}
