package burp;

import java.util.concurrent.atomic.AtomicReference;

class Zxf3 extends Zxf4 {
  private final int Zp;
  
  private final boolean ZF;
  
  private final Zxgd ZD;
  
  private final Zgb6 ZK;
  
  private final AtomicReference<Zscq> Zn;
  
  private Zxf3(int paramInt, boolean paramBoolean, Zxgd paramZxgd, Zgb6 paramZgb6) {
    this.Zp = paramInt;
    this.ZF = paramBoolean;
    this.ZD = paramZxgd;
    this.ZK = paramZgb6;
    this.Zn = new AtomicReference<>();
  }
  
  private void ZK() throws Zscq {
    Zscq zscq = this.Zn.get();
    try {
      if (zscq != null)
        throw zscq; 
    } catch (Zscq zscq1) {
      throw a(null);
    } 
  }
  
  public Zx_o Zx() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : I
    //   4: ifne -> 29
    //   7: aload_0
    //   8: getfield ZF : Z
    //   11: ifne -> 29
    //   14: goto -> 21
    //   17: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   20: athrow
    //   21: iconst_1
    //   22: goto -> 30
    //   25: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   28: athrow
    //   29: iconst_0
    //   30: istore_1
    //   31: iload_1
    //   32: ifeq -> 43
    //   35: getstatic burp/Zx_o.Zm : Lburp/Zx_o;
    //   38: areturn
    //   39: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   42: athrow
    //   43: new burp/Zmph
    //   46: dup
    //   47: aload_0
    //   48: invokespecial <init> : (Lburp/Zxf3;)V
    //   51: areturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	burp/Zscq
    //   7	25	25	burp/Zscq
    //   31	39	39	burp/Zscq
  }
  
  private static Zscq a(Zscq paramZscq) {
    return paramZscq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxf3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */