package burp;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

class Ztv4 implements Runnable {
  private final Zlo ZO;
  
  private final Zkoj Zz;
  
  private final Zsen Zj;
  
  private final Zgb_ Zm;
  
  private final Zlan Zo;
  
  private final Ztf5 Zb;
  
  private final Zst8 Zt;
  
  private final AtomicLong Ze;
  
  private final Zx86 Zp;
  
  private final Zzsh ZY;
  
  private static final String a;
  
  public Ztv4(Zlo paramZlo, Zkoj paramZkoj, Zsen paramZsen, Zgb_ paramZgb_, Zlan paramZlan, Ztf5 paramZtf5, Zst8 paramZst8, AtomicLong paramAtomicLong, Zx86 paramZx86, Zzsh paramZzsh) {
    this.ZO = paramZlo;
    this.Zz = paramZkoj;
    this.Zj = paramZsen;
    this.Zm = paramZgb_;
    this.Zo = paramZlan;
    this.Zb = paramZtf5;
    this.Zt = paramZst8;
    this.Ze = paramAtomicLong;
    this.Zp = paramZx86;
    this.ZY = paramZzsh;
  }
  
  public void run() {
    String[] arrayOfString = Zt17.ZL();
    while (!this.ZO.ZU()) {
      this.Zo.ZN(this::lambda$run$0);
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void ZW(ByteBuffer paramByteBuffer) throws Zzt7, Zmfz {
    String[] arrayOfString = Zt17.ZL();
    while (paramByteBuffer.hasRemaining() && !this.ZO.ZU()) {
      synchronized (this.Zp) {
        Zsp zsp = this.Zj.ZH(paramByteBuffer);
        if (zsp != null) {
          String str = "";
          try {
            this.Zt.Zb(a, new Object[] { str, zsp });
            this.Ze.set(this.Zb.Zo());
            zsp.ZX(this.Zz);
            if (zsp.ZG())
              this.ZY.ZS(zsp); 
          } catch (Zzt7 zzt7) {
            throw a(null);
          } 
        } 
      } 
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void lambda$run$0() throws IOException, Zzt7, Zmfz {
    ZW(this.Zm.Zg());
  }
  
  private static Zzt7 a(Zzt7 paramZzt7) {
    return paramZzt7;
  }
  
  static {
    // Byte code:
    //   0: bipush #89
    //   2: ldc '~s*\\\r8j-e\\b/b6eBK.'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztv4.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_2
    //   81: goto -> 110
    //   84: bipush #89
    //   86: goto -> 110
    //   89: bipush #33
    //   91: goto -> 110
    //   94: bipush #96
    //   96: goto -> 110
    //   99: bipush #55
    //   101: goto -> 110
    //   104: iconst_4
    //   105: goto -> 110
    //   108: bipush #90
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztv4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */