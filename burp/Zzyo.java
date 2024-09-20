package burp;

import java.util.List;

public class Zzyo {
  public static Zez3[] Za(Zez3[] paramArrayOfZez3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic ZF : ()[I
    //   5: iconst_0
    //   6: istore_3
    //   7: astore_1
    //   8: iload_3
    //   9: aload_0
    //   10: arraylength
    //   11: if_icmpge -> 140
    //   14: aload_0
    //   15: iload_3
    //   16: aaload
    //   17: ifnonnull -> 26
    //   20: iconst_1
    //   21: istore_2
    //   22: aload_1
    //   23: ifnull -> 133
    //   26: iload_3
    //   27: iconst_1
    //   28: iadd
    //   29: istore #4
    //   31: iload #4
    //   33: aload_0
    //   34: arraylength
    //   35: if_icmpge -> 133
    //   38: aload_0
    //   39: iload #4
    //   41: aaload
    //   42: ifnonnull -> 51
    //   45: iconst_1
    //   46: istore_2
    //   47: aload_1
    //   48: ifnull -> 126
    //   51: aload_0
    //   52: iload_3
    //   53: aaload
    //   54: aload_0
    //   55: iload #4
    //   57: aaload
    //   58: invokeinterface Zl : (Lburp/Zez3;)Z
    //   63: ifeq -> 77
    //   66: aload_0
    //   67: iload #4
    //   69: aconst_null
    //   70: aastore
    //   71: iconst_1
    //   72: istore_2
    //   73: aload_1
    //   74: ifnull -> 109
    //   77: aload_0
    //   78: iload_3
    //   79: aaload
    //   80: aload_0
    //   81: iload #4
    //   83: aaload
    //   84: invokeinterface ZO : (Lburp/Zez3;)Z
    //   89: ifeq -> 109
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: iload_3
    //   101: aconst_null
    //   102: aastore
    //   103: iconst_1
    //   104: istore_2
    //   105: aload_1
    //   106: ifnull -> 133
    //   109: goto -> 126
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: astore #5
    //   118: aload #5
    //   120: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   123: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   126: iinc #4, 1
    //   129: aload_1
    //   130: ifnull -> 31
    //   133: iinc #3, 1
    //   136: aload_1
    //   137: ifnull -> 8
    //   140: iload_2
    //   141: ifne -> 150
    //   144: aload_0
    //   145: areturn
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: new java/util/ArrayList
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore_3
    //   158: aload_0
    //   159: astore #4
    //   161: aload #4
    //   163: arraylength
    //   164: istore #5
    //   166: iconst_0
    //   167: istore #6
    //   169: iload #6
    //   171: iload #5
    //   173: if_icmpge -> 211
    //   176: aload #4
    //   178: iload #6
    //   180: aaload
    //   181: astore #7
    //   183: aload #7
    //   185: ifnull -> 204
    //   188: aload_3
    //   189: aload #7
    //   191: invokeinterface add : (Ljava/lang/Object;)Z
    //   196: pop
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: iinc #6, 1
    //   207: aload_1
    //   208: ifnull -> 169
    //   211: aload_3
    //   212: invokeinterface size : ()I
    //   217: anewarray burp/Zez3
    //   220: astore_0
    //   221: aload_3
    //   222: aload_0
    //   223: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   228: pop
    //   229: aload_0
    //   230: areturn
    // Exception table:
    //   from	to	target	type
    //   51	105	116	java/lang/Exception
    //   73	92	95	java/lang/Exception
    //   105	112	112	java/lang/Exception
    //   140	146	146	java/lang/Exception
    //   183	197	200	java/lang/Exception
  }
  
  public static boolean Zx(List<Zez3> paramList, Zez3 paramZez3, Zlc8 paramZlc8, float paramFloat1, float paramFloat2, String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic Zh : (Lburp/Zez3;)Z
    //   4: ifne -> 21
    //   7: aload_1
    //   8: invokestatic ZX : (Lburp/Zez3;)Z
    //   11: ifeq -> 36
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload_0
    //   22: aload_1
    //   23: invokeinterface add : (Ljava/lang/Object;)Z
    //   28: pop
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_2
    //   37: fload_3
    //   38: aload #5
    //   40: invokeinterface Zq : (FLjava/lang/String;)Z
    //   45: ifne -> 50
    //   48: iconst_0
    //   49: ireturn
    //   50: aload_1
    //   51: invokeinterface ZkP : ()I
    //   56: istore #6
    //   58: iload #6
    //   60: ifne -> 65
    //   63: iconst_1
    //   64: ireturn
    //   65: fload #4
    //   67: iload #6
    //   69: i2f
    //   70: fdiv
    //   71: fstore #7
    //   73: new burp/Zl9e
    //   76: dup
    //   77: aload_0
    //   78: aload_2
    //   79: fload_3
    //   80: fload #7
    //   82: aload #5
    //   84: invokespecial <init> : (Ljava/util/List;Lburp/Zlc8;FFLjava/lang/String;)V
    //   87: astore #8
    //   89: aload_1
    //   90: aload #8
    //   92: invokeinterface ZK : (Lburp/Zl9l;)Z
    //   97: ifeq -> 102
    //   100: iconst_0
    //   101: ireturn
    //   102: goto -> 115
    //   105: astore #6
    //   107: aload #6
    //   109: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   112: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   115: iconst_1
    //   116: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/Exception
    //   0	49	105	java/lang/Exception
    //   7	29	32	java/lang/Exception
    //   50	64	105	java/lang/Exception
    //   65	101	105	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzyo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */