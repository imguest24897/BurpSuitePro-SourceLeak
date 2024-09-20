package burp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztt {
  private final List<String> ZH = new ArrayList<>();
  
  private final List<Ze0t> Za = new ArrayList<>();
  
  private final List<InetAddress> Zu = new ArrayList<>();
  
  private final List<InetAddress> ZU = new ArrayList<>();
  
  private final Set<Integer> ZX = new HashSet<>();
  
  private final Set<Integer> ZF = new HashSet<>();
  
  private final Set<Integer> ZZ = new HashSet<>();
  
  private final Set<Integer> Zr = new HashSet<>();
  
  private final Set<Integer> Ze = new HashSet<>();
  
  private final Map<String, List<String>> ZB = new HashMap<>();
  
  private final Map<String, List<String>> Zp = new HashMap<>();
  
  private final List<Ztrp> Zy = new ArrayList<>();
  
  private final List<InetAddress> Zl = new ArrayList<>();
  
  private final Map<String, Zkhh> Zx = new HashMap<>();
  
  private final List<Zm3o> ZN = new LinkedList<>();
  
  private final List<InetAddress> ZA = new ArrayList<>();
  
  private String Zv;
  
  private String Zs;
  
  private String ZS;
  
  private String Zd;
  
  private int Zn = 7;
  
  private InetAddress Zt;
  
  private int ZO = 80;
  
  private int ZK = 443;
  
  private String ZW;
  
  private String Zf;
  
  private String Zw;
  
  private int Zz = 5;
  
  private long ZG = 10000000L;
  
  private long Zh = Long.MAX_VALUE;
  
  private String ZC;
  
  private String ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztt Zg(int paramInt) {
    this.ZX.add(Integer.valueOf(paramInt));
    return this;
  }
  
  public Ztt ZB(Collection<Integer> paramCollection) {
    this.ZX.addAll(paramCollection);
    return this;
  }
  
  public Ztt Z_(String paramString) {
    this.Zv = paramString;
    return this;
  }
  
  public Ztt ZS(int paramInt) {
    this.ZF.add(Integer.valueOf(paramInt));
    return this;
  }
  
  public Ztt Zh(Collection<Integer> paramCollection) {
    this.ZF.addAll(paramCollection);
    return this;
  }
  
  public Ztt Zt(int paramInt) {
    this.ZZ.add(Integer.valueOf(paramInt));
    return this;
  }
  
  public Ztt Zl(Collection<Integer> paramCollection) {
    this.ZZ.addAll(paramCollection);
    return this;
  }
  
  public Ztt ZC(int paramInt) {
    this.Zr.add(Integer.valueOf(paramInt));
    return this;
  }
  
  public Ztt ZH(Collection<Integer> paramCollection) {
    this.Zr.addAll(paramCollection);
    return this;
  }
  
  public Ztt Zp(int paramInt) {
    this.Ze.add(Integer.valueOf(paramInt));
    return this;
  }
  
  public Ztt Zm(Collection<Integer> paramCollection) {
    this.Ze.addAll(paramCollection);
    return this;
  }
  
  public Ztt Zu(InetAddress paramInetAddress) {
    this.Zu.add(paramInetAddress);
    return this;
  }
  
  public Ztt ZX(InetAddress paramInetAddress) {
    this.ZU.add(paramInetAddress);
    return this;
  }
  
  public Ztt ZX(Ze0t paramZe0t) {
    this.Za.add(paramZe0t);
    return this;
  }
  
  public Ztt ZL(int paramInt) {
    this.Zn = paramInt;
    return this;
  }
  
  public Ztt ZG(String paramString) {
    this.ZS = paramString;
    return this;
  }
  
  public Ztt ZJ(String paramString) {
    this.Zs = paramString;
    return this;
  }
  
  public Ztt ZT(String paramString) {
    this.Zd = paramString;
    return this;
  }
  
  public Ztt ZR(String paramString, List<String> paramList) {
    this.ZB.put(paramString, paramList);
    return this;
  }
  
  public Ztt Zd(long paramLong) {
    this.ZG = paramLong;
    return this;
  }
  
  public Ztt Zs(long paramLong) {
    this.Zh = paramLong;
    return this;
  }
  
  public Ztt Zz(InetAddress paramInetAddress) {
    this.Zt = paramInetAddress;
    return this;
  }
  
  public Ztt ZI(int paramInt) {
    this.ZO = paramInt;
    return this;
  }
  
  public Ztt ZQ(int paramInt) {
    this.ZK = paramInt;
    return this;
  }
  
  public Ztt Zt(String paramString) {
    this.Zf = paramString;
    return this;
  }
  
  public Ztt ZK(String paramString) {
    this.ZL = paramString;
    return this;
  }
  
  public Ztt ZD(String paramString) {
    this.ZW = paramString;
    return this;
  }
  
  public Ztt Zs(String paramString) {
    this.Zw = paramString;
    return this;
  }
  
  public Ztt Zc(String paramString, List<String> paramList) {
    this.Zp.put(paramString, paramList);
    return this;
  }
  
  public Ztt Zq(String paramString) {
    this.ZH.add(paramString);
    return this;
  }
  
  public Ztt Zp(InetAddress paramInetAddress) {
    this.ZA.add(paramInetAddress);
    return this;
  }
  
  public Ztt Zj(String paramString) {
    this.ZC = paramString;
    return this;
  }
  
  public Ztt Zj(Ztrp paramZtrp) {
    this.Zy.add(paramZtrp);
    return this;
  }
  
  public Ztt Zw(int paramInt) {
    this.Zz = paramInt;
    return this;
  }
  
  public Ztt ZB(InetAddress paramInetAddress) {
    this.Zl.add(paramInetAddress);
    return this;
  }
  
  public Ztt Zd(Zkhh paramZkhh) {
    this.Zx.put(paramZkhh.ZN(), paramZkhh);
    return this;
  }
  
  public Ztt ZA(Zm3o paramZm3o) {
    try {
      if (paramZm3o.Zd() == 5)
        try {
          if (this.ZN.stream().anyMatch(paramZm3o::lambda$withCustomDnsRecord$0))
            throw new IllegalStateException(); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZN.add(paramZm3o);
    return this;
  }
  
  public Zguf ZS() {
    int i = Zrak.ZW();
    try {
      if (this.ZU.size() == 0)
        try {
          this.ZU.add(InetAddress.getLocalHost());
        } catch (UnknownHostException unknownHostException) {
          Zah.Zl(unknownHostException, Zk_.UNEXPECTED);
          ZG(a(9335, -31970), unknownHostException);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.ZA.isEmpty())
        this.ZA.addAll(this.ZU); 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    try {
      if (this.Zy.isEmpty())
        this.Zy.add(new Ztrp(a(9334, -22440), null, this.ZU)); 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    Zx(this.ZX, new int[] { 53 });
    Zx(this.ZF, new int[] { 80 });
    Zx(this.ZZ, new int[] { 443 });
    Zx(this.Zr, new int[] { 25, 587 });
    Zx(this.Ze, new int[] { 465 });
    Zsnx zsnx = new Zsnx(this.Zy, this.ZX);
    Zreh zreh1 = ZF(this.ZH, this.ZS, this.Zd, this.Zs, this.ZB);
    Zreh zreh2 = ZF(this.ZH, this.Zf, this.Zw, this.ZW, this.Zp);
    Zs_b zs_b = new Zs_b(this.ZG, this.Zh);
    try {
      if (Zbqc.Zwu() == null)
        Zrak.Zz(++i); 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    return new Zguf(this.ZF, this.ZZ, this.Zr, this.Ze, this.Zu, this.ZU, this.ZC, this.Zn, this.Za, this.Zv, zreh1, this.Zt, this.ZL, this.ZO, this.ZK, zreh2, this.ZH, this.ZA, zsnx, this.Zz, this.Zl, this.Zx.values(), this.ZN, zs_b);
  }
  
  private static Zreh ZF(List<String> paramList, String paramString1, String paramString2, String paramString3, Map<String, List<String>> paramMap) {
    // Byte code:
    //   0: invokestatic ZW : ()I
    //   3: new burp/Zreh
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #6
    //   12: istore #5
    //   14: aload #4
    //   16: invokeinterface isEmpty : ()Z
    //   21: ifeq -> 86
    //   24: aload_0
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore #7
    //   32: aload #7
    //   34: invokeinterface hasNext : ()Z
    //   39: ifeq -> 81
    //   42: aload #7
    //   44: invokeinterface next : ()Ljava/lang/Object;
    //   49: checkcast java/lang/String
    //   52: astore #8
    //   54: aload #6
    //   56: aload #8
    //   58: new burp/Zrak
    //   61: dup
    //   62: aload #8
    //   64: aload_1
    //   65: aload_2
    //   66: aload_3
    //   67: invokestatic emptyList : ()Ljava/util/List;
    //   70: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    //   73: invokevirtual ZH : (Ljava/lang/String;Lburp/Zrak;)V
    //   76: iload #5
    //   78: ifeq -> 32
    //   81: iload #5
    //   83: ifeq -> 451
    //   86: aload_0
    //   87: invokeinterface isEmpty : ()Z
    //   92: ifeq -> 150
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload #4
    //   104: invokeinterface size : ()I
    //   109: iconst_1
    //   110: if_icmpgt -> 138
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload #4
    //   122: aconst_null
    //   123: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   128: ifne -> 451
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: new burp/Zs0z
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: athrow
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: aload_0
    //   151: invokeinterface size : ()I
    //   156: iconst_1
    //   157: if_icmpne -> 256
    //   160: aload_0
    //   161: iconst_0
    //   162: invokeinterface get : (I)Ljava/lang/Object;
    //   167: checkcast java/lang/String
    //   170: astore #7
    //   172: aload #4
    //   174: invokeinterface size : ()I
    //   179: iconst_1
    //   180: if_icmple -> 195
    //   183: new burp/Zs0z
    //   186: dup
    //   187: invokespecial <init> : ()V
    //   190: athrow
    //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   194: athrow
    //   195: aload #4
    //   197: aload #7
    //   199: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   204: checkcast java/util/List
    //   207: astore #8
    //   209: aload #8
    //   211: ifnonnull -> 230
    //   214: aload #4
    //   216: aconst_null
    //   217: invokestatic emptyList : ()Ljava/util/List;
    //   220: invokeinterface getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   225: checkcast java/util/List
    //   228: astore #8
    //   230: aload #6
    //   232: aload #7
    //   234: new burp/Zrak
    //   237: dup
    //   238: aload #7
    //   240: aload_1
    //   241: aload_2
    //   242: aload_3
    //   243: aload #8
    //   245: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    //   248: invokevirtual ZH : (Ljava/lang/String;Lburp/Zrak;)V
    //   251: iload #5
    //   253: ifeq -> 451
    //   256: aload #4
    //   258: invokeinterface keySet : ()Ljava/util/Set;
    //   263: invokeinterface iterator : ()Ljava/util/Iterator;
    //   268: astore #7
    //   270: aload #7
    //   272: invokeinterface hasNext : ()Z
    //   277: ifeq -> 332
    //   280: aload #7
    //   282: invokeinterface next : ()Ljava/lang/Object;
    //   287: checkcast java/lang/String
    //   290: astore #8
    //   292: aload #8
    //   294: ifnull -> 315
    //   297: aload_0
    //   298: aload #8
    //   300: invokeinterface contains : (Ljava/lang/Object;)Z
    //   305: ifne -> 327
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   314: athrow
    //   315: new burp/Zs0z
    //   318: dup
    //   319: invokespecial <init> : ()V
    //   322: athrow
    //   323: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   326: athrow
    //   327: iload #5
    //   329: ifeq -> 270
    //   332: new java/util/TreeSet
    //   335: dup
    //   336: aload_0
    //   337: invokespecial <init> : (Ljava/util/Collection;)V
    //   340: astore #7
    //   342: new java/util/TreeSet
    //   345: dup
    //   346: aload #4
    //   348: invokeinterface keySet : ()Ljava/util/Set;
    //   353: invokespecial <init> : (Ljava/util/Collection;)V
    //   356: astore #8
    //   358: aload #7
    //   360: aload #8
    //   362: invokeinterface equals : (Ljava/lang/Object;)Z
    //   367: ifne -> 382
    //   370: new burp/Zs0z
    //   373: dup
    //   374: invokespecial <init> : ()V
    //   377: athrow
    //   378: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   381: athrow
    //   382: aload_0
    //   383: invokeinterface iterator : ()Ljava/util/Iterator;
    //   388: astore #9
    //   390: aload #9
    //   392: invokeinterface hasNext : ()Z
    //   397: ifeq -> 451
    //   400: aload #9
    //   402: invokeinterface next : ()Ljava/lang/Object;
    //   407: checkcast java/lang/String
    //   410: astore #10
    //   412: aload #6
    //   414: aload #10
    //   416: new burp/Zrak
    //   419: dup
    //   420: aload #10
    //   422: aload_1
    //   423: aload_2
    //   424: aload_3
    //   425: aload #4
    //   427: aload #10
    //   429: invokestatic emptyList : ()Ljava/util/List;
    //   432: invokeinterface getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   437: checkcast java/util/List
    //   440: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    //   443: invokevirtual ZH : (Ljava/lang/String;Lburp/Zrak;)V
    //   446: iload #5
    //   448: ifeq -> 390
    //   451: aload #6
    //   453: areturn
    // Exception table:
    //   from	to	target	type
    //   81	95	98	java/lang/IllegalStateException
    //   86	113	116	java/lang/IllegalStateException
    //   102	131	134	java/lang/IllegalStateException
    //   120	146	146	java/lang/IllegalStateException
    //   172	191	191	java/lang/IllegalStateException
    //   292	308	311	java/lang/IllegalStateException
    //   297	323	323	java/lang/IllegalStateException
    //   358	378	378	java/lang/IllegalStateException
  }
  
  private static void Zx(Set<Integer> paramSet, int... paramVarArgs) {
    int i = Zrak.ZW();
    if (paramSet.isEmpty()) {
      int[] arrayOfInt = paramVarArgs;
      int j = arrayOfInt.length;
      byte b = 0;
      while (b < j) {
        int k = arrayOfInt[b];
        paramSet.add(Integer.valueOf(k));
        b++;
        if (i != 0)
          break; 
      } 
    } 
  }
  
  private static void ZG(String paramString, Exception paramException) {
    throw new Zs0z(paramString, paramException);
  }
  
  private static boolean lambda$withCustomDnsRecord$0(Zm3o paramZm3o1, Zm3o paramZm3o2) {
    try {
      if (paramZm3o2.Zd() == paramZm3o1.Zd())
        try {
          if (paramZm3o2.Zu().equalsIgnoreCase(paramZm3o1.Zu()));
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '©9òÉgE\\r\ø½Ö©9ä£.Úì\úò¦5­v¾bè°ÃÎ(Øül·'){ÝnoýÙ+0Ðj|ô4=î¸Þ¿$è{hy­o¬êgÇã».ÆÃ/Íç°É· -¥£> àöÀ{<`¢O«ß%TrÒI=P^aÍ9CüyqÊ*hK,©\\ftßi&D4nºK»¶ó2ZÔ_B5MãnðgE",éÓ:À\\r_Öüæò¶W(ñ=74c'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #38
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Ztt.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Ztt.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #20
    //   154: goto -> 184
    //   157: bipush #41
    //   159: goto -> 184
    //   162: bipush #53
    //   164: goto -> 184
    //   167: bipush #99
    //   169: goto -> 184
    //   172: bipush #15
    //   174: goto -> 184
    //   177: bipush #25
    //   179: goto -> 184
    //   182: bipush #124
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2476) & 0xFFFF;
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
      char c = 'Ü';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */