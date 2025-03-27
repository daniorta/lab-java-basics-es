//Tarea 3
package employer;

public class Employer {
    //Tarea 3.

    //Atributos
    private String name;
    private int age;
    private double salary;
    private int experience;
    private String job;
    private final int ID;

    //Constructor
    public Employer(String name, int age, double salary,  int ID){
        this.name = name;
        this.age = age;
        this.salary =salary;
        this.ID = ID;
    }
    //getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public int getExperience(){
        return experience;
    }

    public String getJob(){
        return job;
    }

    public int getId(){
        return ID;
    }




    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

}
