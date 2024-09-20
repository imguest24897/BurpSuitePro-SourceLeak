package burp.theme;

import burp.Zbqc;
import burp.Zbws;
import burp.Zrgg;
import com.formdev.flatlaf.ui.FlatTableUI;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.TableColumnModelListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class BurpTableUI extends FlatTableUI {
  public static final String MODEL_PROPERTY_NAME;
  
  public static final String COLUMN_MODEL_PROPERTY_NAME;
  
  private final Component noColumnEmptyStatePanel = (Component)new BurpTableUI$ChameleonEmptyPanel();
  
  private BurpTableUI$RolloverMouseAdapter rolloverMouseAdapter;
  
  private BurpTableUI$ContextSelectionMouseAdapter contextSelectionMouseAdapter;
  
  private BurpTableUI$NoRowListener noRowListener;
  
  private BurpTableUI$ResponsiveEmptyStatePanelsComponentListener responsiveEmptyStatePanelsComponentListener;
  
  private int rolloverRowIndex = -1;
  
  private TableColumnModelListener chameleonNoColumnListener;
  
  private BurpTableUI$ModelPropertyChangeListener modelPropertyChangeListener;
  
  private BurpTableUI$ColumnModelPropertyChangeListener columnModelPropertyChangeListener;
  
  private HierarchyListener hierarchyListener;
  
  private ComponentListener componentListener;
  
  private Container container;
  
  private static int ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected void installListeners() {
    this.rolloverMouseAdapter = new BurpTableUI$RolloverMouseAdapter(this);
    this.table.addMouseListener(this.rolloverMouseAdapter);
    this.table.addMouseWheelListener(this.rolloverMouseAdapter);
    this.table.addMouseMotionListener(this.rolloverMouseAdapter);
    this.contextSelectionMouseAdapter = new BurpTableUI$ContextSelectionMouseAdapter(this);
    this.table.addMouseListener(this.contextSelectionMouseAdapter);
    int i = Zk();
    this.responsiveEmptyStatePanelsComponentListener = new BurpTableUI$ResponsiveEmptyStatePanelsComponentListener(this);
    this.table.addComponentListener(this.responsiveEmptyStatePanelsComponentListener);
    this.chameleonNoColumnListener = new BurpTableUI$ChameleonNoColumnListener(this);
    this.table.getColumnModel().addColumnModelListener(this.chameleonNoColumnListener);
    this.noRowListener = new BurpTableUI$NoRowListener(this);
    this.table.getModel().addTableModelListener(this.noRowListener);
    this.modelPropertyChangeListener = new BurpTableUI$ModelPropertyChangeListener(this);
    this.table.addPropertyChangeListener(a(9849, 8125), this.modelPropertyChangeListener);
    this.columnModelPropertyChangeListener = new BurpTableUI$ColumnModelPropertyChangeListener(this);
    this.table.addPropertyChangeListener(a(9851, 14534), this.columnModelPropertyChangeListener);
    this.componentListener = new BurpTableUI$1(this);
    this.container.addComponentListener(this.componentListener);
    this.hierarchyListener = this::lambda$installListeners$2;
    this.table.addHierarchyListener(this.hierarchyListener);
    super.installListeners();
    if (Zbqc.Zwu() == null)
      ZJ(++i); 
  }
  
  protected void uninstallListeners() {
    super.uninstallListeners();
    this.table.removeHierarchyListener(this.hierarchyListener);
    this.container.removeComponentListener(this.componentListener);
    this.table.removePropertyChangeListener(a(9850, -19711), this.columnModelPropertyChangeListener);
    this.table.removePropertyChangeListener(a(9848, -23531), this.modelPropertyChangeListener);
    this.table.getModel().removeTableModelListener(this.noRowListener);
    this.table.getColumnModel().removeColumnModelListener(this.chameleonNoColumnListener);
    this.table.removeComponentListener(this.responsiveEmptyStatePanelsComponentListener);
    this.table.removeMouseListener(this.contextSelectionMouseAdapter);
    this.table.removeMouseMotionListener(this.rolloverMouseAdapter);
    this.table.removeMouseWheelListener(this.rolloverMouseAdapter);
    this.table.removeMouseListener(this.rolloverMouseAdapter);
  }
  
  public Dimension getPreferredSize(JComponent paramJComponent) {
    int i = this.table.getColumnCount();
    Optional<JScrollPane> optional = findEnclosingScrollPane(this.table);
    if (optional.isPresent() && i == 0) {
      Rectangle rectangle = getScrollableBounds(optional.get());
      return new Dimension(rectangle.width, rectangle.height);
    } 
    return super.getPreferredSize(paramJComponent);
  }
  
  public void installUI(JComponent paramJComponent) {
    this.container = findEnclosingScrollPane(paramJComponent).<Container>map(BurpTableUI::lambda$installUI$3).orElse(paramJComponent);
    super.installUI(paramJComponent);
    this.table.add(this.noColumnEmptyStatePanel);
  }
  
  public void uninstallUI(JComponent paramJComponent) {
    this.table.remove(this.noColumnEmptyStatePanel);
    super.uninstallUI(paramJComponent);
    this.hierarchyListener = null;
    this.componentListener = null;
    this.rolloverMouseAdapter = null;
    this.contextSelectionMouseAdapter = null;
    this.container = null;
  }
  
  public int getRolloverRowIndex() {
    return this.rolloverRowIndex;
  }
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (ComponentUI)new BurpTableUI();
  }
  
  public void paint(Graphics paramGraphics, JComponent paramJComponent) {
    super.paint(paramGraphics, paramJComponent);
    if (this.table.isEditing() && this.table.getEditorComponent() instanceof javax.swing.JCheckBox) {
      int i = this.table.getEditingRow();
      int j = this.table.getEditingColumn();
      Rectangle rectangle = this.table.getCellRect(i, j, false);
      TableCellRenderer tableCellRenderer = this.table.getCellRenderer(i, j);
      Component component = this.table.prepareRenderer(tableCellRenderer, i, j);
      this.rendererPane.paintComponent(paramGraphics, component, this.table, rectangle.x, rectangle.y, rectangle.width, rectangle.height, true);
    } 
    JTable jTable = this.table;
    if (jTable instanceof Zbws) {
      Zbws zbws = (Zbws)jTable;
      Border border1 = zbws.ZZ();
      Zrgg zrgg = zbws.ZW();
      int i = zrgg.Zn();
      if (border1 != null && i != -1)
        paintContextSelectionRowBorder(paramGraphics, border1, i); 
      Border border2 = zbws.Zz();
      if (border2 != null) {
        ListSelectionModel listSelectionModel = this.table.getSelectionModel();
        if (!listSelectionModel.isSelectionEmpty())
          paintSelectionRowRegionBorders(paramGraphics, listSelectionModel, border2); 
      } 
    } 
  }
  
  private void paintSelectionRowRegionBorders(Graphics paramGraphics, ListSelectionModel paramListSelectionModel, Border paramBorder) {
    // Byte code:
    //   0: invokestatic Zk : ()I
    //   3: aload_0
    //   4: aload_1
    //   5: iconst_1
    //   6: invokevirtual getRowsInClipBounds : (Ljava/awt/Graphics;Z)Ljava/util/List;
    //   9: astore #5
    //   11: istore #4
    //   13: new java/util/ArrayList
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore #6
    //   22: aconst_null
    //   23: astore #7
    //   25: aload #5
    //   27: invokeinterface iterator : ()Ljava/util/Iterator;
    //   32: astore #8
    //   34: aload #8
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 138
    //   44: aload #8
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast java/lang/Integer
    //   54: astore #9
    //   56: aload_2
    //   57: aload #9
    //   59: invokevirtual intValue : ()I
    //   62: invokeinterface isSelectedIndex : (I)Z
    //   67: ifeq -> 130
    //   70: aload_0
    //   71: aload #9
    //   73: invokevirtual intValue : ()I
    //   76: invokevirtual getRowBounds : (I)Ljava/awt/Rectangle;
    //   79: astore #10
    //   81: aload #10
    //   83: ifnull -> 125
    //   86: aload #7
    //   88: ifnonnull -> 110
    //   91: aload #10
    //   93: astore #7
    //   95: aload #6
    //   97: aload #7
    //   99: invokeinterface add : (Ljava/lang/Object;)Z
    //   104: pop
    //   105: iload #4
    //   107: ifeq -> 125
    //   110: aload #7
    //   112: dup
    //   113: getfield height : I
    //   116: aload #10
    //   118: getfield height : I
    //   121: iadd
    //   122: putfield height : I
    //   125: iload #4
    //   127: ifeq -> 133
    //   130: aconst_null
    //   131: astore #7
    //   133: iload #4
    //   135: ifeq -> 34
    //   138: aload #6
    //   140: invokeinterface iterator : ()Ljava/util/Iterator;
    //   145: astore #8
    //   147: aload #8
    //   149: invokeinterface hasNext : ()Z
    //   154: ifeq -> 205
    //   157: aload #8
    //   159: invokeinterface next : ()Ljava/lang/Object;
    //   164: checkcast java/awt/Rectangle
    //   167: astore #9
    //   169: aload_3
    //   170: aload_0
    //   171: getfield table : Ljavax/swing/JTable;
    //   174: aload_1
    //   175: aload #9
    //   177: getfield x : I
    //   180: aload #9
    //   182: getfield y : I
    //   185: aload #9
    //   187: getfield width : I
    //   190: aload #9
    //   192: getfield height : I
    //   195: invokeinterface paintBorder : (Ljava/awt/Component;Ljava/awt/Graphics;IIII)V
    //   200: iload #4
    //   202: ifeq -> 147
    //   205: return
  }
  
  private List<Integer> getRowsInClipBounds(Graphics paramGraphics, boolean paramBoolean) {
    Rectangle rectangle = paramGraphics.getClipBounds();
    Point point = rectangle.getLocation();
    int i = this.table.rowAtPoint(point);
    int j = this.table.rowAtPoint(new Point(point.x, point.y + rectangle.height));
    if (j == -1)
      j = this.table.getRowCount() - 1; 
    int k = paramBoolean ? (i - 1) : i;
    int m = paramBoolean ? (j + 1) : j;
    return IntStream.rangeClosed(Math.max(0, k), Math.min(this.table.getRowCount() - 1, m)).boxed().toList();
  }
  
  private void paintContextSelectionRowBorder(Graphics paramGraphics, Border paramBorder, int paramInt) {
    Rectangle rectangle = getRowBounds(this.table.convertRowIndexToView(paramInt));
    if (rectangle != null && paramGraphics.getClipBounds().intersects(rectangle))
      paramBorder.paintBorder(this.table, paramGraphics, rectangle.x, rectangle.y, rectangle.width, rectangle.height); 
  }
  
  private Rectangle getScrollableBounds(JScrollPane paramJScrollPane) {
    Rectangle rectangle = paramJScrollPane.getBounds();
    JTableHeader jTableHeader = this.table.getTableHeader();
    if (jTableHeader != null)
      rectangle.height -= jTableHeader.getHeight(); 
    Insets insets = paramJScrollPane.getInsets();
    rectangle.height = rectangle.height - insets.top - insets.bottom;
    rectangle.width = rectangle.width - insets.left - insets.right;
    return rectangle;
  }
  
  private static Optional<JScrollPane> findEnclosingScrollPane(JComponent paramJComponent) {
    return Optional.<Container>ofNullable(SwingUtilities.getUnwrappedParent(paramJComponent)).filter(BurpTableUI::lambda$findEnclosingScrollPane$4).map(Component::getParent).filter(BurpTableUI::lambda$findEnclosingScrollPane$5).map(BurpTableUI::lambda$findEnclosingScrollPane$6).filter(paramJComponent::lambda$findEnclosingScrollPane$7);
  }
  
  private static boolean isViewportView(JViewport paramJViewport, JComponent paramJComponent) {
    return (paramJViewport != null && SwingUtilities.getUnwrappedView(paramJViewport) == paramJComponent);
  }
  
  private Rectangle getRowBounds(int paramInt) {
    if (paramInt == -1 || this.table.getColumnCount() == 0)
      return null; 
    Rectangle rectangle1 = this.table.getCellRect(paramInt, 0, false);
    Rectangle rectangle2 = this.table.getCellRect(paramInt, this.table.getColumnCount() - 1, false);
    return rectangle1.union(rectangle2);
  }
  
  private void repaint(int... paramVarArgs) {
    Objects.requireNonNull(this.table);
    Arrays.stream(paramVarArgs).filter(BurpTableUI::lambda$repaint$8).mapToObj(this::getRowBounds).filter(Objects::nonNull).forEach(this.table::repaint);
  }
  
  private static void setEmptyStateVisibility(JTable paramJTable, Component paramComponent) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getColumnCount : ()I
    //   4: istore_2
    //   5: iload_2
    //   6: ifne -> 13
    //   9: iconst_1
    //   10: goto -> 14
    //   13: iconst_0
    //   14: istore_3
    //   15: aload_0
    //   16: instanceof burp/Zbws
    //   19: ifeq -> 97
    //   22: aload_0
    //   23: checkcast burp/Zbws
    //   26: astore #4
    //   28: aload_0
    //   29: invokevirtual getModel : ()Ljavax/swing/table/TableModel;
    //   32: invokeinterface getRowCount : ()I
    //   37: istore #5
    //   39: aload #4
    //   41: invokevirtual ZR : ()Ljava/util/Optional;
    //   44: iload #5
    //   46: <illegal opcode> accept : (I)Ljava/util/function/Consumer;
    //   51: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   54: aload #4
    //   56: invokevirtual ZT : ()Ljava/util/Optional;
    //   59: aload_0
    //   60: iload #5
    //   62: iload_2
    //   63: <illegal opcode> accept : (Ljavax/swing/JTable;II)Ljava/util/function/Consumer;
    //   68: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   71: iload_3
    //   72: ifeq -> 95
    //   75: aload #4
    //   77: invokevirtual ZR : ()Ljava/util/Optional;
    //   80: invokevirtual isEmpty : ()Z
    //   83: ifne -> 91
    //   86: iload #5
    //   88: ifle -> 95
    //   91: iconst_1
    //   92: goto -> 96
    //   95: iconst_0
    //   96: istore_3
    //   97: aload_1
    //   98: iload_3
    //   99: invokevirtual setVisible : (Z)V
    //   102: return
  }
  
  private static void lambda$setEmptyStateVisibility$11(JTable paramJTable, int paramInt1, int paramInt2, Component paramComponent) {
    // Byte code:
    //   0: aload_3
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: <illegal opcode> run : (Ljava/awt/Component;Ljavax/swing/JTable;II)Ljava/lang/Runnable;
    //   9: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   12: return
  }
  
  private static void lambda$setEmptyStateVisibility$10(Component paramComponent, JTable paramJTable, int paramInt1, int paramInt2) {
    paramComponent.setVisible((paramJTable.getRowCount() == 0 && paramInt1 > 0 && paramInt2 > 0));
  }
  
  private static void lambda$setEmptyStateVisibility$9(int paramInt, Component paramComponent) {
    paramComponent.setVisible((paramInt == 0));
  }
  
  private static boolean lambda$repaint$8(int paramInt) {
    return (paramInt >= 0);
  }
  
  private static boolean lambda$findEnclosingScrollPane$7(JComponent paramJComponent, JScrollPane paramJScrollPane) {
    return isViewportView(paramJScrollPane.getViewport(), paramJComponent);
  }
  
  private static JScrollPane lambda$findEnclosingScrollPane$6(Container paramContainer) {
    return (JScrollPane)paramContainer;
  }
  
  private static boolean lambda$findEnclosingScrollPane$5(Container paramContainer) {
    return paramContainer instanceof JScrollPane;
  }
  
  private static boolean lambda$findEnclosingScrollPane$4(Container paramContainer) {
    return paramContainer instanceof JViewport;
  }
  
  private static Container lambda$installUI$3(JScrollPane paramJScrollPane) {
    return paramJScrollPane;
  }
  
  private void lambda$installListeners$2(HierarchyEvent paramHierarchyEvent) {
    if ((paramHierarchyEvent.getChangeFlags() & 0x1L) != 0L)
      findEnclosingScrollPane(this.table).ifPresentOrElse(this::lambda$installListeners$0, this::lambda$installListeners$1); 
  }
  
  private void lambda$installListeners$1() {
    this.container.removeComponentListener(this.componentListener);
    this.container = this.table;
    this.container.addComponentListener(this.componentListener);
  }
  
  private void lambda$installListeners$0(JScrollPane paramJScrollPane) {
    this.container.removeComponentListener(this.componentListener);
    this.container = paramJScrollPane;
    this.container.addComponentListener(this.componentListener);
  }
  
  public static void ZJ(int paramInt) {
    ZK = paramInt;
  }
  
  public static int Zk() {
    return ZK;
  }
  
  public static int ZL() {
    int i = Zk();
    return (i == 0) ? 110 : 0;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZJ : (I)V
    //   13: ldc '$e]÷¿Ý¸àù"!8"ÜnõÅ]ó·½h/P2'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: iconst_5
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #42
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 169
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'UX%æ38.Ö9,Në'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: iconst_5
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #83
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 169
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/theme/BurpTableUI.a : [Ljava/lang/String;
    //   134: bipush #6
    //   136: anewarray java/lang/String
    //   139: putstatic burp/theme/BurpTableUI.b : [Ljava/lang/String;
    //   142: sipush #9852
    //   145: sipush #21108
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: putstatic burp/theme/BurpTableUI.COLUMN_MODEL_PROPERTY_NAME : Ljava/lang/String;
    //   154: sipush #9853
    //   157: sipush #-27795
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: putstatic burp/theme/BurpTableUI.MODEL_PROPERTY_NAME : Ljava/lang/String;
    //   166: goto -> 328
    //   169: dup_x2
    //   170: pop
    //   171: invokevirtual toCharArray : ()[C
    //   174: dup_x1
    //   175: arraylength
    //   176: dup_x2
    //   177: pop
    //   178: iconst_0
    //   179: istore #6
    //   181: dup2_x1
    //   182: pop2
    //   183: dup_x2
    //   184: iconst_1
    //   185: if_icmpgt -> 288
    //   188: dup2
    //   189: swap
    //   190: iload #6
    //   192: dup2_x1
    //   193: caload
    //   194: swap
    //   195: iload #6
    //   197: bipush #7
    //   199: irem
    //   200: tableswitch default -> 270, 0 -> 240, 1 -> 245, 2 -> 250, 3 -> 255, 4 -> 260, 5 -> 265
    //   240: bipush #121
    //   242: goto -> 272
    //   245: bipush #92
    //   247: goto -> 272
    //   250: bipush #61
    //   252: goto -> 272
    //   255: bipush #88
    //   257: goto -> 272
    //   260: bipush #88
    //   262: goto -> 272
    //   265: bipush #18
    //   267: goto -> 272
    //   270: bipush #119
    //   272: ixor
    //   273: ixor
    //   274: i2c
    //   275: castore
    //   276: iinc #6, 1
    //   279: dup
    //   280: ifne -> 288
    //   283: dup2
    //   284: dup_x1
    //   285: goto -> 192
    //   288: dup2_x1
    //   289: pop2
    //   290: dup_x2
    //   291: iload #6
    //   293: if_icmpgt -> 188
    //   296: pop
    //   297: new java/lang/String
    //   300: dup_x1
    //   301: swap
    //   302: invokespecial <init> : ([C)V
    //   305: invokevirtual intern : ()Ljava/lang/String;
    //   308: swap
    //   309: pop
    //   310: swap
    //   311: tableswitch default -> 43, 0 -> 101
    //   328: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2679) & 0xFFFF;
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
      char c = 'Á';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */