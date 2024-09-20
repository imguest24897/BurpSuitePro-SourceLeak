package burp;

import java.util.ArrayList;
import java.util.List;

class Zmv0 {
  Zlhi Zf;
  
  Zltm ZY;
  
  Zbz7 Zi;
  
  List<String> ZJ = new ArrayList<>();
  
  Zsb9[] Zp;
  
  private static final String a;
  
  Zmv0(byte[] paramArrayOfbyte) throws Exception {
    int[] arrayOfInt = Zs9v.ZL();
    Zg08 zg08 = new Zg08(paramArrayOfbyte);
    try {
      this.Zf = new Zlhi(zg08);
      zg08.Zs(this.Zf.ZX);
      if (!zg08.ZA(Zbz7.Zd))
        throw new Exception(a); 
    } catch (Exception exception) {
      throw a(null);
    } 
    this.ZY = new Zltm(zg08);
    this.Zi = new Zbz7(zg08);
    this.Zp = new Zsb9[this.ZY.Zj];
    byte b = 0;
    while (b < this.ZY.Zj) {
      this.Zp[b] = new Zsb9(zg08);
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    long l = (this.Zi.ZE[0]).Z_;
    if (l > 0L) {
      zg08.Zs(Za(l));
      Zee6 zee6 = new Zee6(zg08);
      long l1 = Za(zee6.Zc);
      byte b1 = 0;
      while (b1 < zee6.Zs) {
        zg08.Zs(l1);
        long l2 = zg08.Zh();
        l1 = zg08.Zr();
        zg08.Zs(Za(l2));
        this.ZJ.add(zg08.ZB());
        b1++;
        if (arrayOfInt == null)
          break; 
      } 
    } 
  }
  
  private long Za(long paramLong) {
    int i = Zh(paramLong);
    return (i < 0) ? -1L : ((paramLong - (this.Zp[i]).ZJ > (this.Zp[i]).Z_) ? -1L : (paramLong - (this.Zp[i]).ZJ + (this.Zp[i]).Zi));
  }
  
  private int Zh(long paramLong) {
    int[] arrayOfInt = Zs9v.ZL();
    if (paramLong < 0L)
      return -1; 
    byte b = 0;
    while (b < this.Zp.length) {
      if ((this.Zp[b]).ZJ <= paramLong && (this.Zp[b]).ZJ + (this.Zp[b]).Z_ > paramLong)
        return b; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #126
    //   2: ldc 'N'GSd5EI/\\tbU`DE'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmv0.a : Ljava/lang/String;
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
    //   80: bipush #94
    //   82: goto -> 112
    //   85: bipush #54
    //   87: goto -> 112
    //   90: bipush #25
    //   92: goto -> 112
    //   95: bipush #125
    //   97: goto -> 112
    //   100: bipush #95
    //   102: goto -> 112
    //   105: bipush #107
    //   107: goto -> 112
    //   110: bipush #72
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmv0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */