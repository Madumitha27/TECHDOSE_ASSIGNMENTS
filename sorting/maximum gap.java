class Solution {
    public int maximumGap(int[] nums) {
        Map<Integer,Integer> map=new TreeMap<>();
        int least=nums[0];
        for(int i:nums)
        {
            if(i<least)
            least=i;
            if(map.get(i)==null)
            map.put(i,1);
            else
            map.put(i,map.get(i)+1);
        }
        int prev=least,max=0;
        for(Integer i:map.keySet())
        {
            if(i-prev>max)
            max=i-prev;
            System.out.println(prev+" "+i+" "+max);
            prev=i;
        }
        return max;
    }
}