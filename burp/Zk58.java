package burp;

class Zk58 {
  private static final String a;
  
  Zg33 Zs(Zxei paramZxei, Zzxi paramZzxi, Zt90 paramZt90, Zx5y paramZx5y, Ztwv paramZtwv) throws Ztkd {
    // Byte code:
    //   0: aconst_null
    //   1: astore #6
    //   3: aload_2
    //   4: invokevirtual ZM : ()Lburp/Zra1;
    //   7: astore #7
    //   9: aload #7
    //   11: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_SERVER : Lburp/Zra1;
    //   14: if_acmpeq -> 32
    //   17: aload #7
    //   19: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_AGENT : Lburp/Zra1;
    //   22: if_acmpne -> 47
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: new burp/Ztkp
    //   35: dup
    //   36: aload_3
    //   37: invokespecial <init> : (Lburp/Zt90;)V
    //   40: goto -> 57
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: new burp/Zted
    //   50: dup
    //   51: aload_1
    //   52: aload_2
    //   53: aload_3
    //   54: invokespecial <init> : (Lburp/Zxei;Lburp/Zzxi;Lburp/Zt90;)V
    //   57: astore #8
    //   59: aload_3
    //   60: aload #8
    //   62: aload #4
    //   64: aload #5
    //   66: invokestatic ZF : (Lburp/Zt90;Lburp/Zb6n;Lburp/Zx5y;Lburp/Ztwv;)Lburp/Zg33;
    //   69: astore #6
    //   71: aload #6
    //   73: getfield ZQ : Lburp/Zkvo;
    //   76: astore #9
    //   78: aload #9
    //   80: invokeinterface Zl : ()Ljava/util/Date;
    //   85: pop
    //   86: invokestatic ZG : ()Z
    //   89: ifne -> 139
    //   92: aload #9
    //   94: aload_1
    //   95: invokeinterface Zi : ()Lburp/Zz0n;
    //   100: invokeinterface ZP : ()Lburp/Zrgd;
    //   105: invokeinterface ZJ : (Lburp/Zrgd;)Z
    //   110: ifeq -> 139
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload_1
    //   121: aload_1
    //   122: <illegal opcode> run : (Lburp/Zxei;)Ljava/lang/Runnable;
    //   127: invokeinterface ZY : (Ljava/lang/Runnable;)V
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: invokestatic gc : ()V
    //   142: goto -> 163
    //   145: astore #7
    //   147: aload #7
    //   149: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   152: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   155: new burp/Ztkd
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: athrow
    //   163: aload #6
    //   165: areturn
    // Exception table:
    //   from	to	target	type
    //   3	142	145	java/lang/Exception
    //   9	25	28	java/lang/Exception
    //   17	43	43	java/lang/Exception
    //   78	113	116	java/lang/Exception
    //   92	132	135	java/lang/Exception
  }
  
  private static void lambda$loadLicense$0(Zxei paramZxei) {
    Zx6o.Zv(paramZxei.ZF(), a, Zkce.EXPIRY_WARNING.ZD());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: ldc ':/\\rGhY.sIC?\\fDJTB6'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zk58.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #85
    //   82: goto -> 111
    //   85: bipush #119
    //   87: goto -> 111
    //   90: bipush #82
    //   92: goto -> 111
    //   95: bipush #26
    //   97: goto -> 111
    //   100: bipush #14
    //   102: goto -> 111
    //   105: bipush #22
    //   107: goto -> 111
    //   110: iconst_1
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk58.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */