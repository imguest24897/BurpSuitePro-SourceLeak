package burp;

import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Segment;

public class Zzft extends Zzfr {
  private final Segment ZC = new Segment();
  
  public Zzft(String paramString, boolean paramBoolean) {
    super(paramString, paramBoolean);
  }
  
  protected int ZN(Zmgw paramZmgw, int paramInt) throws BadLocationException {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    Ze9f ze9f = (Ze9f)paramZmgw.getDocument();
    try {
      if (paramInt == ze9f.getLength())
        return paramInt; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    Element element = ze9f.getDefaultRootElement();
    int i = element.getElementIndex(paramInt);
    int j = ze9f.Zz(element.getElement(i).getEndOffset());
    if (paramInt == j) {
      Zmgn zmgn = (Zmgn)paramZmgw;
      if (zmgn.ZY()) {
        Zxam zxam = zmgn.Zm();
        int k = element.getElementCount();
        try {
          while (++i < k) {
            try {
              if (zxam.ZN(i));
            } catch (BadLocationException badLocationException) {
              throw a(null);
            } 
          } 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        if (i < k)
          paramInt = element.getElement(i).getStartOffset(); 
        return paramInt;
      } 
      return ze9f.Za(paramInt);
    } 
    ze9f.getText(paramInt, j - paramInt, this.ZC);
    char c = this.ZC.first();
    boolean bool = false;
    if (ze9f.Zq(bool, c)) {
      do {
        c = this.ZC.next();
      } while (c != Character.MAX_VALUE && ze9f.Zq(bool, c));
    } else if (!Character.isWhitespace(c)) {
      while (true) {
        c = this.ZC.next();
        if (c != Character.MAX_VALUE) {
          try {
            if (ze9f.Zq(bool, c) || Character.isWhitespace(c))
              break; 
          } catch (BadLocationException badLocationException) {
            throw a(null);
          } 
          continue;
        } 
        break;
      } 
    } 
    while (Character.isWhitespace(c)) {
      c = this.ZC.next();
      if (arrayOfZbqc != null)
        break; 
    } 
    paramInt += this.ZC.getIndex() - this.ZC.getBeginIndex();
    return paramInt;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzft.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */