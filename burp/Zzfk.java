package burp;

import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Element;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzfk extends Zz85 {
  private static final String c;
  
  public Zzfk() {
    super(c);
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    try {
      if (paramZmgw.isEditable())
        try {
          if (paramZmgw.isEnabled()) {
            try {
              Caret caret = paramZmgw.getCaret();
              int i = caret.getDot();
              Document document = paramZmgw.getDocument();
              Element element1 = document.getDefaultRootElement();
              int j = element1.getElementCount();
              int k = element1.getElementIndex(i);
              if (k == j - 1) {
                UIManager.getLookAndFeel().provideErrorFeedback(paramZmgw);
                return;
              } 
              Element element2 = element1.getElement(k);
              try {
              
              } catch (BadLocationException badLocationException) {
                throw a(null);
              } 
              i = (document instanceof Ze98) ? ((Ze98)document).Zz(element2.getEndOffset()) : (element2.getEndOffset() - 1);
              caret.setDot(i);
              document.remove(i, element2.getEndOffset() - i);
            } catch (BadLocationException badLocationException) {
              Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
            } 
            paramZmgw.requestFocusInWindow();
            return;
          } 
          UIManager.getLookAndFeel().provideErrorFeedback(paramZmgw);
          return;
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    UIManager.getLookAndFeel().provideErrorFeedback(paramZmgw);
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #103
    //   2: ldc 'J\\tt34'@v\s;h{)\r'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzfk.c : Ljava/lang/String;
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
    //   80: bipush #127
    //   82: goto -> 112
    //   85: bipush #58
    //   87: goto -> 112
    //   90: bipush #82
    //   92: goto -> 112
    //   95: bipush #122
    //   97: goto -> 112
    //   100: bipush #25
    //   102: goto -> 112
    //   105: bipush #47
    //   107: goto -> 112
    //   110: bipush #78
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */