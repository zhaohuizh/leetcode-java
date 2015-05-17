public class Trie {
  public class TrieNode {
    boolean isLast;
    TrieNode[] children;
    // Initialize your data structure here.
    public TrieNode() {
      isLast = false;
      children = new TrieNode[26];
    }
  }

  private TrieNode root;

  public Trie() {
      root = new TrieNode();
  }

  // Inserts a word into the trie.
  public void insert(String word) {
    TrieNode curr = root;
    for(int i = 0; i < word.length(); i++){
      int idx = word.charAt(i) - 'a';
      if(curr.children[idx] == null){
        curr.children[idx] = new TrieNode();
      }
      curr = curr.children[idx];
    }
    curr.isLast = true; 
  }

  // Returns if the word is in the trie.
  public boolean search(String word) {
    TrieNode curr = root;
    for(int i = 0; i < word.length(); i++){
      int idx = word.charAt(i) - 'a';
      if(curr.children[idx] == null){
        return false;
      }
      curr = curr.children[idx];
    }
      return curr.isLast;
  }

  // Returns if there is any word in the trie
  // that starts with the given prefix.
  public boolean startsWith(String prefix) {
    TrieNode curr = root;
    for(int i = 0; i < prefix.length(); i++){
      int idx = prefix.charAt(i) - 'a';
      if(curr.children[idx] == null){
        return false;
      }
      curr = curr.children[idx];
    }
    return true;
  }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
