package burp;

import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zmph implements Zx_o {
  final Zxf3 ZQ;
  
  Zmph(Zxf3 paramZxf3) {}
  
  public Zswo ZE(Zz28 paramZz28, Zs9z paramZs9z) {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: getfield Ze : Lburp/Zs0d;
    //   5: invokevirtual ZM : ()Lburp/Zlit;
    //   8: invokeinterface ZG : (Lburp/Zlit;)Z
    //   13: ifne -> 24
    //   16: iconst_1
    //   17: goto -> 25
    //   20: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   23: athrow
    //   24: iconst_0
    //   25: istore_3
    //   26: aload_0
    //   27: getfield ZQ : Lburp/Zxf3;
    //   30: getfield ZK : Lburp/Zgb6;
    //   33: invokeinterface ZU0 : ()Lburp/Zes1;
    //   38: aload_2
    //   39: getfield Ze : Lburp/Zs0d;
    //   42: invokevirtual ZM : ()Lburp/Zlit;
    //   45: invokeinterface Zd1 : ()Ljava/lang/String;
    //   50: invokevirtual ZM : (Ljava/lang/String;)Z
    //   53: istore #4
    //   55: aload_2
    //   56: getfield Zi : I
    //   59: bipush #18
    //   61: if_icmplt -> 72
    //   64: iconst_1
    //   65: goto -> 73
    //   68: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   71: athrow
    //   72: iconst_0
    //   73: istore #5
    //   75: aload_2
    //   76: getfield Zi : I
    //   79: aload_0
    //   80: getfield ZQ : Lburp/Zxf3;
    //   83: getfield Zp : I
    //   86: if_icmplt -> 114
    //   89: aload_0
    //   90: getfield ZQ : Lburp/Zxf3;
    //   93: getfield ZF : Z
    //   96: ifne -> 114
    //   99: goto -> 106
    //   102: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   105: athrow
    //   106: iconst_1
    //   107: goto -> 115
    //   110: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   113: athrow
    //   114: iconst_0
    //   115: istore #6
    //   117: iload_3
    //   118: ifne -> 157
    //   121: iload #4
    //   123: ifne -> 157
    //   126: goto -> 133
    //   129: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   132: athrow
    //   133: iload #5
    //   135: ifne -> 157
    //   138: goto -> 145
    //   141: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   144: athrow
    //   145: iload #6
    //   147: ifeq -> 165
    //   150: goto -> 157
    //   153: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   156: athrow
    //   157: getstatic burp/Zswo.STOP : Lburp/Zswo;
    //   160: areturn
    //   161: invokestatic a : (Lburp/Zscq;)Lburp/Zscq;
    //   164: athrow
    //   165: getstatic burp/Zswo.FOLLOW : Lburp/Zswo;
    //   168: areturn
    // Exception table:
    //   from	to	target	type
    //   0	20	20	burp/Zscq
    //   55	68	68	burp/Zscq
    //   75	99	102	burp/Zscq
    //   89	110	110	burp/Zscq
    //   117	126	129	burp/Zscq
    //   121	138	141	burp/Zscq
    //   133	150	153	burp/Zscq
    //   145	161	161	burp/Zscq
  }
  
  public Optional<Zefx> ZC(Zs9z paramZs9z, Zefx paramZefx) {
    try {
      try {
      
      } catch (Zscq zscq) {
        throw a(null);
      } 
      Zxgd zxgd = (paramZs9z.Zi + 1 == this.ZQ.Zp) ? this.ZQ.ZD : Zxgd.ZZ().ZT(this.ZQ.ZD.ZO());
      return Optional.of(zxgd.Zo(paramZefx));
    } catch (Zscq zscq) {
      Zah.Zl(zscq, Zk_.PROCESSED_LATER);
      this.ZQ.Zn.set(zscq);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
    return Optional.empty();
  }
  
  private static Zscq a(Zscq paramZscq) {
    return paramZscq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmph.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */