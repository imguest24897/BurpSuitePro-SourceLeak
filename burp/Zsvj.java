package burp;

import java.util.List;

class Zsvj<T> {
  private final Zblo<T> ZT;
  
  private static final String a;
  
  Zsvj(Zblo<T> paramZblo) {
    this.ZT = paramZblo;
  }
  
  List<T> ZT(String paramString, Zb_j paramZb_j) {
    // Byte code:
    //   0: invokestatic Zj : ()[I
    //   3: astore_3
    //   4: aload_2
    //   5: aload_1
    //   6: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   11: invokeinterface Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   16: astore #5
    //   18: aload #5
    //   20: ifnonnull -> 36
    //   23: new java/util/ArrayList
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore #4
    //   32: aload_3
    //   33: ifnull -> 154
    //   36: getstatic burp/Zsvj.a : Ljava/lang/String;
    //   39: aload #5
    //   41: invokevirtual equals : (Ljava/lang/Object;)Z
    //   44: ifeq -> 67
    //   47: goto -> 54
    //   50: invokestatic a : (Lburp/Ze27;)Lburp/Ze27;
    //   53: athrow
    //   54: new java/util/ArrayList
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore #4
    //   63: aload_3
    //   64: ifnull -> 154
    //   67: new java/util/ArrayList
    //   70: dup
    //   71: invokespecial <init> : ()V
    //   74: astore #4
    //   76: iconst_0
    //   77: istore #6
    //   79: aload_2
    //   80: aload_1
    //   81: iload #6
    //   83: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   88: invokeinterface Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   93: dup
    //   94: astore #7
    //   96: ifnull -> 154
    //   99: aload_0
    //   100: getfield ZT : Lburp/Zblo;
    //   103: aload #7
    //   105: invokeinterface ZG : (Ljava/lang/String;)Ljava/lang/Object;
    //   110: astore #8
    //   112: aload #8
    //   114: ifnull -> 134
    //   117: aload #4
    //   119: aload #8
    //   121: invokeinterface add : (Ljava/lang/Object;)Z
    //   126: pop
    //   127: goto -> 134
    //   130: invokestatic a : (Lburp/Ze27;)Lburp/Ze27;
    //   133: athrow
    //   134: goto -> 147
    //   137: astore #8
    //   139: aload #8
    //   141: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   144: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   147: iinc #6, 1
    //   150: aload_3
    //   151: ifnull -> 79
    //   154: aload #4
    //   156: areturn
    // Exception table:
    //   from	to	target	type
    //   32	47	50	burp/Ze27
    //   99	134	137	burp/Ze27
    //   112	127	130	burp/Ze27
  }
  
  private static Ze27 a(Ze27 paramZe27) {
    return paramZe27;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: ldc ' b0U\\n b'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsvj.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_2
    //   81: goto -> 111
    //   84: bipush #64
    //   86: goto -> 111
    //   89: bipush #93
    //   91: goto -> 111
    //   94: bipush #107
    //   96: goto -> 111
    //   99: bipush #45
    //   101: goto -> 111
    //   104: bipush #118
    //   106: goto -> 111
    //   109: bipush #117
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsvj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */