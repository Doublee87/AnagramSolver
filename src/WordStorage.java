import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.Scanner;

/****
 * 
 * This is the parent class of my dictionary subclasses 
 * 
 *
 * @author Ameen Almiftah
 *
 */
public abstract class WordStorage extends Dictionary {
	public double avgTime=0;
	public double before,after;
	public String wordList[];
	public String matchingWord;
	int i=0; 

	//The constructor reads strings from a txt tile.
	public WordStorage(String filename) {

		Scanner word = null;
		try {
			word = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		while (word.hasNext()){
			wordList[i++]= word.next();
		}
	}
	// getter for an array of all the words read from the txt file
	public String[] getWordList(){
		return this.wordList;

	}

	abstract double getAverageLookupTime();

	abstract boolean contains(String lookUp);
}