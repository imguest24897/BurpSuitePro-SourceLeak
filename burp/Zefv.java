package burp;

import javax.swing.text.Segment;

public class Zefv implements Ziz {
  private static final String a;
  
  public void Zh(Segment paramSegment, Zxnr paramZxnr) {
    Ze53 ze53 = Ze53.INIT;
    int i = paramSegment.offset;
    String str = Zey8.Zj();
    int j = paramSegment.offset;
    while (j < paramSegment.offset + paramSegment.count) {
      char c = paramSegment.array[j];
      try {
        switch (ze53.ordinal()) {
          case 0:
          
          case 1:
          
          case 2:
            if (Zk80.ZC(c)) {
              paramZxnr.ZC(paramSegment.array, i, j - 1, 40);
              i = j;
              ze53 = Ze53.SPACE;
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
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    paramZxnr.ZC(paramSegment.array, i, j - 1, (ze53 == Ze53.SPACE) ? 22 : 40);
    paramZxnr.ZJ();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: ldc 'j;=t]L9K0<,[H6J0b,'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zefv.a : Ljava/lang/String;
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
    //   80: bipush #59
    //   82: goto -> 112
    //   85: bipush #81
    //   87: goto -> 112
    //   90: bipush #92
    //   92: goto -> 112
    //   95: bipush #8
    //   97: goto -> 112
    //   100: bipush #41
    //   102: goto -> 112
    //   105: bipush #45
    //   107: goto -> 112
    //   110: bipush #94
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zefv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */