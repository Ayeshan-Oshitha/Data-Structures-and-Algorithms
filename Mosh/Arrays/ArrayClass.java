package Mosh.Arrays;

public class ArrayClass {

    public static void main(String[] args) {
        MyArray array = new MyArray(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.dispaly();
        System.out.println("------------");
        array.removeAt(1);
        array.dispaly();
        System.out.println("------------");
        System.out.println(array.indexof(40));
        System.out.println(array.indexof(100));

    }
}


// Mosh Excersise - Dynamic Array Class
class MyArray {

    private int[] array;
    private int count = 0; // number of elements currently in the array

    
    public MyArray(int length) {
        array = new int[length];
    }


    public void insert(int num){
        // if the array is full, we need to resize it
        if(count == array.length ){
            int[] newItems = new int[array.length * 2];
            for (int i = 0; i < count ; i++){
                newItems[i] = array[i];
            }
            array = newItems;
        }
        array[count] = num;
        count++;
    }


    public void dispaly(){
        for (int i = 0; i < count; i++){
            System.out.println(array[i]);
        }
    }


    public void removeAt(int index){
        if(index < 0 || index >= count ){
            throw new IllegalArgumentException("Index is out of range");
        }
        // shift all elements to the left from the index
        for (int  i = index; i < count; i++){
            array[i] = array[i+1];
        }
        count--;
    }

    
    public int indexof(int num){
        for(int i = 0; i < count ; i++){
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }
}
