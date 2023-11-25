public class testt {
    public static void main(String[] args) {
      String msg="Helloworld";int depth=2;int r=depth;
        int l = msg.length();
        int c = l / depth;
        int k = 0;
        char mat[][] = new char[r][c];
        String enc = "";
        for (int i = 0; i < c; i++) { for (int
                                           j = 0; j < r; j++) {
            if (k != l) {
                mat[j][i] = msg.charAt(k++);
            } else {
                mat[j][i] = 'X';
            }
        }
        }
        for (int i = 0; i < r; i++) { for (int j
                                           = 0; j < c; j++) {
            enc += mat[i][j];
        }
        }
        System.out.println(enc);
    }
}
