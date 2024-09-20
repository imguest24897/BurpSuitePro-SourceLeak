package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zb9t {
  private final Collection<Zb09> ZR = Collections.synchronizedSet(new HashSet<>());
  
  private final Consumer<Ze3n> ZZ;
  
  private Ze3n Zf;
  
  private Ze3n ZM;
  
  public Zb9t(Consumer<Ze3n> paramConsumer) {
    this.ZZ = paramConsumer;
  }
  
  private void Zw(Ze3n paramZe3n) {
    this.Zf = paramZe3n;
    this.ZZ.accept(paramZe3n);
  }
  
  Ze3n ZG() {
    return this.Zf;
  }
  
  Collection<Zb09> ZN() {
    return this.ZR;
  }
  
  static Zrbc ZY(Zb9t paramZb9t, Zrjd paramZrjd, Zbza paramZbza, Zz1i paramZz1i, Zl5x paramZl5x, Ze4e paramZe4e) {
    // Byte code:
    //   0: new burp/Zg6p
    //   3: dup
    //   4: aload_1
    //   5: aload_2
    //   6: aload_0
    //   7: aload #5
    //   9: aload #4
    //   11: aload_3
    //   12: <illegal opcode> ZC : (Lburp/Zrjd;Lburp/Zbza;Lburp/Zb9t;Lburp/Ze4e;Lburp/Zl5x;Lburp/Zz1i;)Lburp/Zz09;
    //   17: invokestatic singleton : (Ljava/lang/Object;)Ljava/util/Set;
    //   20: invokespecial <init> : (Ljava/util/Set;)V
    //   23: areturn
  }
  
  static Zrcg Ze(Zb9t paramZb9t, Zkc paramZkc, Zbza paramZbza) {
    // Byte code:
    //   0: new burp/Zt41
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: <illegal opcode> Za : (Lburp/Zb9t;Lburp/Zkc;Lburp/Zbza;)Lburp/Zmgr;
    //   12: invokestatic singleton : (Ljava/lang/Object;)Ljava/util/Set;
    //   15: invokespecial <init> : (Ljava/util/Set;)V
    //   18: areturn
  }
  
  public void ZI(Ze3n paramZe3n) {
    this.ZM = paramZe3n;
    this.ZZ.accept(paramZe3n);
  }
  
  private static void lambda$buildActiveAuditItemPassivePhase$1(Zb9t paramZb9t, Zkc paramZkc, Zbza paramZbza, Zrj paramZrj, Zlsy paramZlsy) {
    paramZb9t.Zw(paramZkc.ZI(paramZbza));
  }
  
  private static void lambda$buildActiveAuditItemPhase$0(Zrjd paramZrjd, Zbza paramZbza, Zb9t paramZb9t, Ze4e paramZe4e, Zl5x paramZl5x, Zz1i paramZz1i, Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    try {
      Ze3n ze3n = paramZrjd.Zc(paramZbza, paramZtpx);
      paramZb9t.Zw(ze3n);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      paramZe4e.Zl(Zb09.Zh(paramZl5x, paramZz1i.Zd(paramZl5x), Zblb.ZB(throwable)).Zn(), throwable);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb9t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */