public class Queue {
    private int[] element;
    private int size = 0;
    
    public Queue(){
        this.element = new int[8];
    }

    public void enqueue(int v){
        if(size >= element.length){
            int[] temp = new int[size*2];
            System.arraycopy(element, 0, temp, 0, element.length);
            element = temp;
        }
        element[size] = v;
        size++;
    }

    public int dequeue(){
        int number = element[0];
        System.arraycopy(element, 1, element, 0, size-1);
        element[size-1] = 0;
        size--;
        return number;
    }

    public int getSize(){
        return size;
    }

    public int[] getQueue(){
        return element;
    }

    public void empty(){
        element = new int[8];
        size = 0;
    }
}
