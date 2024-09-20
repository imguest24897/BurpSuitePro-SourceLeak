package burp;

public class Zb_0 {
  private final Ztj1 ZU;
  
  private final boolean Zm;
  
  public Zb_0(Ztj1 paramZtj1, boolean paramBoolean) {
    this.ZU = paramZtj1;
    this.Zm = paramBoolean;
  }
  
  public void Zc(Ze3h paramZe3h) {
    // Byte code:
    //   0: invokestatic ZV : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual ZF : ()Z
    //   8: ifeq -> 12
    //   11: return
    //   12: aload_0
    //   13: getfield ZU : Lburp/Ztj1;
    //   16: invokevirtual Zi : ()Lburp/Zrbm;
    //   19: astore_3
    //   20: aload_3
    //   21: instanceof burp/Zriy
    //   24: ifne -> 35
    //   27: iconst_0
    //   28: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   31: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   34: return
    //   35: aload_3
    //   36: checkcast burp/Zriy
    //   39: astore #4
    //   41: aload_0
    //   42: getfield Zm : Z
    //   45: ifeq -> 67
    //   48: aload_1
    //   49: invokevirtual Zd : ()Lburp/Ze3h;
    //   52: invokevirtual ZL : ()Lburp/Ze3h;
    //   55: invokevirtual Zz : ()Lburp/Ze3h;
    //   58: invokevirtual Zp : ()Ljava/util/List;
    //   61: astore #5
    //   63: aload_2
    //   64: ifnull -> 73
    //   67: aload_1
    //   68: invokevirtual Zp : ()Ljava/util/List;
    //   71: astore #5
    //   73: aload #5
    //   75: aload #4
    //   77: dup
    //   78: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   81: pop
    //   82: <illegal opcode> accept : (Lburp/Zriy;)Ljava/util/function/Consumer;
    //   87: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   92: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */