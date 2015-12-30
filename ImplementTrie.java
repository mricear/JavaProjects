package ProjectFiles;

public class ImplementTrie {
	BUGGY CODE
	/**
	 * BUGGY CODE
	 * @param args
	 */
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("somestring");
		System.out.println(trie.search("key"));
		System.out.println(trie.startsWith("some"));
		System.out.println(trie.search("somestring"));
		System.out.println(trie.search("some"));
		System.out.println(trie.search("somestringg"));
		System.out.println(trie.search("st"));
	}
}

class TrieNode {
	TrieNode[] children;
	public TrieNode() {
		children = new TrieNode[26]; 
	}
}

class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	// Inserts a word into the trie.
	public void insert(String word) {	
		insertRec(word, root);
	}

	public void insertRec(String word, TrieNode node){
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			if(node.children == null){
				node.children = new TrieNode[26];
			}
			if(node.children[c - 'a'] != null){
				node = node.children[c - 'a'];
			}
			else{
				node.children[c - 'a'] = new TrieNode();
				node = node.children[c - 'a'];
			}
		}
	}

	// Returns if the word is in the trie.
	public boolean search(String word) {
		return searchRec(word, root);
	}

	public boolean searchRec(String word, TrieNode node){
		boolean found = false;
		int i = 0;
		for(; i < word.length(); i++){
			char c = word.charAt(i);
			if(node.children == null){
				break;
			}
			if(node.children[c - 'a'] != null){
				node = node.children[c - 'a'];
			}
			else{
				break;
			}
		}
		if( i == word.length()){
			found = true;
		}
		return found;
	}

	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {

		return startsWithRec(prefix, root);
	}

	public boolean startsWithRec(String prefix, TrieNode node){
		boolean found = false;
		int i = 0;
		for(; i < prefix.length(); i++){
			char c = prefix.charAt(i);
			if(root.children == null){
				break;
			}
			if(root.children[c - 'a'] != null){
				root = root.children[c - 'a'];
			}
			else{
				break;
			}
		}
		if( i == prefix.length()){
			found = true;
		}
		return found;
	}
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");