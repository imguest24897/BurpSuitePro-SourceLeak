package burp;

class Zgkm {
  private static final Zgkm Zm = new Zgkm(null, null);
  
  private static final Zgkm ZO = new Zgkm(null, null);
  
  private static final Zgkm Zj = new Zgkm(null, null);
  
  private final Zsxd Zf;
  
  private final Zsxd Zx;
  
  Zgkm(Zsxd paramZsxd1, Zsxd paramZsxd2) {
    this.Zf = paramZsxd1;
    this.Zx = paramZsxd2;
  }
  
  static Zgkm ZS() {
    return Zm;
  }
  
  static Zgkm Zz(Zsxd paramZsxd1, Zsxd paramZsxd2) {
    return new Zgkm(paramZsxd1, paramZsxd2);
  }
  
  static Zgkm Zp() {
    return ZO;
  }
  
  static Zgkm ZI() {
    return Zj;
  }
  
  boolean ZZ() {
    return (this == Zm);
  }
  
  boolean Zy() {
    return (this.Zf != null && this.Zx != null);
  }
  
  Zsxd ZD() {
    return this.Zf;
  }
  
  Zsxd ZJ() {
    return this.Zx;
  }
  
  public boolean Zg() {
    return (this == ZO);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgkm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */