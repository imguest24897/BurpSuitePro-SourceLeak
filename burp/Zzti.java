package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpResponseEditor;
import java.awt.Component;
import java.util.Objects;
import net.portswigger.Zdo;

public class Zzti implements ExtensionProvidedHttpResponseEditor {
  private final IMessageEditorTab Zv;
  
  private final Zbfz ZU;
  
  private final Zzqf Zq;
  
  public Zzti(IMessageEditorTab paramIMessageEditorTab, Zbfz paramZbfz, Zzqf paramZzqf) {
    Objects.requireNonNull(paramIMessageEditorTab);
    this.Zv = paramIMessageEditorTab;
    this.ZU = paramZbfz;
    this.Zq = paramZzqf;
  }
  
  public void setRequestResponse(HttpRequestResponse paramHttpRequestResponse) {
    this.ZU.ZX(paramHttpRequestResponse);
    byte[] arrayOfByte = (paramHttpRequestResponse == null || paramHttpRequestResponse.response() == null) ? null : paramHttpRequestResponse.response().toByteArray().getBytes();
    this.Zv.setMessage(arrayOfByte, false);
  }
  
  public HttpResponse getResponse() {
    byte[] arrayOfByte = this.Zv.getMessage();
    return this.Zq.Zc(arrayOfByte);
  }
  
  public boolean isEnabledFor(HttpRequestResponse paramHttpRequestResponse) {
    byte[] arrayOfByte = (paramHttpRequestResponse == null || paramHttpRequestResponse.response() == null) ? Zdo.ZQ : paramHttpRequestResponse.response().toByteArray().getBytes();
    return this.Zv.isEnabled(arrayOfByte, false);
  }
  
  public String caption() {
    return this.Zv.getTabCaption();
  }
  
  public Component uiComponent() {
    return this.Zv.getUiComponent();
  }
  
  public Selection selectedData() {
    return this.Zq.ZP(this.Zv.getSelectedData());
  }
  
  public boolean isModified() {
    return this.Zv.isModified();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzti.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */