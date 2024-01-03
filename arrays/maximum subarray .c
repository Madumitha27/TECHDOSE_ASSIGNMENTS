int maxSubArray(int* nums, int numsSize){
     int ptr=0,max=nums[0],sum=0;
    while(ptr<numsSize)
    {
        sum+=nums[ptr];
        if(sum>max)
        {
            max=sum;
        }
        if(sum<0)
        {
            sum=0;
        }
        ptr++;
    }
    return max;
}