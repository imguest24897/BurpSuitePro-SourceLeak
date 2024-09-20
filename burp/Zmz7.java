package burp;

import burp.api.montoya.core.Range;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.ui.contextmenu.MessageEditorHttpRequestResponse;
import java.util.Optional;

public class Zmz7 implements MessageEditorHttpRequestResponse {
  private final Range Zf;
  
  private final MessageEditorHttpRequestResponse.SelectionContext Z_;
  
  private final Zz2q ZR;
  
  private final int Za;
  
  public Zmz7(Range paramRange, Zz2q paramZz2q, MessageEditorHttpRequestResponse.SelectionContext paramSelectionContext, int paramInt) {
    this.Zf = paramRange;
    this.Za = paramInt;
    this.ZR = paramZz2q;
    this.Z_ = paramSelectionContext;
  }
  
  public MessageEditorHttpRequestResponse.SelectionContext selectionContext() {
    return this.Z_;
  }
  
  public Optional<Range> selectionOffsets() {
    return Optional.ofNullable(this.Zf);
  }
  
  public int caretPosition() {
    return this.Za;
  }
  
  public HttpRequestResponse requestResponse() {
    return this.ZR;
  }
  
  public void setRequest(HttpRequest paramHttpRequest) {
    this.ZR.ZE(paramHttpRequest);
  }
  
  public void setResponse(HttpResponse paramHttpResponse) {
    this.ZR.ZG(paramHttpResponse);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmz7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */