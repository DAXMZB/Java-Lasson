class Ex3{
	public static void main(String[] args) {
		int[][][] arr={
			{
				{3,5,8},
				{35,43,75},
				{42,55,32}
			}
			,
			{
				{12,52,48},
				{88,32,61},
				{70,47,92}
			}

		};
		for(int p=0;p<arr.length;p++)
		{
			for(int r=0;arr[p].length;r++)
			{
				for(int c=0;c<arr[p][r].length;c++)
				{
					System.out.printf("%d "+arr[p][r][c]);
				}
			}
		}

		for(int[][]p:arr)
		{
			for(int[]r:p)
			{
				for(int c:r)
				{
					System.out.printf("%d ",c);
				}
			}
		}

	}
}
	
