package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Range;
import burp.api.montoya.ui.contextmenu.WebSocketEditorEvent;
import burp.api.montoya.ui.contextmenu.WebSocketMessage;
import java.util.Optional;

public class Zrmo extends Zrvt implements WebSocketEditorEvent {
  private final Zlv8 Zt;
  
  private final Zskl Z_;
  
  private final Zezw Zc;
  
  public Zrmo(Zlv8 paramZlv8, Zskl paramZskl, Zezw paramZezw) {
    super(paramZezw);
    this.Zt = paramZlv8;
    this.Z_ = paramZskl;
    this.Zc = paramZezw;
  }
  
  public ByteArray getContents() {
    return this.Z_.ZI(this.Zt.ZW());
  }
  
  public void setContents(ByteArray paramByteArray) {
    this.Zt.Zo(paramByteArray.getBytes());
  }
  
  public WebSocketMessage webSocketMessage() {
    return new Zlun(this.Zt, this.Z_);
  }
  
  public boolean isReadOnly() {
    return this.Zt.ZM();
  }
  
  public Optional<Range> selectionOffsets() {
    return Optional.ofNullable(this.Z_.ZK(this.Zc.ZD()));
  }
  
  public int caretPosition() {
    Range range = this.Z_.ZK(this.Zc.ZD());
    return (range != null) ? range.endIndexExclusive() : -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrmo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */