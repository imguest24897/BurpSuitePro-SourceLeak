package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.Element;

public class Zzfl extends Zz85 {
  private final boolean ZH;
  
  private static final String c;
  
  public Zzfl(boolean paramBoolean) {
    super(c);
    this.ZH = paramBoolean;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    int i = paramZmgw.getCaretPosition();
    int j = Zt((Zmgn)paramZmgw, i);
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    if (j < i) {
      if (this.ZH) {
        paramZmgw.moveCaretPosition(j);
        if (arrayOfZbqc != null) {
          paramZmgw.setCaretPosition(j);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    paramZmgw.setCaretPosition(j);
  }
  
  private int Zt(Zmgn paramZmgn, int paramInt) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    Ze9f ze9f = (Ze9f)paramZmgn.getDocument();
    if (paramInt == 0)
      return paramInt; 
    int i = Z_(paramInt, ze9f);
    Element element = ze9f.getDefaultRootElement();
    int j = i - 1;
    while (j >= 0) {
      Element element1 = element.getElement(j);
      if (Zn(element1, ze9f) && Zj(j, paramZmgn))
        return element1.getEndOffset(); 
      j--;
      if (arrayOfZbqc != null)
        break; 
    } 
    return 0;
  }
  
  private int Z_(int paramInt, Ze9f paramZe9f) {
    Element element = paramZe9f.getDefaultRootElement();
    int i = element.getElementIndex(paramInt);
    return (i > 0 && paramInt == element.getElement(i).getStartOffset() && Zn(element.getElement(i - 1), paramZe9f)) ? (i - 1) : i;
  }
  
  private boolean Zn(Element paramElement, Ze9f paramZe9f) {
    return (paramZe9f.Zz(paramElement.getEndOffset()) == paramElement.getStartOffset());
  }
  
  private boolean Zj(int paramInt, Zmgn paramZmgn) {
    Zxam zxam = paramZmgn.Zm();
    return (!paramZmgn.ZY() || (!zxam.ZN(paramInt) && !zxam.ZN(paramInt + 1)));
  }
  
  static {
    // Byte code:
    //   0: bipush #124
    //   2: ldc '@'G0%2wC/l'`c&_4{}'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzfl.c : Ljava/lang/String;
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
    //   80: bipush #110
    //   82: goto -> 112
    //   85: bipush #8
    //   87: goto -> 112
    //   90: bipush #111
    //   92: goto -> 112
    //   95: bipush #50
    //   97: goto -> 112
    //   100: bipush #98
    //   102: goto -> 112
    //   105: bipush #9
    //   107: goto -> 112
    //   110: bipush #60
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */