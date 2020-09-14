import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
    //如果string为空，返回空
    //如果string不符合要求
    //如果string符合要求
    @Test
    void should_return_empty_string_when_convert_given_string_is_empty(){
        Mommifier mommifier =new Mommifier();
        String result = mommifier.convert("");
        assertEquals("", result);
    }

    @Test
    void should_return_initial_string_when_convert_given_number_of_vowels_not_more_than_30percent(){
        Mommifier mommifier =new Mommifier();
        String result = mommifier.convert("ahyphjkslxzmn");
        assertEquals("ahyphjkslxzmn", result);
    }

    @Test
    void should_return_string_insert_mommy_when_convert_given_number_of_vowels_more_than_30percent(){
        Mommifier mommifier =new Mommifier();
        String result = mommifier.convert("aebrispou");
        assertEquals("amommyebrispomommyu", result);
    }
}
