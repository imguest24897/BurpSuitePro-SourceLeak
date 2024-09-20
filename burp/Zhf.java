package burp;

import java.util.Optional;

public class Zhf extends Zni implements Ztfk {
  @Zzvo(1)
  private final Zx44 Zc;
  
  @Zzvo(2)
  private final Zsaa ZO;
  
  @Zzvo(3)
  private final Zg_f ZK;
  
  @Zzvo(4)
  private final Ztfa Zp;
  
  private static boolean Zh;
  
  Zhf(Zx44 paramZx44, Zsaa paramZsaa, Zg_f paramZg_f, Ztfa paramZtfa) {
    this.Zc = paramZx44;
    this.ZO = paramZsaa;
    this.ZK = paramZg_f;
    this.Zp = paramZtfa;
  }
  
  public Optional<Zx44> Zx() {
    return Optional.ofNullable(this.Zc);
  }
  
  public Optional<Zsaa> Zh() {
    return Optional.ofNullable(this.ZO);
  }
  
  public Optional<Zg_f> ZA() {
    return Optional.ofNullable(this.ZK);
  }
  
  public Optional<Ztfa> ZV() {
    return Optional.ofNullable(this.Zp);
  }
  
  public Zeu4<? extends Ztfk> ZF() {
    return Ztfk.ZQ;
  }
  
  public static void ZZ(boolean paramBoolean) {
    Zh = paramBoolean;
  }
  
  public static boolean Zj() {
    return Zh;
  }
  
  public static boolean ZB() {
    boolean bool = Zj();
    return !bool;
  }
  
  static {
    if (Zj())
      ZZ(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zhf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */