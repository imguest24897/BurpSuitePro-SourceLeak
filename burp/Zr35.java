package burp;

public class Zr35 implements Zehc {
  private final Zerg ZY;
  
  private final Zz1i Zk;
  
  private final Ze3n ZT;
  
  private final Zkl6 ZM;
  
  private final Zm6x Z_;
  
  private static boolean ZG;
  
  public Zr35(Zerg paramZerg, Zz1i paramZz1i, Ze3n paramZe3n, Zkl6 paramZkl6, Zm6x paramZm6x) {
    this.ZY = paramZerg;
    this.Zk = paramZz1i;
    boolean bool = Zk();
    this.ZT = paramZe3n;
    this.ZM = paramZkl6;
    this.Z_ = paramZm6x;
    if (Zbqc.Zwu() == null)
      Zk(!bool); 
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_ExtensionProvidedChecks;
  }
  
  public Ztk8 Zb() {
    Zgq<Zgpi> zgq = new Zgq<>();
    Zgq<Zrdb> zgq1 = this.ZY.ZM().ZI(this.Zk, this.ZT, this.ZT.Zq(this.ZM, this.Z_));
    boolean bool = Zk();
    if (zgq1 != null)
      zgq.ZF((Zgq)zgq1); 
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
    return Ztk8.Zy((Zgq)zgq);
  }
  
  public static void Zk(boolean paramBoolean) {
    ZG = paramBoolean;
  }
  
  public static boolean Zk() {
    return ZG;
  }
  
  public static boolean Za() {
    boolean bool = Zk();
    return !bool;
  }
  
  static {
    if (Zk())
      Zk(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr35.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */