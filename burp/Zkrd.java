package burp;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

class Zkrd extends DocumentFilter {
  private final int ZQ;
  
  Zkrd(int paramInt) {
    this.ZQ = paramInt;
  }
  
  public void insertString(DocumentFilter.FilterBypass paramFilterBypass, int paramInt, String paramString, AttributeSet paramAttributeSet) throws BadLocationException {
    try {
      if (paramFilterBypass.getDocument().getLength() + paramString.length() <= this.ZQ)
        super.insertString(paramFilterBypass, paramInt, paramString, paramAttributeSet); 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
  }
  
  public void replace(DocumentFilter.FilterBypass paramFilterBypass, int paramInt1, int paramInt2, String paramString, AttributeSet paramAttributeSet) throws BadLocationException {
    try {
      if (paramFilterBypass.getDocument().getLength() + paramString.length() - paramInt2 <= this.ZQ)
        super.replace(paramFilterBypass, paramInt1, paramInt2, paramString, paramAttributeSet); 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkrd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */