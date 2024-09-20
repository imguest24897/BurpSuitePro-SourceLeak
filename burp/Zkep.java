package burp;

import java.util.function.BiConsumer;

public class Zkep {
  private final Runnable Zj;
  
  private final Zmio ZW;
  
  private static boolean ZM;
  
  public Zkep(Zmio paramZmio, Runnable paramRunnable) {
    this.ZW = paramZmio;
    this.Zj = paramRunnable;
  }
  
  public void ZB(BiConsumer<Zm6a, Integer> paramBiConsumer) {
    paramBiConsumer.accept(new Zmt9(this), Integer.valueOf(15));
  }
  
  public static void ZP(boolean paramBoolean) {
    ZM = paramBoolean;
  }
  
  public static boolean Zm() {
    return ZM;
  }
  
  public static boolean ZK() {
    boolean bool = Zm();
    return !bool;
  }
  
  static {
    if (!Zm())
      ZP(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkep.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */