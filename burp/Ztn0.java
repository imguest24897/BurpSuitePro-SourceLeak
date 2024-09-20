package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import javax.swing.RowSorter;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Ztn0 extends AbstractTableModel implements Zztu {
  protected byte[] ZV;
  
  protected String[] Zf;
  
  protected int[] Zc;
  
  protected int ZZ = 3;
  
  protected boolean Zx = false;
  
  protected boolean Zu = true;
  
  protected RowSorter.SortKey ZD;
  
  protected RowSorter.SortKey ZO;
  
  protected RowSorter.SortKey Zj;
  
  private boolean[] Zt;
  
  public static final Zkgc ZI = new Zkgc();
  
  public static final Zlr1 ZQ = new Zlr1();
  
  public static final Zz5b ZG = new Zz5b();
  
  static final Zgg2 ZF = new Zgg2();
  
  static final Ze3_ ZL = new Ze3_();
  
  public static final Zegq ZB = new Zegq();
  
  public static final Zla Za = new Zla();
  
  public static final Comparator<Ze9n> ZS = Ztn0::lambda$static$0;
  
  private final Zxr3 ZY = new Zxr3();
  
  private static Zbqc[] Zs;
  
  protected byte Ze(int paramInt) {
    return this.ZV[paramInt];
  }
  
  protected String Zr(int paramInt) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return (this.Zf == null) ? null : this.Zf[paramInt];
  }
  
  protected boolean ZI(int paramInt) {
    return this.Zt[paramInt];
  }
  
  protected void Zw(int paramInt, boolean paramBoolean) {
    this.Zt[paramInt] = paramBoolean;
  }
  
  protected int[] Zr() {
    return this.Zc;
  }
  
  protected String ZQ(Object paramObject, int paramInt1, int paramInt2) {
    try {
      if (paramObject == null)
        return ""; 
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      int i;
      long l;
      switch (Ze(paramInt2)) {
        case 1:
        case 14:
          return paramObject.toString();
        case 2:
          i = ((Integer)paramObject).intValue();
          try {
          
          } catch (Exception exception) {
            throw b(null);
          } 
          return (i == 0) ? "" : Integer.toString(i);
        case 5:
          l = ((Long)paramObject).longValue();
          try {
          
          } catch (Exception exception) {
            throw b(null);
          } 
          return (l == 0L) ? "" : Zlb0.Zd.format(new Date(l));
        case 0:
          return (String)paramObject;
        case 17:
          return "";
      } 
      Zuh.Zv(false, Zqf.Zk, Ze(paramInt2));
      return paramObject.toString();
    } catch (Exception exception) {
      Zah.ZU(exception, Zuh.Zr(new Object[] { Integer.valueOf(paramInt2), getColumnName(paramInt2), paramObject }, ), Zk_.UNEXPECTED);
      return paramObject.toString();
    } 
  }
  
  public int getColumnCount() {
    return (Zr()).length;
  }
  
  public String getColumnName(int paramInt) {
    try {
      return Zr(paramInt);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return "";
    } 
  }
  
  public Class<?> getColumnClass(int paramInt) {
    try {
      switch (Ze(paramInt)) {
        case 0:
          return String.class;
        case 1:
        case 2:
          return Integer.class;
        case 3:
          return Boolean.class;
        case 5:
        case 14:
          return Long.class;
        case 6:
          return Date.class;
        case 7:
          return Object.class;
        case 17:
          return Ze9n.class;
      } 
      Zuh.Zv(false, Zqf.Zk, Ze(paramInt));
      return String.class;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return String.class;
    } 
  }
  
  protected Comparator<?> ZS(int paramInt) {
    try {
      switch (Ze(paramInt)) {
        case 0:
          return ZI;
        case 1:
          return ZG;
        case 2:
          return new Zsgt(ZI(paramInt));
        case 3:
          return ZQ;
        case 5:
          return new Zgmd(ZI(paramInt));
        case 6:
          return ZF;
        case 7:
          return null;
        case 14:
          return ZL;
        case 17:
          return ZS;
      } 
      Zuh.Zv(false, Zqf.Zk, Ze(paramInt));
      return null;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public void Zx(Zbws paramZbws) {
    Zk(paramZbws);
    try {
      paramZbws.setAutoResizeMode(this.ZZ);
      if (this.Zx)
        paramZbws.setTableHeader(null); 
      if (this.Zu) {
        Zenb zenb = new Zenb(this);
        paramZbws.setRowSorter(zenb);
        zenb.setSortsOnUpdates(true);
        if (this.ZD != null) {
          ArrayList<RowSorter.SortKey> arrayList = new ArrayList();
          try {
            arrayList.add(this.ZD);
            if (this.ZO != null)
              arrayList.add(this.ZO); 
          } catch (Exception exception) {
            throw b(null);
          } 
          zenb.setSortKeys(arrayList);
          this.Zj = this.ZD;
        } 
      } 
      paramZbws.setDefaultRenderer(Boolean.class, new Zzgf());
      paramZbws.setDefaultRenderer(String.class, new Zm2a(this));
      paramZbws.setDefaultRenderer(Integer.class, new Zm2a(this));
      paramZbws.setDefaultRenderer(Long.class, new Zm2a(this));
      paramZbws.setDefaultRenderer(Ze9n.class, new Zm2e());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void Zk(Zbws paramZbws) {
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    try {
      int[] arrayOfInt = Zr();
      if (arrayOfInt != null) {
        TableColumnModel tableColumnModel = paramZbws.getColumnModel();
        int i = getColumnCount();
        int j = Zre7.Zu(paramZbws).ZE();
        byte b = 0;
        while (b < i) {
          tableColumnModel.getColumn(b).setPreferredWidth(arrayOfInt[b] * j);
          b++;
          if (arrayOfZbqc == null)
            break; 
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public Zxr3 ZP() {
    return this.ZY;
  }
  
  public void fireTableCellUpdated(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zw : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 27
    //   10: aload_0
    //   11: iload_1
    //   12: iload_2
    //   13: invokespecial fireTableCellUpdated : (II)V
    //   16: aload_3
    //   17: ifnonnull -> 45
    //   20: goto -> 27
    //   23: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: iload_1
    //   29: iload_2
    //   30: <illegal opcode> run : (Lburp/Ztn0;II)Ljava/lang/Runnable;
    //   35: invokestatic invokeAndWait : (Ljava/lang/Runnable;)V
    //   38: goto -> 45
    //   41: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: goto -> 71
    //   48: astore #4
    //   50: aload #4
    //   52: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   55: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   58: goto -> 71
    //   61: astore #4
    //   63: aload #4
    //   65: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   68: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   71: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/InterruptedException
    //   4	45	48	java/lang/InterruptedException
    //   4	45	61	java/lang/Exception
    //   10	38	41	java/lang/InterruptedException
  }
  
  public void fireTableDataChanged() {
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    try {
      try {
        if (SwingUtilities.isEventDispatchThread()) {
          try {
            super.fireTableDataChanged();
            if (arrayOfZbqc == null)
              SwingUtilities.invokeAndWait(this::lambda$fireTableDataChanged$2); 
          } catch (InterruptedException interruptedException) {
            throw b(null);
          } 
          return;
        } 
      } catch (InterruptedException interruptedException) {
        throw b(null);
      } 
      SwingUtilities.invokeAndWait(this::lambda$fireTableDataChanged$2);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void fireTableChanged(TableModelEvent paramTableModelEvent) {
    // Byte code:
    //   0: invokestatic Zw : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 26
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial fireTableChanged : (Ljavax/swing/event/TableModelEvent;)V
    //   15: aload_2
    //   16: ifnonnull -> 43
    //   19: goto -> 26
    //   22: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: aload_0
    //   27: aload_1
    //   28: <illegal opcode> run : (Lburp/Ztn0;Ljavax/swing/event/TableModelEvent;)Ljava/lang/Runnable;
    //   33: invokestatic invokeAndWait : (Ljava/lang/Runnable;)V
    //   36: goto -> 43
    //   39: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: goto -> 65
    //   46: astore_3
    //   47: aload_3
    //   48: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   51: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   54: goto -> 65
    //   57: astore_3
    //   58: aload_3
    //   59: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   62: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   65: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/IndexOutOfBoundsException
    //   4	43	46	java/lang/IndexOutOfBoundsException
    //   4	43	46	java/lang/InterruptedException
    //   4	43	46	java/lang/NullPointerException
    //   4	43	57	java/lang/Exception
    //   10	36	39	java/lang/IndexOutOfBoundsException
  }
  
  public void fireTableRowsDeleted(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zw : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 27
    //   10: aload_0
    //   11: iload_1
    //   12: iload_2
    //   13: invokespecial fireTableRowsDeleted : (II)V
    //   16: aload_3
    //   17: ifnonnull -> 45
    //   20: goto -> 27
    //   23: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: iload_1
    //   29: iload_2
    //   30: <illegal opcode> run : (Lburp/Ztn0;II)Ljava/lang/Runnable;
    //   35: invokestatic invokeAndWait : (Ljava/lang/Runnable;)V
    //   38: goto -> 45
    //   41: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: goto -> 71
    //   48: astore #4
    //   50: aload #4
    //   52: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   55: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   58: goto -> 71
    //   61: astore #4
    //   63: aload #4
    //   65: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   68: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   71: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/InterruptedException
    //   4	45	48	java/lang/InterruptedException
    //   4	45	61	java/lang/Exception
    //   10	38	41	java/lang/InterruptedException
  }
  
  public void fireTableRowsInserted(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zw : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 27
    //   10: aload_0
    //   11: iload_1
    //   12: iload_2
    //   13: invokespecial fireTableRowsInserted : (II)V
    //   16: aload_3
    //   17: ifnonnull -> 45
    //   20: goto -> 27
    //   23: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: iload_1
    //   29: iload_2
    //   30: <illegal opcode> run : (Lburp/Ztn0;II)Ljava/lang/Runnable;
    //   35: invokestatic invokeAndWait : (Ljava/lang/Runnable;)V
    //   38: goto -> 45
    //   41: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: goto -> 71
    //   48: astore #4
    //   50: aload #4
    //   52: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   55: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   58: goto -> 71
    //   61: astore #4
    //   63: aload #4
    //   65: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   68: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   71: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/InterruptedException
    //   4	45	48	java/lang/InterruptedException
    //   4	45	61	java/lang/Exception
    //   10	38	41	java/lang/InterruptedException
  }
  
  public void fireTableRowsUpdated(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zw : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 27
    //   10: aload_0
    //   11: iload_1
    //   12: iload_2
    //   13: invokespecial fireTableRowsUpdated : (II)V
    //   16: aload_3
    //   17: ifnonnull -> 45
    //   20: goto -> 27
    //   23: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: iload_1
    //   29: iload_2
    //   30: <illegal opcode> run : (Lburp/Ztn0;II)Ljava/lang/Runnable;
    //   35: invokestatic invokeAndWait : (Ljava/lang/Runnable;)V
    //   38: goto -> 45
    //   41: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: goto -> 71
    //   48: astore #4
    //   50: aload #4
    //   52: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   55: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   58: goto -> 71
    //   61: astore #4
    //   63: aload #4
    //   65: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   68: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   71: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/InterruptedException
    //   4	45	48	java/lang/InterruptedException
    //   4	45	61	java/lang/Exception
    //   10	38	41	java/lang/InterruptedException
  }
  
  public void fireTableStructureChanged() {
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    try {
      try {
        if (SwingUtilities.isEventDispatchThread()) {
          try {
            super.fireTableStructureChanged();
            if (arrayOfZbqc == null)
              SwingUtilities.invokeAndWait(this::lambda$fireTableStructureChanged$7); 
          } catch (InterruptedException interruptedException) {
            throw b(null);
          } 
          return;
        } 
      } catch (InterruptedException interruptedException) {
        throw b(null);
      } 
      SwingUtilities.invokeAndWait(this::lambda$fireTableStructureChanged$7);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void lambda$fireTableStructureChanged$7() {
    ZW(this);
  }
  
  private void lambda$fireTableRowsUpdated$6(int paramInt1, int paramInt2) {
    Zu(this, paramInt1, paramInt2);
  }
  
  private void lambda$fireTableRowsInserted$5(int paramInt1, int paramInt2) {
    Zj(this, paramInt1, paramInt2);
  }
  
  private void lambda$fireTableRowsDeleted$4(int paramInt1, int paramInt2) {
    Zv(this, paramInt1, paramInt2);
  }
  
  private void lambda$fireTableChanged$3(TableModelEvent paramTableModelEvent) {
    Zt(this, paramTableModelEvent);
  }
  
  private void lambda$fireTableDataChanged$2() {
    Za(this);
  }
  
  private void lambda$fireTableCellUpdated$1(int paramInt1, int paramInt2) {
    Zg(this, paramInt1, paramInt2);
  }
  
  private static int lambda$static$0(Ze9n paramZe9n1, Ze9n paramZe9n2) {
    return 0;
  }
  
  static void ZW(Ztn0 paramZtn0) {
    paramZtn0.fireTableStructureChanged();
  }
  
  static void Zu(Ztn0 paramZtn0, int paramInt1, int paramInt2) {
    paramZtn0.fireTableRowsUpdated(paramInt1, paramInt2);
  }
  
  static void Zj(Ztn0 paramZtn0, int paramInt1, int paramInt2) {
    paramZtn0.fireTableRowsInserted(paramInt1, paramInt2);
  }
  
  static void Zv(Ztn0 paramZtn0, int paramInt1, int paramInt2) {
    paramZtn0.fireTableRowsDeleted(paramInt1, paramInt2);
  }
  
  static void Zt(Ztn0 paramZtn0, TableModelEvent paramTableModelEvent) {
    paramZtn0.fireTableChanged(paramTableModelEvent);
  }
  
  static void Za(Ztn0 paramZtn0) {
    paramZtn0.fireTableDataChanged();
  }
  
  static void Zg(Ztn0 paramZtn0, int paramInt1, int paramInt2) {
    paramZtn0.fireTableCellUpdated(paramInt1, paramInt2);
  }
  
  public static void Z_(Zbqc[] paramArrayOfZbqc) {
    Zs = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZA() {
    return Zs;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    Z_(null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztn0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */