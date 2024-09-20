package burp;

import javax.swing.JList;

public class Zrpl extends JList<String> {
  public Zrpl() {
    setFocusable(false);
    setCellRenderer(new Zedw());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrpl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */