import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Main obj1=new Main();
        Scanner stdin = new Scanner(System.in);
//        Q1### Write a program to swap two numbers without using their temp variable
//        obj1.swapNum();

        //Q2### Write a program to reverse a string in any language
//        System.out.println("Enter string to reverse");
//        String str = stdin.nextLine();
//        String reversedString = obj1.reverseString(str);
//        System.out.println("Reversed String : "+reversedString);

        //Q3### Write a method that will take an array as an argument and reverse it.
        //input -> 3,4,5,9,6
        //output -> 6,9,5,4,3
//        int[] arr = new int[6];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter Number for Array:");
//            arr[i] = stdin.nextInt();
//        }
//        System.out.println("Array before reversing: "+ Arrays.toString(arr));
//        obj1.reverseArray(arr);

        //Q4### Write a method that will take a string as an argument. The method will reverse the position of words and return it.
//        String inputsentence = stdin.nextLine();
//        System.out.println("Sentence before reversing order:" +inputsentence);
//        String outputsentence = obj1.reversewords(inputsentence);
//        System.out.println("Sentence after Reversing order: "+outputsentence);

//        //Q5### String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.
//        System.out.println("Enter String to check palindrome");
//        String str = stdin.nextLine();
//        boolean flag = obj1.strPalindrome(str);
//        if(flag){
//            System.out.println(str+ " is a palindrome");
//        }else{
//            System.out.println(str+ " is not a palindrome");
//        }

//        //Q6### Number palindrome
//        System.out.println("Enter Number to check palindrome");
//        int num1 = stdin.nextInt();
//        boolean flag = obj1.checkNumPalindrome(num1);
//        if(flag){
//            System.out.println(num1+ "is a palindrome");
//        }else{
//            System.out.println(num1 + " is not a palindrome");
//        }

//        //Q7### Max/min number from an array. Write a method that will accept an array of int as an argument and it returns the max/min number from a given array
        int[] arr = new int[]{23,43,21,56};
//        int max = obj1.checkMax(arr);
//        int min = obj1.checkMin(arr);
//        System.out.println("Max: "+max+", Min: "+min);
//
        //Q8### Find the second min/max number from an array
        int secondMax= obj1.check2ndMax(arr);
        System.out.println("Second Max: "+secondMax);
//
//        int secondMin = obj1.check2ndMin(arr);
//        System.out.println("Second Min: "+secondMin);

//        //Q8### check if two strings are anagram
//        System.out.println("Enter both the strings");
//        String str1 = stdin.nextLine();
//        String str2 = stdin.nextLine();
//        boolean flag = obj1.checkAnagram(str1, str2);
//        if (flag){
//            System.out.println("Both the strings are anagram");
//        }else{
//            System.out.println("Both the strings are not anagram");
//        }

//        //Q9### Remove duplicates from a string.
//        System.out.println("Enter the string to remove duplicates");
//        String str1 = stdin.nextLine();
//        String strafter = obj1.removedupl(str1);
//        System.out.println("String after removing duplicacy :"+strafter);

//        //Q10### Write a method that accepts a string as an argument. The method counts the number of appearances of each char and return map.
//        System.out.println("Enter the String");
//        String str1 = stdin.nextLine();
//        obj1.checkCharCount(str1);

//        //Q11### Write a method that accepts int[] array and an int number, find 2 elements in the array that sum is equal to the given int
//        obj1.checkarray();
    }

public void checkCharCount(String str1){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println("Count of the character ::"+map.toString());

}
    public String removedupl(String str) {
        LinkedHashSet<Character> linkedhashset = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            linkedhashset.add(str.charAt(i));
        }
        String strafter = linkedhashset.toString().replace(",", "").replace("[","").replace("]","").replace(" ","");

        return strafter;
    }
    public boolean checkAnagram(String str1, String str2){
        char[] strArr1=str1.toCharArray();
        char[] strAttr2 = str2.toCharArray();
        Arrays.sort(strArr1);
        Arrays.sort(strAttr2);
        return (Arrays.equals(strArr1, strAttr2));

    }

    public int checkMax(int[] arr){
        int maxValue=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public int checkMin(int[] arr){
        int minValue=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public int check2ndMax(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-2];
    }

    public int check2ndMin(int[] arr){
        Arrays.sort(arr);
        return arr[1];
    }
    public boolean checkNumPalindrome(int num1){
        int copyOfOriginal = num1;
        int remainder;
        int reversedNumber = 0;
        while(num1>0){
            remainder = num1%10;
            reversedNumber = (reversedNumber*10)+remainder;
            num1=num1/10;
        }
        return reversedNumber==copyOfOriginal;
    }

    public boolean strPalindrome(String str){
        boolean status=true;
        int j=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(j-i)){
                status=false;
            }
        }
        return status;
    }
    public String reversewords(String inputsentence){
        StringBuilder str = new StringBuilder();
        String[] outputsentence = inputsentence.split(" ");
        for(int i=outputsentence.length-1;i>=0;i--){
            str.append(outputsentence[i]+" ");
        }
        return str.toString();
    }
    public void reverseArray(int[] arrNum) {
        int j = arrNum.length - 1;

        // our loop will go till half of our input array
        // 'i' is a pointer that will start from the beginning
        for (int i = 0; i < arrNum.length / 2; i++) {
            // swap elements using positions of i and (j - i)
            int tmp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = tmp;
        }
        System.out.println("After reversing: "+Arrays.toString(arrNum));
    }

    public void swapNum(){
        int num1 = 50;
        int num2 = 40;

        System.out.println("Value of num1: "+num1);
        System.out.println("Value of num2: "+num2);

        num1 = num1+num2; //90
        num2 = num1-num2; //90-40 = 50
        num1 = num1-num2;

        System.out.println("Value of num1 after swap: "+num1);
        System.out.println("Value of num2 after swap: "+num2);
    }

    public String reverseString(String str){
        System.out.println("Provided String: "+str);
        StringBuilder revString=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            revString.append(str.charAt(i));
        }
        return revString.toString();
    }


}