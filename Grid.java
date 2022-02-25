package algorithmStudy;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Grid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m1 = sc.nextInt();
		int arr[][] = new int[m1][2];

		for(int i = 0; i<m1; i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>()
		{
			@Override
				public int compare(int[] o1, int[] o2)
				{
					if(o1[1] == o2[1])
					{
						return o1[0] - o2[0];	//오름차순
					}
					return o1[1] - o2[1];		//내림차순
				}
		});
		int cnt = 0;
        int end = 0;
		for(int i = 0; i<m1; i++)
		{
			
			if(end <= arr[i][0])
			{
				end = arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}