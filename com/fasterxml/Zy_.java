package com.fasterxml;

import com.fasterxml.Zc.Zm;

public enum Zy_ implements Zm {
  NORMALIZE_DESERIALIZED_ZONE_ID, ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS, ONE_BASED_MONTHS;
  
  private final boolean ZN;
  
  private final int Zh;
  
  Zy_(boolean paramBoolean) {
    this.ZN = paramBoolean;
    this.Zh = 1 << ordinal();
  }
  
  public boolean ZP() {
    return this.ZN;
  }
  
  public boolean ZR(int paramInt) {
    return ((paramInt & this.Zh) != 0);
  }
  
  public int ZV() {
    return this.Zh;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '%Zz\\n\\nH%Za\\bD0DdQ-SiC!IyD0W` +XhD!RrC,E*Y^>SrR6_l\\rR IwH-R'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #40
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #55
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
    //   140: bipush #83
    //   142: goto -> 172
    //   145: bipush #33
    //   147: goto -> 172
    //   150: bipush #26
    //   152: goto -> 172
    //   155: bipush #124
    //   157: goto -> 172
    //   160: bipush #100
    //   162: goto -> 172
    //   165: bipush #96
    //   167: goto -> 172
    //   170: bipush #32
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
    //   215: new com/fasterxml/Zy_
    //   218: dup
    //   219: aload_0
    //   220: iconst_2
    //   221: aaload
    //   222: iconst_0
    //   223: iconst_1
    //   224: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   227: putstatic com/fasterxml/Zy_.NORMALIZE_DESERIALIZED_ZONE_ID : Lcom/fasterxml/Zy_;
    //   230: new com/fasterxml/Zy_
    //   233: dup
    //   234: aload_0
    //   235: iconst_0
    //   236: aaload
    //   237: iconst_1
    //   238: iconst_0
    //   239: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   242: putstatic com/fasterxml/Zy_.ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS : Lcom/fasterxml/Zy_;
    //   245: new com/fasterxml/Zy_
    //   248: dup
    //   249: aload_0
    //   250: iconst_1
    //   251: aaload
    //   252: iconst_2
    //   253: iconst_0
    //   254: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   257: putstatic com/fasterxml/Zy_.ONE_BASED_MONTHS : Lcom/fasterxml/Zy_;
    //   260: iconst_3
    //   261: anewarray com/fasterxml/Zy_
    //   264: dup
    //   265: iconst_0
    //   266: getstatic com/fasterxml/Zy_.NORMALIZE_DESERIALIZED_ZONE_ID : Lcom/fasterxml/Zy_;
    //   269: aastore
    //   270: dup
    //   271: iconst_1
    //   272: getstatic com/fasterxml/Zy_.ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS : Lcom/fasterxml/Zy_;
    //   275: aastore
    //   276: dup
    //   277: iconst_2
    //   278: getstatic com/fasterxml/Zy_.ONE_BASED_MONTHS : Lcom/fasterxml/Zy_;
    //   281: aastore
    //   282: putstatic com/fasterxml/Zy_.Z_ : [Lcom/fasterxml/Zy_;
    //   285: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */