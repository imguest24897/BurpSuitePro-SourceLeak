package burp;

import javax.swing.text.BadLocationException;
import javax.swing.text.Segment;

public class Zzfu extends Zzf1 {
  private final Segment ZH = new Segment();
  
  protected int ZQ(Zmgw paramZmgw, int paramInt) throws BadLocationException {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    try {
      if (paramInt == 0)
        return paramInt; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    Ze9f ze9f = (Ze9f)paramZmgw.getDocument();
    int i = paramZmgw.getLineOfOffset(paramInt);
    int j = paramZmgw.getLineStartOffset(i);
    try {
      if (paramInt == j)
        return ze9f.Zz(j); 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    ze9f.getText(j, paramInt - j, this.ZH);
    char c = this.ZH.last();
    if (Character.isWhitespace(c))
      do {
        c = this.ZH.previous();
      } while (Character.isWhitespace(c)); 
    boolean bool = false;
    if (ze9f.Zq(bool, c)) {
      while (true) {
        c = this.ZH.previous();
        if (!ze9f.Zq(bool, c))
          break; 
      } 
    } else {
      while (!Character.isWhitespace(c)) {
        try {
          if (!ze9f.Zq(bool, c) && c != Character.MAX_VALUE) {
            c = this.ZH.previous();
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
        return j; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    paramInt -= this.ZH.getEndIndex() - this.ZH.getIndex() + 1;
    return paramInt;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */