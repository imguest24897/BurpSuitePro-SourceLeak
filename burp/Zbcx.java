package burp;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.AbstractButton;
import javax.swing.Box;

class Zbcx extends Zbqc {
  private final Box.Filler ZG = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
  
  private Zbcx(Zm99 paramZm99) {
    setLayout(new GridBagLayout());
    setAlignmentY(0.5F);
    setOpaque(false);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    add(paramZm99, gridBagConstraints);
    ZQ();
  }
  
  private void ZK(Zl2d paramZl2d) {
    boolean bool = Zm99.ZM();
    if ((getComponents()).length > 2)
      ZT(); 
    for (AbstractButton abstractButton : paramZl2d.ZN) {
      GridBagConstraints gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = (getComponents()).length;
      gridBagConstraints.gridy = 0;
      gridBagConstraints.anchor = 21;
      gridBagConstraints.insets = Zbc6.Zr;
      add(abstractButton, gridBagConstraints);
      if (!bool)
        break; 
    } 
    ZQ();
  }
  
  private void ZQ() {
    remove(this.ZG);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = (getComponents()).length;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZG, gridBagConstraints);
  }
  
  private void ZT() {
    Zem9 zem9 = new Zem9(1);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = (getComponents()).length;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 1;
    gridBagConstraints.insets = Zbc6.ZD;
    add(zem9, gridBagConstraints);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */