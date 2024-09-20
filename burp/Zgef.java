package burp;

import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

public abstract class Zgef extends JPanel {
  protected Zgef(String paramString1, String paramString2, ActionListener paramActionListener) {
    this(ZU(paramString1), paramString2, paramActionListener);
  }
  
  protected Zgef(JComponent paramJComponent, String paramString, ActionListener paramActionListener) {
    Zzdy zzdy = new Zzdy();
    zzdy.setText(paramString);
    zzdy.addActionListener(paramActionListener);
    GroupLayout groupLayout = new GroupLayout(this);
    setLayout(groupLayout);
    groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(zzdy, -1, -1, 32767).addGap(14, 14, 14)).addGroup(groupLayout.createSequentialGroup().addGap(15, 15, 15).addComponent(paramJComponent, -2, 385, -2).addContainerGap(-1, 32767)));
    groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addComponent(paramJComponent, -2, 78, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, 32767).addComponent(zzdy).addContainerGap()));
  }
  
  private static Zl8w ZU(String paramString) {
    Zl8w zl8w = new Zl8w();
    zl8w.setEditable(false);
    zl8w.setLineWrap(true);
    zl8w.setDragEnabled(false);
    zl8w.setText(paramString);
    return zl8w;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgef.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */