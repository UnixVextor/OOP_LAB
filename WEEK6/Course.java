public class Course {
    private String nameCourse;
    private int numberStudents = 0;
    private String[] Students = new String[2];

    
    public Course(String nameCourse){
        this.nameCourse = nameCourse;
    }

    public void addStudent(String student){
        if(numberStudents >= Students.length){
            String[] newStudents = new String[Students.length * 2];
            System.arraycopy(Students, 0, newStudents, 0, Students.length);
            Students = newStudents;
        }
        Students[numberStudents++] = student;
    }

    public void dropStudent(String nameStudent){
        for (int i = 0; i < numberStudents; i++) {
            String newName = nameStudent.toLowerCase();
            String student = Students[i].toLowerCase();
            if(student.equals(newName)){
                System.arraycopy(Students, i+1, Students, i, numberStudents - i - 1);
                Students[numberStudents + 1 - i] = null;
                numberStudents--;
                break;
            }
        }
    }

    public void clear(){
        Students = new String[2];
        numberStudents = 0;
    }

    public String[] getStudent(){
        return Students;
    }

    public int getNumberStudent(){
        return numberStudents;
    }
}
