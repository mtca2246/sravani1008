class Main3 
{
	public static void main(String[] args) 
	{
		int[] number={2,-9,0,5,12,-25,22,9,8,32};
		int sum=0;
		double average;
		for(int numbers:number)
		{
			sum=sum+numbers;
		}
		int arrayLength=number.length;
		average=((double)sum/(double)arrayLength);
		System.out.println("sum="+sum);
		System.out.println("Average="+average);
	}
}