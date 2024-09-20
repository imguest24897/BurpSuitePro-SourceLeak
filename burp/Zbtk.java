package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public abstract class Zbtk extends Zbqc {
  final Zxwh ZX;
  
  private static Zbqc[] ZC;
  
  Zbtk(Zxwh paramZxwh) {
    this.ZX = paramZxwh;
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0 };
    setLayout(gridBagLayout);
  }
  
  void Z_(Component paramComponent, int paramInt1, int paramInt2, int paramInt3) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = paramInt1 * 2;
    gridBagConstraints.gridy = paramInt2 * 2;
    gridBagConstraints.gridwidth = paramInt3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.fill = 2;
    if (paramInt1 > 0 || paramInt3 > 1)
      gridBagConstraints.weightx = 1.0D; 
    add(paramComponent, gridBagConstraints);
  }
  
  public void ZB() throws Zsx7 {
    this.ZX.ZAI(null);
    this.ZX.ZWW(0);
    this.ZX.ZWA(0);
    this.ZX.ZAe(null);
    Zy();
  }
  
  abstract void Zy() throws Zsx7;
  
  public static void Zg(Zbqc[] paramArrayOfZbqc) {
    ZC = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zl() {
    return ZC;
  }
  
  static {
    if (Zl() != null)
      Zg(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */