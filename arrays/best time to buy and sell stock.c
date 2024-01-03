

int maxProfit(int* prices, int pricesSize){
   int lptr=0,rptr=1,max=0;
    printf("%d",pricesSize);
    while(rptr<pricesSize)
    {
        if(prices[rptr]<prices[lptr])
        {
            lptr=rptr;
        }
        else if(prices[rptr]-prices[lptr]>max)
        {
            max=prices[rptr]-prices[lptr];
        }
        rptr++;
    }
    return max;
}