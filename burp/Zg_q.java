package burp;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.swing.BorderFactory;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zg_q extends MouseAdapter implements TreeSelectionListener, Zzyl, Zrhs {
  private final Zets Zk;
  
  protected final Zor ZE;
  
  private final DefaultMutableTreeNode Zi;
  
  private final Ztdi ZB;
  
  private Zkmc ZQ;
  
  private final Zgd ZY;
  
  private final Zmrj Zg;
  
  private final Zzi ZH;
  
  private final Zxgc ZX;
  
  private final Zgzy Zv;
  
  private final Zslu ZZ;
  
  private final Zkl6 Zx;
  
  private final Map<TreePath, Boolean> ZN;
  
  private Zm3z Zh;
  
  private final Ztwv ZR;
  
  private final List<Zz_1> Zf = new ArrayList<>();
  
  private final Zb37 ZP;
  
  private final List<Zskg> ZK = new ArrayList<>();
  
  private final Zgx0 Zs;
  
  private final List<Zgrn> Zc = new ArrayList<>();
  
  private final Object Zq = new Object();
  
  private final ExecutorService Zm = Executors.newSingleThreadScheduledExecutor(new Zrdt(a(-10345, 28941)));
  
  private List<Runnable> Zb = new ArrayList<>();
  
  private volatile Zbk2 ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg_q(Ztdi paramZtdi, Zgd paramZgd, Zmrj paramZmrj, Zzi paramZzi, Zxgc paramZxgc, Zgzy paramZgzy, Zslu paramZslu, Zkl6 paramZkl6, Ztwv paramZtwv, Zgx0 paramZgx0) {
    this.ZB = paramZtdi;
    this.ZY = paramZgd;
    this.Zg = paramZmrj;
    this.ZH = paramZzi;
    this.ZX = paramZxgc;
    this.Zv = paramZgzy;
    this.ZZ = paramZslu;
    this.Zx = paramZkl6;
    this.ZR = paramZtwv;
    this.Zs = paramZgx0;
    this.Zi = new DefaultMutableTreeNode();
    this.ZQ = this.Zs.ZJ(this.Zi);
    this.ZQ.ZE();
    this.ZE = this.Zs.ZS(this.ZQ);
    this.ZE.setName(a(-10349, -22685));
    this.ZE.Zu(this);
    this.ZE.Zh(true);
    this.ZE.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.ZE.Z_(Zlkk.PANEL_BACKGROUND);
    this.ZE.getSelectionModel().setSelectionMode(4);
    this.Zk = Zu();
    this.ZE.setCellRenderer(this.Zk);
    this.ZE.addTreeSelectionListener(this);
    this.ZE.addMouseListener(this);
    this.ZN = ZE();
    this.ZP = paramZgx0.Zt(this, paramZzi, paramZslu, paramZmrj.ZL());
    ZS();
  }
  
  public void Zc() {
    Zx();
    Zq(this.ZY);
    ZS();
  }
  
  private void ZS() {
    Zlli<Zt14> zlli = this.ZY.ZT();
    this.Zc.add(zlli.ZE(Zt14.Za, this::lambda$connectToModel$0));
    this.Zc.add(zlli.ZE(Zt14.Zj, this::lambda$connectToModel$1));
    this.Zc.add(zlli.ZE(Zt14.Zc, this::lambda$connectToModel$2));
    this.Zc.add(zlli.ZE(Zt14.ZE, this::lambda$connectToModel$3));
    this.Zc.add(zlli.ZE(Zt14.Zy, this::lambda$connectToModel$4));
    this.Zc.add(zlli.ZE(Zt14.Zz, this::lambda$connectToModel$5));
    this.Zc.add(zlli.ZE(Zt14.ZW, this::lambda$connectToModel$6));
    this.Zc.add(zlli.ZE(Zt14.ZS, this::lambda$connectToModel$7));
  }
  
  public void Zx() {
    this.Zc.forEach(Zgrn::ZZ);
    this.Zc.clear();
  }
  
  private void Zq(Zgd paramZgd) {
    this.Zi.removeAllChildren();
    this.ZQ = this.Zs.ZJ(this.Zi);
    paramZgd.Zk(this::lambda$buildTreeFromModel$8);
    this.ZQ.ZE();
    SwingUtilities.invokeLater(this::lambda$buildTreeFromModel$9);
  }
  
  private Map<TreePath, Boolean> ZE() {
    try {
      Field field = JTree.class.getDeclaredField(a(-10347, 8898));
      field.setAccessible(true);
      return (Map<TreePath, Boolean>)field.get(this.ZE);
    } catch (NoSuchFieldException|IllegalAccessException noSuchFieldException) {
      Zah.Zl(noSuchFieldException, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public boolean Z_(int paramInt) {
    return ZJ(paramInt, null, false);
  }
  
  public void Zq(Zskg paramZskg) {
    this.ZK.add(paramZskg);
  }
  
  void Zl(Zmiw paramZmiw, Zbws paramZbws) {
    this.Zh = this.Zs.ZP(this.ZB, this.Zg, this.ZH, paramZmiw, paramZbws, this.ZE, this.ZN, this, this.ZX, this.Zv, this.ZZ, this.Zx);
  }
  
  public Component Zd() {
    return this.ZE;
  }
  
  protected Zets Zu() {
    return new Zets();
  }
  
  private void ZV(Zkaq paramZkaq) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zq : Ljava/lang/Object;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: aload_1
    //   12: invokevirtual ZLW : ()Z
    //   15: ifeq -> 43
    //   18: aload_0
    //   19: getfield Zb : Ljava/util/List;
    //   22: aload_0
    //   23: aload_1
    //   24: <illegal opcode> run : (Lburp/Zg_q;Lburp/Zkaq;)Ljava/lang/Runnable;
    //   29: invokeinterface add : (Ljava/lang/Object;)Z
    //   34: pop
    //   35: aload_0
    //   36: invokevirtual Zs : ()V
    //   39: aload_2
    //   40: ifnonnull -> 64
    //   43: aload_0
    //   44: getfield Zb : Ljava/util/List;
    //   47: invokeinterface isEmpty : ()Z
    //   52: ifne -> 59
    //   55: aload_0
    //   56: invokevirtual Zw : ()V
    //   59: aload_0
    //   60: aload_1
    //   61: invokevirtual ZR : (Lburp/Zkaq;)V
    //   64: aload_3
    //   65: monitorexit
    //   66: goto -> 76
    //   69: astore #4
    //   71: aload_3
    //   72: monitorexit
    //   73: aload #4
    //   75: athrow
    //   76: return
    // Exception table:
    //   from	to	target	type
    //   11	66	69	finally
    //   69	73	69	finally
  }
  
  private void ZR(Zkaq paramZkaq) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZLU : ()Lburp/Zxya;
    //   4: astore_3
    //   5: invokestatic ZG : ()Ljava/lang/String;
    //   8: aload_1
    //   9: invokevirtual ZLT : ()Lburp/Zxya;
    //   12: astore #4
    //   14: astore_2
    //   15: aload_3
    //   16: invokevirtual ZX : ()Z
    //   19: ifeq -> 93
    //   22: aload_0
    //   23: getfield ZQ : Lburp/Zkmc;
    //   26: aload_3
    //   27: aload #4
    //   29: aload_1
    //   30: invokevirtual ZLW : ()Z
    //   33: invokeinterface ZR : (Lburp/Zxya;Lburp/Zxya;Z)Lburp/Zz_1;
    //   38: astore #5
    //   40: aload_0
    //   41: getfield Zi : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   44: invokevirtual getChildCount : ()I
    //   47: iconst_1
    //   48: if_icmpne -> 158
    //   51: aload_0
    //   52: getfield Zf : Ljava/util/List;
    //   55: dup
    //   56: astore #6
    //   58: monitorenter
    //   59: aload_0
    //   60: getfield Zf : Ljava/util/List;
    //   63: aload #5
    //   65: invokeinterface add : (Ljava/lang/Object;)Z
    //   70: pop
    //   71: aload #6
    //   73: monitorexit
    //   74: goto -> 85
    //   77: astore #7
    //   79: aload #6
    //   81: monitorexit
    //   82: aload #7
    //   84: athrow
    //   85: aload_0
    //   86: invokevirtual ZP : ()V
    //   89: aload_2
    //   90: ifnonnull -> 158
    //   93: aload_3
    //   94: invokevirtual Zv : ()Z
    //   97: ifeq -> 121
    //   100: aload_0
    //   101: getfield ZQ : Lburp/Zkmc;
    //   104: aload_3
    //   105: aload #4
    //   107: aload_1
    //   108: invokevirtual ZLW : ()Z
    //   111: invokeinterface ZR : (Lburp/Zxya;Lburp/Zxya;Z)Lburp/Zz_1;
    //   116: pop
    //   117: aload_2
    //   118: ifnonnull -> 158
    //   121: aload_0
    //   122: getfield ZQ : Lburp/Zkmc;
    //   125: aload_3
    //   126: aload #4
    //   128: aload_1
    //   129: invokevirtual ZLW : ()Z
    //   132: invokeinterface ZR : (Lburp/Zxya;Lburp/Zxya;Z)Lburp/Zz_1;
    //   137: astore #5
    //   139: aload #5
    //   141: ifnonnull -> 145
    //   144: return
    //   145: aload_1
    //   146: invokevirtual ZLW : ()Z
    //   149: ifne -> 158
    //   152: aload_0
    //   153: aload #5
    //   155: invokevirtual ZS : (Lburp/Zz_1;)V
    //   158: return
    // Exception table:
    //   from	to	target	type
    //   59	74	77	finally
    //   77	82	77	finally
  }
  
  private void ZN(Ze9d paramZe9d) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zq : Ljava/lang/Object;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: aload_1
    //   12: invokevirtual ZjO : ()Z
    //   15: ifeq -> 43
    //   18: aload_0
    //   19: getfield Zb : Ljava/util/List;
    //   22: aload_0
    //   23: aload_1
    //   24: <illegal opcode> run : (Lburp/Zg_q;Lburp/Ze9d;)Ljava/lang/Runnable;
    //   29: invokeinterface add : (Ljava/lang/Object;)Z
    //   34: pop
    //   35: aload_0
    //   36: invokevirtual Zs : ()V
    //   39: aload_2
    //   40: ifnonnull -> 64
    //   43: aload_0
    //   44: getfield Zb : Ljava/util/List;
    //   47: invokeinterface isEmpty : ()Z
    //   52: ifne -> 59
    //   55: aload_0
    //   56: invokevirtual Zw : ()V
    //   59: aload_0
    //   60: aload_1
    //   61: invokevirtual Zm : (Lburp/Ze9d;)V
    //   64: aload_3
    //   65: monitorexit
    //   66: goto -> 76
    //   69: astore #4
    //   71: aload_3
    //   72: monitorexit
    //   73: aload #4
    //   75: athrow
    //   76: return
    // Exception table:
    //   from	to	target	type
    //   11	66	69	finally
    //   69	73	69	finally
  }
  
  private void Zm(Ze9d paramZe9d) {
    Zxya zxya = paramZe9d.Zj6();
    Zz_1 zz_1 = this.ZQ.ZO(zxya, paramZe9d.ZjO());
    if (zz_1 == null)
      return; 
    if (zxya.ZX() || zxya.Zv())
      return; 
    if (!paramZe9d.ZjO())
      ZJ(zz_1); 
  }
  
  private void Ze(Zbxu paramZbxu) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zq : Ljava/lang/Object;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: aload_1
    //   12: invokevirtual ZCT : ()Z
    //   15: ifeq -> 43
    //   18: aload_0
    //   19: getfield Zb : Ljava/util/List;
    //   22: aload_0
    //   23: aload_1
    //   24: <illegal opcode> run : (Lburp/Zg_q;Lburp/Zbxu;)Ljava/lang/Runnable;
    //   29: invokeinterface add : (Ljava/lang/Object;)Z
    //   34: pop
    //   35: aload_0
    //   36: invokevirtual Zs : ()V
    //   39: aload_2
    //   40: ifnonnull -> 64
    //   43: aload_0
    //   44: getfield Zb : Ljava/util/List;
    //   47: invokeinterface isEmpty : ()Z
    //   52: ifne -> 59
    //   55: aload_0
    //   56: invokevirtual Zw : ()V
    //   59: aload_0
    //   60: aload_1
    //   61: invokevirtual ZU : (Lburp/Zbxu;)V
    //   64: aload_3
    //   65: monitorexit
    //   66: goto -> 76
    //   69: astore #4
    //   71: aload_3
    //   72: monitorexit
    //   73: aload #4
    //   75: athrow
    //   76: return
    // Exception table:
    //   from	to	target	type
    //   11	66	69	finally
    //   69	73	69	finally
  }
  
  private void ZU(Zbxu paramZbxu) {
    Zxya zxya = paramZbxu.ZCv();
    Zz_1 zz_1 = this.ZQ.Z_(zxya, paramZbxu.ZCT());
    if (zz_1 == null)
      return; 
    if (!paramZbxu.ZCT())
      Zj(zz_1); 
  }
  
  private void Zs() {
    if (this.Zb.size() > 250000)
      Zr(); 
  }
  
  private void Z_(List<Runnable> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface size : ()I
    //   6: istore_3
    //   7: invokestatic ZG : ()Ljava/lang/String;
    //   10: iconst_0
    //   11: istore #4
    //   13: astore_2
    //   14: iload #4
    //   16: iload_3
    //   17: if_icmpge -> 72
    //   20: invokestatic interrupted : ()Z
    //   23: ifeq -> 27
    //   26: return
    //   27: iload #4
    //   29: sipush #10000
    //   32: iadd
    //   33: iload_3
    //   34: invokestatic min : (II)I
    //   37: istore #5
    //   39: aload_1
    //   40: iload #4
    //   42: iload #5
    //   44: invokeinterface subList : (II)Ljava/util/List;
    //   49: astore #6
    //   51: aload_0
    //   52: aload #6
    //   54: <illegal opcode> run : (Lburp/Zg_q;Ljava/util/List;)Ljava/lang/Runnable;
    //   59: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   62: wide iinc #4 10000
    //   68: aload_2
    //   69: ifnonnull -> 14
    //   72: return
  }
  
  private boolean ZA(TreePath paramTreePath) {
    Object[] arrayOfObject = paramTreePath.getPath();
    Object object = this.ZQ.getRoot();
    String str = Zz_1.ZG();
    byte b = 1;
    while (b < arrayOfObject.length) {
      object = Zh(object, arrayOfObject[b]);
      if (object == null)
        return false; 
      b++;
      if (str == null)
        break; 
    } 
    return true;
  }
  
  private Object Zh(Object paramObject1, Object paramObject2) {
    int i = this.ZQ.getChildCount(paramObject1);
    byte b = 0;
    String str = Zz_1.ZG();
    while (b < i) {
      Object object = this.ZQ.getChild(paramObject1, b);
      if (object.equals(paramObject2))
        return object; 
      b++;
      if (str == null)
        break; 
    } 
    return null;
  }
  
  private Future<?> Zr() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zq : Ljava/lang/Object;
    //   4: dup
    //   5: astore_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield Zb : Ljava/util/List;
    //   11: astore_1
    //   12: aload_0
    //   13: new java/util/ArrayList
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: putfield Zb : Ljava/util/List;
    //   23: aload_2
    //   24: monitorexit
    //   25: goto -> 33
    //   28: astore_3
    //   29: aload_2
    //   30: monitorexit
    //   31: aload_3
    //   32: athrow
    //   33: aload_0
    //   34: getfield Zm : Ljava/util/concurrent/ExecutorService;
    //   37: aload_0
    //   38: aload_1
    //   39: <illegal opcode> run : (Lburp/Zg_q;Ljava/util/List;)Ljava/lang/Runnable;
    //   44: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   49: areturn
    // Exception table:
    //   from	to	target	type
    //   7	25	28	finally
    //   28	31	28	finally
  }
  
  private void Zw() {
    try {
      Zr().get();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zb() {
    String str = Zz_1.ZG();
    Zr();
    try {
      this.Zm.submit(Zg_q::lambda$filterModified$15).get();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
    synchronized (this.Zf) {
      this.Zf.clear();
    } 
    Zt();
    TreePath[] arrayOfTreePath = this.ZE.getSelectionPaths();
    if (arrayOfTreePath != null) {
      TreePath[] arrayOfTreePath1 = arrayOfTreePath;
      int i = arrayOfTreePath1.length;
      byte b = 0;
      while (b < i) {
        TreePath treePath = arrayOfTreePath1[b];
        Object object = treePath.getLastPathComponent();
        if (object instanceof Zz_1)
          synchronized (this.Zf) {
            this.Zf.add((Zz_1)object);
          }  
        b++;
        if (str == null)
          break; 
      } 
    } 
  }
  
  private void ZS(Zz_1 paramZz_1) {
    String str = Zz_1.ZG();
    if (Zt(paramZz_1))
      for (Zskg zskg : this.ZK) {
        zskg.ZK(paramZz_1);
        if (str == null)
          break; 
      }  
  }
  
  private void ZJ(Zz_1 paramZz_1) {
    String str = Zz_1.ZG();
    if (Zt(paramZz_1))
      for (Zskg zskg : this.ZK) {
        zskg.Zg(paramZz_1);
        if (str == null)
          break; 
      }  
  }
  
  private void Zj(Zz_1 paramZz_1) {
    String str = Zz_1.ZG();
    if (Zt(paramZz_1))
      for (Zskg zskg : this.ZK) {
        zskg.Zj(paramZz_1);
        if (str == null)
          break; 
      }  
  }
  
  private void ZY(Zb4t paramZb4t) {
    String str = Zz_1.ZG();
    if (Zr((paramZb4t.ZZw()).ZX))
      for (Zskg zskg : this.ZK) {
        zskg.Zf(paramZb4t.ZZg());
        if (str == null)
          break; 
      }  
  }
  
  private void ZR(Zse_ paramZse_) {
    ArrayList<Zrdb> arrayList = new ArrayList();
    Iterator<Zk7x> iterator = paramZse_.ZeN().iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zk7x zk7x = iterator.next();
      if (Zr(zk7x.Zxm()))
        arrayList.add(zk7x.Zxp()); 
      if (str == null)
        break; 
    } 
    if (!arrayList.isEmpty())
      for (Zskg zskg : this.ZK) {
        zskg.ZD(arrayList);
        if (str == null)
          break; 
      }  
  }
  
  private void Zc(Zedv paramZedv) {
    String str = Zz_1.ZG();
    if (Zr((paramZedv.Zy7()).ZX))
      for (Zskg zskg : this.ZK) {
        zskg.ZQ(paramZedv.ZyB());
        if (str == null)
          break; 
      }  
  }
  
  private void ZZ(Zr4g paramZr4g) {
    String str = Zz_1.ZG();
    if (Zr((paramZr4g.Zbj()).ZX))
      for (Zskg zskg : this.ZK) {
        zskg.ZZ(paramZr4g.ZbO());
        if (str == null)
          break; 
      }  
  }
  
  boolean Zr(Zez3 paramZez3) {
    return !this.ZQ.Zw(paramZez3) ? false : Zt(this.ZQ.Zv(paramZez3));
  }
  
  private boolean Zt(Zz_1 paramZz_1) {
    String str = Zz_1.ZG();
    synchronized (this.Zf) {
      for (Zz_1 zz_1 : this.Zf) {
        if (paramZz_1 == zz_1 || paramZz_1.Zp(zz_1))
          return true; 
        if (str == null)
          break; 
      } 
    } 
    return false;
  }
  
  public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    TreePath[] arrayOfTreePath = this.ZE.getSelectionPaths();
    String str = Zz_1.ZG();
    if (arrayOfTreePath != null) {
      Zt();
      synchronized (this.Zf) {
        this.Zf.clear();
        TreePath[] arrayOfTreePath1 = arrayOfTreePath;
        int i = arrayOfTreePath1.length;
        byte b = 0;
        while (b < i) {
          TreePath treePath = arrayOfTreePath1[b];
          Object object = treePath.getLastPathComponent();
          if (object instanceof Zz_1)
            this.Zf.add((Zz_1)object); 
          b++;
          if (str == null)
            break; 
        } 
      } 
    } 
  }
  
  public void Zt() {
    Zbsv.Zb(this::lambda$updateSelectedItems$18);
  }
  
  private Future<?> Zy(Zbk2 paramZbk2) {
    // Byte code:
    //   0: invokestatic newSingleThreadScheduledExecutor : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aload_0
    //   7: aload_1
    //   8: <illegal opcode> run : (Lburp/Zg_q;Lburp/Zbk2;)Ljava/lang/Runnable;
    //   13: astore #4
    //   15: aload_2
    //   16: aload #4
    //   18: ldc2_w 500
    //   21: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   24: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   29: astore_3
    //   30: aload_2
    //   31: invokeinterface shutdown : ()V
    //   36: goto -> 69
    //   39: astore #4
    //   41: aload #4
    //   43: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   46: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   49: aload_2
    //   50: invokeinterface shutdown : ()V
    //   55: goto -> 69
    //   58: astore #5
    //   60: aload_2
    //   61: invokeinterface shutdown : ()V
    //   66: aload #5
    //   68: athrow
    //   69: aload_3
    //   70: areturn
    // Exception table:
    //   from	to	target	type
    //   6	30	39	java/lang/Throwable
    //   6	30	58	finally
    //   39	49	58	finally
    //   58	60	58	finally
  }
  
  private Zbfx ZF() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zbk2 zbk2 = new Zbk2(a(-10348, -12621));
    if (this.ZD != null)
      this.ZD.ZU = true; 
    this.ZD = zbk2;
    return zbk2;
  }
  
  private void ZO() {
    this.Zg.ZB();
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      Zc(paramMouseEvent); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      Zc(paramMouseEvent); 
  }
  
  private void Zc(MouseEvent paramMouseEvent) {
    Ze3h ze3h = ZU(paramMouseEvent, true);
    this.ZP.ZO(ze3h, paramMouseEvent);
  }
  
  Ze3h ZX() {
    return ZU(null, false);
  }
  
  private Ze3h ZU(MouseEvent paramMouseEvent, boolean paramBoolean) {
    // Byte code:
    //   0: new burp/Ze3h
    //   3: dup
    //   4: iconst_0
    //   5: anewarray burp/Zz_1
    //   8: invokespecial <init> : ([Lburp/Zz_1;)V
    //   11: astore #4
    //   13: invokestatic ZG : ()Ljava/lang/String;
    //   16: aload_0
    //   17: getfield ZE : Lburp/Zor;
    //   20: invokevirtual getSelectionPaths : ()[Ljavax/swing/tree/TreePath;
    //   23: astore #5
    //   25: astore_3
    //   26: aload #5
    //   28: ifnull -> 92
    //   31: iload_2
    //   32: ifeq -> 42
    //   35: aload #5
    //   37: arraylength
    //   38: iconst_1
    //   39: if_icmple -> 92
    //   42: aload #5
    //   44: astore #6
    //   46: aload #6
    //   48: arraylength
    //   49: istore #7
    //   51: iconst_0
    //   52: istore #8
    //   54: iload #8
    //   56: iload #7
    //   58: if_icmpge -> 88
    //   61: aload #6
    //   63: iload #8
    //   65: aaload
    //   66: astore #9
    //   68: aload #4
    //   70: aload #9
    //   72: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   75: checkcast burp/Zz_1
    //   78: invokevirtual Zj : (Lburp/Zz_1;)V
    //   81: iinc #8, 1
    //   84: aload_3
    //   85: ifnonnull -> 54
    //   88: aload_3
    //   89: ifnonnull -> 131
    //   92: aload_1
    //   93: ifnull -> 131
    //   96: aload_0
    //   97: getfield ZE : Lburp/Zor;
    //   100: aload_1
    //   101: invokevirtual getX : ()I
    //   104: aload_1
    //   105: invokevirtual getY : ()I
    //   108: invokevirtual getClosestPathForLocation : (II)Ljavax/swing/tree/TreePath;
    //   111: astore #6
    //   113: aload #6
    //   115: ifnull -> 131
    //   118: aload #4
    //   120: aload #6
    //   122: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   125: checkcast burp/Zz_1
    //   128: invokevirtual Zj : (Lburp/Zz_1;)V
    //   131: aload #4
    //   133: areturn
  }
  
  void ZP() {
    try {
      SwingUtilities.invokeLater(this::lambda$selectFirstItem$20);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public Zz_1 Zm(Zez3 paramZez3) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 35
    //   4: aload_0
    //   5: getfield ZQ : Lburp/Zkmc;
    //   8: aload_1
    //   9: invokeinterface Zv : (Lburp/Zez3;)Lburp/Zz_1;
    //   14: astore_2
    //   15: aload_0
    //   16: aload_2
    //   17: <illegal opcode> run : (Lburp/Zg_q;Lburp/Zz_1;)Ljava/lang/Runnable;
    //   22: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   25: aload_2
    //   26: areturn
    //   27: astore_2
    //   28: aload_2
    //   29: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   32: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   35: aconst_null
    //   36: areturn
    // Exception table:
    //   from	to	target	type
    //   4	26	27	java/lang/Exception
  }
  
  public Zb37 ZG() {
    return this.ZP;
  }
  
  Zets ZR() {
    return this.Zk;
  }
  
  public Zor ZD() {
    return this.ZE;
  }
  
  public Zz_1 Zn(Zez3 paramZez3) {
    return this.ZQ.Zv(paramZez3);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    Ze3h ze3h = ZU(null, false);
    return ZJ(paramInt, ze3h, true);
  }
  
  public boolean ZJ(int paramInt, Ze3h paramZe3h, boolean paramBoolean) {
    return this.Zh.ZU(paramInt, paramZe3h, paramBoolean);
  }
  
  private void lambda$selectNodeForItem$21(Zz_1 paramZz_1) {
    this.ZE.setSelectionPath(new TreePath((Object[])paramZz_1.Zp()));
  }
  
  private void lambda$selectFirstItem$20() {
    this.ZE.setSelectionInterval(0, 0);
  }
  
  private void lambda$delayDisplayingCancelMonitor$19(Zbk2 paramZbk2) {
    this.Zg.ZI(paramZbk2);
  }
  
  private void lambda$updateSelectedItems$18() {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZE : Lburp/Zor;
    //   8: invokevirtual getSelectionPaths : ()[Ljavax/swing/tree/TreePath;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull -> 209
    //   16: new java/util/ArrayList
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore_3
    //   24: aload_2
    //   25: astore #4
    //   27: aload #4
    //   29: arraylength
    //   30: istore #5
    //   32: iconst_0
    //   33: istore #6
    //   35: iload #6
    //   37: iload #5
    //   39: if_icmpge -> 83
    //   42: aload #4
    //   44: iload #6
    //   46: aaload
    //   47: astore #7
    //   49: aload #7
    //   51: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   54: astore #8
    //   56: aload #8
    //   58: instanceof burp/Zz_1
    //   61: ifeq -> 76
    //   64: aload_3
    //   65: aload #8
    //   67: checkcast burp/Zz_1
    //   70: invokeinterface add : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: iinc #6, 1
    //   79: aload_1
    //   80: ifnonnull -> 35
    //   83: aload_0
    //   84: getfield Zf : Ljava/util/List;
    //   87: dup
    //   88: astore #4
    //   90: monitorenter
    //   91: aload_0
    //   92: getfield Zf : Ljava/util/List;
    //   95: invokeinterface isEmpty : ()Z
    //   100: ifne -> 195
    //   103: iconst_0
    //   104: istore #5
    //   106: aload_3
    //   107: invokeinterface size : ()I
    //   112: aload_0
    //   113: getfield Zf : Ljava/util/List;
    //   116: invokeinterface size : ()I
    //   121: if_icmpeq -> 131
    //   124: iconst_1
    //   125: istore #5
    //   127: aload_1
    //   128: ifnonnull -> 186
    //   131: aload_3
    //   132: invokeinterface iterator : ()Ljava/util/Iterator;
    //   137: astore #6
    //   139: aload #6
    //   141: invokeinterface hasNext : ()Z
    //   146: ifeq -> 186
    //   149: aload #6
    //   151: invokeinterface next : ()Ljava/lang/Object;
    //   156: checkcast burp/Zz_1
    //   159: astore #7
    //   161: aload_0
    //   162: getfield Zf : Ljava/util/List;
    //   165: aload #7
    //   167: invokeinterface contains : (Ljava/lang/Object;)Z
    //   172: ifne -> 182
    //   175: iconst_1
    //   176: istore #5
    //   178: aload_1
    //   179: ifnonnull -> 186
    //   182: aload_1
    //   183: ifnonnull -> 139
    //   186: iload #5
    //   188: ifne -> 195
    //   191: aload #4
    //   193: monitorexit
    //   194: return
    //   195: aload #4
    //   197: monitorexit
    //   198: goto -> 209
    //   201: astore #9
    //   203: aload #4
    //   205: monitorexit
    //   206: aload #9
    //   208: athrow
    //   209: aload_0
    //   210: invokevirtual ZF : ()Lburp/Zbfx;
    //   213: astore_3
    //   214: aload_0
    //   215: aload_3
    //   216: checkcast burp/Zbk2
    //   219: invokevirtual Zy : (Lburp/Zbk2;)Ljava/util/concurrent/Future;
    //   222: astore #4
    //   224: aload_0
    //   225: getfield ZR : Lburp/Ztwv;
    //   228: aload_0
    //   229: aload_2
    //   230: aload_3
    //   231: aload #4
    //   233: <illegal opcode> run : (Lburp/Zg_q;[Ljavax/swing/tree/TreePath;Lburp/Zbfx;Ljava/util/concurrent/Future;)Ljava/lang/Runnable;
    //   238: sipush #-10346
    //   241: sipush #3179
    //   244: invokestatic a : (II)Ljava/lang/String;
    //   247: invokeinterface Zl : (Ljava/lang/Runnable;Ljava/lang/String;)Ljava/util/concurrent/Future;
    //   252: pop
    //   253: return
    // Exception table:
    //   from	to	target	type
    //   91	194	201	finally
    //   195	198	201	finally
    //   201	206	201	finally
  }
  
  private void lambda$updateSelectedItems$17(TreePath[] paramArrayOfTreePath, Zbfx paramZbfx, Future paramFuture) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZK : Ljava/util/List;
    //   9: invokeinterface iterator : ()Ljava/util/Iterator;
    //   14: astore #5
    //   16: aload #5
    //   18: invokeinterface hasNext : ()Z
    //   23: ifeq -> 52
    //   26: aload #5
    //   28: invokeinterface next : ()Ljava/lang/Object;
    //   33: checkcast burp/Zskg
    //   36: astore #6
    //   38: aload #6
    //   40: aload_1
    //   41: aload_2
    //   42: invokeinterface Zy : ([Ljavax/swing/tree/TreePath;Lburp/Zbfx;)V
    //   47: aload #4
    //   49: ifnonnull -> 16
    //   52: aload_3
    //   53: ifnull -> 64
    //   56: aload_3
    //   57: iconst_0
    //   58: invokeinterface cancel : (Z)Z
    //   63: pop
    //   64: aload_0
    //   65: aload_2
    //   66: <illegal opcode> run : (Lburp/Zg_q;Lburp/Zbfx;)Ljava/lang/Runnable;
    //   71: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   74: return
  }
  
  private void lambda$updateSelectedItems$16(Zbfx paramZbfx) {
    if (this.ZD == paramZbfx)
      ZO(); 
  }
  
  private static void lambda$filterModified$15() {}
  
  private void lambda$applyBulkChanges$14(List<Runnable> paramList) {
    Z_(paramList);
  }
  
  private void lambda$processBatch$13(List paramList) {
    TreePath treePath = this.ZE.getSelectionPath();
    paramList.forEach(Runnable::run);
    this.ZQ.Zq();
    if (treePath != null && ZA(treePath))
      this.ZE.setSelectionPath(treePath); 
  }
  
  private void lambda$processItemRemoved$12(Zbxu paramZbxu) {
    ZU(paramZbxu);
  }
  
  private void lambda$processItemUpdated$11(Ze9d paramZe9d) {
    Zm(paramZe9d);
  }
  
  private void lambda$processItemAdded$10(Zkaq paramZkaq) {
    ZR(paramZkaq);
  }
  
  private void lambda$buildTreeFromModel$9() {
    this.ZE.setModel(this.ZQ);
    this.ZE.setSelectionInterval(0, 0);
  }
  
  private void lambda$buildTreeFromModel$8(Zxya paramZxya1, Zxya paramZxya2) {
    this.ZQ.ZR(paramZxya1, paramZxya2, false);
  }
  
  private void lambda$connectToModel$7(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZZ);
  }
  
  private void lambda$connectToModel$6(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zc);
  }
  
  private void lambda$connectToModel$5(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZR);
  }
  
  private void lambda$connectToModel$4(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZY);
  }
  
  private void lambda$connectToModel$3(Zxr8 paramZxr8) {
    Zb();
  }
  
  private void lambda$connectToModel$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Ze);
  }
  
  private void lambda$connectToModel$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZN);
  }
  
  private void lambda$connectToModel$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZV);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'æW¥ù)§?WqQ\\t8ýÅs&.¦wll5ê'ÜÈÂð"­Ôÿ\\r¸[=1B#)5ºÂ¼'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #22
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #90
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
    //   67: ldc '¨¾¡tÙ´#5È¡¶«°ÁdX¾¦Ëx5Ô³¼/'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #54
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zg_q.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zg_q.b : [Ljava/lang/String;
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
    //   212: bipush #91
    //   214: goto -> 244
    //   217: bipush #81
    //   219: goto -> 244
    //   222: bipush #121
    //   224: goto -> 244
    //   227: bipush #7
    //   229: goto -> 244
    //   232: bipush #116
    //   234: goto -> 244
    //   237: bipush #61
    //   239: goto -> 244
    //   242: bipush #92
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD797) & 0xFFFF;
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
      char c = '¶';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */