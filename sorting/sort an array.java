class Solution {
    public void merge(int[] nums,int beg,int mid,int end)
    {
        int n1=mid-beg+1;
        int n2=end-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i]=nums[beg+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i]=nums[mid+1+i];
        }
        int lptr=0,rptr=0,k=beg;
        while(lptr<n1&&rptr<n2)
        {
            if(left[lptr]<right[rptr])
            {
                nums[k]=left[lptr];k++;lptr++;
            }
            else
            {
                nums[k]=right[rptr];k++;rptr++;
            }
        }
        while(lptr<n1)
        {
            nums[k++]=left[lptr++];
        }
        while(rptr<n2)
        {
            nums[k++]=right[rptr++];
        }
    }
    public void mergesort(int[] nums,int beg,int end)
    {
        if(beg<end)
        {
            int mid=(beg+end)/2;
            mergesort(nums,beg,mid);
            mergesort(nums,mid+1,end);
            merge(nums,beg,mid,end);
        }
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}