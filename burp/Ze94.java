package burp;

import javax.swing.ImageIcon;

class Ze94 extends Ze9x {
  private final Zxpj ZQ;
  
  private int Zs;
  
  private ImageIcon ZP;
  
  private boolean ZD;
  
  Ze94(Zxpj paramZxpj) {
    this.ZQ = paramZxpj;
    this.Zs = Zrt.ZC();
    this.ZD = Zmco.Zi();
  }
  
  ImageIcon ZL() {
    if (this.ZP == null || this.Zs != Zrt.ZC() || this.ZD != Zmco.Zi()) {
      this.Zs = Zrt.ZC();
      this.ZD = Zmco.Zi();
      this.ZP = this.ZQ.ZY(Zrbb.Zq(this.ZQ));
    } 
    return this.ZP;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze94.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */