public class Pro2_64010806_6 {
    public static void main(String[] args) {
        Course student = new Course("IEEE");
        student.addStudent("Caren");
        student.addStudent("Ren");
        student.addStudent("Two");
        student.dropStudent("Ren");
        for (int i = 0; i < student.getNumberStudent(); i++) {
            System.out.println(student.getStudent()[i]);
        } 
    }   
}
