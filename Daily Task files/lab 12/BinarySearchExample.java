class BinarySearchExample{   // name of class
 public static void binarySearch(int arr[], int first, int last, int key){   // void method with parameters receiving values of array capacity,starting index 											// ending  index , key value to be searching
   int mid = (first + last)/2;  	// finding mid value to find which side to look for value
   while( first <= last ){  		// used to set a range to be searched
      if ( arr[mid] < key ){  		// mid value helps to determine which side to be search for key value
        first = mid + 1;     
      }
      else if ( arr[mid] == key ){  	// mid value is same as key value , such index to be printed
        System.out.println("Element is found at index: " + mid);  
        break;  			// exits from the program
      }
       else{  				// if value is below the before mid range
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   
if ( first > last ){  			// if starting index value becomes greater than last index value it means the value is not available in array
      System.out.println("Element is not found!");  
   }  
 } 
 
public static void main(String args[]){   // main method where program starts
        int arr[] = {45,35,56,67,78,89,78,12,20};   // array declaration
        int key = 67;  				// key to be searched
        int last=arr.length-1; 			// find last index value 
        binarySearch(arr,0,last,key);     	// passing the arguments to method named binarySearch
 }  
}  