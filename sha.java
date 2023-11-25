import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sha {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest sha=MessageDigest.getInstance("SHA-1");
        System.out.println("alg"+sha.getAlgorithm());
        System.out.println("prov"+sha.getProvider());
        System.out.println(sha.toString());

        String input="";
        sha.update(input.getBytes());
        byte op[]=sha.digest();
        System.out.println(bytes(op));

    }

    static String bytes(byte[] b){
        char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        StringBuffer buf = new StringBuffer();
        for (byte aB : b) {
            buf.append(hexDigit[(aB >> 4) & 0x0f]);
            buf.append(hexDigit[aB & 0x0f]);
        }
        return buf.toString();    }
}
