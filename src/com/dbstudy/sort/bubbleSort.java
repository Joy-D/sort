package com.dbstudy.sort;
/*
 *  冒泡排序
 */
public class bubbleSort {
    public static void bubbleSort(int[] array,int start,int end,int length)
    {
        if (length<=1)
        {
            return;
        }
        for (int i=start;i<end;i++)
        {
            boolean flag=true;
            for (int j=start;j<end-i;j++)
            {
                if(array[j+1]<array[j])
                {
                    array[j]^=array[j+1];
                    array[j+1]^=array[j];
                    array[j]^=array[j+1];
                    flag=false;
                }
            }
            if (flag)
            {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] array=new int[]{23,8,9,21,32,12,7,6,13,14};
        bubbleSort(array,0,array.length-1,array.length);
        for (int i:array) {
            System.out.println(i);
        }
    }
}
