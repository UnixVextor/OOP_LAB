public class BMI {
    private String name;
    private int age;
    private double weigth = 0;
    private double height = 0;
    private double BMI = 0;
    private static final double POUND_PER_WEIGHT = 0.45359237;
    private static final double INCHES_PER_HEIGHT = 0.0254;

    public BMI(String name,int age,double weigth,double feet,double inches){
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.height = feet * 12 + inches;
    }

    public double getBMI(){
        this.BMI = (weigth*POUND_PER_WEIGHT)/Math.pow(height*INCHES_PER_HEIGHT, 2);
        return BMI;
    }

    public String getInterpretation(){
        if(BMI >= 30.0) return "Obese";
        else if(BMI < 30.0 && BMI <= 25.0) return "Overweight";
        else if(BMI < 25.0 && BMI <= 18.5) return "Normal";
        else if(BMI < 18.5) return "Underweight";
        return null;
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    } 
    
    public double getWeight(){
        return this.weigth;
    }

    public void setWeight(double weigth){
        this.weigth = weigth;
    } 

    public double getHeight(){
        return this.weigth;
    }

    public void setHeight(double height){
        this.height = height;
    } 
}
