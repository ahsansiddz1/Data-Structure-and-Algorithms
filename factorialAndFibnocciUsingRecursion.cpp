 
 #Program to find the facorial and fibnocci number using recursion
 
      #include<iostream>
      using namespace std;
      
      class fibnocciclass{
    public:
    int fibo(int n)
     {
     	if(n<2)
     	{
     		return n;
	    }
	    else
		{
	      return fibo(n-1)+fibo(n-2)	;
		}
		 
	 }
 	
 };
 
      class factorialrec{
    public:
    int fact(int n)
     {
     	if(n==1)
     	{
     		return n;
	    }
	    else
		{
	      return n*fact(n-1)	;
		}
		 
	 }
 	
 };
   
   
   
   
      int main()
      {
      	fibclass ob;
      	factrec ob1;
      	
      	int n=50;
      	cout<<"fib of "<<n<<"th fibnocci is : "<<ob.fibo(n);
      	cout<<endl;
      	cout<<"Recursion of "<<n<<" is : "<<ob1.fact(n);
       
    
       return 0;
	        
	  }

 