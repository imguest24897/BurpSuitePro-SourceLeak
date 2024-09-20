package burp;

import java.util.Collections;
import java.util.function.BiConsumer;

public class Zzld {
  private final Zbnt Zp;
  
  private final Zesv Zh;
  
  private final Zgwp Zz;
  
  private final Zkoz Zk;
  
  private final Zlk2 Zm;
  
  private final Zmz6 ZM;
  
  private final Zkq4 Zr;
  
  private final Zlba Zd;
  
  private final Zbza Zo;
  
  private final Ze4e ZS;
  
  private final Zz1i Za;
  
  public Zzld(Zbnt paramZbnt, Zesv paramZesv, Zgwp paramZgwp, Zkoz paramZkoz, Zlk2 paramZlk2, Zmz6 paramZmz6, Zkq4 paramZkq4, Zlba paramZlba, Zbza paramZbza, Ze4e paramZe4e, Zz1i paramZz1i) {
    this.Zp = paramZbnt;
    this.Zh = paramZesv;
    this.Zz = paramZgwp;
    this.Zk = paramZkoz;
    this.Zm = paramZlk2;
    this.ZM = paramZmz6;
    this.Zr = paramZkq4;
    this.Zd = paramZlba;
    this.Zo = paramZbza;
    this.ZS = paramZe4e;
    this.Za = paramZz1i;
  }
  
  Zrbc ZZ(Zb9t paramZb9t, Zm7h paramZm7h) {
    // Byte code:
    //   0: new burp/Zz31
    //   3: dup
    //   4: getstatic burp/Zt0r.S2 : Lburp/Zt0r;
    //   7: aload_0
    //   8: getfield ZM : Lburp/Zmz6;
    //   11: aload_0
    //   12: getfield Zr : Lburp/Zkq4;
    //   15: aload_0
    //   16: getfield Za : Lburp/Zz1i;
    //   19: aload_0
    //   20: getfield Zd : Lburp/Zlba;
    //   23: aload_0
    //   24: getfield Zo : Lburp/Zbza;
    //   27: aload_0
    //   28: getfield ZS : Lburp/Ze4e;
    //   31: aload_0
    //   32: aload_2
    //   33: <illegal opcode> Zn : (Lburp/Zzld;Lburp/Zm7h;)Lburp/Zku7;
    //   38: aload_1
    //   39: <illegal opcode> apply : (Lburp/Zb9t;)Ljava/util/function/Function;
    //   44: <illegal opcode> Z_ : ()Lburp/Ztj_;
    //   49: aload_1
    //   50: dup
    //   51: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: pop
    //   55: <illegal opcode> get : (Lburp/Zb9t;)Ljava/util/function/Supplier;
    //   60: invokespecial <init> : (Lburp/Zl5x;Lburp/Zmz6;Lburp/Zkq4;Lburp/Zz1i;Lburp/Zlba;Lburp/Zbza;Lburp/Ze4e;Lburp/Zku7;Ljava/util/function/Function;Lburp/Ztj_;Ljava/util/function/Supplier;)V
    //   63: areturn
  }
  
  Zrbc ZE(Zb9t paramZb9t, Zm7h paramZm7h, Zrry paramZrry) {
    return new Zszp(this.Zp, paramZb9t, paramZm7h, paramZrry);
  }
  
  Zrbc ZU(Zb9t paramZb9t, Zm7h paramZm7h, Zrry paramZrry, Zlb4 paramZlb4) {
    return Zrbc.Zd(Collections.singleton(new Zenw(Zmdu.REFLECTED, paramZm7h, paramZrry, paramZlb4, this.Zk, paramZb9t, this.Zz, this.ZM)));
  }
  
  private static void lambda$buildConfirmDirectDomReflectionsPhase$4(Zrj paramZrj, Ze3n paramZe3n, Zz4_ paramZz4_) {}
  
  private static Ze3n lambda$buildConfirmDirectDomReflectionsPhase$3(Zb9t paramZb9t, Ztpx paramZtpx) {
    return paramZb9t.ZG();
  }
  
  private Ze5i lambda$buildConfirmDirectDomReflectionsPhase$2(Zm7h paramZm7h, Zrj paramZrj, Ztpx paramZtpx, Ze3n paramZe3n, Zz1i paramZz1i, Zxs7 paramZxs7, BiConsumer paramBiConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: aload #6
    //   3: aload #4
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zzld;Lburp/Zxs7;Lburp/Ze3n;Lburp/Zm7h;)Lburp/Ze5i;
    //   11: areturn
  }
  
  private void lambda$buildConfirmDirectDomReflectionsPhase$1(Zxs7 paramZxs7, Ze3n paramZe3n, Zm7h paramZm7h, Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zo : Lburp/Zbza;
    //   4: aload_1
    //   5: invokeinterface Zl : ()Lburp/Zro0;
    //   10: invokeinterface Zm : (Lburp/Zro0;)Z
    //   15: ifne -> 30
    //   18: aload_0
    //   19: getfield Zo : Lburp/Zbza;
    //   22: invokeinterface Zgt : ()Z
    //   27: ifne -> 66
    //   30: aload_0
    //   31: getfield Zh : Lburp/Zesv;
    //   34: aload_2
    //   35: aload_1
    //   36: invokevirtual Za : (Lburp/Ze3n;Lburp/Zxs7;)Lburp/Zszi;
    //   39: astore #5
    //   41: aload_0
    //   42: aload #5
    //   44: aload_3
    //   45: aload_2
    //   46: aload_1
    //   47: <illegal opcode> ZC : (Lburp/Zzld;Lburp/Zmhe;Lburp/Zm7h;Lburp/Ze3n;Lburp/Zxs7;)Lburp/Zbl3;
    //   52: astore #6
    //   54: aload_0
    //   55: getfield Zm : Lburp/Zlk2;
    //   58: aload #5
    //   60: aload_1
    //   61: aload #6
    //   63: invokevirtual ZX : (Lburp/Zmhe;Lburp/Zxs7;Lburp/Zbl3;)V
    //   66: return
  }
  
  private void lambda$buildConfirmDirectDomReflectionsPhase$0(Zmhe paramZmhe, Zm7h paramZm7h, Ze3n paramZe3n, Zxs7 paramZxs7, Zsjk paramZsjk, byte paramByte, Zku6 paramZku6) {
    Zxs7 zxs7 = paramZmhe.Zx();
    paramZm7h.ZG(paramByte, Ztbx.ZL(this.Zp, paramZe3n, paramZku6, paramZsjk, paramZxs7, zxs7));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzld.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */