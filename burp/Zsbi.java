package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Zsbi {
  private static final Set<String> Zk;
  
  private static final Set<String> ZK;
  
  private static final List<String> ZW;
  
  private static final List<String> Zv;
  
  private static final Pattern Zg;
  
  private static final Pattern ZI;
  
  private final Zes5 ZM;
  
  private final List<Zlou> ZU;
  
  public Zsbi(List<Zlou> paramList, Zes5 paramZes5) {
    this.ZU = paramList;
    this.ZM = paramZes5;
  }
  
  public Zsiw ZU() {
    ArrayList<Zlou> arrayList = new ArrayList();
    Iterator<Zlou> iterator = this.ZU.iterator();
    Zbqc[] arrayOfZbqc = Zsiw.ZB();
    while (iterator.hasNext()) {
      Zlou zlou = iterator.next();
      if (zlou.Zx.ZO() && ZV(zlou))
        arrayList.add(zlou); 
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    return new Zsiw(arrayList);
  }
  
  private boolean ZV(Zlou paramZlou) {
    if (Zb(paramZlou))
      return false; 
    String str1 = paramZlou.Zr;
    if (str1.length() < 6)
      return false; 
    String str2 = paramZlou.ZA;
    return Zm(str2) ? true : (ZG(str2) ? true : (Zo(str2) ? false : (!this.ZM.Zy(paramZlou) ? false : (!ZQ(str1) ? false : (ZC(str1) ? false : (!ZR(str1)))))));
  }
  
  private boolean Zm(String paramString) {
    return Zk.contains(paramString.toLowerCase());
  }
  
  private boolean ZG(String paramString) {
    Zbqc[] arrayOfZbqc = Zsiw.ZB();
    for (String str : ZW) {
      if (paramString.toLowerCase().contains(str))
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private boolean Zo(String paramString) {
    return ZK.contains(paramString.toLowerCase());
  }
  
  private boolean ZR(String paramString) {
    String str = paramString.toLowerCase();
    Iterator<String> iterator = Zv.iterator();
    Zbqc[] arrayOfZbqc = Zsiw.ZB();
    while (iterator.hasNext()) {
      String str1 = iterator.next();
      if (str.contains(str1))
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private boolean ZC(String paramString) {
    return Zg.matcher(paramString).matches();
  }
  
  private boolean ZQ(String paramString) {
    return ZI.matcher(paramString).matches();
  }
  
  private boolean Zb(Zlou paramZlou) {
    return (paramZlou == null || paramZlou.Zr == null || paramZlou.ZA == null);
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '3s#F_@:#\\bk?\\nm%s4R0k\\rp\\f\\r'-<~z+{O\\re;\\b2r'ZBG24'm)A_U\\fd?ZbD$5C)ZW_Q@T25tQCH1/c'@XN9o-Q_6a5G'u2\TO#/c/@H~#)k#Z\\n o4YnU8-e(\\b6a5GFN%"#m']]_btoA\\n}u`O\\b\\b o4YY@$._}tvAq'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #8
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #38
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 129
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'A^",[[$''
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: iconst_5
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #85
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
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #96
    //   202: goto -> 232
    //   205: bipush #38
    //   207: goto -> 232
    //   210: bipush #96
    //   212: goto -> 232
    //   215: bipush #18
    //   217: goto -> 232
    //   220: bipush #23
    //   222: goto -> 232
    //   225: bipush #7
    //   227: goto -> 232
    //   230: bipush #113
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 98
    //   288: aload_0
    //   289: bipush #7
    //   291: aaload
    //   292: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   295: aload_0
    //   296: bipush #13
    //   298: aaload
    //   299: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   302: aload_0
    //   303: bipush #17
    //   305: aaload
    //   306: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   309: aload_0
    //   310: bipush #14
    //   312: aaload
    //   313: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   316: aload_0
    //   317: bipush #6
    //   319: aaload
    //   320: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   323: aload_0
    //   324: bipush #9
    //   326: aaload
    //   327: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   330: aload_0
    //   331: bipush #10
    //   333: aaload
    //   334: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   337: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   340: putstatic burp/Zsbi.Zk : Ljava/util/Set;
    //   343: aload_0
    //   344: bipush #15
    //   346: aaload
    //   347: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   350: aload_0
    //   351: bipush #11
    //   353: aaload
    //   354: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   357: aload_0
    //   358: iconst_0
    //   359: aaload
    //   360: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   363: aload_0
    //   364: bipush #12
    //   366: aaload
    //   367: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   370: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   373: putstatic burp/Zsbi.ZK : Ljava/util/Set;
    //   376: aload_0
    //   377: iconst_2
    //   378: aaload
    //   379: aload_0
    //   380: bipush #16
    //   382: aaload
    //   383: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   386: putstatic burp/Zsbi.ZW : Ljava/util/List;
    //   389: aload_0
    //   390: iconst_4
    //   391: aaload
    //   392: aload_0
    //   393: iconst_5
    //   394: aaload
    //   395: aload_0
    //   396: bipush #8
    //   398: aaload
    //   399: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   402: putstatic burp/Zsbi.Zv : Ljava/util/List;
    //   405: aload_0
    //   406: iconst_1
    //   407: aaload
    //   408: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   411: putstatic burp/Zsbi.Zg : Ljava/util/regex/Pattern;
    //   414: aload_0
    //   415: iconst_3
    //   416: aaload
    //   417: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   420: putstatic burp/Zsbi.ZI : Ljava/util/regex/Pattern;
    //   423: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */