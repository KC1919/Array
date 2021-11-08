import java.util.Scanner;
class movNegPos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        move(a,n);
    }
    
    public static void move(int a[], int n)
    {
        int np=0, pp=0;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                int temp=a[i];
                a[i]=a[pp];
                a[pp]=temp;
                pp++;
            }
        }
        
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}