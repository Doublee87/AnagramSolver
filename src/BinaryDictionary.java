
/***
 * 
 * 
 * BinaryDictionary subclass of WordStorage
 */

public abstract class BinaryDictionary extends WordStorage  {
	//private double avgTime=0;
	//private double before,after;
	//private ArrayList<String> wordList;
	//String matchingWord;

	// Constructor calls parents constructor
	public BinaryDictionary(String filename) {
		super(filename);

	}
	// contains method search using Binary 
	boolean contains(String lookUp) {
		int start = 0; 
		int end = wordList.length-1;
		wordList = getWordList();

		before = System.currentTimeMillis();
		while (end>=start){
			int mid = (start + end)/2;

			if (wordList[mid]==lookUp){
				after = System.currentTimeMillis();
				avgTime = after - before;
				return true;

			}if (wordList[mid].compareTo(lookUp) < 0){
				start = mid +1;

			}if (wordList[mid].compareTo(lookUp) > 0){
				end = mid -1;

			}
		}
		return false;

	}
	double getAverageLookupTime(){
		return this.avgTime;
	}


}
