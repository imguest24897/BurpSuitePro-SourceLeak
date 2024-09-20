package burp;

import java.awt.Dimension;

class Ze02 extends Ze01 {
  private final int ZS;
  
  private Ze02(String paramString, int paramInt) {
    super(paramString);
    this.ZS = paramInt;
  }
  
  public Dimension getMinimumSize() {
    return Zxt1.Zo(super.getMinimumSize(), this.ZS);
  }
  
  public Dimension getPreferredSize() {
    return Zxt1.Zo(super.getPreferredSize(), this.ZS);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze02.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */