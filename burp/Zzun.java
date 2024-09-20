package burp;

import java.util.List;
import net.portswigger.Zsy;

public class Zzun {
  private final byte Zy;
  
  private final List<Zlh_> Zv;
  
  public Zzun(Ztbx paramZtbx, String paramString, Zzct paramZzct) {
    Zr27 zr27 = Zle.ZP(paramString, paramZzct);
    this.Zy = Zb(zr27, paramZtbx);
    this.Zv = zr27.ZM();
  }
  
  List<Zx57> ZC(Zsy paramZsy) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> apply : (Lburp/Zzun;Lnet/portswigger/Zsy;)Ljava/util/function/Function;
    //   16: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   21: invokestatic toList : ()Ljava/util/stream/Collector;
    //   24: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   29: checkcast java/util/List
    //   32: areturn
  }
  
  private static byte Zb(Zr27 paramZr27, Ztbx paramZtbx) {
    switch (Zb6c.Zc[paramZr27.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      
    } 
    return paramZtbx.Zn.Z_();
  }
  
  private Zx57 lambda$buildPayloads$0(Zsy paramZsy, Zlh_ paramZlh_) {
    return paramZlh_.Zj(paramZsy, this.Zy);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzun.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */