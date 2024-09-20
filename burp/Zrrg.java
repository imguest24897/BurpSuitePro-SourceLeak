package burp;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class Zrrg extends AbstractAction {
  final Zgr7 Zi;
  
  private static final String a;
  
  private Zrrg(Zgr7 paramZgr7) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Zgr7;
    //   4: getfield Zl : Lburp/Zmgn;
    //   7: invokevirtual getText : ()Ljava/lang/String;
    //   10: invokestatic ZX : (Ljava/lang/String;)I
    //   13: istore_3
    //   14: invokestatic ZR : ()[Lburp/Zbqc;
    //   17: aload_0
    //   18: getfield Zi : Lburp/Zgr7;
    //   21: getfield Zl : Lburp/Zmgn;
    //   24: invokevirtual getSelectionStart : ()I
    //   27: istore #4
    //   29: astore_2
    //   30: aload_0
    //   31: getfield Zi : Lburp/Zgr7;
    //   34: getfield Zl : Lburp/Zmgn;
    //   37: invokevirtual getSelectionEnd : ()I
    //   40: istore #5
    //   42: aload_0
    //   43: getfield Zi : Lburp/Zgr7;
    //   46: iload #5
    //   48: invokevirtual ZT : (I)C
    //   51: istore #6
    //   53: aload_0
    //   54: getfield Zi : Lburp/Zgr7;
    //   57: getfield Zl : Lburp/Zmgn;
    //   60: invokevirtual getText : ()Ljava/lang/String;
    //   63: iload_3
    //   64: iload #4
    //   66: invokestatic ZI : (Ljava/lang/String;II)Z
    //   69: istore #7
    //   71: iload_3
    //   72: iload #4
    //   74: invokestatic Zg : (II)Z
    //   77: istore #8
    //   79: iload #8
    //   81: ifne -> 106
    //   84: iload #7
    //   86: ifeq -> 106
    //   89: iload #6
    //   91: bipush #34
    //   93: if_icmpne -> 106
    //   96: aload_0
    //   97: getfield Zi : Lburp/Zgr7;
    //   100: getfield ZQ : Z
    //   103: ifeq -> 110
    //   106: iconst_1
    //   107: goto -> 111
    //   110: iconst_0
    //   111: istore #9
    //   113: iload #8
    //   115: ifne -> 161
    //   118: iload #6
    //   120: ifeq -> 152
    //   123: iload #6
    //   125: invokestatic isWhitespace : (C)Z
    //   128: ifne -> 152
    //   131: iload #6
    //   133: bipush #44
    //   135: if_icmpeq -> 152
    //   138: iload #6
    //   140: bipush #93
    //   142: if_icmpeq -> 152
    //   145: iload #6
    //   147: bipush #125
    //   149: if_icmpne -> 161
    //   152: iload #7
    //   154: ifne -> 161
    //   157: iconst_1
    //   158: goto -> 162
    //   161: iconst_0
    //   162: istore #10
    //   164: iload #10
    //   166: ifeq -> 201
    //   169: aload_0
    //   170: getfield Zi : Lburp/Zgr7;
    //   173: getfield Zl : Lburp/Zmgn;
    //   176: getstatic burp/Zrrg.a : Ljava/lang/String;
    //   179: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   182: aload_0
    //   183: getfield Zi : Lburp/Zgr7;
    //   186: iconst_0
    //   187: putfield ZQ : Z
    //   190: aload_2
    //   191: ifnull -> 218
    //   194: iconst_2
    //   195: anewarray burp/Zbqc
    //   198: invokestatic Zr : ([Lburp/Zbqc;)V
    //   201: iload #9
    //   203: ifeq -> 218
    //   206: aload_0
    //   207: getfield Zi : Lburp/Zgr7;
    //   210: getfield Zl : Lburp/Zmgn;
    //   213: ldc '"'
    //   215: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   218: aload_0
    //   219: getfield Zi : Lburp/Zgr7;
    //   222: getfield Zl : Lburp/Zmgn;
    //   225: iload #4
    //   227: iconst_1
    //   228: iadd
    //   229: getstatic javax/swing/text/Position$Bias.Backward : Ljavax/swing/text/Position$Bias;
    //   232: invokevirtual Zc : (ILjavax/swing/text/Position$Bias;)V
    //   235: return
  }
  
  static {
    // Byte code:
    //   0: bipush #121
    //   2: ldc 'k'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrrg.a : Ljava/lang/String;
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
    //   80: bipush #48
    //   82: goto -> 112
    //   85: bipush #64
    //   87: goto -> 112
    //   90: bipush #71
    //   92: goto -> 112
    //   95: bipush #14
    //   97: goto -> 112
    //   100: bipush #80
    //   102: goto -> 112
    //   105: bipush #115
    //   107: goto -> 112
    //   110: bipush #108
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrrg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */