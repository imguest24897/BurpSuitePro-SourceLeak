package burp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zkk9 implements Zrx6, Zs81 {
  private final Zz0n Za;
  
  private final Zmjm ZF;
  
  private final Zskh ZR;
  
  private final Zr1j Zg;
  
  private final Zt9d Zo;
  
  private final Ztn0 ZN;
  
  private final Ztjq ZU;
  
  private final String Zy;
  
  private final Zk97 ZT;
  
  private final boolean Zl;
  
  private final Zr_4 ZJ;
  
  private final Zbnt ZY;
  
  private final Zbqc Zd;
  
  private int ZH = -1;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zkk9 ZH(Zz0n paramZz0n, Zmjm paramZmjm, Zskh paramZskh, Zt9d paramZt9d, Zk97 paramZk97, Zr1j paramZr1j, Zbnt paramZbnt, Zr_4 paramZr_4) {
    return new Zkk9(paramZz0n, paramZmjm, paramZskh, paramZt9d, new Zsak(), Ztjq.Zr, a(-28446, 11817), paramZk97, false, paramZr1j, paramZbnt, paramZr_4);
  }
  
  public static Zkk9 Zf(Zz0n paramZz0n, Zmjm paramZmjm, Zskh paramZskh, Zt9d paramZt9d, Zk97 paramZk97, Zr1j paramZr1j, Zbnt paramZbnt, Zr_4 paramZr_4) {
    return new Zkk9(paramZz0n, paramZmjm, paramZskh, paramZt9d, new Zsak(), Ztjq.Zr, a(-28437, -26487), paramZk97, true, paramZr1j, paramZbnt, paramZr_4);
  }
  
  public static Zkk9 ZU(Zz0n paramZz0n, Zmjm paramZmjm, Zskh paramZskh, Zt9d paramZt9d, Zryy paramZryy, String paramString, Zk97 paramZk97, Zr1j paramZr1j, Zbnt paramZbnt, Zr_4 paramZr_4) {
    return new Zkk9(paramZz0n, paramZmjm, paramZskh, paramZt9d, paramZryy, Ztjq.Zr, paramString, paramZk97, false, paramZr1j, paramZbnt, paramZr_4);
  }
  
  static Zkk9 Zd(Zz0n paramZz0n, Zmjm paramZmjm, Zskh paramZskh, Zt9d paramZt9d, Ztjq paramZtjq, String paramString, Zk97 paramZk97, Zr1j paramZr1j, Zbnt paramZbnt, Zr_4 paramZr_4) {
    return new Zkk9(paramZz0n, paramZmjm, paramZskh, paramZt9d, new Zsak(), paramZtjq, paramString, paramZk97, false, paramZr1j, paramZbnt, paramZr_4);
  }
  
  private Zkk9(Zz0n paramZz0n, Zmjm paramZmjm, Zskh paramZskh, Zt9d paramZt9d, Zryy paramZryy, Ztjq paramZtjq, String paramString, Zk97 paramZk97, boolean paramBoolean, Zr1j paramZr1j, Zbnt paramZbnt, Zr_4 paramZr_4) {
    this.Za = paramZz0n;
    this.ZF = paramZmjm;
    this.ZR = paramZskh;
    this.Zg = paramZr1j;
    this.Zo = paramZt9d;
    this.ZU = paramZtjq;
    this.Zy = paramString;
    this.ZT = paramZk97;
    this.Zl = paramBoolean;
    this.ZY = paramZbnt;
    this.ZJ = paramZr_4;
    this.ZN = paramZt9d.ZoQ();
    this.Zd = paramZryy.ZD(this, this.ZN);
  }
  
  void ZT(Zmy8 paramZmy8) {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: ifnull -> 69
    //   8: aload_0
    //   9: getfield ZH : I
    //   12: iconst_m1
    //   13: if_icmpne -> 48
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_0
    //   24: invokevirtual Zx : ()V
    //   27: aload_0
    //   28: getfield Zo : Lburp/Zt9d;
    //   31: aload_1
    //   32: invokeinterface ZE : (Lburp/Zmy8;)V
    //   37: iload_2
    //   38: ifne -> 69
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: aload_0
    //   49: getfield Zo : Lburp/Zt9d;
    //   52: aload_1
    //   53: aload_0
    //   54: getfield ZH : I
    //   57: invokeinterface Zz : (Lburp/Zmy8;I)V
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload_0
    //   70: iconst_m1
    //   71: putfield ZH : I
    //   74: return
    // Exception table:
    //   from	to	target	type
    //   4	16	19	java/util/regex/PatternSyntaxException
    //   8	41	44	java/util/regex/PatternSyntaxException
    //   23	62	65	java/util/regex/PatternSyntaxException
  }
  
  public Zbqc Zz() {
    return this.Zd;
  }
  
  public void Zp() {
    this.Zd.scrollRectToVisible(this.Zd.getBounds());
  }
  
  public void Zr() {
    Zrv4 zrv4 = new Zrv4(this, a(-28444, -9971) + a(-28444, -9971), null, this.Zl, this.ZT, this.ZY, this.Za.ZD(), this.ZJ, this.Zg);
    zrv4.setVisible(true);
  }
  
  public void ZN(int paramInt) {
    this.ZH = paramInt;
    Zmy8 zmy8 = this.Zo.Zqa(this.ZH);
    Zrv4 zrv4 = new Zrv4(this, a(-28447, -26280) + a(-28447, -26280), zmy8, this.Zl, this.ZT, this.ZY, this.Za.ZD(), this.ZJ, this.Zg);
    zrv4.setVisible(true);
  }
  
  public void Zz(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_1
    //   1: astore_3
    //   2: invokestatic ZM : ()I
    //   5: aload_3
    //   6: arraylength
    //   7: istore #4
    //   9: istore_2
    //   10: iconst_0
    //   11: istore #5
    //   13: iload #5
    //   15: iload #4
    //   17: if_icmpge -> 102
    //   20: aload_3
    //   21: iload #5
    //   23: iaload
    //   24: istore #6
    //   26: iload #6
    //   28: aload_0
    //   29: getfield ZH : I
    //   32: if_icmpne -> 51
    //   35: aload_0
    //   36: iconst_m1
    //   37: putfield ZH : I
    //   40: iload_2
    //   41: ifne -> 84
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: iload #6
    //   53: aload_0
    //   54: getfield ZH : I
    //   57: if_icmpge -> 84
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_0
    //   68: dup
    //   69: getfield ZH : I
    //   72: iconst_1
    //   73: isub
    //   74: putfield ZH : I
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload_0
    //   85: getfield Zo : Lburp/Zt9d;
    //   88: iload #6
    //   90: invokeinterface Zqd : (I)V
    //   95: iinc #5, 1
    //   98: iload_2
    //   99: ifne -> 13
    //   102: return
    // Exception table:
    //   from	to	target	type
    //   26	44	47	java/util/regex/PatternSyntaxException
    //   35	60	63	java/util/regex/PatternSyntaxException
    //   51	77	80	java/util/regex/PatternSyntaxException
  }
  
  public void ZD() {
    Zm2.ZC(Zrrh.TARGET_SCOPE_SCOPE_RULE_PASTE_URL);
    try {
      Zmy8 zmy8 = Ze9z.ZM(new Zax(new URL(this.Za.ZD().Zp()), this.ZY), this.ZJ);
      Zx();
      this.Zo.ZE(zmy8);
    } catch (MalformedURLException malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.USER_ERROR);
      this.ZR.Zl(Zkqn.INFORMATION, a(-28442, -13439));
    } catch (Zxgy|Zxg5 zxgy) {
      Zah.Zl(zxgy, Zk_.USER_ERROR);
      this.ZR.Zl(Zkqn.INFORMATION, zxgy.getMessage());
    } 
  }
  
  public void ZV() {
    // Byte code:
    //   0: getstatic burp/Zrrh.TARGET_SCOPE_SCOPE_RULE_LOAD : Lburp/Zrrh;
    //   3: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   6: invokestatic ZM : ()I
    //   9: getstatic burp/Zg1m.CONFIG : Lburp/Zg1m;
    //   12: aload_0
    //   13: getfield ZF : Lburp/Zmjm;
    //   16: aload_0
    //   17: getfield Zd : Lburp/Zbqc;
    //   20: iconst_0
    //   21: invokestatic ZP : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;I)Ljava/io/File;
    //   24: astore_2
    //   25: istore_1
    //   26: aload_2
    //   27: ifnull -> 480
    //   30: aload_2
    //   31: aload_0
    //   32: getfield Za : Lburp/Zz0n;
    //   35: invokeinterface ZM : ()Lnet/portswigger/Zl0;
    //   40: invokestatic ZJ : (Ljava/io/File;Lnet/portswigger/Zl0;)Ljava/util/List;
    //   43: astore_3
    //   44: aload_3
    //   45: invokeinterface iterator : ()Ljava/util/Iterator;
    //   50: astore #4
    //   52: aload #4
    //   54: invokeinterface hasNext : ()Z
    //   59: ifeq -> 469
    //   62: aload #4
    //   64: invokeinterface next : ()Ljava/lang/Object;
    //   69: checkcast java/lang/String
    //   72: astore #5
    //   74: aload #5
    //   76: invokevirtual isEmpty : ()Z
    //   79: ifeq -> 89
    //   82: goto -> 52
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload #5
    //   91: invokestatic Zg : (Ljava/lang/String;)Z
    //   94: ifeq -> 145
    //   97: aload_0
    //   98: getfield ZJ : Lburp/Zr_4;
    //   101: new burp/Zmks
    //   104: dup
    //   105: iconst_1
    //   106: iconst_0
    //   107: aload #5
    //   109: ldc ''
    //   111: ldc ''
    //   113: invokespecial <init> : (ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   116: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   121: checkcast burp/Zmy8
    //   124: astore #6
    //   126: aload_0
    //   127: invokevirtual Zx : ()V
    //   130: aload_0
    //   131: getfield Zo : Lburp/Zt9d;
    //   134: aload #6
    //   136: invokeinterface ZE : (Lburp/Zmy8;)V
    //   141: iload_1
    //   142: ifne -> 422
    //   145: aload #5
    //   147: sipush #-28448
    //   150: sipush #28315
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokestatic Zh : (Ljava/lang/String;Ljava/lang/String;)Z
    //   159: ifne -> 193
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: aload #5
    //   171: sipush #-28441
    //   174: sipush #4546
    //   177: invokestatic a : (II)Ljava/lang/String;
    //   180: invokestatic Zh : (Ljava/lang/String;Ljava/lang/String;)Z
    //   183: ifeq -> 241
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   192: athrow
    //   193: new burp/Zax
    //   196: dup
    //   197: new java/net/URL
    //   200: dup
    //   201: aload #5
    //   203: invokespecial <init> : (Ljava/lang/String;)V
    //   206: aload_0
    //   207: getfield ZY : Lburp/Zbnt;
    //   210: invokespecial <init> : (Ljava/net/URL;Lburp/Zbnt;)V
    //   213: aload_0
    //   214: getfield ZJ : Lburp/Zr_4;
    //   217: invokestatic ZM : (Lburp/Zlit;Lburp/Zr_4;)Lburp/Zmy8;
    //   220: astore #6
    //   222: aload_0
    //   223: invokevirtual Zx : ()V
    //   226: aload_0
    //   227: getfield Zo : Lburp/Zt9d;
    //   230: aload #6
    //   232: invokeinterface ZE : (Lburp/Zmy8;)V
    //   237: iload_1
    //   238: ifne -> 422
    //   241: aload #5
    //   243: invokestatic Zc : (Ljava/lang/String;)Z
    //   246: ifeq -> 323
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: aload_0
    //   257: getfield ZJ : Lburp/Zr_4;
    //   260: new burp/Zmks
    //   263: dup
    //   264: iconst_1
    //   265: iconst_0
    //   266: aload #5
    //   268: ldc '.'
    //   270: sipush #-28443
    //   273: sipush #-9350
    //   276: invokestatic a : (II)Ljava/lang/String;
    //   279: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   282: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   287: ldc ''
    //   289: ldc ''
    //   291: invokespecial <init> : (ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   294: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   299: checkcast burp/Zmy8
    //   302: astore #6
    //   304: aload_0
    //   305: invokevirtual Zx : ()V
    //   308: aload_0
    //   309: getfield Zo : Lburp/Zt9d;
    //   312: aload #6
    //   314: invokeinterface ZE : (Lburp/Zmy8;)V
    //   319: iload_1
    //   320: ifne -> 422
    //   323: aload #5
    //   325: invokestatic ZH : (Ljava/lang/String;)Z
    //   328: ifeq -> 386
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   337: athrow
    //   338: aload_0
    //   339: getfield ZJ : Lburp/Zr_4;
    //   342: new burp/Zmks
    //   345: dup
    //   346: iconst_1
    //   347: iconst_0
    //   348: aload #5
    //   350: ldc ''
    //   352: ldc ''
    //   354: invokespecial <init> : (ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   357: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   362: checkcast burp/Zmy8
    //   365: astore #6
    //   367: aload_0
    //   368: invokevirtual Zx : ()V
    //   371: aload_0
    //   372: getfield Zo : Lburp/Zt9d;
    //   375: aload #6
    //   377: invokeinterface ZE : (Lburp/Zmy8;)V
    //   382: iload_1
    //   383: ifne -> 422
    //   386: aload_0
    //   387: getfield ZR : Lburp/Zskh;
    //   390: getstatic burp/Zkqn.INFORMATION : Lburp/Zkqn;
    //   393: aload #5
    //   395: sipush #-28445
    //   398: sipush #-17292
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: swap
    //   405: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   410: invokeinterface Zl : (Lburp/Zkqn;Ljava/lang/String;)V
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   421: athrow
    //   422: goto -> 465
    //   425: astore #6
    //   427: aload #6
    //   429: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   432: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   435: aload_0
    //   436: getfield ZR : Lburp/Zskh;
    //   439: getstatic burp/Zkqn.INFORMATION : Lburp/Zkqn;
    //   442: aload #6
    //   444: invokevirtual getMessage : ()Ljava/lang/String;
    //   447: invokeinterface Zl : (Lburp/Zkqn;Ljava/lang/String;)V
    //   452: goto -> 465
    //   455: astore #6
    //   457: aload #6
    //   459: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   462: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   465: iload_1
    //   466: ifne -> 52
    //   469: goto -> 480
    //   472: astore_3
    //   473: aload_3
    //   474: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   477: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   480: return
    // Exception table:
    //   from	to	target	type
    //   30	469	472	java/lang/Exception
    //   74	85	85	java/net/MalformedURLException
    //   89	422	425	java/net/MalformedURLException
    //   89	422	425	burp/Zxg5
    //   89	422	425	burp/Zxgy
    //   89	422	455	java/lang/Exception
    //   126	162	165	java/net/MalformedURLException
    //   145	186	189	java/net/MalformedURLException
    //   222	249	252	java/net/MalformedURLException
    //   304	331	334	java/net/MalformedURLException
    //   367	415	418	java/net/MalformedURLException
  }
  
  private void Zx() {
    this.ZU.ZX(Zt2m.ZF(this.Zd), this.Zo.ZAg());
  }
  
  public void ZJ(int paramInt) {
    Zmy8 zmy8 = this.Zo.Zqa(paramInt);
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    zmy8.Zg4(!zmy8.ZlM());
    this.ZN.fireTableCellUpdated(paramInt, 0);
    this.Zo.ZC(null);
  }
  
  private static boolean ZH(String paramString) {
    try {
      Pattern.compile(paramString);
      return true;
    } catch (PatternSyntaxException patternSyntaxException) {
      Zah.Zl(patternSyntaxException, Zk_.IGNORED);
      return false;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' hFÈåõÜ}§Ý?ÙøðL=T^<}\\r\\bÿ¶Ðv8ÌaÀº /u*P[;©½ã\\b¢wý~\\trxe²¹;%¬±ùs©vxçt.{â¦\\nûC'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #32
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'ïók¡¥ÒÑç:ÞÅWpîtE\\r'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #102
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zkk9.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zkk9.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #36
    //   214: goto -> 244
    //   217: bipush #73
    //   219: goto -> 244
    //   222: bipush #69
    //   224: goto -> 244
    //   227: bipush #94
    //   229: goto -> 244
    //   232: bipush #22
    //   234: goto -> 244
    //   237: bipush #100
    //   239: goto -> 244
    //   242: bipush #98
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF90E3) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
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
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '×';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkk9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */