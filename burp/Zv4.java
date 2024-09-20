package burp;

import java.awt.Component;
import javax.swing.BorderFactory;

public class Zv4 implements Zsyw {
  public Component ZN(Zbcp paramZbcp, Ze2_ paramZe2_, int paramInt) {
    Object object = paramZe2_.Zk();
    if (object == null)
      return new Zm99(); 
    Zl86 zl86 = new Zl86();
    zl86.setBorder(BorderFactory.createEmptyBorder());
    zl86.setOpaque(false);
    zl86.setEditable(false);
    zl86.setCaret(new Zmjt());
    zl86.setLineWrap(true);
    zl86.setWrapStyleWord(true);
    zl86.setText(String.valueOf(object));
    return zl86;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */