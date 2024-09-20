package burp;

import java.util.Date;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.TableCellRenderer;

public class Zgnn {
  private static final TableCellRenderer ZL = new Zm23();
  
  private static final TableCellRenderer Zn = new Zzg8();
  
  private static final TableCellRenderer Zl = new Zmqz();
  
  private static final TableCellRenderer Zx = new Zmqx();
  
  private static final TableCellRenderer Zk = new Zmqo();
  
  private static final TableCellRenderer ZK = new Zmqf();
  
  private static final Map<Class<?>, TableCellRenderer> Z_ = Map.of(Object.class, ZL, Boolean.class, Zn, Number.class, Zl, Float.class, Zx, Double.class, Zx, Date.class, Zk, Icon.class, ZK, ImageIcon.class, ZK);
  
  public static Map<Class<?>, TableCellRenderer> ZL() {
    return Z_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgnn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */