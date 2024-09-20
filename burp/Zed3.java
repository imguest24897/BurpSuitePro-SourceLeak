package burp;

import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.HttpRequestEditor;
import java.awt.Component;
import java.util.Optional;
import javax.swing.JComponent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zed3 implements HttpRequestEditor {
  private final Zbnt Zh;
  
  private final Zbdf Zm;
  
  private final Zskl Zp;
  
  private final Zey9 ZT;
  
  public Zed3(Zbnt paramZbnt, Zbdf paramZbdf, Zskl paramZskl, Zey9 paramZey9) {
    this.Zh = paramZbnt;
    this.Zm = paramZbdf;
    this.Zp = paramZskl;
    this.ZT = paramZey9;
  }
  
  public void setRequest(HttpRequest paramHttpRequest) {
    this.Zm.ZA(Zblx.ZW(paramHttpRequest, this.Zh, this.ZT), Zgsq.HIDDEN);
  }
  
  public HttpRequest getRequest() {
    Zsmh zsmh = this.Zm.Zi();
    Zzs0 zzs0 = new Zzs0();
    zsmh.Zh(zzs0);
    return this.Zp.ZN(zzs0.Zg);
  }
  
  public void setSearchExpression(String paramString) {
    try {
      if (paramString == null)
        paramString = ""; 
      this.Zm.ZN(paramString, false, false);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public boolean isModified() {
    return this.Zm.Ze();
  }
  
  public int caretPosition() {
    int[] arrayOfInt = this.Zm.ZG();
    return arrayOfInt[1];
  }
  
  public Optional<Selection> selection() {
    byte[] arrayOfByte = this.Zm.Zd();
    if (arrayOfByte == null || arrayOfByte.length == 0)
      return Optional.empty(); 
    Selection selection = this.Zp.Zp(arrayOfByte, this.Zm.ZG());
    return Optional.of(selection);
  }
  
  public JComponent ZD() {
    return this.Zm;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zed3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */