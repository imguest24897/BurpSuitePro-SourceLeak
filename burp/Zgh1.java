package burp;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Zkb;
import net.portswigger.Zsy;

public class Zgh1 implements Zkrr {
  private static final Set<Short> Za = Set.of(Short.valueOf((short)256), Short.valueOf((short)257), Short.valueOf((short)260), Short.valueOf((short)262), Short.valueOf((short)263));
  
  private final Zz1i ZE;
  
  private final Zgic ZU;
  
  private final Ze3n ZT;
  
  private final Zkrp Zl;
  
  private final Zsy Zd;
  
  private final Zbnt Zh;
  
  private static String[] Zy;
  
  public Zgh1(Zz1i paramZz1i, Zgic paramZgic, Ze3n paramZe3n, Zkrp paramZkrp, Zsy paramZsy, Zbnt paramZbnt) {
    this.ZE = paramZz1i;
    this.ZU = paramZgic;
    this.ZT = paramZe3n;
    this.Zl = paramZkrp;
    String[] arrayOfString = Zt();
    this.Zd = paramZsy;
    this.Zh = paramZbnt;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_BrokenAccessControl;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (!Zh())
      return; 
    if (!ZZ())
      return; 
    Zm78 zm78 = new Zm78(this);
    Objects.requireNonNull(zm78);
    Zlyj zlyj1 = ZH(zm78::ZC);
    Objects.requireNonNull(zm78);
    Zlyj zlyj2 = ZH(zm78::ZQ);
    if (ZX(zlyj1, zlyj2))
      return; 
    if (!Zw()) {
      Zp(paramZz4_, zm78, zlyj1, zlyj2);
      return;
    } 
    Zd(zlyj1, zlyj2, paramZz4_, zm78);
  }
  
  private boolean Zw() {
    return this.ZE.ZHB().Zc(Zzgy.BROKEN_ACCESS_CONTROL);
  }
  
  private void Zd(Zlyj paramZlyj1, Zlyj paramZlyj2, Zz4_ paramZz4_, Zm78 paramZm78) {
    // Byte code:
    //   0: invokestatic Zt : ()[Ljava/lang/String;
    //   3: astore #5
    //   5: aload_1
    //   6: invokevirtual ZBc : ()Lnet/portswigger/browser/Zcv;
    //   9: astore #6
    //   11: aload #6
    //   13: ifnonnull -> 26
    //   16: aload_0
    //   17: aload_3
    //   18: aload #4
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual Zp : (Lburp/Zz4_;Lburp/Zm78;Lburp/Zlyj;Lburp/Zlyj;)V
    //   25: return
    //   26: aload_0
    //   27: getfield Zl : Lburp/Zkrp;
    //   30: aload #6
    //   32: invokevirtual ZU : ()Ljava/lang/String;
    //   35: invokevirtual Zg : (Ljava/lang/String;)Lburp/Zmie;
    //   38: astore #7
    //   40: aload #7
    //   42: getfield Za : Z
    //   45: ifeq -> 56
    //   48: aload #7
    //   50: getfield ZH : Lburp/Zs78;
    //   53: goto -> 59
    //   56: getstatic burp/Zs78.UNKNOWN : Lburp/Zs78;
    //   59: astore #8
    //   61: getstatic burp/Ztlx.ZU : [I
    //   64: aload #8
    //   66: invokevirtual ordinal : ()I
    //   69: iaload
    //   70: lookupswitch default -> 124, 1 -> 96, 2 -> 115
    //   96: aload_0
    //   97: aload_3
    //   98: aload #4
    //   100: aload_1
    //   101: aload_2
    //   102: aload #7
    //   104: getfield ZO : Ljava/lang/String;
    //   107: invokevirtual ZA : (Lburp/Zz4_;Lburp/Zm78;Lburp/Zlyj;Lburp/Zlyj;Ljava/lang/String;)V
    //   110: aload #5
    //   112: ifnull -> 124
    //   115: aload_0
    //   116: aload_3
    //   117: aload #4
    //   119: aload_1
    //   120: aload_2
    //   121: invokevirtual Zp : (Lburp/Zz4_;Lburp/Zm78;Lburp/Zlyj;Lburp/Zlyj;)V
    //   124: return
  }
  
  private void ZM(Zz4_ paramZz4_, Zm78 paramZm78, Zlyj paramZlyj1, Zlyj paramZlyj2, byte paramByte, String paramString) {
    Map<K, V> map = (paramString != null) ? Map.<K, V>of((K)Long.valueOf(Ztz3.RESERVED_FOR_FUTURE_USE.permanentIndex), (V)paramString) : Map.<K, V>of();
    paramZz4_.Zz(new Zx_5(Zzu2.BROKEN_ACCESS_CONTROL, (byte)0, 0, (Map)map, List.of(new Zt2w(null, Zl(paramZlyj1, paramZm78.Zy)), new Zt2w(null, Zl(paramZlyj2, paramZm78.Z_))), (byte)2, paramByte, this.ZT.Za(), Zkb.Zy(this.ZT.ZN()), null));
  }
  
  private void Zp(Zz4_ paramZz4_, Zm78 paramZm78, Zlyj paramZlyj1, Zlyj paramZlyj2) {
    ZM(paramZz4_, paramZm78, paramZlyj1, paramZlyj2, (byte)1, null);
  }
  
  private void ZA(Zz4_ paramZz4_, Zm78 paramZm78, Zlyj paramZlyj1, Zlyj paramZlyj2, String paramString) {
    ZM(paramZz4_, paramZm78, paramZlyj1, paramZlyj2, (byte)4, paramString);
  }
  
  private boolean ZX(Zlyj paramZlyj1, Zlyj paramZlyj2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zj : ()Z
    //   4: ifeq -> 22
    //   7: getstatic burp/Zlug.STATUS_CODE : Lburp/Zlug;
    //   10: getstatic burp/Zlug.PAGE_TITLE : Lburp/Zlug;
    //   13: getstatic burp/Zlug.JSON_NODE_COUNT : Lburp/Zlug;
    //   16: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   19: goto -> 34
    //   22: getstatic burp/Zlug.STATUS_CODE : Lburp/Zlug;
    //   25: getstatic burp/Zlug.LINE_COUNT : Lburp/Zlug;
    //   28: getstatic burp/Zlug.JSON_NODE_COUNT : Lburp/Zlug;
    //   31: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   34: astore_3
    //   35: new burp/Zm78
    //   38: dup
    //   39: aload_0
    //   40: invokespecial <init> : (Lburp/Zgh1;)V
    //   43: astore #4
    //   45: new burp/Zxzf
    //   48: dup
    //   49: aload_0
    //   50: getfield ZT : Lburp/Ze3n;
    //   53: invokevirtual ZA : ()Lburp/Zefx;
    //   56: invokeinterface ZF : ()Lburp/Zlit;
    //   61: aload_0
    //   62: aload #4
    //   64: <illegal opcode> get : (Lburp/Zgh1;Lburp/Zm78;)Ljava/util/function/Supplier;
    //   69: aload_0
    //   70: aload #4
    //   72: <illegal opcode> get : (Lburp/Zgh1;Lburp/Zm78;)Ljava/util/function/Supplier;
    //   77: invokestatic Zw : (Ljava/util/function/Supplier;Ljava/util/function/Supplier;)Lburp/Zk5d;
    //   80: new burp/Zsb8
    //   83: dup
    //   84: aload_0
    //   85: getfield ZT : Lburp/Ze3n;
    //   88: invokevirtual ZA : ()Lburp/Zefx;
    //   91: invokeinterface ZF : ()Lburp/Zlit;
    //   96: aload_1
    //   97: invokevirtual ZBB : ()Lburp/Zsxd;
    //   100: invokeinterface ZG : ()Lburp/Zg3d;
    //   105: invokeinterface Ze : ()Lburp/Zb6q;
    //   110: invokeinterface Za : ()Lburp/Zstu;
    //   115: aload_2
    //   116: invokevirtual ZBB : ()Lburp/Zsxd;
    //   119: invokeinterface ZG : ()Lburp/Zg3d;
    //   124: invokeinterface Ze : ()Lburp/Zb6q;
    //   129: invokeinterface Za : ()Lburp/Zstu;
    //   134: aload_0
    //   135: getfield Zh : Lburp/Zbnt;
    //   138: invokestatic of : ()Ljava/util/Set;
    //   141: aload_3
    //   142: invokespecial <init> : (Lburp/Zlit;Lburp/Zstu;Lburp/Zstu;Lburp/Zbnt;Ljava/util/Set;Ljava/util/Set;)V
    //   145: invokespecial <init> : (Lburp/Zlit;Lburp/Zk5d;Lburp/Zsb8;)V
    //   148: astore #5
    //   150: aload #5
    //   152: bipush #8
    //   154: invokevirtual Zy : (I)Z
    //   157: ireturn
  }
  
  private Zvow Zl(Zlyj paramZlyj, List<String> paramList) {
    Zefx zefx = paramZlyj.ZBB().ZG().ZL();
    List<Zl1r> list = (List)paramList.stream().flatMap(zefx::lambda$getReportableRequestResponse$2).collect(Collectors.toList());
    return this.ZT.ZI().ZC(zefx).ZK(list).Zo(paramZlyj.ZBB().ZG().Ze());
  }
  
  public boolean Zj() {
    String[] arrayOfString = Zt();
    if (Zbqc.Zwu() == null)
      Zh(new String[5]); 
    return ((this.ZT.Zp()).ZH.Zj == 256 && Ztnx.ZN((this.ZT.Zp()).Zd) != null);
  }
  
  private Zlyj ZH(Function<Zefx, Zefx> paramFunction) {
    Objects.requireNonNull(paramFunction);
    Zlv5 zlv5 = (new Zlv5()).Za(Zxgd.Zu(paramFunction::apply)).ZE();
    return this.ZT.Zr(zlv5);
  }
  
  private boolean ZZ() {
    return !Za.contains(Short.valueOf((this.ZT.Zp()).ZH.Zj)) ? false : ((this.ZT.ZL().Ze() > 200) ? false : (!ZX(this.ZT) ? false : (!Zu(this.ZT))));
  }
  
  private boolean Zh() {
    Zkq4 zkq4 = this.ZU.Zh();
    return !zkq4.Zf() ? false : ((zkq4.ZqM() == Zeko.MINIMIZE_FALSE_NEGATIVES || Zw()));
  }
  
  private boolean ZX(Ze3n paramZe3n) {
    Zbza zbza = paramZe3n.ZM();
    if (zbza.Zge()) {
      Zzg0 zzg0 = zbza.Zg3();
      return (zzg0.ZlC().ZD() != 1);
    } 
    return false;
  }
  
  private boolean Zu(Ze3n paramZe3n) {
    Zbza zbza = paramZe3n.ZM();
    if (!zbza.Zge())
      return true; 
    Zzg0 zzg0 = zbza.Zg3();
    return (zzg0.ZlC().ZD() != 1 && zzg0.Zlt().stream().anyMatch(Zgh1::lambda$accessibleWhilstUnauthenticated$3));
  }
  
  private static boolean lambda$accessibleWhilstUnauthenticated$3(Zszw paramZszw) {
    return (paramZszw.ZD() == 1);
  }
  
  private static Stream lambda$getReportableRequestResponse$2(Zefx paramZefx, String paramString) {
    return Zl8v.ZJ(paramString, paramZefx.ZD(), false).stream();
  }
  
  private Zstu lambda$responsesHaveDifferences$1(Zm78 paramZm78) {
    Objects.requireNonNull(paramZm78);
    return ZH(paramZm78::ZQ).ZBB().ZG().Ze().Za();
  }
  
  private Zstu lambda$responsesHaveDifferences$0(Zm78 paramZm78) {
    Objects.requireNonNull(paramZm78);
    return ZH(paramZm78::ZC).ZBB().ZG().Ze().Za();
  }
  
  public static void Zh(String[] paramArrayOfString) {
    Zy = paramArrayOfString;
  }
  
  public static String[] Zt() {
    return Zy;
  }
  
  static {
    if (Zt() != null)
      Zh(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgh1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */