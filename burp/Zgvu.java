package burp;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

class Zgvu implements Runnable {
  private final Queue<Zrxp> ZK;
  
  private final Zmkp ZR;
  
  private final Executor Zl;
  
  private static final String a;
  
  Zgvu(Zmkp paramZmkp, Executor paramExecutor) {
    this.ZR = paramZmkp;
    this.Zl = paramExecutor;
    this.ZK = new ConcurrentLinkedQueue<>();
  }
  
  void ZL(Zrxp paramZrxp) {
    this.ZK.add(paramZrxp);
    this.Zl.execute(this);
  }
  
  public void run() {
    Zrxp zrxp = this.ZK.poll();
    try {
      if (zrxp == null)
        throw new IllegalStateException(a); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZR.ZC(zrxp);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc '<8qZ^9miO\\n)'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgvu.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #16
    //   82: goto -> 111
    //   85: bipush #48
    //   87: goto -> 111
    //   90: bipush #10
    //   92: goto -> 111
    //   95: bipush #121
    //   97: goto -> 111
    //   100: bipush #66
    //   102: goto -> 111
    //   105: iconst_3
    //   106: goto -> 111
    //   109: bipush #45
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */