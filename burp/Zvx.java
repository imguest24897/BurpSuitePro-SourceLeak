package burp;

import java.util.Comparator;
import java.util.Optional;

class Zvx {
  static Optional<Zszw> Zu(Zzwo<Zr8, Zszw> paramZzwo, Zrp0 paramZrp0, Zlru paramZlru) {
    return Optional.ofNullable(paramZzwo.Zd(new Zfe(paramZrp0, paramZlru)));
  }
  
  static Zszw Z_(Zzwo<Zr8, Zszw> paramZzwo, Zrp0 paramZrp0, Zlru paramZlru, Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokestatic Zu : (Lburp/Zzwo;Lburp/Zrp0;Lburp/Zlru;)Ljava/util/Optional;
    //   6: aload_0
    //   7: aload_3
    //   8: aload_1
    //   9: aload_2
    //   10: <illegal opcode> get : (Lburp/Zzwo;Lburp/Zr_4;Lburp/Zrp0;Lburp/Zlru;)Ljava/util/function/Supplier;
    //   15: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   18: checkcast burp/Zszw
    //   21: areturn
  }
  
  private static Zszw lambda$addStateChangeFor$0(Zzwo<Zr8, Zszw> paramZzwo, Zr_4 paramZr_4, Zrp0 paramZrp0, Zlru paramZlru) {
    int i = ((Integer)paramZzwo.ZlZ().stream().max(Comparator.comparingInt(Zszw::ZD)).map(Zszw::ZD).orElse(Integer.valueOf(1))).intValue();
    Zszw zszw = paramZr_4.<Zszw>ZH(Zszw.ZS(i + 1));
    paramZzwo.Zu(paramZr_4.<Zr8>ZH(new Zs6f(paramZrp0, paramZlru)), zszw);
    return zszw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */