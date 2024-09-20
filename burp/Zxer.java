package burp;

import com.formdev.flatlaf.extras.components.FlatTabbedPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragSource;
import java.awt.event.MouseEvent;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.text.JTextComponent;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxer extends FlatTabbedPane implements Zlte {
  private final boolean Zo;
  
  private final boolean Zw;
  
  private final boolean ZU;
  
  private final boolean Zx;
  
  private final Predicate<Integer> Zd;
  
  private final boolean ZA;
  
  private final boolean ZY;
  
  private final boolean ZB;
  
  private final Zlkk ZD;
  
  private final Ztca ZX;
  
  private final Zgwj Zt;
  
  private final Zzc2 Zr;
  
  private final Zrsj<? extends Zr6e> ZN;
  
  private final Zz6_ ZJ;
  
  private final Ztuc ZM;
  
  private final Zzyl Zg;
  
  private final Zlyt ZF;
  
  private final Zz5z Zz;
  
  private static Zzmz ZZ;
  
  private Zr8f ZV;
  
  private static String[] Zu;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zxer() {
    this(false, false, false, false, Zxer::lambda$new$0, false, false, false, false, false, false, false, false, (Component)null, (Zlkk)null, Ztca.ZN, Zgwj.ZY, Zzc2.Z_, Zrsj.Zv, (Zzyl)null, Ztuc.Zs, new Zl3r(), Zxer::lambda$new$1, DragSource.DefaultMoveNoDrop);
  }
  
  public Zxer(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Predicate<Integer> paramPredicate, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, boolean paramBoolean11, boolean paramBoolean12, Component paramComponent, Zlkk paramZlkk, Ztca paramZtca, Zgwj paramZgwj, Zzc2 paramZzc2, Zrsj<? extends Zr6e> paramZrsj, Zzyl paramZzyl, Ztuc paramZtuc, Zz9w paramZz9w, Consumer<Zlfz> paramConsumer, Cursor paramCursor) {
    this.Zo = paramBoolean1;
    this.Zw = paramBoolean2;
    this.ZU = paramBoolean3;
    this.ZY = paramBoolean7;
    this.Zx = paramBoolean4;
    this.Zd = paramPredicate;
    this.ZA = paramBoolean5;
    this.ZB = paramBoolean12;
    this.ZD = paramZlkk;
    this.ZX = paramZtca;
    this.Zt = paramZgwj;
    this.Zr = paramZzc2;
    this.ZN = paramZrsj;
    this.ZM = paramZtuc;
    this.ZF = new Zlyt(this, paramZrsj);
    this.Zz = new Zz5z(this, paramZrsj, paramZz9w, this.ZF, paramBoolean6, paramConsumer, paramCursor);
    this.ZJ = new Zz6_<>(this, paramZrsj, paramZzc2, paramZtca, paramBoolean3);
    if (ZZ == null)
      ZZ = new Zzmz(); 
    setFocusable(false);
    setOpaque(true);
    setScrollButtonsPolicy(FlatTabbedPane.ScrollButtonsPolicy.asNeeded);
    if (paramZlkk != null)
      setBackground(paramZlkk.ZS()); 
    if (paramBoolean8) {
      setTabAreaInsets(new Insets(2, 0, 0, 0));
      putClientPropertyBoolean(a(-9866, 21425), true, false);
    } 
    if (paramBoolean10)
      setTabsPopupPolicy(FlatTabbedPane.TabsPopupPolicy.never); 
    Zbca zbca = Zp(paramBoolean10, paramBoolean11, paramComponent);
    Objects.requireNonNull(zbca);
    this.Zg = (paramZzyl != null) ? paramZzyl : new Zkog(this, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramPredicate, paramBoolean7, paramBoolean9, paramBoolean10, paramZrsj, paramZtca, zbca::Zv);
    addChangeListener(this);
    ZK();
    if (paramBoolean5)
      this.Zz.ZR(); 
  }
  
  private Zbca Zp(boolean paramBoolean1, boolean paramBoolean2, Component paramComponent) {
    Zbca zbca = new Zbca(this, this.ZX, this.Zx, paramBoolean1, paramBoolean2, paramComponent, this.ZD);
    setTrailingComponent(zbca);
    return zbca;
  }
  
  private void ZK() {
    addMouseListener(new Zrxt(this));
  }
  
  DragGestureRecognizer ZT(Component paramComponent) {
    return this.ZA ? this.Zz.ZA(paramComponent) : null;
  }
  
  void Zd(DragGestureRecognizer paramDragGestureRecognizer) {
    if (this.ZA)
      this.Zz.ZX(paramDragGestureRecognizer); 
  }
  
  void ZF(DragGestureRecognizer paramDragGestureRecognizer) {
    if (this.ZA)
      this.Zz.ZY(paramDragGestureRecognizer); 
  }
  
  public void Z_() {
    setShowTabSeparators(true);
  }
  
  public void ZQ() {
    putClientProperty(a(-9872, 15269), Boolean.valueOf(true));
  }
  
  public Ztal Zj() {
    return Ztal.ZR(getTabLayoutPolicy());
  }
  
  public void Zr(Ztal paramZtal) {
    if (paramZtal == null || !this.ZY)
      return; 
    int i = getTabLayoutPolicy();
    if (paramZtal.layout != i) {
      setTabLayoutPolicy(paramZtal.layout);
      this.Zr.Zn(paramZtal);
    } 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZD != null)
      setBackground(this.ZD.ZS()); 
  }
  
  void ZO(MouseEvent paramMouseEvent) {
    this.Zt.ZK(this, (Component)paramMouseEvent.getSource(), this::lambda$requestNewTab$2);
  }
  
  void ZS(int paramInt) {
    this.Zt.Zn(this, paramInt, this::ZX);
  }
  
  public void setSelectedIndex(int paramInt) {
    if (!this.ZN.Zf(paramInt)) {
      super.setSelectedIndex(paramInt);
      SwingUtilities.invokeLater(this::lambda$setSelectedIndex$3);
    } 
  }
  
  public void Zt(int paramInt, Zr6e paramZr6e) {
    Zr88 zr88 = new Zr88(paramZr6e, this, this.Zr, this.ZX, this.ZN, this.Zo);
    super.insertTab(paramZr6e.ZyV(), null, null, null, paramInt);
    setTabComponentAt(paramInt, zr88);
  }
  
  public void Zg(String paramString, Component paramComponent, Zliy<? extends Zr6e> paramZliy) {
    int i = (paramZliy != null && paramZliy.ZR() != null) ? (Zj(paramZliy) + 1) : getTabCount();
    Zm(paramString, paramComponent, paramZliy, (String)null, i);
  }
  
  private void ZX(List<Zmkb> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 13
    //   4: aload_1
    //   5: invokeinterface isEmpty : ()Z
    //   10: ifeq -> 14
    //   13: return
    //   14: new java/util/concurrent/atomic/AtomicInteger
    //   17: dup
    //   18: aload_1
    //   19: invokeinterface getFirst : ()Ljava/lang/Object;
    //   24: checkcast burp/Zmkb
    //   27: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   30: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   35: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   38: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   43: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   46: aload_0
    //   47: <illegal opcode> apply : (Lburp/Zxer;)Ljava/util/function/Function;
    //   52: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   55: aload_0
    //   56: <illegal opcode> get : (Lburp/Zxer;)Ljava/util/function/Supplier;
    //   61: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   64: checkcast java/lang/Integer
    //   67: invokevirtual intValue : ()I
    //   70: invokespecial <init> : (I)V
    //   73: astore_2
    //   74: aload_1
    //   75: aload_0
    //   76: aload_2
    //   77: <illegal opcode> accept : (Lburp/Zxer;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   82: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   87: return
  }
  
  public void Zl(String paramString1, Component paramComponent, String paramString2, int paramInt) {
    ZQ(new Zlj8(paramString1), paramComponent, (Zliy<? extends Zr6e>)null, paramString2, paramInt);
  }
  
  public void ZA(Zgah paramZgah, Component paramComponent, int paramInt) {
    ZQ(paramZgah, paramComponent, (Zliy<? extends Zr6e>)null, (String)null, paramInt);
  }
  
  public void insertTab(String paramString1, Icon paramIcon, Component paramComponent, String paramString2, int paramInt) {
    ZQ(new Zlj8(paramString1), paramComponent, (Zliy<? extends Zr6e>)null, paramString2, paramInt);
  }
  
  public void Zm(String paramString1, Component paramComponent, Zliy<? extends Zr6e> paramZliy, String paramString2, int paramInt) {
    ZQ(new Zlj8(paramString1), paramComponent, paramZliy, paramString2, paramInt);
  }
  
  public void ZQ(Zgah paramZgah, Component paramComponent, Zliy<? extends Zr6e> paramZliy, String paramString, int paramInt) {
    this.Zr.ZW(paramInt, new Zmkb(paramZgah.Zo(), paramComponent, paramZliy));
    Zr8f zr8f = new Zr8f(paramZgah, paramString, paramComponent, paramZliy, this, this.Zr, this.ZX, this.ZN, this.Zo, this.ZU, this.Zw);
    super.insertTab(paramZgah.Zo(), null, paramComponent, paramString, paramInt);
    setTabComponentAt(paramInt, zr8f.ZD());
  }
  
  void ZN(Component paramComponent1, Component paramComponent2, int paramInt) {
    super.insertTab(null, null, paramComponent2, null, paramInt);
    setTabComponentAt(paramInt, paramComponent1);
  }
  
  public void setTitleAt(int paramInt, String paramString) {
    Zewb zewb = (Zewb)getTabComponentAt(paramInt);
    zewb.setText(paramString);
  }
  
  public String getTitleAt(int paramInt) {
    Zewb zewb = (Zewb)getTabComponentAt(paramInt);
    return (zewb == null) ? null : zewb.getText();
  }
  
  public void setEnabledAt(int paramInt, boolean paramBoolean) {
    getTabComponentAt(paramInt).setEnabled(paramBoolean);
    super.setEnabledAt(paramInt, paramBoolean);
  }
  
  public void removeAll() {
    super.setSelectedIndex(-1);
    int i = getTabCount() - 1;
    String[] arrayOfString = Zr();
    while (i >= 0) {
      boolean bool = this.ZN.Zk(i);
      removeTabAt(i);
      if (bool)
        i--; 
      i--;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public void Zx(int paramInt) {
    Zuh.Zb(((Zewb)getTabComponentAt(paramInt)).Zp(), Zqf.Zr);
    super.removeTabAt(paramInt);
  }
  
  public void removeTabAt(int paramInt) {
    Zf(paramInt, false);
  }
  
  public void Zl(List<Integer> paramList) {
    String[] arrayOfString = Zr();
    if (paramList.isEmpty())
      return; 
    boolean bool = paramList.contains(Integer.valueOf(getSelectedIndex()));
    Component component = getSelectedComponent();
    setSelectedIndex(-1);
    int i = paramList.size() - 1;
    while (i >= 0) {
      Zx(((Integer)paramList.get(i)).intValue(), false, false, false);
      i--;
      if (arrayOfString != null)
        break; 
    } 
    if (bool) {
      i = ((Integer)paramList.getFirst()).intValue();
      ZL(Math.min(i, getTabCount() - 1), false);
      if (arrayOfString != null) {
        if (component != null) {
          setSelectedComponent(component);
          repaint();
        } 
        return;
      } 
      return;
    } 
    if (component != null) {
      setSelectedComponent(component);
      repaint();
    } 
  }
  
  void Zw(MouseEvent paramMouseEvent, int paramInt) {
    Zkj9 zkj9 = this.ZM.Zg((this.ZV != null), paramInt);
    if (zkj9 != null)
      zkj9.show((Component)this, paramMouseEvent.getX(), paramMouseEvent.getY()); 
  }
  
  void ZA(MouseEvent paramMouseEvent, int paramInt) {
    Zkj9 zkj9 = this.ZM.ZX(paramInt);
    if (zkj9 != null)
      zkj9.show((Component)this, paramMouseEvent.getX(), paramMouseEvent.getY()); 
  }
  
  void ZC(Component paramComponent, int paramInt1, int paramInt2) {
    Zkj9 zkj9 = this.ZM.ZW((this.ZV != null));
    if (zkj9 != null)
      zkj9.show(paramComponent, paramInt1, paramInt2); 
  }
  
  void ZQ(Zgah paramZgah, String paramString, Component paramComponent, Zliy<? extends Zr6e> paramZliy) {
    this.ZX.ZR();
    int i = getTabCount();
    ZQ(paramZgah, paramComponent, paramZliy, paramString, i);
    setTabComponentAt(i, this.ZV);
  }
  
  void ZV() {
    this.ZX.ZK();
    removeTabAt(getSelectedIndex());
    if (getTabCount() == 0)
      ZF(); 
  }
  
  void Zv() {
    int i = this.ZN.Zh();
    String[] arrayOfString = Zr();
    if (ZY(i, getTabCount() - i - 1)) {
      this.ZX.ZL();
      int j = getTabCount();
      int k = getSelectedIndex();
      int m = j - 1;
      while (m >= 0) {
        if (m != k) {
          boolean bool = this.ZN.Zk(m);
          removeTabAt(m);
          if (bool)
            m--; 
        } 
        m--;
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  void ZH() {
    int i = this.ZN.Zh();
    int j = getTabCount() - i;
    if (ZY(i, j)) {
      this.ZX.Zt();
      removeAll();
      ZF();
    } 
  }
  
  void Zl() {
    int i = getSelectedIndex();
    String[] arrayOfString = Zr();
    int j = IntStream.range(0, i).map(this::lambda$closeTabsToTheLeft$8).sum();
    int k = i - j;
    if (ZY(j, k)) {
      this.ZX.Zs();
      Component component = getSelectedComponent();
      setSelectedIndex(-1);
      int m = i - 1;
      while (m >= 0) {
        boolean bool = this.ZN.Zk(m);
        removeTabAt(m);
        if (bool)
          m--; 
        m--;
        if (arrayOfString != null)
          break; 
      } 
      setSelectedComponent(component);
      repaint();
    } 
  }
  
  void Zo() {
    int i = getSelectedIndex();
    int j = IntStream.range(i + 1, getTabCount()).map(this::lambda$closeTabsToTheRight$9).sum();
    int k = getTabCount() - i - 1 - j;
    String[] arrayOfString = Zr();
    if (ZY(j, k)) {
      this.ZX.ZZ();
      int m = getTabCount() - 1;
      while (m > i) {
        boolean bool = this.ZN.Zk(m);
        removeTabAt(m);
        if (bool)
          m--; 
        m--;
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  void Zk() {
    Zr6e zr6e;
    int i = getSelectedIndex();
    int j = i;
    do {
      j = Zp(j - 1);
      zr6e = (Zr6e)this.ZN.ZD(j);
    } while (j != i && zr6e != null && (!zr6e.Zy7() || this.ZN.Zf(j)));
    if (j != i)
      setSelectedIndex(j); 
  }
  
  void Zp() {
    Zr6e zr6e;
    int i = getSelectedIndex();
    int j = i;
    do {
      j = ZO(j + 1);
      zr6e = (Zr6e)this.ZN.ZD(j);
    } while (j != i && zr6e != null && (!zr6e.Zy7() || this.ZN.Zf(j)));
    if (j != i)
      setSelectedIndex(j); 
  }
  
  private int Zj(Zliy<? extends Zr6e> paramZliy) {
    int i = ((Integer)(this.ZN.Zi((Zr6e)paramZliy.ZR())).Zo).intValue();
    return (i < getTabCount()) ? i : (getTabCount() - 1);
  }
  
  private int Zp(int paramInt) {
    return (paramInt >= 0) ? paramInt : (getTabCount() - 1);
  }
  
  private int ZO(int paramInt) {
    return (paramInt < getTabCount()) ? paramInt : 0;
  }
  
  private boolean ZY(int paramInt1, int paramInt2) {
    String str1 = (paramInt1 > 1) ? a(-9871, -23481) : a(-9868, 9084);
    String str3 = str1;
    int i = paramInt1;
    a(-9867, 20813);
    String str2 = a(-9867, 20813) + a(-9867, 20813) + paramInt2 + a(-9865, -1231) + ((paramInt1 > 0) ? (a(-9869, 6892) + a(-9869, 6892) + i) : "");
    return (paramInt2 == 1 || Zxt1.Zy((Component)this, str2, a(-9870, 9183), 2));
  }
  
  void Zf(int paramInt, boolean paramBoolean) {
    Zx(paramInt, paramBoolean, true, true);
  }
  
  void Zx(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: iload_1
    //   5: invokevirtual getTabComponentAt : (I)Ljava/awt/Component;
    //   8: checkcast burp/Zewb
    //   11: astore #6
    //   13: astore #5
    //   15: iload_1
    //   16: aload_0
    //   17: invokevirtual getSelectedIndex : ()I
    //   20: if_icmpne -> 27
    //   23: iconst_1
    //   24: goto -> 28
    //   27: iconst_0
    //   28: istore #7
    //   30: iconst_0
    //   31: istore #8
    //   33: iload_2
    //   34: ifne -> 186
    //   37: aload_0
    //   38: getfield ZB : Z
    //   41: ifeq -> 93
    //   44: aload #6
    //   46: instanceof burp/Zr8f
    //   49: ifeq -> 88
    //   52: aload #6
    //   54: checkcast burp/Zr8f
    //   57: astore #9
    //   59: aload_0
    //   60: getfield ZV : Lburp/Zr8f;
    //   63: ifnull -> 82
    //   66: aload_0
    //   67: getfield Zr : Lburp/Zzc2;
    //   70: aload_0
    //   71: getfield ZV : Lburp/Zr8f;
    //   74: invokevirtual Zi : ()Lburp/Zliy;
    //   77: invokeinterface Zq : (Lburp/Zliy;)V
    //   82: aload_0
    //   83: aload #9
    //   85: putfield ZV : Lburp/Zr8f;
    //   88: aload #5
    //   90: ifnull -> 98
    //   93: aload_0
    //   94: aconst_null
    //   95: putfield ZV : Lburp/Zr8f;
    //   98: aload_0
    //   99: getfield ZU : Z
    //   102: ifeq -> 176
    //   105: iload_3
    //   106: ifeq -> 134
    //   109: aload_0
    //   110: getfield ZN : Lburp/Zrsj;
    //   113: iload_1
    //   114: invokeinterface Zk : (I)Z
    //   119: ifne -> 134
    //   122: aload_0
    //   123: iload_1
    //   124: invokevirtual ZC : (I)Z
    //   127: ifeq -> 134
    //   130: iconst_1
    //   131: goto -> 135
    //   134: iconst_0
    //   135: istore #8
    //   137: aload_0
    //   138: getfield ZN : Lburp/Zrsj;
    //   141: aload_0
    //   142: iload_1
    //   143: iload #4
    //   145: iconst_0
    //   146: invokeinterface ZI : (Lburp/Zlte;IZZ)V
    //   151: aload_0
    //   152: getfield Zr : Lburp/Zzc2;
    //   155: aload_0
    //   156: aload #6
    //   158: invokeinterface ZD : ()Ljava/awt/Component;
    //   163: invokevirtual indexOfTabComponent : (Ljava/awt/Component;)I
    //   166: invokeinterface ZB : (I)V
    //   171: aload #5
    //   173: ifnull -> 186
    //   176: aload_0
    //   177: getfield Zr : Lburp/Zzc2;
    //   180: iload_1
    //   181: invokeinterface ZB : (I)V
    //   186: aload_0
    //   187: aload #6
    //   189: invokeinterface ZD : ()Ljava/awt/Component;
    //   194: invokevirtual indexOfTabComponent : (Ljava/awt/Component;)I
    //   197: istore #9
    //   199: aload_0
    //   200: iload #9
    //   202: invokespecial removeTabAt : (I)V
    //   205: iload_3
    //   206: ifeq -> 225
    //   209: iload_2
    //   210: ifne -> 225
    //   213: iload #7
    //   215: ifeq -> 225
    //   218: aload_0
    //   219: iload_1
    //   220: iload #8
    //   222: invokevirtual ZL : (IZ)V
    //   225: return
  }
  
  private boolean ZC(int paramInt) {
    return (paramInt != -1 && ((Integer)(this.ZN.Zt(paramInt)).Zo).intValue() == paramInt);
  }
  
  private void ZL(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: invokevirtual getTabCount : ()I
    //   7: istore #4
    //   9: astore_3
    //   10: iload #4
    //   12: ifne -> 21
    //   15: aload_0
    //   16: iconst_m1
    //   17: invokevirtual setSelectedIndex : (I)V
    //   20: return
    //   21: iload_1
    //   22: istore #5
    //   24: iconst_0
    //   25: istore #6
    //   27: iload_2
    //   28: ifeq -> 100
    //   31: aload_0
    //   32: getfield ZN : Lburp/Zrsj;
    //   35: iload_1
    //   36: iconst_1
    //   37: isub
    //   38: invokeinterface Zt : (I)Lnet/portswigger/Zto;
    //   43: getfield Zq : Ljava/lang/Object;
    //   46: checkcast java/lang/Integer
    //   49: invokevirtual intValue : ()I
    //   52: istore #7
    //   54: iinc #5, -1
    //   57: iload #6
    //   59: ifne -> 92
    //   62: iload #5
    //   64: iload #7
    //   66: if_icmplt -> 92
    //   69: aload_0
    //   70: iload #5
    //   72: invokevirtual isEnabledAt : (I)Z
    //   75: ifeq -> 85
    //   78: iconst_1
    //   79: istore #6
    //   81: aload_3
    //   82: ifnull -> 57
    //   85: iinc #5, -1
    //   88: aload_3
    //   89: ifnull -> 57
    //   92: iload #6
    //   94: ifne -> 100
    //   97: iload_1
    //   98: istore #5
    //   100: iload #6
    //   102: ifne -> 149
    //   105: iload #5
    //   107: iload #4
    //   109: if_icmpge -> 149
    //   112: aload_0
    //   113: iload #5
    //   115: invokevirtual isEnabledAt : (I)Z
    //   118: ifeq -> 142
    //   121: aload_0
    //   122: getfield ZN : Lburp/Zrsj;
    //   125: iload #5
    //   127: invokeinterface Zf : (I)Z
    //   132: ifne -> 142
    //   135: iconst_1
    //   136: istore #6
    //   138: aload_3
    //   139: ifnull -> 100
    //   142: iinc #5, 1
    //   145: aload_3
    //   146: ifnull -> 100
    //   149: iload #6
    //   151: ifne -> 213
    //   154: iload_1
    //   155: iconst_1
    //   156: isub
    //   157: istore #5
    //   159: iload #6
    //   161: ifne -> 213
    //   164: iload #5
    //   166: iflt -> 213
    //   169: iload #5
    //   171: iload #4
    //   173: if_icmpge -> 206
    //   176: aload_0
    //   177: iload #5
    //   179: invokevirtual isEnabledAt : (I)Z
    //   182: ifeq -> 206
    //   185: aload_0
    //   186: getfield ZN : Lburp/Zrsj;
    //   189: iload #5
    //   191: invokeinterface Zf : (I)Z
    //   196: ifne -> 206
    //   199: iconst_1
    //   200: istore #6
    //   202: aload_3
    //   203: ifnull -> 159
    //   206: iinc #5, -1
    //   209: aload_3
    //   210: ifnull -> 159
    //   213: aload_0
    //   214: iload #6
    //   216: ifeq -> 224
    //   219: iload #5
    //   221: goto -> 225
    //   224: iconst_m1
    //   225: invokevirtual setSelectedIndex : (I)V
    //   228: return
  }
  
  public void ZF() {
    Zmkb zmkb = this.Zt.ZQ();
    if (zmkb != null) {
      Zm(zmkb.ZD, zmkb.Zi, zmkb.ZM, (String)null, 0);
      setSelectedIndex(0);
    } 
  }
  
  public void Zc(Comparator<Integer> paramComparator) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: invokevirtual getTabCount : ()I
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #4
    //   11: astore_2
    //   12: iload #4
    //   14: iload_3
    //   15: iconst_1
    //   16: isub
    //   17: if_icmpge -> 94
    //   20: iload #4
    //   22: istore #5
    //   24: iload #4
    //   26: iconst_1
    //   27: iadd
    //   28: istore #6
    //   30: iload #6
    //   32: iload_3
    //   33: if_icmpge -> 66
    //   36: aload_1
    //   37: iload #6
    //   39: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   42: iload #5
    //   44: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   47: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   52: ifge -> 59
    //   55: iload #6
    //   57: istore #5
    //   59: iinc #6, 1
    //   62: aload_2
    //   63: ifnull -> 30
    //   66: iload #5
    //   68: iload #4
    //   70: if_icmpeq -> 87
    //   73: aload_0
    //   74: iload #4
    //   76: iload #5
    //   78: iconst_1
    //   79: iadd
    //   80: invokevirtual Zi : (II)V
    //   83: aload_2
    //   84: ifnull -> 90
    //   87: iinc #4, 1
    //   90: aload_2
    //   91: ifnull -> 12
    //   94: return
  }
  
  public void setBackgroundAt(int paramInt, Color paramColor) {
    Z_(paramInt, paramColor, false);
  }
  
  public void Z_(int paramInt, Color paramColor, boolean paramBoolean) {
    Zewb zewb = (Zewb)getTabComponentAt(paramInt);
    Zb(zewb.Za(), paramColor, paramBoolean);
  }
  
  private void Zb(Component paramComponent, Color paramColor, boolean paramBoolean) {
    try {
      Zq(paramComponent, paramColor);
      if (paramBoolean)
        ZZ.Ze(paramComponent, paramComponent::lambda$setComponentForeground$10); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  private static void Zq(Component paramComponent, Color paramColor) {
    if (paramComponent instanceof JTextComponent) {
      JTextComponent jTextComponent = (JTextComponent)paramComponent;
      jTextComponent.setDisabledTextColor(paramColor);
    } 
    paramComponent.setForeground(paramColor);
  }
  
  public void ZS(Color paramColor, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getTrailingComponent : ()Ljava/awt/Component;
    //   4: astore_3
    //   5: aload_0
    //   6: aload_3
    //   7: ldc javax/swing/JLabel
    //   9: invokevirtual Zz : (Ljava/awt/Component;Ljava/lang/Class;)Ljava/util/Optional;
    //   12: aload_0
    //   13: aload_1
    //   14: iload_2
    //   15: <illegal opcode> accept : (Lburp/Zxer;Ljava/awt/Color;Z)Ljava/util/function/Consumer;
    //   20: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   23: return
  }
  
  private <T> Optional<T> Zz(Component paramComponent, Class<T> paramClass) {
    if (paramClass.isAssignableFrom(paramComponent.getClass())) {
      Component component = paramComponent;
      return Optional.of((T)component);
    } 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      return Zl(container, paramClass);
    } 
    return Optional.empty();
  }
  
  private <T> Optional<T> Zl(Container paramContainer, Class<T> paramClass) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    int i = arrayOfComponent.length;
    byte b = 0;
    String[] arrayOfString = Zr();
    while (b < i) {
      Component component = arrayOfComponent[b];
      Optional<T> optional = Zz(component, paramClass);
      if (optional.isPresent())
        return optional; 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return Optional.empty();
  }
  
  public void Zt(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore #5
    //   5: iload_3
    //   6: ifeq -> 144
    //   9: new java/awt/Point
    //   12: dup
    //   13: invokestatic getPointerInfo : ()Ljava/awt/PointerInfo;
    //   16: invokevirtual getLocation : ()Ljava/awt/Point;
    //   19: invokespecial <init> : (Ljava/awt/Point;)V
    //   22: astore #6
    //   24: aload #6
    //   26: aload_0
    //   27: invokestatic convertPointFromScreen : (Ljava/awt/Point;Ljava/awt/Component;)V
    //   30: aload_0
    //   31: getfield ZN : Lburp/Zrsj;
    //   34: iload_1
    //   35: invokeinterface Zf : (I)Z
    //   40: ifeq -> 57
    //   43: aload_0
    //   44: getfield ZJ : Lburp/Zz6_;
    //   47: iload_1
    //   48: iload_2
    //   49: invokevirtual ZX : (II)V
    //   52: aload #5
    //   54: ifnull -> 139
    //   57: aload_0
    //   58: getfield ZF : Lburp/Zlyt;
    //   61: aload #6
    //   63: invokevirtual ZX : (Ljava/awt/Point;)Ljava/util/Optional;
    //   66: astore #7
    //   68: aload #7
    //   70: invokevirtual isPresent : ()Z
    //   73: ifeq -> 100
    //   76: aload_0
    //   77: getfield ZJ : Lburp/Zz6_;
    //   80: iload_1
    //   81: aload #7
    //   83: invokevirtual get : ()Ljava/lang/Object;
    //   86: checkcast burp/Zr88
    //   89: invokevirtual ZR : ()Lburp/Zr6e;
    //   92: invokevirtual ZJ : (ILburp/Zr6e;)V
    //   95: aload #5
    //   97: ifnull -> 139
    //   100: aload_0
    //   101: getfield ZF : Lburp/Zlyt;
    //   104: aload_0
    //   105: iload_1
    //   106: iload_2
    //   107: invokevirtual ZU : (Ljavax/swing/JTabbedPane;II)Z
    //   110: ifeq -> 127
    //   113: aload_0
    //   114: getfield ZJ : Lburp/Zz6_;
    //   117: iload_1
    //   118: iload_2
    //   119: invokevirtual Zq : (II)V
    //   122: aload #5
    //   124: ifnull -> 139
    //   127: aload_0
    //   128: getfield ZJ : Lburp/Zz6_;
    //   131: iload_1
    //   132: iload_2
    //   133: iconst_1
    //   134: iload #4
    //   136: invokevirtual Zn : (IIZZ)V
    //   139: aload #5
    //   141: ifnull -> 156
    //   144: aload_0
    //   145: getfield ZJ : Lburp/Zz6_;
    //   148: iload_1
    //   149: iload_2
    //   150: iconst_0
    //   151: iload #4
    //   153: invokevirtual Zn : (IIZZ)V
    //   156: return
  }
  
  public boolean Zg(int paramInt1, int paramInt2) {
    Point point = new Point(MouseInfo.getPointerInfo().getLocation());
    SwingUtilities.convertPointFromScreen(point, (Component)this);
    return (!this.ZN.Zf(paramInt1) && this.ZF.ZX(point).isPresent()) ? true : this.ZF.Zw((JTabbedPane)this, paramInt1, paramInt2);
  }
  
  public void ZE(int paramInt) {
    if (!this.Zd.test(Integer.valueOf(paramInt))) {
      Zuh.Zb(false, Zqf.ZC);
      return;
    } 
    ZS(paramInt);
  }
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    int i = getSelectedIndex();
    if (i != -1) {
      Component component = getTabComponentAt(i);
      if (component != null)
        component.requestFocus(); 
    } 
    this.Zr.Zw(i);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.Zg.ZI(paramInt, paramObject);
  }
  
  void ZA() {
    if (this.ZV == null)
      return; 
    this.ZV.ZT();
    this.ZV = null;
  }
  
  public JComponent ZO() {
    return (JComponent)this;
  }
  
  private void lambda$setTrailingComponentForeground$11(Color paramColor, boolean paramBoolean, JLabel paramJLabel) {
    Zb(paramJLabel, paramColor, paramBoolean);
  }
  
  private static void lambda$setComponentForeground$10(Component paramComponent) {
    Zq(paramComponent, (Color)null);
  }
  
  private int lambda$closeTabsToTheRight$9(int paramInt) {
    return this.ZN.Zf(paramInt) ? 1 : 0;
  }
  
  private int lambda$closeTabsToTheLeft$8(int paramInt) {
    return this.ZN.Zf(paramInt) ? 1 : 0;
  }
  
  private void lambda$addDuplicateTabs$7(AtomicInteger paramAtomicInteger, Zmkb paramZmkb) {
    Zm(paramZmkb.ZD, paramZmkb.Zi, paramZmkb.ZM, (String)null, paramAtomicInteger.getAndIncrement());
  }
  
  private Integer lambda$addDuplicateTabs$6(Zliy<? extends Zr6e> paramZliy) {
    return Integer.valueOf(Zj(paramZliy) + 1);
  }
  
  private static boolean lambda$addDuplicateTabs$5(Zliy paramZliy) {
    return (paramZliy.ZR() != null);
  }
  
  private static Zliy lambda$addDuplicateTabs$4(Zmkb paramZmkb) {
    return paramZmkb.ZM;
  }
  
  private void lambda$setSelectedIndex$3() {
    int i = getSelectedIndex();
    if (i == -1)
      return; 
    Zr6e zr6e = (Zr6e)this.ZN.ZD(i);
    boolean bool = (zr6e != null && !zr6e.Zy7() && !this.ZN.Zf(i)) ? true : false;
    if (bool)
      zr6e.Zo(true); 
    repaint();
  }
  
  private void lambda$requestNewTab$2(Zmkb paramZmkb) {
    if (paramZmkb != null)
      Zg(paramZmkb.ZD, paramZmkb.Zi, paramZmkb.ZM); 
    setSelectedIndex(getTabCount() - 1);
  }
  
  private static void lambda$new$1(Zlfz paramZlfz) {}
  
  private static boolean lambda$new$0(Integer paramInteger) {
    return false;
  }
  
  public static void Zf(String[] paramArrayOfString) {
    Zu = paramArrayOfString;
  }
  
  public static String[] Zr() {
    return Zu;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zf : ([Ljava/lang/String;)V
    //   13: ldc 'PFbÇ#yT½ëóáÔú%Åù¿6ðé×>©:ï0ÏñofKdHè,>u&Ú×[ªPF·4®¾$GÈ¾Õx[âYnÜ[Ãý§\\nûî<°Â-\\n¢æW&z\\n$xw«'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #31
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #70
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '=Îõ-Áí8jù°Y¦yá'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #11
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #101
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zxer.b : [Ljava/lang/String;
    //   136: bipush #8
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zxer.c : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 263
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #68
    //   218: goto -> 247
    //   221: bipush #101
    //   223: goto -> 247
    //   226: bipush #98
    //   228: goto -> 247
    //   231: bipush #49
    //   233: goto -> 247
    //   236: bipush #29
    //   238: goto -> 247
    //   241: iconst_2
    //   242: goto -> 247
    //   245: bipush #19
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 170
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 166
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD975) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = 'à';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */