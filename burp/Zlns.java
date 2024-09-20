package burp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.TableColumn;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlns {
  private final List<Zm0m> ZQ;
  
  private final Map<Zm0m, Integer> ZF;
  
  private final Map<Integer, Zm0m> Zj;
  
  public static Zlns Zf() {
    return new Zlns(List.of(Zm0m.NAME, Zm0m.VALUE, Zm0m.DETAILS));
  }
  
  private Zlns(List<Zm0m> paramList) {
    this.ZQ = paramList;
    this.ZF = new HashMap<>();
    this.Zj = new HashMap<>();
    String str = Zbd7.ZE();
    byte b = 0;
    while (b < paramList.size()) {
      this.ZF.put(paramList.get(b), Integer.valueOf(b));
      this.Zj.put(Integer.valueOf(b), paramList.get(b));
      b++;
      if (str != null)
        break; 
    } 
  }
  
  public int ZE(Zm0m paramZm0m) {
    Integer integer = Integer.valueOf((paramZm0m == Zm0m.NAME) ? ZX() : ((Integer)this.ZF.get(paramZm0m)).intValue());
    return (integer == null) ? -1 : integer.intValue();
  }
  
  public int ZX() {
    Integer integer = this.ZF.get(Zm0m.NAME);
    return (integer == null) ? -1 : integer.intValue();
  }
  
  public Zm0m Zb(int paramInt) {
    Zm0m zm0m = this.Zj.get(Integer.valueOf(paramInt));
    return (zm0m == null) ? Zm0m.UNKNOWN : zm0m;
  }
  
  public String[] Zb() {
    return (String[])this.ZQ.stream().map(Zlns::lambda$columnNames$0).toArray(Zlns::lambda$columnNames$1);
  }
  
  public byte[] ZL() {
    byte[] arrayOfByte = new byte[this.ZQ.size()];
    byte b = 0;
    String str = Zbd7.ZE();
    while (b < arrayOfByte.length) {
      arrayOfByte[b] = ((Zm0m)this.ZQ.get(b)).type;
      b++;
      if (str != null)
        break; 
    } 
    return arrayOfByte;
  }
  
  public int[] Zm() {
    return this.ZQ.stream().mapToInt(Zlns::lambda$columnWidths$2).toArray();
  }
  
  public void Zn(Zbws paramZbws) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Ljava/util/List;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> accept : (Lburp/Zlns;Lburp/Zbws;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  public void Zf(Zbws paramZbws, int paramInt1, int paramInt2) {
    String str = Zbd7.ZE();
    Zuh.Zb(!((Zm0m)this.ZQ.get(paramInt1)).resizable, Zqf.Zr);
    TableColumn tableColumn = paramZbws.getColumnModel().getColumn(paramInt1);
    if (paramInt2 < tableColumn.getMinWidth()) {
      tableColumn.setMinWidth(paramInt2);
      tableColumn.setMaxWidth(paramInt2);
      if (str != null) {
        tableColumn.setMaxWidth(paramInt2);
        tableColumn.setMinWidth(paramInt2);
        return;
      } 
      return;
    } 
    tableColumn.setMaxWidth(paramInt2);
    tableColumn.setMinWidth(paramInt2);
  }
  
  private void lambda$configureTableColumns$3(Zbws paramZbws, Zm0m paramZm0m) {
    paramZbws.getColumnModel().getColumn(((Integer)this.ZF.get(paramZm0m)).intValue()).setResizable(paramZm0m.resizable);
  }
  
  private static int lambda$columnWidths$2(Zm0m paramZm0m) {
    return paramZm0m.width;
  }
  
  private static String[] lambda$columnNames$1(int paramInt) {
    return new String[paramInt];
  }
  
  private static String lambda$columnNames$0(Zm0m paramZm0m) {
    return paramZm0m.displayLabel;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlns.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */