public class caesar {

    public static void main(String[] args) throws java.lang.Exception {
        String msg = "ANNA";
        System.out.println("Simulating Caesar Cipher\n ");
        System.out.println("Input : " + msg);
        System.out.printf("Encrypted Message : ");
        int offset = 3;

        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        StringBuilder encoded2 = new StringBuilder();

        for(char i : msg.toCharArray()) {
            encoded.append((char) ('A' + (i - 'A' + offset) % 26));
        }

        offset=26-offset;
        String txt=encoded.toString();
        for(char i : txt.toCharArray()) {
            encoded2.append((char) ('A' + (i - 'A' + offset) % 26));
        }
        System.out.println(encoded.toString());

        System.out.println(encoded2.toString());

    }
}
