package burp;

class Zshv {
  private static final Zg5v Zr;
  
  private static final String a;
  
  static Zz3i Zu(Zefg<Zz3i> paramZefg, Zr_4 paramZr_4) {
    // Byte code:
    //   0: invokestatic ZH : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   9: dup
    //   10: astore_3
    //   11: monitorenter
    //   12: astore_2
    //   13: aload_0
    //   14: invokeinterface isEmpty : ()Z
    //   19: ifeq -> 41
    //   22: aload_1
    //   23: getstatic burp/Zshv.Zr : Lburp/Zg5v;
    //   26: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   31: checkcast burp/Zz3i
    //   34: goto -> 58
    //   37: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   40: athrow
    //   41: aload_0
    //   42: aload_0
    //   43: invokeinterface size : ()I
    //   48: iconst_1
    //   49: isub
    //   50: invokeinterface remove : (I)Ljava/lang/Object;
    //   55: checkcast burp/Zz3i
    //   58: aload_3
    //   59: monitorexit
    //   60: invokestatic Zwu : ()[Lburp/Zbqc;
    //   63: ifnonnull -> 73
    //   66: iconst_4
    //   67: anewarray burp/Zbqc
    //   70: invokestatic Zw : ([Lburp/Zbqc;)V
    //   73: areturn
    //   74: astore #4
    //   76: aload_3
    //   77: monitorexit
    //   78: aload #4
    //   80: athrow
    // Exception table:
    //   from	to	target	type
    //   13	37	37	java/lang/IllegalArgumentException
    //   13	60	74	finally
    //   74	78	74	finally
  }
  
  static void Zf(Zz3i paramZz3i, Zefg<Zz3i> paramZefg) {
    // Byte code:
    //   0: invokestatic ZH : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   9: dup
    //   10: astore_3
    //   11: monitorenter
    //   12: astore_2
    //   13: aload_1
    //   14: aload_0
    //   15: invokeinterface contains : (Ljava/lang/Object;)Z
    //   20: ifeq -> 38
    //   23: new java/lang/IllegalArgumentException
    //   26: dup
    //   27: getstatic burp/Zshv.a : Ljava/lang/String;
    //   30: invokespecial <init> : (Ljava/lang/String;)V
    //   33: athrow
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: aload_0
    //   39: invokeinterface ZTm : ()V
    //   44: aload_0
    //   45: aconst_null
    //   46: invokeinterface Zn : (Lburp/Zz3i;)V
    //   51: aload_1
    //   52: aload_0
    //   53: invokeinterface add : (Ljava/lang/Object;)Z
    //   58: pop
    //   59: aload_3
    //   60: monitorexit
    //   61: goto -> 71
    //   64: astore #4
    //   66: aload_3
    //   67: monitorexit
    //   68: aload #4
    //   70: athrow
    //   71: aload_2
    //   72: ifnull -> 89
    //   75: iconst_1
    //   76: anewarray burp/Zbqc
    //   79: invokestatic Zr : ([Lburp/Zbqc;)V
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   88: athrow
    //   89: return
    // Exception table:
    //   from	to	target	type
    //   13	34	34	java/lang/IllegalArgumentException
    //   13	61	64	finally
    //   64	68	64	finally
    //   71	82	85	java/lang/IllegalArgumentException
  }
  
  static {
    // Byte code:
    //   0: bipush #40
    //   2: ldc '~*F3iP4L<&(N#E9,mX'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zshv.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #20
    //   82: goto -> 111
    //   85: bipush #110
    //   87: goto -> 111
    //   90: iconst_1
    //   91: goto -> 111
    //   94: bipush #87
    //   96: goto -> 111
    //   99: bipush #112
    //   101: goto -> 111
    //   104: bipush #119
    //   106: goto -> 111
    //   109: bipush #32
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
    //   153: new burp/Zg5v
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: putstatic burp/Zshv.Zr : Lburp/Zg5v;
    //   163: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zshv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */