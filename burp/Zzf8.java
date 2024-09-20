package burp;

import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Segment;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzf8 extends Zz85 {
  private final Segment Zr = new Segment();
  
  private static final String c;
  
  public Zzf8() {
    super(c);
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    try {
      if (paramZmgw.isEditable())
        try {
          if (paramZmgw.isEnabled()) {
            try {
              int i = paramZmgw.getSelectionEnd();
              int j = Zj(paramZmgw, i);
              try {
                if (j > i)
                  paramZmgw.getDocument().remove(i, j - i); 
              } catch (BadLocationException badLocationException) {
                throw a(null);
              } 
            } catch (BadLocationException badLocationException) {
              Zah.Zl(badLocationException, Zk_.UNEXPECTED);
            } 
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
  
  private int Zj(Zmgw paramZmgw, int paramInt) throws BadLocationException {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    Ze9f ze9f = (Ze9f)paramZmgw.getDocument();
    try {
      if (paramInt == ze9f.getLength())
        return paramInt; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int i = paramZmgw.getLineOfOffset(paramInt);
    int j = paramZmgw.getLineEndOffset(i);
    try {
    
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int k = (i < paramZmgw.getLineCount() - 1) ? ze9f.Zz(j) : j;
    try {
      if (paramInt == k)
        try {
          if (k < j)
            return ze9f.Za(k); 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    ze9f.getText(paramInt, k - paramInt, this.Zr);
    char c = this.Zr.first();
    if (Character.isWhitespace(c))
      do {
        c = this.Zr.next();
      } while (Character.isWhitespace(c)); 
    boolean bool = false;
    if (ze9f.Zq(bool, c)) {
      while (true) {
        c = this.Zr.next();
        if (!ze9f.Zq(bool, c))
          break; 
      } 
    } else {
      while (!Character.isWhitespace(c)) {
        try {
          if (!ze9f.Zq(bool, c) && c != Character.MAX_VALUE) {
            c = this.Zr.next();
            if (arrayOfZbqc != null)
              break; 
          } 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
      } 
    } 
    try {
      if (c == Character.MAX_VALUE)
        return k; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    paramInt += this.Zr.getIndex() - this.Zr.getBeginIndex();
    return paramInt;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: ldc '\!i,oQ*kMLNL2YZfjW2gF'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzf8.c : Ljava/lang/String;
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
    //   80: bipush #23
    //   82: goto -> 112
    //   85: bipush #108
    //   87: goto -> 112
    //   90: bipush #49
    //   92: goto -> 112
    //   95: bipush #27
    //   97: goto -> 112
    //   100: bipush #50
    //   102: goto -> 112
    //   105: bipush #45
    //   107: goto -> 112
    //   110: bipush #95
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzf8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */