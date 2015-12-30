package ProjectFiles;

public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(8));
	}

	public static String countAndSay(int n) {
		int loopCount = 1;
		StringBuilder num1 = new StringBuilder();
		num1.append("1"); 
		while(loopCount <= n-1){
			char cur = num1.charAt(0);
			int count  = 1;
			StringBuilder num2 = new StringBuilder();
			int i;
			for( i = 1; i < num1.length(); i++){
				char ch = num1.charAt(i) ;
				if(ch == cur){
					count++;
				}
				else{
					num2.append(count).append(cur);
					cur = ch;
					count  = 1;
				}
			}

			num1 = num2.append(count).append(cur);
			loopCount++;
		}
		return num1.toString();
	}

}
