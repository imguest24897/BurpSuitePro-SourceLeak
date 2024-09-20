package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import net.portswigger.Zqe;

public class Zbke extends Zbqc {
  private final Zm99 Zk = new Zm99();
  
  private final Zm99 ZA = new Zm99();
  
  private final Zm99 Zo = new Zm99();
  
  public void ZR(Ze1c paramZe1c, Zqe paramZqe) {
    Ze9n ze9n = Ze3m.ZC(paramZe1c.ZL(), Zlkk.BAPP_PERFORMANCE_ICON).ZU(Zmcx.LINE_SIZE).Z_();
    this.Zk.setText(paramZe1c.Zr());
    this.ZA.setIcon(ze9n);
    this.Zo.setText(paramZqe.uiLabel);
    GridBagLayout gridBagLayout = new GridBagLayout();
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 17;
    add(this.Zk, gridBagConstraints);
    gridBagConstraints.insets = new Insets(5, 0, 0, 6);
    gridBagConstraints.gridwidth = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = 15;
    add(this.ZA, gridBagConstraints);
    gridBagConstraints.insets = new Insets(0, 0, 0, 0);
    gridBagConstraints.gridx = 1;
    add(this.Zo, gridBagConstraints);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbke.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */