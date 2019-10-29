import java.util.Scanner;

class Network {
	
	public static int network(int A[][],int T) 
	{
		int k,n,max = 0;
		for(int i=0;i<T;i++)
		{
			n=A[i][0];
			k=A[i][1];
			
			if(n==2&&k==1)
			{
				max= 1;
			}
			else if(k<n-1)
			{
				max= -1;
			}
			else if(k>n)
			{
				max= 3;
			}
			else if(k==n-1||k==n)
			{
				max= 2;
			}
		}
		return max;
		
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int T,cnt=0;
		int A[][]=new int[10][2];
		int B[]=new int[10];
		
		T=sc.nextInt();
		
		for(int i =0;i<T;i++)
		{
			for(int j=0;j<2;j++)
			{
				A[i][j]=sc.nextInt();
			}

			B[i]=network(A,T);
			cnt++;
		}

		for(int i=0;i<cnt;i++)
		{
			System.out.println(B[i]);
		}
		
	}

}
