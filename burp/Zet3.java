package burp;

import java.awt.Component;
import javax.swing.JTree;

class Zet3 extends Zets {
  private Zl2z ZY;
  
  public void Zu(Zl2z paramZl2z) {
    this.ZY = paramZl2z;
  }
  
  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4) {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: astore #8
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: iload_3
    //   9: iload #4
    //   11: iload #5
    //   13: iload #6
    //   15: iload #7
    //   17: invokespecial getTreeCellRendererComponent : (Ljavax/swing/JTree;Ljava/lang/Object;ZZZIZ)Ljava/awt/Component;
    //   20: pop
    //   21: aload_2
    //   22: instanceof burp/Zez3
    //   25: ifne -> 34
    //   28: aload_0
    //   29: areturn
    //   30: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_2
    //   35: checkcast burp/Zez3
    //   38: astore #9
    //   40: aload_0
    //   41: getfield ZY : Lburp/Zl2z;
    //   44: aload #9
    //   46: iconst_3
    //   47: invokevirtual ZD : (Lburp/Zez3;B)Z
    //   50: ifeq -> 63
    //   53: getstatic burp/Zlkk.COMPARER_MODIFIED : Lburp/Zlkk;
    //   56: astore #10
    //   58: aload #8
    //   60: ifnull -> 126
    //   63: aload_0
    //   64: getfield ZY : Lburp/Zl2z;
    //   67: aload #9
    //   69: iconst_2
    //   70: invokevirtual ZD : (Lburp/Zez3;B)Z
    //   73: ifeq -> 93
    //   76: goto -> 83
    //   79: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: getstatic burp/Zlkk.COMPARER_ADDED : Lburp/Zlkk;
    //   86: astore #10
    //   88: aload #8
    //   90: ifnull -> 126
    //   93: aload_0
    //   94: getfield ZY : Lburp/Zl2z;
    //   97: aload #9
    //   99: iconst_1
    //   100: invokevirtual ZD : (Lburp/Zez3;B)Z
    //   103: ifeq -> 123
    //   106: goto -> 113
    //   109: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: getstatic burp/Zlkk.COMPARER_DELETED : Lburp/Zlkk;
    //   116: astore #10
    //   118: aload #8
    //   120: ifnull -> 126
    //   123: aconst_null
    //   124: astore #10
    //   126: aload #10
    //   128: ifnonnull -> 148
    //   131: aload_0
    //   132: iconst_0
    //   133: invokevirtual setOpaque : (Z)V
    //   136: aload #8
    //   138: ifnull -> 169
    //   141: goto -> 148
    //   144: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: aload_0
    //   149: aload #10
    //   151: invokevirtual ZS : ()Ljava/awt/Color;
    //   154: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   157: aload_0
    //   158: iconst_1
    //   159: invokevirtual setOpaque : (Z)V
    //   162: goto -> 169
    //   165: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: goto -> 182
    //   172: astore #10
    //   174: aload #10
    //   176: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   179: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   182: aload_0
    //   183: areturn
    // Exception table:
    //   from	to	target	type
    //   5	30	30	java/lang/Exception
    //   40	169	172	java/lang/Exception
    //   58	76	79	java/lang/Exception
    //   88	106	109	java/lang/Exception
    //   126	141	144	java/lang/Exception
    //   131	162	165	java/lang/Exception
  }
  
  protected boolean ZE() {
    return false;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zet3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */