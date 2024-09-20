package burp;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class Zshy extends DefaultTableColumnModel implements Zrmn {
  private final List<TableColumn> Zs;
  
  private final Set<TableColumn> Zw;
  
  private final Set<TableColumn> ZZ;
  
  private final List<TableColumn> Zc;
  
  private final AtomicBoolean Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zshy() {
    this(new ArrayList<>(), new HashSet<>(), new HashSet<>());
  }
  
  public Zshy(List<TableColumn> paramList, Set<TableColumn> paramSet1, Set<TableColumn> paramSet2) {
    this.Zs = paramList;
    this.ZZ = paramSet1;
    this.Zw = paramSet2;
    this.Zc = new ArrayList<>();
    this.Zd = new AtomicBoolean();
  }
  
  public TableColumn ZU(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: ifge -> 10
    //   4: aconst_null
    //   5: areturn
    //   6: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   9: athrow
    //   10: aload_0
    //   11: iload_1
    //   12: <illegal opcode> get : (Lburp/Zshy;I)Ljava/util/function/Supplier;
    //   17: invokestatic Zj : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   20: checkcast javax/swing/table/TableColumn
    //   23: areturn
    // Exception table:
    //   from	to	target	type
    //   0	6	6	java/lang/IllegalArgumentException
  }
  
  public void addColumn(TableColumn paramTableColumn) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 9
    //   4: return
    //   5: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   8: athrow
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/table/TableColumn;)Ljava/lang/Runnable;
    //   16: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   19: return
    // Exception table:
    //   from	to	target	type
    //   0	5	5	java/lang/IllegalArgumentException
  }
  
  public void removeColumn(TableColumn paramTableColumn) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 9
    //   4: return
    //   5: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   8: athrow
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/table/TableColumn;)Ljava/lang/Runnable;
    //   16: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   19: return
    // Exception table:
    //   from	to	target	type
    //   0	5	5	java/lang/IllegalArgumentException
  }
  
  public void moveColumn(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: <illegal opcode> run : (Lburp/Zshy;II)Ljava/lang/Runnable;
    //   8: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public int getColumnCount() {
    Objects.requireNonNull(this.ZZ);
    return Zkjf.Zp(this.ZZ::size);
  }
  
  public Enumeration<TableColumn> getColumns() {
    return Zkjf.<Enumeration<TableColumn>>Zj(this::lambda$getColumns$7);
  }
  
  public TableColumn getColumn(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: ifge -> 10
    //   4: aconst_null
    //   5: areturn
    //   6: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   9: athrow
    //   10: aload_0
    //   11: iload_1
    //   12: <illegal opcode> get : (Lburp/Zshy;I)Ljava/util/function/Supplier;
    //   17: invokestatic Zj : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   20: checkcast javax/swing/table/TableColumn
    //   23: areturn
    // Exception table:
    //   from	to	target	type
    //   0	6	6	java/lang/IllegalArgumentException
  }
  
  public void ZW(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: ifge -> 9
    //   4: return
    //   5: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   8: athrow
    //   9: aload_0
    //   10: iload_1
    //   11: <illegal opcode> run : (Lburp/Zshy;I)Ljava/lang/Runnable;
    //   16: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   19: return
    // Exception table:
    //   from	to	target	type
    //   0	5	5	java/lang/IllegalArgumentException
  }
  
  public void Zt(TableColumn paramTableColumn) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 9
    //   4: return
    //   5: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   8: athrow
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/table/TableColumn;)Ljava/lang/Runnable;
    //   16: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   19: return
    // Exception table:
    //   from	to	target	type
    //   0	5	5	java/lang/IllegalArgumentException
  }
  
  public void ZK(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: ifge -> 9
    //   4: return
    //   5: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   8: athrow
    //   9: aload_0
    //   10: iload_1
    //   11: <illegal opcode> run : (Lburp/Zshy;I)Ljava/lang/Runnable;
    //   16: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   19: return
    // Exception table:
    //   from	to	target	type
    //   0	5	5	java/lang/IllegalArgumentException
  }
  
  public void Z_(TableColumn paramTableColumn) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 9
    //   4: return
    //   5: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   8: athrow
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/table/TableColumn;)Ljava/lang/Runnable;
    //   16: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   19: return
    // Exception table:
    //   from	to	target	type
    //   0	5	5	java/lang/IllegalArgumentException
  }
  
  public boolean Zg(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: ifge -> 10
    //   4: iconst_0
    //   5: ireturn
    //   6: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   9: athrow
    //   10: aload_0
    //   11: iload_1
    //   12: <illegal opcode> getAsBoolean : (Lburp/Zshy;I)Ljava/util/function/BooleanSupplier;
    //   17: invokestatic ZC : (Ljava/util/function/BooleanSupplier;)Z
    //   20: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	6	6	java/lang/IllegalArgumentException
  }
  
  public boolean Zm(TableColumn paramTableColumn) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 10
    //   4: iconst_0
    //   5: ireturn
    //   6: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   9: athrow
    //   10: aload_0
    //   11: aload_1
    //   12: <illegal opcode> getAsBoolean : (Lburp/Zshy;Ljavax/swing/table/TableColumn;)Ljava/util/function/BooleanSupplier;
    //   17: invokestatic ZC : (Ljava/util/function/BooleanSupplier;)Z
    //   20: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	6	6	java/lang/IllegalArgumentException
  }
  
  public int Zm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> getAsInt : (Lburp/Zshy;I)Ljava/util/function/IntSupplier;
    //   7: invokestatic Zp : (Ljava/util/function/IntSupplier;)I
    //   10: ireturn
  }
  
  private int ZE(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> getAsInt : (Lburp/Zshy;I)Ljava/util/function/IntSupplier;
    //   7: invokestatic Zp : (Ljava/util/function/IntSupplier;)I
    //   10: ireturn
  }
  
  public List<Zr8p> Zk(List<? extends RowSorter.SortKey> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 12
    //   4: aload_1
    //   5: goto -> 15
    //   8: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   11: athrow
    //   12: invokestatic emptyList : ()Ljava/util/List;
    //   15: astore_2
    //   16: aload_0
    //   17: aload_2
    //   18: <illegal opcode> get : (Lburp/Zshy;Ljava/util/List;)Ljava/util/function/Supplier;
    //   23: invokestatic Zj : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   26: checkcast java/util/List
    //   29: areturn
    // Exception table:
    //   from	to	target	type
    //   0	8	8	java/lang/IllegalArgumentException
  }
  
  private Zr8p ZT(int paramInt, List<? extends RowSorter.SortKey> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zs : Ljava/util/List;
    //   4: iload_1
    //   5: invokeinterface get : (I)Ljava/lang/Object;
    //   10: checkcast javax/swing/table/TableColumn
    //   13: astore_3
    //   14: aload_2
    //   15: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   20: aload_3
    //   21: <illegal opcode> test : (Ljavax/swing/table/TableColumn;)Ljava/util/function/Predicate;
    //   26: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   31: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   36: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   41: invokeinterface findFirst : ()Ljava/util/Optional;
    //   46: getstatic javax/swing/SortOrder.UNSORTED : Ljavax/swing/SortOrder;
    //   49: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   52: checkcast javax/swing/SortOrder
    //   55: astore #4
    //   57: iconst_0
    //   58: aload_2
    //   59: invokeinterface size : ()I
    //   64: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   67: aload_2
    //   68: aload_3
    //   69: <illegal opcode> test : (Ljava/util/List;Ljavax/swing/table/TableColumn;)Ljava/util/function/IntPredicate;
    //   74: invokeinterface filter : (Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
    //   79: invokeinterface boxed : ()Ljava/util/stream/Stream;
    //   84: invokeinterface findFirst : ()Ljava/util/Optional;
    //   89: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   94: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   97: aconst_null
    //   98: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   101: checkcast burp/Zlcu
    //   104: astore #5
    //   106: aload_3
    //   107: instanceof burp/Zs_o
    //   110: ifeq -> 129
    //   113: aload_3
    //   114: checkcast burp/Zs_o
    //   117: astore #7
    //   119: aload #7
    //   121: invokeinterface Zl : ()Lburp/Zg4f;
    //   126: goto -> 132
    //   129: invokestatic Zj : ()Lburp/Zgym;
    //   132: astore #6
    //   134: aload #6
    //   136: aload_3
    //   137: invokevirtual getIdentifier : ()Ljava/lang/Object;
    //   140: invokeinterface Zf : (Ljava/lang/Object;)Lburp/Zg4f;
    //   145: aload_3
    //   146: invokevirtual getHeaderValue : ()Ljava/lang/Object;
    //   149: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   152: invokeinterface ZU : (Ljava/lang/String;)Lburp/Zg4f;
    //   157: aload_0
    //   158: getfield ZZ : Ljava/util/Set;
    //   161: aload_3
    //   162: invokeinterface contains : (Ljava/lang/Object;)Z
    //   167: invokeinterface ZZ : (Z)Lburp/Zg4f;
    //   172: aload_3
    //   173: invokevirtual getWidth : ()I
    //   176: invokeinterface Zu : (I)Lburp/Zg4f;
    //   181: aload #4
    //   183: invokeinterface ZR : (Ljavax/swing/SortOrder;)Lburp/Zg4f;
    //   188: aload #5
    //   190: invokeinterface ZZ : (Lburp/Zlcu;)Lburp/Zg4f;
    //   195: aload_0
    //   196: getfield Zw : Ljava/util/Set;
    //   199: aload_3
    //   200: invokeinterface contains : (Ljava/lang/Object;)Z
    //   205: invokeinterface ZH : (Z)Lburp/Zg4f;
    //   210: invokeinterface ZW : ()Lburp/Zr8p;
    //   215: areturn
  }
  
  public void ZB(List<Zr8p> paramList, RowSorter<? extends TableModel> paramRowSorter, Predicate<String> paramPredicate) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: <illegal opcode> run : (Lburp/Zshy;Ljava/util/List;Ljavax/swing/RowSorter;Ljava/util/function/Predicate;)Ljava/lang/Runnable;
    //   9: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   12: return
  }
  
  private List<Zr8p> Zp(List<Zr8p> paramList) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: astore_2
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 128
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zr8p
    //   40: astore #5
    //   42: aload #5
    //   44: instanceof burp/Zb2w
    //   47: ifeq -> 108
    //   50: aload_0
    //   51: aload #5
    //   53: invokeinterface name : ()Ljava/lang/String;
    //   58: invokevirtual Zv : (Ljava/lang/Object;)Ljavax/swing/table/TableColumn;
    //   61: astore #6
    //   63: aload #6
    //   65: ifnull -> 104
    //   68: aload_3
    //   69: aload #5
    //   71: invokeinterface Zv : ()Lburp/Zg4f;
    //   76: aload #6
    //   78: invokevirtual getIdentifier : ()Ljava/lang/Object;
    //   81: invokeinterface Zf : (Ljava/lang/Object;)Lburp/Zg4f;
    //   86: invokeinterface ZW : ()Lburp/Zr8p;
    //   91: invokeinterface add : (Ljava/lang/Object;)Z
    //   96: pop
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   103: athrow
    //   104: aload_2
    //   105: ifnull -> 124
    //   108: aload_3
    //   109: aload #5
    //   111: invokeinterface add : (Ljava/lang/Object;)Z
    //   116: pop
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   123: athrow
    //   124: aload_2
    //   125: ifnull -> 20
    //   128: aload_3
    //   129: areturn
    // Exception table:
    //   from	to	target	type
    //   63	97	100	java/lang/IllegalArgumentException
    //   104	117	120	java/lang/IllegalArgumentException
  }
  
  private TableColumn Zv(Object paramObject) {
    Iterator<TableColumn> iterator = this.Zs.iterator();
    String str = Zsn5.ZW();
    while (iterator.hasNext()) {
      TableColumn tableColumn = iterator.next();
      try {
        if (Objects.equals(tableColumn.getHeaderValue(), paramObject))
          return tableColumn; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (str != null)
        break; 
    } 
    return null;
  }
  
  public void ZM() {
    Zkjf.Zb(this::lambda$removeColumns$27);
  }
  
  public void Zd(TableColumn paramTableColumn) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/table/TableColumn;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public boolean ZV(TableColumn paramTableColumn) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> getAsBoolean : (Lburp/Zshy;Ljavax/swing/table/TableColumn;)Ljava/util/function/BooleanSupplier;
    //   7: invokestatic ZC : (Ljava/util/function/BooleanSupplier;)Z
    //   10: ireturn
  }
  
  protected void fireColumnAdded(TableColumnModelEvent paramTableColumnModelEvent) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: astore_2
    //   4: invokestatic isDispatchThread : ()Z
    //   7: ifeq -> 26
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial fireColumnAdded : (Ljavax/swing/event/TableColumnModelEvent;)V
    //   15: aload_2
    //   16: ifnull -> 43
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   25: athrow
    //   26: aload_0
    //   27: aload_1
    //   28: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/event/TableColumnModelEvent;)Ljava/lang/Runnable;
    //   33: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   42: athrow
    //   43: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/IllegalArgumentException
    //   10	36	39	java/lang/IllegalArgumentException
  }
  
  protected void fireColumnRemoved(TableColumnModelEvent paramTableColumnModelEvent) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: astore_2
    //   4: invokestatic isDispatchThread : ()Z
    //   7: ifeq -> 26
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial fireColumnRemoved : (Ljavax/swing/event/TableColumnModelEvent;)V
    //   15: aload_2
    //   16: ifnull -> 43
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   25: athrow
    //   26: aload_0
    //   27: aload_1
    //   28: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/event/TableColumnModelEvent;)Ljava/lang/Runnable;
    //   33: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   42: athrow
    //   43: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/IllegalArgumentException
    //   10	36	39	java/lang/IllegalArgumentException
  }
  
  protected void fireColumnMoved(TableColumnModelEvent paramTableColumnModelEvent) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: astore_2
    //   4: invokestatic isDispatchThread : ()Z
    //   7: ifeq -> 26
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial fireColumnMoved : (Ljavax/swing/event/TableColumnModelEvent;)V
    //   15: aload_2
    //   16: ifnull -> 43
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   25: athrow
    //   26: aload_0
    //   27: aload_1
    //   28: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/event/TableColumnModelEvent;)Ljava/lang/Runnable;
    //   33: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   42: athrow
    //   43: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/IllegalArgumentException
    //   10	36	39	java/lang/IllegalArgumentException
  }
  
  protected void fireColumnMarginChanged() {
    String str = Zsn5.ZW();
    try {
      if (EventQueue.isDispatchThread()) {
        try {
          super.fireColumnMarginChanged();
          if (str != null) {
            EventQueue.invokeLater(this::lambda$fireColumnMarginChanged$37);
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    EventQueue.invokeLater(this::lambda$fireColumnMarginChanged$37);
  }
  
  protected void fireColumnSelectionChanged(ListSelectionEvent paramListSelectionEvent) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: astore_2
    //   4: invokestatic isDispatchThread : ()Z
    //   7: ifeq -> 26
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial fireColumnSelectionChanged : (Ljavax/swing/event/ListSelectionEvent;)V
    //   15: aload_2
    //   16: ifnull -> 43
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   25: athrow
    //   26: aload_0
    //   27: aload_1
    //   28: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/event/ListSelectionEvent;)Ljava/lang/Runnable;
    //   33: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   42: athrow
    //   43: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/IllegalArgumentException
    //   10	36	39	java/lang/IllegalArgumentException
  }
  
  private void Za(List<Zr8p> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_0
    //   5: getfield Zs : Ljava/util/List;
    //   8: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   13: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   18: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   23: invokeinterface toList : ()Ljava/util/List;
    //   28: invokespecial <init> : (Ljava/util/Collection;)V
    //   31: astore_3
    //   32: aload_1
    //   33: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   38: aload_3
    //   39: <illegal opcode> test : (Ljava/util/List;)Ljava/util/function/Predicate;
    //   44: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   49: invokeinterface toList : ()Ljava/util/List;
    //   54: astore #4
    //   56: new java/util/HashMap
    //   59: dup
    //   60: aload #4
    //   62: invokeinterface size : ()I
    //   67: invokespecial <init> : (I)V
    //   70: astore #5
    //   72: invokestatic ZW : ()Ljava/lang/String;
    //   75: aload #5
    //   77: <illegal opcode> apply : (Ljava/util/Map;)Ljava/util/function/Function;
    //   82: astore #6
    //   84: iconst_0
    //   85: istore #7
    //   87: astore_2
    //   88: iload #7
    //   90: aload #4
    //   92: invokeinterface size : ()I
    //   97: if_icmpge -> 192
    //   100: aload #4
    //   102: iload #7
    //   104: invokeinterface get : (I)Ljava/lang/Object;
    //   109: checkcast burp/Zr8p
    //   112: astore #8
    //   114: aload #6
    //   116: aload #8
    //   118: invokeinterface identifier : ()Ljava/lang/String;
    //   123: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   128: checkcast java/lang/Integer
    //   131: invokevirtual intValue : ()I
    //   134: istore #9
    //   136: iload #7
    //   138: istore #10
    //   140: aload_0
    //   141: getfield Zs : Ljava/util/List;
    //   144: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   149: aload #8
    //   151: <illegal opcode> test : (Lburp/Zr8p;)Ljava/util/function/Predicate;
    //   156: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   161: iload #9
    //   163: i2l
    //   164: invokeinterface skip : (J)Ljava/util/stream/Stream;
    //   169: invokeinterface findFirst : ()Ljava/util/Optional;
    //   174: aload_0
    //   175: iload #10
    //   177: <illegal opcode> accept : (Lburp/Zshy;I)Ljava/util/function/Consumer;
    //   182: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   185: iinc #7, 1
    //   188: aload_2
    //   189: ifnull -> 88
    //   192: return
  }
  
  private void Zf(List<Zr8p> paramList, RowSorter<? extends TableModel> paramRowSorter) {
    try {
      if (paramRowSorter != null)
        try {
          if (!paramList.isEmpty()) {
            List<? extends RowSorter.SortKey> list = paramList.stream().filter(Zshy::lambda$setSortKeysWithMetadata$44).sorted(Comparator.comparingInt(Zshy::lambda$setSortKeysWithMetadata$45)).map(this::Zd).filter(Objects::nonNull).toList();
            paramRowSorter.setSortKeys(list);
            return;
          } 
          return;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private RowSorter.SortKey Zd(Zr8p paramZr8p) {
    int i = getColumn(getColumnIndex(paramZr8p.identifier())).getModelIndex();
    SortOrder sortOrder = paramZr8p.sortOrder();
    try {
      if (i != -1) {
        try {
          if (sortOrder == null);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return new RowSorter.SortKey(i, sortOrder);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void ZZ(Predicate<String> paramPredicate, List<Zr8p> paramList) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: aload_0
    //   7: <illegal opcode> test : (Lburp/Zshy;)Ljava/util/function/Predicate;
    //   12: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   17: aload_0
    //   18: aload_1
    //   19: <illegal opcode> accept : (Lburp/Zshy;Ljava/util/function/Predicate;)Ljava/util/function/Consumer;
    //   24: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   29: return
  }
  
  private List<TableColumn> Zf() {
    String str = Zsn5.ZW();
    try {
      if (this.Zd.get())
        return this.Zc; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zc.clear();
    for (TableColumn tableColumn : this.Zs) {
      try {
        if (this.ZZ.contains(tableColumn))
          this.Zc.add(tableColumn); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (str != null)
        break; 
    } 
    this.Zd.set(true);
    return this.Zc;
  }
  
  public void Zo() {
    this.totalColumnWidth = -1;
  }
  
  private void lambda$setColumnWidthsAndVisibility$48(Predicate paramPredicate, Zr8p paramZr8p) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: aload_0
    //   4: aload_0
    //   5: aload_2
    //   6: invokeinterface identifier : ()Ljava/lang/String;
    //   11: invokevirtual getColumnIndex : (Ljava/lang/Object;)I
    //   14: invokevirtual getColumn : (I)Ljavax/swing/table/TableColumn;
    //   17: astore #4
    //   19: astore_3
    //   20: aload_2
    //   21: invokeinterface userResized : ()Z
    //   26: ifeq -> 48
    //   29: aload_0
    //   30: getfield Zw : Ljava/util/Set;
    //   33: aload #4
    //   35: invokeinterface add : (Ljava/lang/Object;)Z
    //   40: pop
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   47: athrow
    //   48: aload #4
    //   50: aload_2
    //   51: invokeinterface width : ()I
    //   56: invokevirtual setPreferredWidth : (I)V
    //   59: aload_1
    //   60: aload_2
    //   61: invokeinterface identifier : ()Ljava/lang/String;
    //   66: invokeinterface test : (Ljava/lang/Object;)Z
    //   71: ifeq -> 90
    //   74: aload_2
    //   75: invokeinterface visible : ()Z
    //   80: ifeq -> 107
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   89: athrow
    //   90: aload_0
    //   91: aload #4
    //   93: invokevirtual Zt : (Ljavax/swing/table/TableColumn;)V
    //   96: aload_3
    //   97: ifnull -> 120
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   106: athrow
    //   107: aload_0
    //   108: aload #4
    //   110: invokevirtual Z_ : (Ljavax/swing/table/TableColumn;)V
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   119: athrow
    //   120: return
    // Exception table:
    //   from	to	target	type
    //   20	41	44	java/lang/IllegalArgumentException
    //   48	83	86	java/lang/IllegalArgumentException
    //   74	100	103	java/lang/IllegalArgumentException
    //   90	113	116	java/lang/IllegalArgumentException
  }
  
  private boolean lambda$setColumnWidthsAndVisibility$47(Zr8p paramZr8p) {
    return this.Zs.stream().anyMatch(paramZr8p::lambda$setColumnWidthsAndVisibility$46);
  }
  
  private static boolean lambda$setColumnWidthsAndVisibility$46(Zr8p paramZr8p, TableColumn paramTableColumn) {
    return Objects.equals(paramTableColumn.getIdentifier(), paramZr8p.identifier());
  }
  
  private static int lambda$setSortKeysWithMetadata$45(Zr8p paramZr8p) {
    Zlcu zlcu = paramZr8p.sortPrecedence();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zlcu == null) ? Integer.MAX_VALUE : zlcu.ordinal();
  }
  
  private static boolean lambda$setSortKeysWithMetadata$44(Zr8p paramZr8p) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramZr8p.sortOrder() != SortOrder.UNSORTED);
  }
  
  private void lambda$moveColumnsToCorrectPosition$43(int paramInt, TableColumn paramTableColumn) {
    Zt(paramTableColumn);
    moveColumn(Zf().indexOf(paramTableColumn), paramInt);
  }
  
  private static boolean lambda$moveColumnsToCorrectPosition$42(Zr8p paramZr8p, TableColumn paramTableColumn) {
    return Objects.equals(paramTableColumn.getIdentifier(), paramZr8p.identifier());
  }
  
  private static Integer lambda$moveColumnsToCorrectPosition$41(Map<String, Integer> paramMap, String paramString) {
    Integer integer = (Integer)paramMap.getOrDefault(paramString, Integer.valueOf(0));
    paramMap.put(paramString, Integer.valueOf(integer.intValue() + 1));
    return integer;
  }
  
  private static boolean lambda$moveColumnsToCorrectPosition$40(List paramList, Zr8p paramZr8p) {
    return paramList.remove(paramZr8p.identifier());
  }
  
  private void lambda$fireColumnSelectionChanged$39(ListSelectionEvent paramListSelectionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/event/ListSelectionEvent;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$fireColumnSelectionChanged$38(ListSelectionEvent paramListSelectionEvent) {
    super.fireColumnSelectionChanged(paramListSelectionEvent);
  }
  
  private void lambda$fireColumnMarginChanged$37() {
    Zkjf.Zb(this::lambda$fireColumnMarginChanged$36);
  }
  
  private void lambda$fireColumnMarginChanged$36() {
    super.fireColumnMarginChanged();
  }
  
  private void lambda$fireColumnMoved$35(TableColumnModelEvent paramTableColumnModelEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/event/TableColumnModelEvent;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$fireColumnMoved$34(TableColumnModelEvent paramTableColumnModelEvent) {
    super.fireColumnMoved(paramTableColumnModelEvent);
  }
  
  private void lambda$fireColumnRemoved$33(TableColumnModelEvent paramTableColumnModelEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/event/TableColumnModelEvent;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$fireColumnRemoved$32(TableColumnModelEvent paramTableColumnModelEvent) {
    super.fireColumnRemoved(paramTableColumnModelEvent);
  }
  
  private void lambda$fireColumnAdded$31(TableColumnModelEvent paramTableColumnModelEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zshy;Ljavax/swing/event/TableColumnModelEvent;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$fireColumnAdded$30(TableColumnModelEvent paramTableColumnModelEvent) {
    super.fireColumnAdded(paramTableColumnModelEvent);
  }
  
  private boolean lambda$hasColumnBeenResized$29(TableColumn paramTableColumn) {
    return this.Zw.contains(paramTableColumn);
  }
  
  private void lambda$setColumnResizedByUser$28(TableColumn paramTableColumn) {
    this.Zw.add(paramTableColumn);
  }
  
  private void lambda$removeColumns$27() {
    this.Zs.clear();
    this.ZZ.clear();
    this.Zd.set(false);
  }
  
  private void lambda$setColumnMetadata$26(List<Zr8p> paramList, RowSorter<? extends TableModel> paramRowSorter, Predicate<String> paramPredicate) {
    List<Zr8p> list = Zp(paramList);
    Za(list);
    Zf(list, paramRowSorter);
    ZZ(paramPredicate, list);
  }
  
  private static boolean lambda$buildTableColumnMetadata$25(List<RowSorter.SortKey> paramList, TableColumn paramTableColumn, int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (((RowSorter.SortKey)paramList.get(paramInt)).getColumn() == paramTableColumn.getModelIndex());
  }
  
  private static boolean lambda$buildTableColumnMetadata$24(TableColumn paramTableColumn, RowSorter.SortKey paramSortKey) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramSortKey.getColumn() == paramTableColumn.getModelIndex());
  }
  
  private List lambda$getColumnMetadata$23(List paramList) {
    // Byte code:
    //   0: iconst_0
    //   1: aload_0
    //   2: getfield Zs : Ljava/util/List;
    //   5: invokeinterface size : ()I
    //   10: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   13: aload_0
    //   14: aload_1
    //   15: <illegal opcode> apply : (Lburp/Zshy;Ljava/util/List;)Ljava/util/function/IntFunction;
    //   20: invokeinterface mapToObj : (Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;
    //   25: invokestatic toList : ()Ljava/util/stream/Collector;
    //   28: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   33: checkcast java/util/List
    //   36: areturn
  }
  
  private Zr8p lambda$getColumnMetadata$22(List<? extends RowSorter.SortKey> paramList, int paramInt) {
    return ZT(paramInt, paramList);
  }
  
  private int lambda$getIndexOfVisibleColumnInTableColumns$21(int paramInt) {
    TableColumn tableColumn = Zf().get(paramInt);
    return this.Zs.indexOf(tableColumn);
  }
  
  private int lambda$viewToModelIndex$20(int paramInt) {
    TableColumn tableColumn = Zf().get(paramInt);
    return tableColumn.getModelIndex();
  }
  
  private int lambda$modelToViewIndex$19(int paramInt) {
    return this.Zs.stream().filter(paramInt::lambda$modelToViewIndex$17).mapToInt(this::lambda$modelToViewIndex$18).findFirst().orElse(-1);
  }
  
  private int lambda$modelToViewIndex$18(TableColumn paramTableColumn) {
    return Zf().indexOf(paramTableColumn);
  }
  
  private static boolean lambda$modelToViewIndex$17(int paramInt, TableColumn paramTableColumn) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramTableColumn.getModelIndex() == paramInt);
  }
  
  private boolean lambda$isVisible$16(TableColumn paramTableColumn) {
    return this.ZZ.contains(paramTableColumn);
  }
  
  private boolean lambda$isVisible$15(int paramInt) {
    return Zm(this.Zs.get(paramInt));
  }
  
  private void lambda$hideColumn$14(TableColumn paramTableColumn) {
    int i = Zf().indexOf(paramTableColumn);
    this.selectionModel.removeIndexInterval(i, i);
    this.selectionModel.removeSelectionInterval(i, i);
    this.ZZ.remove(paramTableColumn);
    this.Zd.set(false);
    Zo();
    fireColumnRemoved(new TableColumnModelEvent(this, i, 0));
  }
  
  private void lambda$hideColumn$13(int paramInt) {
    TableColumn tableColumn = Zf().get(paramInt);
    int i = Zf().indexOf(tableColumn);
    this.selectionModel.removeIndexInterval(i, i);
    this.selectionModel.removeSelectionInterval(i, i);
    this.ZZ.remove(tableColumn);
    this.Zd.set(false);
    Zo();
    fireColumnRemoved(new TableColumnModelEvent(this, i, 0));
  }
  
  private void lambda$showColumn$12(TableColumn paramTableColumn) {
    try {
      if (this.Zs.contains(paramTableColumn)) {
        this.ZZ.add(paramTableColumn);
        this.Zd.set(false);
        Zo();
        fireColumnAdded(new TableColumnModelEvent(this, 0, Zf().indexOf(paramTableColumn)));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void lambda$showColumn$11(int paramInt) {
    this.Zs.stream().filter(paramInt::lambda$showColumn$9).findFirst().ifPresent(this::lambda$showColumn$10);
  }
  
  private void lambda$showColumn$10(TableColumn paramTableColumn) {
    try {
      if (this.Zs.contains(paramTableColumn)) {
        this.ZZ.add(paramTableColumn);
        this.Zd.set(false);
        Zo();
        fireColumnAdded(new TableColumnModelEvent(this, 0, Zf().indexOf(paramTableColumn)));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static boolean lambda$showColumn$9(int paramInt, TableColumn paramTableColumn) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramTableColumn.getModelIndex() == paramInt);
  }
  
  private TableColumn lambda$getColumn$8(int paramInt) {
    return Zf().get(paramInt);
  }
  
  private Enumeration lambda$getColumns$7() {
    return Collections.enumeration(Zf());
  }
  
  private void lambda$moveColumn$6(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: aload_0
    //   4: invokevirtual getColumnCount : ()I
    //   7: istore #4
    //   9: astore_3
    //   10: iload_1
    //   11: iflt -> 27
    //   14: iload_1
    //   15: iload #4
    //   17: if_icmplt -> 48
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   26: athrow
    //   27: new java/lang/IllegalArgumentException
    //   30: dup
    //   31: sipush #18427
    //   34: sipush #11253
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: invokespecial <init> : (Ljava/lang/String;)V
    //   43: athrow
    //   44: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   47: athrow
    //   48: iload_2
    //   49: iflt -> 65
    //   52: iload_2
    //   53: iload #4
    //   55: if_icmplt -> 86
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   64: athrow
    //   65: new java/lang/IllegalArgumentException
    //   68: dup
    //   69: sipush #18426
    //   72: sipush #-27672
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: invokespecial <init> : (Ljava/lang/String;)V
    //   81: athrow
    //   82: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   85: athrow
    //   86: iload_1
    //   87: iload_2
    //   88: if_icmpeq -> 234
    //   91: aload_0
    //   92: iload_1
    //   93: invokevirtual ZE : (I)I
    //   96: istore #5
    //   98: aload_0
    //   99: iload_2
    //   100: invokevirtual ZE : (I)I
    //   103: istore #6
    //   105: aload_0
    //   106: getfield Zs : Ljava/util/List;
    //   109: iload #5
    //   111: invokeinterface get : (I)Ljava/lang/Object;
    //   116: checkcast javax/swing/table/TableColumn
    //   119: astore #7
    //   121: aload_0
    //   122: getfield Zs : Ljava/util/List;
    //   125: iload #5
    //   127: invokeinterface remove : (I)Ljava/lang/Object;
    //   132: pop
    //   133: aload_0
    //   134: getfield Zs : Ljava/util/List;
    //   137: iload #6
    //   139: aload #7
    //   141: invokeinterface add : (ILjava/lang/Object;)V
    //   146: aload_0
    //   147: getfield Zd : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   150: iconst_0
    //   151: invokevirtual set : (Z)V
    //   154: aload_0
    //   155: getfield selectionModel : Ljavax/swing/ListSelectionModel;
    //   158: iload_1
    //   159: invokeinterface isSelectedIndex : (I)Z
    //   164: istore #8
    //   166: aload_0
    //   167: getfield selectionModel : Ljavax/swing/ListSelectionModel;
    //   170: iload_1
    //   171: iload_1
    //   172: invokeinterface removeIndexInterval : (II)V
    //   177: aload_0
    //   178: getfield selectionModel : Ljavax/swing/ListSelectionModel;
    //   181: iload_2
    //   182: iconst_1
    //   183: iconst_1
    //   184: invokeinterface insertIndexInterval : (IIZ)V
    //   189: iload #8
    //   191: ifeq -> 216
    //   194: aload_0
    //   195: getfield selectionModel : Ljavax/swing/ListSelectionModel;
    //   198: iload_2
    //   199: iload_2
    //   200: invokeinterface addSelectionInterval : (II)V
    //   205: aload_3
    //   206: ifnull -> 234
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   215: athrow
    //   216: aload_0
    //   217: getfield selectionModel : Ljavax/swing/ListSelectionModel;
    //   220: iload_2
    //   221: iload_2
    //   222: invokeinterface removeSelectionInterval : (II)V
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   233: athrow
    //   234: aload_0
    //   235: new javax/swing/event/TableColumnModelEvent
    //   238: dup
    //   239: aload_0
    //   240: iload_1
    //   241: iload_2
    //   242: invokespecial <init> : (Ljavax/swing/table/TableColumnModel;II)V
    //   245: invokevirtual fireColumnMoved : (Ljavax/swing/event/TableColumnModelEvent;)V
    //   248: return
    // Exception table:
    //   from	to	target	type
    //   10	20	23	java/lang/IllegalArgumentException
    //   14	44	44	java/lang/IllegalArgumentException
    //   48	58	61	java/lang/IllegalArgumentException
    //   52	82	82	java/lang/IllegalArgumentException
    //   166	209	212	java/lang/IllegalArgumentException
    //   194	227	230	java/lang/IllegalArgumentException
  }
  
  private void lambda$removeColumn$5(TableColumn paramTableColumn) {
    int i = this.Zs.indexOf(paramTableColumn);
    try {
      if (i != -1) {
        try {
          if (this.selectionModel != null)
            this.selectionModel.removeIndexInterval(i, i); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        paramTableColumn.removePropertyChangeListener(this);
        this.Zs.remove(i);
        this.Zs.stream().filter(paramTableColumn::lambda$removeColumn$3).forEach(Zshy::lambda$removeColumn$4);
        this.ZZ.remove(paramTableColumn);
        this.Zd.set(false);
        Zo();
        fireColumnRemoved(new TableColumnModelEvent(this, i, 0));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static void lambda$removeColumn$4(TableColumn paramTableColumn) {
    paramTableColumn.setModelIndex(paramTableColumn.getModelIndex() - 1);
  }
  
  private static boolean lambda$removeColumn$3(TableColumn paramTableColumn1, TableColumn paramTableColumn2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramTableColumn2.getModelIndex() >= paramTableColumn1.getModelIndex());
  }
  
  private void lambda$addColumn$2(TableColumn paramTableColumn) {
    this.Zs.add(Objects.<TableColumn>requireNonNull(paramTableColumn));
    this.ZZ.add(paramTableColumn);
    paramTableColumn.addPropertyChangeListener(this);
    this.Zd.set(false);
    Zo();
    fireColumnAdded(new TableColumnModelEvent(this, 0, getColumnCount() - 1));
  }
  
  private TableColumn lambda$getColumnWithModelIndex$1(int paramInt) {
    try {
      if (paramInt < this.Zs.size())
        return this.Zs.stream().filter(paramInt::lambda$getColumnWithModelIndex$0).findFirst().orElse(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  private static boolean lambda$getColumnWithModelIndex$0(int paramInt, TableColumn paramTableColumn) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramTableColumn.getModelIndex() == paramInt);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'H5I1A÷]{.ã^^ß6Ì³Ò\\n{@ðïÕmk¢Qÿne¢.²Zu~'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #21
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #47
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic burp/Zshy.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zshy.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #121
    //   154: goto -> 184
    //   157: bipush #100
    //   159: goto -> 184
    //   162: bipush #113
    //   164: goto -> 184
    //   167: bipush #81
    //   169: goto -> 184
    //   172: bipush #123
    //   174: goto -> 184
    //   177: bipush #53
    //   179: goto -> 184
    //   182: bipush #22
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x47FA) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 118;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zshy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */