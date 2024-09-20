package burp;

import java.awt.Component;
import java.util.function.Function;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.undo.UndoManager;
import net.portswigger.Zm2;

class Zxtu extends DefaultCellEditor {
  private final UndoManager ZC;
  
  static Zxtu ZH(Zbws paramZbws, Function<Integer, Zb6u> paramFunction, Zgtm paramZgtm, Zlns paramZlns) {
    return new Zxtu(paramZbws, paramFunction, paramZgtm, new UndoManager(), paramZlns);
  }
  
  private Zxtu(Zbws paramZbws, Function<Integer, Zb6u> paramFunction, Zgtm paramZgtm, UndoManager paramUndoManager, Zlns paramZlns) {
    super(new Zgf6(paramUndoManager, paramZbws::lambda$new$0));
    this.ZC = paramUndoManager;
    Ze7k ze7k = new Ze7k(paramZbws, paramFunction, paramZgtm, paramZlns);
    paramZbws.addPropertyChangeListener(ze7k);
    addCellEditorListener(ze7k);
  }
  
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_INLINE_EDIT);
    Component component = super.getTableCellEditorComponent(paramJTable, paramObject, paramBoolean, paramInt1, paramInt2);
    Zg85 zg85 = (Zg85)component;
    zg85.Zi(Zlkk.FOREGROUND);
    zg85.Zu(Zlkk.INSPECTOR_TABLE_EDITABLE_FIELD_BACKGROUND);
    zg85.setCaretColor(Zlkk.SOLID_FOREGROUND.ZS());
    zg85.setFont(paramJTable.getFont());
    this.ZC.discardAllEdits();
    return component;
  }
  
  private static void lambda$new$0(Zbws paramZbws) {
    if (paramZbws.isEditing()) {
      TableCellEditor tableCellEditor = paramZbws.getCellEditor();
      if (tableCellEditor != null)
        tableCellEditor.stopCellEditing(); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxtu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */