package burp;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zkb;
import net.portswigger.Zm2;
import net.portswigger.Zzc;

public class Zgq1 {
  private static final Set<String> ZK;
  
  private final Zkcl ZS;
  
  public Zgq1(Zkcl paramZkcl) {
    this.ZS = paramZkcl;
  }
  
  void Zs(Zlli<Zt1o> paramZlli) {
    if (this.ZS == Zkcl.API_AUDIT)
      paramZlli.ZE(Zt1o.Zq, this::lambda$subscribeTo$0); 
  }
  
  private void ZQ(Zblw paramZblw) {
    Zrsn zrsn = paramZblw.Zr();
    Zz1p zz1p = paramZblw.Zd();
    int i = Zriy.Zy();
    if (zrsn.Ze() >= 400) {
      Zm2.ZB(Zec3.SCANNER_API_SCAN_BASE_RESPONSE_4XX_OR_5XX_STATUS_CODE, String.valueOf(zrsn.Ze()));
      List<?> list = Zldg.Zd(false).stream().map(Zgq1::lambda$reportUnauthorizedBaseResponses$1).map(Zkb::ZG).map(String::toLowerCase).toList();
      List<CharSequence> list1 = (List)zz1p.ZG().stream().skip(1L).filter(Zgq1::lambda$reportUnauthorizedBaseResponses$2).map(Zgq1::lambda$reportUnauthorizedBaseResponses$3).map(String::toLowerCase).collect(Collectors.toList());
      list1.removeAll(list);
      list1.removeAll(ZK);
      boolean bool = !list1.isEmpty() ? true : false;
      if (bool) {
        Zm2.Zo(Zze0.SCANNER_API_SCAN_UNAUTHORIZED_BASE_RESPONSE_NON_STANDARD_HEADERS);
        Zm2.ZB(Zec3.SCANNER_API_SCAN_HEADERS_USED_FOR_UNAUTHORIZED_BASE_RESPONSE, Zzc.Zq(list1.stream().sorted().collect(Collectors.joining(","))));
        if (i != 0) {
          Zm2.Zo(Zze0.SCANNER_API_SCAN_UNAUTHORIZED_BASE_RESPONSE);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    Zm2.Zo(Zze0.SCANNER_API_SCAN_UNAUTHORIZED_BASE_RESPONSE);
  }
  
  private static String lambda$reportUnauthorizedBaseResponses$3(String paramString) {
    return paramString.substring(0, paramString.indexOf(':'));
  }
  
  private static boolean lambda$reportUnauthorizedBaseResponses$2(String paramString) {
    return paramString.contains(":");
  }
  
  private static byte[] lambda$reportUnauthorizedBaseResponses$1(Ztnz paramZtnz) {
    return paramZtnz.Ze;
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZQ);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'Px\5\\t\\bcK1\\tPx]*\\n'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #12
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #82
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
    //   67: ldc '8uIAH^;oK[T8u'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #14
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #18
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
    //   200: bipush #97
    //   202: goto -> 232
    //   205: bipush #69
    //   207: goto -> 232
    //   210: bipush #96
    //   212: goto -> 232
    //   215: bipush #19
    //   217: goto -> 232
    //   220: bipush #62
    //   222: goto -> 232
    //   225: bipush #61
    //   227: goto -> 232
    //   230: bipush #46
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
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: aload_0
    //   289: iconst_3
    //   290: aaload
    //   291: aload_0
    //   292: iconst_1
    //   293: aaload
    //   294: aload_0
    //   295: iconst_0
    //   296: aaload
    //   297: aload_0
    //   298: iconst_2
    //   299: aaload
    //   300: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   303: putstatic burp/Zgq1.ZK : Ljava/util/Set;
    //   306: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgq1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */