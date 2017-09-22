import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/***
 * 
 * 
 * 
 * HashDictionary subclass of WordStorage
 */
public abstract class HashDictionary extends WordStorage{
	private String wordList[]= getWordList();
	Hashtable words = new Hashtable();

	// Constructor calls parents constructor
	public HashDictionary(String filename) {
		super(filename);

	}

	//hashTable builder puts the word read from a file and stored in an array to a hashtable called words
	public void HashtableBuilder(){
		for (int i= 1; i <wordList.length; i++){
			words.put(wordList[i], new Integer(i));
		}
	}




	// contains method search using HashTable
	boolean contains(String lookUp) {
		HashtableBuilder();
		before = System.currentTimeMillis();
		if(words.containsKey(lookUp)){
			after = System.currentTimeMillis();
			avgTime = after - before;
			return true;
		}
		after = System.currentTimeMillis();
		return false;

	}
	double getAverageLookupTime(){
		return this.avgTime;
	}

}
