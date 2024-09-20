package burp;

import javax.swing.text.Segment;

public class Zen2 implements Zmhz {
  private final Zmhz ZL;
  
  public Zen2(Zmhz paramZmhz) {
    this.ZL = paramZmhz;
  }
  
  public int Zb(int paramInt) {
    return this.ZL.Zb(paramInt);
  }
  
  public Ze7g ZE(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zj : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_2
    //   6: getfield offset : I
    //   9: aload_2
    //   10: getfield count : I
    //   13: iadd
    //   14: sipush #10000
    //   17: if_icmpge -> 35
    //   20: aload_0
    //   21: getfield ZL : Lburp/Zmhz;
    //   24: iload_1
    //   25: aload_2
    //   26: aload_3
    //   27: iload #4
    //   29: invokeinterface ZE : (ILjavax/swing/text/Segment;Lburp/Zska;I)Lburp/Ze7g;
    //   34: areturn
    //   35: aload_2
    //   36: getfield offset : I
    //   39: sipush #10000
    //   42: if_icmpge -> 205
    //   45: aload_2
    //   46: iconst_0
    //   47: sipush #10000
    //   50: aload_2
    //   51: getfield offset : I
    //   54: isub
    //   55: invokevirtual subSequence : (II)Ljava/lang/CharSequence;
    //   58: checkcast javax/swing/text/Segment
    //   61: astore #7
    //   63: aload_0
    //   64: getfield ZL : Lburp/Zmhz;
    //   67: iload_1
    //   68: aload #7
    //   70: aload_3
    //   71: iload #4
    //   73: invokeinterface ZE : (ILjavax/swing/text/Segment;Lburp/Zska;I)Lburp/Ze7g;
    //   78: astore #6
    //   80: aload #6
    //   82: invokevirtual Zb : ()Lburp/Zska;
    //   85: invokestatic ZU : (Lburp/Zska;)Lburp/Zska;
    //   88: astore #8
    //   90: aload #8
    //   92: ifnull -> 157
    //   95: aload #6
    //   97: invokevirtual Zs : ()Lburp/Zska;
    //   100: aload #8
    //   102: invokestatic ZD : (Lburp/Zska;Lburp/Zska;)Lburp/Ze7g;
    //   105: astore #6
    //   107: aload #6
    //   109: new burp/Zska
    //   112: dup
    //   113: aload_2
    //   114: getfield array : [C
    //   117: aload #8
    //   119: invokevirtual Zl : ()I
    //   122: aload #8
    //   124: invokevirtual Za : ()I
    //   127: iadd
    //   128: aload_2
    //   129: getfield offset : I
    //   132: aload_2
    //   133: getfield count : I
    //   136: iadd
    //   137: iconst_1
    //   138: isub
    //   139: aload #8
    //   141: invokevirtual ZF : ()I
    //   144: bipush #21
    //   146: invokespecial <init> : ([CIIII)V
    //   149: invokevirtual ZH : (Lburp/Zska;)V
    //   152: aload #5
    //   154: ifnull -> 200
    //   157: aload #6
    //   159: new burp/Zska
    //   162: dup
    //   163: aload_2
    //   164: getfield array : [C
    //   167: sipush #10000
    //   170: aload_2
    //   171: getfield offset : I
    //   174: aload_2
    //   175: getfield count : I
    //   178: iadd
    //   179: iconst_1
    //   180: isub
    //   181: iload #4
    //   183: sipush #10000
    //   186: iadd
    //   187: aload_2
    //   188: getfield offset : I
    //   191: isub
    //   192: bipush #21
    //   194: invokespecial <init> : ([CIIII)V
    //   197: invokevirtual ZX : (Lburp/Zska;)V
    //   200: aload #5
    //   202: ifnull -> 249
    //   205: new burp/Ze7g
    //   208: dup
    //   209: invokespecial <init> : ()V
    //   212: astore #6
    //   214: aload #6
    //   216: new burp/Zska
    //   219: dup
    //   220: aload_2
    //   221: getfield array : [C
    //   224: aload_2
    //   225: getfield offset : I
    //   228: aload_2
    //   229: getfield offset : I
    //   232: aload_2
    //   233: getfield count : I
    //   236: iadd
    //   237: iconst_1
    //   238: isub
    //   239: iload #4
    //   241: bipush #21
    //   243: invokespecial <init> : ([CIIII)V
    //   246: invokevirtual ZH : (Lburp/Zska;)V
    //   249: aload #6
    //   251: invokestatic ZK : ()Lburp/Zska;
    //   254: invokevirtual ZH : (Lburp/Zska;)V
    //   257: aload #6
    //   259: areturn
  }
  
  private static Zska ZU(Zska paramZska) {
    if (paramZska != null)
      do {
        paramZska = paramZska.ZO;
      } while (paramZska != null && !paramZska.ZG()); 
    return paramZska;
  }
  
  public boolean ZA(int paramInt, char paramChar) {
    return this.ZL.ZA(paramInt, paramChar);
  }
  
  public boolean Zh() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zen2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */