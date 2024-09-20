package net.portswigger;

import java.util.function.Function;

public class Zqg {
  public final Zla ZO;
  
  public final Zig Zk;
  
  public final String ZJ;
  
  private Zqg(Zla paramZla, Zig paramZig, String paramString) {
    this.ZO = paramZla;
    this.ZJ = paramString;
    this.Zk = paramZig;
  }
  
  public static Function<String, Zqy> Zi(Zla paramZla) {
    return paramZla::lambda$missing$0;
  }
  
  public static Function<String, Zq4> Zw(Zla paramZla) {
    return paramZla::lambda$unsupported$1;
  }
  
  public static Function<String, Zq6> Zy(Zla paramZla) {
    return paramZla::lambda$mismatch$2;
  }
  
  private static Zq6 lambda$mismatch$2(Zla paramZla, String paramString) {
    return new Zq6(paramZla, paramString);
  }
  
  private static Zq4 lambda$unsupported$1(Zla paramZla, String paramString) {
    return new Zq4(paramZla, paramString);
  }
  
  private static Zqy lambda$missing$0(Zla paramZla, String paramString) {
    return new Zqy(paramZla, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zqg.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */