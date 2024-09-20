package burp;

import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import javax.swing.JTabbedPane;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public final class Zlfz extends Record {
  private final JTabbedPane zs0;
  
  private final Point zs1;
  
  public Zlfz(JTabbedPane paramJTabbedPane, Point paramPoint) {
    this.zs0 = paramJTabbedPane;
    this.zs1 = paramPoint;
  }
  
  public int Zs() {
    return this.zs0.indexAtLocation(this.zs1.x, this.zs1.y);
  }
  
  public static Zlfz Zw(Transferable paramTransferable) {
    if (paramTransferable.isDataFlavorSupported(Zstv.Zb))
      try {
        Object object = paramTransferable.getTransferData(Zstv.Zb);
        Zlfz zlfz = (Zlfz)object;
        return (object instanceof Zlfz) ? zlfz : null;
      } catch (UnsupportedFlavorException|java.io.IOException unsupportedFlavorException) {
        Zah.Zl(unsupportedFlavorException, Zk_.UNEXPECTED);
      }  
    return null;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlfz;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlfz;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlfz;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public JTabbedPane Zs0() {
    return this.zs0;
  }
  
  public Point Zs1() {
    return this.zs1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlfz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */