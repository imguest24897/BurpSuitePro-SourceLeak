package burp;

import java.awt.Point;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.Segment;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztsz extends Zts6 {
  protected Segment ZT;
  
  private String Zn;
  
  private List<Zmy1> ZC;
  
  public Ztsz() {
    Zn();
  }
  
  public String ZN(JTextComponent paramJTextComponent) {
    Document document = paramJTextComponent.getDocument();
    int i = paramJTextComponent.getCaretPosition();
    Element element1 = document.getDefaultRootElement();
    int j = element1.getElementIndex(i);
    int[] arrayOfInt = Zghd.ZM();
    Element element2 = element1.getElement(j);
    int k = element2.getStartOffset();
    int m = i - k;
    try {
      document.getText(k, m, this.ZT);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return "";
    } 
    int n = this.ZT.offset + m;
    k = n - 1;
    while (k >= this.ZT.offset) {
      try {
        if (ZA(this.ZT.array[k])) {
          k--;
          if (arrayOfInt == null)
            break; 
        } 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } 
    m = n - ++k;
    try {
    
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    return (m == 0) ? "" : new String(this.ZT.array, k, m);
  }
  
  public List<Zmy1> ZZ(JTextComponent paramJTextComponent, Point paramPoint) {
    int[] arrayOfInt = Zghd.ZM();
    int i = paramJTextComponent.viewToModel(paramPoint);
    try {
      if (i >= 0)
        try {
          if (i < paramJTextComponent.getDocument().getLength()) {
            Segment segment = new Segment();
            Document document = paramJTextComponent.getDocument();
            Element element1 = document.getDefaultRootElement();
            int j = element1.getElementIndex(i);
            Element element2 = element1.getElement(j);
            int k = element2.getStartOffset();
            int m = element2.getEndOffset() - 1;
            try {
              document.getText(k, m - k, segment);
              int n = segment.offset + i - k - 1;
              while (n >= segment.offset) {
                try {
                  if (ZA(segment.array[n])) {
                    n--;
                    if (arrayOfInt == null)
                      break; 
                  } 
                } catch (BadLocationException badLocationException) {
                  throw a(null);
                } 
              } 
              int i1 = segment.offset + i - k;
              while (i1 < segment.offset + segment.count) {
                try {
                  if (ZA(segment.array[i1])) {
                    i1++;
                    if (arrayOfInt == null)
                      break; 
                  } 
                } catch (BadLocationException badLocationException) {
                  throw a(null);
                } 
              } 
              int i2 = i1 - n - 1;
              if (i2 <= 0)
                return this.ZC = null; 
              String str = new String(segment.array, n + 1, i2);
              if (str.equals(this.Zn))
                return this.ZC; 
              List<Zmy1> list = ZN(str);
              this.Zn = str;
              return this.ZC = list;
            } catch (BadLocationException badLocationException) {
              Zah.Zl(badLocationException, Zk_.UNEXPECTED);
              this.Zn = null;
              return this.ZC = null;
            } 
          } 
          this.Zn = null;
          return this.ZC = null;
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    this.Zn = null;
    return this.ZC = null;
  }
  
  protected void Zn() {
    this.ZT = new Segment();
  }
  
  protected boolean ZA(char paramChar) {
    return (Character.isLetterOrDigit(paramChar) || paramChar == '_');
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztsz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */