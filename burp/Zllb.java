package burp;

public class Zllb {
  private final Ze__ ZI;
  
  private final Zr69 Zu;
  
  private final Zkl6 Zt;
  
  public Zllb(Ze__ paramZe__, Zr69 paramZr69, Zkl6 paramZkl6) {
    this.ZI = paramZe__;
    this.Zu = paramZr69;
    this.Zt = paramZkl6;
  }
  
  public void Za(Ztos<Zt35> paramZtos) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zt35.ZW : Lburp/Zlnb;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> accept : (Lburp/Zllb;Lburp/Ztos;)Ljava/util/function/Consumer;
    //   11: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   14: pop
    //   15: return
  }
  
  private void Zf(Ztas paramZtas, Zz1m<Zt35> paramZz1m) {
    if (paramZtas.ZU8().ZO() != Zz3o.DISCOVERED_GRAPHQL_OPERATION)
      this.ZI.Zh(paramZtas, this.Zu, this.Zt, paramZz1m); 
  }
  
  private void lambda$subscribeTo$1(Ztos paramZtos, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zllb;Lburp/Ztos;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private void lambda$subscribeTo$0(Ztos<Zt35> paramZtos, Ztas paramZtas) {
    Zf(paramZtas, paramZtos);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zllb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */