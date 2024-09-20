package burp;

import java.time.Instant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zebm {
  private final List<Zxth> Zr = new CopyOnWriteArrayList<>();
  
  private final Object Zf = new Object();
  
  private Zla1 ZA = new Zla1(0, Instant.ofEpochMilli(0L));
  
  private String Zd;
  
  private static int[] Zs;
  
  void Zb(Integer paramInteger, Instant paramInstant) {
    synchronized (this.Zf) {
      if (Z_(paramInteger, paramInstant)) {
        int i = Math.max(0, paramInteger.intValue());
        this.ZA = new Zla1(i, paramInstant);
        Zz3 zz3 = new Zz3(i);
        this.Zr.forEach(zz3::lambda$setCreditBalance$0);
        if (this.Zd != null) {
          this.Zd = null;
          this.Zr.forEach(this::lambda$setCreditBalance$1);
        } 
      } 
    } 
  }
  
  private boolean Z_(Integer paramInteger, Instant paramInstant) {
    return (paramInteger == null || paramInstant == null) ? false : this.ZA.Zw2().isBefore(paramInstant);
  }
  
  public void ZS(String paramString) {
    synchronized (this.Zf) {
      this.Zd = paramString;
      Zl54 zl54 = new Zl54(paramString);
      this.Zr.forEach(zl54::lambda$setError$2);
    } 
  }
  
  private static void lambda$setError$2(Zl54 paramZl54, Zxth paramZxth) {
    paramZxth.ZH(paramZl54);
  }
  
  private void lambda$setCreditBalance$1(Zxth paramZxth) {
    paramZxth.ZH(new Zl54(this.Zd));
  }
  
  private static void lambda$setCreditBalance$0(Zz3 paramZz3, Zxth paramZxth) {
    paramZxth.ZK(paramZz3);
  }
  
  public static void Zb(int[] paramArrayOfint) {
    Zs = paramArrayOfint;
  }
  
  public static int[] Zm() {
    return Zs;
  }
  
  static {
    if (Zm() != null)
      Zb(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zebm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */