package burp;

public class Zlf1 implements Zrbu {
  private final Zkq4 Zf;
  
  private final int ZD;
  
  private final int ZI;
  
  private final Zbjl Zk;
  
  private static int Zo;
  
  public Zlf1(Zkq4 paramZkq4, int paramInt1, int paramInt2, Zbjl paramZbjl) {
    this.Zf = paramZkq4;
    this.ZD = paramInt1;
    this.ZI = paramInt2;
    this.Zk = paramZbjl;
  }
  
  public Zzwz Zc(Zxs7 paramZxs7) {
    return new Zlv_(this.Zf, paramZxs7, this.ZD, this.ZI, this.Zk);
  }
  
  public static void ZH(int paramInt) {
    Zo = paramInt;
  }
  
  public static int ZJ() {
    return Zo;
  }
  
  public static int Zr() {
    int i = ZJ();
    return (i == 0) ? 33 : 0;
  }
  
  static {
    if (ZJ() == 0)
      ZH(13); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlf1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */