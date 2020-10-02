package Lab6;
public class Employee {
    private String name, id, designation;
    private double salary;


    public String getname(){
        return name;
    }
    public void  setname(String name){
        this.name=name;
    }

    public String getid(){
        return id;
    }
    public void  setid(String id){
        this.id=id;
    }

    public String getdesignation(){
        return designation;
    }
    public void  setdesignation(String designation){
        this.designation=designation;
    }

    public double getsalary(){
        return salary;
    }

    public Employee( String name, String id, String designation, double salary){
        this.name=name;
        this.id=id;
        this.designation=designation;
        this.salary=salary;
    }

    void increaseSalary(double amt){
        salary=salary+amt;
    }

    public String toString(){
        return "Employee [name=" + name + ", id=" + id + ",designation=" + designation +", Salary=" + salary + "]";
    }

}