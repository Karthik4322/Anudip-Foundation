public class MatrixMultiplicationDemo{
    public static void main(String args[]){
    //two matrices are created here
    int a[][]={{1,1,1},{2,2,2},{3,3,3}};
    int b[][]={{1,1,1},{2,2,2},{3,3,3}};
    //another matrix is created here for storing the multiplication of the two above matrices
    int c[][]=new int[3][3]; //3 columns and 3 rows
    //multiplication and printing of 2 matrices
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    c[i][j]=0;
    for(int k=0;k<3;k++)
    {
    c[i][j]+=a[i][k]*b[k][j];
    }//k loop ends
    System.out.print(c[i][j]+" "); //print the matrix element
    }//j loop ends
    System.out.println();//new line
    }
    }}