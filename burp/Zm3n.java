package burp;

class Zm3n {
  private static final Zm3n ZA = new Zm3n(null, false);
  
  private final Zx_5 ZI;
  
  private final boolean Zk;
  
  private Zm3n(Zx_5 paramZx_5, boolean paramBoolean) {
    this.ZI = paramZx_5;
    this.Zk = paramBoolean;
  }
  
  private Zx_5 Zq() {
    return this.Zk ? this.ZI : null;
  }
  
  static Zm3n ZQ(Zx_5 paramZx_5) {
    return new Zm3n(paramZx_5, true);
  }
  
  static Zm3n Zc(Zx_5 paramZx_5) {
    return new Zm3n(paramZx_5, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */