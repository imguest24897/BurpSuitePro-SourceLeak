package com.fasterxml.Zj;

public enum Zx {
  Fail, TryConvert, AsNull, AsEmpty;
  
  private static String Zy;
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '7)pL[A)}%:`c'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: aconst_null
    //   18: bipush #10
    //   20: istore_2
    //   21: invokestatic ZU : (Ljava/lang/String;)V
    //   24: iconst_m1
    //   25: istore_1
    //   26: bipush #92
    //   28: iinc #1, 1
    //   31: aload_3
    //   32: iload_1
    //   33: dup
    //   34: iload_2
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 133
    //   43: aload_0
    //   44: swap
    //   45: iload #4
    //   47: iinc #4, 1
    //   50: swap
    //   51: aastore
    //   52: iload_1
    //   53: iload_2
    //   54: iadd
    //   55: dup
    //   56: istore_1
    //   57: iload #5
    //   59: if_icmpge -> 71
    //   62: aload_3
    //   63: iload_1
    //   64: invokevirtual charAt : (I)C
    //   67: istore_2
    //   68: goto -> 26
    //   71: ldc ';1U{XW;1^c@'
    //   73: dup
    //   74: astore_3
    //   75: invokevirtual length : ()I
    //   78: istore #5
    //   80: bipush #7
    //   82: istore_2
    //   83: iconst_m1
    //   84: istore_1
    //   85: bipush #69
    //   87: iinc #1, 1
    //   90: aload_3
    //   91: iload_1
    //   92: dup
    //   93: iload_2
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 133
    //   102: aload_0
    //   103: swap
    //   104: iload #4
    //   106: iinc #4, 1
    //   109: swap
    //   110: aastore
    //   111: iload_1
    //   112: iload_2
    //   113: iadd
    //   114: dup
    //   115: istore_1
    //   116: iload #5
    //   118: if_icmpge -> 130
    //   121: aload_3
    //   122: iload_1
    //   123: invokevirtual charAt : (I)C
    //   126: istore_2
    //   127: goto -> 85
    //   130: goto -> 292
    //   133: dup_x2
    //   134: pop
    //   135: invokevirtual toCharArray : ()[C
    //   138: dup_x1
    //   139: arraylength
    //   140: dup_x2
    //   141: pop
    //   142: iconst_0
    //   143: istore #6
    //   145: dup2_x1
    //   146: pop2
    //   147: dup_x2
    //   148: iconst_1
    //   149: if_icmpgt -> 252
    //   152: dup2
    //   153: swap
    //   154: iload #6
    //   156: dup2_x1
    //   157: caload
    //   158: swap
    //   159: iload #6
    //   161: bipush #7
    //   163: irem
    //   164: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #63
    //   206: goto -> 236
    //   209: bipush #7
    //   211: goto -> 236
    //   214: bipush #85
    //   216: goto -> 236
    //   219: bipush #83
    //   221: goto -> 236
    //   224: bipush #55
    //   226: goto -> 236
    //   229: bipush #105
    //   231: goto -> 236
    //   234: bipush #107
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 156
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 152
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 43, 0 -> 102
    //   292: new com/fasterxml/Zj/Zx
    //   295: dup
    //   296: aload_0
    //   297: iconst_1
    //   298: aaload
    //   299: iconst_0
    //   300: invokespecial <init> : (Ljava/lang/String;I)V
    //   303: putstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   306: new com/fasterxml/Zj/Zx
    //   309: dup
    //   310: aload_0
    //   311: iconst_0
    //   312: aaload
    //   313: iconst_1
    //   314: invokespecial <init> : (Ljava/lang/String;I)V
    //   317: putstatic com/fasterxml/Zj/Zx.TryConvert : Lcom/fasterxml/Zj/Zx;
    //   320: new com/fasterxml/Zj/Zx
    //   323: dup
    //   324: aload_0
    //   325: iconst_3
    //   326: aaload
    //   327: iconst_2
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: putstatic com/fasterxml/Zj/Zx.AsNull : Lcom/fasterxml/Zj/Zx;
    //   334: new com/fasterxml/Zj/Zx
    //   337: dup
    //   338: aload_0
    //   339: iconst_2
    //   340: aaload
    //   341: iconst_3
    //   342: invokespecial <init> : (Ljava/lang/String;I)V
    //   345: putstatic com/fasterxml/Zj/Zx.AsEmpty : Lcom/fasterxml/Zj/Zx;
    //   348: iconst_4
    //   349: anewarray com/fasterxml/Zj/Zx
    //   352: dup
    //   353: iconst_0
    //   354: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   357: aastore
    //   358: dup
    //   359: iconst_1
    //   360: getstatic com/fasterxml/Zj/Zx.TryConvert : Lcom/fasterxml/Zj/Zx;
    //   363: aastore
    //   364: dup
    //   365: iconst_2
    //   366: getstatic com/fasterxml/Zj/Zx.AsNull : Lcom/fasterxml/Zj/Zx;
    //   369: aastore
    //   370: dup
    //   371: iconst_3
    //   372: getstatic com/fasterxml/Zj/Zx.AsEmpty : Lcom/fasterxml/Zj/Zx;
    //   375: aastore
    //   376: putstatic com/fasterxml/Zj/Zx.ZU : [Lcom/fasterxml/Zj/Zx;
    //   379: return
  }
  
  public static void ZU(String paramString) {
    Zy = paramString;
  }
  
  public static String ZL() {
    return Zy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */