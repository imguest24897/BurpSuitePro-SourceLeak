package burp;

import java.util.Optional;

public class Zsn8 {
  private final Ze47 ZL;
  
  public Zsn8(Ze47 paramZe47) {
    this.ZL = paramZe47;
  }
  
  public Zgsq Zn(Zefx paramZefx) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic Zk : (Lburp/Zefx;)Ljava/util/Optional;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> get : (Lburp/Zsn8;Lburp/Zefx;)Ljava/util/function/Supplier;
    //   11: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   14: checkcast burp/Zkyt
    //   17: invokestatic ZW : (Lburp/Zkyt;)Lburp/Zgsq;
    //   20: areturn
  }
  
  public Zgsq ZA(Zbr paramZbr, Zstu paramZstu) {
    return Zxd9.ZT(paramZbr).or(paramZstu::lambda$determineRequestProtocol$1).map(Zgsq::ZW).orElse(Zgsq.AUTO);
  }
  
  public Zgsq ZX(Zgsq paramZgsq, Zbr paramZbr, Zmzk paramZmzk) {
    return (paramZgsq == null) ? Zk(paramZbr, paramZmzk) : paramZgsq;
  }
  
  private Zgsq Zk(Zbr paramZbr, Zmzk paramZmzk) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic ZT : (Lburp/Zbr;)Ljava/util/Optional;
    //   4: aload_0
    //   5: aload_2
    //   6: <illegal opcode> get : (Lburp/Zsn8;Lburp/Zmzk;)Ljava/util/function/Supplier;
    //   11: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   14: checkcast burp/Zkyt
    //   17: invokestatic ZW : (Lburp/Zkyt;)Lburp/Zgsq;
    //   20: areturn
  }
  
  private Zkyt lambda$determineRequestProtocol$2(Zmzk paramZmzk) {
    return this.ZL.Zw(paramZmzk);
  }
  
  private static Optional lambda$determineRequestProtocol$1(Zstu paramZstu) {
    return Ztud.ZJ(paramZstu);
  }
  
  private Zkyt lambda$determineRequestProtocol$0(Zefx paramZefx) {
    return this.ZL.Zw((paramZefx == null) ? null : paramZefx.ZT());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsn8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */