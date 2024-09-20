package burp;

import java.util.concurrent.atomic.AtomicInteger;

public class Zeo {
  private final AtomicInteger ZP;
  
  private static int[] ZL;
  
  public Zeo() {
    this(false);
  }
  
  public Zeo(boolean paramBoolean) {
    this.ZP = new AtomicInteger(Zu(paramBoolean));
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public boolean Zr() {
    return ZI(this.ZP.get());
  }
  
  public void ZF(boolean paramBoolean) {
    this.ZP.set(Zu(paramBoolean));
  }
  
  public boolean Zk() {
    int i = this.ZP.updateAndGet(Zeo::lambda$invert$0);
    return ZI(i);
  }
  
  private boolean ZI(int paramInt) {
    return (paramInt == 1);
  }
  
  private static int Zu(boolean paramBoolean) {
    return paramBoolean ? 1 : 0;
  }
  
  private static int lambda$invert$0(int paramInt) {
    return 1 - paramInt;
  }
  
  public static void ZO(int[] paramArrayOfint) {
    ZL = paramArrayOfint;
  }
  
  public static int[] ZC() {
    return ZL;
  }
  
  static {
    if (ZC() == null)
      ZO(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */