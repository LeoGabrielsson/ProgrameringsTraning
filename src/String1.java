import javax.swing.*;

public class String1 {
    public static void main(String[] args) {
        StringBuilder pre = new StringBuilder(JOptionPane.showInputDialog("Skriv text för att vända"));

        StringBuilder post = pre.reverse();

        System.out.println(post.toString());
    }
}