package burp;

public class Ztfp {
  private final Zb0h ZN;
  
  public Ztfp(Zb0h paramZb0h) {
    this.ZN = paramZb0h;
  }
  
  public boolean ZZ(Ze3h paramZe3h) {
    // Byte code:
    //   0: invokestatic ZV : ()[I
    //   3: astore_2
    //   4: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_COPY_URL : Lburp/Zrrh;
    //   7: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   10: aload_1
    //   11: invokevirtual Zw : ()I
    //   14: iconst_1
    //   15: if_icmpne -> 64
    //   18: aload_1
    //   19: invokevirtual ZJ : ()Lburp/Zz_1;
    //   22: ifnull -> 64
    //   25: aload_1
    //   26: invokevirtual ZJ : ()Lburp/Zz_1;
    //   29: invokevirtual getChildCount : ()I
    //   32: ifne -> 64
    //   35: aload_0
    //   36: getfield ZN : Lburp/Zb0h;
    //   39: aload_1
    //   40: invokevirtual ZJ : ()Lburp/Zz_1;
    //   43: invokevirtual Z_ : ()Ljava/lang/Object;
    //   46: checkcast burp/Zxya
    //   49: invokevirtual Zq : ()Lburp/Zlit;
    //   52: invokeinterface toString : ()Ljava/lang/String;
    //   57: invokevirtual ZR : (Ljava/lang/String;)V
    //   60: aload_2
    //   61: ifnull -> 148
    //   64: new java/lang/StringBuilder
    //   67: dup
    //   68: invokespecial <init> : ()V
    //   71: astore_3
    //   72: aload_1
    //   73: invokevirtual Zd : ()Lburp/Ze3h;
    //   76: invokevirtual ZL : ()Lburp/Ze3h;
    //   79: invokevirtual Zb : ()Lburp/Ze3h;
    //   82: invokevirtual iterator : ()Ljava/util/Iterator;
    //   85: astore #4
    //   87: aload #4
    //   89: invokeinterface hasNext : ()Z
    //   94: ifeq -> 137
    //   97: aload #4
    //   99: invokeinterface next : ()Ljava/lang/Object;
    //   104: checkcast burp/Zz_1
    //   107: astore #5
    //   109: aload_3
    //   110: aload #5
    //   112: invokevirtual Z_ : ()Ljava/lang/Object;
    //   115: checkcast burp/Zxya
    //   118: invokevirtual Zq : ()Lburp/Zlit;
    //   121: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload_3
    //   126: getstatic burp/Zlb0.Zp : Ljava/lang/String;
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload_2
    //   134: ifnull -> 87
    //   137: aload_0
    //   138: getfield ZN : Lburp/Zb0h;
    //   141: aload_3
    //   142: invokevirtual toString : ()Ljava/lang/String;
    //   145: invokevirtual ZR : (Ljava/lang/String;)V
    //   148: iconst_1
    //   149: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztfp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */