package burp;

import net.portswigger.Zsy;

class Zki9 extends Zkud {
  private static final String b;
  
  Zki9(Zsy paramZsy) {
    super(paramZsy);
  }
  
  protected boolean ZL(Zxaq paramZxaq, String paramString) {
    return paramString.contains(b);
  }
  
  protected String ZX(Zmlc paramZmlc) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZC : ()Ljava/util/Optional;
    //   4: sipush #1960
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: checkcast java/lang/Integer
    //   16: invokevirtual intValue : ()I
    //   19: istore_3
    //   20: invokestatic Zd : ()[Lburp/Zbqc;
    //   23: aload_1
    //   24: invokevirtual Zx : ()Ljava/util/Optional;
    //   27: sipush #1995
    //   30: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   33: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast java/lang/Integer
    //   39: invokevirtual intValue : ()I
    //   42: istore #4
    //   44: astore_2
    //   45: iload_3
    //   46: iload #4
    //   48: if_icmple -> 96
    //   51: iload_3
    //   52: sipush #1960
    //   55: if_icmpne -> 68
    //   58: iload #4
    //   60: bipush #35
    //   62: isub
    //   63: istore_3
    //   64: aload_2
    //   65: ifnonnull -> 96
    //   68: iload #4
    //   70: sipush #1995
    //   73: if_icmpne -> 87
    //   76: iload #4
    //   78: bipush #35
    //   80: iadd
    //   81: istore #4
    //   83: aload_2
    //   84: ifnonnull -> 96
    //   87: sipush #1960
    //   90: istore_3
    //   91: sipush #1995
    //   94: istore #4
    //   96: aload_0
    //   97: iload_3
    //   98: iload #4
    //   100: invokevirtual ZT : (II)Ljava/lang/String;
    //   103: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: ldc 'cW'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zki9.b : Ljava/lang/String;
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
    //   80: bipush #7
    //   82: goto -> 112
    //   85: bipush #118
    //   87: goto -> 112
    //   90: bipush #43
    //   92: goto -> 112
    //   95: bipush #97
    //   97: goto -> 112
    //   100: bipush #27
    //   102: goto -> 112
    //   105: bipush #48
    //   107: goto -> 112
    //   110: bipush #125
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zki9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */