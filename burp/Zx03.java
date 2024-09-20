package burp;

import java.awt.Dimension;

class Zx03 extends Zx0x {
  final Zgo8 Zn;
  
  Zx03(Zgo8 paramZgo8) {}
  
  public Dimension getMaximumSize() {
    return new Dimension(getWidth(), 1);
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(0, (super.getPreferredSize()).height);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx03.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */