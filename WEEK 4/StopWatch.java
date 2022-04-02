public class StopWatch {
    private double startTime = 0;
    private double endTime = 0;
    private boolean running = false;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }
    public double getElapsedTime(){
        double elapsed = 0;
        if(running){
            elapsed = System.currentTimeMillis() - startTime;
        }else{
            elapsed = this.endTime - this.startTime;
        }
        return elapsed;
    }

}