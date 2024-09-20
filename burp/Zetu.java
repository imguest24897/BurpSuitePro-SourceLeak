package burp;

import javax.swing.text.BadLocationException;
import javax.swing.text.NavigationFilter;
import javax.swing.text.Position;

class Zetu extends NavigationFilter {
  final Zz_j Zh;
  
  private Zetu(Zz_j paramZz_j) {}
  
  public void setDot(NavigationFilter.FilterBypass paramFilterBypass, int paramInt, Position.Bias paramBias) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zh : Lburp/Zz_j;
    //   9: invokevirtual Zf : ()Lburp/Zmgw;
    //   12: astore #5
    //   14: aload #5
    //   16: instanceof burp/Zmgn
    //   19: ifeq -> 273
    //   22: aload_0
    //   23: getfield Zh : Lburp/Zz_j;
    //   26: invokevirtual Zf : ()Lburp/Zmgw;
    //   29: checkcast burp/Zmgn
    //   32: astore #6
    //   34: aload #6
    //   36: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   39: checkcast burp/Ze9f
    //   42: astore #7
    //   44: aload #6
    //   46: invokevirtual ZY : ()Z
    //   49: ifeq -> 273
    //   52: aload_0
    //   53: getfield Zh : Lburp/Zz_j;
    //   56: invokevirtual getDot : ()I
    //   59: istore #8
    //   61: aload #6
    //   63: invokevirtual Zm : ()Lburp/Zxam;
    //   66: astore #9
    //   68: iconst_0
    //   69: istore #10
    //   71: aload #5
    //   73: iload_2
    //   74: invokevirtual getLineOfOffset : (I)I
    //   77: istore #10
    //   79: goto -> 92
    //   82: astore #11
    //   84: aload #11
    //   86: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   89: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   92: aload #9
    //   94: iload #10
    //   96: invokeinterface ZN : (I)Z
    //   101: ifeq -> 273
    //   104: iload_2
    //   105: iload #8
    //   107: if_icmple -> 187
    //   110: aload #5
    //   112: invokevirtual getLineCount : ()I
    //   115: istore #11
    //   117: iinc #10, 1
    //   120: iload #10
    //   122: iload #11
    //   124: if_icmpge -> 153
    //   127: aload #9
    //   129: iload #10
    //   131: invokeinterface ZN : (I)Z
    //   136: ifeq -> 153
    //   139: goto -> 146
    //   142: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   145: athrow
    //   146: goto -> 117
    //   149: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   152: athrow
    //   153: iload #10
    //   155: iload #11
    //   157: if_icmpge -> 173
    //   160: aload #5
    //   162: iload #10
    //   164: invokevirtual getLineStartOffset : (I)I
    //   167: istore_2
    //   168: iload #4
    //   170: ifne -> 182
    //   173: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   176: aload #5
    //   178: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   181: return
    //   182: iload #4
    //   184: ifne -> 259
    //   187: iload_2
    //   188: iload #8
    //   190: if_icmpge -> 259
    //   193: goto -> 200
    //   196: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   199: athrow
    //   200: iinc #10, -1
    //   203: iload #10
    //   205: iflt -> 241
    //   208: goto -> 215
    //   211: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   214: athrow
    //   215: aload #9
    //   217: iload #10
    //   219: invokeinterface ZN : (I)Z
    //   224: ifeq -> 241
    //   227: goto -> 234
    //   230: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   233: athrow
    //   234: goto -> 200
    //   237: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   240: athrow
    //   241: iload #10
    //   243: iflt -> 259
    //   246: aload #7
    //   248: aload #5
    //   250: iload #10
    //   252: invokevirtual getLineEndOffset : (I)I
    //   255: invokevirtual Zz : (I)I
    //   258: istore_2
    //   259: goto -> 273
    //   262: astore #11
    //   264: aload #11
    //   266: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   269: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   272: return
    //   273: aload_0
    //   274: aload_1
    //   275: iload_2
    //   276: aload_3
    //   277: invokespecial setDot : (Ljavax/swing/text/NavigationFilter$FilterBypass;ILjavax/swing/text/Position$Bias;)V
    //   280: return
    // Exception table:
    //   from	to	target	type
    //   71	79	82	javax/swing/text/BadLocationException
    //   104	181	262	javax/swing/text/BadLocationException
    //   117	139	142	javax/swing/text/BadLocationException
    //   127	149	149	javax/swing/text/BadLocationException
    //   182	193	196	javax/swing/text/BadLocationException
    //   182	259	262	javax/swing/text/BadLocationException
    //   187	208	211	javax/swing/text/BadLocationException
    //   200	227	230	javax/swing/text/BadLocationException
    //   215	237	237	javax/swing/text/BadLocationException
  }
  
  public void moveDot(NavigationFilter.FilterBypass paramFilterBypass, int paramInt, Position.Bias paramBias) {
    super.moveDot(paramFilterBypass, paramInt, paramBias);
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zetu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */