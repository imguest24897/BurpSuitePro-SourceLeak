package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;

public class Zzfy extends Zz85 {
  private final boolean Zl;
  
  public Zzfy(String paramString, boolean paramBoolean) {
    super(paramString);
    this.Zl = paramBoolean;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   4: astore #4
    //   6: aload_2
    //   7: invokevirtual getCaretPosition : ()I
    //   10: istore #5
    //   12: invokestatic ZT : ()I
    //   15: iconst_0
    //   16: istore #6
    //   18: istore_3
    //   19: aload_2
    //   20: iload #5
    //   22: invokestatic getParagraphElement : (Ljavax/swing/text/JTextComponent;I)Ljavax/swing/text/Element;
    //   25: astore #7
    //   27: aload_0
    //   28: aload_2
    //   29: iload #5
    //   31: invokevirtual Zt : (Lburp/Zmgw;I)I
    //   34: istore #5
    //   36: iload #5
    //   38: aload #7
    //   40: invokeinterface getStartOffset : ()I
    //   45: if_icmpge -> 92
    //   48: aload_2
    //   49: iload #5
    //   51: invokestatic getParagraphElement : (Ljavax/swing/text/JTextComponent;I)Ljavax/swing/text/Element;
    //   54: invokeinterface getEndOffset : ()I
    //   59: istore #8
    //   61: aload #4
    //   63: instanceof burp/Ze98
    //   66: ifeq -> 86
    //   69: aload #4
    //   71: checkcast burp/Ze98
    //   74: iload #8
    //   76: invokevirtual Zz : (I)I
    //   79: goto -> 90
    //   82: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   85: athrow
    //   86: iload #8
    //   88: iconst_1
    //   89: isub
    //   90: istore #5
    //   92: goto -> 120
    //   95: astore #7
    //   97: aload #7
    //   99: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   102: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   105: iload #5
    //   107: ifeq -> 117
    //   110: iconst_0
    //   111: istore #5
    //   113: iload_3
    //   114: ifne -> 120
    //   117: iconst_1
    //   118: istore #6
    //   120: iload #6
    //   122: ifne -> 173
    //   125: aload_0
    //   126: getfield Zl : Z
    //   129: ifeq -> 156
    //   132: goto -> 139
    //   135: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   138: athrow
    //   139: aload_2
    //   140: iload #5
    //   142: invokevirtual moveCaretPosition : (I)V
    //   145: iload_3
    //   146: ifne -> 187
    //   149: goto -> 156
    //   152: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   155: athrow
    //   156: aload_2
    //   157: iload #5
    //   159: invokevirtual setCaretPosition : (I)V
    //   162: iload_3
    //   163: ifne -> 187
    //   166: goto -> 173
    //   169: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   172: athrow
    //   173: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   176: aload_2
    //   177: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   180: goto -> 187
    //   183: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   186: athrow
    //   187: return
    // Exception table:
    //   from	to	target	type
    //   19	92	95	javax/swing/text/BadLocationException
    //   61	82	82	javax/swing/text/BadLocationException
    //   120	132	135	javax/swing/text/BadLocationException
    //   125	149	152	javax/swing/text/BadLocationException
    //   139	166	169	javax/swing/text/BadLocationException
    //   156	180	183	javax/swing/text/BadLocationException
  }
  
  protected int Zt(Zmgw paramZmgw, int paramInt) throws BadLocationException {
    return Utilities.getPreviousWord(paramZmgw, paramInt);
  }
  
  private static BadLocationException b(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */