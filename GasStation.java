package ProjectFiles;

public class GasStation {

	public static void main(String[] args) {

		System.out.println(canCompleteCircuit(new int[]{5, 2,5,2,1}, new int[]{1,4,8,1,1}));
		System.out.println(canCompleteCircuit(new int[]{5}, new int[]{6}));
		System.out.println(canCompleteCircuit(new int[]{5}, new int[]{4}));
		System.out.println(canCompleteCircuit(new int[]{5, 2,5,2,1}, new int[]{1,4,8,1,1}));
	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int start = 0, i = 0, gaas = 0;
		while(true){
			if( i >= gas.length)
				i = 0;

			gaas += gas[i] - cost[i];

			if(gaas < 0){
				int j = start - 1 ;
				if(j < 0 )
					j = gas.length - 1;
				while( i != j && gaas + gas[j] - cost[j] < 0){
					if(j < 0 )
						j = gas.length - 1;
					gaas += gas[j] - cost[j];
					j--;
				}
				if(i == j)
					return -1;
				else if(gaas + gas[j] - cost[j] >= 0){
					gaas += gas[j] - cost[j];
					start = j;
				}

			}
			i++;
			if( i >= gas.length)
				i = 0;
			
			if(start == i)
				return start;
		}
	}

}
