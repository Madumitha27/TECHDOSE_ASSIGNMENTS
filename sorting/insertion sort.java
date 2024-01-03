public class Main
{
	public static void main(String[] args) {
	    int arr[]=new int[]{7,3,9,1,4,5,2,2,0,7};
	    for(int i=1;i<arr.length;i++)
	    {
	        int key=arr[i];
	        int j=i-1;
	        while(j>=0&&arr[j]>key)
	        {
	            arr[j+1]=arr[j];
	            j--;
	        }
	        arr[j+1]=key;
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}