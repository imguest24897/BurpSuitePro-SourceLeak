package burp;

public class Zs84 {
  private final Zt1i Zn;
  
  public Zs84(Zt1i paramZt1i) {
    this.Zn = paramZt1i;
  }
  
  public void ZG(Ztos<Zt35> paramZtos) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zt35.ZW : Lburp/Zlnb;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> accept : (Lburp/Zs84;Lburp/Ztos;)Ljava/util/function/Consumer;
    //   11: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   14: pop
    //   15: return
  }
  
  private void ZN(Ztas paramZtas, Zz1m<Zt35> paramZz1m) {
    Zeu9 zeu9 = paramZtas.ZUi().Zsu();
    if (zeu9 instanceof Zgd4 && !(zeu9 instanceof Zzr9))
      return; 
    boolean bool = this.Zn.ZF(zeu9);
    if (bool)
      paramZz1m.ZD(new Zxr8(Zt35.Zo, new Zs_l(paramZtas.ZUi()))); 
  }
  
  private void lambda$subscribeTo$1(Ztos paramZtos, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zs84;Lburp/Ztos;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private void lambda$subscribeTo$0(Ztos<Zt35> paramZtos, Ztas paramZtas) {
    ZN(paramZtas, paramZtos);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs84.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */