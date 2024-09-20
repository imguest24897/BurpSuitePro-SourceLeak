package burp;

import java.util.Optional;

public class Zg5w implements Zlkl {
  private final Ztdi ZG;
  
  private final Ztuv Zk;
  
  private final Zr_4 Zb;
  
  private final Zbnt Za;
  
  private static Zbqc[] ZP;
  
  private static final String a;
  
  public Zg5w(Ztdi paramZtdi, Ztuv paramZtuv, Zr_4 paramZr_4, Zbnt paramZbnt) {
    this.ZG = paramZtdi;
    Zbqc[] arrayOfZbqc = Zh();
    this.Zk = paramZtuv;
    this.Zb = paramZr_4;
    this.Za = paramZbnt;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void Zj(Zgb7<?> paramZgb7) {
    Optional<Zsxd> optional = paramZgb7.Zk();
    if (optional.isEmpty() || ((Zsxd)optional.get()).ZG().Ze() == null)
      return; 
    Ztgw ztgw = paramZgb7.Zb();
    Zstu zstu = ((Zsxd)optional.get()).ZG().Ze().Za();
    Zs68 zs68 = Zbwc.Zt(ztgw.Zd().ZyR(), zstu, Zt0k.HTML_HEAD_ANALYSIS, this.Za);
    Zez3 zez3 = Zo(ztgw);
    (new Zsir()).Zp(Zyf.Zy(ztgw.ZP().ZD()).Zp(this.Zb), ztgw.ZC()).ZV(zstu.Zp(this.Zb), zs68.Zs, zs68.Zb, zs68.ZH.Zj, Zsir.ZO(zs68), System.currentTimeMillis()).ZZ((byte)2, (byte)0).Zd(zez3);
    this.ZG.ZR(zez3);
  }
  
  public Optional<Zlcg> Zh(Ztgw paramZtgw) {
    // Byte code:
    //   0: invokestatic Zh : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual Zo : (Lburp/Ztgw;)Lburp/Zez3;
    //   9: invokeinterface ZoO : ()Lburp/Zstu;
    //   14: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   17: aload_0
    //   18: aload_1
    //   19: <illegal opcode> apply : (Lburp/Zg5w;Lburp/Ztgw;)Ljava/util/function/Function;
    //   24: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   27: invokestatic Zwu : ()[Lburp/Zbqc;
    //   30: ifnonnull -> 40
    //   33: iconst_3
    //   34: anewarray burp/Zbqc
    //   37: invokestatic Zz : ([Lburp/Zbqc;)V
    //   40: areturn
  }
  
  private Zez3 Zo(Ztgw paramZtgw) {
    Zlit zlit = paramZtgw.Zd().ZyR();
    return a.equalsIgnoreCase(paramZtgw.ZC()) ? this.ZG.Zb(zlit, Zyf.Zy(paramZtgw.ZP().ZD()), paramZtgw.ZP().ZR(), (short)0, this.Zk) : this.ZG.Zs(zlit, (short)0, this.Zk);
  }
  
  private Zlcg lambda$get$0(Ztgw paramZtgw, Zstu paramZstu) {
    Zs68 zs68 = Zbwc.Zt(paramZtgw.Zd().ZyR(), paramZstu, Zt0k.NO_HTML_ANALYSIS, this.Za);
    return Zlcg.ZL(zs68.Zb, Ztfi.Zj(zs68), Ztfi.Zu(zs68.Zy()), paramZstu.Zb(zs68.Zk, paramZstu.Zpu()));
  }
  
  public static void Zz(Zbqc[] paramArrayOfZbqc) {
    ZP = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zh() {
    return ZP;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zh : ()[Lburp/Zbqc;
    //   3: ifnonnull -> 13
    //   6: iconst_3
    //   7: anewarray burp/Zbqc
    //   10: invokestatic Zz : ([Lburp/Zbqc;)V
    //   13: bipush #11
    //   15: ldc 'IUT'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zg5w.a : Ljava/lang/String;
    //   24: goto -> 165
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 139
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #18
    //   94: goto -> 123
    //   97: bipush #17
    //   99: goto -> 123
    //   102: bipush #12
    //   104: goto -> 123
    //   107: bipush #79
    //   109: goto -> 123
    //   112: bipush #49
    //   114: goto -> 123
    //   117: iconst_2
    //   118: goto -> 123
    //   121: bipush #21
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 48
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 45
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 21
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg5w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */