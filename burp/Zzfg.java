package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;

public class Zzfg extends Zz85 {
  private final boolean ZR;
  
  private final int Zz;
  
  public Zzfg(String paramString, boolean paramBoolean, int paramInt) {
    super(paramString);
    this.ZR = paramBoolean;
    this.Zz = paramInt;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getCaret : ()Ljavax/swing/text/Caret;
    //   4: checkcast javax/swing/text/DefaultCaret
    //   7: astore #4
    //   9: invokestatic Zm : ()I
    //   12: aload #4
    //   14: invokevirtual getDot : ()I
    //   17: istore #5
    //   19: aload #4
    //   21: invokevirtual getDotBias : ()Ljavax/swing/text/Position$Bias;
    //   24: astore #6
    //   26: istore_3
    //   27: aload_0
    //   28: getfield ZR : Z
    //   31: ifne -> 130
    //   34: aload_0
    //   35: getfield Zz : I
    //   38: lookupswitch default -> 130, 3 -> 68, 7 -> 99
    //   64: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   67: athrow
    //   68: aload #4
    //   70: invokevirtual getMark : ()I
    //   73: istore #7
    //   75: iload #5
    //   77: iload #7
    //   79: if_icmpeq -> 130
    //   82: aload #4
    //   84: iload #5
    //   86: iload #7
    //   88: invokestatic max : (II)I
    //   91: invokevirtual setDot : (I)V
    //   94: return
    //   95: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   98: athrow
    //   99: aload #4
    //   101: invokevirtual getMark : ()I
    //   104: istore #7
    //   106: iload #5
    //   108: iload #7
    //   110: if_icmpeq -> 130
    //   113: aload #4
    //   115: iload #5
    //   117: iload #7
    //   119: invokestatic min : (II)I
    //   122: invokevirtual setDot : (I)V
    //   125: return
    //   126: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   129: athrow
    //   130: iconst_1
    //   131: anewarray javax/swing/text/Position$Bias
    //   134: astore #7
    //   136: aload #4
    //   138: invokevirtual getMagicCaretPosition : ()Ljava/awt/Point;
    //   141: astore #8
    //   143: aload #8
    //   145: ifnonnull -> 205
    //   148: aload_0
    //   149: getfield Zz : I
    //   152: iconst_1
    //   153: if_icmpeq -> 178
    //   156: goto -> 163
    //   159: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   162: athrow
    //   163: aload_0
    //   164: getfield Zz : I
    //   167: iconst_5
    //   168: if_icmpne -> 205
    //   171: goto -> 178
    //   174: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   177: athrow
    //   178: aload_2
    //   179: iload #5
    //   181: invokevirtual modelToView : (I)Ljava/awt/Rectangle;
    //   184: astore #9
    //   186: new java/awt/Point
    //   189: dup
    //   190: aload #9
    //   192: getfield x : I
    //   195: aload #9
    //   197: getfield y : I
    //   200: invokespecial <init> : (II)V
    //   203: astore #8
    //   205: aload_2
    //   206: invokevirtual getNavigationFilter : ()Ljavax/swing/text/NavigationFilter;
    //   209: astore #9
    //   211: aload #9
    //   213: ifnull -> 238
    //   216: aload #9
    //   218: aload_2
    //   219: iload #5
    //   221: aload #6
    //   223: aload_0
    //   224: getfield Zz : I
    //   227: aload #7
    //   229: invokevirtual getNextVisualPositionFrom : (Ljavax/swing/text/JTextComponent;ILjavax/swing/text/Position$Bias;I[Ljavax/swing/text/Position$Bias;)I
    //   232: istore #5
    //   234: iload_3
    //   235: ifeq -> 258
    //   238: aload_2
    //   239: invokevirtual getUI : ()Ljavax/swing/plaf/TextUI;
    //   242: aload_2
    //   243: iload #5
    //   245: aload #6
    //   247: aload_0
    //   248: getfield Zz : I
    //   251: aload #7
    //   253: invokevirtual getNextVisualPositionFrom : (Ljavax/swing/text/JTextComponent;ILjavax/swing/text/Position$Bias;I[Ljavax/swing/text/Position$Bias;)I
    //   256: istore #5
    //   258: aload_0
    //   259: getfield ZR : Z
    //   262: ifeq -> 357
    //   265: iload #5
    //   267: aload #4
    //   269: invokevirtual getDot : ()I
    //   272: if_icmpne -> 325
    //   275: goto -> 282
    //   278: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   281: athrow
    //   282: aload #7
    //   284: iconst_0
    //   285: aaload
    //   286: ifnull -> 325
    //   289: goto -> 296
    //   292: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   295: athrow
    //   296: aload #7
    //   298: iconst_0
    //   299: aaload
    //   300: aload #6
    //   302: if_acmpeq -> 325
    //   305: goto -> 312
    //   308: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   311: athrow
    //   312: aload #4
    //   314: iconst_0
    //   315: invokevirtual moveDot : (I)V
    //   318: goto -> 325
    //   321: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   324: athrow
    //   325: aload #4
    //   327: iload #5
    //   329: aload #7
    //   331: iconst_0
    //   332: aaload
    //   333: ifnull -> 347
    //   336: aload #7
    //   338: iconst_0
    //   339: aaload
    //   340: goto -> 350
    //   343: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   346: athrow
    //   347: getstatic javax/swing/text/Position$Bias.Forward : Ljavax/swing/text/Position$Bias;
    //   350: invokevirtual moveDot : (ILjavax/swing/text/Position$Bias;)V
    //   353: iload_3
    //   354: ifeq -> 392
    //   357: aload #4
    //   359: iload #5
    //   361: aload #7
    //   363: iconst_0
    //   364: aaload
    //   365: ifnull -> 386
    //   368: goto -> 375
    //   371: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   374: athrow
    //   375: aload #7
    //   377: iconst_0
    //   378: aaload
    //   379: goto -> 389
    //   382: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   385: athrow
    //   386: getstatic javax/swing/text/Position$Bias.Forward : Ljavax/swing/text/Position$Bias;
    //   389: invokevirtual setDot : (ILjavax/swing/text/Position$Bias;)V
    //   392: aload #8
    //   394: ifnull -> 441
    //   397: aload_0
    //   398: getfield Zz : I
    //   401: iconst_1
    //   402: if_icmpeq -> 427
    //   405: goto -> 412
    //   408: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   411: athrow
    //   412: aload_0
    //   413: getfield Zz : I
    //   416: iconst_5
    //   417: if_icmpne -> 441
    //   420: goto -> 427
    //   423: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   426: athrow
    //   427: aload #4
    //   429: aload #8
    //   431: invokevirtual setMagicCaretPosition : (Ljava/awt/Point;)V
    //   434: goto -> 441
    //   437: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   440: athrow
    //   441: goto -> 454
    //   444: astore #9
    //   446: aload #9
    //   448: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   451: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   454: return
    // Exception table:
    //   from	to	target	type
    //   27	64	64	javax/swing/text/BadLocationException
    //   75	95	95	javax/swing/text/BadLocationException
    //   106	126	126	javax/swing/text/BadLocationException
    //   143	156	159	javax/swing/text/BadLocationException
    //   143	441	444	javax/swing/text/BadLocationException
    //   148	171	174	javax/swing/text/BadLocationException
    //   258	275	278	javax/swing/text/BadLocationException
    //   265	289	292	javax/swing/text/BadLocationException
    //   282	305	308	javax/swing/text/BadLocationException
    //   296	318	321	javax/swing/text/BadLocationException
    //   325	343	343	javax/swing/text/BadLocationException
    //   350	368	371	javax/swing/text/BadLocationException
    //   357	382	382	javax/swing/text/BadLocationException
    //   392	405	408	javax/swing/text/BadLocationException
    //   397	420	423	javax/swing/text/BadLocationException
    //   412	434	437	javax/swing/text/BadLocationException
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */