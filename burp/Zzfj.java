package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.Element;

public class Zzfj extends Zz85 {
  private final boolean ZO;
  
  private static final String c;
  
  public Zzfj(boolean paramBoolean) {
    super(c);
    this.ZO = paramBoolean;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    int i = paramZmgw.getCaretPosition();
    int j = ZI((Zmgn)paramZmgw, i);
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    if (j > i) {
      if (this.ZO) {
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
  
  private int ZI(Zmgn paramZmgn, int paramInt) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    Ze9f ze9f = (Ze9f)paramZmgn.getDocument();
    if (paramInt == ze9f.getLength())
      return paramInt; 
    Element element = ze9f.getDefaultRootElement();
    int i = element.getElementIndex(paramInt);
    while (i < element.getElementCount()) {
      Element element1 = element.getElement(i);
      if (ZD(element1, ze9f) && ZH(i, paramZmgn))
        return element1.getEndOffset(); 
      i++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return paramZmgn.Zd();
  }
  
  private boolean ZD(Element paramElement, Ze9f paramZe9f) {
    return (paramZe9f.Zz(paramElement.getEndOffset()) == paramElement.getStartOffset());
  }
  
  private boolean ZH(int paramInt, Zmgn paramZmgn) {
    int i = paramZmgn.getDocument().getDefaultRootElement().getElementCount() - 1;
    Zxam zxam = paramZmgn.Zm();
    return (!paramZmgn.ZY() || (!zxam.ZN(paramInt) && paramInt < i && !zxam.ZN(paramInt + 1)));
  }
  
  static {
    // Byte code:
    //   0: bipush #46
    //   2: ldc 'e`Rvi\\tYOGVV5&[ERv_$H^\h'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzfj.c : Ljava/lang/String;
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
    //   80: bipush #25
    //   82: goto -> 112
    //   85: bipush #29
    //   87: goto -> 112
    //   90: bipush #40
    //   92: goto -> 112
    //   95: bipush #25
    //   97: goto -> 112
    //   100: bipush #105
    //   102: goto -> 112
    //   105: bipush #105
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */