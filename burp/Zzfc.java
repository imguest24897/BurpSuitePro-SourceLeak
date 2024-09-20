package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class Zzfc extends Zz85 {
  private final int ZU;
  
  public Zzfc(String paramString, int paramInt) {
    super(paramString);
    this.ZU = paramInt;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: istore_3
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
    //   38: invokevirtual getCaretPosition : ()I
    //   41: istore #4
    //   43: aload_2
    //   44: invokevirtual getCaret : ()Ljavax/swing/text/Caret;
    //   47: invokeinterface getMark : ()I
    //   52: istore #5
    //   54: aload_2
    //   55: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   58: astore #6
    //   60: aload #6
    //   62: invokeinterface getDefaultRootElement : ()Ljavax/swing/text/Element;
    //   67: astore #7
    //   69: aload #7
    //   71: iload #4
    //   73: iload #5
    //   75: invokestatic min : (II)I
    //   78: invokeinterface getElementIndex : (I)I
    //   83: istore #8
    //   85: aload #7
    //   87: iload #4
    //   89: iload #5
    //   91: invokestatic max : (II)I
    //   94: invokeinterface getElementIndex : (I)I
    //   99: istore #9
    //   101: iload #9
    //   103: iload #8
    //   105: isub
    //   106: iconst_1
    //   107: iadd
    //   108: istore #10
    //   110: iload #10
    //   112: iconst_1
    //   113: if_icmple -> 171
    //   116: aload #7
    //   118: iload #9
    //   120: invokeinterface getElement : (I)Ljavax/swing/text/Element;
    //   125: astore #11
    //   127: iload #4
    //   129: aload #11
    //   131: invokeinterface getStartOffset : ()I
    //   136: if_icmpeq -> 158
    //   139: iload #5
    //   141: aload #11
    //   143: invokeinterface getStartOffset : ()I
    //   148: if_icmpne -> 171
    //   151: goto -> 158
    //   154: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   157: athrow
    //   158: iinc #10, -1
    //   161: iinc #9, -1
    //   164: goto -> 171
    //   167: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   170: athrow
    //   171: aload_0
    //   172: getfield ZU : I
    //   175: iconst_m1
    //   176: if_icmpne -> 211
    //   179: iload #8
    //   181: ifle -> 211
    //   184: goto -> 191
    //   187: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   190: athrow
    //   191: aload_0
    //   192: aload_2
    //   193: iload #8
    //   195: iload #10
    //   197: invokevirtual Za : (Lburp/Zmgw;II)V
    //   200: iload_3
    //   201: ifeq -> 281
    //   204: goto -> 211
    //   207: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   210: athrow
    //   211: aload_0
    //   212: getfield ZU : I
    //   215: iconst_1
    //   216: if_icmpne -> 267
    //   219: goto -> 226
    //   222: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   225: athrow
    //   226: iload #9
    //   228: aload #7
    //   230: invokeinterface getElementCount : ()I
    //   235: iconst_1
    //   236: isub
    //   237: if_icmpge -> 267
    //   240: goto -> 247
    //   243: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   246: athrow
    //   247: aload_0
    //   248: aload_2
    //   249: iload #8
    //   251: iload #10
    //   253: invokevirtual ZJ : (Lburp/Zmgw;II)V
    //   256: iload_3
    //   257: ifeq -> 281
    //   260: goto -> 267
    //   263: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   266: athrow
    //   267: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   270: aload_2
    //   271: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   274: goto -> 281
    //   277: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   280: athrow
    //   281: goto -> 294
    //   284: astore #4
    //   286: aload #4
    //   288: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   291: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   294: return
    // Exception table:
    //   from	to	target	type
    //   4	18	21	javax/swing/text/BadLocationException
    //   11	33	33	javax/swing/text/BadLocationException
    //   37	281	284	javax/swing/text/BadLocationException
    //   127	151	154	javax/swing/text/BadLocationException
    //   139	164	167	javax/swing/text/BadLocationException
    //   171	184	187	javax/swing/text/BadLocationException
    //   179	204	207	javax/swing/text/BadLocationException
    //   191	219	222	javax/swing/text/BadLocationException
    //   211	240	243	javax/swing/text/BadLocationException
    //   226	260	263	javax/swing/text/BadLocationException
    //   247	274	277	javax/swing/text/BadLocationException
  }
  
  private void ZJ(Zmgw paramZmgw, int paramInt1, int paramInt2) throws BadLocationException {
    Document document = paramZmgw.getDocument();
    Element element1 = document.getDefaultRootElement();
    Element element2 = element1.getElement(paramInt1);
    int i = element2.getStartOffset();
    int j = paramInt1 + paramInt2 - 1;
    element2 = element1.getElement(j);
    int k = element2.getEndOffset();
    paramZmgw.ZJ();
    try {
      String str = document.getText(i, k - i);
      int m = Math.min(j + 1, paramZmgw.getLineCount() - 1);
      boolean bool = false;
      if (m == paramZmgw.getLineCount() - 1) {
        str = ZH(paramZmgw, document, k, str);
        bool = true;
      } 
      document.remove(i, k - i);
      int n = paramZmgw.getLineEndOffset(m - paramInt2);
      try {
        document.insertString(n, str, null);
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
      ZT(paramZmgw, document, n, str, !bool);
    } finally {
      paramZmgw.ZA();
    } 
  }
  
  private String ZH(Zmgw paramZmgw, Document paramDocument, int paramInt, String paramString) throws BadLocationException {
    String str = "\n";
    if (paramDocument instanceof Ze98) {
      int i = ((Ze98)paramDocument).Zz(paramInt);
      str = paramDocument.getText(i, paramInt - i);
    } 
    paramZmgw.append(str);
    return paramString.substring(0, paramString.length() - str.length());
  }
  
  private void Za(Zmgw paramZmgw, int paramInt1, int paramInt2) throws BadLocationException {
    Document document = paramZmgw.getDocument();
    Element element1 = document.getDefaultRootElement();
    Element element2 = element1.getElement(paramInt1);
    int i = element2.getStartOffset();
    int j = paramInt1 + paramInt2 - 1;
    element2 = element1.getElement(j);
    int k = element2.getEndOffset();
    int m = paramZmgw.getLineCount();
    boolean bool = false;
    if (j == m - 1) {
      bool = true;
      k--;
    } 
    int n = Math.max(paramInt1 - 1, 0);
    paramZmgw.ZJ();
    try {
      String str1 = document.getText(i, k - i);
      String str2 = "\n";
      try {
        if (bool) {
          if (document instanceof Ze98) {
            int i2 = element1.getElement(n).getEndOffset();
            int i3 = ((Ze98)document).Zz(i2);
            if (i3 < i2)
              str2 = document.getText(i3, i2 - i3); 
          } 
          str1 = str1 + str1;
        } 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
      document.remove(i, k - i);
      int i1 = paramZmgw.getLineStartOffset(n);
      try {
        document.insertString(i1, str1, null);
        ZT(paramZmgw, document, i1, str1, true);
        if (bool)
          document.remove(document.getLength() - str2.length(), str2.length()); 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } finally {
      paramZmgw.ZA();
    } 
  }
  
  private void ZT(Zmgw paramZmgw, Document paramDocument, int paramInt, String paramString, boolean paramBoolean) {
    paramZmgw.setSelectionStart(paramInt);
    int i = paramInt + paramString.length();
    if (paramBoolean)
      i = (paramDocument instanceof Ze98) ? ((Ze98)paramDocument).Zz(i) : (i - 1); 
    paramZmgw.setSelectionEnd(i);
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */