package net.portswigger;

import java.util.Objects;

public class Zha {
  private Ztb Zv;
  
  public Zha(Ztb paramZtb) {
    this.Zv = paramZtb;
  }
  
  public Zrmf ZW(Zrmf paramZrmf) {
    // Byte code:
    //   0: new net/portswigger/Zqa
    //   3: dup
    //   4: aload_1
    //   5: invokespecial <init> : (Lnet/portswigger/Zrmf;)V
    //   8: astore_2
    //   9: aload_0
    //   10: getfield Zv : Lnet/portswigger/Ztb;
    //   13: invokevirtual Zk : ()Ljava/util/List;
    //   16: aload_0
    //   17: aload_2
    //   18: <illegal opcode> accept : (Lnet/portswigger/Zha;Lnet/portswigger/Zqa;)Ljava/util/function/Consumer;
    //   23: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   28: aload_2
    //   29: invokevirtual ZG : ()Lnet/portswigger/Zrmf;
    //   32: areturn
    //   33: astore_2
    //   34: aload_2
    //   35: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   38: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   41: aload_1
    //   42: areturn
    // Exception table:
    //   from	to	target	type
    //   0	32	33	java/lang/Exception
  }
  
  private Zu5 Zu(Zi5 paramZi5) {
    Zrmj zrmj = new Zrmj(paramZi5.ZX());
    Objects.requireNonNull(zrmj);
    Zeu.ZA(paramZi5).ifPresent(zrmj::Zr);
    return zrmj.Za();
  }
  
  private void lambda$from$0(Zqa paramZqa, Zi5 paramZi5) {
    try {
      paramZqa.Zw(Zu(paramZi5));
    } catch (Zki zki) {
      Zah.Zl(zki, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zha.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */