package JavaTopics;

public class Arrays {
	
	public void method1()
	{
		int[][] arr1 = new int[1][2];
		arr1[0][0]=12;
		arr1[0][1]=20;
		
		System.out.println(arr1.length);
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length;j++)
			{
			System.out.println(arr1[i][j]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Arrays obj = new Arrays();
		obj.method1();
	}

}
