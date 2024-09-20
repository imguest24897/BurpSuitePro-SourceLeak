package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Zb7v extends Zbqc {
  public Zb7v(Component paramComponent1, Component paramComponent2) {
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 30, 0 };
    setLayout(gridBagLayout);
    setBorder(new Zr6s(new Insets(20, 20, 20, 20), 6));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.fill = 2;
    add(paramComponent1, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    int i = Zsso.ZkH();
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.fill = 2;
    add(paramComponent2, gridBagConstraints);
    if (i != 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb7v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */