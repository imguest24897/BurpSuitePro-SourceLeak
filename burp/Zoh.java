package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.ui.editor.extension.EditorMode;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpRequestEditor;
import burp.api.montoya.ui.editor.extension.HttpRequestEditorProvider;

public class Zoh implements Zgyu {
  private final HttpRequestEditorProvider ZE;
  
  private final Zeu1 ZV;
  
  public Zoh(HttpRequestEditorProvider paramHttpRequestEditorProvider, Zeu1 paramZeu1) {
    this.ZE = paramHttpRequestEditorProvider;
    this.ZV = paramZeu1;
  }
  
  public ExtensionProvidedHttpRequestEditor ZR(HttpRequestResponse paramHttpRequestResponse, EditorMode paramEditorMode, Zeew paramZeew) {
    return this.ZE.provideHttpRequestEditor(new Zg1u(paramHttpRequestResponse, Zt6v.ZK(paramZeew), paramEditorMode));
  }
  
  public Zeu1 ZM() {
    return this.ZV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zoh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */