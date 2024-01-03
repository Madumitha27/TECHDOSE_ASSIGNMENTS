class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        for(int i=31;i>=0;i--)
        {   
            int mask=1<<i;
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if((mask&nums[j])!=0)
                {
                    count++;
                }
            }
            if(count>nums.length/2)
            res|=mask;
        }
        return res;
    }
}