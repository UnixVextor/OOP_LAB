public class Pro3_64010806_6 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Before dequeue.");
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
            System.out.println(queue.getQueue()[i-1]);
        }
        
        System.out.println("\nAfter dequeue");
        for (int i = 0; i < 20; i++) {
            System.out.println( queue.dequeue());
        }
        
    }
    
    
}
