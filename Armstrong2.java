public class Armstrong2
{
    public static void main(String[] args) 
     {
        int n, count = 0, b, sum = 0;
        System.out.print("Armstrong numbers from 100 to 10000:");
        for(int i = 100; i <= 10000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}