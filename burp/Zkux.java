package burp;

import burp.api.montoya.core.ToolSource;
import burp.api.montoya.ui.editor.extension.EditorCreationContext;
import burp.api.montoya.ui.editor.extension.EditorMode;

public final class Zkux extends Record implements EditorCreationContext {
  private final ToolSource toolSource;
  
  private final EditorMode editorMode;
  
  public Zkux(ToolSource paramToolSource, EditorMode paramEditorMode) {
    this.toolSource = paramToolSource;
    this.editorMode = paramEditorMode;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zkux;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zkux;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zkux;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public ToolSource toolSource() {
    return this.toolSource;
  }
  
  public EditorMode editorMode() {
    return this.editorMode;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkux.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */