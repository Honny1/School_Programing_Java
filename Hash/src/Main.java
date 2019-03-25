public class Main {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary(7);

        dict.addWord("liška", "fox");
        dict.addWord("had", "snake");
        dict.addWord("pes", "dog");
        dict.addWord("slunce", "sun");
        dict.addWord("dívka", "girl");
        dict.addWord("kluk", "boy");
        dict.addWord("měsíc", "moon");
        dict.addWord("slon", "elephant");
        dict.addWord("motýl", "butterfly");
        dict.addWord("kapr", "carp");
        dict.addWord("medvěd", "bear");
        dict.addWord("liška", "fox");
        dict.addWord("ptáček", "bird");
        dict.addWord("kočka", "cat");

        System.out.println(dict.toString());

        System.out.println("had -> " + dict.translateWord("had"));
        System.out.println("pes -> " + dict.translateWord("pes"));
        System.out.println("dívka -> " + dict.translateWord("dívka"));
        System.out.println("kluk -> " + dict.translateWord("kluk"));
        System.out.println("slunce -> " + dict.translateWord("slunce"));
        System.out.println("kočka -> " + dict.translateWord("kočka"));
        System.out.println("auto -> " + dict.translateWord("auto"));
    }
}
