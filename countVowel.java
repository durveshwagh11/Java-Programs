public class countVowel
{
	public static void main(String[] args) {
		String input = "HELLOooolliii";
		int count = 0;
		
		for(char ch : input.toLowerCase().toCharArray()){
		    if("aeiou".indexOf(ch) != -1){
		        count++;
		    }
		}
		
		System.out.println(count);
	}
}