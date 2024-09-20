package burp;

import burp.api.montoya.ui.editor.extension.EditorMode;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedWebSocketMessageEditor;
import burp.api.montoya.ui.editor.extension.WebSocketMessageEditorProvider;

public class Zb2h implements Ztmw {
  private final WebSocketMessageEditorProvider Zs;
  
  private final Zeu1 Zw;
  
  public Zb2h(WebSocketMessageEditorProvider paramWebSocketMessageEditorProvider, Zeu1 paramZeu1) {
    this.Zs = paramWebSocketMessageEditorProvider;
    this.Zw = paramZeu1;
  }
  
  public ExtensionProvidedWebSocketMessageEditor ZO(Zeew paramZeew, EditorMode paramEditorMode) {
    Zkux zkux = new Zkux(Zt6v.ZK(paramZeew), paramEditorMode);
    return this.Zs.provideMessageEditor(zkux);
  }
  
  public Zeu1 ZM() {
    return this.Zw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb2h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */