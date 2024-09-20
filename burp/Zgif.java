package burp;

public class Zgif {
  private static boolean ZR;
  
  public boolean Zq(Zkit paramZkit) {
    boolean bool = ZZ();
    Zzir zzir = paramZkit.<Zzir>Zj(Zzir.Zg);
    if (!bool)
      Zbqc.Zr(new Zbqc[1]); 
    return (zzir == null || zzir.ZvC() == null || (new Zrpv()).Zf(zzir) || (new Ztfo()).ZI(zzir) || (new Zrio()).ZQ(zzir) || (new Zsfv()).ZC(zzir) || (new Ziw()).Z_(zzir));
  }
  
  public static void Ze(boolean paramBoolean) {
    ZR = paramBoolean;
  }
  
  public static boolean Zi() {
    return ZR;
  }
  
  public static boolean ZZ() {
    boolean bool = Zi();
    return !bool;
  }
  
  static {
    if (Zi())
      Ze(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgif.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */