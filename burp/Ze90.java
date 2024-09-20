package burp;

import javax.swing.ImageIcon;

class Ze90 extends Ze9x {
  private final Zxpj Zd;
  
  private int Za;
  
  private ImageIcon Zc;
  
  Ze90(Zxpj paramZxpj) {
    this.Zd = paramZxpj;
    this.Za = Zrt.ZC();
  }
  
  ImageIcon ZL() {
    if (this.Zc == null || this.Za != Zrt.ZC()) {
      this.Za = Zrt.ZC();
      this.Zc = this.Zd.ZY(Zrbb.Zq(this.Zd));
    } 
    return this.Zc;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze90.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */