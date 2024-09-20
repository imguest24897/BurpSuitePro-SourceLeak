package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;

class Zgop extends Zbqc implements Zb3 {
  private final Zbdf Zo;
  
  private Zefx Zf;
  
  private Zstu ZG;
  
  private Zzi8 ZP;
  
  private Zefg<Zrrc> ZE;
  
  private static final String a;
  
  public Zgop(Zbdf paramZbdf, Zbdx paramZbdx) {
    super(new BorderLayout());
    this.Zo = paramZbdf;
    add(paramZbdx, a);
  }
  
  public void ZF(Zefx paramZefx, Zzi8 paramZzi8, Zefg<Zrrc> paramZefg) {
    this.Zf = paramZefx;
    this.ZG = null;
    this.ZP = paramZzi8;
    this.ZE = paramZefg;
  }
  
  public void ZE(Zstu paramZstu, Zzi8 paramZzi8, Zefg<Zrrc> paramZefg) {
    this.Zf = null;
    this.ZG = paramZstu;
    this.ZP = paramZzi8;
    this.ZE = paramZefg;
  }
  
  public void Zt() {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zf : Lburp/Zefx;
    //   8: ifnull -> 30
    //   11: aload_0
    //   12: getfield Zo : Lburp/Zbdf;
    //   15: aload_0
    //   16: getfield Zf : Lburp/Zefx;
    //   19: aload_0
    //   20: getfield ZP : Lburp/Zzi8;
    //   23: invokevirtual ZI : (Lburp/Zefx;Lburp/Zmgv;)V
    //   26: aload_1
    //   27: ifnonnull -> 60
    //   30: aload_0
    //   31: getfield ZG : Lburp/Zstu;
    //   34: ifnull -> 59
    //   37: aload_0
    //   38: getfield Zo : Lburp/Zbdf;
    //   41: aload_0
    //   42: getfield ZG : Lburp/Zstu;
    //   45: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   48: aload_0
    //   49: getfield ZP : Lburp/Zzi8;
    //   52: invokevirtual ZL : (Lburp/Zstu;Lburp/Zgu3;Lburp/Zmgv;)V
    //   55: aload_1
    //   56: ifnonnull -> 60
    //   59: return
    //   60: aload_0
    //   61: <illegal opcode> run : (Lburp/Zgop;)Ljava/lang/Runnable;
    //   66: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   69: return
  }
  
  public Component ZH() {
    return this;
  }
  
  private void lambda$selected$0() {
    this.Zo.ZX(Zkv5.ZR((List)this.ZE));
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: ldc 'hHf'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgop.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #59
    //   82: goto -> 111
    //   85: bipush #10
    //   87: goto -> 111
    //   90: bipush #54
    //   92: goto -> 111
    //   95: iconst_2
    //   96: goto -> 111
    //   99: bipush #104
    //   101: goto -> 111
    //   104: bipush #96
    //   106: goto -> 111
    //   109: bipush #63
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgop.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */