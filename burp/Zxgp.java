package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zxgp implements Zz09 {
  private final Ze3n ZP;
  
  private final Zz1i ZD;
  
  private final Zl5x ZJ;
  
  private final Zz_q Zd;
  
  private final Zkm8 ZF;
  
  private final Zg56 Zx;
  
  Zxgp(Ze3n paramZe3n, Zz1i paramZz1i, Zl5x paramZl5x, Zz_q paramZz_q, Zkm8 paramZkm8, Zg56 paramZg56) {
    this.ZP = paramZe3n;
    this.ZD = paramZz1i;
    this.ZJ = paramZl5x;
    this.Zd = paramZz_q;
    this.ZF = paramZkm8;
    this.Zx = paramZg56;
  }
  
  public void ZC(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zd : Lburp/Zz_q;
    //   4: invokevirtual ZM : ()Ljava/util/Collection;
    //   7: aload_0
    //   8: aload_2
    //   9: aload_3
    //   10: <illegal opcode> accept : (Lburp/Zxgp;Lburp/Zlsy;Lburp/Ztpx;)Ljava/util/function/Consumer;
    //   15: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   20: return
  }
  
  private void lambda$execute$1(Zlsy paramZlsy, Ztpx paramZtpx, Zeqc paramZeqc) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: aload_3
    //   3: aload_2
    //   4: <illegal opcode> Za : (Lburp/Zxgp;Lburp/Zeqc;Lburp/Ztpx;)Lburp/Zmgr;
    //   9: invokeinterface Ze : (Lburp/Zmgr;)V
    //   14: return
  }
  
  private void lambda$execute$0(Zeqc paramZeqc, Ztpx paramZtpx, Zrj paramZrj, Zlsy paramZlsy) {
    try {
      this.Zd.Zo(paramZeqc, this.ZF.Zu(paramZtpx, paramZeqc, this.ZP.ZM()));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zx.ZB(Zb09.Zh(this.ZJ, this.ZD.Zd(this.ZJ), Zblb.ZB(throwable)).Zm().Zn(), throwable);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */