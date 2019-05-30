import java.util.* ;

public class Palindromestack {

public static Stack<Character> palstack;	
	
	public static void stackpush(String inputpush) //method used only to add to stack
	{
		palstack = new Stack<Character>(); //stack is created
		
		for (int place = 0; place < inputpush.length(); place++) //string length determines the number of elements added
		{
			char letter = inputpush.charAt(place) ;
			{
				if (Character.isLetter(letter))
				{
					palstack.push(letter);
				}						
			}
		}
	}

}
