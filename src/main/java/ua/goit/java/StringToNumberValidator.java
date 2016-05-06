package ua.goit.java;
import java.util.HashSet;
/**
 * Created by Администратор on 26.04.16.
 */
public class StringToNumberValidator {
    private  HashSet<Character> alphabet;

    public StringToNumberValidator()
    {
        alphabet = new HashSet<>();
        for(char i = 0 ; i < 46; ++i)
            alphabet.add(i);
        char i = 47;
        alphabet.add(i);
        for(char j = 58 ; j < 256; ++j)
            alphabet.add(j);

    }


    public boolean isValid(String string) {
        {
            for(int i = 0; i < string.length(); ++i)
                if(alphabet.contains(string.charAt(i)))
                    return false;
        }
        return true;

    }
}

