package burp;

class Zrsp {
  private static final Zrsp Zu = new Zrsp(null, false);
  
  private static final Zrsp ZV = new Zrsp(null, true);
  
  private static final Zrsp ZZ = new Zrsp(null, false);
  
  private final Zx_5 Zs;
  
  private final boolean ZX;
  
  private Zrsp(Zx_5 paramZx_5, boolean paramBoolean) {
    this.Zs = paramZx_5;
    this.ZX = paramBoolean;
  }
  
  private static Zrsp Zv(Zx_5 paramZx_5) {
    return new Zrsp(paramZx_5, false);
  }
  
  private static Zrsp ZX() {
    return Zu;
  }
  
  private static Zrsp ZJ() {
    return ZV;
  }
  
  private static Zrsp ZV() {
    return ZZ;
  }
  
  private Zx_5 Zb() {
    return this.Zs;
  }
  
  private boolean ZZ() {
    return (this == Zu);
  }
  
  private boolean ZO() {
    return this.ZX;
  }
  
  private boolean Zz() {
    return (this.Zs != null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrsp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */