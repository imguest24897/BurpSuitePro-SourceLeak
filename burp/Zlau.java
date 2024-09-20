package burp;

import java.util.Comparator;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public interface Zlau<T> {
  Zlqp ZJ();
  
  Comparator<?> Zw(boolean paramBoolean);
  
  String ZV();
  
  T Zo(Zgxp paramZgxp, boolean paramBoolean);
  
  T Zs();
  
  Class<T> Zv();
  
  default TableCellRenderer Zh() {
    return null;
  }
  
  default TableCellEditor Zy() {
    return null;
  }
  
  default int ZG() {
    return 8;
  }
  
  default boolean ZN() {
    return true;
  }
  
  default boolean Zm() {
    return false;
  }
  
  default Object ZT(Zgxp paramZgxp) {
    return Zo(paramZgxp, false);
  }
  
  default void Zd(Zgxp paramZgxp, Object paramObject) {}
  
  default int ZI() {
    return (ZJ()).legacyPersistedId;
  }
  
  default int Zn() {
    return (ZJ()).positionOrder;
  }
  
  default int ZT() {
    return 0;
  }
  
  default Zmk7<Zgxp> Zp() {
    return Zmk7.<Zgxp>Zh(this::ZT).ZL(ZV()).Zg(Zv()).ZZ(ZG()).ZM(Zh()).ZE(Zy()).Zh(Zw(false)).ZP(ZN()).ZR(Zm() ? this::Zd : null).ZH();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlau.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */