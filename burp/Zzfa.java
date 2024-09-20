package burp;

import java.awt.event.ActionEvent;

public class Zzfa extends Zz85 {
  private static final String c;
  
  public Zzfa() {
    super(c);
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: istore_3
    //   4: aload_2
    //   5: invokevirtual isEditable : ()Z
    //   8: ifeq -> 18
    //   11: aload_2
    //   12: invokevirtual isEnabled : ()Z
    //   15: ifne -> 26
    //   18: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   21: aload_2
    //   22: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   25: return
    //   26: aload_2
    //   27: invokevirtual getSelectedText : ()Ljava/lang/String;
    //   30: astore #4
    //   32: aload #4
    //   34: ifnull -> 134
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: aload #4
    //   43: invokespecial <init> : (Ljava/lang/String;)V
    //   46: astore #5
    //   48: aload #5
    //   50: invokevirtual length : ()I
    //   53: istore #6
    //   55: iconst_0
    //   56: istore #7
    //   58: iload #7
    //   60: iload #6
    //   62: if_icmpge -> 125
    //   65: aload #5
    //   67: iload #7
    //   69: invokevirtual charAt : (I)C
    //   72: istore #8
    //   74: iload #8
    //   76: invokestatic isUpperCase : (C)Z
    //   79: ifeq -> 98
    //   82: aload #5
    //   84: iload #7
    //   86: iload #8
    //   88: invokestatic toLowerCase : (C)C
    //   91: invokevirtual setCharAt : (IC)V
    //   94: iload_3
    //   95: ifeq -> 118
    //   98: iload #8
    //   100: invokestatic isLowerCase : (C)Z
    //   103: ifeq -> 118
    //   106: aload #5
    //   108: iload #7
    //   110: iload #8
    //   112: invokestatic toUpperCase : (C)C
    //   115: invokevirtual setCharAt : (IC)V
    //   118: iinc #7, 1
    //   121: iload_3
    //   122: ifeq -> 58
    //   125: aload_2
    //   126: aload #5
    //   128: invokevirtual toString : ()Ljava/lang/String;
    //   131: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   134: aload_2
    //   135: invokevirtual requestFocusInWindow : ()Z
    //   138: pop
    //   139: return
  }
  
  static {
    // Byte code:
    //   0: bipush #49
    //   2: ldc 'i)iyU^>1dFz>.?y'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzfa.c : Ljava/lang/String;
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
    //   80: bipush #10
    //   82: goto -> 112
    //   85: bipush #76
    //   87: goto -> 112
    //   90: bipush #123
    //   92: goto -> 112
    //   95: bipush #118
    //   97: goto -> 112
    //   100: bipush #97
    //   102: goto -> 112
    //   105: bipush #38
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */