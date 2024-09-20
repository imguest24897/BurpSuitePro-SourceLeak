package com.fasterxml.Zy;

enum Zz {
  IDLE, REQUIRED, PROCESSING;
  
  private static final Zz[] Zn;
  
  abstract boolean ZB(boolean paramBoolean);
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'Rz.\\bI{3\\bI\\f_\\nKl-ERp%'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: iconst_4
    //   18: istore_2
    //   19: iconst_m1
    //   20: istore_1
    //   21: bipush #86
    //   23: iinc #1, 1
    //   26: aload_3
    //   27: iload_1
    //   28: dup
    //   29: iload_2
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 69
    //   38: aload_0
    //   39: swap
    //   40: iload #4
    //   42: iinc #4, 1
    //   45: swap
    //   46: aastore
    //   47: iload_1
    //   48: iload_2
    //   49: iadd
    //   50: dup
    //   51: istore_1
    //   52: iload #5
    //   54: if_icmpge -> 66
    //   57: aload_3
    //   58: iload_1
    //   59: invokevirtual charAt : (I)C
    //   62: istore_2
    //   63: goto -> 21
    //   66: goto -> 215
    //   69: dup_x2
    //   70: pop
    //   71: invokevirtual toCharArray : ()[C
    //   74: dup_x1
    //   75: arraylength
    //   76: dup_x2
    //   77: pop
    //   78: iconst_0
    //   79: istore #6
    //   81: dup2_x1
    //   82: pop2
    //   83: dup_x2
    //   84: iconst_1
    //   85: if_icmpgt -> 188
    //   88: dup2
    //   89: swap
    //   90: iload #6
    //   92: dup2_x1
    //   93: caload
    //   94: swap
    //   95: iload #6
    //   97: bipush #7
    //   99: irem
    //   100: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #77
    //   142: goto -> 172
    //   145: bipush #104
    //   147: goto -> 172
    //   150: bipush #52
    //   152: goto -> 172
    //   155: bipush #11
    //   157: goto -> 172
    //   160: bipush #86
    //   162: goto -> 172
    //   165: bipush #11
    //   167: goto -> 172
    //   170: bipush #31
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 92
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 88
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
    //   212: goto -> 38
    //   215: new com/fasterxml/Zy/Ze
    //   218: dup
    //   219: aload_0
    //   220: iconst_0
    //   221: aaload
    //   222: iconst_0
    //   223: invokespecial <init> : (Ljava/lang/String;I)V
    //   226: putstatic com/fasterxml/Zy/Zz.IDLE : Lcom/fasterxml/Zy/Zz;
    //   229: new com/fasterxml/Zy/Zx
    //   232: dup
    //   233: aload_0
    //   234: iconst_1
    //   235: aaload
    //   236: iconst_1
    //   237: invokespecial <init> : (Ljava/lang/String;I)V
    //   240: putstatic com/fasterxml/Zy/Zz.REQUIRED : Lcom/fasterxml/Zy/Zz;
    //   243: new com/fasterxml/Zy/Zf
    //   246: dup
    //   247: aload_0
    //   248: iconst_2
    //   249: aaload
    //   250: iconst_2
    //   251: invokespecial <init> : (Ljava/lang/String;I)V
    //   254: putstatic com/fasterxml/Zy/Zz.PROCESSING : Lcom/fasterxml/Zy/Zz;
    //   257: iconst_3
    //   258: anewarray com/fasterxml/Zy/Zz
    //   261: dup
    //   262: iconst_0
    //   263: getstatic com/fasterxml/Zy/Zz.IDLE : Lcom/fasterxml/Zy/Zz;
    //   266: aastore
    //   267: dup
    //   268: iconst_1
    //   269: getstatic com/fasterxml/Zy/Zz.REQUIRED : Lcom/fasterxml/Zy/Zz;
    //   272: aastore
    //   273: dup
    //   274: iconst_2
    //   275: getstatic com/fasterxml/Zy/Zz.PROCESSING : Lcom/fasterxml/Zy/Zz;
    //   278: aastore
    //   279: putstatic com/fasterxml/Zy/Zz.Zn : [Lcom/fasterxml/Zy/Zz;
    //   282: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */