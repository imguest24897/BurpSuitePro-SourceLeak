package burp;

public abstract class Zlln {
  final Zxgh Zq;
  
  private static boolean ZR;
  
  Zlln(Zxgh paramZxgh) {
    this.Zq = paramZxgh;
  }
  
  public static Zlln Ze() {
    return new Zllp();
  }
  
  public static Zlln Zi() {
    return new Zll_();
  }
  
  public abstract Zlln ZZ(Zsp paramZsp) throws Zzt7, Zmfz;
  
  public abstract Zlln Zs(Zsp paramZsp);
  
  public abstract Zrsv Zl();
  
  public static void Zf(boolean paramBoolean) {
    ZR = paramBoolean;
  }
  
  public static boolean ZV() {
    return ZR;
  }
  
  public static boolean Zs() {
    boolean bool = ZV();
    return !bool;
  }
  
  static {
    if (Zs())
      Zf(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlln.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */