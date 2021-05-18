package hu.flowacademy;

import java.nio.file.LinkPermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	static String input = "";
    public static void main(String[] args) {
    	for(int i = 0; i < args.length; i++){
			//System.out.println(args[i]);
			input+=args[i];
		}

		System.out.println(characterConcordance("Hello World"));

	Stack<String> verem = new Stack(5);
	Stack<Integer> verem2 = new Stack<>(5);

	verem.push("maki");
	verem.push("maki2");
	verem.push("maki3");
	verem.push("maki4");
	verem.push("maki5");
	System.out.println(verem.pop());
	System.out.println(verem.peek());
	System.out.println(verem.pop());
	System.out.println(verem.pop());
	//System.out.println(verem.pop());
		
		hess();
	}
	//Write a program which creates a concordance of characters occurring in a string
// (i.e., which characters occur where in a string).
// Read the string from the command line.
//Running the program:
//>java Concordance Hello World
//{d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}

	public static void hess(){

		HashSet<Character> hs = new HashSet<>();

		for(int i = 0; i < input.length(); i++){
			hs.add(input.charAt(i));


		}
		System.out.println(hs);
	}
	private static Map<Character, Set<Integer>> characterConcordance(final String input) {

		Map<Character, Set<Integer>> concordance = new HashMap<Character, Set<Integer>>();

		for (int i = 0; i < input.length()-1; i++) {
			char charAt = input.charAt(i);
			if (charAt == ' ') {
				continue;
			}
			Set<Integer> set= concordance.get(charAt);
			if (set == null) {
				set= new HashSet<Integer>();
			}
			set.add(i);
			concordance.put(charAt, set);
		}

		return concordance;
	}

}
