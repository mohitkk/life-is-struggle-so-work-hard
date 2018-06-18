package com.khullar.struggle;

public class RemoveDuplicatesFromASortedArray {

    public static void main(String[] args) {
        int [] input =  {1,2,2,2,3,3,5,6,6,6,7};
        System.out.println("output: "+remove(input));

        for(int each : input){
            System.out.print(each+" ");
        }

    }

    private static int  remove(int [] input){
        int ptr = 0;

        for(int i=0;i<input.length;i++){
            if(input[i]!= input[ptr]){
                input[++ptr] = input[i];
            }
        }

        return ++ptr;
    }
}
