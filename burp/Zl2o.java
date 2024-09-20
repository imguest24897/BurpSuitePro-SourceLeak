package burp;

import javax.swing.text.Segment;

public class Zl2o implements Ziz {
  private char[] Zr;
  
  private int Zp;
  
  private int Zv;
  
  private static final String a;
  
  public void Zh(Segment paramSegment, Zxnr paramZxnr) {
    Zbx1 zbx11 = Zbx1.INIT;
    Zbx1 zbx12 = Zbx1.HEADER_NAME;
    this.Zr = paramSegment.array;
    this.Zp = paramSegment.offset;
    String str = Zey8.Zj();
    Object object = null;
    this.Zv = paramSegment.offset;
    while (this.Zv < paramSegment.offset + paramSegment.count) {
      char c = paramSegment.array[this.Zv];
      try {
        switch (zbx11.ordinal()) {
          case 0:
          
          case 2:
          
          case 3:
          
          case 1:
          
          case 4:
          
          case 5:
          
          case 6:
          
          case 7:
          
          case 8:
          
          case 9:
          
          case 10:
          
          case 11:
            if (Zk80.ZC(c)) {
              paramZxnr.ZC(paramSegment.array, this.Zp, this.Zv - 1, 21);
              this.Zp = this.Zv;
              zbx11 = Zbx1.SPACE;
              zbx12 = Zbx1.END;
              try {
                if (str != null)
                  throw new IllegalStateException(a + a); 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
            } 
            break;
          default:
            throw new IllegalStateException(a + a);
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      this.Zv++;
      continue;
      if (str != null)
        break; 
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zzzm zzzm = (object == null) ? null : ((Zt6u)object).Zi;
    paramZxnr.ZG(paramSegment.array, this.Zp, this.Zv - 1, zbx11.ZD, zzzm);
    paramZxnr.ZJ();
  }
  
  private String ZN() {
    return new String(this.Zr, this.Zp, this.Zv - this.Zp);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: ldc 'Jb$kNk\\t:"oAj\\tG:'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zl2o.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #28
    //   82: goto -> 112
    //   85: bipush #111
    //   87: goto -> 112
    //   90: bipush #126
    //   92: goto -> 112
    //   95: bipush #25
    //   97: goto -> 112
    //   100: bipush #87
    //   102: goto -> 112
    //   105: bipush #13
    //   107: goto -> 112
    //   110: bipush #46
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */