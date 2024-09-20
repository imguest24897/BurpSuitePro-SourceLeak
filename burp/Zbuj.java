package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpRequestEditor;
import java.awt.Component;
import java.util.Objects;
import net.portswigger.Zdo;

public class Zbuj implements ExtensionProvidedHttpRequestEditor {
  private final IMessageEditorTab ZI;
  
  private final Zbfz ZC;
  
  private final Zzqf ZD;
  
  public Zbuj(IMessageEditorTab paramIMessageEditorTab, Zbfz paramZbfz, Zzqf paramZzqf) {
    Objects.requireNonNull(paramIMessageEditorTab);
    this.ZD = paramZzqf;
    this.ZI = paramIMessageEditorTab;
    this.ZC = paramZbfz;
  }
  
  public void setRequestResponse(HttpRequestResponse paramHttpRequestResponse) {
    this.ZC.ZX(paramHttpRequestResponse);
    byte[] arrayOfByte = (paramHttpRequestResponse == null || paramHttpRequestResponse.request() == null) ? null : paramHttpRequestResponse.request().toByteArray().getBytes();
    this.ZI.setMessage(arrayOfByte, true);
  }
  
  public HttpRequest getRequest() {
    return this.ZD.Zj((IHttpService)null, this.ZI.getMessage());
  }
  
  public boolean isEnabledFor(HttpRequestResponse paramHttpRequestResponse) {
    byte[] arrayOfByte = (paramHttpRequestResponse == null || paramHttpRequestResponse.request() == null) ? Zdo.ZQ : paramHttpRequestResponse.request().toByteArray().getBytes();
    return this.ZI.isEnabled(arrayOfByte, true);
  }
  
  public String caption() {
    return this.ZI.getTabCaption();
  }
  
  public Component uiComponent() {
    return this.ZI.getUiComponent();
  }
  
  public Selection selectedData() {
    return this.ZD.ZP(this.ZI.getSelectedData());
  }
  
  public boolean isModified() {
    return this.ZI.isModified();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbuj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */