package burp;

import java.util.Objects;
import net.portswigger.Zrm3;

class Zerk {
  private final int ZF;
  
  private final Zl7h ZU;
  
  private final Zz1i Za;
  
  private final Zra1 Zc;
  
  private final Zg0s Zv;
  
  Zerk(int paramInt, Zl7h paramZl7h, Zz1i paramZz1i, Zra1 paramZra1, Zg0s paramZg0s) {
    this.ZF = paramInt;
    this.ZU = paramZl7h;
    this.Za = paramZz1i;
    this.Zc = paramZra1;
    this.Zv = paramZg0s;
  }
  
  Zrm3 Zn(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int[] arrayOfInt = Zx61.ZS();
    int i1 = 0;
    int i2 = 0;
    if (this.ZU != null) {
      i = this.ZU.ZVI();
      j = this.ZU.ZVp();
      k = this.ZU.ZVP().ZXY();
    } 
    if (this.Za != null) {
      Zefg<Zbza> zefg = this.Za.ZHU();
      int i3 = zefg.size();
      n = this.Za.ZHv().size();
      m = i3 - n;
      for (Zbza zbza : zefg) {
        i1 += zbza.ZgR();
        i2 += zbza.Zgx();
        if (arrayOfInt == null)
          break; 
      } 
    } 
    return new Zrm3(Objects.toString((this.Zc == Zra1.EXECUTION_MODE_ENTERPRISE_AGENT) ? paramString1 : null, ""), i, j, k, 0, m, n, i1, i2, Zd(), paramString2, paramInt1, paramInt2);
  }
  
  private int Zd() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic ZS : ()[I
    //   5: aload_0
    //   6: getfield Zv : Lburp/Zg0s;
    //   9: dup
    //   10: astore_3
    //   11: monitorenter
    //   12: astore_1
    //   13: iconst_0
    //   14: istore #4
    //   16: iload #4
    //   18: aload_0
    //   19: getfield Zv : Lburp/Zg0s;
    //   22: invokevirtual size : ()I
    //   25: if_icmpge -> 62
    //   28: aload_0
    //   29: getfield Zv : Lburp/Zg0s;
    //   32: iload #4
    //   34: invokevirtual get : (I)Ljava/lang/Object;
    //   37: checkcast burp/Zb2e
    //   40: invokeinterface ZBG : ()I
    //   45: aload_0
    //   46: getfield ZF : I
    //   49: if_icmpne -> 55
    //   52: iinc #2, 1
    //   55: iinc #4, 1
    //   58: aload_1
    //   59: ifnonnull -> 16
    //   62: aload_3
    //   63: monitorexit
    //   64: goto -> 74
    //   67: astore #5
    //   69: aload_3
    //   70: monitorexit
    //   71: aload #5
    //   73: athrow
    //   74: iload_2
    //   75: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	64	67	finally
    //   67	71	67	finally
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zerk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */