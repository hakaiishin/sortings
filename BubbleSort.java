package sortings;

import java.util.Scanner;

public class BubbleSort {
    static Scanner iScanner=new Scanner(System.in);

    public static void arrayInsert(int []A){
        for(int i=0;i<A.length;i++){
            System.out.print("enter A["+i+"] value:");
            int x=iScanner.nextInt();
            A[i]=x;
        }
        System.out.println();
    }

    public static void arrayDisplay(int[]A){
        for (int i : A)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void swap(int []A,int x, int y) {
        A[x]=A[x]+A[y];
        A[y]=A[x]-A[y];
        A[x]=A[x]-A[y];
    }

    public static void sort(int A[]){
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j < A.length; j++) {
                if(A[i]>A[j])
                    swap(A,i,j);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("enter array size:");
        
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int A[]=new int[size];
        
        BubbleSort.arrayInsert(A);
        BubbleSort.arrayDisplay(A);
        BubbleSort.sort(A);
        BubbleSort.arrayDisplay(A);

        input.close();
    }
}
