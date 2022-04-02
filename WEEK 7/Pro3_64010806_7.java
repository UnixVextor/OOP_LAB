public class Pro3_64010806_7{
    public static void main(String[] args) {
        Person person = new Person("John", "12 Bell street", "3473339999", "john12@aol.com");
        Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789", "somsak@mymail.com", Student.FRESHMAN);
        Employee employee = new Employee("Mike", "34 West street", "6189999999","mike80@aol.com", 910, 60000);
        Faculty faculty = new Faculty("Sue", "28 Well street", "4133333333","sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");
        Staff staff = new Staff("Tom", "90 Country road", "2030000000","tomcat@aol.com", 12, 65000, "Executive Assistant");

        System.out.println("Person\nName: John\nAddress: 12 Bell street\nPhone: 3473339999\nEmail: john12@aol.com");
        System.out.println(person.toString());
        System.out.println();
        System.out.println("Student\nName: Somsak\nAddress: 1 Chalongkrung Road, Ladkrabang, BKK, 1052\nPhone: 012-345-6789\nEmail: somsak@mymail.com");
        System.out.println(student.toString());
        System.out.println();
        System.out.println("Employee\nName: Mike\nAddress: 34 West street\nPhone: 6189999999\nEmail: mike80@aol.com\nOffice: 910\nSalary: 60000");
        System.out.println(employee.toString());
        System.out.println();
        System.out.println("Faculty\nName: Sue\nAddress: 28 Well street\nPhone: 4133333333\nEmail: sue28@aol.com\nOffice: 101\nSalary: 50000\nOffice Hours: 4pm to 6pm\nRank: Professor");
        System.out.println(faculty.toString());
        System.out.println();
        System.out.println("Staff\nName: Tom\nAddress: 90 Country road\nPhone: 2030000000\nEmail: tomcat@aol.com\nOffice: 12\nSalary: 65000\ntitlw: Executive Assistant");
        System.out.println(staff.toString());

    }
}