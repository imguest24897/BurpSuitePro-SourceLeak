package burp;

import burp.api.montoya.core.Range;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.ui.contextmenu.ContextMenuEvent;
import burp.api.montoya.ui.contextmenu.MessageEditorHttpRequestResponse;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Zr38 implements IContextMenuInvocation {
  private final ContextMenuEvent ZE;
  
  private final Zbnt ZF;
  
  private final Zzqf ZR;
  
  private final byte Zs;
  
  public Zr38(ContextMenuEvent paramContextMenuEvent, Zbnt paramZbnt, Zzqf paramZzqf, byte paramByte) {
    this.ZE = paramContextMenuEvent;
    this.ZF = paramZbnt;
    this.ZR = paramZzqf;
    this.Zs = paramByte;
  }
  
  public InputEvent getInputEvent() {
    return this.ZE.inputEvent();
  }
  
  public int getToolFlag() {
    return Zzgg.ZT(this.ZE.toolType());
  }
  
  public byte getInvocationContext() {
    return this.Zs;
  }
  
  public int[] getSelectionBounds() {
    byte b = getInvocationContext();
    if (b != 0 && b != 1 && b != 2 && b != 3)
      return null; 
    Optional<MessageEditorHttpRequestResponse> optional = this.ZE.messageEditorRequestResponse();
    if (optional.isPresent()) {
      MessageEditorHttpRequestResponse messageEditorHttpRequestResponse = optional.get();
      Optional optional1 = messageEditorHttpRequestResponse.selectionOffsets();
      if (optional1.isPresent())
        return new int[] { ((Range)optional1.get()).startIndexInclusive(), ((Range)optional1.get()).endIndexExclusive() }; 
      int i = messageEditorHttpRequestResponse.caretPosition();
      return new int[] { i, i };
    } 
    return null;
  }
  
  public IHttpRequestResponse[] getSelectedMessages() {
    Optional<MessageEditorHttpRequestResponse> optional = this.ZE.messageEditorRequestResponse();
    if (optional.isPresent()) {
      MessageEditorHttpRequestResponse messageEditorHttpRequestResponse = optional.get();
      HttpRequestResponse httpRequestResponse = messageEditorHttpRequestResponse.requestResponse();
      if (httpRequestResponse instanceof Zz2q) {
        IHttpRequestResponse iHttpRequestResponse = ((Zz2q)httpRequestResponse).Zp();
        return new IHttpRequestResponse[] { new Zrlb(iHttpRequestResponse) };
      } 
      Zr0x zr0x = new Zr0x(httpRequestResponse, this.ZF, this.ZR);
      return new IHttpRequestResponse[] { new Zrlb(zr0x) };
    } 
    List list = this.ZE.selectedRequestResponses();
    return list.isEmpty() ? null : (IHttpRequestResponse[])list.stream().map(Zswb::new).map(Zrlb::new).toList().toArray((Object[])new IHttpRequestResponse[list.size()]);
  }
  
  public IScanIssue[] getSelectedIssues() {
    List list = this.ZE.selectedIssues();
    return list.isEmpty() ? null : (IScanIssue[])list.stream().map(Zzei::new).toList().toArray((Object[])new IScanIssue[list.size()]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr38.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */