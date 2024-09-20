package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;

public class Zzfr extends Zz85 {
  private final boolean ZP;
  
  public Zzfr(String paramString, boolean paramBoolean) {
    super(paramString);
    this.ZP = paramBoolean;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   4: astore #4
    //   6: invokestatic ZT : ()I
    //   9: aload_2
    //   10: invokevirtual getCaretPosition : ()I
    //   13: istore #5
    //   15: istore_3
    //   16: iload #5
    //   18: istore #6
    //   20: aload_2
    //   21: iload #5
    //   23: invokestatic getParagraphElement : (Ljavax/swing/text/JTextComponent;I)Ljavax/swing/text/Element;
    //   26: astore #7
    //   28: aload #7
    //   30: invokeinterface getEndOffset : ()I
    //   35: istore #8
    //   37: aload #4
    //   39: instanceof burp/Ze98
    //   42: ifeq -> 62
    //   45: aload #4
    //   47: checkcast burp/Ze98
    //   50: iload #8
    //   52: invokevirtual Zz : (I)I
    //   55: goto -> 66
    //   58: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   61: athrow
    //   62: iload #8
    //   64: iconst_1
    //   65: isub
    //   66: istore #8
    //   68: aload_0
    //   69: aload_2
    //   70: iload #5
    //   72: invokevirtual ZN : (Lburp/Zmgw;I)I
    //   75: istore #5
    //   77: iload #5
    //   79: aload #7
    //   81: invokeinterface getEndOffset : ()I
    //   86: if_icmplt -> 107
    //   89: iload #6
    //   91: iload #8
    //   93: if_icmpeq -> 107
    //   96: goto -> 103
    //   99: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   102: athrow
    //   103: iload #8
    //   105: istore #5
    //   107: goto -> 162
    //   110: astore #9
    //   112: aload #9
    //   114: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   117: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   120: aload #4
    //   122: invokeinterface getLength : ()I
    //   127: istore #10
    //   129: iload #5
    //   131: iload #10
    //   133: if_icmpeq -> 162
    //   136: iload #6
    //   138: iload #8
    //   140: if_icmpeq -> 158
    //   143: goto -> 150
    //   146: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   149: athrow
    //   150: iload #8
    //   152: istore #5
    //   154: iload_3
    //   155: ifne -> 162
    //   158: iload #10
    //   160: istore #5
    //   162: aload_0
    //   163: getfield ZP : Z
    //   166: ifeq -> 186
    //   169: aload_2
    //   170: iload #5
    //   172: invokevirtual moveCaretPosition : (I)V
    //   175: iload_3
    //   176: ifne -> 199
    //   179: goto -> 186
    //   182: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   185: athrow
    //   186: aload_2
    //   187: iload #5
    //   189: invokevirtual setCaretPosition : (I)V
    //   192: goto -> 199
    //   195: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   198: athrow
    //   199: return
    // Exception table:
    //   from	to	target	type
    //   37	58	58	javax/swing/text/BadLocationException
    //   68	107	110	javax/swing/text/BadLocationException
    //   77	96	99	javax/swing/text/BadLocationException
    //   129	143	146	javax/swing/text/BadLocationException
    //   162	179	182	javax/swing/text/BadLocationException
    //   169	192	195	javax/swing/text/BadLocationException
  }
  
  protected int ZN(Zmgw paramZmgw, int paramInt) throws BadLocationException {
    return Utilities.getNextWord(paramZmgw, paramInt);
  }
  
  private static BadLocationException b(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */