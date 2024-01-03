class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n=nums.size();
        if(n==1)
        return;
        int lastinc=-1;
        int i=1;
        while(i<n)
        {
            if(nums[i]>nums[i-1])
            lastinc=i;
            i+=1;
        }
        if(lastinc==-1)
        {
            reverse(nums.begin(),nums.end());
            return;
        }
        int index=i;
        for(int i=lastinc;i<n;i++)
        {
            if(nums[i]>nums[lastinc-1])
            {
                index=i;
            }
        }
        swap(nums[lastinc-1],nums[index]);
        reverse(nums.begin()+lastinc,nums.end());
    }
};