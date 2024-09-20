package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.BorderFactory;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.javatooling.api.Problem;

public class Zbqr extends Zbqc implements Zmid {
  private final Zg98 Zl;
  
  private final Zm6x ZB;
  
  private final Zl6k ZU;
  
  private final Zsuf Zt;
  
  private final Zxka ZN;
  
  private final Object Z_;
  
  private Zbqd ZI;
  
  private Zlte Zg;
  
  private Zx0x Zz;
  
  private Zx0x Zk;
  
  private Zx0x Zx;
  
  private Zbus ZX;
  
  private Zbup ZY;
  
  private Zbup ZT;
  
  private Zbup ZM;
  
  private Zmyz ZQ;
  
  private Zx0x ZV;
  
  private Zbcq ZJ;
  
  private ScheduledExecutorService ZZ;
  
  private ScheduledFuture<?> ZC;
  
  private boolean Za = false;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbqr(Zg98 paramZg98, Zgb6 paramZgb6, Zg9z paramZg9z, Zm6x paramZm6x) {
    this(paramZg98, paramZgb6, paramZg9z, paramZm6x, new Zewg(), (Component)null);
  }
  
  public Zbqr(Zg98 paramZg98, Zgb6 paramZgb6, Zg9z paramZg9z, Zm6x paramZm6x, Zxka paramZxka, Component paramComponent) {
    this(paramZg98, paramZgb6, paramZg9z, paramZm6x, paramZxka, paramComponent, new Zl6k(), new Zsuf());
  }
  
  public Zbqr(Zg98 paramZg98, Zgb6 paramZgb6, Zg9z paramZg9z, Zm6x paramZm6x, Zl6k paramZl6k, Zsuf paramZsuf) {
    this(paramZg98, paramZgb6, paramZg9z, paramZm6x, new Zewg(), (Component)null, paramZl6k, paramZsuf);
  }
  
  public Zbqr(Zg98 paramZg98, Zgb6 paramZgb6, Zg9z paramZg9z, Zm6x paramZm6x, Zxka paramZxka, Component paramComponent, Zl6k paramZl6k, Zsuf paramZsuf) {
    this.Zl = paramZg98;
    this.ZB = paramZm6x;
    this.ZN = paramZxka;
    this.ZU = paramZl6k;
    this.Zt = paramZsuf;
    this.Z_ = new Object();
    if (Zb12.ZG())
      return; 
    setLayout(new BorderLayout());
    if (paramComponent != null)
      add(paramComponent, a(9760, 10757)); 
    Zbqc zbqc = new Zbqc();
    zbqc.setLayout(new GridBagLayout());
    zbqc.setName(a(9762, -28378));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.anchor = 23;
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.fill = 1;
    zbqc.add(Zp(paramZg9z), gridBagConstraints);
    add(zbqc, a(9768, -4587));
    ZJ();
    Zz0g zz0g = this::lambda$new$0;
    paramZgb6.ZC(zz0g);
    addAncestorListener(new Zt8a(this, paramZl6k));
    paramZm6x.ZK((Zmt5<?>[])new Zmt5[] { new Zsbx(this) });
  }
  
  private void ZX() {}
  
  private void ZC() {
    if (this.ZC != null)
      this.ZC.cancel(false); 
    if (this.ZZ != null) {
      this.ZZ.shutdownNow();
      this.ZZ.close();
    } 
  }
  
  public void requestFocus() {
    super.requestFocus();
    this.ZI.requestFocus();
  }
  
  private Component Zp(Zg9z paramZg9z) {
    Zbqc zbqc = new Zbqc(new GridBagLayout());
    this.ZI = paramZg9z.Zr();
    this.ZJ = Zi();
    this.ZJ.setBorder(new EmptyBorder(0, 10, 0, 0));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    zbqc.add(this.ZJ, gridBagConstraints);
    this.ZX = new Zbus(this.Zt);
    this.ZX.setName(a(9769, 18044));
    this.Zz = new Zx0x();
    this.Zz.setEditable(false);
    this.ZY = new Zbup(this.Zz);
    this.ZY.setName(a(9767, 17951));
    this.ZY.Zh(Zlkk.BACKGROUND);
    this.ZY.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, Zlkk.BACKGROUND.ZS()));
    ZB(this.ZY);
    this.Zk = new Zx0x();
    this.Zk.setEditable(false);
    this.Zk.setName(a(9774, 28215));
    this.ZT = new Zbup(this.Zk);
    this.ZT.setName(a(9765, -31007));
    this.ZT.Zh(Zlkk.BACKGROUND);
    this.ZT.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, Zlkk.BACKGROUND.ZS()));
    ZB(this.ZT);
    this.Zx = new Zx0x();
    this.Zx.setEditable(false);
    this.ZM = new Zbup(this.Zx);
    this.ZM.Zh(Zlkk.BACKGROUND);
    this.ZM.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, Zlkk.BACKGROUND.ZS()));
    ZB(this.ZM);
    AtomicReference<Zlte> atomicReference = new AtomicReference();
    Objects.requireNonNull(atomicReference);
    this.Zg = Zrxv.Zp().ZP().Ze(new Zz43(this, atomicReference::get)).ZW();
    atomicReference.set(this.Zg);
    this.ZQ = new Zmyz(0);
    this.ZQ.add(this.ZI, a(9771, 11013));
    this.ZQ.add(this.Zg.ZO(), a(9763, 19785));
    this.ZQ.setDividerSize(1);
    this.ZQ.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, Zlkk.PANEL_BORDER.ZS()));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    zbqc.add(this.ZQ, gridBagConstraints);
    return zbqc;
  }
  
  private void ZB(Zbup paramZbup) {
    SwingUtilities.invokeLater(paramZbup::lambda$resetScrollToTop$3);
  }
  
  private Zbcq Zi() {
    Ze9n ze9n1 = Ze3m.ZC(Zeuf.CHEVRON_DOWN, Zlkk.RADIO_BAR_INACTIVE_FOREGROUND).ZU(Zmcx.LINE_SIZE).ZG(Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND).Z_();
    Ze9n ze9n2 = Ze3m.ZC(Zeuf.CHEVRON_UP, Zlkk.RADIO_BAR_ACTIVE_FOREGROUND).ZU(Zmcx.LINE_SIZE).Z_();
    Zz8s zz8s = new Zz8s(Zlkk.RADIO_BAR_DISABLED_BACKGROUND, new Zgun[] { new Zgun(ze9n1, Zmpl.NORMAL), new Zgun(ze9n2, Zmpl.SELECTED) });
    zz8s.setBorderPainted(false);
    Zsle zsle = new Zsle(zz8s);
    Zbqg zbqg = new Zbqg(this.Zl);
    Zf();
    return (new Zbxm()).Zd(zsle).ZU(false).Zx(this.ZV).ZE(Zett.EAST).Zu(zbqg).ZO(this.Zl.Zm()).ZC();
  }
  
  private void Zf() {
    this.ZV = new Zx0x();
    this.ZV.setCaret(new Zrqt());
    this.ZV.setEditable(false);
    this.ZV.setOpaque(false);
    this.ZV.setFont(this.ZI.ZM());
    SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
    StyleConstants.setBold(simpleAttributeSet, true);
    try {
      Document document = this.ZV.getDocument();
      document.insertString(0, this.Zl.Zp(), simpleAttributeSet);
      document.insertString(document.getLength(), " ", null);
      document.insertString(document.getLength(), this.Zl.ZZ(), null);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZR() {
    if (this.Zg.ZO().isVisible())
      return; 
    this.Zg.setVisible(true);
    this.ZQ.Zl(true);
    this.ZQ.ZF(true);
    this.ZQ.setDividerLocation(0.5D);
  }
  
  private void ZJ() {
    this.Zg.setVisible(false);
    this.ZQ.Zl(false);
    this.ZQ.ZF(false);
    this.ZQ.setDividerLocation(1.0D);
  }
  
  public void ZU(Set<Problem> paramSet) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Lburp/Zlte;
    //   4: aload_0
    //   5: getfield ZY : Lburp/Zbup;
    //   8: invokeinterface indexOfComponent : (Ljava/awt/Component;)I
    //   13: istore_3
    //   14: invokestatic ZL : ()[Lburp/Zbqc;
    //   17: aload_0
    //   18: getfield Zz : Lburp/Zx0x;
    //   21: aload_1
    //   22: aload_0
    //   23: invokevirtual Zs : ()Ljava/lang/String;
    //   26: invokestatic Zl : (Ljava/util/Set;Ljava/lang/String;)Ljava/lang/String;
    //   29: invokevirtual setText : (Ljava/lang/String;)V
    //   32: sipush #9770
    //   35: sipush #-4050
    //   38: invokestatic a : (II)Ljava/lang/String;
    //   41: iconst_1
    //   42: anewarray java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: aload_1
    //   48: invokeinterface size : ()I
    //   53: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   56: aastore
    //   57: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   60: astore #4
    //   62: astore_2
    //   63: iload_3
    //   64: iconst_m1
    //   65: if_icmpne -> 101
    //   68: aload_0
    //   69: getfield Zg : Lburp/Zlte;
    //   72: aload #4
    //   74: aload_0
    //   75: getfield ZY : Lburp/Zbup;
    //   78: invokeinterface addTab : (Ljava/lang/String;Ljava/awt/Component;)V
    //   83: aload_0
    //   84: getfield Zg : Lburp/Zlte;
    //   87: aload_0
    //   88: getfield ZY : Lburp/Zbup;
    //   91: invokeinterface indexOfComponent : (Ljava/awt/Component;)I
    //   96: istore_3
    //   97: aload_2
    //   98: ifnull -> 113
    //   101: aload_0
    //   102: getfield Zg : Lburp/Zlte;
    //   105: iload_3
    //   106: aload #4
    //   108: invokeinterface setTitleAt : (ILjava/lang/String;)V
    //   113: aload_0
    //   114: getfield Zg : Lburp/Zlte;
    //   117: iload_3
    //   118: invokeinterface setSelectedIndex : (I)V
    //   123: aload_0
    //   124: aload_0
    //   125: getfield ZY : Lburp/Zbup;
    //   128: invokevirtual ZB : (Lburp/Zbup;)V
    //   131: return
  }
  
  public void ZA() {
    Zp(this.ZY);
  }
  
  private void Zp(Zbup paramZbup) {
    int i = this.Zg.indexOfComponent(paramZbup);
    if (i != -1)
      this.Zg.removeTabAt(i); 
  }
  
  private void ZT() {
    Zp(this.ZX);
  }
  
  private void ZK() {
    Zp(this.ZT);
  }
  
  private void Zy(Zbup paramZbup, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: <illegal opcode> run : (Lburp/Zbqr;Lburp/Zbup;Ljava/lang/String;)Ljava/lang/Runnable;
    //   8: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  private void ZD() {
    Zy(this.ZX, a(9764, 5276));
    this.ZX.ZO();
  }
  
  private void ZW() {
    if (!this.Za)
      return; 
    synchronized (this.Z_) {
      Zy(this.ZT, a(9775, 26443).formatted(new Object[] { Integer.valueOf(this.ZU.ZD()) }));
      Zk();
    } 
  }
  
  private void Zk() {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zk : Lburp/Zx0x;
    //   8: invokevirtual getText : ()Ljava/lang/String;
    //   11: astore_2
    //   12: aload_2
    //   13: sipush #9766
    //   16: sipush #-23279
    //   19: invokestatic a : (II)Ljava/lang/String;
    //   22: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   25: ifeq -> 29
    //   28: return
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: aload_2
    //   34: invokespecial <init> : (Ljava/lang/String;)V
    //   37: astore_3
    //   38: aload_0
    //   39: getfield ZU : Lburp/Zl6k;
    //   42: invokevirtual ZR : ()Z
    //   45: ifeq -> 103
    //   48: aload_3
    //   49: invokevirtual length : ()I
    //   52: ldc 100000
    //   54: if_icmpge -> 103
    //   57: aload_0
    //   58: getfield ZU : Lburp/Zl6k;
    //   61: invokevirtual ZE : ()Lburp/Zsij;
    //   64: astore #4
    //   66: aload_0
    //   67: getfield ZN : Lburp/Zxka;
    //   70: aload #4
    //   72: invokevirtual ZM2 : ()J
    //   75: aload #4
    //   77: invokevirtual ZMm : ()Ljava/lang/Throwable;
    //   80: invokeinterface Zg : (JLjava/lang/Throwable;)Ljava/lang/String;
    //   85: astore #5
    //   87: aload_3
    //   88: aload #5
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: bipush #10
    //   95: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload_1
    //   100: ifnull -> 38
    //   103: aload_0
    //   104: getfield ZT : Lburp/Zbup;
    //   107: invokevirtual getViewport : ()Ljavax/swing/JViewport;
    //   110: invokevirtual getViewPosition : ()Ljava/awt/Point;
    //   113: astore #4
    //   115: aload_0
    //   116: getfield ZU : Lburp/Zl6k;
    //   119: invokevirtual ZR : ()Z
    //   122: ifeq -> 139
    //   125: aload_3
    //   126: sipush #9773
    //   129: sipush #25977
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload_2
    //   140: aload_3
    //   141: invokevirtual contentEquals : (Ljava/lang/CharSequence;)Z
    //   144: ifne -> 168
    //   147: aload_0
    //   148: aload_3
    //   149: <illegal opcode> run : (Lburp/Zbqr;Ljava/lang/StringBuilder;)Ljava/lang/Runnable;
    //   154: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   157: aload_0
    //   158: aload #4
    //   160: <illegal opcode> run : (Lburp/Zbqr;Ljava/awt/Point;)Ljava/lang/Runnable;
    //   165: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   168: return
  }
  
  public void Zx(Zsij paramZsij) {
    this.ZU.Zn(paramZsij);
    ZW();
  }
  
  public void Zh() {
    ZT();
    this.ZX.Zk();
    ZK();
    this.ZU.ZW();
    this.Zk.setText("");
  }
  
  public String Zs() {
    return (this.ZI == null) ? null : this.ZI.Zg();
  }
  
  public void Zl(String paramString) {
    if (this.ZI != null) {
      String str = (paramString == null || paramString.isEmpty()) ? this.Zl.Zy() : paramString;
      this.ZI.Z_(str, true);
      this.ZI.ZR(this.ZI.ZU());
    } 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZX != null)
      this.ZX.updateUI(); 
    if (this.Zz != null) {
      this.ZY.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, Zlkk.BACKGROUND.ZS()));
      this.ZY.updateUI();
      this.Zz.updateUI();
    } 
    if (this.Zk != null) {
      this.ZT.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, Zlkk.BACKGROUND.ZS()));
      this.ZT.updateUI();
      this.Zk.updateUI();
    } 
    if (this.Zx != null) {
      this.ZM.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, Zlkk.BACKGROUND.ZS()));
      this.ZM.updateUI();
      this.Zx.updateUI();
    } 
    if (this.ZQ != null)
      this.ZQ.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, Zlkk.PANEL_BORDER.ZS())); 
  }
  
  private void lambda$updateRuntimeErrorText$6(Point paramPoint) {
    this.ZT.getViewport().setViewPosition(paramPoint);
  }
  
  private void lambda$updateRuntimeErrorText$5(StringBuilder paramStringBuilder) {
    this.Zk.setText(paramStringBuilder.toString());
  }
  
  private void lambda$ensureTabExistsForScrollPane$4(Zbup paramZbup, String paramString) {
    int i = this.Zg.indexOfComponent(paramZbup);
    if (i == -1) {
      this.Zg.addTab(paramString, paramZbup);
      i = this.Zg.indexOfComponent(paramZbup);
      this.Zg.setSelectedIndex(i);
    } 
    this.Zg.setTitleAt(i, paramString);
  }
  
  private static void lambda$resetScrollToTop$3(Zbup paramZbup) {
    JScrollBar jScrollBar = paramZbup.getVerticalScrollBar();
    jScrollBar.setValue(jScrollBar.getMinimum());
  }
  
  private void lambda$startUpdatingBambdaConsole$2() {
    if (this.ZX.Zj())
      ZD(); 
  }
  
  private static Thread lambda$startUpdatingBambdaConsole$1(Runnable paramRunnable) {
    return new Thread(paramRunnable, a(9761, 31261));
  }
  
  private void lambda$new$0() {
    this.ZV.setFont(this.ZI.ZM());
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Næ¨sÓ­¿\\nû£í²6«ÚÍ(67·áDDþÄF:o¯z\\fó0ÏIL%1NÛ ¬Èª|Z¶o'{\àãvÚÓq7Ö\\r©HÂaOÑ6cß!Öå'Õ3fY©$!y8Þc½íR±mä~}ÈUÐ®]¸ÐlF¨¡~U²¬faÌê¡ÏÖzá:\\bó´V!f~1¦ñ\\bd/òwæaLÓß²þÃ:ù¸%cûæ¾¢3Áº13kôÑâ¥1V&Ð>mý½D'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #65
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'ÜÁ~I í'Àó^ó\çvÁ-^ä©H*ëeÉKÏ]ä'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #33
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #19
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zbqr.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbqr.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #19
    //   214: goto -> 244
    //   217: bipush #74
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #121
    //   229: goto -> 244
    //   232: bipush #60
    //   234: goto -> 244
    //   237: bipush #18
    //   239: goto -> 244
    //   242: bipush #90
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2623) & 0xFFFF;
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
      byte b1 = 51;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */