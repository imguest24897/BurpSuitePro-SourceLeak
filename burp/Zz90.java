package burp;

import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.html.HTMLEditorKit;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zz90 extends HTMLEditorKit.HTMLFactory {
  Zz90(Zzu9 paramZzu9) {}
  
  public View create(Element paramElement) {
    View view = super.create(paramElement);
    try {
      if (view instanceof javax.swing.text.ParagraphView) {
        String str = paramElement.getName();
        try {
          if (str.length() != 2 || !str.toLowerCase().startsWith("h"))
            return new Zxsi(this, paramElement); 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return view;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz90.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */