package burp;

import java.awt.AWTKeyStroke;
import java.awt.Component;
import java.util.Set;
import java.util.function.Function;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.undo.UndoManager;
import net.portswigger.Zm2;

class Zt8j extends AbstractCellEditor implements TableCellEditor {
  private final UndoManager Zs;
  
  private final Zl86 ZW;
  
  private int Zu = -1;
  
  private int Zd = -1;
  
  private boolean Zo;
  
  static Zt8j ZN(Zbws paramZbws, Function<Integer, Zb6u> paramFunction, Zgtm paramZgtm, Zlns paramZlns, Zmxv paramZmxv) {
    return new Zt8j(paramZbws, paramFunction, paramZgtm, new UndoManager(), paramZlns, paramZmxv);
  }
  
  private Zt8j(Zbws paramZbws, Function<Integer, Zb6u> paramFunction, Zgtm paramZgtm, UndoManager paramUndoManager, Zlns paramZlns, Zmxv paramZmxv) {
    this.Zs = paramUndoManager;
    this.ZW = new Zl8n(paramUndoManager, paramZbws::lambda$new$0);
    this.ZW.setLineWrap(true);
    this.ZW.setWrapStyleWord(false);
    this.ZW.setBorder(Zbd7.ZA);
    this.ZW.getDocument().addUndoableEditListener(paramUndoManager);
    this.ZW.setFocusTraversalKeys(0, (Set<? extends AWTKeyStroke>)null);
    this.ZW.setFocusTraversalKeys(1, (Set<? extends AWTKeyStroke>)null);
    this.ZW.addComponentListener(new Zsfc(this, paramZmxv, paramZbws));
    this.ZW.addKeyListener(new Zlbk(this, paramZbws));
    Ze7k ze7k = new Ze7k(paramZbws, paramFunction, paramZgtm, paramZlns);
    paramZbws.addPropertyChangeListener(ze7k);
    addCellEditorListener(ze7k);
  }
  
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_INLINE_EDIT);
    this.Zu = paramInt1;
    this.Zd = paramInt2;
    this.ZW.ZH(Zlkk.FOREGROUND);
    this.ZW.ZL(Zlkk.INSPECTOR_TABLE_EDITABLE_FIELD_BACKGROUND);
    this.ZW.setCaretColor(Zlkk.SOLID_FOREGROUND.ZS());
    this.ZW.setText((String)paramObject);
    this.ZW.setFont(paramJTable.getFont());
    this.Zs.discardAllEdits();
    return this.ZW;
  }
  
  public boolean stopCellEditing() {
    return (!this.Zo && super.stopCellEditing());
  }
  
  public Object getCellEditorValue() {
    return this.ZW.getText();
  }
  
  private static void lambda$new$0(Zbws paramZbws) {
    if (paramZbws.isEditing()) {
      TableCellEditor tableCellEditor = paramZbws.getCellEditor();
      if (tableCellEditor != null)
        tableCellEditor.stopCellEditing(); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt8j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */