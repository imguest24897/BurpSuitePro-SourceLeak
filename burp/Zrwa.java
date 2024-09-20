package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zrwa extends Zrwm {
  private final Map<Short, List<Zrdb>> Zt;
  
  private final Zz2h Zx;
  
  private final List<Zrdb> Zo;
  
  private final short Zk;
  
  private static final String a;
  
  public Zrwa(Map<Short, List<Zrdb>> paramMap, Zz2h paramZz2h, List<Zrdb> paramList, short paramShort) {
    this.Zt = paramMap;
    this.Zx = paramZz2h;
    boolean bool = Zrwm.Zb();
    this.Zo = paramList;
    this.Zk = paramShort;
    if (Zbqc.Zwu() == null)
      Zrwm.ZW(!bool); 
  }
  
  public void Zr(Zrdb paramZrdb) {
    // Byte code:
    //   0: invokestatic Zb : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokestatic Zd : (Lburp/Zrdb;)Z
    //   8: ifeq -> 82
    //   11: aload_1
    //   12: aload_0
    //   13: getfield Zo : Ljava/util/List;
    //   16: invokestatic Zc : (Lburp/Zrdb;Ljava/util/List;)Ljava/util/List;
    //   19: astore_3
    //   20: aload_0
    //   21: aload_1
    //   22: aload_3
    //   23: invokevirtual Zv : (Lburp/Zrdb;Ljava/util/List;)Z
    //   26: istore #4
    //   28: iload #4
    //   30: ifeq -> 68
    //   33: aload_0
    //   34: getfield Zt : Ljava/util/Map;
    //   37: aload_0
    //   38: getfield Zk : S
    //   41: invokestatic valueOf : (S)Ljava/lang/Short;
    //   44: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   49: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   54: checkcast java/util/List
    //   57: aload_1
    //   58: invokeinterface add : (Ljava/lang/Object;)Z
    //   63: pop
    //   64: iload_2
    //   65: ifne -> 78
    //   68: aload_0
    //   69: getfield Zu : Lburp/Zsmo;
    //   72: aload_1
    //   73: invokeinterface Zr : (Lburp/Zrdb;)V
    //   78: iload_2
    //   79: ifne -> 92
    //   82: aload_0
    //   83: getfield Zu : Lburp/Zsmo;
    //   86: aload_1
    //   87: invokeinterface Zr : (Lburp/Zrdb;)V
    //   92: return
  }
  
  private boolean Zv(Zrdb paramZrdb, List<Zrdb> paramList) {
    if (paramZrdb.Za6() == Zzu2.JWT_WEAK_HMAC_SECRET) {
      Objects.requireNonNull(paramZrdb.ZaT().ZK());
      return paramList.stream().map(Zrwa::lambda$shouldMergeIssues$1).anyMatch(paramZrdb.ZaT().ZK()::equals);
    } 
    int i = this.Zx.ZW(paramList) + 1;
    return (i > 1);
  }
  
  private static boolean Zd(Zrdb paramZrdb) {
    return (paramZrdb.Za6() != Zzu2.CROSS_DOMAIN_POST && paramZrdb.Za6() != Zzu2.SERIALIZED_OBJECT_IN_HTTP_MESSAGE && !paramZrdb.ZaT().ZK().equals(a));
  }
  
  private static List<Zrdb> Zc(Zrdb paramZrdb, List<Zrdb> paramList) {
    return (List<Zrdb>)paramList.stream().filter(paramZrdb::lambda$findIssuesOfSameType$2).filter(paramZrdb::lambda$findIssuesOfSameType$3).collect(Collectors.toList());
  }
  
  private static boolean lambda$findIssuesOfSameType$3(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    return !paramZrdb2.ZF(paramZrdb1);
  }
  
  private static boolean lambda$findIssuesOfSameType$2(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    return (paramZrdb2.Za6() == paramZrdb1.Za6());
  }
  
  private static String lambda$shouldMergeIssues$1(Zrdb paramZrdb) {
    return paramZrdb.ZaT().ZK();
  }
  
  private static List lambda$handle$0(Short paramShort) {
    return new ArrayList();
  }
  
  static {
    // Byte code:
    //   0: bipush #57
    //   2: ldc '²vOLyAí®'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrwa.a : Ljava/lang/String;
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
    //   80: bipush #21
    //   82: goto -> 112
    //   85: bipush #10
    //   87: goto -> 112
    //   90: bipush #44
    //   92: goto -> 112
    //   95: bipush #115
    //   97: goto -> 112
    //   100: bipush #10
    //   102: goto -> 112
    //   105: bipush #48
    //   107: goto -> 112
    //   110: bipush #52
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrwa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */