package burp;

import java.awt.Component;

public class Zz5_ {
  private final Component Zh;
  
  private final Component Zo;
  
  private Component ZR;
  
  private Zeyc ZD = Zeyc.SOUTH;
  
  private int Zf = 0;
  
  private Ze9n ZC;
  
  private Zsnk ZM;
  
  public Zz5_(Component paramComponent1, Component paramComponent2) {
    this.Zh = paramComponent1;
    this.Zo = paramComponent2;
    this.ZR = paramComponent1;
  }
  
  public Zz5_ ZZ(Zeyc paramZeyc) {
    this.ZD = paramZeyc;
    return this;
  }
  
  public Zz5_ Zn(int paramInt) {
    this.Zf = paramInt;
    return this;
  }
  
  public Zz5_ Zs(Ze9n paramZe9n) {
    this.ZC = paramZe9n;
    this.ZM = Zsnk.LEFT;
    return this;
  }
  
  public Zz5_ ZB(Ze9n paramZe9n) {
    this.ZC = paramZe9n;
    this.ZM = Zsnk.RIGHT;
    return this;
  }
  
  public Zbcv ZT() {
    return new Zbcv(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz5_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */