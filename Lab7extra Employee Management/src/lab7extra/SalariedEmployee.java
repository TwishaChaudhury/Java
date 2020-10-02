package lab7extra;

public class SalariedEmployee extends Employee{
    double monthlySalary;

	public SalariedEmployee(String name, String id, String designation, double monthlySalary) {
		super(name, id, designation);
		this.monthlySalary = monthlySalary;
	}
	
    @Override
	void increaseSalary(double amt) {
		 
	monthlySalary += amt;
	 }

    @Override
    double getSalary() {
		
	return monthlySalary;
	}
	
	@Override
	String  display() {
            
	return super.display()+" Salary: "+monthlySalary;
                      
	}
    
}
