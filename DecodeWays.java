package ProjectFiles;

public class DecodeWays {

	static String  map = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void main(String[] arg){
		System.out.println(numDecodings("51126"));
		System.out.println(numDecodings("12"));
		System.out.println(numDecodings(""));
		//System.out.println(numDecodings("4757562545844617494555774581341211511296816786586787755257741178599337186486723247528324612117156948"));
	}
	public static int numDecodings(String s) {
		if(s.length() == 0){
			return 0;
		}
		DecodeWaysCount d = new DecodeWaysCount();
		numDecodingsRec(s,"",d);
		return d.getCount();
	}
	private static  void numDecodingsRec(String s, String decodedString, DecodeWaysCount d) {
		if(s.length() == 0){
			System.out.println(decodedString);
			d.setCount(d.getCount()+1);
			return;
		}
			char curChar = s.charAt(0);
			int curNumber = Integer.parseInt(curChar +"");
			if(1 == s.length()){
				System.out.println(decodedString+map.charAt(curNumber));
				d.setCount(d.getCount()+1);
				return;
			}
			numDecodingsRec(s.substring(1), decodedString+map.charAt(curNumber),d);

			if(1 < s.length()){
				char nextChar = s.charAt(1);

				int twoDigitNumber = Integer.parseInt(curChar+"" + nextChar );
				if(twoDigitNumber < map.length())
					numDecodingsRec(s.substring(2), decodedString+map.charAt(twoDigitNumber),d);
			}
	}
}

class DecodeWaysCount{
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
