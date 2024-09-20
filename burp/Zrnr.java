package burp;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;
import javax.swing.text.BadLocationException;

class Zrnr extends AbstractAction {
  private final Action Zk;
  
  final Zl52 Zz;
  
  private static final String a;
  
  private Zrnr(Zl52 paramZl52) {
    Object object = paramZl52.ZI.getInputMap().get(KeyStroke.getKeyStroke(10, 0));
    this.Zk = paramZl52.ZI.getActionMap().get(object);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zk : Ljavax/swing/Action;
    //   4: aload_1
    //   5: invokeinterface actionPerformed : (Ljava/awt/event/ActionEvent;)V
    //   10: aload_0
    //   11: getfield Zz : Lburp/Zl52;
    //   14: getfield ZI : Lburp/Zmgn;
    //   17: aload_0
    //   18: getfield Zz : Lburp/Zl52;
    //   21: invokevirtual ZiO : ()I
    //   24: invokestatic getRowStart : (Ljavax/swing/text/JTextComponent;I)I
    //   27: istore_2
    //   28: aload_0
    //   29: getfield Zz : Lburp/Zl52;
    //   32: getfield ZI : Lburp/Zmgn;
    //   35: aload_0
    //   36: getfield Zz : Lburp/Zl52;
    //   39: invokevirtual ZiO : ()I
    //   42: invokestatic getRowEnd : (Ljavax/swing/text/JTextComponent;I)I
    //   45: istore_3
    //   46: iload_2
    //   47: iconst_1
    //   48: isub
    //   49: istore #4
    //   51: iload_2
    //   52: ifeq -> 74
    //   55: aload_0
    //   56: getfield Zz : Lburp/Zl52;
    //   59: getfield ZI : Lburp/Zmgn;
    //   62: iload #4
    //   64: invokestatic getRowStart : (Ljavax/swing/text/JTextComponent;I)I
    //   67: goto -> 75
    //   70: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   73: athrow
    //   74: iconst_m1
    //   75: istore #5
    //   77: aload_0
    //   78: getfield Zz : Lburp/Zl52;
    //   81: getfield ZI : Lburp/Zmgn;
    //   84: invokevirtual getText : ()Ljava/lang/String;
    //   87: iload_2
    //   88: iload_3
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: astore #6
    //   94: iload_2
    //   95: ifeq -> 122
    //   98: aload_0
    //   99: getfield Zz : Lburp/Zl52;
    //   102: getfield ZI : Lburp/Zmgn;
    //   105: invokevirtual getText : ()Ljava/lang/String;
    //   108: iload #5
    //   110: iload #4
    //   112: invokevirtual substring : (II)Ljava/lang/String;
    //   115: goto -> 124
    //   118: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   121: athrow
    //   122: ldc ''
    //   124: astore #7
    //   126: aload_0
    //   127: aload #6
    //   129: iload_2
    //   130: iload_3
    //   131: invokevirtual Zs : (Ljava/lang/String;II)V
    //   134: aload #7
    //   136: invokevirtual trim : ()Ljava/lang/String;
    //   139: invokevirtual isEmpty : ()Z
    //   142: ifeq -> 172
    //   145: aload #6
    //   147: invokevirtual trim : ()Ljava/lang/String;
    //   150: invokevirtual isEmpty : ()Z
    //   153: ifne -> 172
    //   156: goto -> 163
    //   159: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   162: athrow
    //   163: aload #7
    //   165: goto -> 186
    //   168: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   171: athrow
    //   172: aload_0
    //   173: aload_0
    //   174: getfield Zz : Lburp/Zl52;
    //   177: getfield ZI : Lburp/Zmgn;
    //   180: invokevirtual getTabSize : ()I
    //   183: invokevirtual Zu : (I)Ljava/lang/String;
    //   186: astore #8
    //   188: aload_0
    //   189: getfield Zz : Lburp/Zl52;
    //   192: getfield ZI : Lburp/Zmgn;
    //   195: aload #8
    //   197: aload_0
    //   198: getfield Zz : Lburp/Zl52;
    //   201: invokevirtual ZiO : ()I
    //   204: invokevirtual insert : (Ljava/lang/String;I)V
    //   207: aload_0
    //   208: aload #7
    //   210: iload_2
    //   211: aload #6
    //   213: iload #4
    //   215: invokevirtual ZH : (Ljava/lang/String;ILjava/lang/String;I)V
    //   218: goto -> 229
    //   221: astore_2
    //   222: aload_2
    //   223: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   226: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   229: return
    // Exception table:
    //   from	to	target	type
    //   10	218	221	javax/swing/text/BadLocationException
    //   51	70	70	javax/swing/text/BadLocationException
    //   94	118	118	javax/swing/text/BadLocationException
    //   126	156	159	javax/swing/text/BadLocationException
    //   145	168	168	javax/swing/text/BadLocationException
  }
  
  private String Zu(int paramInt) throws BadLocationException {
    Zzjg zzjg = this.Zz.ZA.Za(this.Zz.ZI.getText(0, this.Zz.ZiO()));
    int i = Zbpo.ZI(zzjg, paramInt);
    int j = Math.max(0, i);
    return " ".repeat(j);
  }
  
  private void Zs(String paramString, int paramInt1, int paramInt2) {
    if (paramString.trim().isEmpty())
      this.Zz.ZI.replaceRange("", paramInt1, paramInt2); 
  }
  
  private void ZH(String paramString1, int paramInt1, String paramString2, int paramInt2) {
    if (paramString1.trim().isEmpty() && paramInt1 != 0) {
      String str = paramString2.split(a, 2)[0];
      this.Zz.ZI.insert(str, paramInt2);
    } 
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: ldc '#7'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrnr.a : Ljava/lang/String;
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
    //   80: bipush #121
    //   82: goto -> 112
    //   85: bipush #98
    //   87: goto -> 112
    //   90: bipush #6
    //   92: goto -> 112
    //   95: bipush #85
    //   97: goto -> 112
    //   100: bipush #81
    //   102: goto -> 112
    //   105: bipush #85
    //   107: goto -> 112
    //   110: bipush #18
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrnr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */