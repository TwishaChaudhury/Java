package Lab6;
import java.util.Scanner;
public class Uap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter Department name : ");
        String dep = scan.nextLine();
        UapCse myUap = new UapCse(dep);

        System.out.println("Exit System                  : 0");
        System.out.println("Add Employee                 : 1");
        System.out.println("Salary Information           : 2");
        System.out.println("Increase Salary              : 3");
        System.out.println("Display A Employee           : 4");
        System.out.println("Display All Employee         : 5");

        while(true)
        {
            System.out.printf("Enter Option: ");
            int ch = scan.nextInt();
            scan.nextLine();

            if(ch==0) break;

            if(ch==1){
                System.out.printf("Enter Name : ");
                String name= scan.nextLine();
                System.out.printf("Enter ID : ");
                String id= scan.nextLine();
                System.out.printf("Enter Designation : ");
                String des=scan.nextLine();
                System.out.printf("Enter Salary : ");
                double sal=scan.nextDouble();
                myUap.addNewEmployee(name,id,des,sal);
            }

           else if(ch<5){

                System.out.printf("Enter ID : ");
                String id= scan.nextLine();

                if(ch==2){
                    double sal= myUap.getSalary(id);
                    //scan.nextLine();
                    System.out.printf("Employee Salary: %f\n",sal);
                }

                if(ch==3){
                    System.out.printf("Enter Amount: ");
                    double sal=scan.nextDouble();
                    //scan.nextLine();
                    myUap.increaseSalary(id,sal);
                }

                if(ch==4)  myUap.display(id);

            }

            if(ch==5) myUap.display();
        }
    }
}