

public class HashTable {
	private LinkedList2[] hashArray;
	private static final int SIZE = 10;

	public HashTable() {
		// (1) create a linked list array hashArray
		// with size of SIZE(10)
		hashArray = new LinkedList2[SIZE];
		// hashArray = ?;

		// (2) initialized the hashArray with 10 empty linked lists
		for (int i = 0; i < SIZE; i++) {
			hashArray[i] = new LinkedList2();
		}
	}

	private int computeHash(String s) {
		int hash = 0;

		// calculate hash

		for (int i = 0; i < s.length(); i++) {
			hash += s.charAt(i);

		}

		return hash % SIZE;
	}

	public boolean containsString(String target) {
		int hash = computeHash(target);
		LinkedList2 list = hashArray[hash];
		if (list.contains(target))
			return true;
		return false;
	}

	public void put(String s) {
		// (1) Get hash values

		int hashValues = computeHash(s);

		// (2) Get the list corresponding to the hash value
		// of the hashArray
		// LinkedList2 list = hashArray[hashValues];

		// (3) add the String s to the start of the list
		hashArray[hashValues].addToStart(s);
	}

	//method to remove punctuation
	public String removePunct(String s) {

		 //regular expression
		 String strippedInput = s.replaceAll("[^a-zA-Z ]", " ");

		//String strippedInput = s.replaceAll("\\p{P}", "");
		return strippedInput;
	}

	//method to check the words in word list
	public void checkWord(String s, int line) {

		String data = removePunct(s);

		boolean result = containsString(data.trim());

		if (result == true) {

		} else {
			System.out.println("'" + data + "'" + " may be misspelled on line" + line);
		}
	}
}