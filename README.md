#BaekJoon 1931

### Grid 알고리즘을 이용한 풀이방법으로
### 가장 효율적인 방법을 탐색하여 정렬한 후 
### 정렬된 값으로 비교연산을 통한 풀이방법

```

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

```
