package Tries_and_Huffman_Coding;

public class TrieUse {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.add("this");
		t.add("news");
		t.add(null);
		System.out.println(t.search("news"));
		t.remove("news");
		System.out.println(t.search("news"));
		 
	}

}
