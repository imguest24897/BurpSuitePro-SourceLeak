package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

class Zrw8 implements Zkkf {
  private final Zefg<Zmx> ZW;
  
  private final Map<Integer, Zmx> ZH;
  
  private final Consumer<Integer> Zw;
  
  private final Zmpi Zk;
  
  private final Object Ze;
  
  Zrw8(Zefg<Zmx> paramZefg, Consumer<Integer> paramConsumer, Zmpi paramZmpi) {
    this.ZW = paramZefg;
    this.Zw = paramConsumer;
    this.Zk = paramZmpi;
    this.ZH = new HashMap<>();
    this.Ze = new Object();
  }
  
  public int ZX(int paramInt) {
    synchronized (this.Ze) {
      return ((Integer)ZM(paramInt).<Integer>map(Zmx::ZT).orElse(Integer.valueOf(1))).intValue();
    } 
  }
  
  void Zh(int paramInt, String paramString) {
    synchronized (this.Ze) {
      ((Zmx)this.ZW.get(paramInt)).Zt(paramString);
    } 
  }
  
  void ZS(int paramInt1, int paramInt2) {
    Zmx zmx = this.ZW.remove(paramInt1);
    this.ZW.add(paramInt2, zmx);
  }
  
  void ZO(int paramInt) {
    synchronized (this.Ze) {
      Zmx zmx = this.ZW.remove(paramInt);
      int i = (int)zmx.Zp().stream().filter(Zzem::Zi).count();
      this.Zk.ZX(i);
      int j = zmx.Z_();
      this.ZH.remove(Integer.valueOf(j));
      this.Zw.accept(Integer.valueOf(j));
    } 
  }
  
  private Optional<Zmx> ZM(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZH : Ljava/util/Map;
    //   4: iload_1
    //   5: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8: aload_0
    //   9: iload_1
    //   10: <illegal opcode> apply : (Lburp/Zrw8;I)Ljava/util/function/Function;
    //   15: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   20: checkcast burp/Zmx
    //   23: astore_2
    //   24: aload_2
    //   25: ifnull -> 32
    //   28: iconst_1
    //   29: goto -> 33
    //   32: iconst_0
    //   33: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   36: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   39: aload_2
    //   40: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   43: areturn
  }
  
  private Zmx lambda$tabDataForId$1(int paramInt, Integer paramInteger) {
    return this.ZW.stream().filter(paramInt::lambda$tabDataForId$0).findFirst().orElse(null);
  }
  
  private static boolean lambda$tabDataForId$0(int paramInt, Zmx paramZmx) {
    return (paramZmx.Z_() == paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrw8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */