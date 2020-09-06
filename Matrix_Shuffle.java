package encryption;
public class Matrix_Shuffle
{
	public void upshift(int a[][],int n)
	{
	int t;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1;j++)
			{
			t=a[j][i];
			a[j][i]=a[j+1][i];
			a[j+1][i]=t;
			}
	}
	public void leftshift(int a[][],int n)
	{
	int t;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1;j++)
			{
			t=a[i][j];
			a[i][j]=a[i][j+1];
			a[i][j+1]=t;
			}
	}
	public void rightshift(int a[][],int n)
	{
	int t;
		for(int i=0;i<n;i++)
			for(int j=n-1;j>0;j--)
			{
			t=a[i][j];
			a[i][j]=a[i][j-1];
			a[i][j-1]=t;
			}
	}
	public void downshift(int a[][],int n)
	{
	int t;
		for(int i=0;i<n;i++)
			for(int j=n-1;j>0;j--)
			{
			t=a[j][i];
			a[j][i]=a[j-1][i];
			a[j-1][i]=t;
			}
	}
	public void diagonalshift(int a[][],int n)
	{
	int i,t;
		for(i=0;i<n/2;i++)
		{
		t=a[i][i];
		a[i][i]=a[n-1-i][n-1-i];
		a[n-1-i][n-1-i]=t;
		}
		for(i=0;i<n/2;i++)
		{
		t=a[i][n-1-i];
		a[i][n-1-i]=a[n-1-i][i];
		a[n-1-i][i]=t;
		}
	}
	
	public void display(int a[][],int n)
	{
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		System.out.print(a[i][j]+"\t");
		System.out.print("\n");
		}
	}
}