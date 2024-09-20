package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Zt3;

public class Zkum implements Zkg8 {
  private final Zel ZB;
  
  private final boolean ZJ;
  
  private final List<Zzjv> ZT;
  
  private final Zsgp Zi;
  
  private Zkum(Zel paramZel, boolean paramBoolean, List<Zzjv> paramList, Zsgp paramZsgp) {
    this.ZB = paramZel;
    this.ZJ = paramBoolean;
    this.ZT = paramList;
    this.Zi = paramZsgp;
  }
  
  static Zkum ZT(Zel paramZel1, Zel paramZel2, List<Zel> paramList, Zt3 paramZt3) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicBoolean
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload_3
    //   10: aload_0
    //   11: aload_0
    //   12: aload #4
    //   14: <illegal opcode> accept : (Lnet/portswigger/browser/Zel;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/util/function/Consumer;
    //   19: invokeinterface ZA : (Lnet/portswigger/browser/Zel;Ljava/util/function/Consumer;)V
    //   24: aload_0
    //   25: aload_3
    //   26: invokestatic ZA : (Lnet/portswigger/browser/Zel;Lnet/portswigger/browser/Zt3;)Ljava/util/List;
    //   29: astore #5
    //   31: aload_1
    //   32: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   35: aload_2
    //   36: aload_3
    //   37: <illegal opcode> apply : (Ljava/util/List;Lnet/portswigger/browser/Zt3;)Ljava/util/function/Function;
    //   42: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   45: aload_2
    //   46: aload_3
    //   47: <illegal opcode> get : (Ljava/util/List;Lnet/portswigger/browser/Zt3;)Ljava/util/function/Supplier;
    //   52: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   55: checkcast burp/Zsgp
    //   58: astore #6
    //   60: new burp/Zkum
    //   63: dup
    //   64: aload_0
    //   65: aload #4
    //   67: invokevirtual get : ()Z
    //   70: aload #5
    //   72: aload #6
    //   74: invokespecial <init> : (Lnet/portswigger/browser/Zel;ZLjava/util/List;Lburp/Zsgp;)V
    //   77: areturn
  }
  
  public Zel Zr() {
    return this.ZB;
  }
  
  public Zsgp Zp() {
    return this.Zi;
  }
  
  public List<Zzjv> Zk() {
    return this.ZT;
  }
  
  boolean Zd() {
    return this.ZJ;
  }
  
  private static Zsgp lambda$createClickableElement$2(List<Zel> paramList, Zt3 paramZt3) {
    return Zza5.Zr(paramList, paramZt3);
  }
  
  private static Zsgp lambda$createClickableElement$1(List<Zel> paramList, Zt3 paramZt3, Zel paramZel) {
    return Zmy9.ZY(paramZel, paramList, paramZt3);
  }
  
  private static void lambda$createClickableElement$0(Zel paramZel1, AtomicBoolean paramAtomicBoolean, Zel paramZel2) {
    if (paramZel2 != paramZel1 && paramZel2.ZC())
      paramAtomicBoolean.set(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkum.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */