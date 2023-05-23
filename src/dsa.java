import java.util.Arrays;

public class dsa {

    public static void main(String[] args){
        int arr[] = {8,4,1,9,10,5,2};
        //insertionSort(arr);
        //selectonsort();

    }

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while((j>=0) && (arr[j]>current)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectonsort(){
        int arr[] = {8,4,1,9,10,5,2};                     //{8,4,1,9,10,5,2};
        for (int i=0;i<arr.length;i++){                    //1,4,8,9,10,5,2
            int min_index=i;                                //
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]) {
                    min_index = j;
                }
            }
            int lowest_number=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=lowest_number;
        }
        System.out.println("Selection Sort"+Arrays.toString(arr));
    }
}
