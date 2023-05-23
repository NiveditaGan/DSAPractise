import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class dsaMatrix {

    public static void main(String[] args){
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12}};
        dsaMatrix matrix = new dsaMatrix();
 //       matrix.printValue(arr);
//        System.out.println(matrix.searchValue(arr, 7));
//        System.out.println(matrix.searchValue(arr, 50));
//
//        matrix.findPrincipalDiagonalValue(arr);
//        matrix.findSecondaryDiagonalValue(arr, (arr[0].length-1));

        int arr1[][]={{11,23,30},
                {51,6,7},
                {19,10,13}};
        // matrix.sortMatrixValue(arr1, 3);
        //matrix.rotateMAtrix(arr1, 3);
        int arr2[][]={{11,23,30},
                {10,11,19},
                {19,10,13}};
        matrix.findUniqueElements(arr2, 3);
        matrix.traverseTime();

    }
    static int MAX=1000;
    static int arrTraverse[][]=new int[MAX][MAX];
    public void traverseTime(){
        Instant start = Instant.now();
        rowTime();
        Instant end = Instant.now();
        System.out.println("Row wise Traverse took time::: "+ Duration.between(start, end));

        start = Instant.now();
        colTime();
        end = Instant.now();
        System.out.println("Column wise Traverse took time::: "+ Duration.between(start, end));
    }

    public void rowTime(){
        for(int i=0;i<MAX;i++){
            for(int j=0;j<MAX;j++){
                arrTraverse[i][j]++;
            }
        }
    }

    public void colTime(){
        for(int i=0;i<MAX;i++){
            for(int j=0;j<MAX;j++){
                arrTraverse[j][i]++;
            }
        }
    }

    public void findUniqueElements(int[][] arr, int n){
        int[] temp=new int[n*n];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                temp[k++] =arr[i][j];
            }
        }

        for(int i=0;i<temp.length;i++){
            boolean flag = true;
            for(int j=i+1;j<temp.length-1;j++){
                if(temp[i]==temp[j]){
                    temp[j]=0;
                    flag=false;
                    break;
                }
            }
            if((flag) && (temp[i]!=0)){
                System.out.println("Unique Item::: "+temp[i]);
            }
        }


    }

    public void sortMatrixValue(int[][] arr, int n){
        dsaMatrix matrix1 = new dsaMatrix();
        System.out.println("Matrix Before Sorting::: ");
        matrix1.printValue(arr);
        int[] temparr= new int[n*n];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                temparr[k++] = arr[i][j];
            }
        }
        Arrays.sort(temparr);
        k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=temparr[k++];
            }
        }

        System.out.println("Matrix After Sorting::: ");
        matrix1.printValue(arr);
    }

    public void rotateMAtrix(int[][] arr, int n){
        //transpose the matrix
        //reverse columns of the matrix
        //transpose the matrix
        //reverse columns of the matrix
    }


    //TIME COMPLEXITY:: O(N^2) (as nestef 2 loops present)
    // SPACE COMPLEXITY:: O(1)
    public void findPrincipalDiagonalValue(int arr[][]){
        System.out.println("Principal Diagonal Values are: ");
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (i==j){
                    System.out.print(arr[i][j]+", ");
                }

            }
        }
    }

    public void findSecondaryDiagonalValue(int arr[][], int n){
        System.out.println("\nSecondary Diagonal Values are: ");
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (i+j==n){
                    System.out.print(arr[i][j]+", ");
                }

            }
        }
    }

    public void printValue(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public boolean searchValue(int arr[][], int val){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]==val){
                    return true;
                }

            }
        }
        return false;
    }
}
