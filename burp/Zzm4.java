package burp;

import javax.swing.table.TableColumn;

public final class Zzm4 extends Record {
  private final TableColumn ZUS;
  
  private final int ZUP;
  
  public Zzm4(TableColumn paramTableColumn, int paramInt) {
    this.ZUS = paramTableColumn;
    this.ZUP = paramInt;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zzm4;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zzm4;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zzm4;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public TableColumn ZUS() {
    return this.ZUS;
  }
  
  public int ZUP() {
    return this.ZUP;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzm4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */