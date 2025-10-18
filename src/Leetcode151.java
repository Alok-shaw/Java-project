import java.util.Arrays;
import java.util.Scanner;

public class Leetcode151 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter string without any restriction ");
        String str=in.nextLine();
                String str1=str.trim().replaceAll("\\s+"," ");
                String[] arr = str1.split(" ");
                for(int i=0;i<arr.length/2;i++){
                    String temp=arr[i];
                    arr[i]=arr[arr.length-1-i];
                    arr[arr.length-1-i]=temp;
                }
//         String str2 = String.join(" ", arr);this is the best method to implement join method me ek delimeter pass karna hota ha
//        System.out.println((str2)); jaise yaha space provide kiya gya ha
            }
        }