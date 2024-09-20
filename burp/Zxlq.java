package burp;

import burp.api.montoya.ui.editor.EditorOptions;
import burp.api.montoya.ui.editor.RawEditor;
import java.util.List;

public class Zxlq {
  private final Zskl Zp;
  
  private final Zepv Zt;
  
  public Zxlq(Zskl paramZskl, Zepv paramZepv) {
    this.Zp = paramZskl;
    this.Zt = paramZepv;
  }
  
  public RawEditor Zq(EditorOptions... paramVarArgs) {
    List<EditorOptions> list = List.of(paramVarArgs);
    boolean bool = !list.contains(EditorOptions.READ_ONLY) ? true : false;
    Zbkv zbkv = this.Zt.ZH(bool);
    if (list.contains(EditorOptions.WRAP_LINES))
      zbkv.ZY(true); 
    if (list.contains(EditorOptions.SHOW_NON_PRINTABLE_CHARACTERS))
      zbkv.ZF(true); 
    return new Ztq3(zbkv, !bool, this.Zp);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxlq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */