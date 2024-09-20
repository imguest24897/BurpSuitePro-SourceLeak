package burp;

import burp.api.montoya.ui.contextmenu.WebSocketContextMenuEvent;
import burp.api.montoya.ui.contextmenu.WebSocketEditorEvent;
import burp.api.montoya.ui.contextmenu.WebSocketMessage;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Zrm8 extends Zrvt implements WebSocketContextMenuEvent {
  private final Zezw Zl;
  
  private final Zskl Zq;
  
  public Zrm8(Zezw paramZezw, Zskl paramZskl) {
    super(paramZezw);
    this.Zl = paramZezw;
    this.Zq = paramZskl;
  }
  
  public Optional<WebSocketEditorEvent> messageEditorWebSocket() {
    if ((this.Zl.ZR()).isEditor) {
      List<Zlv8> list = this.Zl.Zy();
      if (list.isEmpty())
        return Optional.empty(); 
      Zlv8 zlv8 = list.getFirst();
      return (zlv8.ZP() == null) ? Optional.<WebSocketEditorEvent>empty() : Optional.<WebSocketEditorEvent>of(new Zrmo(zlv8, this.Zq, this.Zl));
    } 
    return Optional.empty();
  }
  
  public List<WebSocketMessage> selectedWebSocketMessages() {
    List<Zlv8> list = this.Zl.Zy();
    return ((this.Zl.ZR()).isEditor || list == null) ? Collections.emptyList() : (List<WebSocketMessage>)list.stream().map(this::lambda$selectedWebSocketMessages$0).collect(Collectors.toList());
  }
  
  private Zlun lambda$selectedWebSocketMessages$0(Zlv8 paramZlv8) {
    return new Zlun(paramZlv8, this.Zq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrm8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */