public class Mommifier {

    String covert(String string) throws Exception {
        if (string == "" || string == null) {
            throw new IllegalArgumentException("invalid input");
        }
        double vowels_num = 0;

        StringBuilder text = new StringBuilder(string);
        System.out.println(text);

        char[] input = string.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u') {
                vowels_num++;
            }
        }


        if (vowels_num < 0.3 * string.length()) {
            return string;
        } else {
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] == input[i + 1]) {

                    return text.insert(i + 1, "mommy").toString();

                }
            }
            return string;
        }


    }
}
