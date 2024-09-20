package burp;

import java.util.List;

public class Zmxn {
  private static String ZV;
  
  public static Zsqx<Zrdb> Zd(Zmzk paramZmzk, String paramString1, byte paramByte1, int paramInt, byte paramByte2, Zlvf paramZlvf, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7, byte[] paramArrayOfbyte, String paramString2) {
    // Byte code:
    //   0: invokestatic Zq : ()Ljava/lang/String;
    //   3: astore #11
    //   5: iload_3
    //   6: iconst_4
    //   7: iand
    //   8: iconst_4
    //   9: if_icmpne -> 20
    //   12: iconst_1
    //   13: istore #12
    //   15: aload #11
    //   17: ifnull -> 53
    //   20: aload #8
    //   22: invokeinterface Z_ : ()Lburp/Zs66;
    //   27: getstatic burp/Zs66.URL_PARAM : Lburp/Zs66;
    //   30: if_acmpeq -> 50
    //   33: iload_3
    //   34: bipush #8
    //   36: iand
    //   37: bipush #8
    //   39: if_icmpeq -> 50
    //   42: iconst_1
    //   43: istore #12
    //   45: aload #11
    //   47: ifnull -> 53
    //   50: iconst_2
    //   51: istore #12
    //   53: new burp/Zx_5
    //   56: dup
    //   57: aload #5
    //   59: getstatic burp/Zzu2.OPEN_REDIRECTION_REFLECTED : Lburp/Zzu2;
    //   62: getstatic burp/Zzu2.OPEN_REDIRECTION_STORED : Lburp/Zzu2;
    //   65: invokeinterface Za : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   70: checkcast burp/Zvs
    //   73: iload_2
    //   74: iload_3
    //   75: iconst_2
    //   76: anewarray burp/Zra_
    //   79: dup
    //   80: iconst_0
    //   81: getstatic burp/Ztz3.REDIRECTION_METHOD : Lburp/Ztz3;
    //   84: iload #4
    //   86: invokestatic valueOf : (I)Ljava/lang/String;
    //   89: invokestatic ZG : (Lburp/Ztz3;Ljava/lang/String;)Lburp/Zra_;
    //   92: aastore
    //   93: dup
    //   94: iconst_1
    //   95: getstatic burp/Ztz3.REDIRECTION_TARGET : Lburp/Ztz3;
    //   98: aload #10
    //   100: invokestatic ZG : (Lburp/Ztz3;Ljava/lang/String;)Lburp/Zra_;
    //   103: aastore
    //   104: invokestatic ZO : ([Lburp/Zra_;)Ljava/util/Map;
    //   107: aload #5
    //   109: new burp/Zz25
    //   112: dup
    //   113: aload #9
    //   115: iconst_0
    //   116: invokespecial <init> : ([BI)V
    //   119: aload #6
    //   121: aload #7
    //   123: invokeinterface Zq : (Lburp/Zxcg;Ljava/util/List;Ljava/util/List;)Lburp/Zei8;
    //   128: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   131: iconst_3
    //   132: aload #5
    //   134: iload #12
    //   136: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   139: iconst_3
    //   140: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   143: invokeinterface Za : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   148: checkcast java/lang/Byte
    //   151: invokevirtual byteValue : ()B
    //   154: aload_0
    //   155: aload_1
    //   156: invokestatic Zy : (Ljava/lang/String;)[B
    //   159: aload #8
    //   161: invokespecial <init> : (Lburp/Zvs;BILjava/util/Map;Ljava/util/List;BBLburp/Zmzk;[BLburp/Zxs7;)V
    //   164: invokestatic Zwu : ()[Lburp/Zbqc;
    //   167: ifnonnull -> 175
    //   170: ldc 'FnODu'
    //   172: invokestatic ZB : (Ljava/lang/String;)V
    //   175: areturn
  }
  
  public static void ZB(String paramString) {
    ZV = paramString;
  }
  
  public static String Zq() {
    return ZV;
  }
  
  static {
    if (Zq() != null)
      ZB("wWGxl"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmxn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */