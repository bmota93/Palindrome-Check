import java.util.*;


public class Palindromequeue {

public static Queue<Character> palqueue;
	
	public static void queueadd(String inputadd) //method used to add to queue
	{
		palqueue = new LinkedList<Character>(); //a linked queue is created
		
		for (int place = 0; place < inputadd.length(); place++) //characters are add to queue depending on the string length
		{
			char letter = inputadd.charAt(place) ;
			{
				if (Character.isLetter(letter))
				{
					palqueue.add(letter);
				}						
			}
		}

	}

}
