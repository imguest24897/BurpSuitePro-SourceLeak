package com.fasterxml.Zc;

public class Zw extends Zn<Zo> {
  private static final long serialVersionUID = 1L;
  
  protected static final Zw Zh = new Zw(-1);
  
  protected Zw(int paramInt) {
    super(paramInt);
  }
  
  public static Zw ZS() {
    return new Zw(1);
  }
  
  public Zo Zv() {
    return new Zo();
  }
  
  protected Object readResolve() {
    return ZA(Zh).orElseGet(Zw::lambda$readResolve$0);
  }
  
  private static Zx lambda$readResolve$0() {
    return ZS();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */