package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowListener;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import net.portswigger.Zl0;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zg3i implements Zxgc {
  private static final Duration ZH;
  
  private final Zl04 ZU;
  
  private final Zerg Zf;
  
  private final Zsti Zz;
  
  private final Zs6i Zg;
  
  private final Zrud Zu;
  
  private final Zgb6 Z_;
  
  private final Zgbj ZE;
  
  private final Ztqi Zw;
  
  private final Ztwv Zd;
  
  private final Supplier<Zl4w> ZB;
  
  private final Ztsr ZW;
  
  private final Zg1j Zj;
  
  private final Zbhx ZK;
  
  private Zbp9 Za;
  
  private Zic ZQ;
  
  private Zg8f Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg3i(Zerg paramZerg, WindowListener paramWindowListener, Ztsr paramZtsr, Zl04 paramZl04, Zrud paramZrud, Zgb6 paramZgb6, Zgbj paramZgbj, Zz_s paramZz_s, Zr_4 paramZr_4, Ztg4 paramZtg4, Zl0 paramZl0, Ztwv paramZtwv, Supplier<Zl4w> paramSupplier, Zsti paramZsti, Zs6i paramZs6i, Zz0n paramZz0n, Ztyg paramZtyg, Zgq7 paramZgq7, Zrny paramZrny, Zt4u paramZt4u, Zg0s paramZg0s, Zkl6 paramZkl6, Zz28 paramZz28, Zs2g paramZs2g, Zm6x paramZm6x, Zxei paramZxei, Zebm paramZebm, Zmhp paramZmhp) {
    this.Zf = paramZerg;
    this.ZU = paramZl04;
    this.Zu = paramZrud;
    this.Z_ = paramZgb6;
    this.ZE = paramZgbj;
    this.Zd = paramZtwv;
    this.ZB = paramSupplier;
    this.Zz = paramZsti;
    this.ZW = paramZtsr;
    this.Zg = paramZs6i;
    String str1 = Zbk_.Zb();
    this.Zj = paramZxei.ZZ();
    this.Zw = new Ztq9(this, paramZgb6);
    SwingUtilities.invokeLater(this::lambda$new$0);
    String str2 = a(31063, 2452);
    JTabbedPane jTabbedPane = this.Zz.Zc();
    jTabbedPane.putClientProperty(a(31068, -20148), Zltn.ZK(Zgzq.SUITE_EMPTY_PANEL_ICON, str2).ZC(64).Zi());
    this.ZU.setDefaultCloseOperation(0);
    this.ZU.addWindowListener(paramWindowListener);
    this.ZU.setJMenuBar(this.Zw);
    this.ZU.setMinimumSize(new Dimension(640, 480));
    Zb63 zb63 = new Zb63(jTabbedPane);
    Objects.requireNonNull(paramZerg);
    Zbs3 zbs3 = new Zbs3(paramZz0n, paramZtwv, paramZgb6, paramZtyg, paramZgq7, paramZrny, new Zs0g(paramZt4u, paramZerg::Zk, paramZkl6.ZB(), paramZtwv, paramZkl6.ZH()), paramZg0s, new Zgso(paramZkl6.ZB(), paramZkl6, paramZerg, Zeew.DASHBOARD, new Zsai(), paramZm6x), paramZkl6.ZH(), (new Zzpo()).ZG((Zmk7<Zb2e>[])new Zmk7[] { Ztnl.ZM, Ztnl.ZR, Ztnl.ZJ, Ztnl.ZI, Ztnl.Ze, Ztnl.Zd, Ztnl.Zi, Ztnl.ZF, Ztnl.ZS }, ).Zw(Zltn.ZK(Zgzq.NO_SEARCH_RESULTS_ICON, a(31058, 32575)).Za(a(31056, -2117)).Zi()).ZA().Z_(a(31067, 5053), a(31066, -8696), (new Ze3m(Zeuf.WARNING, Zlkk.FOREGROUND)).ZU(Zmcx.LARGE_LINE_SIZE).Z_()).ZD(1).ZZ(paramZz28), paramZerg);
    ZQ(paramZs6i, Zru.DASHBOARD_ALL_ISSUES.id, zbs3.Zh(), paramZm6x);
    paramZs2g.Zl(zbs3);
    this.ZK = new Zbhx(paramZxei, paramZtwv, zb63, paramZebm, paramZmhp, new Zrm5[] { new Zbh3(paramZz0n, paramZz_s, paramZs6i, paramZm6x), new Zbhu(zbs3) });
    this.ZU.getContentPane().add(zb63.ZL(), a(31062, 3397));
    this.ZU.getContentPane().add(this.ZK, a(31070, 29524));
    (new Ze7z(paramZr_4, paramZtg4, paramZl0, this.ZK)).Zd();
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(paramZtsr);
    if (str1 == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  private static void ZQ(Zs6i paramZs6i, String paramString, Zbws paramZbws, Zm6x paramZm6x) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: <illegal opcode> get : (Ljava/lang/String;Lburp/Zbws;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zc : (Ljava/util/function/Supplier;)V
    //   11: aload_3
    //   12: ldc burp/Ztjx
    //   14: getstatic burp/Zehw.SWING : Lburp/Zehw;
    //   17: aload_1
    //   18: aload_2
    //   19: <illegal opcode> Zy : (Ljava/lang/String;Lburp/Zbws;)Lburp/Zxjl;
    //   24: invokevirtual ZO : (Ljava/lang/Class;Lburp/Zehw;Lburp/Zxjl;)Lburp/Zmt5;
    //   27: pop
    //   28: return
  }
  
  public void Zu(Zztv paramZztv1, Zztv paramZztv2, Zztb paramZztb, Zztm paramZztm, Ztd paramZtd, Zlaa paramZlaa) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: aload #5
    //   8: <illegal opcode> run : (Lburp/Zg3i;Lburp/Zztv;Lburp/Zztv;Lburp/Zztb;Lburp/Zztm;Lburp/Ztd;)Ljava/lang/Runnable;
    //   13: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   16: return
  }
  
  private boolean Zod() {
    Optional<Zl5t> optional = Zk(Zeew.DASHBOARD);
    return (optional.isPresent() && !((Zl5t)optional.get()).Zl() && !((Zl5t)optional.get()).Zz());
  }
  
  private void ZO(Ztd paramZtd) {
    paramZtd.ZK(this.Zz.Zc());
    paramZtd.ZZ(this);
    paramZtd.ZA(Zeew.DASHBOARD);
  }
  
  public void ZJ(String paramString, Zkvo paramZkvo) {
    String str1 = Zgkt.Zd(this.Zu);
    if (!paramString.isEmpty())
      str1 = String.format(a(31060, -27593), new Object[] { str1, paramString }); 
    String str2 = (paramZkvo == null) ? "" : paramZkvo.ZE();
    str1 = String.format(a(31061, -11358), new Object[] { str1, str2 });
    Zq(str1);
  }
  
  public void ZKb() {
    this.ZU.pack();
  }
  
  public Rectangle ZKM() {
    return this.ZU.Zo();
  }
  
  public void Zb(Rectangle paramRectangle) {
    if (this.ZU.getExtendedState() == 0)
      this.ZU.setBounds(paramRectangle); 
  }
  
  public int ZK8() {
    return this.ZU.getExtendedState();
  }
  
  public void ZZj(int paramInt) {
    this.ZU.setExtendedState(paramInt);
  }
  
  public void Zg(Window paramWindow) {
    this.ZU.ZQ(paramWindow);
  }
  
  public void ZAg(boolean paramBoolean) {
    this.ZU.setVisible(paramBoolean);
  }
  
  public void Zq(String paramString) {
    this.ZU.setTitle(paramString);
  }
  
  public void ZKC() {
    this.ZU.dispose();
  }
  
  public boolean ZK4() {
    return Zt2m.ZZ(this.ZU);
  }
  
  public void ZKi() {
    this.ZU.setSize(1600, 900);
    Zg((Window)null);
  }
  
  private void Zs(Zztv paramZztv) {
    this.Zw.add(paramZztv);
  }
  
  private void Zm(Zztv paramZztv) {
    this.Zw.remove(paramZztv);
  }
  
  private void ZX(Zztv paramZztv, int paramInt) {
    this.Zw.add(paramZztv, paramInt);
  }
  
  public void ZH(String paramString1, String paramString2, Component paramComponent) {
    this.Zz.Zt(Zg93.ZD(paramString1, paramString2, paramComponent));
  }
  
  public void ZG(Component paramComponent) {
    this.Zz.ZV(paramComponent);
    if (paramComponent == this.Zy)
      ZoQ(); 
  }
  
  private void ZoQ() {
    if (Zod())
      Zk(Zeew.DASHBOARD).ifPresent(this::lambda$selectDashboardTabIfInMainSuiteTabPane$8); 
  }
  
  private void ZoZ() {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicInteger
    //   3: dup
    //   4: iconst_2
    //   5: invokespecial <init> : (I)V
    //   8: astore_2
    //   9: invokestatic Zb : ()Ljava/lang/String;
    //   12: invokestatic Zx : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 336
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zeew
    //   40: astore #4
    //   42: aload_0
    //   43: getfield Zf : Lburp/Zerg;
    //   46: aload #4
    //   48: invokevirtual ZI : (Lburp/Zeew;)Lburp/Zx8n;
    //   51: astore #5
    //   53: aload #5
    //   55: invokeinterface ZYu : ()[Lburp/Zm0o;
    //   60: ifnonnull -> 70
    //   63: iconst_0
    //   64: anewarray burp/Zm0o
    //   67: goto -> 77
    //   70: aload #5
    //   72: invokeinterface ZYu : ()[Lburp/Zm0o;
    //   77: astore #6
    //   79: aconst_null
    //   80: astore #7
    //   82: aload #5
    //   84: invokeinterface ZYK : ()Ljava/util/Optional;
    //   89: astore #8
    //   91: aload #6
    //   93: arraylength
    //   94: iconst_1
    //   95: if_icmple -> 193
    //   98: new burp/Zxer
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: astore #9
    //   107: aload #6
    //   109: astore #10
    //   111: aload #10
    //   113: arraylength
    //   114: istore #11
    //   116: iconst_0
    //   117: istore #12
    //   119: iload #12
    //   121: iload #11
    //   123: if_icmpge -> 159
    //   126: aload #10
    //   128: iload #12
    //   130: aaload
    //   131: astore #13
    //   133: aload #9
    //   135: aload #13
    //   137: invokeinterface Zq : ()Ljava/lang/String;
    //   142: aload #13
    //   144: invokeinterface Z_ : ()Ljava/awt/Component;
    //   149: invokevirtual addTab : (Ljava/lang/String;Ljava/awt/Component;)V
    //   152: iinc #12, 1
    //   155: aload_1
    //   156: ifnonnull -> 119
    //   159: aload #8
    //   161: aload_0
    //   162: aload #9
    //   164: <illegal opcode> accept : (Lburp/Zg3i;Lburp/Zxer;)Ljava/util/function/Consumer;
    //   169: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   172: aload #9
    //   174: sipush #31057
    //   177: sipush #-16669
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: invokevirtual setName : (Ljava/lang/String;)V
    //   186: aload #9
    //   188: astore #7
    //   190: goto -> 211
    //   193: aload #6
    //   195: arraylength
    //   196: iconst_1
    //   197: if_icmpne -> 211
    //   200: aload #6
    //   202: iconst_0
    //   203: aaload
    //   204: invokeinterface Z_ : ()Ljava/awt/Component;
    //   209: astore #7
    //   211: aload #7
    //   213: ifnull -> 332
    //   216: aload #5
    //   218: invokeinterface ZYi : ()Lburp/Zeew;
    //   223: invokevirtual Zp : ()Ljava/lang/String;
    //   226: aload #5
    //   228: invokeinterface ZYL : ()Lburp/Zgp1;
    //   233: aload #7
    //   235: aload #5
    //   237: invokeinterface ZYR : ()Lburp/Zztv;
    //   242: invokestatic ZA : (Ljava/lang/String;Lburp/Zgp1;Ljava/awt/Component;Lburp/Zztv;)Lburp/Zg93;
    //   245: astore #9
    //   247: aload #9
    //   249: sipush #31071
    //   252: sipush #-31157
    //   255: invokestatic a : (II)Ljava/lang/String;
    //   258: new burp/Zeev
    //   261: dup
    //   262: aload #5
    //   264: aload_0
    //   265: invokespecial <init> : (Lburp/Zx8n;Lburp/Zg3i;)V
    //   268: invokevirtual ZJ : (Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    //   271: aload_0
    //   272: getfield Zz : Lburp/Zsti;
    //   275: aload #9
    //   277: invokevirtual Zt : (Lburp/Zl5t;)V
    //   280: aload_0
    //   281: getfield Zz : Lburp/Zsti;
    //   284: aload #9
    //   286: invokevirtual Zs : ()Ljava/lang/String;
    //   289: invokevirtual ZG : (Ljava/lang/String;)Ljava/util/Optional;
    //   292: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   297: invokestatic not : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   300: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   303: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   308: invokestatic not : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   311: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   314: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   319: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   322: aload_0
    //   323: aload_2
    //   324: <illegal opcode> accept : (Lburp/Zg3i;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   329: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   332: aload_1
    //   333: ifnonnull -> 22
    //   336: return
  }
  
  public void ZAv(boolean paramBoolean) {
    String str = Zbk_.Zb();
    if (paramBoolean) {
      if (this.Zz.Zt(this.Zy).isEmpty()) {
        this.Zz.Zt(Zg93.ZA(a(31069, -6089), new Zljf(a(31059, 15514)), this.Zy, null));
        if (str == null) {
          this.Zz.ZV(this.Zy);
          ZoQ();
          return;
        } 
      } 
      return;
    } 
    this.Zz.ZV(this.Zy);
    ZoQ();
  }
  
  public void Zz(JMenu paramJMenu) {
    this.Zw.add(paramJMenu);
    this.Zw.revalidate();
    this.Zw.repaint();
  }
  
  public void ZW(JMenu paramJMenu) {
    this.Zw.remove(paramJMenu);
    this.Zw.revalidate();
    this.Zw.repaint();
  }
  
  public void ZKT() {
    this.Zd.Ze().schedule(this::lambda$startPerformanceWatcherAfterDelay$11, ZH.getSeconds(), TimeUnit.SECONDS);
  }
  
  public void ZK(Predicate<Zrm5> paramPredicate) {
    if (this.ZK != null)
      this.ZK.Zb(paramPredicate); 
  }
  
  public Zlte ZJ(Zeew paramZeew) {
    Component component = Zk(paramZeew).<Component>map(Zzqk::ZZ).orElse(null);
    if (component instanceof Zlte)
      return (Zlte)component; 
    Zuh.Zb(false, Zqf.Zk);
    return null;
  }
  
  public Zl04 ZK1() {
    return this.ZU;
  }
  
  public Zl04 Zg(Zx8n paramZx8n) {
    return Zk(paramZx8n.ZYi()).<Zl04>map(Zzqk::Zg).orElse(null);
  }
  
  public void Zj(Zeew paramZeew, int paramInt, Color paramColor, boolean paramBoolean1, boolean paramBoolean2) {
    Zd(paramZeew, paramInt, paramColor, paramBoolean1, paramBoolean2, false);
  }
  
  public void Zd(Zeew paramZeew, int paramInt, Color paramColor, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: iload_2
    //   1: iconst_m1
    //   2: if_icmpne -> 9
    //   5: aconst_null
    //   6: goto -> 18
    //   9: iload_2
    //   10: aload_3
    //   11: iload #6
    //   13: <illegal opcode> accept : (ILjava/awt/Color;Z)Ljava/util/function/Consumer;
    //   18: astore #7
    //   20: aload_0
    //   21: aload_1
    //   22: aload_3
    //   23: iload #4
    //   25: iload #5
    //   27: iload #6
    //   29: aload #7
    //   31: invokevirtual Zn : (Lburp/Zeew;Ljava/awt/Color;ZZZLjava/util/function/Consumer;)V
    //   34: return
  }
  
  public void Zz(Zeew paramZeew, Color paramColor, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: aload_2
    //   1: iload #5
    //   3: <illegal opcode> accept : (Ljava/awt/Color;Z)Ljava/util/function/Consumer;
    //   8: astore #6
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: iload_3
    //   14: iload #4
    //   16: iload #5
    //   18: aload #6
    //   20: invokevirtual Zn : (Lburp/Zeew;Ljava/awt/Color;ZZZLjava/util/function/Consumer;)V
    //   23: return
  }
  
  public void Zr(Zic paramZic) {
    this.ZQ = paramZic;
    this.Zy = new Zg8f(this, paramZic, this.Z_);
  }
  
  public Ztsr ZKB() {
    return this.ZW;
  }
  
  public void ZH(Zeew paramZeew) {
    if (paramZeew == Zeew.SCANNER || this.Zf.ZI(paramZeew) == null)
      return; 
    Zk(paramZeew).ifPresent(Zg3i::lambda$showTool$14);
  }
  
  public void Zt2() {
    if (this.ZQ != null)
      this.ZQ.Zt2(); 
  }
  
  private Optional<Zl5t> Zk(Zeew paramZeew) {
    return this.Zz.ZG(paramZeew.Zp());
  }
  
  private void Zn(Zeew paramZeew, Color paramColor, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Consumer<Zlte> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Zk : (Lburp/Zeew;)Ljava/util/Optional;
    //   5: aload_0
    //   6: aload_2
    //   7: iload_3
    //   8: iload #4
    //   10: iload #5
    //   12: aload #6
    //   14: <illegal opcode> accept : (Lburp/Zg3i;Ljava/awt/Color;ZZZLjava/util/function/Consumer;)Ljava/util/function/Consumer;
    //   19: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   22: goto -> 35
    //   25: astore #7
    //   27: aload #7
    //   29: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   32: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   35: return
    // Exception table:
    //   from	to	target	type
    //   0	22	25	java/lang/Exception
  }
  
  private void Za(Zl5t paramZl5t, Color paramColor, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Consumer<Zlte> paramConsumer) {
    if (paramConsumer != null)
      Zx(paramZl5t, paramConsumer); 
    if (paramBoolean1)
      paramZl5t.Zt().setVisible(true); 
    if (!paramZl5t.Zz() && paramBoolean2)
      this.Zz.Zt(paramZl5t.ZZ(), paramColor, paramBoolean3); 
  }
  
  private static void Zx(Zl5t paramZl5t, Consumer<Zlte> paramConsumer) {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: invokeinterface ZZ : ()Ljava/awt/Component;
    //   10: astore_3
    //   11: aload_3
    //   12: instanceof burp/Zlte
    //   15: ifeq -> 36
    //   18: aload_3
    //   19: checkcast burp/Zlte
    //   22: astore #4
    //   24: aload_1
    //   25: aload #4
    //   27: invokeinterface accept : (Ljava/lang/Object;)V
    //   32: aload_2
    //   33: ifnonnull -> 97
    //   36: aload_3
    //   37: instanceof burp/Zbc9
    //   40: ifeq -> 90
    //   43: aload_3
    //   44: checkcast burp/Zbc9
    //   47: astore #5
    //   49: aload #5
    //   51: invokevirtual getComponents : ()[Ljava/awt/Component;
    //   54: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   57: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   62: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   67: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   72: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   77: invokeinterface findFirst : ()Ljava/util/Optional;
    //   82: aload_1
    //   83: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   86: aload_2
    //   87: ifnonnull -> 97
    //   90: iconst_0
    //   91: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   94: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   97: return
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.Zz.Zd(paramZmf_);
    this.Zg.Zd(paramZmf_);
  }
  
  public void Zl(Zg4j paramZg4j) {
    paramZg4j.Za(a(31065, 5407), this.Zj.ZO());
    this.Zz.Zl(paramZg4j);
    this.Zg.Zl(paramZg4j);
  }
  
  private static Zlte lambda$flashToolTab$18(Component paramComponent) {
    Zlte zlte = (Zlte)paramComponent;
    return (paramComponent instanceof Zlte) ? zlte : null;
  }
  
  private void lambda$flashTab$17(Color paramColor, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Consumer paramConsumer, Zl5t paramZl5t) {
    // Byte code:
    //   0: aload #6
    //   2: <illegal opcode> run : (Lburp/Zl5t;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: aload_0
    //   11: aload #6
    //   13: aload_1
    //   14: iload_2
    //   15: iload_3
    //   16: iload #4
    //   18: aload #5
    //   20: <illegal opcode> run : (Lburp/Zg3i;Lburp/Zl5t;Ljava/awt/Color;ZZZLjava/util/function/Consumer;)Ljava/lang/Runnable;
    //   25: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   28: return
  }
  
  private void lambda$flashTab$16(Zl5t paramZl5t, Color paramColor, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Consumer<Zlte> paramConsumer) {
    Za(paramZl5t, paramColor, paramBoolean1, paramBoolean2, paramBoolean3, paramConsumer);
  }
  
  private static void lambda$flashTab$15(Zl5t paramZl5t) {
    paramZl5t.ZT(false);
  }
  
  private static void lambda$showTool$14(Zl5t paramZl5t) {
    if (paramZl5t.Zl())
      Zq9.ZM(paramZl5t).ifPresent(Zm2::ZC); 
    paramZl5t.Zi();
  }
  
  private static void lambda$flashTabAndTrailingComponent$13(Color paramColor, boolean paramBoolean, Zlte paramZlte) {
    paramZlte.ZS(paramColor, paramBoolean);
  }
  
  private static void lambda$flashTab$12(int paramInt, Color paramColor, boolean paramBoolean, Zlte paramZlte) {
    paramZlte.Z_(paramInt, paramColor, paramBoolean);
  }
  
  private void lambda$startPerformanceWatcherAfterDelay$11() {
    this.Za.ZD((this.Z_.Zqj() && !this.Z_.ZfQ()));
  }
  
  private void lambda$buildToolTabPanes$10(AtomicInteger paramAtomicInteger, Zztv paramZztv) {
    ZX(paramZztv, paramAtomicInteger.getAndIncrement());
  }
  
  private void lambda$buildToolTabPanes$9(Zxer paramZxer, Zz4n paramZz4n) {
    paramZxer.setTrailingComponent(new Zgom(this.ZB, paramZz4n));
  }
  
  private void lambda$selectDashboardTabIfInMainSuiteTabPane$8(Zl5t paramZl5t) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zg3i;Lburp/Zl5t;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$buildSuiteUi$6(Zztv paramZztv1, Zztv paramZztv2, Zztb paramZztb, Zztm paramZztm, Ztd paramZtd) {
    boolean bool = this.Z_.ZfE();
    Zs(paramZztv1);
    Zs(paramZztv2);
    String str = Zbk_.Zb();
    ZoZ();
    paramZztb.Zi();
    Zs(paramZztb);
    Zs(paramZztm);
    ZAv(bool);
    this.Zz.ZD();
    ZO(paramZtd);
    if (bool && this.ZE.Zy()) {
      SwingUtilities.invokeLater(this::lambda$buildSuiteUi$3);
      if (str == null) {
        if (Zod())
          Zk(Zeew.DASHBOARD).ifPresent(this::lambda$buildSuiteUi$5); 
        return;
      } 
      return;
    } 
    if (Zod())
      Zk(Zeew.DASHBOARD).ifPresent(this::lambda$buildSuiteUi$5); 
  }
  
  private void lambda$buildSuiteUi$5(Zl5t paramZl5t) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zg3i;Lburp/Zl5t;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$buildSuiteUi$4(Zl5t paramZl5t) {
    this.Zz.Zr(paramZl5t.ZZ());
  }
  
  private void lambda$buildSuiteUi$3() {
    this.Zz.Zr(this.Zy);
  }
  
  private static void lambda$registerTablePersistence$2(String paramString, Zbws paramZbws, Ztjx paramZtjx) {
    List<Zlz8> list = paramZtjx.ZEU();
    Iterator<Zlz8> iterator = list.iterator();
    String str = Zbk_.Zb();
    while (iterator.hasNext()) {
      Zlz8 zlz8 = iterator.next();
      if (zlz8.ZLx().equals(paramString)) {
        paramZbws.Zj(zlz8);
        if (str == null)
          continue; 
        break;
      } 
      continue;
      if (str == null)
        break; 
    } 
  }
  
  private static Zlz8 lambda$registerTablePersistence$1(String paramString, Zbws paramZbws) {
    return new Zlz8(paramString, paramZbws.ZHh());
  }
  
  private void lambda$new$0() {
    this.Za = new Zbp9();
    Toolkit.getDefaultToolkit().getSystemEventQueue().push(this.Za);
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '5d£x.F¥õGÔÝo=Ì÷8)C¹>KÉÅ¬Æ»CQðFqÍ~sÿjºàdyÊ½ÿ&|\\fþÛ[Ax*©mCªB:ÖRï~oêoC9^/NwìÖ9¸^rÞ¿K?w¼Í(¤æ¹Û%îä?:Öª¬÷\\b1fÚ¥8`6%>Y:rdY7RSI§¥ æ@òðÌºÔ´cõFpúD6s¸oä>!Ê¢ÚF¿O: nL(`ù°@qé©t$Ôã9`Ç«Éù»¾f3®Y¢«Wò/²ä.ñ¦Na ×îÆ6+2BÏJý?1¡'ñä;¤fQ$ÉLÐ:}]Ø5´ÒU¨Å!\\n¼;ñ³FùÐçi:Åþ@:BLgdècfíó@éøÖÞÿ*ÉöR¾^¹[ýÔ¡Sú\fÔ½ÀQYoå<°\é­¡)çg°süf\\rz®}­6M@;ZY@NâË\\n45%u]Í'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #139
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #27
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc 'æ|¢h=\\r=rstè\\n@¹\,¨þ1¢0Wx¡+Ü¨×À8`ï{¢$8t6'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #31
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #37
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zg3i.a : [Ljava/lang/String;
    //   133: bipush #15
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zg3i.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #37
    //   214: goto -> 244
    //   217: bipush #72
    //   219: goto -> 244
    //   222: bipush #94
    //   224: goto -> 244
    //   227: bipush #86
    //   229: goto -> 244
    //   232: bipush #12
    //   234: goto -> 244
    //   237: bipush #102
    //   239: goto -> 244
    //   242: bipush #89
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 41, 0 -> 100
    //   300: ldc2_w 5
    //   303: getstatic java/time/temporal/ChronoUnit.MINUTES : Ljava/time/temporal/ChronoUnit;
    //   306: invokestatic of : (JLjava/time/temporal/TemporalUnit;)Ljava/time/Duration;
    //   309: putstatic burp/Zg3i.ZH : Ljava/time/Duration;
    //   312: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7957) & 0xFFFF;
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
      byte b1 = 121;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg3i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */