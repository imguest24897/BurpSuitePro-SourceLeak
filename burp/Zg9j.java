package burp;

import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zg9j {
  private static final Map<Zk53, Zlkk> Zk;
  
  private static final Map<Zk53, String> ZD;
  
  static String ZL(Zk53 paramZk53) {
    String str = ZD.get(paramZk53);
    if (str == null) {
      Zuh.ZT(false, Zqf.Zx, String.valueOf(paramZk53));
      str = "";
    } 
    return str;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'rK{a~KdLjmiv_jlrV'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #7
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #120
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
    //   140: bipush #89
    //   142: goto -> 172
    //   145: bipush #70
    //   147: goto -> 172
    //   150: bipush #96
    //   152: goto -> 172
    //   155: bipush #122
    //   157: goto -> 172
    //   160: bipush #99
    //   162: goto -> 172
    //   165: bipush #64
    //   167: goto -> 172
    //   170: bipush #27
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
    //   215: new java/util/HashMap
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: putstatic burp/Zg9j.Zk : Ljava/util/Map;
    //   225: new java/util/HashMap
    //   228: dup
    //   229: invokespecial <init> : ()V
    //   232: putstatic burp/Zg9j.ZD : Ljava/util/Map;
    //   235: getstatic burp/Zg9j.Zk : Ljava/util/Map;
    //   238: getstatic burp/Zk53.INFO : Lburp/Zk53;
    //   241: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   244: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   249: pop
    //   250: getstatic burp/Zg9j.Zk : Ljava/util/Map;
    //   253: getstatic burp/Zk53.OK : Lburp/Zk53;
    //   256: getstatic burp/Zlkk.HEALTHCHECK_SUCCESS : Lburp/Zlkk;
    //   259: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   264: pop
    //   265: getstatic burp/Zg9j.Zk : Ljava/util/Map;
    //   268: getstatic burp/Zk53.WARNING : Lburp/Zk53;
    //   271: getstatic burp/Zlkk.HEALTHCHECK_WARNING : Lburp/Zlkk;
    //   274: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   279: pop
    //   280: getstatic burp/Zg9j.Zk : Ljava/util/Map;
    //   283: getstatic burp/Zk53.ERROR : Lburp/Zk53;
    //   286: getstatic burp/Zlkk.HEALTHCHECK_FAIL : Lburp/Zlkk;
    //   289: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   294: pop
    //   295: getstatic burp/Zg9j.ZD : Ljava/util/Map;
    //   298: getstatic burp/Zk53.INFO : Lburp/Zk53;
    //   301: ldc ''
    //   303: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   308: pop
    //   309: getstatic burp/Zg9j.ZD : Ljava/util/Map;
    //   312: getstatic burp/Zk53.OK : Lburp/Zk53;
    //   315: aload_0
    //   316: iconst_0
    //   317: aaload
    //   318: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   323: pop
    //   324: getstatic burp/Zg9j.ZD : Ljava/util/Map;
    //   327: getstatic burp/Zk53.WARNING : Lburp/Zk53;
    //   330: aload_0
    //   331: iconst_2
    //   332: aaload
    //   333: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   338: pop
    //   339: getstatic burp/Zg9j.ZD : Ljava/util/Map;
    //   342: getstatic burp/Zk53.ERROR : Lburp/Zk53;
    //   345: aload_0
    //   346: iconst_1
    //   347: aaload
    //   348: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   353: pop
    //   354: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg9j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */