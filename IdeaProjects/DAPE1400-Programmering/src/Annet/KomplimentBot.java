package Annet;
import javax.swing.JOptionPane;

public class KomplimentBot {
    public static void main(String[] args) {
        String følelse = "trist";
        String[] kompliment = {"Du er fantastisk!", "Du er dritt morsom", "Du har et fint smilt", "U 8 gurl"};
        String checkinFølelse = "Føler du deg fortsatt trist? (ja/nei)";
        String fullførtMelding = "Så flott at du føler deg bedre!";

           for (String i : kompliment) {
               if (følelse.equals("trist")) {
                   JOptionPane.showMessageDialog(null, i);

                   String svar = JOptionPane.showInputDialog(null, checkinFølelse);

                   if (svar.equals("nei")) {
                       følelse = "glad";
                       JOptionPane.showMessageDialog(null, fullførtMelding);
               }
               }
        }
    }
}