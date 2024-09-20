package burp;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Zmua<T> extends Zmub<T> implements Zkuf {
  private final ReadWriteLock Zr = new ReentrantReadWriteLock();
  
  private final Object ZD = new Object();
  
  private final List<Zsl4<T>> Zu = new ArrayList<>();
  
  private final ObservableList<T> ZJ;
  
  private final ObservableList<T> Zh;
  
  private final Zgra<Runnable> ZZ;
  
  protected final ObservableList<T> Zl;
  
  private JTable Zw;
  
  private static int[] Zp;
  
  public Zmua(Zmjx<T> paramZmjx, ObservableList<T> paramObservableList) {
    this(paramZmjx, paramObservableList, -1L);
  }
  
  public Zmua(Zmjx<T> paramZmjx, ObservableList<T> paramObservableList, long paramLong) {
    super(paramZmjx);
    this.Zh = paramObservableList;
    this.Zl = FXCollections.observableArrayList((Collection)paramObservableList);
    int[] arrayOfInt = ZG();
    try {
      this.ZJ = FXCollections.observableArrayList((Collection)this.Zl);
      this.ZZ = Zn(paramLong);
      this.Zl.addListener(this::lambda$new$0);
      this.ZJ.addListener(paramZmjx::lambda$new$1);
      this.ZJ.addListener(this::lambda$new$2);
      this.ZJ.addListener(this::lambda$new$3);
      ZQ();
      if (arrayOfInt != null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  void Zm() {
    this.Z_.ZJ(this::lambda$applyPending$4);
  }
  
  void ZE() {
    ZN();
    if (this.Zw != null) {
      RowSorter<? extends TableModel> rowSorter = this.Zw.getRowSorter();
      if (rowSorter instanceof Zm48) {
        Zm48 zm48 = (Zm48)rowSorter;
        zm48.Zv(true);
        Zw();
        zm48.Zv(false);
      } 
    } 
  }
  
  public int ZV() {
    Objects.requireNonNull(this.Zl);
    return this.Z_.ZL(this.Zl::size);
  }
  
  public Object Zw(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zxr3;
    //   4: aload_0
    //   5: iload_2
    //   6: iload_1
    //   7: <illegal opcode> get : (Lburp/Zmua;II)Ljava/util/function/Supplier;
    //   12: invokevirtual ZJ : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   15: areturn
  }
  
  public void ZU() {
    this.ZZ.Zv();
  }
  
  public T ZW(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zxr3;
    //   4: aload_0
    //   5: iload_1
    //   6: <illegal opcode> get : (Lburp/Zmua;I)Ljava/util/function/Supplier;
    //   11: invokevirtual ZJ : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   14: areturn
  }
  
  public List<T> Zz() {
    return this.Z_.<List<T>>ZJ(this::lambda$getElements$8);
  }
  
  public int Zj(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zxr3;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> getAsInt : (Lburp/Zmua;Ljava/lang/Object;)Ljava/util/function/IntSupplier;
    //   11: invokevirtual ZL : (Ljava/util/function/IntSupplier;)I
    //   14: ireturn
  }
  
  public int getRowCount() {
    return this.Z_.ZL(this::lambda$getRowCount$11);
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zxr3;
    //   4: aload_0
    //   5: iload_2
    //   6: iload_1
    //   7: <illegal opcode> get : (Lburp/Zmua;II)Ljava/util/function/Supplier;
    //   12: invokevirtual ZJ : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   15: areturn
  }
  
  public void setValueAt(Object paramObject, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zxr3;
    //   4: aload_0
    //   5: iload_2
    //   6: iload_3
    //   7: aload_1
    //   8: <illegal opcode> run : (Lburp/Zmua;IILjava/lang/Object;)Ljava/lang/Runnable;
    //   13: invokevirtual ZF : (Ljava/lang/Runnable;)V
    //   16: return
  }
  
  public void Zd(T paramT) {
    this.ZZ.Zv();
  }
  
  public void fireTableRowsUpdated(int paramInt1, int paramInt2) {
    super.fireTableRowsUpdated(paramInt1, paramInt2);
    int i = paramInt1;
    int[] arrayOfInt = ZG();
    while (i <= paramInt2) {
      this.ZM.Zo(i, ZW(i));
      i++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  public void fireTableCellUpdated(int paramInt1, int paramInt2) {
    super.fireTableCellUpdated(paramInt1, paramInt2);
    this.ZM.Zo(paramInt1, ZW(paramInt1));
  }
  
  public void fireTableChanged(TableModelEvent paramTableModelEvent) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: astore_2
    //   4: invokestatic isDispatchThread : ()Z
    //   7: ifeq -> 26
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial fireTableChanged : (Ljavax/swing/event/TableModelEvent;)V
    //   15: aload_2
    //   16: ifnull -> 43
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   25: athrow
    //   26: aload_0
    //   27: aload_1
    //   28: <illegal opcode> run : (Lburp/Zmua;Ljavax/swing/event/TableModelEvent;)Ljava/lang/Runnable;
    //   33: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   42: athrow
    //   43: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/ArrayIndexOutOfBoundsException
    //   10	36	39	java/lang/ArrayIndexOutOfBoundsException
  }
  
  private void ZQ() {
    this.Zh.addListener(new Zx4a<>(this.Zl, this.ZZ));
  }
  
  protected void ZB() {
    JTable jTable = ZN();
    int[] arrayOfInt = ZG();
    try {
      if (jTable != null)
        try {
          if (jTable.getRowSorter() instanceof Zm48) {
            try {
              jTable.getRowSorter().allRowsChanged();
              if (arrayOfInt != null) {
                Zm();
                Zw();
                return;
              } 
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
              throw a(null);
            } 
            return;
          } 
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    Zm();
    Zw();
  }
  
  private void Zw() {
    this.Z_.ZJ(this::lambda$fireTableDataChangedAndReapplySelections$15);
  }
  
  private JTable ZN() {
    int[] arrayOfInt = ZG();
    try {
      if (this.Zw != null)
        return this.Zw; 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    TableModelListener[] arrayOfTableModelListener1 = this.listenerList.<TableModelListener>getListeners(TableModelListener.class);
    TableModelListener[] arrayOfTableModelListener2 = arrayOfTableModelListener1;
    int i = arrayOfTableModelListener2.length;
    byte b = 0;
    while (b < i) {
      TableModelListener tableModelListener = arrayOfTableModelListener2[b];
      if (tableModelListener instanceof JTable) {
        JTable jTable = (JTable)tableModelListener;
        this.Zw = jTable;
        return this.Zw;
      } 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return null;
  }
  
  public int[] Zs() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZN : ()Ljavax/swing/JTable;
    //   4: pop
    //   5: aload_0
    //   6: getfield Zw : Ljavax/swing/JTable;
    //   9: ifnonnull -> 20
    //   12: iconst_0
    //   13: newarray int
    //   15: areturn
    //   16: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   19: athrow
    //   20: aload_0
    //   21: getfield Zw : Ljavax/swing/JTable;
    //   24: invokevirtual getSelectedRows : ()[I
    //   27: astore_1
    //   28: aload_1
    //   29: arraylength
    //   30: newarray int
    //   32: astore_2
    //   33: aload_2
    //   34: aload_0
    //   35: aload_1
    //   36: <illegal opcode> applyAsInt : (Lburp/Zmua;[I)Ljava/util/function/IntUnaryOperator;
    //   41: invokestatic setAll : ([ILjava/util/function/IntUnaryOperator;)V
    //   44: goto -> 55
    //   47: astore_3
    //   48: aload_3
    //   49: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   52: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   55: aload_2
    //   56: areturn
    // Exception table:
    //   from	to	target	type
    //   0	16	16	java/lang/ArrayIndexOutOfBoundsException
    //   33	44	47	java/lang/ArrayIndexOutOfBoundsException
  }
  
  public void ZV(int[] paramArrayOfint) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: aload_0
    //   4: invokevirtual ZN : ()Ljavax/swing/JTable;
    //   7: pop
    //   8: astore_2
    //   9: aload_0
    //   10: getfield Zw : Ljavax/swing/JTable;
    //   13: ifnull -> 39
    //   16: aload_1
    //   17: ifnull -> 39
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   26: athrow
    //   27: aload_1
    //   28: arraylength
    //   29: ifne -> 44
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   38: athrow
    //   39: return
    //   40: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   43: athrow
    //   44: aload_0
    //   45: getfield Zw : Ljavax/swing/JTable;
    //   48: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   51: astore_3
    //   52: aload_3
    //   53: iconst_1
    //   54: invokeinterface setValueIsAdjusting : (Z)V
    //   59: aload_3
    //   60: invokeinterface clearSelection : ()V
    //   65: aload_0
    //   66: invokevirtual getRowCount : ()I
    //   69: istore #4
    //   71: iconst_m1
    //   72: istore #5
    //   74: iconst_m1
    //   75: istore #6
    //   77: aload_1
    //   78: astore #7
    //   80: aload #7
    //   82: arraylength
    //   83: istore #8
    //   85: iconst_0
    //   86: istore #9
    //   88: iload #9
    //   90: iload #8
    //   92: if_icmpge -> 199
    //   95: aload #7
    //   97: iload #9
    //   99: iaload
    //   100: istore #10
    //   102: iload #10
    //   104: iflt -> 192
    //   107: iload #10
    //   109: iload #4
    //   111: if_icmpge -> 192
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   120: athrow
    //   121: aload_0
    //   122: getfield Zw : Ljavax/swing/JTable;
    //   125: iload #10
    //   127: invokevirtual convertRowIndexToView : (I)I
    //   130: istore #11
    //   132: iload #11
    //   134: iflt -> 192
    //   137: iload #6
    //   139: iconst_m1
    //   140: if_icmpne -> 158
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   149: athrow
    //   150: iload #11
    //   152: istore #6
    //   154: aload_2
    //   155: ifnull -> 188
    //   158: iload #11
    //   160: iload #5
    //   162: iconst_1
    //   163: iadd
    //   164: if_icmpeq -> 188
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   173: athrow
    //   174: aload_3
    //   175: iload #6
    //   177: iload #5
    //   179: invokeinterface addSelectionInterval : (II)V
    //   184: iload #11
    //   186: istore #6
    //   188: iload #11
    //   190: istore #5
    //   192: iinc #9, 1
    //   195: aload_2
    //   196: ifnull -> 88
    //   199: iload #6
    //   201: iconst_m1
    //   202: if_icmpeq -> 222
    //   205: aload_3
    //   206: iload #6
    //   208: iload #5
    //   210: invokeinterface addSelectionInterval : (II)V
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   221: athrow
    //   222: aload_3
    //   223: iconst_0
    //   224: invokeinterface setValueIsAdjusting : (Z)V
    //   229: return
    // Exception table:
    //   from	to	target	type
    //   9	20	23	java/lang/ArrayIndexOutOfBoundsException
    //   16	32	35	java/lang/ArrayIndexOutOfBoundsException
    //   27	40	40	java/lang/ArrayIndexOutOfBoundsException
    //   102	114	117	java/lang/ArrayIndexOutOfBoundsException
    //   132	143	146	java/lang/ArrayIndexOutOfBoundsException
    //   154	167	170	java/lang/ArrayIndexOutOfBoundsException
    //   199	215	218	java/lang/ArrayIndexOutOfBoundsException
  }
  
  public int Zg() {
    ZN();
    JTable jTable = this.Zw;
    Zbws zbws = (Zbws)jTable;
    return (jTable instanceof Zbws) ? zbws.ZW().Zn() : -1;
  }
  
  public void Zm(int paramInt) {
    Zbws zbws;
    ZN();
    if (paramInt >= 0) {
      JTable jTable = this.Zw;
      if (jTable instanceof Zbws) {
        zbws = (Zbws)jTable;
        try {
          if (paramInt < ZV()) {
            try {
              if (this.Zw.convertRowIndexToView(paramInt) < 0) {
                zbws.ZW().ZO(-1);
                return;
              } 
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
              throw a(null);
            } 
            return;
          } 
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } else {
      return;
    } 
    zbws.ZW().ZO(-1);
  }
  
  protected Zgra<Runnable> Zn(long paramLong) {
    try {
      if (paramLong > 0L)
        return new Ztdp<>(EventQueue::invokeLater, new Zs6a(this), paramLong::lambda$createEventQueueBatchJob$17); 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return new Zxnd<>(EventQueue::invokeLater, new Zs6a(this));
  }
  
  private static long lambda$createEventQueueBatchJob$17(long paramLong) {
    return paramLong;
  }
  
  private int lambda$getSelectedModelIndices$16(int[] paramArrayOfint, int paramInt) {
    return this.Zw.convertRowIndexToModel(paramArrayOfint[paramInt]);
  }
  
  private void lambda$fireTableDataChangedAndReapplySelections$15() {
    int[] arrayOfInt = Zs();
    int i = Zg();
    fireTableDataChanged();
    ZV(arrayOfInt);
    Zm(i);
  }
  
  private void lambda$fireTableChanged$14(TableModelEvent paramTableModelEvent) {
    super.fireTableChanged(paramTableModelEvent);
  }
  
  private void lambda$setValueAt$13(int paramInt1, int paramInt2, Object paramObject) {
    T t = ZW(paramInt1);
    ZB(paramInt2, t, paramObject);
    int[] arrayOfInt = ZG();
    try {
      if (paramInt2 == 0)
        try {
          if (isCellEditable(paramInt1, paramInt2))
            try {
              if (t instanceof Zsmr) {
                try {
                  fireTableRowsUpdated(paramInt1, paramInt1);
                  if (arrayOfInt != null) {
                    fireTableCellUpdated(paramInt1, paramInt2);
                    return;
                  } 
                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                  throw a(null);
                } 
                return;
              } 
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
              throw a(null);
            }  
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    fireTableCellUpdated(paramInt1, paramInt2);
  }
  
  private Object lambda$getValueAt$12(int paramInt1, int paramInt2) {
    this.Zr.readLock().lock();
    try {
      return ZS(paramInt1, (T)this.ZJ.get(paramInt2));
    } finally {
      this.Zr.readLock().unlock();
    } 
  }
  
  private int lambda$getRowCount$11() {
    this.Zr.readLock().lock();
    try {
      return this.ZJ.size();
    } finally {
      this.Zr.readLock().unlock();
    } 
  }
  
  private int lambda$lastIndexOf$10(Object paramObject) {
    this.Zr.readLock().lock();
    try {
      return this.ZJ.lastIndexOf(paramObject);
    } finally {
      this.Zr.readLock().unlock();
    } 
  }
  
  private int lambda$indexOf$9(Object paramObject) {
    this.Zr.readLock().lock();
    try {
      return this.ZJ.indexOf(paramObject);
    } finally {
      this.Zr.readLock().unlock();
    } 
  }
  
  private ArrayList lambda$getElements$8() {
    this.Zr.readLock().lock();
    try {
      return new ArrayList<>((Collection<? extends T>)this.ZJ);
    } finally {
      this.Zr.readLock().unlock();
    } 
  }
  
  private Object lambda$getElement$7(int paramInt) {
    this.Zr.readLock().lock();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZJ.size());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          throw a(null);
        }  
      return null;
    } finally {
      this.Zr.readLock().unlock();
    } 
  }
  
  private boolean lambda$hasPendingChanges$6() {
    synchronized (this.ZD) {
      return !this.Zu.isEmpty();
    } 
  }
  
  private Object lambda$getPendingValueAt$5(int paramInt1, int paramInt2) {
    return ZS(paramInt1, (T)this.Zl.get(paramInt2));
  }
  
  private void lambda$applyPending$4() {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: aload_0
    //   4: getfield Zr : Ljava/util/concurrent/locks/ReadWriteLock;
    //   7: invokeinterface writeLock : ()Ljava/util/concurrent/locks/Lock;
    //   12: invokeinterface lock : ()V
    //   17: astore_1
    //   18: aload_0
    //   19: getfield ZD : Ljava/lang/Object;
    //   22: dup
    //   23: astore_2
    //   24: monitorenter
    //   25: aload_0
    //   26: getfield Zu : Ljava/util/List;
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore_3
    //   35: aload_3
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 193
    //   44: aload_3
    //   45: invokeinterface next : ()Ljava/lang/Object;
    //   50: checkcast burp/Zsl4
    //   53: astore #4
    //   55: aload #4
    //   57: invokevirtual ZQC : ()Z
    //   60: ifeq -> 154
    //   63: aload #4
    //   65: invokevirtual ZQq : ()I
    //   68: aload_0
    //   69: getfield ZJ : Ljavafx/collections/ObservableList;
    //   72: invokeinterface size : ()I
    //   77: if_icmpne -> 122
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   86: athrow
    //   87: aload #4
    //   89: invokevirtual ZQJ : ()I
    //   92: ifne -> 122
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   101: athrow
    //   102: aload_0
    //   103: getfield ZJ : Ljavafx/collections/ObservableList;
    //   106: invokeinterface clear : ()V
    //   111: aload_1
    //   112: ifnull -> 154
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   121: athrow
    //   122: aload_0
    //   123: getfield ZJ : Ljavafx/collections/ObservableList;
    //   126: aload #4
    //   128: invokevirtual ZQJ : ()I
    //   131: aload #4
    //   133: invokevirtual ZQJ : ()I
    //   136: aload #4
    //   138: invokevirtual ZQq : ()I
    //   141: iadd
    //   142: invokeinterface remove : (II)V
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   153: athrow
    //   154: aload #4
    //   156: invokevirtual ZQf : ()Z
    //   159: ifeq -> 189
    //   162: aload_0
    //   163: getfield ZJ : Ljavafx/collections/ObservableList;
    //   166: aload #4
    //   168: invokevirtual ZQJ : ()I
    //   171: aload #4
    //   173: invokevirtual ZQZ : ()Ljava/util/List;
    //   176: invokeinterface addAll : (ILjava/util/Collection;)Z
    //   181: pop
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   188: athrow
    //   189: aload_1
    //   190: ifnull -> 35
    //   193: aload_0
    //   194: getfield Zu : Ljava/util/List;
    //   197: invokeinterface clear : ()V
    //   202: aload_2
    //   203: monitorexit
    //   204: goto -> 214
    //   207: astore #5
    //   209: aload_2
    //   210: monitorexit
    //   211: aload #5
    //   213: athrow
    //   214: aload_0
    //   215: getfield Zr : Ljava/util/concurrent/locks/ReadWriteLock;
    //   218: invokeinterface writeLock : ()Ljava/util/concurrent/locks/Lock;
    //   223: invokeinterface unlock : ()V
    //   228: goto -> 250
    //   231: astore #6
    //   233: aload_0
    //   234: getfield Zr : Ljava/util/concurrent/locks/ReadWriteLock;
    //   237: invokeinterface writeLock : ()Ljava/util/concurrent/locks/Lock;
    //   242: invokeinterface unlock : ()V
    //   247: aload #6
    //   249: athrow
    //   250: aload_0
    //   251: invokevirtual ZE : ()V
    //   254: return
    // Exception table:
    //   from	to	target	type
    //   18	214	231	finally
    //   25	204	207	finally
    //   55	80	83	java/lang/ArrayIndexOutOfBoundsException
    //   63	95	98	java/lang/ArrayIndexOutOfBoundsException
    //   87	115	118	java/lang/ArrayIndexOutOfBoundsException
    //   102	147	150	java/lang/ArrayIndexOutOfBoundsException
    //   154	182	185	java/lang/ArrayIndexOutOfBoundsException
    //   207	211	207	finally
    //   231	233	231	finally
  }
  
  private void lambda$new$3(ListChangeListener.Change paramChange) {
    int[] arrayOfInt = ZG();
    while (paramChange.next()) {
      if (paramChange.wasAdded()) {
        JTable jTable = ZN();
        if (jTable instanceof Zbws) {
          Zbws zbws = (Zbws)jTable;
          Zrgg zrgg = zbws.ZW();
          int i = paramChange.getFrom();
          int j = paramChange.getTo() - 1;
          zrgg.ZW(i, j);
        } 
      } 
      if (paramChange.wasRemoved()) {
        JTable jTable = ZN();
        if (jTable instanceof Zbws) {
          Zbws zbws = (Zbws)jTable;
          Zrgg zrgg = zbws.ZW();
          int i = paramChange.getFrom();
          int j = i + paramChange.getRemovedSize() - 1;
          zrgg.ZA(i, j);
        } 
        if (arrayOfInt != null)
          break; 
      } 
    } 
  }
  
  private void lambda$new$2(ListChangeListener.Change paramChange) {
    int[] arrayOfInt = ZG();
    while (paramChange.next()) {
      if (paramChange.wasRemoved()) {
        JTable jTable = ZN();
        if (jTable != null) {
          ListSelectionModel listSelectionModel = jTable.getSelectionModel();
          try {
          
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw a(null);
          } 
          int i = (jTable.getRowSorter() instanceof Zm48) ? ZV() : getRowCount();
          int j = paramChange.getFrom();
          while (j < paramChange.getFrom() + paramChange.getRemovedSize() && j < i) {
            int m = jTable.convertRowIndexToView(j);
            try {
              if (m >= 0)
                listSelectionModel.removeIndexInterval(m, m); 
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
              throw a(null);
            } 
            j++;
            if (arrayOfInt != null)
              break; 
          } 
          int[] arrayOfInt1 = listSelectionModel.getSelectedIndices();
          int k = arrayOfInt1.length;
          byte b = 0;
          while (b < k) {
            int m = arrayOfInt1[b];
            try {
              if (m >= jTable.getRowCount())
                listSelectionModel.removeIndexInterval(m, m); 
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
              throw a(null);
            } 
            b++;
            if (arrayOfInt != null)
              break; 
          } 
        } 
        if (arrayOfInt != null)
          break; 
      } 
    } 
  }
  
  private static void lambda$new$1(Zmjx paramZmjx, ListChangeListener.Change paramChange) {
    int[] arrayOfInt = ZG();
    while (paramChange.next()) {
      if (paramChange.wasAdded()) {
        int i = paramChange.getFrom();
        List list = paramChange.getAddedSubList();
        byte b = 0;
        while (b < list.size()) {
          int j = b + i;
          paramZmjx.ZW(j, list.get(b));
          b++;
          if (arrayOfInt != null)
            break; 
        } 
      } 
      if (paramChange.wasRemoved()) {
        int i = paramChange.getFrom();
        List list = paramChange.getRemoved();
        byte b = 0;
        while (b < list.size()) {
          int j = b + i;
          paramZmjx.ZT(j, list.get(b));
          b++;
          if (arrayOfInt != null)
            break; 
        } 
        if (arrayOfInt != null)
          break; 
      } 
    } 
  }
  
  private void lambda$new$0(ListChangeListener.Change paramChange) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: aload_0
    //   4: getfield ZD : Ljava/lang/Object;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: astore_2
    //   11: aload_1
    //   12: invokevirtual next : ()Z
    //   15: ifeq -> 146
    //   18: aload_1
    //   19: invokevirtual wasReplaced : ()Z
    //   22: ifeq -> 68
    //   25: aload_0
    //   26: getfield Zu : Ljava/util/List;
    //   29: aload_1
    //   30: invokevirtual getFrom : ()I
    //   33: aload_1
    //   34: invokevirtual getRemovedSize : ()I
    //   37: new java/util/ArrayList
    //   40: dup
    //   41: aload_1
    //   42: invokevirtual getAddedSubList : ()Ljava/util/List;
    //   45: invokespecial <init> : (Ljava/util/Collection;)V
    //   48: invokestatic Zf : (IILjava/util/List;)Lburp/Zsl4;
    //   51: invokeinterface add : (Ljava/lang/Object;)Z
    //   56: pop
    //   57: aload_2
    //   58: ifnull -> 11
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   67: athrow
    //   68: aload_1
    //   69: invokevirtual wasAdded : ()Z
    //   72: ifeq -> 114
    //   75: aload_0
    //   76: getfield Zu : Ljava/util/List;
    //   79: aload_1
    //   80: invokevirtual getFrom : ()I
    //   83: new java/util/ArrayList
    //   86: dup
    //   87: aload_1
    //   88: invokevirtual getAddedSubList : ()Ljava/util/List;
    //   91: invokespecial <init> : (Ljava/util/Collection;)V
    //   94: invokestatic ZE : (ILjava/util/List;)Lburp/Zsl4;
    //   97: invokeinterface add : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: aload_2
    //   104: ifnull -> 11
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   113: athrow
    //   114: aload_1
    //   115: invokevirtual wasRemoved : ()Z
    //   118: ifeq -> 11
    //   121: aload_0
    //   122: getfield Zu : Ljava/util/List;
    //   125: aload_1
    //   126: invokevirtual getFrom : ()I
    //   129: aload_1
    //   130: invokevirtual getRemovedSize : ()I
    //   133: invokestatic ZT : (II)Lburp/Zsl4;
    //   136: invokeinterface add : (Ljava/lang/Object;)Z
    //   141: pop
    //   142: aload_2
    //   143: ifnull -> 11
    //   146: aload_3
    //   147: monitorexit
    //   148: goto -> 158
    //   151: astore #4
    //   153: aload_3
    //   154: monitorexit
    //   155: aload #4
    //   157: athrow
    //   158: return
    // Exception table:
    //   from	to	target	type
    //   11	148	151	finally
    //   18	61	64	java/lang/ArrayIndexOutOfBoundsException
    //   68	107	110	java/lang/ArrayIndexOutOfBoundsException
    //   151	155	151	finally
  }
  
  static Zxr3 Zl(Zmua paramZmua) {
    return paramZmua.Z_;
  }
  
  public static void Zg(int[] paramArrayOfint) {
    Zp = paramArrayOfint;
  }
  
  public static int[] ZG() {
    return Zp;
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
  
  static {
    if (ZG() != null)
      Zg(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmua.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */