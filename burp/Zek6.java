package burp;

import java.util.List;
import javax.swing.text.BadLocationException;

public class Zek6 implements Zzio {
  private int ZV = -1;
  
  public List<Zxyv> Zl(Zmgn paramZmgn) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZO : ()I
    //   11: aload_1
    //   12: invokevirtual getLineCount : ()I
    //   15: istore #4
    //   17: istore_2
    //   18: aconst_null
    //   19: astore #5
    //   21: iconst_m1
    //   22: istore #6
    //   24: iconst_m1
    //   25: istore #7
    //   27: aload_0
    //   28: iconst_m1
    //   29: putfield ZV : I
    //   32: iconst_0
    //   33: istore #8
    //   35: iload #8
    //   37: iload #4
    //   39: if_icmpge -> 281
    //   42: aload_1
    //   43: iload #8
    //   45: invokevirtual ZL : (I)Lburp/Ze7g;
    //   48: astore #9
    //   50: aload #9
    //   52: invokevirtual Zs : ()Lburp/Zska;
    //   55: astore #10
    //   57: iload #8
    //   59: ifne -> 86
    //   62: aload #10
    //   64: invokevirtual ZX : ()I
    //   67: bipush #40
    //   69: if_icmpeq -> 274
    //   72: goto -> 79
    //   75: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   78: athrow
    //   79: goto -> 281
    //   82: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   85: athrow
    //   86: aload #10
    //   88: invokevirtual ZX : ()I
    //   91: bipush #41
    //   93: if_icmpeq -> 103
    //   96: goto -> 281
    //   99: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   102: athrow
    //   103: aload_0
    //   104: iload #8
    //   106: putfield ZV : I
    //   109: aload #9
    //   111: invokevirtual Zb : ()Lburp/Zska;
    //   114: astore #11
    //   116: aload #10
    //   118: invokevirtual ZJ : ()I
    //   121: istore #12
    //   123: aload #11
    //   125: ifnonnull -> 136
    //   128: iconst_0
    //   129: goto -> 143
    //   132: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   135: athrow
    //   136: aload #11
    //   138: invokevirtual ZF : ()I
    //   141: iconst_1
    //   142: isub
    //   143: istore #13
    //   145: aload #5
    //   147: ifnull -> 158
    //   150: iconst_1
    //   151: goto -> 159
    //   154: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   157: athrow
    //   158: iconst_0
    //   159: istore #14
    //   161: aload_0
    //   162: aload #10
    //   164: invokevirtual ZN : (Lburp/Zska;)Z
    //   167: istore #15
    //   169: iload #14
    //   171: ifne -> 194
    //   174: iload #15
    //   176: ifeq -> 194
    //   179: goto -> 186
    //   182: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   185: athrow
    //   186: iconst_1
    //   187: goto -> 195
    //   190: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   193: athrow
    //   194: iconst_0
    //   195: istore #16
    //   197: iload #14
    //   199: ifeq -> 222
    //   202: iload #15
    //   204: ifne -> 222
    //   207: goto -> 214
    //   210: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   213: athrow
    //   214: iconst_1
    //   215: goto -> 223
    //   218: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   221: athrow
    //   222: iconst_0
    //   223: istore #17
    //   225: iload #17
    //   227: ifeq -> 249
    //   230: aload #5
    //   232: iload #7
    //   234: invokevirtual ZE : (I)V
    //   237: aload_3
    //   238: aload #5
    //   240: invokeinterface add : (Ljava/lang/Object;)Z
    //   245: pop
    //   246: aconst_null
    //   247: astore #5
    //   249: iload #16
    //   251: ifeq -> 266
    //   254: new burp/Zxyv
    //   257: dup
    //   258: aload_1
    //   259: iload #6
    //   261: invokespecial <init> : (Lburp/Zmgn;I)V
    //   264: astore #5
    //   266: iload #12
    //   268: istore #6
    //   270: iload #13
    //   272: istore #7
    //   274: iinc #8, 1
    //   277: iload_2
    //   278: ifeq -> 35
    //   281: aload #5
    //   283: ifnull -> 309
    //   286: aload #5
    //   288: iload #7
    //   290: invokevirtual ZE : (I)V
    //   293: aload_3
    //   294: aload #5
    //   296: invokeinterface add : (Ljava/lang/Object;)Z
    //   301: pop
    //   302: goto -> 309
    //   305: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   308: athrow
    //   309: goto -> 322
    //   312: astore #5
    //   314: aload #5
    //   316: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   319: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   322: aload_3
    //   323: areturn
    // Exception table:
    //   from	to	target	type
    //   18	309	312	javax/swing/text/BadLocationException
    //   57	72	75	javax/swing/text/BadLocationException
    //   62	82	82	javax/swing/text/BadLocationException
    //   86	99	99	javax/swing/text/BadLocationException
    //   123	132	132	javax/swing/text/BadLocationException
    //   145	154	154	javax/swing/text/BadLocationException
    //   169	179	182	javax/swing/text/BadLocationException
    //   174	190	190	javax/swing/text/BadLocationException
    //   197	207	210	javax/swing/text/BadLocationException
    //   202	218	218	javax/swing/text/BadLocationException
    //   281	302	305	javax/swing/text/BadLocationException
  }
  
  private boolean ZN(Zska paramZska) {
    return (paramZska.ZX() == 41 && Ztji.Zb.contains(paramZska.Zu().toLowerCase()));
  }
  
  public int Zy() {
    return this.ZV;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zek6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */