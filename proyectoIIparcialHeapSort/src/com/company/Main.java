package com.company;

public class Main {
    static void ImprimirArr(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {12, 11, 13, 5, 6, 7,54, 66, 62, 87, 14, 124, 66, 34, 1099};
        int n = arr.length;

        System.out.println("El arreglo original es: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        HeapSort hs = new HeapSort();
        hs.sort(arr);


        System.out.println("El arreglo ordenado es:");
        ImprimirArr(arr);
    }
}
