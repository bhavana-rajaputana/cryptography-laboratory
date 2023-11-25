import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class DES {
    public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        System.out.println("Message Encryption Using DES Algorithm\n ");
        KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
        SecretKey myDesKey = keygenerator.generateKey();
        Cipher desCipher;

        byte[] text ="Secret Information ".getBytes();
        System.out.println("Message [Byte Format] : " + text);
        System.out.println("Message : " + new String(text));

        desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

        desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
        byte[] textEncrypted = desCipher.doFinal(text);
        System.out.println("Encrypted Message: " + textEncrypted);

        desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
        byte[] textDecrypted = desCipher.doFinal(textEncrypted);
        System.out.println("Decrypted Message: " + new String(textDecrypted));

    }
}
