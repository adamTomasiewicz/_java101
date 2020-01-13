package c_core_collections.queue;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyQueue {
    //pola:
    //pole Object[]
    // pole z ostatnim elementem
    private Object[] fifoQueue;
    private int totalNumberOfObjects;

    //construktor

    public MyQueue(int size) {
        if (size <= 0) size = 1;
        this.fifoQueue = new Object[size];
    }
public MyQueue() {
        this(10);
}
    //metody:
    //void add(Object o)
    //Object pop() - wyjmuje element i wszystkie wskakuja na jego miejsce
    void add(Object o){
        if(100*this.totalNumberOfObjects>this.fifoQueue.length*80){
            fifoQueue=getDoubleSizedArray(fifoQueue);
        }
        this.fifoQueue[this.totalNumberOfObjects]=o;
        this.totalNumberOfObjects++;
    }
    private Object[] getDoubleSizedArray(Object[] oldArray) {
        Object[] newarray = new Object[oldArray.length*2];
        for (int i = 0; i <totalNumberOfObjects ; i++) {
            newarray[i]=oldArray[i];
        }
        return newarray;
    }
    //static MyQueue checkIfFull (){return c}


    @Override
    public String toString() {
        return new StringJoiner(", ", MyQueue.class.getSimpleName() + "[", "]")
                .add("fifoQueue=" + Arrays.toString(fifoQueue))
                .toString();
    }


    public int size () {
        return this.totalNumberOfObjects;
    }

   public Object pop (){

        if(totalNumberOfObjects==0)throw  new IllegalStateException("Queue is empty!");
       Object poped = this.fifoQueue[0];
        for (int i = 0; i <totalNumberOfObjects ; i++) {
            this.fifoQueue[i]=this.fifoQueue[i+1];
        }
        fifoQueue[totalNumberOfObjects-1] = null;
        totalNumberOfObjects--;
        return poped;
    }


    public static void main(String[] args) {
        MyQueue myFifo1 = new MyQueue();
        myFifo1.add(1);
        myFifo1.add(2);
        myFifo1.add(3);
        myFifo1.add("baba");
        myFifo1.add("beton");
        myFifo1.add(new int[]{2,3,4});
        for (int i = 0; i <15 ; i++) {
            myFifo1.add(i);
            System.out.println(i+", "+myFifo1.size()+", total array length: ");
        }
        for (int i = 0; i <15 ; i++) {
            System.out.println();
        }


        System.out.println(myFifo1.size());

    }
}
