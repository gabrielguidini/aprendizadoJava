package exercicios.Cap6;

import java.util.Arrays;

public class ArraysMain {
    public static int getArray(int acha) {
        int[] x = {1,2,3,4,5,6};
        int[] y = {5,6,7,8,9,10};

        //boolean found1 = true,found2 =true;
        int retorno = 0;
        for(int i=0;i<x.length;i++){
                if(x[i]== acha && y[i]==acha){
                    if(x[i]==acha || y[i]==acha){
                        retorno = 1;
                        break;
                }
                retorno = 2;
                break;
            }           
            System.out.println("passou");
        }
        return retorno;

        /*int i=0;
        int retorno =0;
        while (found1 || found2 && i<x.length){
            if(x[i]== acha && y[i]==acha){
                if(x[i]==acha || y[i]==acha){
                    found2 = false;
                    retorno = 1;
                }
                found1 = false;
                retorno = 2;
            }
            i++;
            System.out.println("passou");
        }
        return retorno;*/
        
    }
    public static String arrayTermos(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int x = (int)(Math.random()*1000);
            arr[i] = x;
        } return Arrays.toString(arr);
    }
}
