import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class AES {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchPaddingException {
        String secretKeys = "annaUniversity";
        String originalString = "www.annauniv.edu";
        System.out.println("Original URL : " + originalString);

        byte[] key = secretKeys.getBytes();

        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        key = sha.digest(key);
        key = Arrays.copyOf(key, 16);
        SecretKeySpec secretKey= new SecretKeySpec(key,"AES");;

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        String encrypted=Base64.getEncoder().encodeToString(cipher.doFinal(originalString.getBytes("UTF-8")));
        System.out.println("Encrypted URL : " +encrypted);

        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        System.out.println("Decrypted URL :" + new String(cipher.doFinal(Base64.getDecoder().decode(encrypted))));

    }
}

