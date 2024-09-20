package burp;

import java.awt.Component;
import java.io.Serializable;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class Ztf implements TableCellRenderer, Serializable {
  private static final Zmqf Zo = new Zmqf();
  
  private static final Zmqz ZR = new Zmqz();
  
  private static final Zbgu Zm = new Zbgu();
  
  private static final Zmqo ZF = new Zmqo();
  
  private static final Zmq6 Zk = new Zmq6();
  
  private static final TableCellRenderer Zr = new Zmq8();
  
  private final Zm23 Ze;
  
  public Ztf() {
    this(false);
  }
  
  public Ztf(boolean paramBoolean) {
    this.Ze = new Zm23(paramBoolean);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 9
    //   4: aload_0
    //   5: getfield Ze : Lburp/Zm23;
    //   8: areturn
    //   9: aload_2
    //   10: dup
    //   11: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: pop
    //   15: astore #8
    //   17: iconst_0
    //   18: istore #9
    //   20: aload #8
    //   22: iload #9
    //   24: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   29: tableswitch default -> 163, 0 -> 72, 1 -> 85, 2 -> 98, 3 -> 111, 4 -> 124, 5 -> 137, 6 -> 150
    //   72: aload #8
    //   74: checkcast java/lang/Throwable
    //   77: astore #10
    //   79: getstatic burp/Ztf.Zr : Ljavax/swing/table/TableCellRenderer;
    //   82: goto -> 167
    //   85: aload #8
    //   87: checkcast javax/swing/Icon
    //   90: astore #11
    //   92: getstatic burp/Ztf.Zo : Lburp/Zmqf;
    //   95: goto -> 167
    //   98: aload #8
    //   100: checkcast java/lang/Number
    //   103: astore #12
    //   105: getstatic burp/Ztf.ZR : Lburp/Zmqz;
    //   108: goto -> 167
    //   111: aload #8
    //   113: checkcast java/lang/Boolean
    //   116: astore #13
    //   118: getstatic burp/Ztf.Zm : Lburp/Zbgu;
    //   121: goto -> 167
    //   124: aload #8
    //   126: checkcast java/time/temporal/TemporalAccessor
    //   129: astore #14
    //   131: getstatic burp/Ztf.ZF : Lburp/Zmqo;
    //   134: goto -> 167
    //   137: aload #8
    //   139: checkcast java/util/Date
    //   142: astore #15
    //   144: getstatic burp/Ztf.ZF : Lburp/Zmqo;
    //   147: goto -> 167
    //   150: aload #8
    //   152: checkcast burp/Zgnm
    //   155: astore #16
    //   157: getstatic burp/Ztf.Zk : Lburp/Zmq6;
    //   160: goto -> 167
    //   163: aload_0
    //   164: getfield Ze : Lburp/Zm23;
    //   167: astore #7
    //   169: aload #7
    //   171: aload_1
    //   172: aload_2
    //   173: iload_3
    //   174: iload #4
    //   176: iload #5
    //   178: iload #6
    //   180: invokeinterface getTableCellRendererComponent : (Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component;
    //   185: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */