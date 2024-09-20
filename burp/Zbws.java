package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.HierarchyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.swing.JTable;
import javax.swing.JToolTip;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbws extends JTable implements Zzyl, MouseListener {
  private static final Comparator<Zlcu> ZA;
  
  private final Zrgg ZH = new Zrgg();
  
  private Zeq Zf;
  
  private Zky2 Zs;
  
  private Zzyl ZE;
  
  private Zlkk Zi;
  
  private Zlkk Z_;
  
  private Zt00 Zj;
  
  private Zztu Zm;
  
  private boolean Zn;
  
  private Zlkk ZO;
  
  private Border ZY;
  
  private Border Za;
  
  private Component ZC;
  
  private Component ZQ;
  
  private List<? extends RowSorter.SortKey> ZJ;
  
  private boolean ZX;
  
  private boolean ZB;
  
  private boolean ZG;
  
  private static Zbqc[] Zu;
  
  private static final String a;
  
  public Zbws() {
    this((Zztu)null);
  }
  
  public Zbws(Zztu paramZztu) {
    if (paramZztu != null)
      ZL(paramZztu); 
    Zd();
    setShowVerticalLines(false);
    ZN(new Zr43(Zlkk.TABLE_SELECTED_REGION_BORDER_COLOUR));
    ZH(Zlkk.TABLE_ROLLOVER_ROW_BACKGROUND);
    addHierarchyListener(this::lambda$new$0);
  }
  
  public Zbws(Zztu paramZztu, Component paramComponent) {
    this(paramZztu);
    ZL(paramComponent);
  }
  
  protected Zmo5 ZQ() {
    return new Zmo5(getColumnModel());
  }
  
  protected void createDefaultRenderers() {
    super.createDefaultRenderers();
    Zgnn.ZL().forEach(this::setDefaultRenderer);
  }
  
  public Zrgg ZW() {
    return this.ZH;
  }
  
  public int[] Zq() {
    int i = this.ZH.Zn();
    boolean bool = (i == -1) ? true : convertRowIndexToView(i);
    return ZG(bool);
  }
  
  public int[] ZS(Point paramPoint) {
    if (paramPoint == null)
      return Zq(); 
    int i = rowAtPoint(paramPoint);
    return ZG(i);
  }
  
  private int[] ZG(int paramInt) {
    return (paramInt == -1 || isRowSelected(paramInt)) ? getSelectedRows() : new int[] { paramInt };
  }
  
  public boolean Zp() {
    return this.Zn;
  }
  
  public void ZF(boolean paramBoolean) {
    this.Zn = paramBoolean;
    setAutoResizeMode(0);
    if (!paramBoolean)
      setPreferredSize((Dimension)null); 
    ZE();
  }
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    int i = Math.max(0, paramListSelectionEvent.getFirstIndex() - 1);
    int j = Math.max(0, paramListSelectionEvent.getLastIndex() + 1);
    super.valueChanged(new ListSelectionEvent(paramListSelectionEvent.getSource(), i, j, paramListSelectionEvent.getValueIsAdjusting()));
  }
  
  public void setAutoResizeMode(int paramInt) {
    super.setAutoResizeMode(paramInt);
    if (paramInt != 0)
      this.Zn = false; 
  }
  
  public void ZL(Zztu paramZztu) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: aload_0
    //   4: invokevirtual getModel : ()Ljavax/swing/table/TableModel;
    //   7: astore #4
    //   9: istore_2
    //   10: aload #4
    //   12: instanceof burp/Zmub
    //   15: ifeq -> 33
    //   18: aload #4
    //   20: checkcast burp/Zmub
    //   23: astore_3
    //   24: aload_3
    //   25: <illegal opcode> getAsBoolean : ()Ljava/util/function/BooleanSupplier;
    //   30: invokevirtual ZE : (Ljava/util/function/BooleanSupplier;)V
    //   33: aload_0
    //   34: aload_1
    //   35: invokespecial setModel : (Ljavax/swing/table/TableModel;)V
    //   38: aload_0
    //   39: aload_1
    //   40: putfield Zm : Lburp/Zztu;
    //   43: aload_1
    //   44: aload_0
    //   45: invokeinterface Zx : (Lburp/Zbws;)V
    //   50: aload_0
    //   51: invokevirtual getAutoCreateRowSorter : ()Z
    //   54: ifeq -> 124
    //   57: aload_1
    //   58: instanceof burp/Zg7
    //   61: ifeq -> 124
    //   64: aload_1
    //   65: checkcast burp/Zg7
    //   68: astore_3
    //   69: aload_0
    //   70: invokevirtual getModel : ()Ljavax/swing/table/TableModel;
    //   73: astore #5
    //   75: aload #5
    //   77: instanceof burp/Zmua
    //   80: ifeq -> 107
    //   83: aload #5
    //   85: checkcast burp/Zmua
    //   88: astore #4
    //   90: aload_0
    //   91: new burp/Zm48
    //   94: dup
    //   95: aload #4
    //   97: invokespecial <init> : (Lburp/Zmua;)V
    //   100: invokevirtual setRowSorter : (Ljavax/swing/RowSorter;)V
    //   103: iload_2
    //   104: ifeq -> 119
    //   107: aload_0
    //   108: new burp/Zm4o
    //   111: dup
    //   112: aload_1
    //   113: invokespecial <init> : (Lburp/Zztu;)V
    //   116: invokevirtual setRowSorter : (Ljavax/swing/RowSorter;)V
    //   119: aload_0
    //   120: aload_3
    //   121: invokevirtual ZS : (Lburp/Zg7;)V
    //   124: aload_1
    //   125: instanceof burp/Zmub
    //   128: ifeq -> 164
    //   131: aload_1
    //   132: checkcast burp/Zmub
    //   135: astore_3
    //   136: new burp/Zr43
    //   139: dup
    //   140: getstatic burp/Zlkk.TABLE_CONTEXT_SELECTED_ROW_BORDER_COLOUR : Lburp/Zlkk;
    //   143: invokespecial <init> : (Lburp/Zlkk;)V
    //   146: astore #4
    //   148: aload_0
    //   149: aload #4
    //   151: invokevirtual Zb : (Ljavax/swing/border/Border;)V
    //   154: aload_3
    //   155: aload_0
    //   156: <illegal opcode> getAsBoolean : (Lburp/Zbws;)Ljava/util/function/BooleanSupplier;
    //   161: invokevirtual ZE : (Ljava/util/function/BooleanSupplier;)V
    //   164: return
  }
  
  public void ZL(Component paramComponent) {
    if (this.ZC != null)
      remove(this.ZC); 
    this.ZC = paramComponent;
    if (paramComponent != null) {
      add(paramComponent);
      paramComponent.setVisible((getModel().getRowCount() == 0));
    } 
    setFillsViewportHeight((paramComponent != null || this.ZQ != null));
  }
  
  public void Zc(Component paramComponent) {
    if (this.ZQ != null)
      remove(this.ZQ); 
    this.ZQ = paramComponent;
    if (paramComponent != null) {
      add(paramComponent);
      paramComponent.setVisible((getRowCount() == 0 && getModel().getRowCount() > 0 && getColumnCount() > 0));
    } 
    setFillsViewportHeight((paramComponent != null || this.ZC != null));
  }
  
  public void setAutoCreateRowSorter(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: aload_0
    //   4: iload_1
    //   5: invokespecial setAutoCreateRowSorter : (Z)V
    //   8: istore_2
    //   9: iload_1
    //   10: ifeq -> 83
    //   13: aload_0
    //   14: getfield Zm : Lburp/Zztu;
    //   17: astore #4
    //   19: aload #4
    //   21: instanceof burp/Zg7
    //   24: ifeq -> 83
    //   27: aload #4
    //   29: checkcast burp/Zg7
    //   32: astore_3
    //   33: aload_3
    //   34: instanceof burp/Zmua
    //   37: ifeq -> 63
    //   40: aload_3
    //   41: checkcast burp/Zmua
    //   44: astore #4
    //   46: aload_0
    //   47: new burp/Zm48
    //   50: dup
    //   51: aload #4
    //   53: invokespecial <init> : (Lburp/Zmua;)V
    //   56: invokevirtual setRowSorter : (Ljavax/swing/RowSorter;)V
    //   59: iload_2
    //   60: ifeq -> 78
    //   63: aload_0
    //   64: new burp/Zm4o
    //   67: dup
    //   68: aload_0
    //   69: getfield Zm : Lburp/Zztu;
    //   72: invokespecial <init> : (Lburp/Zztu;)V
    //   75: invokevirtual setRowSorter : (Ljavax/swing/RowSorter;)V
    //   78: aload_0
    //   79: aload_3
    //   80: invokevirtual ZS : (Lburp/Zg7;)V
    //   83: return
  }
  
  public void ZN(Zlkk paramZlkk) {
    this.Zi = paramZlkk;
    setBackground(paramZlkk.ZS());
  }
  
  public void Za(Zlkk paramZlkk) {
    this.Z_ = paramZlkk;
    setSelectionBackground(paramZlkk.ZS());
  }
  
  public Zlkk ZH1() {
    return this.ZO;
  }
  
  public void ZH(Zlkk paramZlkk) {
    this.ZO = paramZlkk;
  }
  
  public Border Zz() {
    return this.ZY;
  }
  
  public void ZN(Border paramBorder) {
    this.ZY = paramBorder;
  }
  
  public Border ZZ() {
    return this.Za;
  }
  
  public void Zb(Border paramBorder) {
    this.Za = paramBorder;
  }
  
  public void ZK(Zt00 paramZt00) {
    this.Zj = paramZt00;
    super.setFont(paramZt00.ZV());
    Zs();
  }
  
  public void setFont(Font paramFont) {
    this.Zj = null;
    super.setFont(paramFont);
    Zs();
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zi != null)
      setBackground(this.Zi.ZS()); 
    if (this.Z_ != null)
      setSelectionBackground(this.Z_.ZS()); 
    if (this.Zj != null)
      super.setFont(this.Zj.ZV()); 
    Zs();
  }
  
  public JToolTip createToolTip() {
    JToolTip jToolTip = super.createToolTip();
    jToolTip.putClientProperty(a, Boolean.TRUE);
    return jToolTip;
  }
  
  private void Zs() {
    Zd();
    if (this.Zm != null) {
      this.Zm.Zx(this);
      this.Zm.Zk(this);
    } 
  }
  
  private void Zd() {
    setRowHeight(Zre7.Zu(this).ZQ());
  }
  
  public void ZP(Zzyl paramZzyl) {
    this.ZE = paramZzyl;
  }
  
  public void Zc(Zeq paramZeq) {
    this.Zf = paramZeq;
  }
  
  public void Zk(Zky2 paramZky2) {
    if (this.Zs == null)
      addMouseListener(this); 
    this.Zs = paramZky2;
  }
  
  public int convertRowIndexToModel(int paramInt) {
    try {
      if (paramInt != -1)
        try {
          if (paramInt < getModel().getRowCount())
            try {
              return super.convertRowIndexToModel(paramInt);
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.UNEXPECTED);
              return -1;
            }  
          return -1;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return -1;
  }
  
  public int convertColumnIndexToView(int paramInt) {
    try {
      return super.convertColumnIndexToView(paramInt);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return -1;
    } 
  }
  
  public void Zv(int paramInt) {
    TableColumnModel tableColumnModel = getColumnModel();
    if (tableColumnModel instanceof Zrmn) {
      Zrmn zrmn = (Zrmn)tableColumnModel;
      Zmub zmub = (Zmub)this.Zm;
      int i = convertColumnIndexToModel(paramInt);
      if (zmub.ZU(i))
        zrmn.ZK(paramInt); 
    } 
  }
  
  public void ZE() {
    ZF(getModel());
    TableModel tableModel = getModel();
    if (tableModel instanceof Zg7) {
      Zg7<?> zg7 = (Zg7)tableModel;
      ZS(zg7);
    } 
  }
  
  public List<Zr8p> ZHh() {
    TableColumnModel tableColumnModel = getColumnModel();
    if (tableColumnModel instanceof Zrmn) {
      Zrmn zrmn = (Zrmn)tableColumnModel;
      RowSorter<? extends TableModel> rowSorter = getRowSorter();
      List<? extends RowSorter.SortKey> list = (rowSorter != null && (isShowing() || this.ZX)) ? rowSorter.getSortKeys() : this.ZJ;
      return zrmn.Zk(list);
    } 
    return Collections.emptyList();
  }
  
  public void Zj(Zlz8 paramZlz8) {
    Za(paramZlz8);
    Zg(paramZlz8.ZLF());
  }
  
  private void Za(Zlz8 paramZlz8) {
    Zztu zztu = this.Zm;
    if (zztu instanceof Zs97) {
      Zs97 zs97 = (Zs97)zztu;
      Objects.requireNonNull(Zmfp.class);
      Objects.requireNonNull(Zmfp.class);
      Objects.requireNonNull(zs97);
      paramZlz8.ZLF().stream().filter(Zmfp.class::isInstance).map(Zmfp.class::cast).forEach(zs97::ZR);
    } 
  }
  
  public void Zg(List<Zr8p> paramList) {
    TableColumnModel tableColumnModel = getColumnModel();
    if (tableColumnModel instanceof Zrmn) {
      Zrmn zrmn = (Zrmn)tableColumnModel;
      zrmn.ZB(paramList, getRowSorter(), this::ZK);
    } 
  }
  
  private boolean ZK(String paramString) {
    Zztu zztu = this.Zm;
    if (zztu instanceof Zg7) {
      Zg7 zg7 = (Zg7)zztu;
      return zg7.Zx(paramString);
    } 
    return false;
  }
  
  public Optional<Component> ZR() {
    return Optional.ofNullable(this.ZC);
  }
  
  public Optional<Component> ZT() {
    return Optional.ofNullable(this.ZQ);
  }
  
  public void doLayout() {
    try {
      if (getParent() == null)
        setSize(this.columnModel.getTotalColumnWidth(), getHeight()); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (getAutoResizeMode() == 3)
        try {
          if (this.ZG && isShowing())
            try {
              JTableHeader jTableHeader = getTableHeader();
              if (jTableHeader != null) {
                TableColumnModel tableColumnModel = getColumnModel();
                try {
                  if (jTableHeader.getResizingColumn() == null)
                    jTableHeader.setResizingColumn(tableColumnModel.getColumn(tableColumnModel.getColumnCount() - 1)); 
                } catch (Exception exception) {
                  throw a(null);
                } 
              } 
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.UNEXPECTED);
            }  
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (this.Zn)
        ZY(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    super.doLayout();
    this.ZG = true;
  }
  
  private void ZY() {
    boolean bool = Zm99.ZM();
    if (this.Zm instanceof Zmub) {
      TableColumnModel tableColumnModel = this.columnModel;
      if (tableColumnModel instanceof Zrmn) {
        Zrmn zrmn = (Zrmn)tableColumnModel;
        if (bool) {
          if (getParent() == null)
            return; 
          TableColumn tableColumn = this.tableHeader.getResizingColumn();
          int i = -1;
          if (tableColumn != null) {
            zrmn.Zd(tableColumn);
            i = convertColumnIndexToView(tableColumn.getModelIndex());
          } 
          int j = getParent().getWidth();
          int k = j - zrmn.getTotalColumnWidth();
          Zxeb.ZN(ZW(i + 1), k);
          zrmn.Zo();
          int m = zrmn.getTotalColumnWidth();
          if (m > 0) {
            Dimension dimension = new Dimension(m, Math.max(Zn(), getParent().getHeight()));
            setSize(dimension);
            setPreferredSize(dimension);
          } 
          return;
        } 
      } 
    } 
  }
  
  private int Zn() {
    boolean bool = Zm99.ZQ();
    if (this.ZB) {
      int i = 0;
      byte b = 0;
      while (b < getRowCount()) {
        i += getRowHeight(b);
        b++;
        if (bool)
          break; 
      } 
      return i;
    } 
    return getRowHeight() * getRowCount();
  }
  
  public void setRowHeight(int paramInt1, int paramInt2) {
    this.ZB = true;
    super.setRowHeight(paramInt1, paramInt2);
  }
  
  public void setRowHeight(int paramInt) {
    this.ZB = false;
    super.setRowHeight(paramInt);
  }
  
  private List<Zzm4> ZW(int paramInt) {
    Zztu zztu = this.Zm;
    boolean bool = Zm99.ZQ();
    if (zztu instanceof Zmub) {
      Zmub zmub = (Zmub)zztu;
      TableColumnModel tableColumnModel = this.columnModel;
      if (tableColumnModel instanceof Zrmn) {
        Zrmn zrmn = (Zrmn)tableColumnModel;
        ArrayList<Zzm4> arrayList = new ArrayList();
        int i = this.columnModel.getColumnCount();
        int j = paramInt;
        while (j < i) {
          TableColumn tableColumn = this.columnModel.getColumn(j);
          if (!zrmn.ZV(tableColumn) && zrmn.Zm(tableColumn)) {
            int k = convertColumnIndexToModel(j);
            arrayList.add(new Zzm4(tableColumn, zmub.ZJ(k)));
          } 
          j++;
          if (bool)
            break; 
        } 
        return arrayList;
      } 
    } 
    return Collections.emptyList();
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return (this.ZE != null && this.ZE.ZI(paramInt, paramObject));
  }
  
  public void changeSelection(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    super.changeSelection(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    if (this.Zf != null)
      this.Zf.ZK(paramInt1, paramInt2); 
  }
  
  public TableColumnModel createDefaultColumnModel() {
    return new Zshy();
  }
  
  public void createDefaultColumnsFromModel() {
    List<Zr8p> list = ZHh();
    ZF(getModel());
    Zg(list);
  }
  
  private void ZF(TableModel paramTableModel) {
    if (paramTableModel != null) {
      Zt();
      Z_(paramTableModel);
    } 
  }
  
  private void Zt() {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: aload_0
    //   4: invokevirtual getColumnModel : ()Ljavax/swing/table/TableColumnModel;
    //   7: astore_2
    //   8: istore_1
    //   9: aload_2
    //   10: instanceof burp/Zrmn
    //   13: ifeq -> 31
    //   16: aload_2
    //   17: checkcast burp/Zrmn
    //   20: astore_3
    //   21: aload_3
    //   22: invokeinterface ZM : ()V
    //   27: iload_1
    //   28: ifeq -> 57
    //   31: aload_2
    //   32: invokeinterface getColumnCount : ()I
    //   37: ifle -> 57
    //   40: aload_2
    //   41: aload_2
    //   42: iconst_0
    //   43: invokeinterface getColumn : (I)Ljavax/swing/table/TableColumn;
    //   48: invokeinterface removeColumn : (Ljavax/swing/table/TableColumn;)V
    //   53: iload_1
    //   54: ifeq -> 31
    //   57: return
  }
  
  private void Z_(TableModel paramTableModel) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: instanceof burp/Zg7
    //   8: ifeq -> 83
    //   11: aload_1
    //   12: checkcast burp/Zg7
    //   15: astore_3
    //   16: iconst_0
    //   17: aload_1
    //   18: invokeinterface getColumnCount : ()I
    //   23: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   26: aload_3
    //   27: dup
    //   28: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   31: pop
    //   32: <illegal opcode> apply : (Lburp/Zg7;)Ljava/util/function/IntFunction;
    //   37: invokeinterface mapToObj : (Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;
    //   42: aload_0
    //   43: aload_3
    //   44: <illegal opcode> accept : (Lburp/Zbws;Lburp/Zg7;)Ljava/util/function/Consumer;
    //   49: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   54: iconst_0
    //   55: aload_0
    //   56: invokevirtual getColumnModel : ()Ljavax/swing/table/TableColumnModel;
    //   59: invokeinterface getColumnCount : ()I
    //   64: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   67: aload_0
    //   68: aload_3
    //   69: <illegal opcode> accept : (Lburp/Zbws;Lburp/Zg7;)Ljava/util/function/IntConsumer;
    //   74: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   79: iload_2
    //   80: ifne -> 114
    //   83: iconst_0
    //   84: aload_1
    //   85: invokeinterface getColumnCount : ()I
    //   90: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   93: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   98: invokeinterface mapToObj : (Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;
    //   103: aload_0
    //   104: <illegal opcode> accept : (Lburp/Zbws;)Ljava/util/function/Consumer;
    //   109: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   114: return
  }
  
  private void ZS(Zg7<?> paramZg7) {
    RowSorter<? extends TableModel> rowSorter = getRowSorter();
    boolean bool = Zm99.ZM();
    if (rowSorter == null)
      return; 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    byte b = 0;
    while (b < getColumnModel().getColumnCount()) {
      SortOrder sortOrder = paramZg7.Zc(b);
      if (sortOrder != SortOrder.UNSORTED)
        linkedHashMap.put(new RowSorter.SortKey(b, sortOrder), paramZg7.ZR(b)); 
      b++;
      if (!bool)
        break; 
    } 
    List<? extends RowSorter.SortKey> list = linkedHashMap.entrySet().stream().sorted(Zbws::lambda$initializeSortKeys$4).map(Map.Entry::getKey).toList();
    rowSorter.setSortKeys(list);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual isPopupTrigger : ()Z
    //   8: ifeq -> 33
    //   11: aload_0
    //   12: getfield Zs : Lburp/Zky2;
    //   15: aload_1
    //   16: aload_1
    //   17: invokevirtual getComponent : ()Ljava/awt/Component;
    //   20: aload_1
    //   21: invokevirtual getPoint : ()Ljava/awt/Point;
    //   24: invokeinterface ZV : (Ljava/awt/event/MouseEvent;Ljava/awt/Component;Ljava/awt/Point;)V
    //   29: iload_2
    //   30: ifeq -> 169
    //   33: aload_1
    //   34: invokevirtual getClickCount : ()I
    //   37: iconst_1
    //   38: if_icmpne -> 99
    //   41: new java/awt/Point
    //   44: dup
    //   45: aload_1
    //   46: invokevirtual getX : ()I
    //   49: aload_1
    //   50: invokevirtual getY : ()I
    //   53: invokespecial <init> : (II)V
    //   56: astore_3
    //   57: aload_0
    //   58: aload_3
    //   59: invokevirtual rowAtPoint : (Ljava/awt/Point;)I
    //   62: istore #4
    //   64: aload_0
    //   65: aload_3
    //   66: invokevirtual columnAtPoint : (Ljava/awt/Point;)I
    //   69: istore #5
    //   71: iload #4
    //   73: iflt -> 95
    //   76: iload #5
    //   78: iflt -> 95
    //   81: aload_0
    //   82: getfield Zs : Lburp/Zky2;
    //   85: aload_1
    //   86: iload #4
    //   88: iload #5
    //   90: invokeinterface Zv : (Ljava/awt/event/MouseEvent;II)V
    //   95: iload_2
    //   96: ifeq -> 169
    //   99: aload_1
    //   100: invokevirtual getClickCount : ()I
    //   103: iconst_2
    //   104: if_icmpne -> 169
    //   107: aload_1
    //   108: invokevirtual getButton : ()I
    //   111: iconst_1
    //   112: if_icmpne -> 169
    //   115: new java/awt/Point
    //   118: dup
    //   119: aload_1
    //   120: invokevirtual getX : ()I
    //   123: aload_1
    //   124: invokevirtual getY : ()I
    //   127: invokespecial <init> : (II)V
    //   130: astore_3
    //   131: aload_0
    //   132: aload_3
    //   133: invokevirtual rowAtPoint : (Ljava/awt/Point;)I
    //   136: istore #4
    //   138: aload_0
    //   139: aload_3
    //   140: invokevirtual columnAtPoint : (Ljava/awt/Point;)I
    //   143: istore #5
    //   145: iload #4
    //   147: iflt -> 169
    //   150: iload #5
    //   152: iflt -> 169
    //   155: aload_0
    //   156: getfield Zs : Lburp/Zky2;
    //   159: aload_1
    //   160: iload #4
    //   162: iload #5
    //   164: invokeinterface ZR : (Ljava/awt/event/MouseEvent;II)V
    //   169: return
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      this.Zs.ZV(paramMouseEvent, paramMouseEvent.getComponent(), paramMouseEvent.getPoint()); 
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void ZC(boolean paramBoolean) {
    this.ZX = paramBoolean;
  }
  
  private static int lambda$initializeSortKeys$4(Map.Entry paramEntry1, Map.Entry paramEntry2) {
    return ZA.compare((Zlcu)paramEntry1.getValue(), (Zlcu)paramEntry2.getValue());
  }
  
  private void lambda$addDefaultColumnsFromModel$3(Zg7 paramZg7, int paramInt) {
    getColumnModel().getColumn(paramInt).setWidth(paramZg7.ZJ(paramInt));
  }
  
  private void lambda$addDefaultColumnsFromModel$2(Zg7 paramZg7, TableColumn paramTableColumn) {
    addColumn(paramTableColumn);
    if (!paramZg7.ZY(paramTableColumn.getModelIndex())) {
      TableColumnModel tableColumnModel = getColumnModel();
      if (tableColumnModel instanceof Zrmn) {
        Zrmn zrmn = (Zrmn)tableColumnModel;
        zrmn.Z_(paramTableColumn);
      } 
    } 
  }
  
  private static boolean lambda$setModel$1() {
    return false;
  }
  
  private void lambda$new$0(HierarchyEvent paramHierarchyEvent) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZX : Z
    //   8: ifne -> 102
    //   11: aload_1
    //   12: invokevirtual getChangeFlags : ()J
    //   15: ldc2_w 4
    //   18: land
    //   19: lconst_0
    //   20: lcmp
    //   21: ifle -> 102
    //   24: aload_0
    //   25: invokevirtual isShowing : ()Z
    //   28: ifeq -> 66
    //   31: aload_0
    //   32: invokevirtual getRowSorter : ()Ljavax/swing/RowSorter;
    //   35: astore_3
    //   36: aload_3
    //   37: ifnull -> 62
    //   40: aload_0
    //   41: getfield ZJ : Ljava/util/List;
    //   44: ifnull -> 62
    //   47: aload_3
    //   48: aload_0
    //   49: getfield ZJ : Ljava/util/List;
    //   52: invokevirtual setSortKeys : (Ljava/util/List;)V
    //   55: aload_0
    //   56: invokestatic emptyList : ()Ljava/util/List;
    //   59: putfield ZJ : Ljava/util/List;
    //   62: iload_2
    //   63: ifeq -> 102
    //   66: aload_0
    //   67: invokevirtual getRowSorter : ()Ljavax/swing/RowSorter;
    //   70: astore_3
    //   71: aload_3
    //   72: ifnull -> 102
    //   75: aload_3
    //   76: invokevirtual getSortKeys : ()Ljava/util/List;
    //   79: invokeinterface isEmpty : ()Z
    //   84: ifne -> 102
    //   87: aload_0
    //   88: aload_3
    //   89: invokevirtual getSortKeys : ()Ljava/util/List;
    //   92: putfield ZJ : Ljava/util/List;
    //   95: aload_3
    //   96: invokestatic emptyList : ()Ljava/util/List;
    //   99: invokevirtual setSortKeys : (Ljava/util/List;)V
    //   102: return
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZHj : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_4
    //   7: anewarray burp/Zbqc
    //   10: invokestatic Zg : ([Lburp/Zbqc;)V
    //   13: bipush #40
    //   15: ldc '[9EY#%@,E'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zbws.a : Ljava/lang/String;
    //   24: goto -> 165
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 139
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 111, 5 -> 116
    //   92: bipush #27
    //   94: goto -> 123
    //   97: bipush #101
    //   99: goto -> 123
    //   102: bipush #65
    //   104: goto -> 123
    //   107: iconst_1
    //   108: goto -> 123
    //   111: bipush #95
    //   113: goto -> 123
    //   116: bipush #111
    //   118: goto -> 123
    //   121: bipush #100
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 48
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 45
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 21
    //   165: invokestatic naturalOrder : ()Ljava/util/Comparator;
    //   168: invokestatic nullsLast : (Ljava/util/Comparator;)Ljava/util/Comparator;
    //   171: putstatic burp/Zbws.ZA : Ljava/util/Comparator;
    //   174: return
  }
  
  public static void Zg(Zbqc[] paramArrayOfZbqc) {
    Zu = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZHj() {
    return Zu;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbws.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */