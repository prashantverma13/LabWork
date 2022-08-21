import java.util.StringTokenizer;

public class Ex5 {
	public int numOfChar(String str) {
		int len = str.length() ;
		return len ;
	}
	public int numOfLines(String str) {
		String lines[] = str.split("\n");
		return lines.length ;
	}
	
	public int numOfWords(String str) {
		String[] words = str.split(" ") ;
		return words.length ;
	}
	
	public static void main(String[] args) {
		Ex5 e5 = new Ex5() ;
		
		String str = "india australia japan china" ;
				
		System.out.println(e5.numOfChar(str)); 
				
		
		
		System.out.println(e5.numOfWords(str)); 
	}
}