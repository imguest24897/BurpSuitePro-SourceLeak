package burp;

import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zxp3 implements Zbui {
  private final Zkr_ Zb;
  
  private final Zbnt ZF;
  
  private final Ztwv ZT;
  
  private final Zey9 Zl;
  
  Zxp3(Zkr_ paramZkr_, Zbnt paramZbnt, Ztwv paramZtwv, Zey9 paramZey9) {
    this.Zb = paramZkr_;
    this.ZF = paramZbnt;
    this.ZT = paramZtwv;
    this.Zl = paramZey9;
  }
  
  public void ZP(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2) {
    if (paramZstu2 == null) {
      Zuh.Zb(false, Zqf.Zv);
      ZU(paramZmzk, paramZstu1);
      return;
    } 
    Zm2.Zo(Zze0.SUITE_INTERFACES_SEND_TO_SEQUENCER);
    this.Zb.ZX(paramZmzk, paramZstu1, paramZstu2);
    this.Zb.ZD(0, true, true, true);
  }
  
  public void ZU(Zmzk paramZmzk, Zstu paramZstu) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 5
    //   4: return
    //   5: getstatic burp/Zze0.SUITE_INTERFACES_SEND_TO_SEQUENCER : Lburp/Zze0;
    //   8: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   11: aload_2
    //   12: invokeinterface ZiD : ()[B
    //   17: astore_3
    //   18: aload_0
    //   19: getfield ZT : Lburp/Ztwv;
    //   22: aload_0
    //   23: aload_1
    //   24: aload_3
    //   25: aload_2
    //   26: <illegal opcode> run : (Lburp/Zxp3;Lburp/Zmzk;[BLburp/Zstu;)Ljava/lang/Runnable;
    //   31: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   36: pop
    //   37: return
  }
  
  private void lambda$setRequest$1(Zmzk paramZmzk, byte[] paramArrayOfbyte, Zstu paramZstu) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zb : Lburp/Zkr_;
    //   4: invokevirtual ZA : ()Lburp/Zbx9;
    //   7: aload_0
    //   8: getfield Zl : Lburp/Zey9;
    //   11: aload_1
    //   12: aload_2
    //   13: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   16: aload_0
    //   17: aload_1
    //   18: aload_2
    //   19: <illegal opcode> Zv : (Lburp/Zxp3;Lburp/Zmzk;[B)Lburp/Zmdh;
    //   24: invokevirtual ZF : (Lburp/Zefx;Lburp/Zmdh;)Lburp/Zg3d;
    //   27: astore #4
    //   29: aload #4
    //   31: invokeinterface Ze : ()Lburp/Zb6q;
    //   36: ifnull -> 57
    //   39: aload_0
    //   40: aload_1
    //   41: aload_3
    //   42: aload #4
    //   44: invokeinterface Ze : ()Lburp/Zb6q;
    //   49: invokeinterface Za : ()Lburp/Zstu;
    //   54: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;)V
    //   57: return
  }
  
  private void lambda$setRequest$0(Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    Zskh zskh = this.Zb.ZY4().Zz();
    Zmgc.CANNOT_HANDLE_STREAMING_RESPONSE.ZV(zskh, new Object[] { Zruf.ZT(paramZmzk, paramArrayOfbyte, this.ZF) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxp3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */