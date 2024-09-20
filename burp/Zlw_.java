package burp;

import java.util.function.Supplier;

class Zlw_ implements Zt7b {
  private final Zr2e ZJ;
  
  private final Supplier<? extends Zzxp> ZD;
  
  private Zgu3 ZK;
  
  public Zlw_(Zr2e paramZr2e, Supplier<? extends Zzxp> paramSupplier, Zgu3 paramZgu3) {
    this.ZJ = paramZr2e;
    this.ZD = paramSupplier;
    this.ZK = paramZgu3;
  }
  
  public void Zj(Zgu3 paramZgu3) {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZK : Lburp/Zgu3;
    //   9: getstatic burp/Zevg.ZK : [I
    //   12: aload_1
    //   13: invokevirtual ordinal : ()I
    //   16: iaload
    //   17: tableswitch default -> 118, 1 -> 44, 2 -> 69, 3 -> 94
    //   44: aload_0
    //   45: getfield ZJ : Lburp/Zr2e;
    //   48: aload_0
    //   49: getfield ZD : Ljava/util/function/Supplier;
    //   52: invokeinterface get : ()Ljava/lang/Object;
    //   57: checkcast burp/Zzxp
    //   60: invokeinterface Zm : (Lburp/Zzxp;)V
    //   65: aload_2
    //   66: ifnull -> 118
    //   69: aload_0
    //   70: getfield ZJ : Lburp/Zr2e;
    //   73: aload_0
    //   74: getfield ZD : Ljava/util/function/Supplier;
    //   77: invokeinterface get : ()Ljava/lang/Object;
    //   82: checkcast burp/Zzxp
    //   85: invokeinterface Zl : (Lburp/Zzxp;)V
    //   90: aload_2
    //   91: ifnull -> 118
    //   94: aload_0
    //   95: getfield ZJ : Lburp/Zr2e;
    //   98: aload_0
    //   99: getfield ZD : Ljava/util/function/Supplier;
    //   102: invokeinterface get : ()Ljava/lang/Object;
    //   107: checkcast burp/Zzxp
    //   110: invokeinterface ZP : (Lburp/Zzxp;)V
    //   115: goto -> 118
    //   118: return
  }
  
  public void ZU() {
    this.ZJ.ZW();
  }
  
  public void Zn() {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: getstatic burp/Zevg.ZK : [I
    //   7: aload_0
    //   8: getfield ZK : Lburp/Zgu3;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 78, 1 -> 40, 2 -> 53, 3 -> 66
    //   40: aload_0
    //   41: getfield ZJ : Lburp/Zr2e;
    //   44: invokeinterface Zy : ()V
    //   49: aload_1
    //   50: ifnull -> 78
    //   53: aload_0
    //   54: getfield ZJ : Lburp/Zr2e;
    //   57: invokeinterface ZY : ()V
    //   62: aload_1
    //   63: ifnull -> 78
    //   66: aload_0
    //   67: getfield ZJ : Lburp/Zr2e;
    //   70: invokeinterface Zh : ()V
    //   75: goto -> 78
    //   78: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlw_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */