package burp;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.portswigger.browser.Ztf;
import net.portswigger.browser.Ztk;

public class Zs9b implements Zka2 {
  private static final Predicate<Zg8y> ZD;
  
  private final Zr69 Zv;
  
  private final Zm90 ZX;
  
  private final Zmlb ZI;
  
  private final Zli8 Ze;
  
  private static final String a;
  
  public Zs9b(Zr69 paramZr69, Ztos<Zt18> paramZtos, Zz1m<Zt35> paramZz1m, Ztks paramZtks, Zzs1 paramZzs1, Zli8 paramZli8, Zl2k paramZl2k, Zzzx paramZzzx, Zeb5 paramZeb5, Zm90 paramZm90, Zr_4 paramZr_4, Zgb6 paramZgb6, BiConsumer<String, String> paramBiConsumer) throws Ztf {
    this.Zv = paramZr69;
    this.ZX = paramZm90;
    this.Ze = paramZli8;
    this.ZI = paramZtks.ZH(paramZr69, paramZtos, paramZz1m, paramZl2k, paramZzzx, paramZgb6, paramZr_4, paramZli8, paramZeb5, paramZm90, paramZzs1, paramBiConsumer);
  }
  
  public Zm0f ZF(Zl_ paramZl_, Zlru paramZlru, Ztpx paramZtpx) {
    this.ZX.Zm();
    Zmrv zmrv = this.ZI.Zx(paramZl_, paramZlru, paramZtpx);
    Zlat zlat = zmrv.ZHZ();
    List<Zg8y> list = ZX(zlat);
    return Zm0f.Zd(Zz36.Ze(zmrv, this.Zv.Zp()), zlat, list);
  }
  
  public Zm0f ZU(Zgyy paramZgyy, Zlru paramZlru, Ztpx paramZtpx) {
    this.ZX.Zm();
    Zmrv zmrv = this.ZI.ZE(paramZgyy, paramZlru, paramZtpx);
    List<Zg8y> list = ZX(zmrv.ZHZ());
    return Zm0f.Zd(Zz36.Ze(zmrv, this.Zv.Zp()), zmrv.ZHZ(), list);
  }
  
  private List<Zg8y> ZX(Zlat paramZlat) {
    return (paramZlat.Zu() != null) ? Collections.emptyList() : (List<Zg8y>)this.Ze.Zh(paramZlat.ZO(), paramZlat.ZE()).stream().filter(ZD).collect(Collectors.toList());
  }
  
  void Zm(List<Ztbr> paramList) throws Ztk {
    this.ZI.Z_(paramList);
  }
  
  public void ZM() throws Zeij {
    this.ZI.Zj();
  }
  
  public void ZW() {
    this.ZI.ZA();
  }
  
  public String toString() {
    return a + a + String.valueOf(this.ZI);
  }
  
  private static boolean lambda$static$0(Zg8y paramZg8y) {
    return (paramZg8y.ZM() != Zz3o.IFRAME && paramZg8y.ZM() != Zz3o.FRAME);
  }
  
  static {
    // Byte code:
    //   0: bipush #116
    //   2: ldc '8w9<\\f/^,6\\b!x.='(h86X'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs9b.a : Ljava/lang/String;
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
    //   80: bipush #15
    //   82: goto -> 112
    //   85: bipush #107
    //   87: goto -> 112
    //   90: bipush #63
    //   92: goto -> 112
    //   95: bipush #39
    //   97: goto -> 112
    //   100: bipush #18
    //   102: goto -> 112
    //   105: bipush #17
    //   107: goto -> 112
    //   110: bipush #46
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
    //   154: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   159: putstatic burp/Zs9b.ZD : Ljava/util/function/Predicate;
    //   162: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs9b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */