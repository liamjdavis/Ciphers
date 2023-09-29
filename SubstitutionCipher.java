import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SubstitutionCipher extends Cipher{
    /**
     * The specialized constructor.
     *
     * @param key The key to be used for encryption/decryption operations.
     **/
    public SubstitutionCipher(long key) {
        super(key);
    }

    public List<Character> encrypt (List<Character> plainText) {
        List<Character> cipherText = new LinkedList<Character>();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        HashMap<Character, Character> key = new HashMap<Character, Character>();



        return cipherText;
    }
}
