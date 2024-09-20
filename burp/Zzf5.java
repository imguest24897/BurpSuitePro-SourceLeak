package burp;

import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Segment;

public class Zzf5 extends Zzfy {
  private final Segment ZM = new Segment();
  
  public Zzf5(String paramString, boolean paramBoolean) {
    super(paramString, paramBoolean);
  }
  
  protected int Zt(Zmgw paramZmgw, int paramInt) throws BadLocationException {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    try {
      if (paramInt == 0)
        return paramInt; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    Ze9f ze9f = (Ze9f)paramZmgw.getDocument();
    Element element = ze9f.getDefaultRootElement();
    int i = element.getElementIndex(paramInt);
    int j = element.getElement(i).getStartOffset();
    if (paramInt == j) {
      Zmgn zmgn = (Zmgn)paramZmgw;
      if (zmgn.ZY()) {
        Zxam zxam = zmgn.Zm();
        try {
          while (--i >= 0) {
            try {
              if (zxam.ZN(i));
            } catch (BadLocationException badLocationException) {
              throw a(null);
            } 
          } 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        if (i >= 0)
          paramInt = ze9f.Zz(element.getElement(i).getEndOffset()); 
        return paramInt;
      } 
      return ze9f.Zz(j);
    } 
    ze9f.getText(j, paramInt - j, this.ZM);
    char c = this.ZM.last();
    while (Character.isWhitespace(c)) {
      c = this.ZM.previous();
      if (arrayOfZbqc != null)
        break; 
    } 
    boolean bool = false;
    if (ze9f.Zq(bool, c)) {
      do {
        c = this.ZM.previous();
      } while (c != Character.MAX_VALUE && ze9f.Zq(bool, c));
    } else if (!Character.isWhitespace(c)) {
      while (true) {
        c = this.ZM.previous();
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
    paramInt -= this.ZM.getEndIndex() - this.ZM.getIndex();
    try {
      if (c != Character.MAX_VALUE)
        paramInt++; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    return paramInt;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzf5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */