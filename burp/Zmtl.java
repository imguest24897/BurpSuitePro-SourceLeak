package burp;

import javax.swing.event.UndoableEditEvent;
import javax.swing.text.JTextComponent;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class Zmtl extends UndoManager {
  private final JTextComponent ZJ;
  
  private Zscp Zm;
  
  private int ZE;
  
  private int ZY;
  
  public Zmtl(JTextComponent paramJTextComponent) {
    this.ZJ = paramJTextComponent;
  }
  
  public synchronized void discardAllEdits() {
    this.Zm = null;
    this.ZE = 0;
    this.ZY = 0;
    super.discardAllEdits();
  }
  
  public void ZX() {
    if (++this.ZY == 1) {
      if (this.Zm != null)
        this.Zm.end(); 
      this.Zm = new Zscp(this);
    } 
  }
  
  public void ZJ() {
    if (this.ZY > 0 && --this.ZY == 0) {
      addEdit(this.Zm);
      this.Zm.end();
      this.Zm = null;
    } 
  }
  
  private Zscp ZD(UndoableEdit paramUndoableEdit) {
    this.ZE = this.ZJ.getCaretPosition();
    this.Zm = new Zscp(this);
    this.Zm.addEdit(paramUndoableEdit);
    addEdit(this.Zm);
    return this.Zm;
  }
  
  public void undoableEditHappened(UndoableEditEvent paramUndoableEditEvent) {
    if (this.Zm == null) {
      this.Zm = ZD(paramUndoableEditEvent.getEdit());
      return;
    } 
    if (this.ZY > 0) {
      this.Zm.addEdit(paramUndoableEditEvent.getEdit());
      return;
    } 
    int i = this.ZJ.getCaretPosition() - this.ZE;
    if (Math.abs(i) <= 1) {
      this.Zm.addEdit(paramUndoableEditEvent.getEdit());
      this.ZE += i;
      return;
    } 
    this.Zm.end();
    this.Zm = ZD(paramUndoableEditEvent.getEdit());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmtl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */