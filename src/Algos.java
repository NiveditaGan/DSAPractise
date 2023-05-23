import java.util.Arrays;

public class Algos {
    public static void main(String[] args){
        Algos obj2= new Algos();
        //obj2.binarysearch();
        //Q2### recursive search
//        int[] array = {23,56,43,45,6,7,3,22,889,6};
//        int key =8896;
//        int first = 0;
//        int last = array.length-1;
//        int mid=(first+last)/2;
//        obj2.recursivesearch(first, last, mid,array, key);

        int[] val = new int[]{3,2,4};
        int[] arr= obj2.twoSum(val, 6);
    }

    public void binarysearch(){
        int[] array = {23,56,43,45,6,7,3,22,889,6};
        int key = 6;
        int first = 0;
        int last = array.length-1;
        int mid=(first+last)/2;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        while(first<=last){
            if (array[mid]==key){
                System.out.println(key+" : is found at position: "+mid);
                break;
            }else if(array[mid]<key){
                first = mid+1;
            }else if(array[mid]>key){
                last=mid-1;
            }
            mid = (first+last)/2;
        }
        if (first>last){
            System.out.println(key+" element is not found");
        }

    }

    public void recursivesearch(int first, int last, int mid, int[] array, int key){
      while(first<=last){
          if(array[mid]==key){
              System.out.println(key+" :is found at position: "+mid);
              break;
          }else if(array[mid]>key){
              last = mid-1;
          }else if(array[mid]<key){
              first=mid+1;
          }
          mid=(first+last)/2;
          recursivesearch(first,last, mid,array, key);
      }

    }
//    if(first>last){
////        System.out.println("number is not present in the string "+key);
////    }

    public int[] twoSum(int[] nums, int target) {
        int[] returnArr = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    returnArr[0]=i;
                    returnArr[1]=j;
                    break;
                }
            }
        }
        return returnArr;
    }

    public void sortLinkedHashMap(){

    }

}
