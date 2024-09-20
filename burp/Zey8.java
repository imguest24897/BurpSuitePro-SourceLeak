package burp;

import javax.swing.text.Segment;

public class Zey8 extends Zety {
  private int ZW;
  
  private static String ZX;
  
  private static final String b;
  
  public boolean Zh() {
    return true;
  }
  
  public Ze7g Z_(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2) {
    ZS();
    this.ZW = paramInt2 - paramSegment.offset;
    Ztb_ ztb_ = Ztb_.INIT;
    int i = paramSegment.offset;
    int j = paramSegment.offset;
    String str = Zj();
    while (j < paramSegment.offset + paramSegment.count) {
      char c = paramSegment.array[j];
      try {
        switch (ztb_.ordinal()) {
          case 0:
          
          case 1:
          
          case 2:
            if (Zk80.ZC(c)) {
              ZX(paramSegment.array, i, j - 1, 21);
              i = j;
              ztb_ = Ztb_.SPACE;
              try {
                if (str != null)
                  throw new IllegalStateException(b + b); 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
            } 
            break;
          default:
            throw new IllegalStateException(b + b);
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
    ZX(paramSegment.array, i, j - 1, (ztb_ == Ztb_.SPACE) ? 22 : 21);
    Zf();
    return this.Zz;
  }
  
  private void ZX(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) {
    Zq(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt1 + this.ZW);
  }
  
  public static void Zv(String paramString) {
    ZX = paramString;
  }
  
  public static String Zj() {
    return ZX;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zj : ()Ljava/lang/String;
    //   3: ifnull -> 11
    //   6: ldc 'YPLDyb'
    //   8: invokestatic Zv : (Ljava/lang/String;)V
    //   11: bipush #106
    //   13: ldc 'N\\f;k|iio:3zmfnd3'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zey8.b : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #113
    //   94: goto -> 124
    //   97: bipush #8
    //   99: goto -> 124
    //   102: bipush #52
    //   104: goto -> 124
    //   107: bipush #121
    //   109: goto -> 124
    //   112: bipush #102
    //   114: goto -> 124
    //   117: bipush #102
    //   119: goto -> 124
    //   122: bipush #96
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zey8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */