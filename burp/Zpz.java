package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zpz extends Zni implements Zkv9 {
  @Zzvo(0)
  private final int Zr;
  
  @Zzvo(1)
  private final Zzwo<Zsdr, Zmg> Zp = (new Zlmv<>(Zsdr.Zo, new Zlqd())).ZW(null);
  
  public Zpz(int paramInt) {
    this.Zr = paramInt;
  }
  
  public synchronized void ZF(Zsxt paramZsxt) {
    int[] arrayOfInt = Zsxt.Zo();
    Zuh.Zb((paramZsxt.ZU.intValue() == this.Zr), Zqf.Zr);
    Zmg zmg = this.Zp.Zd(Zj(paramZsxt.Zg));
    if (zmg == null) {
      zmg = (new Zkbp(5)).ZH(null);
      this.Zp.Zu(Zj(paramZsxt.Zg), zmg);
    } 
    for (Integer integer : zmg) {
      if (paramZsxt.ZD(Zx6h.ZF(integer.intValue())))
        return; 
      if (arrayOfInt != null)
        break; 
    } 
    zmg.add(paramZsxt.ZL);
    if (Zbqc.Zwu() == null)
      Zsxt.Zp(new int[3]); 
  }
  
  public Iterable<Zsxt> ZU(Zro0 paramZro0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Lburp/Zzwo;
    //   4: aload_0
    //   5: aload_1
    //   6: invokeinterface toString : ()Ljava/lang/String;
    //   11: invokevirtual Zj : (Ljava/lang/String;)Lburp/Zsdr;
    //   14: invokeinterface Zd : (Ljava/lang/Object;)Lburp/Zgpi;
    //   19: checkcast burp/Zmg
    //   22: astore_2
    //   23: aload_2
    //   24: ifnonnull -> 31
    //   27: invokestatic emptySet : ()Ljava/util/Set;
    //   30: areturn
    //   31: aload_2
    //   32: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   37: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   42: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   47: aload_0
    //   48: aload_1
    //   49: <illegal opcode> apply : (Lburp/Zpz;Lburp/Zro0;)Ljava/util/function/Function;
    //   54: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   59: invokestatic toList : ()Ljava/util/stream/Collector;
    //   62: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   67: checkcast java/lang/Iterable
    //   70: areturn
  }
  
  public synchronized int Zp(Zro0 paramZro0) {
    return (this.Zp != null && this.Zp.ZB(Zj(paramZro0.toString()))) ? ((Zmg)this.Zp.Zd(Zj(paramZro0.toString()))).size() : 0;
  }
  
  public void ZZ(Zro0 paramZro0, int paramInt) {
    int[] arrayOfInt = Zsxt.Zo();
    if (this.Zp == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    Zuh.Zb(!Zx6h.ZR(paramInt), Zqf.Zk);
    Zmg zmg = this.Zp.Zd(Zj(paramZro0.toString()));
    if (zmg == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    byte b = 0;
    while (b < zmg.size()) {
      int i = Zx6h.ZF(zmg.get(b).intValue());
      if (i == paramInt) {
        zmg.set(b, Integer.valueOf(Zx6h.Ze(i)));
        return;
      } 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
  
  public Iterable<Zsxt> Zz(Zro0 paramZro0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Lburp/Zzwo;
    //   4: aload_0
    //   5: aload_1
    //   6: invokeinterface toString : ()Ljava/lang/String;
    //   11: invokevirtual Zj : (Ljava/lang/String;)Lburp/Zsdr;
    //   14: invokeinterface Zd : (Ljava/lang/Object;)Lburp/Zgpi;
    //   19: checkcast burp/Zmg
    //   22: astore_2
    //   23: aload_2
    //   24: ifnonnull -> 31
    //   27: invokestatic emptySet : ()Ljava/util/Set;
    //   30: areturn
    //   31: aload_2
    //   32: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   37: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   42: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   47: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   52: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   57: aload_0
    //   58: aload_1
    //   59: <illegal opcode> apply : (Lburp/Zpz;Lburp/Zro0;)Ljava/util/function/Function;
    //   64: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   69: invokestatic toList : ()Ljava/util/stream/Collector;
    //   72: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   77: checkcast java/lang/Iterable
    //   80: areturn
  }
  
  public Zeu4<? extends Zkv9> ZF() {
    return Zkv9.ZZ;
  }
  
  private Zsdr Zj(String paramString) {
    return new Zw_(paramString);
  }
  
  private Zsxt lambda$getStoredDataPathsThatReflectIntoJsContextsForInsertionPoint$1(Zro0 paramZro0, Integer paramInteger) {
    return new Zsxt(Integer.valueOf(this.Zr), paramZro0.toString(), paramInteger);
  }
  
  private Zsxt lambda$getStoredDataPathsForInsertionPoint$0(Zro0 paramZro0, Integer paramInteger) {
    return new Zsxt(Integer.valueOf(this.Zr), paramZro0.toString(), paramInteger);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */