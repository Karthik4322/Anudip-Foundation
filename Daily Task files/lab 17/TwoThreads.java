/* Create two thread.one thread is finding average of first 50 numbers 
and other thread is printing square of number store in array arr={10,15,20,25,30}*/ 

import java.util.Arrays;

class Average extends Thread{
   int avg_data[] = {34, 12, 47, 3, 29, 18, 50, 7, 26, 43,  
    9, 15, 39, 1, 31, 22, 48, 6, 37, 14,  
    5, 25, 8, 41, 19, 33, 10, 30, 45, 2,  
    49, 17, 38, 13, 21, 44, 4, 36, 28, 11,  
    23, 20, 35, 16, 24, 46, 32, 40, 27, 42};

    
public void run(){
    Arrays.sort(avg_data);
    int Count = avg_data.length;
    int temp=0;
    
    for (int i = 0; i <=Count-1; i++) {
        temp = temp+ avg_data[i];
    }
System.out.println("The Average of array elements are : "+temp);
System.out.println();
System.out.println();
}
}

class SquareArray extends Thread{
    int arr[] ={10,15,20,25,30,35,40,45,50};
    int arr_Size = arr.length;
    public void run(){
        for (int i = 0; i <=arr_Size-1; i++) {
            System.out.println("The Array element is: "+arr[i]+" the square of value is :"+arr[i]*arr[i]);
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        Average a = new Average();
        a.start();

        SquareArray b = new SquareArray();
        b.start();
       
    }
}
