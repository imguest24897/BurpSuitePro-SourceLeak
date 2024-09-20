package burp;

import burp.api.montoya.core.Registration;
import burp.api.montoya.ui.editor.extension.HttpRequestEditorProvider;
import burp.api.montoya.ui.editor.extension.HttpResponseEditorProvider;
import burp.api.montoya.ui.editor.extension.WebSocketMessageEditorProvider;
import java.util.List;

interface Zz5x {
  Registration ZN(HttpRequestEditorProvider paramHttpRequestEditorProvider);
  
  Registration Zz(HttpResponseEditorProvider paramHttpResponseEditorProvider);
  
  List<HttpRequestEditorProvider> ZX();
  
  List<HttpResponseEditorProvider> Zh();
  
  Registration Zd(WebSocketMessageEditorProvider paramWebSocketMessageEditorProvider);
  
  List<WebSocketMessageEditorProvider> ZR();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz5x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */