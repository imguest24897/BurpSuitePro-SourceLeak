package com.fasterxml.Zr;

import burp.Zbqc;

public enum Zm {
  NO_MATCH, INCONCLUSIVE, WEAK_MATCH, SOLID_MATCH, FULL_MATCH;
  
  private static Zbqc[] Zo;
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: iconst_1
    //   9: anewarray burp/Zbqc
    //   12: ldc 'ONc4}CI\\nVD}2dAUBt\\nGTp5dAUBt'
    //   14: dup
    //   15: astore_3
    //   16: invokevirtual length : ()I
    //   19: istore #5
    //   21: bipush #8
    //   23: istore_2
    //   24: iconst_m1
    //   25: istore_1
    //   26: invokestatic Zp : ([Lburp/Zbqc;)V
    //   29: bipush #106
    //   31: iinc #1, 1
    //   34: aload_3
    //   35: iload_1
    //   36: dup
    //   37: iload_2
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 136
    //   46: aload_0
    //   47: swap
    //   48: iload #4
    //   50: iinc #4, 1
    //   53: swap
    //   54: aastore
    //   55: iload_1
    //   56: iload_2
    //   57: iadd
    //   58: dup
    //   59: istore_1
    //   60: iload #5
    //   62: if_icmpge -> 74
    //   65: aload_3
    //   66: iload_1
    //   67: invokevirtual charAt : (I)C
    //   70: istore_2
    //   71: goto -> 29
    //   74: ldc 'soQ9Wlat^\\fin^3KmusT8'
    //   76: dup
    //   77: astore_3
    //   78: invokevirtual length : ()I
    //   81: istore #5
    //   83: bipush #11
    //   85: istore_2
    //   86: iconst_m1
    //   87: istore_1
    //   88: bipush #75
    //   90: iinc #1, 1
    //   93: aload_3
    //   94: iload_1
    //   95: dup
    //   96: iload_2
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 136
    //   105: aload_0
    //   106: swap
    //   107: iload #4
    //   109: iinc #4, 1
    //   112: swap
    //   113: aastore
    //   114: iload_1
    //   115: iload_2
    //   116: iadd
    //   117: dup
    //   118: istore_1
    //   119: iload #5
    //   121: if_icmpge -> 133
    //   124: aload_3
    //   125: iload_1
    //   126: invokevirtual charAt : (I)C
    //   129: istore_2
    //   130: goto -> 88
    //   133: goto -> 292
    //   136: dup_x2
    //   137: pop
    //   138: invokevirtual toCharArray : ()[C
    //   141: dup_x1
    //   142: arraylength
    //   143: dup_x2
    //   144: pop
    //   145: iconst_0
    //   146: istore #6
    //   148: dup2_x1
    //   149: pop2
    //   150: dup_x2
    //   151: iconst_1
    //   152: if_icmpgt -> 252
    //   155: dup2
    //   156: swap
    //   157: iload #6
    //   159: dup2_x1
    //   160: caload
    //   161: swap
    //   162: iload #6
    //   164: bipush #7
    //   166: irem
    //   167: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #107
    //   206: goto -> 236
    //   209: bipush #107
    //   211: goto -> 236
    //   214: bipush #86
    //   216: goto -> 236
    //   219: bipush #19
    //   221: goto -> 236
    //   224: bipush #54
    //   226: goto -> 236
    //   229: bipush #67
    //   231: goto -> 236
    //   234: bipush #106
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 159
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 155
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 46, 0 -> 105
    //   292: new com/fasterxml/Zr/Zm
    //   295: dup
    //   296: aload_0
    //   297: iconst_0
    //   298: aaload
    //   299: iconst_0
    //   300: invokespecial <init> : (Ljava/lang/String;I)V
    //   303: putstatic com/fasterxml/Zr/Zm.NO_MATCH : Lcom/fasterxml/Zr/Zm;
    //   306: new com/fasterxml/Zr/Zm
    //   309: dup
    //   310: aload_0
    //   311: iconst_4
    //   312: aaload
    //   313: iconst_1
    //   314: invokespecial <init> : (Ljava/lang/String;I)V
    //   317: putstatic com/fasterxml/Zr/Zm.INCONCLUSIVE : Lcom/fasterxml/Zr/Zm;
    //   320: new com/fasterxml/Zr/Zm
    //   323: dup
    //   324: aload_0
    //   325: iconst_1
    //   326: aaload
    //   327: iconst_2
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: putstatic com/fasterxml/Zr/Zm.WEAK_MATCH : Lcom/fasterxml/Zr/Zm;
    //   334: new com/fasterxml/Zr/Zm
    //   337: dup
    //   338: aload_0
    //   339: iconst_3
    //   340: aaload
    //   341: iconst_3
    //   342: invokespecial <init> : (Ljava/lang/String;I)V
    //   345: putstatic com/fasterxml/Zr/Zm.SOLID_MATCH : Lcom/fasterxml/Zr/Zm;
    //   348: new com/fasterxml/Zr/Zm
    //   351: dup
    //   352: aload_0
    //   353: iconst_2
    //   354: aaload
    //   355: iconst_4
    //   356: invokespecial <init> : (Ljava/lang/String;I)V
    //   359: putstatic com/fasterxml/Zr/Zm.FULL_MATCH : Lcom/fasterxml/Zr/Zm;
    //   362: iconst_5
    //   363: anewarray com/fasterxml/Zr/Zm
    //   366: dup
    //   367: iconst_0
    //   368: getstatic com/fasterxml/Zr/Zm.NO_MATCH : Lcom/fasterxml/Zr/Zm;
    //   371: aastore
    //   372: dup
    //   373: iconst_1
    //   374: getstatic com/fasterxml/Zr/Zm.INCONCLUSIVE : Lcom/fasterxml/Zr/Zm;
    //   377: aastore
    //   378: dup
    //   379: iconst_2
    //   380: getstatic com/fasterxml/Zr/Zm.WEAK_MATCH : Lcom/fasterxml/Zr/Zm;
    //   383: aastore
    //   384: dup
    //   385: iconst_3
    //   386: getstatic com/fasterxml/Zr/Zm.SOLID_MATCH : Lcom/fasterxml/Zr/Zm;
    //   389: aastore
    //   390: dup
    //   391: iconst_4
    //   392: getstatic com/fasterxml/Zr/Zm.FULL_MATCH : Lcom/fasterxml/Zr/Zm;
    //   395: aastore
    //   396: putstatic com/fasterxml/Zr/Zm.Zl : [Lcom/fasterxml/Zr/Zm;
    //   399: return
  }
  
  public static void Zp(Zbqc[] paramArrayOfZbqc) {
    Zo = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zr() {
    return Zo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zr\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */