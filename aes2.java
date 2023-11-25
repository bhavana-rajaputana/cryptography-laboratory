import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class aes2 {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException {
        String original="Annauniv.com";
        String keyl="annauniv";
        byte[] key=keyl.getBytes("UTF-8");
        MessageDigest sha= MessageDigest.getInstance("SHA-1");
        key=sha.digest();
        SecretKeySpec secretKey= new SecretKeySpec(key,"AES");;

        key= Arrays.copyOf(key,16);
        Cipher cipher=Cipher.getInstance("AES");
      //  cipher.init(Cipher.ENCRYPT_MODE,secretKey);


    }
}
