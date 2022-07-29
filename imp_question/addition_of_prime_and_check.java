public class addition_of_prime_and_check {
    public static void main(String[] args) {
        int a[]={23,32,45,87};
        int e;
        int b[]=new int[a.length];
        int sum=0
        for(int i=0;i<a.length;i++)
        {
            while(a[i]>0)
            {
                e=a[i]%10;
                a[i]=a[i]/10;
                sum=sum+e;
            }
            b[i]=sum;
        }
        for (int j=0;j<b.length;j++)
        {
            for(int r=2;r<b[j];r++)
            {
                
            }
        }
    }
    
}
