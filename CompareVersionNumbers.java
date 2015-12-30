package ProjectFiles;

public class CompareVersionNumbers {

	public static void main(String[] args) {
		System.out.println(compareVersion("1.0.0.4", "1.0.0.4.0.0.0.4"));
		System.out.println(compareVersion("1", "0.0.0.4.0.0.0.4"));
		System.out.println(compareVersion("1.0.1", "1.0.0.4.0.0.0.4"));
		System.out.println(compareVersion("1.0.1", "1.0.1.0.0"));
		System.out.println(compareVersion("1.0.1", "1.0.1.0.0.1"));
		System.out.println(compareVersion("13.6", "13.7"));
		
	}

	public static int compareVersion(String version1, String version2) {
		if(version1.equals(""))
			return 1;

		if(version2.equals(""))
			return -1;

		int a = Integer.parseInt(version1.split("\\.")[0]);
		int b = Integer.parseInt(version2.split("\\.")[0]);

		if(version2.indexOf('.') < 0 && version1.indexOf('.') < 0 && a == b)
			return 0;
		if(a > b){
			return 1;
		}
		if(a < b)
			return -1;
		else{
			if(version1.indexOf('.') < 0  ){
				return compareVersion("0", version2.substring(version2.indexOf('.')+1));
			}

			if(version2.indexOf('.') < 0  ){
				return compareVersion(version1.substring(version1.indexOf('.')+1), "0");
			}
			else
				return compareVersion(version1.substring(version1.indexOf('.')+1), version2.substring(version2.indexOf('.')+1));
		}
	}

}
