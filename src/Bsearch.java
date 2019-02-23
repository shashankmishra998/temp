import java.util.*;
public class Bsearch {
    public static void main(String[] args) {
        int beg =0;
        int mid;
        int pos = -1;
        System.out.println("Enter the no to be searched=");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] arr1 = new int[10];
        for(int i = 0; i<10 ; i++)
        {
         arr1[i]=scan.nextInt();
        }
         int end = arr1.length-1;
         for(int i =0;beg <= end;i++)
         {
             mid =(beg + end)/2;
             if(arr1[mid]== x)
             {
                 pos = x;
                 break;
             }
             else if(arr1[mid]>x)
             {
                 end = mid -1;
             }
             else
             {
                 beg = mid +1;
             }
         }
        System.out.println(x + " found at " + pos);



    }
}
