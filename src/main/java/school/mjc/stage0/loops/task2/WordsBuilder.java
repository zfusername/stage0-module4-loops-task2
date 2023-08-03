package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int length = chars.length;
        StringBuilder phrase = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            phrase.append(chars[i]);
        }
        System.out.println(phrase.toString());
    }
}
