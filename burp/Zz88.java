package burp;

public class Zz88 {
  private final Zkf3 ZA;
  
  private final boolean ZY;
  
  public Zz88(Zkf3 paramZkf3) {
    this.ZA = paramZkf3;
    this.ZY = paramZkf3.ZK();
  }
  
  public void Zg(Zlli<Zt13> paramZlli, Zlli<Zt35> paramZlli1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Z
    //   4: ifeq -> 78
    //   7: aload_2
    //   8: getstatic burp/Zt35.ZW : Lburp/Zlnb;
    //   11: aload_0
    //   12: <illegal opcode> accept : (Lburp/Zz88;)Ljava/util/function/Consumer;
    //   17: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   22: astore_3
    //   23: aload_2
    //   24: getstatic burp/Zt35.Zr : Lburp/Zlnb;
    //   27: aload_0
    //   28: <illegal opcode> accept : (Lburp/Zz88;)Ljava/util/function/Consumer;
    //   33: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   38: astore #4
    //   40: aload_2
    //   41: getstatic burp/Zt35.Ze : Lburp/Zlnb;
    //   44: aload_0
    //   45: <illegal opcode> accept : (Lburp/Zz88;)Ljava/util/function/Consumer;
    //   50: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   55: astore #5
    //   57: invokestatic Zr : ()Lburp/Zts2;
    //   60: aload_1
    //   61: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   64: aload_3
    //   65: aload #4
    //   67: aload #5
    //   69: <illegal opcode> accept : (Lburp/Zgrn;Lburp/Zgrn;Lburp/Zgrn;)Ljava/util/function/Consumer;
    //   74: invokevirtual Zz : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   77: pop
    //   78: return
  }
  
  private void ZG(Ztas paramZtas) {
    this.ZA.ZV(paramZtas);
  }
  
  private void ZT(Zbw4 paramZbw4) {
    this.ZA.ZT(paramZbw4);
  }
  
  private void Zu(Zeu9 paramZeu9) {
    this.ZA.ZE(paramZeu9);
  }
  
  private static void lambda$subscribeTo$3(Zgrn paramZgrn1, Zgrn paramZgrn2, Zgrn paramZgrn3, Zxr8 paramZxr8) {
    paramZgrn1.ZZ();
    paramZgrn2.ZZ();
    paramZgrn3.ZZ();
  }
  
  private void lambda$subscribeTo$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zu);
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZT);
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZG);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz88.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */