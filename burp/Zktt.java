package burp;

import java.io.IOException;
import net.portswigger.Zkb;

public class Zktt extends Zkte {
  private final Zse1 ZF;
  
  public Zktt(Zse1 paramZse1, Zr_4 paramZr_4) {
    super(paramZr_4, paramZse1);
    this.ZF = paramZse1;
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : Lburp/Zse1;
    //   4: invokeinterface Zyv : ()I
    //   9: istore #4
    //   11: invokestatic ZF : ()I
    //   14: aload_0
    //   15: getfield ZF : Lburp/Zse1;
    //   18: invokeinterface ZIQ : ()I
    //   23: iconst_1
    //   24: iadd
    //   25: istore #5
    //   27: istore_3
    //   28: aload_0
    //   29: getfield ZF : Lburp/Zse1;
    //   32: iload #5
    //   34: invokeinterface ZBV : (I)V
    //   39: iload #4
    //   41: iconst_m1
    //   42: if_icmpeq -> 52
    //   45: iload #5
    //   47: iload #4
    //   49: if_icmpgt -> 100
    //   52: new burp/Zr1f
    //   55: dup
    //   56: aload_1
    //   57: invokespecial <init> : (Lburp/Zzlx;)V
    //   60: astore #6
    //   62: aload #6
    //   64: aload_0
    //   65: getfield ZF : Lburp/Zse1;
    //   68: invokeinterface ZIe : ()Z
    //   73: invokevirtual Zb : (Z)Ljava/util/Optional;
    //   76: astore #7
    //   78: aload #7
    //   80: aload_0
    //   81: aload #6
    //   83: aload_2
    //   84: <illegal opcode> apply : (Lburp/Zktt;Lburp/Zr1f;[B)Ljava/util/function/Function;
    //   89: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   92: aconst_null
    //   93: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   96: checkcast [[B
    //   99: areturn
    //   100: aconst_null
    //   101: invokestatic Zwu : ()[Lburp/Zbqc;
    //   104: ifnonnull -> 114
    //   107: iinc #3, 1
    //   110: iload_3
    //   111: invokestatic ZH : (I)V
    //   114: areturn
  }
  
  public void Zy4() {
    Zled.ZV(this.ZF);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZF.ZS(paramZs4f);
  }
  
  private byte[][] lambda$buildNextPayload$0(Zr1f paramZr1f, byte[] paramArrayOfbyte, String paramString) {
    return this.ZF.Zyn().Zm(paramZr1f, paramArrayOfbyte, Zkb.Zy(paramString));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zktt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */