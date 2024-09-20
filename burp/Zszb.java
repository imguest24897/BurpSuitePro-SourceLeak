package burp;

class Zszb implements Zs0s {
  private final int ZA;
  
  private final boolean Zl;
  
  Zszb(Zg9c paramZg9c) {
    this.ZA = paramZg9c.Z_l();
    this.Zl = (this.ZA == -1);
  }
  
  public boolean ZX(Zesy paramZesy) {
    return !Zy(paramZesy.Zw);
  }
  
  private boolean Zy(int paramInt) {
    return (this.Zl || paramInt == this.ZA);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zszb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */