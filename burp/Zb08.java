package burp;

import java.util.Map;

public class Zb08 {
  private static boolean Zc;
  
  private static final String a;
  
  public static Zsqx<Zrdb> ZT(Zmzk paramZmzk, Zg72 paramZg72) {
    return Zg(paramZmzk, paramZg72, ZW(paramZg72), null);
  }
  
  public static Zsqx<Zrdb> ZV(String paramString1, int paramInt, String paramString2, Zmzk paramZmzk, Zxs7 paramZxs7, Zg72 paramZg72) {
    Map<Long, String> map = ZW(paramZg72);
    map.put(Long.valueOf(Ztz3.CHECK_IDENTIFIER.permanentIndex), paramString1);
    map.put(Long.valueOf(Ztz3.CHECK_INDEX.permanentIndex), Integer.toString(paramInt));
    boolean bool = Zp();
    try {
      map.put(Long.valueOf(Ztz3.EXTENSION_NAME.permanentIndex), paramString2);
      if (!bool)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Zg(paramZmzk, paramZg72, map, paramZxs7);
  }
  
  private static Map<Long, String> ZW(Zg72 paramZg72) {
    try {
      if (paramZg72.ZZV() == null)
        throw new NullPointerException(a); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.ISSUE_DETAILS_CACHE, paramZg72.Zai()), Zriz.ZG(Ztz3.REMEDIATION_DETAILS_CACHE, paramZg72.ZaR()), Zriz.ZG(Ztz3.ISSUE_NAME, paramZg72.ZZV()), Zriz.ZG(Ztz3.ISSUE_DESCRIPTION, paramZg72.ZZA()), Zriz.ZG(Ztz3.ISSUE_REMEDIATION, paramZg72.ZZH()) });
  }
  
  private static Zsqx<Zrdb> Zg(Zmzk paramZmzk, Zg72 paramZg72, Map<Long, String> paramMap, Zxs7 paramZxs7) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic Za : ()Z
    //   12: aload_1
    //   13: invokeinterface ZJF : ()Lburp/Zefg;
    //   18: astore #6
    //   20: istore #4
    //   22: aload #6
    //   24: ifnull -> 201
    //   27: aload #6
    //   29: invokeinterface isEmpty : ()Z
    //   34: ifne -> 201
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   43: athrow
    //   44: aload #6
    //   46: invokeinterface size : ()I
    //   51: iconst_1
    //   52: if_icmpne -> 101
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   61: athrow
    //   62: aload #5
    //   64: new burp/Zt2w
    //   67: dup
    //   68: aconst_null
    //   69: aload #6
    //   71: iconst_0
    //   72: invokeinterface get : (I)Ljava/lang/Object;
    //   77: checkcast burp/Zzi8
    //   80: invokespecial <init> : (Lburp/Zll7;Lburp/Zzi8;)V
    //   83: invokeinterface add : (Ljava/lang/Object;)Z
    //   88: pop
    //   89: iload #4
    //   91: ifeq -> 201
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   100: athrow
    //   101: aload #5
    //   103: new burp/Zt2w
    //   106: dup
    //   107: aconst_null
    //   108: aload #6
    //   110: iconst_0
    //   111: invokeinterface get : (I)Ljava/lang/Object;
    //   116: checkcast burp/Zzi8
    //   119: invokespecial <init> : (Lburp/Zll7;Lburp/Zzi8;)V
    //   122: new burp/Zt2w
    //   125: dup
    //   126: aconst_null
    //   127: aload #6
    //   129: iconst_1
    //   130: invokeinterface get : (I)Ljava/lang/Object;
    //   135: checkcast burp/Zzi8
    //   138: invokespecial <init> : (Lburp/Zll7;Lburp/Zzi8;)V
    //   141: invokestatic Zp : (Lburp/Zei8;Lburp/Zei8;)Lburp/Zlfv;
    //   144: invokeinterface add : (Ljava/lang/Object;)Z
    //   149: pop
    //   150: iconst_2
    //   151: istore #7
    //   153: iload #7
    //   155: aload #6
    //   157: invokeinterface size : ()I
    //   162: if_icmpge -> 201
    //   165: aload #5
    //   167: new burp/Zt2w
    //   170: dup
    //   171: aconst_null
    //   172: aload #6
    //   174: iload #7
    //   176: invokeinterface get : (I)Ljava/lang/Object;
    //   181: checkcast burp/Zzi8
    //   184: invokespecial <init> : (Lburp/Zll7;Lburp/Zzi8;)V
    //   187: invokeinterface add : (Ljava/lang/Object;)Z
    //   192: pop
    //   193: iinc #7, 1
    //   196: iload #4
    //   198: ifeq -> 153
    //   201: new burp/Zx_5
    //   204: dup
    //   205: getstatic burp/Zzu2.EXTENSION_GENERATED : Lburp/Zzu2;
    //   208: aload_1
    //   209: invokeinterface Za8 : ()B
    //   214: aload_1
    //   215: invokeinterface Zam : ()I
    //   220: aload_1
    //   221: invokeinterface Za0 : ()Ljava/lang/String;
    //   226: aload_2
    //   227: aload #5
    //   229: aload_1
    //   230: invokeinterface Zak : ()B
    //   235: aload_1
    //   236: invokeinterface Zaw : ()B
    //   241: aload_0
    //   242: aload_1
    //   243: invokeinterface Zax : ()[B
    //   248: aload_3
    //   249: invokespecial <init> : (Lburp/Zvs;BILjava/lang/String;Ljava/util/Map;Ljava/util/List;BBLburp/Zmzk;[BLburp/Zxs7;)V
    //   252: areturn
    // Exception table:
    //   from	to	target	type
    //   22	37	40	java/lang/NullPointerException
    //   27	55	58	java/lang/NullPointerException
    //   44	94	97	java/lang/NullPointerException
  }
  
  public static void ZY(boolean paramBoolean) {
    Zc = paramBoolean;
  }
  
  public static boolean Zp() {
    return Zc;
  }
  
  public static boolean Za() {
    boolean bool = Zp();
    try {
      if (!bool)
        return true; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zp : ()Z
    //   3: ifne -> 10
    //   6: iconst_1
    //   7: invokestatic ZY : (Z)V
    //   10: bipush #89
    //   12: ldc 'oZ\\n-('GDA+i'HF\\rA*miH\\\r'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zb08.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #127
    //   94: goto -> 124
    //   97: bipush #112
    //   99: goto -> 124
    //   102: bipush #32
    //   104: goto -> 124
    //   107: bipush #56
    //   109: goto -> 124
    //   112: bipush #17
    //   114: goto -> 124
    //   117: bipush #81
    //   119: goto -> 124
    //   122: bipush #16
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 18
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb08.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */