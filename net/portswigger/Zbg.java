package net.portswigger;

import java.util.stream.Stream;

public class Zbg {
  private final Ztb Za;
  
  public Zbg(Ztb paramZtb) {
    this.Za = paramZtb;
  }
  
  public Stream<Zrmf> ZM(Zrmf paramZrmf) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Za : Lnet/portswigger/Ztb;
    //   4: invokevirtual ZM : ()Lnet/portswigger/Zmf;
    //   7: invokevirtual ZO : ()Lnet/portswigger/Znl;
    //   10: invokevirtual ZS : ()Ljava/util/List;
    //   13: astore_2
    //   14: aload_2
    //   15: invokeinterface isEmpty : ()Z
    //   20: ifeq -> 28
    //   23: aload_1
    //   24: invokestatic of : (Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   27: areturn
    //   28: aload_2
    //   29: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   34: aload_0
    //   35: aload_1
    //   36: <illegal opcode> apply : (Lnet/portswigger/Zbg;Lnet/portswigger/Zrmf;)Ljava/util/function/Function;
    //   41: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   46: areturn
    //   47: astore_2
    //   48: aload_2
    //   49: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   52: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   55: aload_1
    //   56: invokestatic of : (Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   59: areturn
    // Exception table:
    //   from	to	target	type
    //   0	27	47	java/lang/Exception
    //   28	46	47	java/lang/Exception
  }
  
  private Stream<Zrmf> ZI(Zrmf paramZrmf, Zid paramZid) {
    Zu1 zu1 = Zu1.ZJ(paramZid.ZZ());
    try {
      try {
        switch (Zvm.ZU[zu1.ordinal()]) {
          case 1:
          case 2:
          
          case 3:
          
          case 4:
          
          case 5:
          
        } 
      } catch (Zki zki) {
        throw a(null);
      } 
      throw new Zki(Ztt.UNSUPPORTED_CONTENT_TYPE.ZU(new Object[] { paramZid.ZZ() }));
    } catch (Zki zki) {
      Zah.Zl(zki, Zk_.COMMON_RUNTIME_FAILURE);
      return Stream.of((new Zqa(paramZrmf)).ZH(paramZid.ZZ()).ZG());
    } 
  }
  
  private Stream lambda$from$0(Zrmf paramZrmf, Zid paramZid) {
    return ZI(paramZrmf, paramZid);
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zbg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */