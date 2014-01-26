/**
 * Given a string "i work at zoosk" write a function to return a string where letters in each word is reversed. 
ex  for a input "i work at zoosk" result should be "i krow ta ksooz". 

In OO. 

StringReverse x = new StringReverse("i work at zoosk");
System.out.println(x.reverseWords());


Follow up. 
Given a string "i work at zoosk" convert to "zoosk at work i"
System.out.println(x.reverseWordsInSentence());

 * @author chandru
 *
 */


public class StringReverse {
	
	private char[] inputchararr;
	
	public StringReverse(String input){
		this.inputchararr = input.toCharArray();
	}

	public static void main(String[] args) {
		
		StringReverse sr = new StringReverse("I work at zoosk");
		sr.reversewords();
		sr.printString();
		
		//Followup. 
		StringReverse sr2 = new StringReverse("I work at zoosk");
		sr2.reversewordpos();
		sr2.printString();

	}

	private void reversewordpos() {
		if (this.inputchararr.length < 1){
			return;
		}
		reverse(0, this.inputchararr.length -1);
		reversewords();
	}

	private void printString() {
		System.out.println(new String(this.inputchararr));
	}

	private void reversewords() {
		if (this.inputchararr.length < 2){
			return;
		}
		
		int start =0;
		int end = 0;
		while(end < this.inputchararr.length - 1){
			while(this.inputchararr[start] == ' '){
				start++;
				end++;
			}
			
			while(end < this.inputchararr.length  && this.inputchararr[end] != ' ' ){
				end++;
			}
			
			reverse(start, end -1);
			start = end;
		}
		
		
	}
	
	private void reverse(int start, int end){
		while(start<end){
			char temp = this.inputchararr[start];
			this.inputchararr[start] = this.inputchararr[end];
			this.inputchararr[end] = temp;
			start++;
			end--;
		}
	}
	
	

}
