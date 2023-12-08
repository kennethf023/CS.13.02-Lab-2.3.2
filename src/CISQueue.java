import java.util.Arrays;

public class CISQueue {
    private Integer[] queue;
    private int size,front,back;

    public CISQueue(int size) {
        queue=new Integer[size];
        this.size=0;
        this.front=0;
        this.back=-1;
    }

    public void enqueue(int num) {
        back=(back+1)%queue.length;
        queue[back]=num;
        size++;
    }

    public Integer dequeue() {
        if(isEmpty()){
            return null;
        }
        int value=queue[front];
        front=(front+1)%queue.length;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CISQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", size=" + size +
                ", pointer=" + back +
                '}';
    }

        // Array property.
    
    // Size property.
    
    // Index pointer. Indicates the index of the most recently added element.

    // Constructor.

    // Enqueue. This method adds a node to the end of the linked list.

    // Dequeue. This method removes a node from the beginning of the linked list.

    // isEmpty. Returns a boolean indicating whether the linked list is empty.

    // size. Returns the size of the queue.

    // reshuffle. Moves each element down one index. Called whenever we dequeue.

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2, pointer=1}

}
