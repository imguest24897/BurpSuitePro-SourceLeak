package com.fasterxml.Zoi;

import burp.Zbqc;
import java.io.Serializable;
import java.util.Set;

public abstract class Zp implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Set<String> Zl;
  
  private static int ZC;
  
  public abstract boolean ZA(String paramString);
  
  public abstract boolean ZB(String paramString);
  
  protected boolean ZM(String paramString) {
    return (paramString.length() == 0) ? true : Zb(paramString.charAt(0), paramString);
  }
  
  protected boolean Zb(int paramInt, String paramString) {
    switch (paramInt) {
      case 70:
      case 78:
      case 79:
      case 84:
      case 89:
      case 102:
      case 110:
      case 111:
      case 116:
      case 121:
        return Zl.contains(paramString);
      case 126:
        return true;
    } 
    return false;
  }
  
  protected boolean Zj(String paramString) {
    return (paramString.length() > 0) ? Zn(paramString.charAt(0), paramString) : false;
  }
  
  protected boolean Zn(int paramInt, String paramString) {
    switch (paramInt) {
      case 43:
      case 45:
      case 46:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
        return true;
    } 
    return false;
  }
  
  protected boolean Zo(String paramString) {
    int j = paramString.length();
    int i = ZE();
    byte b = 0;
    while (b < j) {
      switch (paramString.charAt(b)) {
        case ',':
        case '[':
        case ']':
        case '{':
        case '}':
          return true;
        case '#':
          if (Zt(paramString, b))
            return true; 
          break;
        case ':':
          if (Ze(paramString, b))
            return true; 
          break;
      } 
      b++;
      if (i == 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zk(++i); 
    return false;
  }
  
  protected boolean Zt(String paramString, int paramInt) {
    return (paramInt == 0) ? true : Zh(paramString.charAt(paramInt - 1));
  }
  
  protected boolean Ze(String paramString, int paramInt) {
    return (paramInt == paramString.length() - 1) ? true : Zh(paramString.charAt(paramInt + 1));
  }
  
  protected boolean Zh(char paramChar) {
    return (' ' == paramChar || '\t' == paramChar);
  }
  
  protected boolean Zx(String paramString) {
    int j = paramString.length();
    byte b = 0;
    int i = ZE();
    while (b < j) {
      char c = paramString.charAt(b);
      if (c < ' ')
        return true; 
      b++;
      if (i == 0) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: iconst_0
    //   10: ldc 'PkLpkLooS1y]\jF`Ga]|J'OoS1ygaF@f`OOsYPKlfhYg{S.GA}|J'G{S.FhY'
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: iconst_3
    //   20: istore_2
    //   21: invokestatic Zk : (I)V
    //   24: iconst_m1
    //   25: istore_1
    //   26: bipush #12
    //   28: iinc #1, 1
    //   31: aload_3
    //   32: iload_1
    //   33: dup
    //   34: iload_2
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 132
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
    //   71: ldc '-1d,"'
    //   73: dup
    //   74: astore_3
    //   75: invokevirtual length : ()I
    //   78: istore #5
    //   80: iconst_4
    //   81: istore_2
    //   82: iconst_m1
    //   83: istore_1
    //   84: bipush #102
    //   86: iinc #1, 1
    //   89: aload_3
    //   90: iload_1
    //   91: dup
    //   92: iload_2
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 132
    //   101: aload_0
    //   102: swap
    //   103: iload #4
    //   105: iinc #4, 1
    //   108: swap
    //   109: aastore
    //   110: iload_1
    //   111: iload_2
    //   112: iadd
    //   113: dup
    //   114: istore_1
    //   115: iload #5
    //   117: if_icmpge -> 129
    //   120: aload_3
    //   121: iload_1
    //   122: invokevirtual charAt : (I)C
    //   125: istore_2
    //   126: goto -> 84
    //   129: goto -> 288
    //   132: dup_x2
    //   133: pop
    //   134: invokevirtual toCharArray : ()[C
    //   137: dup_x1
    //   138: arraylength
    //   139: dup_x2
    //   140: pop
    //   141: iconst_0
    //   142: istore #6
    //   144: dup2_x1
    //   145: pop2
    //   146: dup_x2
    //   147: iconst_1
    //   148: if_icmpgt -> 246
    //   151: dup2
    //   152: swap
    //   153: iload #6
    //   155: dup2_x1
    //   156: caload
    //   157: swap
    //   158: iload #6
    //   160: bipush #7
    //   162: irem
    //   163: tableswitch default -> 228, 0 -> 200, 1 -> 204, 2 -> 208, 3 -> 213, 4 -> 218, 5 -> 223
    //   200: iconst_5
    //   201: goto -> 230
    //   204: iconst_2
    //   205: goto -> 230
    //   208: bipush #51
    //   210: goto -> 230
    //   213: bipush #78
    //   215: goto -> 230
    //   218: bipush #16
    //   220: goto -> 230
    //   223: bipush #21
    //   225: goto -> 230
    //   228: bipush #86
    //   230: ixor
    //   231: ixor
    //   232: i2c
    //   233: castore
    //   234: iinc #6, 1
    //   237: dup
    //   238: ifne -> 246
    //   241: dup2
    //   242: dup_x1
    //   243: goto -> 155
    //   246: dup2_x1
    //   247: pop2
    //   248: dup_x2
    //   249: iload #6
    //   251: if_icmpgt -> 151
    //   254: pop
    //   255: new java/lang/String
    //   258: dup_x1
    //   259: swap
    //   260: invokespecial <init> : ([C)V
    //   263: invokevirtual intern : ()Ljava/lang/String;
    //   266: swap
    //   267: pop
    //   268: swap
    //   269: tableswitch default -> 43, 0 -> 101
    //   288: new java/util/HashSet
    //   291: dup
    //   292: bipush #25
    //   294: anewarray java/lang/String
    //   297: dup
    //   298: iconst_0
    //   299: aload_0
    //   300: iconst_2
    //   301: aaload
    //   302: aastore
    //   303: dup
    //   304: iconst_1
    //   305: aload_0
    //   306: bipush #7
    //   308: aaload
    //   309: aastore
    //   310: dup
    //   311: iconst_2
    //   312: aload_0
    //   313: bipush #11
    //   315: aaload
    //   316: aastore
    //   317: dup
    //   318: iconst_3
    //   319: ldc 'n'
    //   321: aastore
    //   322: dup
    //   323: iconst_4
    //   324: ldc 'N'
    //   326: aastore
    //   327: dup
    //   328: iconst_5
    //   329: aload_0
    //   330: bipush #8
    //   332: aaload
    //   333: aastore
    //   334: dup
    //   335: bipush #6
    //   337: aload_0
    //   338: iconst_5
    //   339: aaload
    //   340: aastore
    //   341: dup
    //   342: bipush #7
    //   344: aload_0
    //   345: bipush #15
    //   347: aaload
    //   348: aastore
    //   349: dup
    //   350: bipush #8
    //   352: aload_0
    //   353: bipush #14
    //   355: aaload
    //   356: aastore
    //   357: dup
    //   358: bipush #9
    //   360: aload_0
    //   361: bipush #17
    //   363: aaload
    //   364: aastore
    //   365: dup
    //   366: bipush #10
    //   368: aload_0
    //   369: bipush #19
    //   371: aaload
    //   372: aastore
    //   373: dup
    //   374: bipush #11
    //   376: aload_0
    //   377: bipush #10
    //   379: aaload
    //   380: aastore
    //   381: dup
    //   382: bipush #12
    //   384: aload_0
    //   385: iconst_4
    //   386: aaload
    //   387: aastore
    //   388: dup
    //   389: bipush #13
    //   391: aload_0
    //   392: bipush #9
    //   394: aaload
    //   395: aastore
    //   396: dup
    //   397: bipush #14
    //   399: aload_0
    //   400: bipush #13
    //   402: aaload
    //   403: aastore
    //   404: dup
    //   405: bipush #15
    //   407: aload_0
    //   408: bipush #18
    //   410: aaload
    //   411: aastore
    //   412: dup
    //   413: bipush #16
    //   415: aload_0
    //   416: bipush #20
    //   418: aaload
    //   419: aastore
    //   420: dup
    //   421: bipush #17
    //   423: aload_0
    //   424: bipush #16
    //   426: aaload
    //   427: aastore
    //   428: dup
    //   429: bipush #18
    //   431: aload_0
    //   432: bipush #6
    //   434: aaload
    //   435: aastore
    //   436: dup
    //   437: bipush #19
    //   439: aload_0
    //   440: iconst_3
    //   441: aaload
    //   442: aastore
    //   443: dup
    //   444: bipush #20
    //   446: ldc 'y'
    //   448: aastore
    //   449: dup
    //   450: bipush #21
    //   452: ldc 'Y'
    //   454: aastore
    //   455: dup
    //   456: bipush #22
    //   458: aload_0
    //   459: iconst_1
    //   460: aaload
    //   461: aastore
    //   462: dup
    //   463: bipush #23
    //   465: aload_0
    //   466: iconst_0
    //   467: aaload
    //   468: aastore
    //   469: dup
    //   470: bipush #24
    //   472: aload_0
    //   473: bipush #12
    //   475: aaload
    //   476: aastore
    //   477: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   480: invokespecial <init> : (Ljava/util/Collection;)V
    //   483: putstatic com/fasterxml/Zoi/Zp.Zl : Ljava/util/Set;
    //   486: return
  }
  
  public static void Zk(int paramInt) {
    ZC = paramInt;
  }
  
  public static int Zr() {
    return ZC;
  }
  
  public static int ZE() {
    int i = Zr();
    return (i == 0) ? 61 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoi\Zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */