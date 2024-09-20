package burp;

import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class Zto2 extends Ztos<Zt11> {
  private final Zgu7 Zx;
  
  public Zto2(Zgu7 paramZgu7) {
    super(Zt11.Zq());
    this.Zx = paramZgu7;
  }
  
  public <T> void ZD(Zxr8<T> paramZxr8) throws Zz_h {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zq : ()Lburp/Zlnb;
    //   8: astore_3
    //   9: aload_3
    //   10: getstatic burp/Zt11.Zm : Lburp/Zlnb;
    //   13: if_acmpne -> 34
    //   16: aload_0
    //   17: getfield Zx : Lburp/Zgu7;
    //   20: invokevirtual ZZ : ()V
    //   23: aload_2
    //   24: ifnull -> 78
    //   27: goto -> 34
    //   30: invokestatic b : (Lburp/Zz_h;)Lburp/Zz_h;
    //   33: athrow
    //   34: aload_3
    //   35: getstatic burp/Zt11.ZW : Lburp/Zlnb;
    //   38: if_acmpne -> 66
    //   41: goto -> 48
    //   44: invokestatic b : (Lburp/Zz_h;)Lburp/Zz_h;
    //   47: athrow
    //   48: aload_0
    //   49: getfield Zx : Lburp/Zgu7;
    //   52: invokevirtual Ze : ()V
    //   55: aload_2
    //   56: ifnull -> 78
    //   59: goto -> 66
    //   62: invokestatic b : (Lburp/Zz_h;)Lburp/Zz_h;
    //   65: athrow
    //   66: aload_0
    //   67: aload_1
    //   68: invokespecial ZD : (Lburp/Zxr8;)V
    //   71: goto -> 78
    //   74: invokestatic b : (Lburp/Zz_h;)Lburp/Zz_h;
    //   77: athrow
    //   78: return
    // Exception table:
    //   from	to	target	type
    //   9	27	30	burp/Zz_h
    //   16	41	44	burp/Zz_h
    //   34	59	62	burp/Zz_h
    //   48	71	74	burp/Zz_h
  }
  
  public <T> Zgrn Zo(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Executor paramExecutor, Zrij paramZrij) throws Zz_h {
    try {
      if (paramZlnb == Zt11.Zm)
        return this.Zx.ZI((Consumer)paramConsumer, paramZrij); 
    } catch (Zz_h zz_h) {
      throw b(null);
    } 
    try {
      if (paramZlnb == Zt11.ZW)
        return this.Zx.ZL((Consumer)paramConsumer, paramZrij); 
    } catch (Zz_h zz_h) {
      throw b(null);
    } 
    return super.Zo(paramZlnb, paramConsumer, paramExecutor, paramZrij);
  }
  
  private static Zz_h b(Zz_h paramZz_h) {
    return paramZz_h;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zto2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */