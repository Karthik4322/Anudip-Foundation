public class Box{
        int len;
        int wid;
        int hgt;
        
Box(int l, int w, int h){
         len = l;
         wid = w;
         hgt = h;
    }

Box(){
       
}

Box(int le ,int wi){
         len = le;
         wid = wi;
    
        }
       
 public int Calculate_Area(){
    int Area = len * wid *hgt;
    return Area;
        }
        
        public static void main(String args[]){
        Box b1 = new Box(3,6,7);
        Box b2 = new Box();
        Box b3 = new Box(3,9);
        
        System.out.println(+b1.Calculate_Area());
        System.out.println(+b2.Calculate_Area());
        System.out.println(+b3.Calculate_Area());
        
        
        }   
}
