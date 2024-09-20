package burp;

import burp.api.montoya.logger.LoggerHttpRequestResponse;

public class Zx47 implements Zkoh<Zto7, LoggerHttpRequestResponse> {
  private final Zm51 ZM;
  
  private final Zskl ZW;
  
  private static boolean Zl;
  
  public Zx47(Zm51 paramZm51, Zskl paramZskl) {
    this.ZM = paramZm51;
    this.ZW = paramZskl;
  }
  
  public Zzvl<Zto7> Zo(String paramString, Zex3<LoggerHttpRequestResponse, Object> paramZex3, Zsuf paramZsuf) {
    Zs4l<LoggerHttpRequestResponse, Object> zs4l = new Zs4l<>(paramString, this.ZM, paramZex3, 60000L);
    zs4l.Zf(paramZsuf);
    boolean bool = ZL();
    if (!bool)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zbzb(zs4l, this.ZW);
  }
  
  public static void Zq(boolean paramBoolean) {
    Zl = paramBoolean;
  }
  
  public static boolean ZL() {
    return Zl;
  }
  
  public static boolean Zs() {
    boolean bool = ZL();
    return !bool;
  }
  
  static {
    if (Zs())
      Zq(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx47.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */