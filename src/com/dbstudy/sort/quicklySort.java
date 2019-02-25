package com.dbstudy.sort;

/*
 *  快排算法
 */
public class quicklySort {
    public static void swap(int[] array, int left, int right)
    {
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;
    }
    public static int _quicklySort(int[] array,int start,int end)
    {
        int left=start;
        int right=end;
        int temp=array[end];
        while(left<right)
        {
            while(left<right&&array[left]<=temp)
            {
                left++;
            }
            if (left>=right)
            {
                break;
            }
            while (left<right&&array[right]>=temp)
            {
                right--;
            }
            if (right<left)
            {
                break;
            }
            swap(array,left,right);
        }
        swap(array,right,end);
        return right;
    }
    public static  void quicklySort(int[] array,int start,int end,int length)
    {
        if (length<=1)
        {
            return;
        }
        if (start<end)
        {
            int index=_quicklySort(array,start,end);
            quicklySort(array,start,index-1,length);
            quicklySort(array,index+1,end,length);
        }
    }
    public static void main(String[] args) {
        int[] array=new int[]{23,8,9,21,32,12,7,6,13,14};
        quicklySort(array,0,array.length-1,array.length);
        for (int i:array) {
            System.out.println(i);
        }
    }
}
