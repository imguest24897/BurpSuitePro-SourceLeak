package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Zb7u extends Zbqc {
  private final GridBagLayout ZX = new GridBagLayout();
  
  Zb7u() {
    this.ZX.columnWidths = new int[] { 0, 20, 0 };
    this.ZX.rowHeights = new int[0];
    setLayout(this.ZX);
  }
  
  void ZI(Zsso... paramVarArgs) {
    int j = this.ZX.rowHeights.length;
    int k = j + paramVarArgs.length * 2;
    int i = Zsso.ZkH();
    int[] arrayOfInt = new int[k];
    double[] arrayOfDouble = new double[k];
    byte b1 = 0;
    while (b1 < k) {
      arrayOfInt[b1] = (b1 % 2 == 0) ? 0 : 10;
      arrayOfDouble[b1] = (b1 == k - 1) ? 1.0D : 0.0D;
      b1++;
      if (i != 0)
        break; 
    } 
    this.ZX.rowHeights = arrayOfInt;
    this.ZX.rowWeights = arrayOfDouble;
    Zsso[] arrayOfZsso = paramVarArgs;
    int m = arrayOfZsso.length;
    byte b2 = 0;
    while (b2 < m) {
      Zsso zsso = arrayOfZsso[b2];
      GridBagConstraints gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = j;
      gridBagConstraints.anchor = 23;
      Zm99 zm99 = new Zm99(zsso.ZkM());
      zm99.ZE(Zt00.BOLD_FONT);
      add(zm99, gridBagConstraints);
      gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 2;
      gridBagConstraints.gridy = j;
      gridBagConstraints.weightx = 1.0D;
      gridBagConstraints.anchor = 23;
      gridBagConstraints.fill = 1;
      add(zsso.Zk3(), gridBagConstraints);
      j += 2;
      b2++;
      if (i != 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb7u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */