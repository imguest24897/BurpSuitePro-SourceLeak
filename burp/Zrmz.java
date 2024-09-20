package burp;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.BadLocationException;

class Zrmz extends AbstractAction {
  final Zgr7 ZE;
  
  private static final String a;
  
  private Zrmz(Zgr7 paramZgr7) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZE : Lburp/Zgr7;
    //   8: getfield Zl : Lburp/Zmgn;
    //   11: invokevirtual getText : ()Ljava/lang/String;
    //   14: astore_3
    //   15: aload_0
    //   16: getfield ZE : Lburp/Zgr7;
    //   19: getfield Zl : Lburp/Zmgn;
    //   22: invokevirtual getCaretPosition : ()I
    //   25: istore #4
    //   27: aload_3
    //   28: invokestatic ZX : (Ljava/lang/String;)I
    //   31: istore #5
    //   33: aload_0
    //   34: getfield ZE : Lburp/Zgr7;
    //   37: iload #4
    //   39: iconst_1
    //   40: isub
    //   41: invokevirtual ZT : (I)C
    //   44: istore #6
    //   46: aload_0
    //   47: getfield ZE : Lburp/Zgr7;
    //   50: iload #4
    //   52: invokevirtual ZT : (I)C
    //   55: istore #7
    //   57: iload #4
    //   59: ifle -> 239
    //   62: iload #4
    //   64: iload #5
    //   66: if_icmple -> 239
    //   69: goto -> 76
    //   72: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   75: athrow
    //   76: aload_3
    //   77: iload #5
    //   79: iload #4
    //   81: invokestatic ZI : (Ljava/lang/String;II)Z
    //   84: ifeq -> 145
    //   87: goto -> 94
    //   90: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   93: athrow
    //   94: iload #6
    //   96: bipush #34
    //   98: if_icmpne -> 239
    //   101: goto -> 108
    //   104: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   107: athrow
    //   108: aload_0
    //   109: getfield ZE : Lburp/Zgr7;
    //   112: iload #4
    //   114: iconst_2
    //   115: isub
    //   116: invokevirtual ZT : (I)C
    //   119: bipush #92
    //   121: if_icmpeq -> 239
    //   124: goto -> 131
    //   127: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   130: athrow
    //   131: iload #7
    //   133: bipush #34
    //   135: if_icmpne -> 239
    //   138: goto -> 145
    //   141: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   144: athrow
    //   145: aload_0
    //   146: getfield ZE : Lburp/Zgr7;
    //   149: getfield Zl : Lburp/Zmgn;
    //   152: invokevirtual getSelectionStart : ()I
    //   155: aload_0
    //   156: getfield ZE : Lburp/Zgr7;
    //   159: getfield Zl : Lburp/Zmgn;
    //   162: invokevirtual getSelectionEnd : ()I
    //   165: if_icmpne -> 239
    //   168: goto -> 175
    //   171: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   174: athrow
    //   175: iload #6
    //   177: iload #7
    //   179: invokestatic ZJ : (CC)Z
    //   182: ifeq -> 239
    //   185: goto -> 192
    //   188: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   191: athrow
    //   192: aload_0
    //   193: iload #6
    //   195: invokevirtual Zt : (C)Z
    //   198: ifne -> 239
    //   201: goto -> 208
    //   204: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   207: athrow
    //   208: aload_0
    //   209: getfield ZE : Lburp/Zgr7;
    //   212: getfield Zl : Lburp/Zmgn;
    //   215: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   218: iload #4
    //   220: iconst_1
    //   221: isub
    //   222: iconst_2
    //   223: invokeinterface remove : (II)V
    //   228: aload_2
    //   229: ifnull -> 286
    //   232: goto -> 239
    //   235: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   238: athrow
    //   239: aload_0
    //   240: getfield ZE : Lburp/Zgr7;
    //   243: getfield Zl : Lburp/Zmgn;
    //   246: invokevirtual getActionMap : ()Ljavax/swing/ActionMap;
    //   249: getstatic burp/Zrmz.a : Ljava/lang/String;
    //   252: invokevirtual get : (Ljava/lang/Object;)Ljavax/swing/Action;
    //   255: astore #8
    //   257: new java/awt/event/ActionEvent
    //   260: dup
    //   261: aload_0
    //   262: getfield ZE : Lburp/Zgr7;
    //   265: getfield Zl : Lburp/Zmgn;
    //   268: sipush #1001
    //   271: aconst_null
    //   272: invokespecial <init> : (Ljava/lang/Object;ILjava/lang/String;)V
    //   275: astore #9
    //   277: aload #8
    //   279: aload #9
    //   281: invokeinterface actionPerformed : (Ljava/awt/event/ActionEvent;)V
    //   286: goto -> 297
    //   289: astore_3
    //   290: aload_3
    //   291: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   294: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   297: return
    // Exception table:
    //   from	to	target	type
    //   4	286	289	javax/swing/text/BadLocationException
    //   57	69	72	javax/swing/text/BadLocationException
    //   62	87	90	javax/swing/text/BadLocationException
    //   76	101	104	javax/swing/text/BadLocationException
    //   94	124	127	javax/swing/text/BadLocationException
    //   108	138	141	javax/swing/text/BadLocationException
    //   131	168	171	javax/swing/text/BadLocationException
    //   145	185	188	javax/swing/text/BadLocationException
    //   175	201	204	javax/swing/text/BadLocationException
    //   192	232	235	javax/swing/text/BadLocationException
  }
  
  private boolean Zt(char paramChar) {
    switch (paramChar) {
      case '{':
      
      case '[':
      
      case '"':
      
    } 
    return true;
  }
  
  private static boolean ZJ(char paramChar1, char paramChar2) {
    return ((paramChar1 == '"' && paramChar2 == '"') || (paramChar1 == '{' && paramChar2 == '}') || (paramChar1 == '[' && paramChar2 == ']'));
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: iconst_1
    //   1: ldc 'H3qTbP\$xIh\\b_'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zrmz.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #45
    //   82: goto -> 112
    //   85: bipush #87
    //   87: goto -> 112
    //   90: bipush #28
    //   92: goto -> 112
    //   95: bipush #102
    //   97: goto -> 112
    //   100: bipush #33
    //   102: goto -> 112
    //   105: bipush #6
    //   107: goto -> 112
    //   110: bipush #124
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrmz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */