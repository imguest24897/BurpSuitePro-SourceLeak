package burp;

import java.awt.Component;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import net.portswigger.Zm2;

public class Zl_l implements Zsyw {
  private static final Ze9n Zr = Ze3m.ZC(Zeuf.SPINNER, Zlkk.FOREGROUND).Z_();
  
  private final IntConsumer Zb;
  
  private final Consumer<Zrw9> ZF;
  
  private final BiFunction<Integer, Boolean, Boolean> ZT;
  
  private final Zze0 ZZ;
  
  private final Zze0 ZJ;
  
  private final Zze0 ZD;
  
  private final Zze0 ZQ;
  
  public Zl_l(IntConsumer paramIntConsumer, Consumer<Zrw9> paramConsumer, BiFunction<Integer, Boolean, Boolean> paramBiFunction, Zze0 paramZze01, Zze0 paramZze02, Zze0 paramZze03, Zze0 paramZze04) {
    this.Zb = paramIntConsumer;
    this.ZF = paramConsumer;
    this.ZT = paramBiFunction;
    this.ZZ = paramZze01;
    this.ZJ = paramZze02;
    this.ZD = paramZze03;
    int i = Zsc_.ZW();
    this.ZQ = paramZze04;
    if (i == 0)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public Component ZN(Zbcp paramZbcp, Ze2_ paramZe2_, int paramInt) {
    Zbc1 zbc1 = paramZbcp.Za(paramInt);
    if (paramZe2_ instanceof Zrw9) {
      Zrw9 zrw9 = (Zrw9)paramZe2_;
      if (zrw9.ZQ().get())
        return new Zm99(new Zkaz(Zr)); 
      Object object = paramZe2_.Zk();
      if (object instanceof Zmkf) {
        Zmkf zmkf = (Zmkf)object;
        if (zmkf.Ziu() != null && !zmkf.Ziu().isEmpty())
          return ZC(paramZbcp, zbc1, zrw9); 
        if (zmkf.Zir() != null && !zmkf.Zir().isEmpty())
          return ZR(paramZbcp, zbc1, zrw9); 
      } 
    } 
    return new Zm99();
  }
  
  private Component ZR(Zbcp paramZbcp, Zbc3 paramZbc3, Zrw9 paramZrw9) {
    // Byte code:
    //   0: new burp/Zbvu
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: <illegal opcode> run : (Lburp/Zl_l;Lburp/Zbcp;Lburp/Zbc3;)Ljava/lang/Runnable;
    //   12: aload_0
    //   13: aload_3
    //   14: <illegal opcode> run : (Lburp/Zl_l;Lburp/Zrw9;)Ljava/lang/Runnable;
    //   19: invokespecial <init> : (Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    //   22: astore #4
    //   24: aload #4
    //   26: aload_0
    //   27: aload_1
    //   28: aload_2
    //   29: aload #4
    //   31: <illegal opcode> accept : (Lburp/Zl_l;Lburp/Zbcp;Lburp/Zbc3;Lburp/Zbvu;)Ljava/util/function/Consumer;
    //   36: invokevirtual Zm : (Ljava/util/function/Consumer;)V
    //   39: aload #4
    //   41: aload_3
    //   42: invokevirtual ZS : ()Lburp/Zraj;
    //   45: invokeinterface ZCy : ()Lburp/Zmkf;
    //   50: invokeinterface Zir : ()Ljava/lang/String;
    //   55: invokevirtual Zj : (Ljava/lang/String;)V
    //   58: aload #4
    //   60: areturn
  }
  
  private Component ZC(Zbcp paramZbcp, Zbc3 paramZbc3, Zrw9 paramZrw9) {
    // Byte code:
    //   0: new burp/Zbv3
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: <illegal opcode> run : (Lburp/Zl_l;Lburp/Zbcp;Lburp/Zbc3;)Ljava/lang/Runnable;
    //   12: aload_0
    //   13: aload_3
    //   14: <illegal opcode> run : (Lburp/Zl_l;Lburp/Zrw9;)Ljava/lang/Runnable;
    //   19: invokespecial <init> : (Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    //   22: astore #4
    //   24: aload #4
    //   26: aload_3
    //   27: invokevirtual ZS : ()Lburp/Zraj;
    //   30: invokeinterface ZCy : ()Lburp/Zmkf;
    //   35: invokeinterface Ziu : ()Ljava/lang/String;
    //   40: invokevirtual ZA : (Ljava/lang/String;)V
    //   43: aload #4
    //   45: areturn
  }
  
  private void lambda$createError$4(Zrw9 paramZrw9) {
    Zm2.Zo(this.ZD);
    this.ZF.accept(paramZrw9);
  }
  
  private void lambda$createError$3(Zbcp paramZbcp, Zbc3 paramZbc3) {
    Zm2.Zo(this.ZQ);
    this.Zb.accept(paramZbcp.Zk(paramZbc3));
  }
  
  private void lambda$createExplanation$2(Zbcp paramZbcp, Zbc3 paramZbc3, Zbvu paramZbvu, Boolean paramBoolean) {
    if (((Boolean)this.ZT.apply(Integer.valueOf(paramZbcp.Zk(paramZbc3)), paramBoolean)).booleanValue())
      paramZbvu.Zv(false); 
  }
  
  private void lambda$createExplanation$1(Zrw9 paramZrw9) {
    Zm2.Zo(this.ZZ);
    this.ZF.accept(paramZrw9);
  }
  
  private void lambda$createExplanation$0(Zbcp paramZbcp, Zbc3 paramZbc3) {
    Zm2.Zo(this.ZJ);
    this.Zb.accept(paramZbcp.Zk(paramZbc3));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */