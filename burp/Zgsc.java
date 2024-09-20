package burp;

public class Zgsc implements Zg_ {
  private final Zga9 ZH;
  
  private final Zez2 Zc;
  
  public Zgsc(Zga9 paramZga9, Zez2 paramZez2) {
    this.ZH = paramZga9;
    this.Zc = paramZez2;
  }
  
  public boolean ZS(Zzih paramZzih) {
    // Byte code:
    //   0: invokestatic Zz : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZH : Lburp/Zga9;
    //   8: aload_1
    //   9: invokevirtual Z_ : ()C
    //   12: invokeinterface ZJ : (C)Z
    //   17: ifeq -> 150
    //   20: aload_1
    //   21: invokevirtual Z_ : ()C
    //   24: istore_3
    //   25: aload_1
    //   26: dup
    //   27: getfield ZD : I
    //   30: dup_x1
    //   31: iconst_1
    //   32: iadd
    //   33: putfield ZD : I
    //   36: istore #4
    //   38: new java/lang/StringBuilder
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: astore #5
    //   47: aload_1
    //   48: getfield ZD : I
    //   51: aload_1
    //   52: getfield Zp : I
    //   55: if_icmpge -> 119
    //   58: aload_0
    //   59: getfield ZH : Lburp/Zga9;
    //   62: iload_3
    //   63: aload_1
    //   64: invokevirtual Z_ : ()C
    //   67: invokeinterface Zg : (CC)Z
    //   72: ifeq -> 89
    //   75: aload_1
    //   76: dup
    //   77: getfield ZD : I
    //   80: iconst_1
    //   81: iadd
    //   82: putfield ZD : I
    //   85: aload_2
    //   86: ifnonnull -> 119
    //   89: aload #5
    //   91: aload_0
    //   92: getfield Zc : Lburp/Zez2;
    //   95: aload_1
    //   96: invokeinterface Zx : (Lburp/Zzih;)C
    //   101: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload_1
    //   106: dup
    //   107: getfield ZD : I
    //   110: iconst_1
    //   111: iadd
    //   112: putfield ZD : I
    //   115: aload_2
    //   116: ifnonnull -> 47
    //   119: aload_1
    //   120: new burp/Zsvc
    //   123: dup
    //   124: getstatic burp/Zgho.LITERAL_STRING : Lburp/Zgho;
    //   127: aload #5
    //   129: invokevirtual toString : ()Ljava/lang/String;
    //   132: aload_1
    //   133: getfield Za : Lburp/Zgfi;
    //   136: iload #4
    //   138: aload_1
    //   139: getfield ZD : I
    //   142: invokespecial <init> : (Lburp/Zgho;Ljava/lang/Object;Lburp/Zgfi;II)V
    //   145: invokevirtual Zm : (Lburp/Zsvc;)V
    //   148: iconst_1
    //   149: ireturn
    //   150: iconst_0
    //   151: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgsc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */