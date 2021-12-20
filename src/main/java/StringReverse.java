public class StringReverse {

    public String reverseAlphabeticCharsOnly(String str) {
        requiredNonNull(str);

        String resultStrings = "";
        String[] splitWords = str.split(" ");
        for (String words : splitWords) {
            resultStrings = resultStrings + reversesWord(words) + " ";
        }
        return resultStrings.trim();
    }

    public String reversesWord(String word) {
        requiredNonNull(word);

        String alphabetic = word.replaceAll("[\\W\\d+]", "");
        StringBuilder result = new StringBuilder(alphabetic);
        result.reverse();

        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {

                result.insert(i, word.charAt(i));
            }
        }
        return result.toString();
    }

    private void requiredNonNull(String initialWord) {
        if (initialWord == null) {
            throw new IllegalArgumentException("Non null input string required!");
        }
    }
}
