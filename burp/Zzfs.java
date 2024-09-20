package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;

public class Zzfs extends Zz85 {
  private static final String c;
  
  public Zzfs() {
    super(c, null, null, null, null);
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: istore_3
    //   4: iconst_1
    //   5: istore #4
    //   7: aload_2
    //   8: ifnull -> 220
    //   11: aload_2
    //   12: invokevirtual isEditable : ()Z
    //   15: ifeq -> 220
    //   18: goto -> 25
    //   21: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   24: athrow
    //   25: aload_2
    //   26: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   29: astore #5
    //   31: aload_2
    //   32: invokevirtual getCaret : ()Ljavax/swing/text/Caret;
    //   35: astore #6
    //   37: aload #6
    //   39: invokeinterface getDot : ()I
    //   44: istore #7
    //   46: aload #6
    //   48: invokeinterface getMark : ()I
    //   53: istore #8
    //   55: iload #7
    //   57: iload #8
    //   59: if_icmpeq -> 91
    //   62: aload #5
    //   64: iload #7
    //   66: iload #8
    //   68: invokestatic min : (II)I
    //   71: iload #7
    //   73: iload #8
    //   75: isub
    //   76: invokestatic abs : (I)I
    //   79: invokeinterface remove : (II)V
    //   84: iconst_0
    //   85: istore #4
    //   87: iload_3
    //   88: ifeq -> 207
    //   91: iload #7
    //   93: aload #5
    //   95: invokeinterface getLength : ()I
    //   100: if_icmpge -> 207
    //   103: goto -> 110
    //   106: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   109: athrow
    //   110: iconst_1
    //   111: istore #9
    //   113: iload #7
    //   115: aload #5
    //   117: invokeinterface getLength : ()I
    //   122: iconst_1
    //   123: isub
    //   124: if_icmpge -> 193
    //   127: aload_2
    //   128: invokevirtual ZE : ()Z
    //   131: ifne -> 193
    //   134: goto -> 141
    //   137: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   140: athrow
    //   141: aload #5
    //   143: iload #7
    //   145: iconst_2
    //   146: invokeinterface getText : (II)Ljava/lang/String;
    //   151: astore #10
    //   153: aload #10
    //   155: iconst_0
    //   156: invokevirtual charAt : (I)C
    //   159: istore #11
    //   161: aload #10
    //   163: iconst_1
    //   164: invokevirtual charAt : (I)C
    //   167: istore #12
    //   169: iload #11
    //   171: bipush #13
    //   173: if_icmpne -> 193
    //   176: iload #12
    //   178: bipush #10
    //   180: if_icmpne -> 193
    //   183: goto -> 190
    //   186: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   189: athrow
    //   190: iconst_2
    //   191: istore #9
    //   193: aload #5
    //   195: iload #7
    //   197: iload #9
    //   199: invokeinterface remove : (II)V
    //   204: iconst_0
    //   205: istore #4
    //   207: goto -> 220
    //   210: astore #5
    //   212: aload #5
    //   214: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   217: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   220: iload #4
    //   222: ifeq -> 239
    //   225: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   228: aload_2
    //   229: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   232: goto -> 239
    //   235: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   238: athrow
    //   239: aload_2
    //   240: ifnull -> 255
    //   243: aload_2
    //   244: invokevirtual requestFocusInWindow : ()Z
    //   247: pop
    //   248: goto -> 255
    //   251: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   254: athrow
    //   255: return
    // Exception table:
    //   from	to	target	type
    //   7	18	21	javax/swing/text/BadLocationException
    //   25	207	210	javax/swing/text/BadLocationException
    //   87	103	106	javax/swing/text/BadLocationException
    //   113	134	137	javax/swing/text/BadLocationException
    //   169	183	186	javax/swing/text/BadLocationException
    //   220	232	235	javax/swing/text/BadLocationException
    //   239	248	251	javax/swing/text/BadLocationException
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: ldc '\A:7QB<VA.&'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzfs.c : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
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
    //   80: bipush #45
    //   82: goto -> 111
    //   85: bipush #49
    //   87: goto -> 111
    //   90: bipush #67
    //   92: goto -> 111
    //   95: bipush #71
    //   97: goto -> 111
    //   100: bipush #48
    //   102: goto -> 111
    //   105: bipush #50
    //   107: goto -> 111
    //   110: iconst_4
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */