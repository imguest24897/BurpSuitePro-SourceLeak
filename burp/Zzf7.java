package burp;

import javax.swing.text.BadLocationException;
import javax.swing.text.Segment;

public class Zzf7 extends Zzfq {
  private final Segment ZR = new Segment();
  
  protected Zzf7(String paramString, boolean paramBoolean) {
    super(paramString, paramBoolean);
  }
  
  protected int Zw(Zmgw paramZmgw, int paramInt) throws BadLocationException {
    Ze9f ze9f = (Ze9f)paramZmgw.getDocument();
    try {
      if (paramInt == ze9f.getLength())
        return paramInt; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int i = paramZmgw.getLineOfOffset(paramInt);
    int j = paramZmgw.getLineEndOffset(i);
    if (i != paramZmgw.getLineCount() - 1)
      j = ze9f.Zz(j); 
    try {
      if (paramInt == j)
        return j; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    ze9f.getText(paramInt, j - paramInt, this.ZR);
    char c = this.ZR.first();
    boolean bool = false;
    if (ze9f.Zq(bool, c)) {
      do {
        c = this.ZR.next();
      } while (ze9f.Zq(bool, c) && c != Character.MAX_VALUE);
    } else if (Character.isWhitespace(c)) {
      do {
        c = this.ZR.next();
      } while (Character.isWhitespace(c));
    } 
    paramInt += this.ZR.getIndex() - this.ZR.getBeginIndex();
    return paramInt;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzf7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */