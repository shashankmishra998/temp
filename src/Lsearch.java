import java.util.*;
public class Lsearch {
    public static void main(String[] args) {
        int pos=-1;
        int k=0;
        System.out.println("Enter the no to be searched in an  array=");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] arr = new int[10];
        for(int i=0; i<10; i++)
        {
            arr[i]=scan.nextInt();
        }

        for(int j=0;j<10;j++)
        {

            if(arr[j]== x) {
                pos = arr[j];
                k=j+1;
            }
        }
        if(pos==-1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element"+ pos +"found at"+k);
        }


    }
}
