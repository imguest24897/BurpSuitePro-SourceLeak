package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JSeparator;

public class Zby_ extends Zbqc {
  private JSeparator Za;
  
  public Zby_(Zrx6 paramZrx61, Zrx6 paramZrx62) {
    ZP();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.fill = 2;
    add(paramZrx61.Zz(), gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.fill = 1;
    add(paramZrx62.Zz(), gridBagConstraints);
  }
  
  private void ZP() {
    this.Za = new JSeparator();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 30, 10));
    setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(15, 0, 20, 0);
    add(this.Za, gridBagConstraints);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zby_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */