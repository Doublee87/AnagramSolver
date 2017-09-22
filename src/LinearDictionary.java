
/***
 * LinearDictionary subclass of WordStorage 
 * 
 */

public abstract class LinearDictionary extends WordStorage {
	//private double avgTime=0;
	//private double before,after;
	//private ArrayList<String> wordList;
	//String matchingWord;

	// Constructor calls parents constructor
	public LinearDictionary(String filename) {
		super(filename);
	}


	// contains method search linearly  
	boolean contains(String lookUp) {


		wordList = getWordList();

		before = System.currentTimeMillis();
		for (int i=0; i<wordList.length-1;i++){

			if(wordList[i]== lookUp){
				after = System.currentTimeMillis();
				avgTime = after - before;
				return true;
			}
		}
		return false;

	}
	double getAverageLookupTime(){
		return this.avgTime;
	}


}
