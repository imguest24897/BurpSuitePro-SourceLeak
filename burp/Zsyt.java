package burp;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;
import javax.swing.text.BadLocationException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zsyt extends AbstractAction {
  private final Action ZY;
  
  final Zl52 ZR;
  
  private static final String a;
  
  private Zsyt(Zl52 paramZl52) {
    Object object = paramZl52.ZI.getInputMap().get(KeyStroke.getKeyStroke('}'));
    this.ZY = (object == null) ? null : paramZl52.ZI.getActionMap().get(object);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    try {
      if (this.ZY != null)
        this.ZY.actionPerformed(paramActionEvent); 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    try {
      int i = this.ZR.Zi4();
      String str1 = this.ZR.ZI.getText(0, this.ZR.ZI.getLineEndOffset(i));
      Zzjg zzjg = this.ZR.ZA.Za(str1);
      List<String> list = str1.lines().toList();
      String str2 = list.getLast();
      String str3 = a;
      try {
        if (str2.matches(str3))
          try {
            if (!zzjg.Zx() && !zzjg.Zg()) {
              int j = Zbpo.ZX(zzjg, this.ZR.ZI.getTabSize());
              int k = this.ZR.ZI.getLineStartOffset(i);
              int m = (int)str2.chars().filter(Zsyt::lambda$actionPerformed$0).count();
              this.ZR.ZI.replaceRange(" ".repeat(j), k, this.ZR.ZiO() - m);
            } 
          } catch (BadLocationException badLocationException) {
            throw a(null);
          }  
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
  }
  
  private static boolean lambda$actionPerformed$0(int paramInt) {
    return (paramInt == 125);
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: ldc 'vxRO1\\t '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsyt.a : Ljava/lang/String;
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
    //   80: bipush #57
    //   82: goto -> 112
    //   85: bipush #125
    //   87: goto -> 112
    //   90: bipush #65
    //   92: goto -> 112
    //   95: bipush #60
    //   97: goto -> 112
    //   100: bipush #118
    //   102: goto -> 112
    //   105: bipush #126
    //   107: goto -> 112
    //   110: bipush #105
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */