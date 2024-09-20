package burp;

import javax.swing.text.BadLocationException;
import javax.swing.text.Segment;

public class Zzf_ extends Zzfw {
  private final Segment Zw = new Segment();
  
  protected Zzf_(String paramString, boolean paramBoolean) {
    super(paramString, paramBoolean);
  }
  
  protected int ZU(Zmgw paramZmgw, int paramInt) throws BadLocationException {
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
        return j; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int k = paramZmgw.getLineEndOffset(i);
    if (i != paramZmgw.getLineCount() - 1)
      k = ze9f.Zz(k); 
    ze9f.getText(j, k - j, this.Zw);
    int m = this.Zw.getBeginIndex() + paramInt - j - 1;
    this.Zw.setIndex(m);
    char c = this.Zw.current();
    try {
    
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    boolean bool1 = (paramInt == k) ? false : this.Zw.array[this.Zw.getIndex() + 1];
    boolean bool2 = false;
    try {
      if (ze9f.Zq(bool2, c)) {
        try {
          if (paramInt != k)
            try {
              if (!ze9f.Zq(bool2, bool1))
                return paramInt; 
            } catch (BadLocationException badLocationException) {
              throw a(null);
            }  
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        do {
          c = this.Zw.previous();
        } while (ze9f.Zq(bool2, c) && c != Character.MAX_VALUE);
      } else {
        try {
          if (Character.isWhitespace(c)) {
            try {
              if (paramInt != k)
                try {
                  if (!Character.isWhitespace(bool1))
                    return paramInt; 
                } catch (BadLocationException badLocationException) {
                  throw a(null);
                }  
            } catch (BadLocationException badLocationException) {
              throw a(null);
            } 
            do {
              c = this.Zw.previous();
            } while (Character.isWhitespace(c));
          } 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
      } 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    paramInt -= m - this.Zw.getIndex() + 1;
    try {
      if (c != Character.MAX_VALUE)
        try {
          if (bool1 != 10)
            paramInt++; 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    return paramInt;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzf_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */