package burp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Zkrg implements Zsqx<Zbj5> {
  static Zrte<Zefg<Zrho>> ZY(List<Zrho> paramList, Zr_4 paramZr_4) {
    Zrte<Zefg> zrte = paramZr_4.<Zrte>Zv((Zllg)new Zguz<>((Zeu4)new Zl_p<>(Zrho.Zb)), (Zz3o.values()).length);
    Iterator<Zrho> iterator = paramList.iterator();
    int i = Zkmn.Zn();
    while (iterator.hasNext()) {
      Zrho zrho = iterator.next();
      int j = (zrho.ZAA().Zm2()).permanentIndex;
      Zefg<Zrho> zefg = zrte.ZdF(j);
      if (zefg == null) {
        int k = (int)paramList.stream().filter(j::lambda$buildMatchingDetailsByType$2).count();
        zefg = Zkk.Zl(paramZr_4, Zrho.Zb, k);
        zrte.ZU(j, zefg);
      } 
      zefg.add(zrho);
      if (i != 0)
        break; 
    } 
    return (Zrte)zrte;
  }
  
  static Zmyi ZW(Collection<Zrho> paramCollection, Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zmyi.Zp : Lburp/Zllg;
    //   4: invokestatic values : ()[Lburp/Zz3o;
    //   7: arraylength
    //   8: invokeinterface Zv : (Lburp/Zllg;I)Lburp/Ze34;
    //   13: checkcast burp/Zmyi
    //   16: astore_3
    //   17: new java/util/concurrent/atomic/AtomicInteger
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore #4
    //   26: invokestatic values : ()[Lburp/Zz3o;
    //   29: astore #5
    //   31: invokestatic Zp : ()I
    //   34: aload #5
    //   36: arraylength
    //   37: istore #6
    //   39: iconst_0
    //   40: istore #7
    //   42: istore_2
    //   43: iload #7
    //   45: iload #6
    //   47: if_icmpge -> 76
    //   50: aload #5
    //   52: iload #7
    //   54: aaload
    //   55: astore #8
    //   57: aload_3
    //   58: aload #8
    //   60: getfield permanentIndex : I
    //   63: iconst_m1
    //   64: invokeinterface ZX : (II)V
    //   69: iinc #7, 1
    //   72: iload_2
    //   73: ifne -> 43
    //   76: aload_0
    //   77: aload #4
    //   79: aload_3
    //   80: <illegal opcode> accept : (Ljava/util/concurrent/atomic/AtomicInteger;Lburp/Zmyi;)Ljava/util/function/Consumer;
    //   85: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   90: aload_3
    //   91: areturn
  }
  
  private static void lambda$buildSequence$3(AtomicInteger paramAtomicInteger, Zmyi paramZmyi, Zrho paramZrho) {
    int j = (paramZrho.ZAA().Zm2()).permanentIndex;
    byte b = 0;
    int i = Zkmn.Zp();
    while (b < paramAtomicInteger.get()) {
      if (paramZmyi.ZN(b) == j)
        return; 
      b++;
      if (i == 0)
        break; 
    } 
    paramZmyi.ZX(paramAtomicInteger.getAndIncrement(), j);
  }
  
  private static boolean lambda$buildMatchingDetailsByType$2(int paramInt, Zrho paramZrho) {
    return ((paramZrho.ZAA().Zm2()).permanentIndex == paramInt);
  }
  
  private static Zmyi lambda$new$1(List<Zrho> paramList, Zr_4 paramZr_4) {
    return ZW(paramList, paramZr_4);
  }
  
  private static Zrte lambda$new$0(List<Zrho> paramList, Zr_4 paramZr_4) {
    return ZY(paramList, paramZr_4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkrg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */