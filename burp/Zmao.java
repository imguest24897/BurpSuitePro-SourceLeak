package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.ui.editor.extension.EditorCreationContext;
import burp.api.montoya.ui.editor.extension.EditorMode;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpRequestEditor;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpResponseEditor;
import burp.api.montoya.ui.editor.extension.HttpRequestEditorProvider;
import burp.api.montoya.ui.editor.extension.HttpResponseEditorProvider;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmao implements HttpRequestEditorProvider, HttpResponseEditorProvider {
  private final IMessageEditorTabFactory ZP;
  
  private final Zzqf ZY;
  
  public Zmao(IMessageEditorTabFactory paramIMessageEditorTabFactory, Zzqf paramZzqf) {
    this.ZP = paramIMessageEditorTabFactory;
    this.ZY = paramZzqf;
  }
  
  public ExtensionProvidedHttpRequestEditor provideHttpRequestEditor(EditorCreationContext paramEditorCreationContext) {
    HttpRequestResponse httpRequestResponse = null;
    if (paramEditorCreationContext instanceof Zg1u) {
      Zg1u zg1u = (Zg1u)paramEditorCreationContext;
      httpRequestResponse = zg1u.Zz();
    } else {
      Zuh.Zb(false, Zqf.Zr);
    } 
    Zbfz zbfz = new Zbfz(httpRequestResponse);
    boolean bool = (paramEditorCreationContext.editorMode() == EditorMode.DEFAULT) ? true : false;
    IMessageEditorTab iMessageEditorTab = this.ZP.createNewInstance(zbfz, bool);
    return new Zbuj(iMessageEditorTab, zbfz, this.ZY);
  }
  
  public ExtensionProvidedHttpResponseEditor provideHttpResponseEditor(EditorCreationContext paramEditorCreationContext) {
    HttpRequestResponse httpRequestResponse = null;
    if (paramEditorCreationContext instanceof Zg1u) {
      Zg1u zg1u = (Zg1u)paramEditorCreationContext;
      httpRequestResponse = zg1u.Zz();
    } else {
      Zuh.Zb(false, Zqf.Zr);
    } 
    Zbfz zbfz = new Zbfz(httpRequestResponse);
    boolean bool = (paramEditorCreationContext.editorMode() == EditorMode.DEFAULT) ? true : false;
    IMessageEditorTab iMessageEditorTab = this.ZP.createNewInstance(zbfz, bool);
    return new Zzti(iMessageEditorTab, zbfz, this.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmao.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */