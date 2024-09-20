package burp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Objects;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.JTextComponent;

class Zkmv extends JDialog implements CaretListener, ListSelectionListener, MouseListener {
  private final Zljk Zd;
  
  private final Zgwl ZF;
  
  private final Zxkb Zr;
  
  private final Ztd4 Zf;
  
  private final List<Zlpm> ZI;
  
  private Zmy1 Zv;
  
  private Zl8k ZL;
  
  private Dimension ZZ;
  
  private boolean ZW;
  
  private Color Zu;
  
  private int ZM;
  
  private boolean Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zkmv(Window paramWindow, Zljk paramZljk) {
    super(paramWindow);
    setUndecorated(true);
    setType(Window.Type.POPUP);
    ComponentOrientation componentOrientation = paramZljk.Zq();
    this.Zd = paramZljk;
    this.Zr = new Zxkb();
    this.ZF = new Zgwl(this, this.Zr);
    this.ZF.setCellRenderer(new Zstc());
    this.ZF.addListSelectionListener(this);
    this.ZF.addMouseListener(this);
    JPanel jPanel = new JPanel(new BorderLayout());
    JScrollPane jScrollPane = new JScrollPane(this.ZF, 22, 32);
    int[] arrayOfInt = Zghd.ZM();
    Zehv zehv = new Zehv();
    boolean bool = componentOrientation.isLeftToRight();
    String str = bool ? a(-4431, 20377) : a(-4427, -3561);
    jScrollPane.setCorner(str, zehv);
    jPanel.add(jScrollPane);
    setContentPane(jPanel);
    applyComponentOrientation(componentOrientation);
    if (Zly8.ZW()) {
      Zsqd zsqd = Zsqd.Zo();
      if (zsqd != null)
        zsqd.Zh(this); 
    } 
    pack();
    setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
    setFocusableWindowState(false);
    addComponentListener(new Zgn_(this));
    this.ZM = -1;
    JTextComponent jTextComponent = paramZljk.Zr();
    Objects.requireNonNull(jTextComponent);
    Objects.requireNonNull(jTextComponent);
    this.Zf = new Ztd4(jTextComponent::getInputMap, jTextComponent::getActionMap);
    Zmw8 zmw8 = new Zmw8(this);
    Zlpm zlpm1 = new Zlpm(27, a(-4429, 18078), new Zx6p(this));
    Zlpm zlpm2 = new Zlpm(38, a(-4421, -17910), new Zbnl(this));
    Zlpm zlpm3 = new Zlpm(40, a(-4432, 15436), new Zr33(this));
    Zlpm zlpm4 = new Zlpm(37, a(-4430, 22308), new Ztix(this));
    Zlpm zlpm5 = new Zlpm(39, a(-4417, 26907), new Zlfk(this));
    Zlpm zlpm6 = new Zlpm(10, a(-4425, -24322), zmw8);
    Zlpm zlpm7 = new Zlpm(9, a(-4426, -14141), zmw8);
    Zlpm zlpm8 = new Zlpm(36, a(-4428, -18593), new Zzue(this));
    Zlpm zlpm9 = new Zlpm(35, a(-4418, 11884), new Zzw7(this));
    Zlpm zlpm10 = new Zlpm(33, a(-4423, 22627), new Zbl8(this));
    Zlpm zlpm11 = new Zlpm(34, a(-4420, 7838), new Zr6l(this));
    Zlpm zlpm12 = new Zlpm(KeyStroke.getKeyStroke(67, 128), a(-4419, -20521), new Zrit(this));
    Zlpm zlpm13 = new Zlpm(112, a(-4422, -1825), new Ztt1(this, paramZljk, this.ZL));
    this.ZI = List.of(new Zlpm[] { 
          zlpm1, zlpm2, zlpm3, zlpm4, zlpm5, zlpm6, zlpm7, zlpm8, zlpm9, zlpm10, 
          zlpm11, zlpm12, zlpm13 });
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void caretUpdate(CaretEvent paramCaretEvent) {
    int[] arrayOfInt = Zghd.ZM();
    if (isVisible()) {
      int i = this.Zd.Zg();
      if (i != this.ZM) {
        this.ZM = -1;
        setVisible(false);
        if (arrayOfInt == null) {
          Z_();
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    Z_();
  }
  
  private Zl8k Zx() {
    Zl8k zl8k = new Zl8k(this, this.Zd);
    zl8k.applyComponentOrientation(this.Zd.Zq());
    Dimension dimension = this.ZZ;
    int[] arrayOfInt = Zghd.ZM();
    if (dimension == null)
      dimension = getSize(); 
    Zmse.Zf(zl8k, dimension.width, dimension.height);
    zl8k.setSize(zl8k.getPreferredSize());
    if (this.Zu != null) {
      zl8k.setBackground(this.Zu);
      if (arrayOfInt == null) {
        this.Zu = zl8k.getBackground();
        return zl8k;
      } 
      return zl8k;
    } 
    this.Zu = zl8k.getBackground();
    return zl8k;
  }
  
  protected void Z_() {
    this.ZM = this.Zd.Zo();
  }
  
  public Zmy1 Ze() {
    return isShowing() ? this.ZF.getSelectedValue() : this.Zv;
  }
  
  private void ZL() {
    Zmy1 zmy1 = Ze();
    this.Zd.Zp(zmy1);
  }
  
  private void Zf() {
    if (this.Ze)
      return; 
    Objects.requireNonNull(this.Zf);
    this.ZI.forEach(this.Zf::Zu);
    JTextComponent jTextComponent = this.Zd.Zr();
    jTextComponent.addCaretListener(this);
    this.Ze = true;
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getClickCount() == 2)
      ZL(); 
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {}
  
  private void Zc() {
    if (this.ZL != null && this.Zd.Z_() && this.ZL.isVisible())
      Zr(); 
  }
  
  private void Zr() {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZL : Lburp/Zl8k;
    //   8: ifnull -> 25
    //   11: aload_0
    //   12: getfield Zd : Lburp/Zljk;
    //   15: invokevirtual Z_ : ()Z
    //   18: ifeq -> 25
    //   21: iconst_1
    //   22: goto -> 26
    //   25: iconst_0
    //   26: istore_2
    //   27: iload_2
    //   28: ifne -> 32
    //   31: return
    //   32: aload_0
    //   33: invokevirtual getLocation : ()Ljava/awt/Point;
    //   36: astore_3
    //   37: aload_3
    //   38: getfield x : I
    //   41: aload_3
    //   42: getfield y : I
    //   45: invokestatic Zi : (II)Ljava/awt/Rectangle;
    //   48: astore #4
    //   50: aload_0
    //   51: getfield Zd : Lburp/Zljk;
    //   54: invokevirtual Zq : ()Ljava/awt/ComponentOrientation;
    //   57: invokevirtual isLeftToRight : ()Z
    //   60: ifeq -> 120
    //   63: aload_0
    //   64: invokevirtual getX : ()I
    //   67: aload_0
    //   68: invokevirtual getWidth : ()I
    //   71: iadd
    //   72: iconst_5
    //   73: iadd
    //   74: istore #5
    //   76: iload #5
    //   78: aload_0
    //   79: getfield ZL : Lburp/Zl8k;
    //   82: invokevirtual getWidth : ()I
    //   85: iadd
    //   86: aload #4
    //   88: getfield x : I
    //   91: aload #4
    //   93: getfield width : I
    //   96: iadd
    //   97: if_icmple -> 159
    //   100: aload_0
    //   101: invokevirtual getX : ()I
    //   104: iconst_5
    //   105: isub
    //   106: aload_0
    //   107: getfield ZL : Lburp/Zl8k;
    //   110: invokevirtual getWidth : ()I
    //   113: isub
    //   114: istore #5
    //   116: aload_1
    //   117: ifnonnull -> 159
    //   120: aload_0
    //   121: invokevirtual getX : ()I
    //   124: iconst_5
    //   125: isub
    //   126: aload_0
    //   127: getfield ZL : Lburp/Zl8k;
    //   130: invokevirtual getWidth : ()I
    //   133: isub
    //   134: istore #5
    //   136: iload #5
    //   138: aload #4
    //   140: getfield x : I
    //   143: if_icmpge -> 159
    //   146: aload_0
    //   147: invokevirtual getX : ()I
    //   150: aload_0
    //   151: invokevirtual getWidth : ()I
    //   154: iadd
    //   155: iconst_5
    //   156: iadd
    //   157: istore #5
    //   159: aload_0
    //   160: invokevirtual getY : ()I
    //   163: istore #6
    //   165: aload_0
    //   166: getfield ZW : Z
    //   169: ifeq -> 189
    //   172: iload #6
    //   174: aload_0
    //   175: invokevirtual getHeight : ()I
    //   178: iadd
    //   179: aload_0
    //   180: getfield ZL : Lburp/Zl8k;
    //   183: invokevirtual getHeight : ()I
    //   186: isub
    //   187: istore #6
    //   189: iload #5
    //   191: aload_0
    //   192: getfield ZL : Lburp/Zl8k;
    //   195: invokevirtual getX : ()I
    //   198: if_icmpne -> 213
    //   201: iload #6
    //   203: aload_0
    //   204: getfield ZL : Lburp/Zl8k;
    //   207: invokevirtual getY : ()I
    //   210: if_icmpeq -> 224
    //   213: aload_0
    //   214: getfield ZL : Lburp/Zl8k;
    //   217: iload #5
    //   219: iload #6
    //   221: invokevirtual setLocation : (II)V
    //   224: return
  }
  
  private void Zm() {
    if (this.Zr.getSize() > 0) {
      this.ZF.setSelectedIndex(0);
      this.ZF.ensureIndexIsVisible(0);
    } 
  }
  
  private void ZN() {
    int i = this.Zr.getSize() - 1;
    if (i > -1) {
      this.ZF.setSelectedIndex(i);
      this.ZF.ensureIndexIsVisible(i);
    } 
  }
  
  private void Zv() {
    int i = this.ZF.getSelectedIndex();
    if (i > -1) {
      i = (i + 1) % this.Zr.getSize();
      this.ZF.setSelectedIndex(i);
      this.ZF.ensureIndexIsVisible(i);
    } 
  }
  
  private void ZK() {
    int i = this.ZF.getVisibleRowCount();
    int j = Math.min(this.ZF.getModel().getSize() - 1, this.ZF.getSelectedIndex() + i);
    this.ZF.setSelectedIndex(j);
    this.ZF.ensureIndexIsVisible(j);
  }
  
  private void ZI() {
    int i = this.ZF.getVisibleRowCount();
    int j = Math.max(0, this.ZF.getSelectedIndex() - i);
    this.ZF.setSelectedIndex(j);
    this.ZF.ensureIndexIsVisible(j);
  }
  
  private void Zk() {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZF : Lburp/Zgwl;
    //   8: invokevirtual getSelectedIndex : ()I
    //   11: istore_2
    //   12: iload_2
    //   13: lookupswitch default -> 80, -1 -> 59, 0 -> 40
    //   40: aload_0
    //   41: getfield ZF : Lburp/Zgwl;
    //   44: invokevirtual getModel : ()Ljavax/swing/ListModel;
    //   47: invokeinterface getSize : ()I
    //   52: iconst_1
    //   53: isub
    //   54: istore_2
    //   55: aload_1
    //   56: ifnonnull -> 84
    //   59: aload_0
    //   60: getfield ZF : Lburp/Zgwl;
    //   63: invokevirtual getModel : ()Ljavax/swing/ListModel;
    //   66: invokeinterface getSize : ()I
    //   71: iconst_1
    //   72: isub
    //   73: istore_2
    //   74: iload_2
    //   75: iconst_m1
    //   76: if_icmpne -> 84
    //   79: return
    //   80: iload_2
    //   81: iconst_1
    //   82: isub
    //   83: istore_2
    //   84: aload_0
    //   85: getfield ZF : Lburp/Zgwl;
    //   88: iload_2
    //   89: invokevirtual setSelectedIndex : (I)V
    //   92: aload_0
    //   93: getfield ZF : Lburp/Zgwl;
    //   96: iload_2
    //   97: invokevirtual ensureIndexIsVisible : (I)V
    //   100: return
  }
  
  public void ZU(List<Zmy1> paramList) {
    this.Zr.Zg(paramList);
    Zm();
  }
  
  public void ZJ(Dimension paramDimension) {
    this.ZZ = paramDimension;
    if (this.ZL != null) {
      Zmse.Zf(this.ZL, paramDimension.width, paramDimension.height);
      this.ZL.setSize(this.ZL.getPreferredSize());
    } 
  }
  
  public void Zy(ListCellRenderer<Object> paramListCellRenderer) {
    Zstc zstc = (Zstc)this.ZF.getCellRenderer();
    zstc.Ze(paramListCellRenderer);
  }
  
  public void ZZ(Rectangle paramRectangle) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: getfield x : I
    //   8: aload_1
    //   9: getfield y : I
    //   12: invokestatic Zi : (II)Ljava/awt/Rectangle;
    //   15: astore_3
    //   16: aload_0
    //   17: getfield ZL : Lburp/Zl8k;
    //   20: ifnull -> 37
    //   23: aload_0
    //   24: getfield Zd : Lburp/Zljk;
    //   27: invokevirtual Z_ : ()Z
    //   30: ifeq -> 37
    //   33: iconst_1
    //   34: goto -> 38
    //   37: iconst_0
    //   38: istore #4
    //   40: aload_0
    //   41: invokevirtual getHeight : ()I
    //   44: istore #5
    //   46: iload #4
    //   48: ifeq -> 65
    //   51: iload #5
    //   53: aload_0
    //   54: getfield ZL : Lburp/Zl8k;
    //   57: invokevirtual getHeight : ()I
    //   60: invokestatic max : (II)I
    //   63: istore #5
    //   65: aload_0
    //   66: iconst_0
    //   67: putfield ZW : Z
    //   70: aload_1
    //   71: getfield y : I
    //   74: aload_1
    //   75: getfield height : I
    //   78: iadd
    //   79: iconst_1
    //   80: iadd
    //   81: istore #6
    //   83: iload #6
    //   85: iload #5
    //   87: iadd
    //   88: aload_3
    //   89: getfield height : I
    //   92: if_icmple -> 113
    //   95: aload_1
    //   96: getfield y : I
    //   99: iconst_1
    //   100: isub
    //   101: aload_0
    //   102: invokevirtual getHeight : ()I
    //   105: isub
    //   106: istore #6
    //   108: aload_0
    //   109: iconst_1
    //   110: putfield ZW : Z
    //   113: aload_1
    //   114: getfield x : I
    //   117: istore #7
    //   119: aload_0
    //   120: getfield Zd : Lburp/Zljk;
    //   123: invokevirtual Zq : ()Ljava/awt/ComponentOrientation;
    //   126: invokevirtual isLeftToRight : ()Z
    //   129: ifne -> 141
    //   132: iload #7
    //   134: aload_0
    //   135: invokevirtual getWidth : ()I
    //   138: isub
    //   139: istore #7
    //   141: iload #7
    //   143: aload_3
    //   144: getfield x : I
    //   147: if_icmpge -> 160
    //   150: aload_3
    //   151: getfield x : I
    //   154: istore #7
    //   156: aload_2
    //   157: ifnonnull -> 195
    //   160: iload #7
    //   162: aload_0
    //   163: invokevirtual getWidth : ()I
    //   166: iadd
    //   167: aload_3
    //   168: getfield x : I
    //   171: aload_3
    //   172: getfield width : I
    //   175: iadd
    //   176: if_icmple -> 195
    //   179: aload_3
    //   180: getfield x : I
    //   183: aload_3
    //   184: getfield width : I
    //   187: iadd
    //   188: aload_0
    //   189: invokevirtual getWidth : ()I
    //   192: isub
    //   193: istore #7
    //   195: aload_0
    //   196: iload #7
    //   198: iload #6
    //   200: invokevirtual setLocation : (II)V
    //   203: iload #4
    //   205: ifeq -> 212
    //   208: aload_0
    //   209: invokevirtual Zr : ()V
    //   212: return
  }
  
  public void setVisible(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_2
    //   4: iload_1
    //   5: aload_0
    //   6: invokevirtual isVisible : ()Z
    //   9: if_icmpeq -> 158
    //   12: iload_1
    //   13: ifeq -> 98
    //   16: aload_0
    //   17: aload_0
    //   18: getfield Zd : Lburp/Zljk;
    //   21: invokevirtual Zg : ()I
    //   24: putfield ZM : I
    //   27: aload_0
    //   28: invokevirtual Zm : ()V
    //   31: aload_0
    //   32: getfield ZL : Lburp/Zl8k;
    //   35: ifnonnull -> 60
    //   38: aload_0
    //   39: getfield Zd : Lburp/Zljk;
    //   42: invokevirtual Z_ : ()Z
    //   45: ifeq -> 60
    //   48: aload_0
    //   49: aload_0
    //   50: invokevirtual Zx : ()Lburp/Zl8k;
    //   53: putfield ZL : Lburp/Zl8k;
    //   56: aload_0
    //   57: invokevirtual Zr : ()V
    //   60: aload_0
    //   61: invokevirtual Zf : ()V
    //   64: aload_0
    //   65: getfield ZL : Lburp/Zl8k;
    //   68: ifnull -> 102
    //   71: aload_0
    //   72: getfield ZF : Lburp/Zgwl;
    //   75: invokevirtual getSelectedValue : ()Ljava/lang/Object;
    //   78: checkcast burp/Zmy1
    //   81: astore_3
    //   82: aload_3
    //   83: ifnull -> 94
    //   86: aload_0
    //   87: getfield ZL : Lburp/Zl8k;
    //   90: aload_3
    //   91: invokevirtual ZL : (Lburp/Zmy1;)V
    //   94: aload_2
    //   95: ifnonnull -> 102
    //   98: aload_0
    //   99: invokevirtual ZE : ()V
    //   102: aload_0
    //   103: iload_1
    //   104: invokespecial setVisible : (Z)V
    //   107: iload_1
    //   108: ifne -> 151
    //   111: aload_0
    //   112: aload_0
    //   113: getfield ZF : Lburp/Zgwl;
    //   116: invokevirtual getSelectedValue : ()Ljava/lang/Object;
    //   119: checkcast burp/Zmy1
    //   122: putfield Zv : Lburp/Zmy1;
    //   125: aload_0
    //   126: getfield Zr : Lburp/Zxkb;
    //   129: invokevirtual ZJ : ()V
    //   132: aload_0
    //   133: getfield ZL : Lburp/Zl8k;
    //   136: ifnull -> 158
    //   139: aload_0
    //   140: getfield ZL : Lburp/Zl8k;
    //   143: iconst_0
    //   144: invokevirtual setVisible : (Z)V
    //   147: aload_2
    //   148: ifnonnull -> 158
    //   151: aload_0
    //   152: getfield ZF : Lburp/Zgwl;
    //   155: invokevirtual repaint : ()V
    //   158: return
  }
  
  private void ZE() {
    if (!this.Ze)
      return; 
    this.Zf.ZP();
    this.Zd.Zr().removeCaretListener(this);
    this.Ze = false;
  }
  
  public void Zp() {
    SwingUtilities.updateComponentTreeUI(this);
    if (this.ZL != null)
      this.ZL.Zp(); 
  }
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    if (!paramListSelectionEvent.getValueIsAdjusting()) {
      Zmy1 zmy1 = this.ZF.getSelectedValue();
      if (zmy1 != null && this.ZL != null) {
        this.ZL.ZL(zmy1);
        Zr();
      } 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'qÚzäôÑkþOº<\\t¯^ñòþ¼FgÓg÷U7TòØÊ8hÿ¨xzPöÀE¹Â|ÎKU!N~Éq?nÅ¬\\b×8ð±3oì%\\n!'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #95
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'ßºÞhXx'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #37
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zkmv.a : [Ljava/lang/String;
    //   130: bipush #15
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zkmv.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #10
    //   219: goto -> 244
    //   222: bipush #9
    //   224: goto -> 244
    //   227: bipush #107
    //   229: goto -> 244
    //   232: bipush #119
    //   234: goto -> 244
    //   237: bipush #38
    //   239: goto -> 244
    //   242: bipush #107
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEEB7) & 0xFFFF;
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
      byte b1 = 107;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkmv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */