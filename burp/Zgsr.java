package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Zdc;
import net.portswigger.Zi0;
import net.portswigger.Zkb;
import net.portswigger.Zou;

class Zgsr {
  private final Zz1i ZW;
  
  private final Zra1 Zt;
  
  private final Zbnt ZG;
  
  private static final String a;
  
  Zgsr(Zz1i paramZz1i, Zra1 paramZra1, Zbnt paramZbnt) {
    this.ZW = paramZz1i;
    this.Zt = paramZra1;
    this.ZG = paramZbnt;
  }
  
  List<Zou> ZV(Zdc paramZdc) {
    try {
      if (!ZG(paramZdc))
        return null; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (List<Zou>)this.ZW.ZHU().stream().map(this::lambda$convertAuditItems$0).collect(Collectors.toList());
  }
  
  private boolean ZG(Zdc paramZdc) {
    try {
      if (this.ZW != null)
        try {
          if (this.Zt == Zra1.EXECUTION_MODE_ENTERPRISE_AGENT)
            try {
              if (paramZdc.Zv());
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private static List<Zi0> Zg(Zbza paramZbza) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Zb09> iterator = paramZbza.ZgA().iterator();
    int[] arrayOfInt = Zx61.ZS();
    while (iterator.hasNext()) {
      Zb09 zb09 = iterator.next();
      hashMap.compute(zb09.ZJz(), zb09::lambda$getErrorTypes$1);
      if (arrayOfInt == null)
        break; 
    } 
    return (List<Zi0>)paramZbza.ZgA().stream().filter(paramZbza::lambda$getErrorTypes$2).filter(hashMap::lambda$getErrorTypes$3).flatMap(Zgsr::lambda$getErrorTypes$4).distinct().map(Zgsr::ZC).collect(Collectors.toList());
  }
  
  private static Zi0 ZC(Zblb paramZblb) {
    try {
      switch (Zmf1.Zz[paramZblb.ordinal()]) {
        default:
          throw new MatchException(null, null);
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
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Zi0.UNKNOWN;
  }
  
  private static String Zf(Zlit paramZlit) {
    return paramZlit.Zdz().ZJQ() + paramZlit.Zdz().ZJQ() + a + paramZlit.Zdz().ZJ1() + ":";
  }
  
  private static Stream lambda$getErrorTypes$4(Zb09 paramZb09) {
    return paramZb09.ZJk().stream();
  }
  
  private static boolean lambda$getErrorTypes$3(Map paramMap, Zb09 paramZb09) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (paramZb09.ZJL() >= ((Long)paramMap.getOrDefault(paramZb09.ZJz(), Long.valueOf(0L))).longValue());
  }
  
  private static boolean lambda$getErrorTypes$2(Zbza paramZbza, Zb09 paramZb09) {
    return paramZbza.ZO(paramZb09.ZJz());
  }
  
  private static Long lambda$getErrorTypes$1(Zb09 paramZb09, Zl5x paramZl5x, Long paramLong) {
    try {
      if (paramLong != null) {
        try {
          if (paramLong.longValue() < paramZb09.ZJL());
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return Long.valueOf(paramLong.longValue());
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private Zou lambda$convertAuditItems$0(Zbza paramZbza) {
    Zz1p zz1p = paramZbza.ZU(this.ZG);
    Zlit zlit = zz1p.Zo;
    List<Zi0> list = Zg(paramZbza);
    return new Zou(Zf(zlit), Zkb.ZG(zlit.ZdH()), zz1p.Zb, paramZbza.Zgu(), list, paramZbza.ZgR(), paramZbza.Zgx(), paramZbza.ZgP(), Zkoy.ZI(paramZbza.ZgK()), Zkoy.ZI(paramZbza.Zg5()), (List)paramZbza.Zgr().stream().map(Zrdb::ZaF).collect(Collectors.toList()));
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: ldc 'e@4'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgsr.a : Ljava/lang/String;
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
    //   80: bipush #87
    //   82: goto -> 112
    //   85: bipush #103
    //   87: goto -> 112
    //   90: bipush #19
    //   92: goto -> 112
    //   95: bipush #24
    //   97: goto -> 112
    //   100: bipush #74
    //   102: goto -> 112
    //   105: bipush #107
    //   107: goto -> 112
    //   110: bipush #9
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgsr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */