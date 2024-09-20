package burp;

import java.awt.Component;
import javax.swing.JOptionPane;

class Zxn1 implements Runnable {
  private final Component ZO;
  
  private final int Zj;
  
  private final String ZN;
  
  private final String ZE;
  
  private final String Zf;
  
  String ZP;
  
  Zxn1(Component paramComponent, int paramInt, String paramString1, String paramString2, String paramString3) {
    this.ZO = paramComponent;
    this.Zj = paramInt;
    this.ZE = paramString2;
    this.ZN = paramString1;
    this.Zf = paramString3;
    this.ZP = paramString3;
  }
  
  public void run() {
    this.ZP = (String)JOptionPane.showInputDialog(this.ZO, this.ZE, this.ZN, this.Zj, null, null, this.Zf);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxn1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */