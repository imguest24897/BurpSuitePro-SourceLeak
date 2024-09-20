package burp;

import java.util.Set;

public class Zexg extends Zexe<Zgcs> {
  public void Zr(Zgcs paramZgcs) {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokestatic ZB : (Lburp/Zgcs;)Lburp/Ztyn;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnonnull -> 14
    //   13: return
    //   14: aload_3
    //   15: instanceof burp/Zgcj
    //   18: ifeq -> 44
    //   21: aload_3
    //   22: checkcast burp/Zgcj
    //   25: invokevirtual ZM : ()Lburp/Zgc7;
    //   28: astore #4
    //   30: aload_0
    //   31: aload #4
    //   33: invokevirtual Zb : ()Lburp/Ztyn;
    //   36: aload_1
    //   37: invokevirtual Zt : (Lburp/Zesp;Lburp/Zgcs;)V
    //   40: iload_2
    //   41: ifne -> 54
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual ZV : (Lburp/Zgcs;)V
    //   49: aload_0
    //   50: aload_1
    //   51: invokevirtual ZO : (Lburp/Zgcs;)V
    //   54: aload_0
    //   55: aload_1
    //   56: aload_1
    //   57: invokevirtual ZI : ()Lburp/Zb3t;
    //   60: invokevirtual ZH : (Lburp/Zesp;Lburp/Zesp;)V
    //   63: return
  }
  
  private void ZV(Zgcs paramZgcs) {
    boolean bool = Zexe.ZK();
    Set set = paramZgcs.<Set>ZO(Zxc6.TaintPreserver);
    if (set != null) {
      Zgc3 zgc3 = (Zgc3)paramZgcs.ZC().get(1);
      for (Znl znl : set) {
        int i = znl.ZO() * 2 + 1;
        if (zgc3.ZC().size() > i + 1) {
          Zgc0 zgc0 = (Zgc0)zgc3.ZC().get(i);
          Za(zgc0, paramZgcs, znl.Zp());
        } 
        if (!bool)
          break; 
      } 
    } 
  }
  
  private void ZO(Zgcs paramZgcs) {
    Zgc0 zgc0 = (Zgc0)paramZgcs.ZC().get(0);
    Zb3t zb3t = zgc0.ZC().get(0);
    if (Zl19.ZZ(zb3t)) {
      Zgc9 zgc9 = (Zgc9)zb3t;
      Zgc0 zgc01 = (Zgc0)zgc9.ZC().get(zgc9.ZC().size() - 1);
      if (zgc01.ZO(Zxc6.TaintPreserver) != null) {
        Znl znl = zgc01.<Znl>ZO(Zxc6.TaintPreserver);
        Za(zgc9.ZC().get(0), paramZgcs, znl.Zp());
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */