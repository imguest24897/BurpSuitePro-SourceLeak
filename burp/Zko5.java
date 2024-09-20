package burp;

public final class Zko5 {
  public static byte Zi(String paramString) {
    try {
      if (paramString.isEmpty())
        return 0; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (Zf(paramString))
        return 4; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (Zmab.ZE(paramString))
        return 6; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static boolean Zf(String paramString) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: astore_1
    //   4: iconst_0
    //   5: istore_2
    //   6: iconst_0
    //   7: istore_3
    //   8: iload_2
    //   9: aload_0
    //   10: invokevirtual length : ()I
    //   13: if_icmpge -> 190
    //   16: iload_2
    //   17: istore #4
    //   19: iload_2
    //   20: aload_0
    //   21: invokevirtual length : ()I
    //   24: if_icmpge -> 68
    //   27: aload_0
    //   28: iload_2
    //   29: invokevirtual charAt : (I)C
    //   32: bipush #48
    //   34: if_icmplt -> 68
    //   37: aload_0
    //   38: iload_2
    //   39: invokevirtual charAt : (I)C
    //   42: bipush #57
    //   44: if_icmpgt -> 68
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   53: athrow
    //   54: iinc #2, 1
    //   57: aload_1
    //   58: ifnull -> 19
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   67: athrow
    //   68: aload_0
    //   69: iload #4
    //   71: iload_2
    //   72: invokevirtual substring : (II)Ljava/lang/String;
    //   75: invokestatic parseInt : (Ljava/lang/String;)I
    //   78: istore #5
    //   80: iload #5
    //   82: iflt -> 100
    //   85: iload #5
    //   87: sipush #255
    //   90: if_icmple -> 102
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   99: athrow
    //   100: iconst_0
    //   101: ireturn
    //   102: iload_2
    //   103: aload_0
    //   104: invokevirtual length : ()I
    //   107: iconst_1
    //   108: isub
    //   109: if_icmplt -> 124
    //   112: iload_3
    //   113: iconst_3
    //   114: if_icmpne -> 151
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   123: athrow
    //   124: iload_3
    //   125: iconst_3
    //   126: if_icmpne -> 153
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   135: athrow
    //   136: iload_2
    //   137: aload_0
    //   138: invokevirtual length : ()I
    //   141: if_icmpeq -> 153
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   150: athrow
    //   151: iconst_0
    //   152: ireturn
    //   153: iload_2
    //   154: aload_0
    //   155: invokevirtual length : ()I
    //   158: if_icmpge -> 180
    //   161: aload_0
    //   162: iload_2
    //   163: invokevirtual charAt : (I)C
    //   166: bipush #46
    //   168: if_icmpeq -> 180
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   177: athrow
    //   178: iconst_0
    //   179: ireturn
    //   180: iinc #2, 1
    //   183: iinc #3, 1
    //   186: aload_1
    //   187: ifnull -> 8
    //   190: iconst_1
    //   191: ireturn
    //   192: astore_2
    //   193: aload_2
    //   194: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   197: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   200: iconst_0
    //   201: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	101	192	java/lang/NumberFormatException
    //   27	47	50	java/lang/NumberFormatException
    //   37	61	64	java/lang/NumberFormatException
    //   80	93	96	java/lang/NumberFormatException
    //   102	117	120	java/lang/NumberFormatException
    //   102	152	192	java/lang/NumberFormatException
    //   112	129	132	java/lang/NumberFormatException
    //   124	144	147	java/lang/NumberFormatException
    //   153	171	174	java/lang/NumberFormatException
    //   153	179	192	java/lang/NumberFormatException
    //   180	191	192	java/lang/NumberFormatException
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zko5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */