package com.fasterxml.Zb;

public enum Zc {
  PADDING_FORBIDDEN, PADDING_REQUIRED, PADDING_ALLOWED;
  
  private static final Zc[] Zn;
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'goQ+pfsV>jgoQ+pldV(kmgoQ+poiH)k'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #16
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #81
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: goto -> 215
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 188
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #126
    //   142: goto -> 172
    //   145: bipush #12
    //   147: goto -> 172
    //   150: bipush #114
    //   152: goto -> 172
    //   155: bipush #26
    //   157: goto -> 172
    //   160: bipush #119
    //   162: goto -> 172
    //   165: bipush #78
    //   167: goto -> 172
    //   170: bipush #61
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 93
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 89
    //   196: pop
    //   197: new java/lang/String
    //   200: dup_x1
    //   201: swap
    //   202: invokespecial <init> : ([C)V
    //   205: invokevirtual intern : ()Ljava/lang/String;
    //   208: swap
    //   209: pop
    //   210: swap
    //   211: pop
    //   212: goto -> 39
    //   215: new com/fasterxml/Zb/Zc
    //   218: dup
    //   219: aload_0
    //   220: iconst_1
    //   221: aaload
    //   222: iconst_0
    //   223: invokespecial <init> : (Ljava/lang/String;I)V
    //   226: putstatic com/fasterxml/Zb/Zc.PADDING_FORBIDDEN : Lcom/fasterxml/Zb/Zc;
    //   229: new com/fasterxml/Zb/Zc
    //   232: dup
    //   233: aload_0
    //   234: iconst_0
    //   235: aaload
    //   236: iconst_1
    //   237: invokespecial <init> : (Ljava/lang/String;I)V
    //   240: putstatic com/fasterxml/Zb/Zc.PADDING_REQUIRED : Lcom/fasterxml/Zb/Zc;
    //   243: new com/fasterxml/Zb/Zc
    //   246: dup
    //   247: aload_0
    //   248: iconst_2
    //   249: aaload
    //   250: iconst_2
    //   251: invokespecial <init> : (Ljava/lang/String;I)V
    //   254: putstatic com/fasterxml/Zb/Zc.PADDING_ALLOWED : Lcom/fasterxml/Zb/Zc;
    //   257: iconst_3
    //   258: anewarray com/fasterxml/Zb/Zc
    //   261: dup
    //   262: iconst_0
    //   263: getstatic com/fasterxml/Zb/Zc.PADDING_FORBIDDEN : Lcom/fasterxml/Zb/Zc;
    //   266: aastore
    //   267: dup
    //   268: iconst_1
    //   269: getstatic com/fasterxml/Zb/Zc.PADDING_REQUIRED : Lcom/fasterxml/Zb/Zc;
    //   272: aastore
    //   273: dup
    //   274: iconst_2
    //   275: getstatic com/fasterxml/Zb/Zc.PADDING_ALLOWED : Lcom/fasterxml/Zb/Zc;
    //   278: aastore
    //   279: putstatic com/fasterxml/Zb/Zc.Zn : [Lcom/fasterxml/Zb/Zc;
    //   282: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */