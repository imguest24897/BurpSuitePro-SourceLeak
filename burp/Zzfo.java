package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

public class Zzfo extends Zz85 {
  private static final long serialVersionUID = 1L;
  
  private final Segment Ze = new Segment();
  
  private static final String c;
  
  public Zzfo() {
    this(c);
  }
  
  public Zzfo(String paramString) {
    super(paramString);
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_2
    //   5: invokevirtual isEditable : ()Z
    //   8: ifeq -> 25
    //   11: aload_2
    //   12: invokevirtual isEnabled : ()Z
    //   15: ifne -> 37
    //   18: goto -> 25
    //   21: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   24: athrow
    //   25: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   28: aload_2
    //   29: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   32: return
    //   33: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   36: athrow
    //   37: aload_2
    //   38: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   41: astore #4
    //   43: aload #4
    //   45: invokeinterface getDefaultRootElement : ()Ljavax/swing/text/Element;
    //   50: astore #5
    //   52: aload_2
    //   53: invokevirtual getCaret : ()Ljavax/swing/text/Caret;
    //   56: astore #6
    //   58: aload #6
    //   60: invokeinterface getDot : ()I
    //   65: istore #7
    //   67: aload #6
    //   69: invokeinterface getMark : ()I
    //   74: istore #8
    //   76: aload #5
    //   78: iload #7
    //   80: invokeinterface getElementIndex : (I)I
    //   85: istore #9
    //   87: aload_2
    //   88: invokevirtual getTabSize : ()I
    //   91: istore #10
    //   93: iload #7
    //   95: iload #8
    //   97: if_icmpeq -> 268
    //   100: aload #5
    //   102: iload #8
    //   104: invokeinterface getElementIndex : (I)I
    //   109: istore #11
    //   111: iload #9
    //   113: iload #11
    //   115: invokestatic min : (II)I
    //   118: istore #7
    //   120: iload #9
    //   122: iload #11
    //   124: invokestatic max : (II)I
    //   127: istore #8
    //   129: aload_2
    //   130: invokevirtual ZJ : ()V
    //   133: iload #7
    //   135: istore #9
    //   137: iload #9
    //   139: iload #8
    //   141: if_icmpge -> 172
    //   144: aload #5
    //   146: iload #9
    //   148: invokeinterface getElement : (I)Ljavax/swing/text/Element;
    //   153: astore #12
    //   155: aload_0
    //   156: aload #12
    //   158: aload #4
    //   160: iload #10
    //   162: invokevirtual Zc : (Ljavax/swing/text/Element;Ljavax/swing/text/Document;I)V
    //   165: iinc #9, 1
    //   168: aload_3
    //   169: ifnull -> 137
    //   172: aload #5
    //   174: iload #8
    //   176: invokeinterface getElement : (I)Ljavax/swing/text/Element;
    //   181: astore #12
    //   183: aload #12
    //   185: invokeinterface getStartOffset : ()I
    //   190: istore #13
    //   192: aload #6
    //   194: invokeinterface getDot : ()I
    //   199: aload #6
    //   201: invokeinterface getMark : ()I
    //   206: invokestatic max : (II)I
    //   209: iload #13
    //   211: if_icmpeq -> 231
    //   214: aload_0
    //   215: aload #12
    //   217: aload #4
    //   219: iload #10
    //   221: invokevirtual Zc : (Ljavax/swing/text/Element;Ljavax/swing/text/Document;I)V
    //   224: goto -> 231
    //   227: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   230: athrow
    //   231: aload_2
    //   232: invokevirtual ZA : ()V
    //   235: goto -> 264
    //   238: astore #13
    //   240: aload #13
    //   242: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   245: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   248: aload_2
    //   249: invokevirtual ZA : ()V
    //   252: goto -> 264
    //   255: astore #14
    //   257: aload_2
    //   258: invokevirtual ZA : ()V
    //   261: aload #14
    //   263: athrow
    //   264: aload_3
    //   265: ifnull -> 302
    //   268: aload #5
    //   270: iload #9
    //   272: invokeinterface getElement : (I)Ljavax/swing/text/Element;
    //   277: astore #11
    //   279: aload_0
    //   280: aload #11
    //   282: aload #4
    //   284: iload #10
    //   286: invokevirtual Zc : (Ljavax/swing/text/Element;Ljavax/swing/text/Document;I)V
    //   289: goto -> 302
    //   292: astore #12
    //   294: aload #12
    //   296: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   299: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   302: return
    // Exception table:
    //   from	to	target	type
    //   4	18	21	javax/swing/text/BadLocationException
    //   11	33	33	javax/swing/text/BadLocationException
    //   133	231	238	javax/swing/text/BadLocationException
    //   133	231	255	finally
    //   192	224	227	javax/swing/text/BadLocationException
    //   238	248	255	finally
    //   255	257	255	finally
    //   279	289	292	javax/swing/text/BadLocationException
  }
  
  private void Zc(Element paramElement, Document paramDocument, int paramInt) throws BadLocationException {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getStartOffset : ()I
    //   6: istore #5
    //   8: aload_2
    //   9: checkcast burp/Ze9f
    //   12: aload_1
    //   13: invokeinterface getEndOffset : ()I
    //   18: invokevirtual Zz : (I)I
    //   21: istore #6
    //   23: invokestatic ZR : ()[Lburp/Zbqc;
    //   26: aload_2
    //   27: iload #5
    //   29: iload #6
    //   31: iload #5
    //   33: isub
    //   34: aload_0
    //   35: getfield Ze : Ljavax/swing/text/Segment;
    //   38: invokeinterface getText : (IILjavax/swing/text/Segment;)V
    //   43: astore #4
    //   45: aload_0
    //   46: getfield Ze : Ljavax/swing/text/Segment;
    //   49: getfield offset : I
    //   52: istore #7
    //   54: iload #7
    //   56: aload_0
    //   57: getfield Ze : Ljavax/swing/text/Segment;
    //   60: getfield count : I
    //   63: iadd
    //   64: istore #6
    //   66: iload #6
    //   68: iload #7
    //   70: if_icmple -> 207
    //   73: aload_0
    //   74: getfield Ze : Ljavax/swing/text/Segment;
    //   77: getfield array : [C
    //   80: iload #7
    //   82: caload
    //   83: bipush #9
    //   85: if_icmpne -> 116
    //   88: goto -> 95
    //   91: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   94: athrow
    //   95: aload_2
    //   96: iload #5
    //   98: iconst_1
    //   99: invokeinterface remove : (II)V
    //   104: aload #4
    //   106: ifnull -> 207
    //   109: goto -> 116
    //   112: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   115: athrow
    //   116: aload_0
    //   117: getfield Ze : Ljavax/swing/text/Segment;
    //   120: getfield array : [C
    //   123: iload #7
    //   125: caload
    //   126: bipush #32
    //   128: if_icmpne -> 207
    //   131: goto -> 138
    //   134: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   137: athrow
    //   138: iinc #7, 1
    //   141: iconst_1
    //   142: istore #8
    //   144: iload #7
    //   146: iload #6
    //   148: if_icmpge -> 197
    //   151: aload_0
    //   152: getfield Ze : Ljavax/swing/text/Segment;
    //   155: getfield array : [C
    //   158: iload #7
    //   160: caload
    //   161: bipush #32
    //   163: if_icmpne -> 197
    //   166: iload #8
    //   168: iload_3
    //   169: if_icmpge -> 197
    //   172: goto -> 179
    //   175: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   178: athrow
    //   179: iinc #7, 1
    //   182: iinc #8, 1
    //   185: aload #4
    //   187: ifnull -> 144
    //   190: goto -> 197
    //   193: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   196: athrow
    //   197: aload_2
    //   198: iload #5
    //   200: iload #8
    //   202: invokeinterface remove : (II)V
    //   207: return
    // Exception table:
    //   from	to	target	type
    //   66	88	91	javax/swing/text/BadLocationException
    //   73	109	112	javax/swing/text/BadLocationException
    //   95	131	134	javax/swing/text/BadLocationException
    //   151	172	175	javax/swing/text/BadLocationException
    //   166	190	193	javax/swing/text/BadLocationException
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: ldc '\\r4Vny '<gN$!1gA#!+mA'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzfo.c : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #87
    //   82: goto -> 112
    //   85: bipush #111
    //   87: goto -> 112
    //   90: bipush #10
    //   92: goto -> 112
    //   95: bipush #39
    //   97: goto -> 112
    //   100: bipush #95
    //   102: goto -> 112
    //   105: bipush #76
    //   107: goto -> 112
    //   110: bipush #74
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */