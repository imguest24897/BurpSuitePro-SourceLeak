package burp;

import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.HttpResponseEditor;
import java.awt.Component;
import java.util.Optional;
import javax.swing.JComponent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zsxr implements HttpResponseEditor {
  private final Zbdf Ze;
  
  private final Zskl ZZ;
  
  public Zsxr(Zbdf paramZbdf, Zskl paramZskl) {
    this.Ze = paramZbdf;
    this.ZZ = paramZskl;
  }
  
  public void setResponse(HttpResponse paramHttpResponse) {
    byte[] arrayOfByte = (paramHttpResponse == null) ? null : paramHttpResponse.toByteArray().getBytes();
    this.Ze.ZN(arrayOfByte, Zgu3.HTTP_RESPONSE);
  }
  
  public HttpResponse getResponse() {
    Zsmh zsmh = this.Ze.Zi();
    Zmpe zmpe = new Zmpe();
    zsmh.Zh(zmpe);
    return this.ZZ.Zf(zmpe.ZC);
  }
  
  public void setSearchExpression(String paramString) {
    try {
      if (paramString == null)
        paramString = ""; 
      this.Ze.ZN(paramString, false, false);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public boolean isModified() {
    return this.Ze.Ze();
  }
  
  public int caretPosition() {
    int[] arrayOfInt = this.Ze.ZG();
    return arrayOfInt[1];
  }
  
  public Optional<Selection> selection() {
    byte[] arrayOfByte = this.Ze.Zd();
    if (arrayOfByte == null || arrayOfByte.length == 0)
      return Optional.empty(); 
    Selection selection = this.ZZ.Zp(arrayOfByte, this.Ze.ZG());
    return Optional.of(selection);
  }
  
  public JComponent ZJ() {
    return this.Ze;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsxr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */