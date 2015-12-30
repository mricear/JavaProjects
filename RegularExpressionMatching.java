package ProjectFiles;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		System.out.println(isMatch("ab", "ab"));
		System.out.println(isMatch("aaaac", "a*aa"));
		System.out.println(isMatch("aa", "a*aa"));
		System.out.println(isMatch("aaaa", "a*aa"));
//		System.out.println(isMatch("aaaa", "a*aa"));
//		System.out.println(isMatch("aa", "a*aa"));
//		System.out.println(isMatch("aaa", "a*aa"));
	}

	public static boolean isMatch(String s, String p) {
		int i = 0, j = 0;
		for(  ; i < s.length()  && j < p.length();){
			char c = p.charAt(j);
			if(i+1 < p.length())
				if(p.charAt(j+1) != '*'){
					if(s.charAt(i) != p.charAt(j)){
						return false;
					}
					
					Havent finished this code yet... Very complecated if and else
				}
				else{
					//treatStar(s,i,p,j);
					char repeated_char = c;
					if(s.charAt(i) == p.charAt(j)){
						if(j+2 < p.length()){
							if(p.charAt(j+2) == repeated_char){
								int k = j+2;
								while( i < s.length() && k < p.length() && p.charAt(k) == repeated_char && repeated_char == s.charAt(i)){
									i++;k++;
								}
								if(k >= p.length() && i < s.length()){
									while(i < s.length() && s.charAt(i) == repeated_char)
										i++;
									if(i < s.length())
										return false;
									else
										return true;
								}
								else if( i >= s.length() && k < p.length() ) {
									j = k;
									continue;
								}

								else if(k >= p.length() && i >= s.length()){
									j = k;
									continue;
								}
								else if (s.charAt(i) == repeated_char && p.charAt(k) != repeated_char ){
									while(s.charAt(i) == repeated_char){
										i++;
									}
									j = k;
								}
								else if (s.charAt(i) != repeated_char && p.charAt(k) == repeated_char ){
									return false;
								}



//
//								if( k >= p.length() || p.charAt(k) != repeated_char){
//									while(s.charAt(i) == repeated_char){
//										i++;
//									}
//								}
//								if(i >= s.length() || s.charAt(i) != repeated_char ){
//									j = k;
//									continue;
//								}
//								else if (s.charAt(i) != repeated_char && p.charAt(k) == repeated_char)
//									return false;
//								while(i < s.length() && s.charAt(i) == repeated_char){
//									i++;
//								}

							}
						}
					}
					else{
						//check that if this is a * then it would be fine.
					}
				}
			
		}
		if( i  >= s.length() && j >= p.length()){
			return true;
		}
		else{
			if(i >= s.length() ){
				int cur  = j;
				while(cur +1 < p.length())
					if(p.charAt(cur+1) == '*' ){
						cur += 2;
						continue;
					}
					else{
						return false;
					}
			}
			return true;
		}
	}
}
