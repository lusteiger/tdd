public class Mommifier {

    String covert(String string) throws Exception {
        if (string == "" || string == null) {
            throw new IllegalArgumentException("invalid input");
        }
        double vowels_num = 0;
        char[] input = string.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u') {
                vowels_num++;
            }
        }


        if (vowels_num < 0.3 * string.length()) {
            return string;
        }


        return null;
    }
}
