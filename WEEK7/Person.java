public class Person {
    private String name;
    private String address;
    private String phone_number;
    private String Email_address;
    
    public Person(String name,String address,String phone_number,String email_address){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.Email_address = email_address;
    }

    public void setName(String name){
        this.name = name;
    } 

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    } 

    public String getAddress(){
        return address;
    }
    
    public void setPhoneNumber(String phone_number){
        this.phone_number = phone_number;
    } 

    public String getPhoneNumber(){
        return phone_number;
    }
    public void setEmailAddress(String Email_address){
        this.Email_address = Email_address;
    } 

    public String getEmailAddress(){
        return Email_address;
    }

    public String toString(){
        return "Person{Name=" + name + ", address=" + address + ", phoneNumber=" +
                phone_number + ", email=" + Email_address + "}";
    }
}
