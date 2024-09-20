package net.portswigger;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Zcq {
  private final Ztb Zf;
  
  public Zcq(Ztb paramZtb) {
    this.Zf = paramZtb;
  }
  
  public Zrmf ZO(Zrmf paramZrmf) {
    // Byte code:
    //   0: new net/portswigger/Zqa
    //   3: dup
    //   4: aload_1
    //   5: invokespecial <init> : (Lnet/portswigger/Zrmf;)V
    //   8: astore_2
    //   9: new net/portswigger/Zf3
    //   12: dup
    //   13: aload_0
    //   14: getfield Zf : Lnet/portswigger/Ztb;
    //   17: invokevirtual ZY : ()Ljava/lang/String;
    //   20: invokespecial <init> : (Ljava/lang/String;)V
    //   23: invokevirtual ZU : ()Ljava/util/Map;
    //   26: astore_3
    //   27: aload_3
    //   28: aload_0
    //   29: aload_2
    //   30: <illegal opcode> accept : (Lnet/portswigger/Zcq;Lnet/portswigger/Zqa;)Ljava/util/function/BiConsumer;
    //   35: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   40: goto -> 51
    //   43: astore_3
    //   44: aload_3
    //   45: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   48: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   51: aload_2
    //   52: invokevirtual ZG : ()Lnet/portswigger/Zrmf;
    //   55: areturn
    // Exception table:
    //   from	to	target	type
    //   9	40	43	java/lang/Exception
  }
  
  private void lambda$from$4(Zqa paramZqa, Zba paramZba, List paramList) {
    // Byte code:
    //   0: aload_3
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lnet/portswigger/Zcq;Lnet/portswigger/Zqa;)Ljava/util/function/Consumer;
    //   8: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   13: return
  }
  
  private void lambda$from$3(Zqa paramZqa, Zgo paramZgo) {
    String[] arrayOfString = Zki.Zl();
    try {
      if (paramZgo.Za()) {
        try {
          Objects.requireNonNull(paramZqa);
          this.Zf.Zc().stream().filter(paramZgo::lambda$from$0).findFirst().flatMap(Zcq::lambda$from$2).ifPresent(paramZqa::ZN);
          if (arrayOfString == null) {
            paramZqa.ZN(new Zrm7(paramZgo.ZL()));
            return;
          } 
        } catch (Zki zki) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zki zki) {
      throw a(null);
    } 
    paramZqa.ZN(new Zrm7(paramZgo.ZL()));
  }
  
  private static Optional lambda$from$2(Zi5 paramZi5) {
    return Zeu.ZA(paramZi5).map(paramZi5::lambda$from$1);
  }
  
  private static Zu9 lambda$from$1(Zi5 paramZi5, Zms paramZms) {
    return new Zu9(paramZi5.ZX(), paramZi5.ZC(), paramZms);
  }
  
  private static boolean lambda$from$0(Zgo paramZgo, Zi5 paramZi5) {
    return paramZi5.ZX().equals(paramZgo.ZL());
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zcq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */