package burp;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrag implements Zgao, Zmgs {
  private final Zz4b Zm;
  
  private final Zr_h ZZ;
  
  private final Zs4 ZP;
  
  private final Ztos<Zt11> Zn;
  
  private final Zzkr ZT;
  
  private final Zxea Zp;
  
  private final List<Ztj1> ZK;
  
  private static final String a;
  
  public Zrag(Zz4b paramZz4b, Zr_h paramZr_h, Zs4 paramZs4, Ztos<Zt11> paramZtos, Zzkr paramZzkr, Zxea paramZxea) {
    this.Zm = paramZz4b;
    this.ZZ = paramZr_h;
    this.ZP = paramZs4;
    this.Zn = paramZtos;
    this.ZT = paramZzkr;
    this.Zp = paramZxea;
    this.ZK = new CopyOnWriteArrayList<>();
    if (paramZz4b.ZV3())
      paramZzkr.ZH(); 
  }
  
  public Ztj1 ZN(Zb_6 paramZb_6) {
    Zuh.Zb(paramZb_6.ZM().ZPw(), Zqf.Zr);
    Ztj1 ztj1 = this.ZP.Zr(paramZb_6);
    this.ZK.add(ztj1);
    this.Zn.ZD(new Zxr8(Zt11.ZD, ztj1));
    return ztj1;
  }
  
  public void ZO() {
    this.Zn.ZD(Zt11.Za);
    this.ZT.ZH();
  }
  
  public void Zw() {
    String str = Ztj1.Ze();
    if (this.Zm.ZV3()) {
      ZR();
      if (str == null) {
        ZO();
        return;
      } 
      return;
    } 
    ZO();
  }
  
  public void ZR() {
    this.Zn.ZD(Zt11.ZG);
    this.ZT.ZK();
    this.ZK.forEach(Zrag::lambda$resume$0);
    this.ZZ.ZI();
  }
  
  public void Za(int paramInt) {
    Optional<Ztj1> optional = this.ZK.stream().filter(paramInt::lambda$deleteTaskWithId$1).findFirst();
    if (optional.isPresent()) {
      Ztj1 ztj1 = optional.get();
      boolean bool = this.ZK.remove(ztj1);
      Zuh.Zb(bool, Zqf.Zr);
      ztj1.Zv();
      ztj1.ZH();
      this.Zn.ZD(new Zxr8(Zt11.Zt, ztj1));
    } 
    this.Zm.Zs(paramInt);
  }
  
  public List<Ztj1> ZG(Zkcl paramZkcl) {
    return (List<Ztj1>)this.ZK.stream().filter(paramZkcl::lambda$getTasksOfType$2).collect(Collectors.toList());
  }
  
  public Zlli<Zt11> Zi() {
    return this.Zn;
  }
  
  public void Zl(Zz9t paramZz9t) {
    paramZz9t.ZP(a);
    Iterator<Ztj1> iterator = this.ZK.iterator();
    String str = Ztj1.Ze();
    while (iterator.hasNext()) {
      Ztj1 ztj1 = iterator.next();
      (new Zxg4(ztj1, this.ZT)).Zl(paramZz9t);
      paramZz9t.Zt();
      if (str == null)
        break; 
    } 
    paramZz9t.ZG();
    this.ZT.Zl(paramZz9t);
  }
  
  public void Za(Zx6t paramZx6t) {
    Ztj1 ztj1 = this.ZK.stream().filter(Zrag::lambda$addScanMetricsTo$3).findFirst().orElse(null);
    if (ztj1 == null)
      return; 
    ztj1.Zu(paramZx6t);
  }
  
  public void ZH(Zx6t paramZx6t) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZK : Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   14: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   19: invokeinterface findFirst : ()Ljava/util/Optional;
    //   24: aload_0
    //   25: aload_1
    //   26: <illegal opcode> accept : (Lburp/Zrag;Lburp/Zx6t;)Ljava/util/function/Consumer;
    //   31: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   34: return
  }
  
  public void Zv() {
    this.Zn.ZD(Zt11.Zg);
    this.ZT.Zx();
  }
  
  private void lambda$addResourcePoolMetricsTo$5(Zx6t paramZx6t, Ztj1 paramZtj1) {
    this.ZT.ZZ(paramZtj1.Zf()).Zl(paramZx6t);
  }
  
  private static boolean lambda$addScanMetricsTo$3(Ztj1 paramZtj1) {
    return (paramZtj1.Zh() == 3);
  }
  
  private static boolean lambda$getTasksOfType$2(Zkcl paramZkcl, Ztj1 paramZtj1) {
    return (paramZtj1.Zl() == paramZkcl);
  }
  
  private static boolean lambda$deleteTaskWithId$1(int paramInt, Ztj1 paramZtj1) {
    return (paramZtj1.Zh() == paramInt);
  }
  
  private static void lambda$resume$0(Ztj1 paramZtj1) {
    paramZtj1.Zr().ZD(Zt13.Zf);
  }
  
  static {
    // Byte code:
    //   0: bipush #94
    //   2: ldc 'c+\\few{*gj'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrag.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #111
    //   82: goto -> 111
    //   85: bipush #32
    //   87: goto -> 111
    //   90: iconst_1
    //   91: goto -> 111
    //   94: bipush #28
    //   96: goto -> 111
    //   99: bipush #114
    //   101: goto -> 111
    //   104: bipush #103
    //   106: goto -> 111
    //   109: bipush #98
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrag.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */