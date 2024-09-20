package burp;

class Zrkh implements Zs0s {
  private final boolean Zg;
  
  private final int ZZ;
  
  Zrkh(Zg9c paramZg9c) {
    this.Zg = paramZg9c.Z_j();
    this.ZZ = paramZg9c.Z_E();
  }
  
  public boolean ZX(Zesy paramZesy) {
    byte b = (paramZesy.ZM == null) ? 0 : paramZesy.ZM.ZF();
    return ((this.Zg && !b) || b > this.ZZ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrkh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */