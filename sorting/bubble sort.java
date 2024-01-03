public class Main
{
	public static void main(String[] args){
	    int arr[]=new int[]{3,6,1,8,5,1,0,9};
	    for(int i=0;i<arr.length;i++)
	    {
	        boolean flag=false;
	        for(int j=0;j<arr.length-i-1;j++)
	        {
	            if(arr[j]>arr[j+1])
	            {
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	                flag=true;
	            }
	        }
	        if(flag==false)
	        break;
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}