package burp;

import java.util.HashSet;
import java.util.Set;

public class Zx46 {
  private final Zg0p ZJ;
  
  private final Set<Zzr0> Zt = new HashSet<>();
  
  private final Ztwv Za;
  
  public Zx46(Ztwv paramZtwv) {
    this(new Zg0p(), paramZtwv);
  }
  
  private Zx46(Zg0p paramZg0p, Ztwv paramZtwv) {
    this.ZJ = paramZg0p;
    this.Za = paramZtwv;
  }
  
  public void Zx(Zzr0 paramZzr0) {
    this.Zt.add(paramZzr0);
  }
  
  public Zg0p ZN() {
    return this.ZJ;
  }
  
  public void Zk(Zbpn paramZbpn) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Za : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zx46;Lburp/Zbpn;)Ljava/lang/Runnable;
    //   11: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   16: pop
    //   17: return
  }
  
  private boolean Zu(Zbpn paramZbpn) {
    String str = Zkqn.ZM();
    if (!this.ZJ.isEmpty()) {
      int i = Math.min(250, this.ZJ.size());
      int j = this.ZJ.size() - i;
      int k = this.ZJ.size() - 1;
      while (k >= j) {
        Zbpn zbpn = this.ZJ.get(k);
        if (paramZbpn.Zt(zbpn)) {
          ZI(zbpn, paramZbpn, k);
          return true;
        } 
        k--;
        if (str == null)
          break; 
      } 
    } 
    return false;
  }
  
  private void ZE(Zbpn paramZbpn) {
    Zw();
    this.ZJ.add(paramZbpn);
    this.Zt.forEach(paramZbpn::lambda$addNewEventToTable$1);
  }
  
  private void ZI(Zbpn paramZbpn1, Zbpn paramZbpn2, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokevirtual Zs : (Lburp/Zbpn;Lburp/Zbpn;)Lburp/Zbpn;
    //   6: astore #4
    //   8: aload_0
    //   9: getfield Zt : Ljava/util/Set;
    //   12: aload_1
    //   13: aload #4
    //   15: iload_3
    //   16: <illegal opcode> accept : (Lburp/Zbpn;Lburp/Zbpn;I)Ljava/util/function/Consumer;
    //   21: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   26: aload_0
    //   27: getfield ZJ : Lburp/Zg0p;
    //   30: iload_3
    //   31: invokevirtual remove : (I)Ljava/lang/Object;
    //   34: pop
    //   35: aload_0
    //   36: getfield ZJ : Lburp/Zg0p;
    //   39: aload #4
    //   41: invokevirtual add : (Ljava/lang/Object;)Z
    //   44: pop
    //   45: return
  }
  
  private void Zw() {
    if (this.ZJ.size() == 500) {
      Zbpn zbpn = this.ZJ.remove(0);
      this.Zt.forEach(zbpn::lambda$removeOldestEventIfLimitReached$3);
    } 
  }
  
  private Zbpn Zs(Zbpn paramZbpn1, Zbpn paramZbpn2) {
    Zbo8 zbo8 = Zbpn.Zu(paramZbpn1);
    if (paramZbpn1.Zl() != paramZbpn2.Zl())
      zbo8.Zb(null); 
    return zbo8.ZA();
  }
  
  public void Zo() {
    this.ZJ.clear();
    this.Zt.forEach(Zzr0::Zc);
  }
  
  public Zx46 ZG() {
    return new Zx46(this.ZJ.ZM(), this.Za);
  }
  
  private static void lambda$removeOldestEventIfLimitReached$3(Zbpn paramZbpn, Zzr0 paramZzr0) {
    paramZzr0.ZQ(paramZbpn);
  }
  
  private static void lambda$updateExistingEvent$2(Zbpn paramZbpn1, Zbpn paramZbpn2, int paramInt, Zzr0 paramZzr0) {
    paramZzr0.Zx(paramZbpn1, paramZbpn2, paramInt);
  }
  
  private static void lambda$addNewEventToTable$1(Zbpn paramZbpn, Zzr0 paramZzr0) {
    paramZzr0.ZA(paramZbpn);
  }
  
  private void lambda$logEvent$0(Zbpn paramZbpn) {
    synchronized (this.ZJ.ZA()) {
      if (!Zu(paramZbpn))
        ZE(paramZbpn); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx46.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */