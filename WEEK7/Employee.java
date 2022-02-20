import java.util.*;
public class Employee extends Person{
    private int office;
    private double salary;
    private Date date_hire;

    public Employee(String name,String address,String phone_number,String email_address,int office,double salary){
        super(name,address,phone_number,email_address);
        this.office = office;
        this.salary = salary;
        this.date_hire = new Date();
    }

    public void setOffice(int office){
        this.office = office;
    }

    public int getOffice(){
        return office;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public Date getDateHire(){
        return date_hire;
    }
    
    public String toString(){
        return super.toString() + "\nEmployee{office=" + office+ ", Salary=" + salary + ", Date Hire=" +
                date_hire + "}";
    }
}
