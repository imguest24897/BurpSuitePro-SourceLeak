package burp;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zg6v {
  private final Zr_4 Za;
  
  public Zg6v(Zr_4 paramZr_4) {
    this.Za = paramZr_4;
  }
  
  public Zrdb Zd(List<Zrdb> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface iterator : ()Ljava/util/Iterator;
    //   6: astore_3
    //   7: aload_3
    //   8: invokeinterface next : ()Ljava/lang/Object;
    //   13: checkcast burp/Zrdb
    //   16: astore #4
    //   18: invokestatic Zu : ()Z
    //   21: aload #4
    //   23: invokeinterface Za7 : ()Lburp/Ztub;
    //   28: invokevirtual Zy : ()Ljava/util/List;
    //   31: iconst_0
    //   32: invokeinterface get : (I)Ljava/lang/Object;
    //   37: checkcast burp/Zzi8
    //   40: astore #5
    //   42: aload_3
    //   43: aload_0
    //   44: aload #5
    //   46: aload #4
    //   48: <illegal opcode> accept : (Lburp/Zg6v;Lburp/Zzi8;Lburp/Zrdb;)Ljava/util/function/Consumer;
    //   53: invokeinterface forEachRemaining : (Ljava/util/function/Consumer;)V
    //   58: aload #4
    //   60: invokeinterface ZaT : ()Lburp/Ztlj;
    //   65: aload_0
    //   66: getfield Za : Lburp/Zr_4;
    //   69: getstatic burp/Zlt9.RECONSTRUCT_SINGLE : Lburp/Zlt9;
    //   72: invokevirtual Zi : (Lburp/Zr_4;Lburp/Zlt9;)V
    //   75: istore_2
    //   76: aload #4
    //   78: iload_2
    //   79: ifne -> 89
    //   82: iconst_5
    //   83: anewarray burp/Zbqc
    //   86: invokestatic Zr : ([Lburp/Zbqc;)V
    //   89: areturn
  }
  
  private void Zz(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    boolean bool = Zsz4.Zu();
    Zuh.Zb(!paramZrdb1.ZF(paramZrdb2), Zqf.Zr);
    if (paramZrdb2.Za7().Zs() && paramZrdb1.Za7().Zs())
      for (Zsdr zsdr : paramZrdb2.Za7().Zt().ZCr()) {
        Zefg<Zsdr> zefg = paramZrdb1.Za7().Zt().ZCr();
        if (!zefg.contains(zsdr))
          zefg.add(zsdr); 
        if (!bool)
          break; 
      }  
  }
  
  private void lambda$merge$4(Zzi8 paramZzi8, Zrdb paramZrdb1, Zrdb paramZrdb2) {
    Zuh.Zb((paramZrdb2.Za7().Zy().size() == 1), Zqf.Zr);
    Objects.requireNonNull(paramZzi8.ZaC());
    paramZrdb2.Za7().Zy().stream().flatMap(Zg6v::lambda$merge$0).filter(paramZzi8::lambda$merge$1).forEach(paramZzi8.ZaC()::add);
    Objects.requireNonNull(paramZzi8.Zae());
    paramZrdb2.Za7().Zy().stream().flatMap(Zg6v::lambda$merge$2).filter(paramZzi8::lambda$merge$3).forEach(paramZzi8.Zae()::add);
    Zz(paramZrdb1, paramZrdb2);
    paramZrdb1.Zf(paramZrdb2.Zaw(), paramZrdb2.Zak());
  }
  
  private static boolean lambda$merge$3(Zzi8 paramZzi8, Zrrc paramZrrc) {
    return !paramZzi8.Zae().contains(paramZrrc);
  }
  
  private static Stream lambda$merge$2(Zzi8 paramZzi8) {
    return paramZzi8.Zae().stream();
  }
  
  private static boolean lambda$merge$1(Zzi8 paramZzi8, Zrrc paramZrrc) {
    return !paramZzi8.ZaC().contains(paramZrrc);
  }
  
  private static Stream lambda$merge$0(Zzi8 paramZzi8) {
    return paramZzi8.ZaC().stream();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg6v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */