package zad;

public class Cat {
    String name;
    int age;
    String color;

    public Cat(String name,int age,String color){
        this.name = name;
        this.age =age;
        this.color=color;
    }

    public Cat(){
        this.name = null;
        this.age = 0;
        this.color = null;
    }


    public void setName(String name){
        this.name =name;

    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }
}
