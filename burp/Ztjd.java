package burp;

import java.io.IOException;
import java.io.OutputStream;

class Ztjd {
  private final Zih ZX;
  
  private final Zst8 Zt;
  
  private final Zlan ZG;
  
  private final Zx86 Zn;
  
  private final OutputStream ZS;
  
  private final Zl8p ZR;
  
  private static final String a;
  
  Ztjd(Zih paramZih, OutputStream paramOutputStream, Zst8 paramZst8, Zlan paramZlan, Zx86 paramZx86, Zl8p paramZl8p) {
    this.ZX = paramZih;
    this.ZS = paramOutputStream;
    this.Zt = paramZst8;
    this.ZG = paramZlan;
    this.Zn = paramZx86;
    this.ZR = paramZl8p;
  }
  
  void ZE(Zsp paramZsp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zn : Lburp/Zx86;
    //   4: dup
    //   5: astore_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield ZG : Lburp/Zlan;
    //   11: aload_0
    //   12: aload_1
    //   13: <illegal opcode> ZH : (Lburp/Ztjd;Lburp/Zsp;)Lburp/Zzik;
    //   18: invokevirtual ZN : (Lburp/Zzik;)V
    //   21: aload_2
    //   22: monitorexit
    //   23: goto -> 31
    //   26: astore_3
    //   27: aload_2
    //   28: monitorexit
    //   29: aload_3
    //   30: athrow
    //   31: return
    // Exception table:
    //   from	to	target	type
    //   7	23	26	finally
    //   26	29	26	finally
  }
  
  private void lambda$sendFrame$0(Zsp paramZsp) throws IOException, Zzt7, Zmfz {
    byte[] arrayOfByte = this.ZX.ZL(paramZsp);
    this.ZR.ZD(paramZsp);
    this.ZS.write(arrayOfByte);
    this.ZS.flush();
    String str = "";
    this.Zt.Zb(a, new Object[] { str, paramZsp.toString() });
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: ldc 'cBgLJn(VOVk#\\fW'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztjd.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #107
    //   82: goto -> 111
    //   85: bipush #28
    //   87: goto -> 111
    //   90: bipush #25
    //   92: goto -> 111
    //   95: iconst_4
    //   96: goto -> 111
    //   99: bipush #9
    //   101: goto -> 111
    //   104: bipush #39
    //   106: goto -> 111
    //   109: bipush #69
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztjd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */