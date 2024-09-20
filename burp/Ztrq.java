package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Range;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.RawEditor;
import java.awt.Component;

public class Ztrq implements ITextEditor {
  private final RawEditor Zt;
  
  private final Zzqf Zb;
  
  public Ztrq(RawEditor paramRawEditor, Zzqf paramZzqf) {
    this.Zt = paramRawEditor;
    this.Zb = paramZzqf;
  }
  
  public Component getComponent() {
    return this.Zt.uiComponent();
  }
  
  public void setEditable(boolean paramBoolean) {
    this.Zt.setEditable(paramBoolean);
  }
  
  public void setText(byte[] paramArrayOfbyte) {
    this.Zt.setContents(this.Zb.ZI(paramArrayOfbyte));
  }
  
  public byte[] getText() {
    return this.Zt.getContents().getBytes();
  }
  
  public boolean isTextModified() {
    return this.Zt.isModified();
  }
  
  public byte[] getSelectedText() {
    return this.Zt.selection().map(Selection::contents).map(ByteArray::getBytes).orElse(null);
  }
  
  public int[] getSelectionBounds() {
    Zbqc[] arrayOfZbqc = Zr0z.ZA();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[4]); 
    return this.Zt.selection().map(Selection::offsets).map(Ztrq::lambda$getSelectionBounds$0).orElse(new int[] { this.Zt.caretPosition(), this.Zt.caretPosition() });
  }
  
  public void setSearchExpression(String paramString) {
    this.Zt.setSearchExpression(paramString);
  }
  
  private static int[] lambda$getSelectionBounds$0(Range paramRange) {
    return new int[] { paramRange.startIndexInclusive(), paramRange.endIndexExclusive() };
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztrq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */