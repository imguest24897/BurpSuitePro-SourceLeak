package burp;

import javax.net.ssl.SSLSession;

class Zlbn extends Zlbx {
  private final Zlig ZN;
  
  private Zlbn(Zskh paramZskh, Zlit paramZlit, Zlig paramZlig) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_1
    //   3: aload_2
    //   4: <illegal opcode> Zv : (Lburp/Zskh;Lburp/Zlit;)Lburp/Zmdh;
    //   9: invokespecial <init> : (Lburp/Zskh;Lburp/Zmdh;)V
    //   12: aload_0
    //   13: aload_3
    //   14: putfield ZN : Lburp/Zlig;
    //   17: return
  }
  
  public Zmu_ ZE() {
    return new Ztd0();
  }
  
  public void ZM(SSLSession paramSSLSession) {
    super.ZM(paramSSLSession);
    this.ZN.Zf(paramSSLSession);
  }
  
  private static void lambda$new$0(Zskh paramZskh, Zlit paramZlit) {
    Zmgc.CANNOT_HANDLE_STREAMING_RESPONSE.ZV(paramZskh.Zz(), new Object[] { paramZlit });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */