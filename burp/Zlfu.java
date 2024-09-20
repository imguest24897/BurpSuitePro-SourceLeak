package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zlfu {
  private final Zbnt ZA;
  
  private final byte Zh;
  
  private final Zt68 ZE;
  
  private final Zlqw Zu;
  
  private static final String a;
  
  public Zlfu(Zt68 paramZt68, byte paramByte, Zbnt paramZbnt) {
    this.ZE = paramZt68;
    this.Zh = paramByte;
    this.ZA = paramZbnt;
    this.Zu = new Zlqw(paramZbnt);
  }
  
  public Zt68 ZL(Zmzk paramZmzk, Zstu paramZstu) {
    Zz1p zz1p = Zghc.ZY(paramZmzk, paramZstu, this.Zh, this.ZA);
    return new Zt6j(zz1p);
  }
  
  public Zt68 ZP(Zmzk paramZmzk, List<Zelp> paramList, Zstu paramZstu) {
    Zv8m zv8m = new Zv8m(this.ZE);
    if (ZM((byte)1)) {
      List<String> list = (List)paramList.stream().map(Zelp::Zc).collect(Collectors.toList());
      zv8m.ZH(list);
      zv8m.Zg(this.Zu.ZQ(paramZmzk, paramList));
    } 
    if (ZM((byte)2)) {
      List<Zt8g> list = ZK(paramList);
      Objects.requireNonNull(list);
      paramList.stream().filter(Zelp::ZP).filter(Zlfu::lambda$analyseStructuredData$0).map(Zlfu::lambda$analyseStructuredData$1).forEach(list::addAll);
      String str = paramList.stream().filter(Zelp::ZS).map(Zelp::Zc).findFirst().orElse(null);
      list.addAll(Zeex.ZB(paramZstu, str, 0));
      zv8m.Zq(Zeex.Zq(str, paramZstu, 0));
      zv8m.Zy(list);
    } 
    return zv8m.Za();
  }
  
  private boolean ZM(byte paramByte) {
    return ((this.Zh & paramByte) > 0 && !this.ZE.Zf(paramByte));
  }
  
  private static List<Zt8g> ZK(List<Zelp> paramList) {
    Zelp zelp = paramList.stream().filter(Zlfu::lambda$parseUrlParams$2).findFirst().orElse(null);
    return (zelp != null) ? new LinkedList<>(Zeex.ZZ(zelp.ZR())) : new LinkedList<>();
  }
  
  private static boolean lambda$parseUrlParams$2(Zelp paramZelp) {
    return a.equals(paramZelp.ZJ().Zis());
  }
  
  private static List lambda$analyseStructuredData$1(Zelp paramZelp) {
    return Zeex.ZW(Zrdu.COOKIE, paramZelp.ZR(), 0, paramZelp.ZR().Zpu(), Zsba.COOKIES, null);
  }
  
  private static boolean lambda$analyseStructuredData$0(Zelp paramZelp) {
    return (paramZelp.ZR() != null);
  }
  
  static {
    // Byte code:
    //   0: bipush #92
    //   2: ldc '"o}pm'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlfu.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #68
    //   82: goto -> 112
    //   85: bipush #67
    //   87: goto -> 112
    //   90: bipush #64
    //   92: goto -> 112
    //   95: bipush #88
    //   97: goto -> 112
    //   100: bipush #89
    //   102: goto -> 112
    //   105: bipush #107
    //   107: goto -> 112
    //   110: bipush #61
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlfu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */