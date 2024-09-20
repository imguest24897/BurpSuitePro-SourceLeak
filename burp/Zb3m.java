package burp;

import javax.swing.text.Segment;

public class Zb3m implements Ziz {
  private static final String a;
  
  public void Zh(Segment paramSegment, Zxnr paramZxnr) {
    Zm5 zm51 = Zm5.INIT;
    Zm5 zm52 = Zm5.METHOD;
    int i = paramSegment.offset;
    int j = paramSegment.offset;
    String str = Zey8.Zj();
    while (j < paramSegment.offset + paramSegment.count) {
      char c = paramSegment.array[j];
      try {
        switch (zm51.ordinal()) {
          case 0:
          
          case 2:
          
          case 3:
          
          case 4:
            paramZxnr.ZC(paramSegment.array, i, j - 1, 40);
            i = j;
          case 5:
          
          case 6:
            paramZxnr.ZC(paramSegment.array, i, j - 1, 40);
            i = j;
          case 7:
          
          case 8:
            paramZxnr.ZC(paramSegment.array, i, j - 1, 40);
            i = j;
            zm51 = Zm5.PARAM_NAME;
          case 9:
            paramZxnr.ZC(paramSegment.array, i, j - 1, 40);
            i = j;
            zm51 = Zm5.FRAGMENT;
          case 10:
          
          case 11:
          
          case 1:
          
          case 12:
            try {
              if (str != null)
                throw new IllegalStateException(a + a); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
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
    paramZxnr.ZC(paramSegment.array, i, j - 1, zm51.ZR);
    paramZxnr.ZJ();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: ldc ':umDv#1t5@y"1*5'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb3m.a : Ljava/lang/String;
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
    //   80: bipush #81
    //   82: goto -> 112
    //   85: bipush #82
    //   87: goto -> 112
    //   90: bipush #22
    //   92: goto -> 112
    //   95: bipush #19
    //   97: goto -> 112
    //   100: bipush #98
    //   102: goto -> 112
    //   105: bipush #39
    //   107: goto -> 112
    //   110: bipush #19
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */