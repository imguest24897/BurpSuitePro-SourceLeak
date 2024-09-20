package burp;

import javax.swing.undo.UndoManager;

class Zl8n extends Zl86 implements Zzyl {
  private final UndoManager ZS;
  
  private final Runnable Z_;
  
  public Zl8n(UndoManager paramUndoManager, Runnable paramRunnable) {
    this.ZS = paramUndoManager;
    this.Z_ = paramRunnable;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    switch (paramInt) {
      case 394240:
        if (this.ZS.canUndo())
          this.ZS.undo(); 
      case 394496:
        if (this.ZS.canRedo())
          this.ZS.redo(); 
      case 263168:
        this.Z_.run();
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */