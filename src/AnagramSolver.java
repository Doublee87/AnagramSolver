import java.util.*;

/***
 * 
 * Anagram Solver uses recursion to find permutation
 * 
 * @author Ameen Almiftah
 *
 */
public class AnagramSolver {
	private String solution;
	private Dictionary myDic;

	public AnagramSolver(Dictionary dictionary){
		myDic = dictionary;
		if (myDic instanceof LinearDictionary){
			myDic = (LinearDictionary)myDic;
		}
		if (myDic instanceof BinaryDictionary){
			myDic = (LinearDictionary)myDic;
		}
		if (myDic instanceof HashDictionary){
			myDic = (LinearDictionary)myDic;
		}
		/*I stopped here. the very last step of the program. need to get dictionary 
		 * and use it to lookup the string returned from permutationFinder within.
		 * 
		for (int i = 0; i<myDic.size(); i++){
			String lookUp = myDic.get(i);
			((LinearDictionary) myDic).contains(lookUp);
		}
		 */

	}
	public String Solve(String word){
		String solvedString="";
		return solvedString;
	}

	public String permutationFinder(String start, String word) {
		if (start.length() <= 1){
			solution = start + word;
			return solution;
		}else{
			for (int i = 0; i < word.length(); i++) {
				try {
					String newString = word.substring(0, i) + word.substring(i + 1);
					permutationFinder(start + word.charAt(i), newString);
				} catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
			}
		}return null;
	}
}
