package burp;

import net.portswigger.Za4;
import net.portswigger.Zgx;
import net.portswigger.Zi_;

abstract class Zlhh extends Zi_ {
  private final Zmt2 ZN;
  
  private int ZJ = 0;
  
  private boolean Zz = false;
  
  Zlhh(Zmt2 paramZmt2) {
    this.ZN = paramZmt2;
  }
  
  protected Za4<? extends Zgx> ZF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZN : Lburp/Zmt2;
    //   4: aload_0
    //   5: getfield ZJ : I
    //   8: bipush #10
    //   10: invokeinterface Zf : (II)Lburp/Zs_1;
    //   15: astore_1
    //   16: aload_0
    //   17: getfield ZJ : I
    //   20: aload_1
    //   21: invokevirtual Zt : ()I
    //   24: iadd
    //   25: istore_2
    //   26: new net/portswigger/Za4
    //   29: dup
    //   30: aload_1
    //   31: invokevirtual Za : ()Lnet/portswigger/Zgx;
    //   34: ldc net/portswigger/Zgx
    //   36: aload_0
    //   37: iload_2
    //   38: aload_1
    //   39: <illegal opcode> run : (Lburp/Zlhh;ILburp/Zs_1;)Ljava/lang/Runnable;
    //   44: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Runnable;)V
    //   47: areturn
  }
  
  protected boolean Zr() {
    return this.Zz;
  }
  
  private void lambda$work$0(int paramInt, Zs_1 paramZs_1) {
    this.ZJ = paramInt;
    this.Zz = paramZs_1.Z_();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */