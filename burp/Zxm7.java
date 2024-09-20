package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxm7 extends Zxsr implements Zkv9 {
  Zxm7(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public void ZF(Zsxt paramZsxt) {
    int[] arrayOfInt = Zsxt.Zo();
    Zuh.Zb((paramZsxt.ZU.intValue() == ZR()), Zqf.Zr);
    Zzwo<Zsdr, Zmg> zzwo = Zd();
    Zmg zmg = zzwo.Zd(Zq(paramZsxt.Zg));
    if (zmg == null) {
      zmg = this.Za.<Zmg>ZH(new Zkbp(5));
      zzwo.Zu(this.Za.Zz(paramZsxt.Zg), zmg);
    } 
    for (Integer integer : zmg) {
      if (paramZsxt.ZD(Zx6h.ZF(integer.intValue())))
        return; 
      if (arrayOfInt != null) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    zmg.add(paramZsxt.ZL);
  }
  
  public Iterable<Zsxt> ZU(Zro0 paramZro0) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zd : ()Lburp/Zzwo;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_0
    //   7: aload_1
    //   8: invokeinterface toString : ()Ljava/lang/String;
    //   13: invokevirtual Zq : (Ljava/lang/String;)Lburp/Zsdr;
    //   16: invokeinterface Zd : (Ljava/lang/Object;)Lburp/Zgpi;
    //   21: checkcast burp/Zmg
    //   24: astore_3
    //   25: aload_3
    //   26: ifnonnull -> 33
    //   29: invokestatic emptySet : ()Ljava/util/Set;
    //   32: areturn
    //   33: aload_0
    //   34: invokevirtual ZR : ()I
    //   37: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   40: astore #4
    //   42: aload_3
    //   43: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   48: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   53: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   58: aload #4
    //   60: aload_1
    //   61: <illegal opcode> apply : (Ljava/lang/Integer;Lburp/Zro0;)Ljava/util/function/Function;
    //   66: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   71: invokestatic toList : ()Ljava/util/stream/Collector;
    //   74: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   79: checkcast java/lang/Iterable
    //   82: areturn
  }
  
  public synchronized int Zp(Zro0 paramZro0) {
    return (Zd() != null && Zd().ZB(Zq(paramZro0.toString()))) ? ((Zmg)Zd().Zd(Zq(paramZro0.toString()))).size() : 0;
  }
  
  private Zsdr Zq(String paramString) {
    return new Zw_(paramString);
  }
  
  private Zzwo<Zsdr, Zmg> Zd() {
    return this.Za.<Zzwo<Zsdr, Zmg>>ZJ(this, Zks3.ZL);
  }
  
  public void ZZ(Zro0 paramZro0, int paramInt) {
    int[] arrayOfInt = Zsxt.Zo();
    Zzwo<Zsdr, Zmg> zzwo = Zd();
    if (zzwo == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    Zuh.Zb(!Zx6h.ZR(paramInt), Zqf.Zk);
    Zmg zmg = zzwo.Zd(Zq(paramZro0.toString()));
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
    //   1: invokevirtual Zd : ()Lburp/Zzwo;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_0
    //   7: aload_1
    //   8: invokeinterface toString : ()Ljava/lang/String;
    //   13: invokevirtual Zq : (Ljava/lang/String;)Lburp/Zsdr;
    //   16: invokeinterface Zd : (Ljava/lang/Object;)Lburp/Zgpi;
    //   21: checkcast burp/Zmg
    //   24: astore_3
    //   25: aload_3
    //   26: ifnonnull -> 33
    //   29: invokestatic emptySet : ()Ljava/util/Set;
    //   32: areturn
    //   33: aload_0
    //   34: invokevirtual ZR : ()I
    //   37: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   40: astore #4
    //   42: aload_3
    //   43: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   48: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   53: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   58: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   63: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   68: aload #4
    //   70: aload_1
    //   71: <illegal opcode> apply : (Ljava/lang/Integer;Lburp/Zro0;)Ljava/util/function/Function;
    //   76: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   81: invokestatic toList : ()Ljava/util/stream/Collector;
    //   84: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   89: checkcast java/lang/Iterable
    //   92: areturn
  }
  
  private int ZR() {
    return this.Za.Zx(this, Zks3.Za);
  }
  
  public Zeu4<? extends Zkv9> ZF() {
    return Zkv9.ZZ;
  }
  
  private static Zsxt lambda$getStoredDataPathsThatReflectIntoJsContextsForInsertionPoint$1(Integer paramInteger1, Zro0 paramZro0, Integer paramInteger2) {
    return new Zsxt(paramInteger1, paramZro0.toString(), paramInteger2);
  }
  
  private static Zsxt lambda$getStoredDataPathsForInsertionPoint$0(Integer paramInteger1, Zro0 paramZro0, Integer paramInteger2) {
    return new Zsxt(paramInteger1, paramZro0.toString(), paramInteger2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxm7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */