package burp;

public class Zlzb {
  private final Zglt Zn;
  
  private final Zrsu Z_;
  
  private final Ze5g ZH;
  
  private final Zsb2 ZP;
  
  private final int Zy;
  
  Zlzb(Ze5g paramZe5g, Zglt paramZglt, Zsb2 paramZsb2, Zrsu paramZrsu, int paramInt) {
    this.ZH = paramZe5g;
    this.ZP = paramZsb2;
    this.Zn = paramZglt;
    this.Z_ = paramZrsu;
    this.Zy = paramInt;
  }
  
  public void Zk(Ze3n paramZe3n, Zxs7 paramZxs7, Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZH : Lburp/Ze5g;
    //   4: aload_0
    //   5: getfield Zy : I
    //   8: aload_1
    //   9: aload_2
    //   10: invokeinterface Zd : (ILburp/Ze3n;Lburp/Zxs7;)Lnet/portswigger/Zen;
    //   15: astore #5
    //   17: invokestatic ZI : ()[Lburp/Zbqc;
    //   20: aload_0
    //   21: getfield Zn : Lburp/Zglt;
    //   24: aload_1
    //   25: aload_2
    //   26: aload #5
    //   28: invokeinterface ZX : (Lburp/Ze3n;Lburp/Zxs7;Lnet/portswigger/Zen;)Ljava/util/List;
    //   33: astore #6
    //   35: astore #4
    //   37: aload #6
    //   39: invokeinterface iterator : ()Ljava/util/Iterator;
    //   44: astore #7
    //   46: aload #7
    //   48: invokeinterface hasNext : ()Z
    //   53: ifeq -> 102
    //   56: aload #7
    //   58: invokeinterface next : ()Ljava/lang/Object;
    //   63: checkcast burp/Zb6q
    //   66: astore #8
    //   68: aload_0
    //   69: getfield ZP : Lburp/Zsb2;
    //   72: aload_1
    //   73: aload #8
    //   75: aload #5
    //   77: invokeinterface ZG : (Lburp/Ze3n;Lburp/Zb6q;Lnet/portswigger/Zen;)Ljava/util/List;
    //   82: aload_0
    //   83: aload_1
    //   84: aload #8
    //   86: aload_3
    //   87: <illegal opcode> accept : (Lburp/Zlzb;Lburp/Ze3n;Lburp/Zb6q;Lburp/Zz4_;)Ljava/util/function/Consumer;
    //   92: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   97: aload #4
    //   99: ifnonnull -> 46
    //   102: return
  }
  
  private void lambda$detectAndReport$0(Ze3n paramZe3n, Zb6q paramZb6q, Zz4_ paramZz4_, Zlkb paramZlkb) {
    this.Z_.ZL(paramZe3n, paramZlkb, paramZb6q, paramZz4_);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlzb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */