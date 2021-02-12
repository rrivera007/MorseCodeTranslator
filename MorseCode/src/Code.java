import java.util.*;
import java.io.*;
public class Code {

	public static void main(String[] args) throws IOException 
	{
		boolean runtime = true;
		
		while (runtime)
		{
		
		String translate = "";
		String input = GiveMeCode();
		String [] s = input.split("");
		output(input, translate);
		runtime = run(runtime);
		
		}
		
		System.out.println("Translation complete");
		
	}
	
	
	public static boolean run(boolean run)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Run again? Y or N");
		String YorN = in.nextLine();
		if (YorN.charAt(0) == 'Y' || YorN.charAt(0) == 'y')
			return run;
		else
		{
			run = false;
			return run;
		}
		
	}
	
	public static String GiveMeCode()
	{
		Scanner in = new Scanner(System.in);
		String user;
		System.out.print("Welcome to the Morse code program");
		System.out.println("\n___________________________________\n");
		System.out.println("Please enter dashes '-' and dots '.' for your morse code and we will translate it");
		System.out.println("NOTE: do not add any spaces as it will not be properly translated");
		System.out.println("enter morse code");
		user = in.nextLine();
		return user;
		
	}
	
	
	public static void output(String user, String code)
	
	
	{
		
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
				"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "0"};
		
		String[] morseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
				"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
				"-.--", "--..", ".----", "..---", "...--", "....-", ".....",
				"-....", "--...", "---..", "----.", "-----"};
	
		
		
		
		if (user.equals(""))
		{
			System.out.println(code);
			return;	
		}
		
		
		for (int k = 0; k<user.length(); k++)
		{
			String alpha = "";
			String morse = user.substring(0, k+1);
				
				for (int i = 0; i < 36; i++)
				{
					if (morseCodes[i].equals(morse))
						alpha = alphabet[i];
			
				}
		
				if (alpha.equals(""))
					return;
		
		
			output(user.substring(k+1, user.length()), code + alpha);
		}
		
			 
		
		

	}
	
	
	

}