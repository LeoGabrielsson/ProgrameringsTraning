import javax.swing.*;

public class String2 {
    public static void main(String[] args) {
        String noupper = JOptionPane.showInputDialog("Skriv annars hemsök");
        String upper = Camel(noupper);
        System.out.println(upper);
    }

    public static String Camel(String noupper) {
        String c = "";
        for (int l = 0; l < noupper.length(); l++) {
            char k = noupper.charAt(l);
            if (k == ' ') {
                noupper.toUpperCase(k.charAt(l+1));
                c += k;
            } else {
                c += k;
            }
        }
    }
}
