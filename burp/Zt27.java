package burp;

import java.util.Map;

public class Zt27 implements Zlfv<Zze_> {
  private final Zrde Zo = null;
  
  private final Zei8<? extends Zrde> Zr;
  
  private final long Zi;
  
  private final long ZU;
  
  private static int ZF;
  
  public Zt27(Zei8<? extends Zrde> paramZei8, long paramLong1, long paramLong2) {
    this.Zr = paramZei8;
    this.Zi = paramLong1;
    this.ZU = paramLong2;
  }
  
  public Zsqx<Zze_> Zc(Map<Zvow, Zzi8> paramMap) {
    return new Zmd8(this, paramMap);
  }
  
  public static void ZM(int paramInt) {
    ZF = paramInt;
  }
  
  public static int Zc() {
    return ZF;
  }
  
  public static int ZV() {
    int i = Zc();
    return (i == 0) ? 115 : 0;
  }
  
  static {
    if (ZV() != 0)
      ZM(101); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt27.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */