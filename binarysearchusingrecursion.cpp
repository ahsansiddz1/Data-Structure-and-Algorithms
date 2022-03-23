#include<iostream>
using namespace std;

class binarysearch{
	public:
		
			 //first sort the array
	int sort(int arr[],int n)
	{
	
		
		for(int i=0; i<n; i++)
		{
			 
			for(int j=0; j<n-(i+1); j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					 int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int k=0; k<n; k++)
		{
		 
	 	cout<<arr[k]<<" ";
		}
		cout<<endl;
	}
	
	//======================
	
	//then search targeted element
		
		
		
		
	int search(int arr[],int target,int s,int e)
	{

	  if(s>e)
	  {
	  	return -1;
	  }
	  
	  	int m = s+(e-s)/2;
	  
	  if(arr[m]==target)
	  {
	  	return m;
	  }
	  
	  if(target<arr[m])
	  {
	  	return search(arr,target,s,m-1);
	  }
	  
	   if(target>arr[m])
	  {
	  	return search(arr,target,m+1,e);
	  }
	}
	
	
};

int main()
{
	binarysearch ob;
	int arr[]={99,32,34,4,45,96};
			int arrSize = sizeof(arr)/sizeof(arr[0]);

 	ob.sort(arr,arrSize);
	int target=4;
 


	cout<<"Number is at index : " << ob.search(arr,target,0,arrSize-1);
 
	
	return 0;
}

