package burp;

import net.portswigger.Zen;

public class Zrhh implements Zs7d {
  private final Zbjl ZO;
  
  private final Ztai ZP;
  
  private static Zbqc[] ZI;
  
  public Zrhh(Zbjl paramZbjl, Ztai paramZtai) {
    this.ZO = paramZbjl;
    this.ZP = paramZtai;
  }
  
  public Ze2o ZF(Zlp9 paramZlp9, Zen paramZen) {
    return new Zg2s(paramZen, this.ZO, paramZlp9, this.ZP);
  }
  
  public static void ZN(Zbqc[] paramArrayOfZbqc) {
    ZI = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZO() {
    return ZI;
  }
  
  static {
    if (ZO() == null)
      ZN(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrhh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */