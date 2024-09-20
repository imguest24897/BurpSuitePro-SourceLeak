package burp;

import java.awt.Dimension;

class Zex7 extends Zexh {
  private static final Zlkk Zd = Zlkk.RESOURCE_PRESSURE_BAR_NORMAL;
  
  Zex7() {
    setPreferredSize(new Dimension(70, (int)(Zrt.Zx() / 2.0F)));
    Zx(Zlkk.RESOURCE_PRESSURE_BAR_BACKGROUND);
  }
  
  public void setValue(int paramInt) {
    ZX(Zq(paramInt));
    super.setValue(paramInt);
  }
  
  private Zlkk Zq(int paramInt) {
    return (paramInt >= 85) ? Zlkk.SEVERITY_HIGH : ((paramInt >= 75) ? Zlkk.SEVERITY_MEDIUM : Zd);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zex7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */