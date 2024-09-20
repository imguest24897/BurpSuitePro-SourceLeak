package burp;

import net.portswigger.browser.Zec;

public class Zxrn {
  private static final byte[] ZM;
  
  private final Zr_4 ZT;
  
  private final Zkl6 ZX;
  
  private final Ztdi Zu;
  
  private final Zzxd ZA;
  
  private final Zgb6 Zf;
  
  private final Zbnt ZQ;
  
  private static String Zp;
  
  public Zxrn(Zr_4 paramZr_4, Zkl6 paramZkl6, Ztdi paramZtdi, Zzxd paramZzxd, Zgb6 paramZgb6) {
    this.ZT = paramZr_4;
    this.ZX = paramZkl6;
    this.Zu = paramZtdi;
    this.ZA = paramZzxd;
    this.Zf = paramZgb6;
    this.ZQ = paramZkl6.ZB();
  }
  
  public byte[] Zs(Zec paramZec, Zlit paramZlit) {
    return Zk(paramZec, paramZlit, 0);
  }
  
  private byte[] Zk(Zec paramZec, Zlit paramZlit, int paramInt) {
    if (paramZlit == null || this.Zf.ZU0().ZM(paramZlit.Zd1()) || paramInt >= 10)
      return ZM; 
    Zspb zspb = new Zspb(paramZec, paramZlit, this.Zu.Zq(paramZlit, (short)20));
    if (this.Zf.Zff() && (zspb.Zu() || zspb.ZD())) {
      Zsta zsta = Zu(paramZlit);
      zspb = zsta.Ze(paramZec, this.ZT, this.Zu);
    } 
    return zspb.ZE() ? Zk(paramZec, zspb.ZJ(this.ZQ), paramInt + 1) : zspb.ZN();
  }
  
  private Zsta Zu(Zlit paramZlit) {
    byte[] arrayOfByte = this.ZX.Zs().ZO().Zj(Zsss.GET).Zf(paramZlit).Zr().ZiD();
    Zg3d zg3d = this.ZA.Zr(paramZlit.Zdz(), arrayOfByte);
    return new Zsta(paramZlit, zg3d);
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zg : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'YitmVb'
    //   8: invokestatic Zp : (Ljava/lang/String;)V
    //   11: bipush #46
    //   13: ldc '{-lu7Y\\nW\Y{J]V|]\\r5/>('
    //   15: iconst_m1
    //   16: goto -> 23
    //   19: astore_0
    //   20: goto -> 162
    //   23: dup_x2
    //   24: pop
    //   25: invokevirtual toCharArray : ()[C
    //   28: dup_x1
    //   29: arraylength
    //   30: dup_x2
    //   31: pop
    //   32: iconst_0
    //   33: istore_1
    //   34: dup2_x1
    //   35: pop2
    //   36: dup_x2
    //   37: iconst_1
    //   38: if_icmpgt -> 136
    //   41: dup2
    //   42: swap
    //   43: iload_1
    //   44: dup2_x1
    //   45: caload
    //   46: swap
    //   47: iload_1
    //   48: bipush #7
    //   50: irem
    //   51: tableswitch default -> 118, 0 -> 88, 1 -> 93, 2 -> 98, 3 -> 103, 4 -> 108, 5 -> 113
    //   88: bipush #29
    //   90: goto -> 120
    //   93: bipush #87
    //   95: goto -> 120
    //   98: bipush #22
    //   100: goto -> 120
    //   103: bipush #11
    //   105: goto -> 120
    //   108: bipush #29
    //   110: goto -> 120
    //   113: bipush #12
    //   115: goto -> 120
    //   118: bipush #55
    //   120: ixor
    //   121: ixor
    //   122: i2c
    //   123: castore
    //   124: iinc #1, 1
    //   127: dup
    //   128: ifne -> 136
    //   131: dup2
    //   132: dup_x1
    //   133: goto -> 44
    //   136: dup2_x1
    //   137: pop2
    //   138: dup_x2
    //   139: iload_1
    //   140: if_icmpgt -> 41
    //   143: pop
    //   144: new java/lang/String
    //   147: dup_x1
    //   148: swap
    //   149: invokespecial <init> : ([C)V
    //   152: invokevirtual intern : ()Ljava/lang/String;
    //   155: swap
    //   156: pop
    //   157: swap
    //   158: pop
    //   159: goto -> 19
    //   162: aload_0
    //   163: invokestatic Zy : (Ljava/lang/String;)[B
    //   166: putstatic burp/Zxrn.ZM : [B
    //   169: return
  }
  
  public static void Zp(String paramString) {
    Zp = paramString;
  }
  
  public static String Zg() {
    return Zp;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxrn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */