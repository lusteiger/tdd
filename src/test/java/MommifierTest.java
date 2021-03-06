import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    void should_return_exception_when_input_empty_string() {
        Mommifier mommifier = new Mommifier();
        String input = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> mommifier.covert(input));
    }

    @Test
    void should_return_itself_when_input_none_vowel() throws Exception {
        Mommifier mommifier = new Mommifier();
        String input = "qwsdfg";
        String result = mommifier.covert(input);
        assertEquals(result,input);
    }

    @Test
    void should_return_itself_when_input_vowel_less_then_30percent()throws Exception{
        Mommifier mommifier = new Mommifier();
        String input = "world";
        String result = mommifier.covert(input);
        assertEquals(result,input);
    }

    @Test
    void should_return_itself_when_input_vowel_more_then_30percent_but_uncontinuous() throws Exception{
        Mommifier mommifier = new Mommifier();
        String input = "money";
        String result = mommifier.covert(input);
        assertEquals(result,input);
    }

    @Test
    void should_return_itself_when_input_vowel_more_then_30percent_but_continuous() throws Exception{
        Mommifier mommifier = new Mommifier();
        String input = "moneey";
        String result = mommifier.covert(input);
        String expected = "monemommyey";
        assertEquals(result,expected);
    }

}
