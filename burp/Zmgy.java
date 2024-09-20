package burp;

public class Zmgy extends Zmgt {
  protected String ZM(Zzvx paramZzvx) {
    // Byte code:
    //   0: invokestatic ZK : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: instanceof burp/Zzvw
    //   8: ifeq -> 162
    //   11: aload_1
    //   12: checkcast burp/Zzvw
    //   15: astore_3
    //   16: aload_3
    //   17: invokevirtual Zz : ()Lburp/Zgic;
    //   20: invokevirtual ZV : ()Lburp/Zbjl;
    //   23: astore #4
    //   25: new burp/Zzz4
    //   28: dup
    //   29: aload #4
    //   31: aload_3
    //   32: invokevirtual ZR : ()Lburp/Zrj;
    //   35: invokevirtual Zg : ()I
    //   38: aload_3
    //   39: invokevirtual ZX : ()Lburp/Ze3n;
    //   42: invokevirtual ZM : ()Lburp/Zbza;
    //   45: invokeinterface Zgv : ()I
    //   50: invokespecial <init> : (Lburp/Zbjl;II)V
    //   53: astore #5
    //   55: aload #5
    //   57: invokevirtual ZI : ()Lburp/Zewx;
    //   60: astore #6
    //   62: aload #6
    //   64: invokevirtual ZF : ()Lnet/portswigger/Zen;
    //   67: astore #7
    //   69: aload #4
    //   71: invokeinterface ZG : ()Z
    //   76: ifeq -> 105
    //   79: aload_3
    //   80: invokevirtual ZP : ()Ljava/util/Set;
    //   83: aload #7
    //   85: invokeinterface add : (Ljava/lang/Object;)Z
    //   90: pop
    //   91: aload #6
    //   93: invokevirtual Zh : ()[B
    //   96: invokestatic ZG : ([B)Ljava/lang/String;
    //   99: astore #8
    //   101: aload_2
    //   102: ifnonnull -> 142
    //   105: aload #7
    //   107: invokevirtual toString : ()Ljava/lang/String;
    //   110: astore #8
    //   112: getstatic burp/Zmgc.COLLABORATOR_DISABLED_FOR_BCHECK : Lburp/Zmgc;
    //   115: aload_3
    //   116: invokevirtual ZU : ()Lburp/Zbnr;
    //   119: invokeinterface Zr : ()Lburp/Zskh;
    //   124: iconst_1
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: aload_3
    //   131: invokevirtual Zx : ()Lburp/Zsvm;
    //   134: invokevirtual Zb : ()Ljava/lang/String;
    //   137: aastore
    //   138: invokevirtual ZK : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   141: pop
    //   142: aload_0
    //   143: getfield Zk : Ljava/lang/String;
    //   146: ifnull -> 159
    //   149: aload_3
    //   150: aload_0
    //   151: getfield Zk : Ljava/lang/String;
    //   154: aload #8
    //   156: invokevirtual Zg : (Ljava/lang/String;Ljava/lang/Object;)V
    //   159: aload #8
    //   161: areturn
    //   162: aconst_null
    //   163: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmgy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */