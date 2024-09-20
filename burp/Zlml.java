package burp;

public abstract class Zlml implements Zzup {
  private static Zbqc[] Zq;
  
  public Zzup ZT(Zzup paramZzup) {
    return (paramZzup instanceof Zlm1) ? new Zlm6(this, paramZzup.Zm()) : new Zlm6(this, paramZzup);
  }
  
  public Zzup ZN(Zzup paramZzup) {
    return new Zlm1(this, paramZzup);
  }
  
  public Zzup Zs() {
    return new Zlm3(this);
  }
  
  public Zzup Zd(Zzup paramZzup) {
    return new Zlms(this, paramZzup);
  }
  
  public Zzup Zt(Zzup paramZzup) {
    return new Zlmn(this, paramZzup);
  }
  
  public Zzup Zs(Zzup paramZzup) {
    return new Zlm0(this, paramZzup);
  }
  
  public Zzup Zm() {
    return new Zlm_(this);
  }
  
  public Zzup ZI() {
    return new Zlmp(this);
  }
  
  public static void ZN(Zbqc[] paramArrayOfZbqc) {
    Zq = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zc() {
    return Zq;
  }
  
  static {
    if (Zc() != null)
      ZN(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlml.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */