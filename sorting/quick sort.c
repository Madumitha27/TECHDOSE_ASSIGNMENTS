#include <stdio.h>
int partition(int arr[],int lptr,int rptr)
{
    int pivot=arr[rptr];
    int i=lptr-1;
    for(int j=lptr;j<=rptr;j++)
    {
        if(arr[j]<=pivot)
        {
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    return i;
}
void quicksort(int arr[],int lptr,int rptr)
{
    if(lptr<rptr){
    int p=partition(arr,lptr,rptr);
    quicksort(arr,lptr,p-1);
    quicksort(arr,p+1,rptr);
}
}

int main()
{
    int arr[]={2,6,1,3,5,9,4,8,3,2};
    quicksort(arr,0,9);
    for(int i=0;i<9;i++)
    printf("%d ",arr[i]);
    return 0;
}