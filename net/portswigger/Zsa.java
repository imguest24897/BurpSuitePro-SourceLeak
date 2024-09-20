package net.portswigger;

import burp.Zbqc;
import java.security.PrivateKey;

class Zsa implements Runnable {
  private static final PrivateKey Ze;
  
  private static final Ziy Zy;
  
  private final Zmq Zb;
  
  private final Zk4 ZK;
  
  private final Zrmh ZJ;
  
  private Ziy Zr;
  
  private static final String a;
  
  public Zsa(Zk4 paramZk4, Zmq paramZmq, Zrmh paramZrmh) {
    int[] arrayOfInt = Zmq.ZU();
    this.Zr = Zy;
    Zuh.Zv((paramZk4 != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZmq != null), Zqf.Zv, 2L);
    this.ZK = paramZk4;
    this.Zb = paramZmq;
    this.ZJ = paramZrmh;
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public void ZO(Ziy paramZiy) {
    this.Zr = paramZiy;
  }
  
  public void run() {
    try {
      if (this.Zb.ZO()) {
        this.Zr.Zu();
        return;
      } 
      int i = this.Zb.Zy();
      Zc(i, this.ZK);
      boolean bool = Zh(this.ZK.ZI());
      try {
        if (bool)
          this.Zb.ZG(i); 
      } catch (OutOfMemoryError outOfMemoryError) {
        throw a(null);
      } 
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.IGNORED);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } finally {
      this.ZK.Z_();
    } 
    this.Zr.Zu();
  }
  
  private void Zc(int paramInt, Zk4 paramZk4) {
    byte b = 0;
    int[] arrayOfInt = Zmq.ZU();
    while (b < paramInt) {
      paramZk4.Zj(this.Zb.ZL(b));
      b++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private boolean Zh(Zex paramZex) {
    byte[] arrayOfByte;
    try {
      Zan zan = (new Zan(paramZex)).Zx(Ze).ZG(true);
      arrayOfByte = zan.Ze();
    } catch (Exception exception) {
      Zah.ZU(exception, a, Zk_.UNEXPECTED);
      return true;
    } 
    return this.ZJ.Zg(arrayOfByte);
  }
  
  private static void lambda$static$0() {}
  
  static {
    // Byte code:
    //   0: bipush #110
    //   2: ldc 'l5}j(>l;c#(2pzb/((?|j=4lH<j/?91'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zsa.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #53
    //   82: goto -> 112
    //   85: bipush #112
    //   87: goto -> 112
    //   90: bipush #6
    //   92: goto -> 112
    //   95: bipush #52
    //   97: goto -> 112
    //   100: bipush #97
    //   102: goto -> 112
    //   105: bipush #36
    //   107: goto -> 112
    //   110: bipush #53
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: getstatic net/portswigger/Zrxm.ZY : [B
    //   157: getstatic net/portswigger/Zrxm.Zi : [B
    //   160: invokestatic ZV : ([B[B)Ljava/security/PrivateKey;
    //   163: putstatic net/portswigger/Zsa.Ze : Ljava/security/PrivateKey;
    //   166: <illegal opcode> Zu : ()Lnet/portswigger/Ziy;
    //   171: putstatic net/portswigger/Zsa.Zy : Lnet/portswigger/Ziy;
    //   174: return
  }
  
  private static OutOfMemoryError a(OutOfMemoryError paramOutOfMemoryError) {
    return paramOutOfMemoryError;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zsa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */