package com.fasterxml.Zb;

import com.fasterxml.Zc.Zm;

public enum Zmr implements Zm {
  INTERN_FIELD_NAMES, CANONICALIZE_FIELD_NAMES, FAIL_ON_SYMBOL_HASH_OVERFLOW, USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING, CHARSET_DETECTION;
  
  private final boolean ZK;
  
  private static final Zmr[] Zo;
  
  public static int ZO() {
    int i = 0;
    for (Zmr zmr : values()) {
      if (zmr.ZP())
        i |= zmr.ZV(); 
    } 
    return i;
  }
  
  Zmr(boolean paramBoolean) {
    this.ZK = paramBoolean;
  }
  
  public boolean ZP() {
    return this.ZK;
  }
  
  public boolean ZR(int paramInt) {
    return ((paramInt & ZV()) != 0);
  }
  
  public int ZV() {
    return 1 << ordinal();
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'eM5szF-|_%rgF/|D=lmV,uI.yiF4jB(zwG<eE9saV-bA9l%v_9`qA1fM8`iF b@#yj[<aY:y`[<qI?ffE*mK'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #28
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #15
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
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
    //   67: ldc 'v[$f}V6tV#sv@3|_&mlQ4x_9vR+{`Z!j^/}v\!|U$'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #24
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #25
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 247
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 229, 0 -> 200, 1 -> 205, 2 -> 209, 3 -> 214, 4 -> 219, 5 -> 224
    //   200: bipush #44
    //   202: goto -> 231
    //   205: iconst_3
    //   206: goto -> 231
    //   209: bipush #115
    //   211: goto -> 231
    //   214: bipush #48
    //   216: goto -> 231
    //   219: bipush #42
    //   221: goto -> 231
    //   224: bipush #6
    //   226: goto -> 231
    //   229: bipush #108
    //   231: ixor
    //   232: ixor
    //   233: i2c
    //   234: castore
    //   235: iinc #6, 1
    //   238: dup
    //   239: ifne -> 247
    //   242: dup2
    //   243: dup_x1
    //   244: goto -> 152
    //   247: dup2_x1
    //   248: pop2
    //   249: dup_x2
    //   250: iload #6
    //   252: if_icmpgt -> 148
    //   255: pop
    //   256: new java/lang/String
    //   259: dup_x1
    //   260: swap
    //   261: invokespecial <init> : ([C)V
    //   264: invokevirtual intern : ()Ljava/lang/String;
    //   267: swap
    //   268: pop
    //   269: swap
    //   270: tableswitch default -> 39, 0 -> 98
    //   288: new com/fasterxml/Zb/Zmr
    //   291: dup
    //   292: aload_0
    //   293: iconst_1
    //   294: aaload
    //   295: iconst_0
    //   296: iconst_1
    //   297: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   300: putstatic com/fasterxml/Zb/Zmr.INTERN_FIELD_NAMES : Lcom/fasterxml/Zb/Zmr;
    //   303: new com/fasterxml/Zb/Zmr
    //   306: dup
    //   307: aload_0
    //   308: iconst_3
    //   309: aaload
    //   310: iconst_1
    //   311: iconst_1
    //   312: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   315: putstatic com/fasterxml/Zb/Zmr.CANONICALIZE_FIELD_NAMES : Lcom/fasterxml/Zb/Zmr;
    //   318: new com/fasterxml/Zb/Zmr
    //   321: dup
    //   322: aload_0
    //   323: iconst_0
    //   324: aaload
    //   325: iconst_2
    //   326: iconst_1
    //   327: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   330: putstatic com/fasterxml/Zb/Zmr.FAIL_ON_SYMBOL_HASH_OVERFLOW : Lcom/fasterxml/Zb/Zmr;
    //   333: new com/fasterxml/Zb/Zmr
    //   336: dup
    //   337: aload_0
    //   338: iconst_2
    //   339: aaload
    //   340: iconst_3
    //   341: iconst_1
    //   342: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   345: putstatic com/fasterxml/Zb/Zmr.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING : Lcom/fasterxml/Zb/Zmr;
    //   348: new com/fasterxml/Zb/Zmr
    //   351: dup
    //   352: aload_0
    //   353: iconst_4
    //   354: aaload
    //   355: iconst_4
    //   356: iconst_1
    //   357: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   360: putstatic com/fasterxml/Zb/Zmr.CHARSET_DETECTION : Lcom/fasterxml/Zb/Zmr;
    //   363: iconst_5
    //   364: anewarray com/fasterxml/Zb/Zmr
    //   367: dup
    //   368: iconst_0
    //   369: getstatic com/fasterxml/Zb/Zmr.INTERN_FIELD_NAMES : Lcom/fasterxml/Zb/Zmr;
    //   372: aastore
    //   373: dup
    //   374: iconst_1
    //   375: getstatic com/fasterxml/Zb/Zmr.CANONICALIZE_FIELD_NAMES : Lcom/fasterxml/Zb/Zmr;
    //   378: aastore
    //   379: dup
    //   380: iconst_2
    //   381: getstatic com/fasterxml/Zb/Zmr.FAIL_ON_SYMBOL_HASH_OVERFLOW : Lcom/fasterxml/Zb/Zmr;
    //   384: aastore
    //   385: dup
    //   386: iconst_3
    //   387: getstatic com/fasterxml/Zb/Zmr.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING : Lcom/fasterxml/Zb/Zmr;
    //   390: aastore
    //   391: dup
    //   392: iconst_4
    //   393: getstatic com/fasterxml/Zb/Zmr.CHARSET_DETECTION : Lcom/fasterxml/Zb/Zmr;
    //   396: aastore
    //   397: putstatic com/fasterxml/Zb/Zmr.Zo : [Lcom/fasterxml/Zb/Zmr;
    //   400: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zmr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */