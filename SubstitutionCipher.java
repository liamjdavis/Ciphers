import java.util.*;
import java.util.stream.IntStream;

public class SubstitutionCipher extends Cipher{
    /**
     * The specialized constructor.
     *
     * @param key The key to be used for encryption/decryption operations.
     **/

    Random rand = new Random();
    public SubstitutionCipher(long key) {
        super(key);
        this.rand = new Random(key);
    }

    public List<Character> encrypt (List<Character> plainText) {
        List<Character> cipherText = new LinkedList<Character>();

        for (char plainChar : plainText) {
            char cipherChar = (char)((plainChar + this.rand.nextInt()) % 256);
            cipherText.add(cipherChar);
        }

        return cipherText;
    }

    public List<Character> decrypt(List<Character> cipherText) {
        List<Character> plainText = new LinkedList<Character>();

        for (char cipherChar : cipherText) {
            char plainChar = (char)((cipherChar - this.rand.nextInt()) % 256);
            plainText.add(plainChar);
        }

        return plainText;
    }
}
