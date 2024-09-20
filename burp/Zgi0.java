package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.ui.editor.extension.EditorMode;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpResponseEditor;
import burp.api.montoya.ui.editor.extension.HttpResponseEditorProvider;

public class Zgi0 implements Zgyu {
  private final HttpResponseEditorProvider ZV;
  
  private final Zeu1 Zt;
  
  public Zgi0(HttpResponseEditorProvider paramHttpResponseEditorProvider, Zeu1 paramZeu1) {
    this.ZV = paramHttpResponseEditorProvider;
    this.Zt = paramZeu1;
  }
  
  public ExtensionProvidedHttpResponseEditor ZP(HttpRequestResponse paramHttpRequestResponse, EditorMode paramEditorMode, Zeew paramZeew) {
    return this.ZV.provideHttpResponseEditor(new Zg1u(paramHttpRequestResponse, Zt6v.ZK(paramZeew), paramEditorMode));
  }
  
  public Zeu1 ZM() {
    return this.Zt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgi0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */