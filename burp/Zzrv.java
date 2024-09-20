package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zl_;

class Zzrv {
  private static Zl_ Zs(Zgkc paramZgkc, Zey9 paramZey9) {
    AtomicReference<Zl_> atomicReference = new AtomicReference();
    paramZgkc.ZC(new Zr9k(atomicReference, paramZey9));
    return atomicReference.get();
  }
  
  private static List<Zl_> ZG(Ztub paramZtub, Zey9 paramZey9) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: aload_1
    //   10: aload_2
    //   11: <illegal opcode> accept : (Lburp/Zey9;Ljava/util/List;)Ljava/util/function/Consumer;
    //   16: invokevirtual Zj : (Ljava/util/function/Consumer;)V
    //   19: aload_2
    //   20: areturn
  }
  
  private static void lambda$from$0(Zey9 paramZey9, List<Zl_> paramList, Zgkc paramZgkc) {
    Zl_ zl_ = Zs(paramZgkc, paramZey9);
    if (zl_ != null)
      paramList.add(zl_); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */