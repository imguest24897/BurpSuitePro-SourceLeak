package burp;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface Zefx extends Zsmh, Zx8c {
  Zmzk ZT();
  
  byte[] ZD();
  
  byte[] Zw();
  
  void Zi(Zg5o paramZg5o);
  
  Zefx ZM(Zmzk paramZmzk);
  
  Zefx Zb();
  
  Zlit ZF();
  
  List<String> ZG();
  
  boolean Zp(String paramString, boolean paramBoolean);
  
  String Zx(String paramString, boolean paramBoolean);
  
  List<Zlou> Zc();
  
  String Zr();
  
  String Z_();
  
  Zsba Zv();
  
  boolean ZC();
  
  int ZR();
  
  default List<Zlou> ZZ(Predicate<Zlou> paramPredicate) {
    return (List<Zlou>)Zc().stream().filter(paramPredicate).collect(Collectors.toList());
  }
  
  default boolean Z_(Predicate<Zlou> paramPredicate) {
    return Zc().stream().anyMatch(paramPredicate);
  }
  
  default boolean Zh(String paramString) {
    return Zp(paramString, false);
  }
  
  Zefx Zo();
  
  Zefx Zp();
  
  Zefx Zt();
  
  default Zefx ZQ(String paramString1, String paramString2) {
    return Zm(paramString1, paramString2, false);
  }
  
  Zefx Zm(String paramString1, String paramString2, boolean paramBoolean);
  
  default Zefx Zj(String paramString1, String paramString2) {
    return Zp(paramString1, paramString2, false);
  }
  
  Zefx Zp(String paramString1, String paramString2, boolean paramBoolean);
  
  Zefx ZY(String paramString);
  
  Zefx ZH(Zlou paramZlou);
  
  Zefx ZK(String paramString1, Zrdu paramZrdu, String paramString2);
  
  Zefx ZA(String paramString1, String paramString2);
  
  Zefx ZO(Zlou paramZlou);
  
  Zefx Zr(String paramString);
  
  Zefx Zo(String paramString);
  
  Zefx ZU(String paramString);
  
  Zefx Zc(String paramString);
  
  Zefx ZZ(byte[] paramArrayOfbyte);
  
  Zefx ZN(Zrec paramZrec);
  
  default Zefx ZS(Zmzk paramZmzk, Zey9 paramZey9) {
    return Objects.equals(paramZmzk, ZT()) ? this : paramZey9.Zy(ZM(paramZmzk));
  }
  
  default Zefx ZX(String paramString, Zrdu paramZrdu) {
    return ZO(Zlou.Z_(paramZrdu, paramString, null));
  }
  
  default Zefx Zx(String paramString1, String paramString2) {
    return Zh(paramString1) ? Zj(paramString1, paramString2) : ZQ(paramString1, paramString2);
  }
  
  default Zefx ZV(String paramString1, Zrdu paramZrdu, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: <illegal opcode> test : (Ljava/lang/String;Lburp/Zrdu;)Ljava/util/function/Predicate;
    //   8: invokeinterface Z_ : (Ljava/util/function/Predicate;)Z
    //   13: ifeq -> 26
    //   16: aload_0
    //   17: aload_1
    //   18: aload_2
    //   19: aload_3
    //   20: invokeinterface ZK : (Ljava/lang/String;Lburp/Zrdu;Ljava/lang/String;)Lburp/Zefx;
    //   25: areturn
    //   26: aload_0
    //   27: aload_2
    //   28: aload_1
    //   29: aload_3
    //   30: invokestatic Z_ : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;)Lburp/Zlou;
    //   33: invokeinterface ZH : (Lburp/Zlou;)Lburp/Zefx;
    //   38: areturn
  }
  
  private static boolean lambda$addOrUpdateParameter$0(String paramString, Zrdu paramZrdu, Zlou paramZlou) {
    return (paramZlou.ZA.equals(paramString) && paramZlou.Zx == paramZrdu);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zefx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */