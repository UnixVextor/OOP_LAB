public class Faculty extends Employee{
    private String office_hours;
    private String rank;

    public Faculty(String name,String address,String phone_number,String email_address,int office,double salary,String office_hours,String rank){
        super(name,address,phone_number,email_address,office,salary);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    public void setOfficeHours(String office_hours) {
        this.office_hours = office_hours;
    }

    public String getOfficeHours(){
        return office_hours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }

    public String toString(){
        return super.toString() + "\nFaculty{Office Hours=" + office_hours + ", Rank=" + rank +"}";
    }

}