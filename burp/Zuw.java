package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zuw extends Zuz implements Zg9m {
  private final Zr_4 Zd;
  
  private static final String b;
  
  Zuw(Zmzk paramZmzk, Zlit paramZlit, Zbr paramZbr, Zmrq paramZmrq, long paramLong1, long paramLong2, int paramInt1, short paramShort, int paramInt2, int paramInt3, String paramString, Zr_4 paramZr_4) {
    super(paramZmzk, paramZlit, paramLong1, paramShort, paramLong2, paramZmrq, paramInt1, paramInt2, paramInt3, null, null, paramString, paramZbr);
    this.Zd = paramZr_4;
  }
  
  public void ZV(byte[] paramArrayOfbyte, int paramInt) {
    if (this.ZS == null)
      this.ZS = this.Zd.Zc(4096); 
    ((Zmrq)this.ZS).Zj(paramArrayOfbyte, 0, paramInt);
    this.Zq += paramInt;
  }
  
  public boolean ZoZ() {
    return true;
  }
  
  public Zbr Zo3() {
    Zbr zbr = super.Zo3();
    Zuh.ZT(zbr.Zz(), Zqf.Zr, b);
    return zbr;
  }
  
  public boolean equals(Object paramObject) {
    return super.equals(paramObject) ? true : Zea7.Ze(this, paramObject);
  }
  
  public int hashCode() {
    return Zea7.Zg(this);
  }
  
  public Zeu4<Zg9m> ZF() {
    return Zg9m.Zg;
  }
  
  static {
    // Byte code:
    //   0: bipush #108
    //   2: ldc '2Y|;+4@Tl=n/Xh<=i'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zuw.b : Ljava/lang/String;
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
    //   80: bipush #12
    //   82: goto -> 112
    //   85: bipush #80
    //   87: goto -> 112
    //   90: bipush #97
    //   92: goto -> 112
    //   95: bipush #34
    //   97: goto -> 112
    //   100: bipush #34
    //   102: goto -> 112
    //   105: bipush #43
    //   107: goto -> 112
    //   110: bipush #10
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zuw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */