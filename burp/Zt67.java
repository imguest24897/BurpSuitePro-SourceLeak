package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zrzt;

public class Zt67 {
  private static final String[][] ZB;
  
  private static int[] ZQ;
  
  public static void ZA(String paramString, int paramInt, List<Zl1r> paramList) {
    int[] arrayOfInt = Zw();
    byte b = 0;
    while (b < ZB.length) {
      List<Zl1r> list = ZI(paramString, b, paramInt);
      if (list != null) {
        paramList.addAll(list);
        return;
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private static List<Zl1r> ZI(String paramString, int paramInt1, int paramInt2) {
    Zl1r zl1r1 = ZO(paramString, paramInt1, 0, 0, paramInt2);
    if (zl1r1 == null)
      return null; 
    Zl1r zl1r2 = ZO(paramString, paramInt1, 1, zl1r1.ZG() - paramInt2, paramInt2);
    if (zl1r2 == null)
      return null; 
    ArrayList<Zl1r> arrayList = new ArrayList();
    arrayList.add(zl1r1);
    arrayList.add(zl1r2);
    Zf(paramString, paramInt1, zl1r2.ZG() - paramInt2, paramInt2, arrayList);
    return arrayList;
  }
  
  private static Zl1r ZO(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    String str = ZB[paramInt1][paramInt2];
    int i = paramString.indexOf(str, paramInt3);
    return (i == -1) ? null : (ZD(paramString, str, i) ? null : (Zk(paramString, str, i) ? null : (Zg(paramString, i) ? null : Zrlp.Zj(paramInt4 + i, paramInt4 + i + str.length()))));
  }
  
  private static boolean ZD(String paramString1, String paramString2, int paramInt) {
    return (paramInt + paramString2.length() >= paramString1.length());
  }
  
  private static boolean Zk(String paramString1, String paramString2, int paramInt) {
    int i = paramInt + paramString2.length();
    if (Character.isLetterOrDigit(paramString1.charAt(i)))
      return true; 
    Character character = Zr(paramString1, i);
    return (character != null && Character.isLetterOrDigit(character.charValue()));
  }
  
  private static boolean Zg(String paramString, int paramInt) {
    if (paramInt < 1)
      return false; 
    if (Character.isLetterOrDigit(paramString.charAt(paramInt - 1))) {
      Character character = Zd(paramString, paramInt);
      if (character == null || Character.isLetterOrDigit(character.charValue()))
        return true; 
    } 
    return false;
  }
  
  private static Character Zd(String paramString, int paramInt) {
    return (paramInt < 3) ? null : ((Character.isLetterOrDigit(paramString.charAt(paramInt - 2)) && '%' == paramString.charAt(paramInt - 3)) ? Character.valueOf(Zrzt.ZJ(paramString.substring(paramInt - 3, paramInt)).charAt(0)) : null);
  }
  
  private static Character Zr(String paramString, int paramInt) {
    return (paramString.length() - paramInt < 3) ? null : (('%' == paramString.charAt(paramInt) && Character.isLetterOrDigit(paramString.charAt(paramInt + 1)) && Character.isLetterOrDigit(paramString.charAt(paramInt + 2))) ? Character.valueOf(Zrzt.ZJ(paramString.substring(paramInt, paramInt + 3)).charAt(0)) : null);
  }
  
  private static void Zf(String paramString, int paramInt1, int paramInt2, int paramInt3, List<Zl1r> paramList) {
    int[] arrayOfInt = Zw();
    byte b = 2;
    while (b < (ZB[paramInt1]).length) {
      Zl1r zl1r = ZO(paramString, paramInt1, b, paramInt2, paramInt3);
      if (zl1r != null)
        paramList.add(zl1r); 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '28:8ZiS;7Vu@<$73ZoB5$\\bR:8P&&^oB73\5$\\bR\\n<$Zizc4\\n4$\\bJkzc4 3\\b4$\\bJk**\\b4$\\bJk\\f**%7J~T282%\\b<$Zi\\f**$>M~99Q\\b<$Zi**<$'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_1
    //   19: newarray int
    //   21: iconst_3
    //   22: istore_2
    //   23: invokestatic ZK : ([I)V
    //   26: iconst_m1
    //   27: istore_1
    //   28: bipush #120
    //   30: iinc #1, 1
    //   33: aload_3
    //   34: iload_1
    //   35: dup
    //   36: iload_2
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 134
    //   45: aload_0
    //   46: swap
    //   47: iload #4
    //   49: iinc #4, 1
    //   52: swap
    //   53: aastore
    //   54: iload_1
    //   55: iload_2
    //   56: iadd
    //   57: dup
    //   58: istore_1
    //   59: iload #5
    //   61: if_icmpge -> 73
    //   64: aload_3
    //   65: iload_1
    //   66: invokevirtual charAt : (I)C
    //   69: istore_2
    //   70: goto -> 28
    //   73: ldc '\\f*eV\\b#rP{'
    //   75: dup
    //   76: astore_3
    //   77: invokevirtual length : ()I
    //   80: istore #5
    //   82: iconst_5
    //   83: istore_2
    //   84: iconst_m1
    //   85: istore_1
    //   86: bipush #80
    //   88: iinc #1, 1
    //   91: aload_3
    //   92: iload_1
    //   93: dup
    //   94: iload_2
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 134
    //   103: aload_0
    //   104: swap
    //   105: iload #4
    //   107: iinc #4, 1
    //   110: swap
    //   111: aastore
    //   112: iload_1
    //   113: iload_2
    //   114: iadd
    //   115: dup
    //   116: istore_1
    //   117: iload #5
    //   119: if_icmpge -> 131
    //   122: aload_3
    //   123: iload_1
    //   124: invokevirtual charAt : (I)C
    //   127: istore_2
    //   128: goto -> 86
    //   131: goto -> 292
    //   134: dup_x2
    //   135: pop
    //   136: invokevirtual toCharArray : ()[C
    //   139: dup_x1
    //   140: arraylength
    //   141: dup_x2
    //   142: pop
    //   143: iconst_0
    //   144: istore #6
    //   146: dup2_x1
    //   147: pop2
    //   148: dup_x2
    //   149: iconst_1
    //   150: if_icmpgt -> 252
    //   153: dup2
    //   154: swap
    //   155: iload #6
    //   157: dup2_x1
    //   158: caload
    //   159: swap
    //   160: iload #6
    //   162: bipush #7
    //   164: irem
    //   165: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #43
    //   206: goto -> 236
    //   209: bipush #46
    //   211: goto -> 236
    //   214: bipush #31
    //   216: goto -> 236
    //   219: bipush #71
    //   221: goto -> 236
    //   224: bipush #99
    //   226: goto -> 236
    //   229: bipush #95
    //   231: goto -> 236
    //   234: bipush #48
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 157
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 153
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 45, 0 -> 103
    //   292: iconst_4
    //   293: anewarray [Ljava/lang/String;
    //   296: dup
    //   297: iconst_0
    //   298: bipush #15
    //   300: anewarray java/lang/String
    //   303: dup
    //   304: iconst_0
    //   305: aload_0
    //   306: bipush #24
    //   308: aaload
    //   309: aastore
    //   310: dup
    //   311: iconst_1
    //   312: aload_0
    //   313: iconst_5
    //   314: aaload
    //   315: aastore
    //   316: dup
    //   317: iconst_2
    //   318: aload_0
    //   319: bipush #19
    //   321: aaload
    //   322: aastore
    //   323: dup
    //   324: iconst_3
    //   325: aload_0
    //   326: bipush #20
    //   328: aaload
    //   329: aastore
    //   330: dup
    //   331: iconst_4
    //   332: aload_0
    //   333: bipush #21
    //   335: aaload
    //   336: aastore
    //   337: dup
    //   338: iconst_5
    //   339: aload_0
    //   340: bipush #18
    //   342: aaload
    //   343: aastore
    //   344: dup
    //   345: bipush #6
    //   347: aload_0
    //   348: bipush #10
    //   350: aaload
    //   351: aastore
    //   352: dup
    //   353: bipush #7
    //   355: aload_0
    //   356: bipush #17
    //   358: aaload
    //   359: aastore
    //   360: dup
    //   361: bipush #8
    //   363: aload_0
    //   364: bipush #8
    //   366: aaload
    //   367: aastore
    //   368: dup
    //   369: bipush #9
    //   371: aload_0
    //   372: bipush #13
    //   374: aaload
    //   375: aastore
    //   376: dup
    //   377: bipush #10
    //   379: aload_0
    //   380: bipush #14
    //   382: aaload
    //   383: aastore
    //   384: dup
    //   385: bipush #11
    //   387: aload_0
    //   388: bipush #11
    //   390: aaload
    //   391: aastore
    //   392: dup
    //   393: bipush #12
    //   395: aload_0
    //   396: iconst_2
    //   397: aaload
    //   398: aastore
    //   399: dup
    //   400: bipush #13
    //   402: aload_0
    //   403: iconst_0
    //   404: aaload
    //   405: aastore
    //   406: dup
    //   407: bipush #14
    //   409: aload_0
    //   410: iconst_3
    //   411: aaload
    //   412: aastore
    //   413: aastore
    //   414: dup
    //   415: iconst_1
    //   416: iconst_3
    //   417: anewarray java/lang/String
    //   420: dup
    //   421: iconst_0
    //   422: aload_0
    //   423: iconst_1
    //   424: aaload
    //   425: aastore
    //   426: dup
    //   427: iconst_1
    //   428: aload_0
    //   429: bipush #6
    //   431: aaload
    //   432: aastore
    //   433: dup
    //   434: iconst_2
    //   435: aload_0
    //   436: bipush #15
    //   438: aaload
    //   439: aastore
    //   440: aastore
    //   441: dup
    //   442: iconst_2
    //   443: iconst_5
    //   444: anewarray java/lang/String
    //   447: dup
    //   448: iconst_0
    //   449: aload_0
    //   450: bipush #7
    //   452: aaload
    //   453: aastore
    //   454: dup
    //   455: iconst_1
    //   456: aload_0
    //   457: bipush #12
    //   459: aaload
    //   460: aastore
    //   461: dup
    //   462: iconst_2
    //   463: aload_0
    //   464: bipush #23
    //   466: aaload
    //   467: aastore
    //   468: dup
    //   469: iconst_3
    //   470: aload_0
    //   471: bipush #16
    //   473: aaload
    //   474: aastore
    //   475: dup
    //   476: iconst_4
    //   477: aload_0
    //   478: bipush #22
    //   480: aaload
    //   481: aastore
    //   482: aastore
    //   483: dup
    //   484: iconst_3
    //   485: iconst_5
    //   486: anewarray java/lang/String
    //   489: dup
    //   490: iconst_0
    //   491: aload_0
    //   492: iconst_4
    //   493: aaload
    //   494: aastore
    //   495: dup
    //   496: iconst_1
    //   497: aload_0
    //   498: bipush #9
    //   500: aaload
    //   501: aastore
    //   502: dup
    //   503: iconst_2
    //   504: aload_0
    //   505: bipush #23
    //   507: aaload
    //   508: aastore
    //   509: dup
    //   510: iconst_3
    //   511: aload_0
    //   512: bipush #16
    //   514: aaload
    //   515: aastore
    //   516: dup
    //   517: iconst_4
    //   518: aload_0
    //   519: bipush #22
    //   521: aaload
    //   522: aastore
    //   523: aastore
    //   524: putstatic burp/Zt67.ZB : [[Ljava/lang/String;
    //   527: return
  }
  
  public static void ZK(int[] paramArrayOfint) {
    ZQ = paramArrayOfint;
  }
  
  public static int[] Zw() {
    return ZQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt67.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */