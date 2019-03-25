import java.util.Arrays;

public class Dictionary {
    private String[][] dictionary;
    private int maxWords;

    public Dictionary(int maxWords) {
        this.maxWords = maxWords;
        this.dictionary = new String[3*maxWords/2][2];
    }

    public boolean addWord(String czWord, String engWord) {
        int hash = this.getHash(czWord);
        return add(hash,czWord,engWord);

    }
    private boolean add(int hash, String czWord, String engWord) {
        if(hash < this.maxWords) {
            if (this.dictionary[hash][0] == null ) {
                this.dictionary[hash][0] = czWord;
                this.dictionary[hash][1] = engWord;
                return true;
            }else{
                if (this.dictionary[hash][0] == czWord ) {
                    return true;
                }else{
                    add(hash + 1, czWord, engWord);
                }
            }
        }else{
            String[][] newdictionary = new String[this.dictionary.length*2][2];;
            for(int i = 0; i < this.dictionary.length; i++){
                newdictionary[i][0]=this.dictionary[i][0];
                newdictionary[i][1]=this.dictionary[i][1];
            }
            this.dictionary = newdictionary;
            this.maxWords = this.dictionary.length;
            add(hash + 1,czWord,engWord);
        }
        return false;
    }

    public String translateWord(String czWord) {
        int hash = this.getHash(czWord);
        return  find(hash,czWord);
    }

    private String find(int hash, String czWord) {
        if (hash >= this.maxWords) {
            return null;
        }else{
            if(this.dictionary[hash][0] == czWord) {
                return this.dictionary[hash][1];
            }else{
                return find(hash + 1, czWord);
            }
        }
    }

    private int getHash(String word) {
        int maxHash = this.dictionary.length;
        int hash = 0;
        for (char i : word.toCharArray()){
            hash += Character.getNumericValue(i)% 123423442;
        }
        return hash%maxHash;
    }

    public String toString() {
        String output = "Dictionary {";
        for(int i = 0; i < this.dictionary.length; i++){
            output += "\n";
            output += i + " -> ";
            output += this.dictionary[i][0];
            output += " -> ";
            output += this.dictionary[i][1];
        }
        output += "\n}";
        return output;
    }

}
