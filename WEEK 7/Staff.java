public class Staff extends Employee {
    private String title;

    public Staff(String name,String address,String phone_number,String email_address,int office,double salary,String title){
        super(name, address, phone_number, email_address, office, salary);
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return super.toString() + "\nStaff{title=" + title + "}";
    }
}
