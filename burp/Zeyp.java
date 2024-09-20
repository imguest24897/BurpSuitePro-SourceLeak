package burp;

import javax.swing.text.Segment;

public class Zeyp extends Zey0 {
  private int ZU;
  
  private static final String a;
  
  public boolean Zh() {
    return true;
  }
  
  public Ze7g Z_(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2) {
    ZS();
    Zros zros1 = Zros.INIT;
    Zros zros2 = Zros.PARAM_NAME;
    int i = paramSegment.offset;
    String str = Zey8.Zj();
    this.ZU = paramInt2 - paramSegment.offset;
    int j = paramSegment.offset;
    while (j < paramSegment.offset + paramSegment.count) {
      char c = paramSegment.array[j];
      try {
        switch (zros1.ordinal()) {
          case 0:
          
          case 2:
          
          case 3:
            ZD(paramSegment.array, i, j - 1, 24);
            i = j;
          case 4:
          
          case 5:
            ZD(paramSegment.array, i, j - 1, 23);
            i = j;
            zros1 = Zros.PARAM_NAME;
          case 1:
          
          case 6:
            if (Zk80.ZC(c)) {
              ZD(paramSegment.array, i, j - 1, 21);
              i = j;
              zros1 = Zros.SPACE;
              zros2 = Zros.END;
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
      j++;
      continue;
      if (str != null)
        break; 
    } 
    ZD(paramSegment.array, i, j - 1, zros1.Zb);
    Zf();
    return this.Zz;
  }
  
  private void ZD(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) {
    Zq(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt1 + this.ZU);
  }
  
  public Zm_0 ZC() {
    return new Zm_0();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc 'Sor"!$Xn*$.%X0*'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zeyp.a : Ljava/lang/String;
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
    //   80: bipush #106
    //   82: goto -> 112
    //   85: bipush #7
    //   87: goto -> 112
    //   90: bipush #48
    //   92: goto -> 112
    //   95: bipush #48
    //   97: goto -> 112
    //   100: bipush #104
    //   102: goto -> 112
    //   105: bipush #79
    //   107: goto -> 112
    //   110: bipush #120
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeyp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */