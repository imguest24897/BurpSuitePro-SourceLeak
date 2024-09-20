package com.fasterxml.Zb;

import com.fasterxml.Zc.Zm;

public enum Zm6 implements Zm {
  CAN_WRITE_BINARY_NATIVELY, CAN_WRITE_FORMATTED_NUMBERS;
  
  private final boolean ZS;
  
  private final int ZF;
  
  Zm6(boolean paramBoolean) {
    this.ZS = paramBoolean;
    this.ZF = 1 << ordinal();
  }
  
  public boolean ZP() {
    return this.ZS;
  }
  
  public boolean ZR(int paramInt) {
    return ((paramInt & this.ZF) != 0);
  }
  
  public int ZV() {
    return this.ZF;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'V\\ny[KYA`CK]TcHF^@c^JV\\ny[KYAdEWQGhMMYC\\b'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #27
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #19
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
    //   67: goto -> 214
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
    //   86: if_icmpgt -> 187
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
    //   140: bipush #6
    //   142: goto -> 171
    //   145: bipush #72
    //   147: goto -> 171
    //   150: bipush #87
    //   152: goto -> 171
    //   155: bipush #53
    //   157: goto -> 171
    //   160: bipush #31
    //   162: goto -> 171
    //   165: bipush #10
    //   167: goto -> 171
    //   170: iconst_3
    //   171: ixor
    //   172: ixor
    //   173: i2c
    //   174: castore
    //   175: iinc #6, 1
    //   178: dup
    //   179: ifne -> 187
    //   182: dup2
    //   183: dup_x1
    //   184: goto -> 93
    //   187: dup2_x1
    //   188: pop2
    //   189: dup_x2
    //   190: iload #6
    //   192: if_icmpgt -> 89
    //   195: pop
    //   196: new java/lang/String
    //   199: dup_x1
    //   200: swap
    //   201: invokespecial <init> : ([C)V
    //   204: invokevirtual intern : ()Ljava/lang/String;
    //   207: swap
    //   208: pop
    //   209: swap
    //   210: pop
    //   211: goto -> 39
    //   214: new com/fasterxml/Zb/Zm6
    //   217: dup
    //   218: aload_0
    //   219: iconst_1
    //   220: aaload
    //   221: iconst_0
    //   222: iconst_0
    //   223: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   226: putstatic com/fasterxml/Zb/Zm6.CAN_WRITE_BINARY_NATIVELY : Lcom/fasterxml/Zb/Zm6;
    //   229: new com/fasterxml/Zb/Zm6
    //   232: dup
    //   233: aload_0
    //   234: iconst_0
    //   235: aaload
    //   236: iconst_1
    //   237: iconst_0
    //   238: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   241: putstatic com/fasterxml/Zb/Zm6.CAN_WRITE_FORMATTED_NUMBERS : Lcom/fasterxml/Zb/Zm6;
    //   244: iconst_2
    //   245: anewarray com/fasterxml/Zb/Zm6
    //   248: dup
    //   249: iconst_0
    //   250: getstatic com/fasterxml/Zb/Zm6.CAN_WRITE_BINARY_NATIVELY : Lcom/fasterxml/Zb/Zm6;
    //   253: aastore
    //   254: dup
    //   255: iconst_1
    //   256: getstatic com/fasterxml/Zb/Zm6.CAN_WRITE_FORMATTED_NUMBERS : Lcom/fasterxml/Zb/Zm6;
    //   259: aastore
    //   260: putstatic com/fasterxml/Zb/Zm6.Zm : [Lcom/fasterxml/Zb/Zm6;
    //   263: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zm6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */