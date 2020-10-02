package Lab6;
import java.util.ArrayList;
public class UapCse {
    String name;
    ArrayList<Employee> employees;

    public UapCse(String name){
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addNewEmployee(Employee e){

       employees.add(e);
   }

    public void addNewEmployee(String nm,String id, String des, double sal){
        Employee e= new Employee(nm,id,des,sal);
        addNewEmployee(e);
    }

    private Employee findEmployee(String id){
         for(int i=0;i<employees.size();i++){
             if(employees.get(i).getid().equals(id))
                 return employees.get(i);
         }
         return null;
    }

    public void increaseSalary(String id, double amt){
        Employee info = findEmployee(id);
        if(info == null) System.out.println("Employee Doesn't Found");
        else info.increaseSalary(amt);
    }

    double getSalary(String id){
        Employee info = findEmployee(id);
        if(info == null){
            System.out.println("Employee Doesn't Found");
        return 0;}
        else return info.getsalary();
    }

    public void display(String id){
        Employee info = findEmployee(id);
        if(info == null) System.out.println("Employee Doesn't Found");
        else System.out.println(info);
    }

    void display(){
        for(int i=0;i<employees.size();i++){
            Employee info= employees.get(i);
            System.out.println(info);
        }
    }

}