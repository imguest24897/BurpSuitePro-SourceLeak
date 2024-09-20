package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeModel;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.browser.Zcv;
import net.portswigger.browser.Zdb;

public class Zzz2 implements Zkf3 {
  private final Zble Zo;
  
  private final DefaultTreeModel Zq;
  
  private final Zxcz ZK;
  
  private final Zk85 Zz;
  
  private final List<Zku0> Zg;
  
  private final List<Zefs> Za;
  
  private final List<Zg9p> Zh;
  
  private final List<Ztzy> ZF;
  
  private final Zkct Zp;
  
  private final Zzg7 ZW;
  
  private final boolean ZZ;
  
  private final Zr_4 ZQ;
  
  public Zzz2(Ztdi paramZtdi, Zzg7 paramZzg7, boolean paramBoolean, Zr_4 paramZr_4) {
    this.ZW = paramZzg7;
    this.ZZ = paramBoolean;
    this.ZQ = paramZr_4;
    this.Zo = new Zble();
    this.Zq = new DefaultTreeModel(this.Zo);
    this.ZK = new Zxcz();
    this.Zz = new Zk85();
    this.Zg = new CopyOnWriteArrayList<>();
    int i = Zble.ZI();
    this.Za = new CopyOnWriteArrayList<>();
    this.Zh = new CopyOnWriteArrayList<>();
    this.ZF = new CopyOnWriteArrayList<>();
    this.Zp = new Zkct(this.Zq, paramBoolean, this::ZM);
    Zz();
    Zb(paramZtdi);
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  private void Zz() {
    this.ZW.forEach(this::lambda$populateModelFromExistingData$0);
  }
  
  private void Zb(Ztdi paramZtdi) {
    paramZtdi.Zk().ZE(Zt10.Zz, this::lambda$subscribeToMapManager$1);
    paramZtdi.Zk().ZE(Zt10.ZN, this::lambda$subscribeToMapManager$2);
    paramZtdi.Zk().ZE(Zt10.Zf, this::lambda$subscribeToMapManager$3);
  }
  
  private void ZJ(Zble paramZble, Zmnm paramZmnm) {
    // Byte code:
    //   0: new burp/Zble
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Lburp/Zmnm;)V
    //   8: astore_3
    //   9: aload_1
    //   10: aload_3
    //   11: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   14: aload_0
    //   15: getfield ZK : Lburp/Zxcz;
    //   18: aload_3
    //   19: invokevirtual Zf : (Lburp/Zble;)V
    //   22: aload_0
    //   23: getfield Zz : Lburp/Zk85;
    //   26: aload_3
    //   27: invokevirtual Zw : (Lburp/Zble;)V
    //   30: aload_2
    //   31: invokeinterface ZO2 : ()Lburp/Zefg;
    //   36: aload_0
    //   37: aload_3
    //   38: <illegal opcode> accept : (Lburp/Zzz2;Lburp/Zble;)Ljava/util/function/Consumer;
    //   43: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   48: return
  }
  
  public DefaultTreeModel ZN() {
    return this.Zq;
  }
  
  public boolean ZK() {
    return this.ZW.ZM();
  }
  
  public void ZU(Zg9p paramZg9p) {
    this.Zh.add(paramZg9p);
  }
  
  public void Zs(Zg9p paramZg9p) {
    this.Zh.remove(paramZg9p);
  }
  
  public void Zu(Ztzy paramZtzy) {
    this.ZF.add(paramZtzy);
  }
  
  public void ZY(Ztzy paramZtzy) {
    this.ZF.remove(paramZtzy);
  }
  
  public void Zv(Zku0 paramZku0) {
    this.Zg.add(paramZku0);
  }
  
  public void ZE(Zku0 paramZku0) {
    this.Zg.remove(paramZku0);
  }
  
  public void Zq(Zefs paramZefs) {
    this.Za.add(paramZefs);
  }
  
  public void ZX(Zefs paramZefs) {
    this.Za.remove(paramZefs);
  }
  
  public void ZV(Ztas paramZtas) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZUi : ()Lburp/Zt8i;
    //   4: astore_2
    //   5: aload_2
    //   6: invokeinterface Zsg : ()Lburp/Zrp0;
    //   11: astore_3
    //   12: aload_2
    //   13: invokeinterface Zsu : ()Lburp/Zeu9;
    //   18: astore #4
    //   20: aload_2
    //   21: invokeinterface ZsU : ()Lburp/Zszw;
    //   26: astore #5
    //   28: aload #4
    //   30: instanceof burp/Zxjt
    //   33: ifne -> 44
    //   36: aload #4
    //   38: instanceof burp/Zta2
    //   41: ifeq -> 45
    //   44: return
    //   45: aload_0
    //   46: aload_3
    //   47: aload #4
    //   49: aload #5
    //   51: aload_2
    //   52: aload_1
    //   53: <illegal opcode> run : (Lburp/Zzz2;Lburp/Zrp0;Lburp/Zeu9;Lburp/Zszw;Lburp/Zt8i;Lburp/Ztas;)Ljava/lang/Runnable;
    //   58: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   61: return
  }
  
  public void ZE(Zeu9 paramZeu9) {
    this.Za.forEach(paramZeu9::lambda$onRoomDoorwaysUpdated$7);
  }
  
  public void ZT(Zbw4 paramZbw4) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zzz2;Lburp/Zbw4;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void Zf(Zeaa paramZeaa) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zb4 : ()Ljava/util/List;
    //   4: invokeinterface isEmpty : ()Z
    //   9: ifeq -> 13
    //   12: return
    //   13: aload_0
    //   14: aload_1
    //   15: <illegal opcode> run : (Lburp/Zzz2;Lburp/Zeaa;)Ljava/lang/Runnable;
    //   20: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   23: return
  }
  
  private void ZE(Zrnp paramZrnp) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZF : ()Ljava/util/Collection;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   14: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   19: invokeinterface toList : ()Ljava/util/List;
    //   24: astore_2
    //   25: aload_2
    //   26: invokeinterface isEmpty : ()Z
    //   31: ifeq -> 35
    //   34: return
    //   35: aload_0
    //   36: aload_2
    //   37: <illegal opcode> run : (Lburp/Zzz2;Ljava/util/List;)Ljava/lang/Runnable;
    //   42: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   45: return
  }
  
  private void Zo(Zble paramZble, List<Zrdb> paramList) {
    // Byte code:
    //   0: invokestatic isEventDispatchThread : ()Z
    //   3: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   6: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   9: aload_1
    //   10: ifnull -> 21
    //   13: aload_1
    //   14: aload_0
    //   15: getfield Zo : Lburp/Zble;
    //   18: if_acmpne -> 22
    //   21: return
    //   22: aload_1
    //   23: invokevirtual Zg : ()Lburp/Zmnm;
    //   26: astore_3
    //   27: aload_3
    //   28: ifnull -> 68
    //   31: aload_0
    //   32: getfield Zq : Ljavax/swing/tree/DefaultTreeModel;
    //   35: aload_1
    //   36: invokevirtual nodeChanged : (Ljavax/swing/tree/TreeNode;)V
    //   39: aload_0
    //   40: aload_1
    //   41: invokevirtual ZM : (Lburp/Zble;)V
    //   44: aload_0
    //   45: getfield Zp : Lburp/Zkct;
    //   48: aload_1
    //   49: invokevirtual Zk : (Lburp/Zble;)V
    //   52: aload_0
    //   53: getfield Zh : Ljava/util/List;
    //   56: aload_1
    //   57: aload_2
    //   58: <illegal opcode> accept : (Lburp/Zble;Ljava/util/List;)Ljava/util/function/Consumer;
    //   63: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   68: return
  }
  
  private void ZI(Zmdd paramZmdd) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zq : ()Ljava/util/List;
    //   4: astore_2
    //   5: aload_2
    //   6: invokeinterface isEmpty : ()Z
    //   11: ifeq -> 15
    //   14: return
    //   15: aload_0
    //   16: aload_2
    //   17: <illegal opcode> run : (Lburp/Zzz2;Ljava/util/List;)Ljava/lang/Runnable;
    //   22: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   25: return
  }
  
  private void Zz(Zs7k paramZs7k) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zzz2;Lburp/Zs7k;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void ZR(Zble paramZble, List<Zrdb> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zr : ()I
    //   3: istore #4
    //   5: aload_1
    //   6: ifnull -> 17
    //   9: aload_1
    //   10: aload_0
    //   11: getfield Zo : Lburp/Zble;
    //   14: if_acmpne -> 18
    //   17: return
    //   18: aload_1
    //   19: invokevirtual Zg : ()Lburp/Zmnm;
    //   22: astore #5
    //   24: aload #5
    //   26: ifnull -> 255
    //   29: aload #5
    //   31: invokeinterface ZO1 : ()Ljava/util/List;
    //   36: astore #6
    //   38: new java/util/ArrayList
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: astore #7
    //   47: aload_2
    //   48: invokeinterface iterator : ()Ljava/util/Iterator;
    //   53: astore #8
    //   55: aload #8
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 118
    //   65: aload #8
    //   67: invokeinterface next : ()Ljava/lang/Object;
    //   72: checkcast burp/Zrdb
    //   75: astore #9
    //   77: aload #6
    //   79: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   84: aload #9
    //   86: <illegal opcode> test : (Lburp/Zrdb;)Ljava/util/function/Predicate;
    //   91: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   96: istore #10
    //   98: iload #10
    //   100: ifeq -> 113
    //   103: aload #7
    //   105: aload #9
    //   107: invokeinterface add : (Ljava/lang/Object;)Z
    //   112: pop
    //   113: iload #4
    //   115: ifne -> 55
    //   118: aload #7
    //   120: invokeinterface isEmpty : ()Z
    //   125: ifne -> 255
    //   128: aload #5
    //   130: aload_0
    //   131: getfield ZZ : Z
    //   134: invokeinterface ZVD : (Z)I
    //   139: istore #8
    //   141: aload #5
    //   143: aload #7
    //   145: invokeinterface ZA : (Ljava/util/Collection;)V
    //   150: aload #5
    //   152: aload_0
    //   153: getfield ZZ : Z
    //   156: invokeinterface ZVD : (Z)I
    //   161: istore #9
    //   163: iload #9
    //   165: iload #8
    //   167: if_icmpeq -> 191
    //   170: aload_0
    //   171: getfield Zq : Ljavax/swing/tree/DefaultTreeModel;
    //   174: aload_1
    //   175: invokevirtual nodeChanged : (Ljavax/swing/tree/TreeNode;)V
    //   178: aload_0
    //   179: aload_1
    //   180: invokevirtual ZM : (Lburp/Zble;)V
    //   183: aload_0
    //   184: getfield Zp : Lburp/Zkct;
    //   187: aload_1
    //   188: invokevirtual Zk : (Lburp/Zble;)V
    //   191: aload #7
    //   193: aload_0
    //   194: getfield Zz : Lburp/Zk85;
    //   197: dup
    //   198: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   201: pop
    //   202: <illegal opcode> accept : (Lburp/Zk85;)Ljava/util/function/Consumer;
    //   207: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   212: iload_3
    //   213: ifeq -> 238
    //   216: aload_0
    //   217: getfield Zh : Ljava/util/List;
    //   220: aload_1
    //   221: aload #7
    //   223: <illegal opcode> accept : (Lburp/Zble;Ljava/util/List;)Ljava/util/function/Consumer;
    //   228: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   233: iload #4
    //   235: ifne -> 255
    //   238: aload_0
    //   239: getfield Zh : Ljava/util/List;
    //   242: aload_1
    //   243: aload #7
    //   245: <illegal opcode> accept : (Lburp/Zble;Ljava/util/List;)Ljava/util/function/Consumer;
    //   250: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   255: return
  }
  
  private Map<Zble, List<Zrdb>> ZF(Collection<Zrdb> paramCollection) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Zrdb> iterator = paramCollection.iterator();
    int i = Zble.ZI();
    while (iterator.hasNext()) {
      Zrdb zrdb = iterator.next();
      Zble zble = this.Zz.ZJ(zrdb);
      if (zble != null)
        ((List<Zrdb>)hashMap.computeIfAbsent(zble, Zzz2::lambda$getNodesForIssues$22)).add(zrdb); 
      if (i != 0)
        break; 
    } 
    return (Map)hashMap;
  }
  
  public String ZQ(Zeu9 paramZeu9) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zble zble = this.ZK.Zy(paramZeu9);
    return (zble == null) ? null : zble.Zg().ZOZ();
  }
  
  private void ZM(Zble paramZble) {
    this.ZF.forEach(paramZble::lambda$notifyIssueSignificancePropagationListeners$23);
  }
  
  private Zble ZW(Zeaa paramZeaa) {
    Zbza zbza = paramZeaa.Zbx();
    Zzg0 zzg0 = zbza.Zg3();
    if (zzg0 == null)
      return ZL(zbza.Zg0(), zbza.ZgY()); 
    Zrp0 zrp0 = zzg0.Zlc();
    Zuh.Zv((zrp0 != null), Zqf.Zr, 1L);
    Zeu9 zeu9 = zzg0.ZlA();
    Zuh.Zv((zeu9 != null), Zqf.Zr, 3L);
    Zszw zszw = zzg0.ZlC();
    Zuh.Zv((zszw != null), Zqf.Zr, 2L);
    Zble zble = this.ZK.Za(zrp0, zeu9, zszw);
    Zuh.Zv((zble != null), Zqf.Zr, 4L);
    if (paramZeaa.ZbU())
      zble = ZE(zble, zzg0.Zl_()); 
    return zble;
  }
  
  private Zble ZE(Zble paramZble, Zmzk paramZmzk) {
    LinkedList<Zble> linkedList = new LinkedList();
    Zble zble = paramZble;
    int i = Zble.ZI();
    while (zble != null && zble != this.Zo) {
      linkedList.addFirst(zble);
      zble = zble.Zw();
      if (i != 0)
        break; 
    } 
    for (Zble zble1 : linkedList) {
      for (Zgnc zgnc : zble1.Zg().ZOQ()) {
        if (paramZmzk.equals(zgnc.ZzX().ZyR().Zdz()))
          return zble1; 
        if (i != 0)
          break; 
      } 
      if (i != 0)
        break; 
    } 
    return paramZble;
  }
  
  private void Z_(Zble paramZble, int paramInt) {
    this.Zq.nodesWereInserted(paramZble, new int[] { paramInt });
    if (paramZble == this.Zo && this.Zo.getChildCount() == 1)
      this.Zq.nodeStructureChanged(this.Zo); 
  }
  
  private Zble Zl(Zt8i paramZt8i) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zeu9 zeu9 = paramZt8i.Zsg().Znq();
    Zszw zszw = paramZt8i.ZsJ();
    Zble zble = this.ZK.Zw(zeu9, zszw);
    return (zble == null) ? this.Zo : zble;
  }
  
  private Zble ZM(Zt8i paramZt8i, Zlat paramZlat) {
    Zrp0 zrp0 = paramZt8i.Zsg();
    Zeu9 zeu9 = paramZt8i.Zsu();
    Zszw zszw = paramZt8i.ZsU();
    Zl1g zl1g = paramZt8i.Zs1();
    List list = (List)((paramZlat == null) ? Collections.emptyList() : ZC(paramZlat.Zg()));
    String str1 = (paramZlat == null) ? null : paramZlat.ZE().ZJ().ZL();
    String str2 = (paramZlat == null) ? null : Zk(paramZlat.ZE().ZJ());
    Zcv zcv = (paramZlat == null) ? null : paramZlat.ZE().ZJ().Zx();
    Zmnm zmnm = this.ZQ.<Zmnm>ZH(new Zsk6(zrp0, zeu9, zszw, str1, list, str2, zcv, zl1g));
    Zble zble = new Zble(zmnm);
    this.ZK.Zf(zble);
    return zble;
  }
  
  public static List<Zgnc> ZC(Zzxz paramZzxz) {
    return paramZzxz.Zqg().stream().flatMap(Zzz2::lambda$buildAllTraffic$24).toList();
  }
  
  private static String Zk(Zmfc<?> paramZmfc) {
    Object object = paramZmfc.ZY();
    if (object instanceof Zdb) {
      Zdb zdb = (Zdb)object;
      return zdb.Zh().orElse(null);
    } 
    return null;
  }
  
  public Zble ZW(Zt8i paramZt8i) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zrp0 zrp0 = paramZt8i.Zsg();
    Zeu9 zeu9 = paramZt8i.Zsu();
    Zszw zszw = paramZt8i.ZsU();
    return this.ZK.Za(zrp0, zeu9, zszw);
  }
  
  private Zble ZL(Zmzk paramZmzk, String paramString) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic ZI : ()I
    //   12: aload_0
    //   13: getfield Zo : Lburp/Zble;
    //   16: invokevirtual ZT : ()Ljava/util/List;
    //   19: invokeinterface iterator : ()Ljava/util/Iterator;
    //   24: astore #5
    //   26: istore_3
    //   27: aload #5
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 138
    //   37: aload #5
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast burp/Zble
    //   47: astore #6
    //   49: aload #6
    //   51: invokevirtual Zg : ()Lburp/Zmnm;
    //   54: invokeinterface ZOe : ()Lburp/Zrp0;
    //   59: new burp/Zg_x
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: invokeinterface Zv : (Lburp/Zsl5;)Ljava/lang/Object;
    //   71: checkcast burp/Zski
    //   74: astore #7
    //   76: aload #7
    //   78: ifnull -> 134
    //   81: aload #7
    //   83: invokeinterface ZyR : ()Lburp/Zlit;
    //   88: invokeinterface Zdz : ()Lburp/Zmzk;
    //   93: aload_1
    //   94: invokeinterface equals : (Ljava/lang/Object;)Z
    //   99: ifeq -> 134
    //   102: aload #4
    //   104: new burp/Zmiq
    //   107: dup
    //   108: aload #6
    //   110: aload #7
    //   112: invokeinterface ZyR : ()Lburp/Zlit;
    //   117: invokeinterface Zd4 : ()[B
    //   122: invokestatic ZG : ([B)Ljava/lang/String;
    //   125: invokespecial <init> : (Lburp/Zble;Ljava/lang/String;)V
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: iload_3
    //   135: ifeq -> 27
    //   138: aload #4
    //   140: invokeinterface isEmpty : ()Z
    //   145: ifeq -> 153
    //   148: aload_0
    //   149: getfield Zo : Lburp/Zble;
    //   152: areturn
    //   153: aload_2
    //   154: astore #5
    //   156: aload #5
    //   158: ifnull -> 173
    //   161: aload #5
    //   163: invokevirtual isEmpty : ()Z
    //   166: ifeq -> 173
    //   169: ldc '/'
    //   171: astore #5
    //   173: aload #5
    //   175: ifnull -> 326
    //   178: aload #4
    //   180: invokeinterface iterator : ()Ljava/util/Iterator;
    //   185: astore #6
    //   187: aload #6
    //   189: invokeinterface hasNext : ()Z
    //   194: ifeq -> 232
    //   197: aload #6
    //   199: invokeinterface next : ()Ljava/lang/Object;
    //   204: checkcast burp/Zmiq
    //   207: astore #7
    //   209: aload #5
    //   211: aload #7
    //   213: invokevirtual Zd1 : ()Ljava/lang/String;
    //   216: invokevirtual equals : (Ljava/lang/Object;)Z
    //   219: ifeq -> 228
    //   222: aload #7
    //   224: invokevirtual Zdp : ()Lburp/Zble;
    //   227: areturn
    //   228: iload_3
    //   229: ifeq -> 187
    //   232: aload #5
    //   234: invokevirtual length : ()I
    //   237: iconst_1
    //   238: if_icmple -> 305
    //   241: aload #5
    //   243: ldc '/'
    //   245: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   248: ifeq -> 270
    //   251: aload #5
    //   253: iconst_0
    //   254: aload #5
    //   256: invokevirtual length : ()I
    //   259: iconst_1
    //   260: isub
    //   261: invokevirtual substring : (II)Ljava/lang/String;
    //   264: astore #5
    //   266: iload_3
    //   267: ifeq -> 173
    //   270: aload #5
    //   272: bipush #47
    //   274: invokevirtual lastIndexOf : (I)I
    //   277: istore #6
    //   279: iload #6
    //   281: iconst_m1
    //   282: if_icmpne -> 290
    //   285: ldc ''
    //   287: goto -> 300
    //   290: aload #5
    //   292: iconst_0
    //   293: iload #6
    //   295: iconst_1
    //   296: iadd
    //   297: invokevirtual substring : (II)Ljava/lang/String;
    //   300: astore #5
    //   302: goto -> 173
    //   305: aload #5
    //   307: invokevirtual length : ()I
    //   310: iconst_1
    //   311: if_icmpne -> 319
    //   314: ldc ''
    //   316: goto -> 320
    //   319: aconst_null
    //   320: astore #5
    //   322: iload_3
    //   323: ifeq -> 173
    //   326: aload_0
    //   327: getfield Zo : Lburp/Zble;
    //   330: areturn
  }
  
  private static Stream lambda$buildAllTraffic$24(Ztrm paramZtrm) {
    return paramZtrm.ZzQ().stream();
  }
  
  private static void lambda$notifyIssueSignificancePropagationListeners$23(Zble paramZble, Ztzy paramZtzy) {
    paramZtzy.Zu(paramZble);
  }
  
  private static List lambda$getNodesForIssues$22(Zble paramZble) {
    return new LinkedList();
  }
  
  private static void lambda$removeIssuesForNode$21(Zble paramZble, List<Zrdb> paramList, Zg9p paramZg9p) {
    paramZg9p.ZC(paramZble, paramList);
  }
  
  private static void lambda$removeIssuesForNode$20(Zble paramZble, List<Zrdb> paramList, Zg9p paramZg9p) {
    paramZg9p.ZL(paramZble, paramList);
  }
  
  private void lambda$onIssuesRemoved$18(Zs7k paramZs7k) {
    ZF(Collections.singleton(paramZs7k.Zp())).forEach(this::lambda$onIssuesRemoved$17);
  }
  
  private void lambda$onIssuesRemoved$17(Zble paramZble, List<Zrdb> paramList) {
    ZR(paramZble, paramList, false);
  }
  
  private void lambda$onIssuesSuperseded$16(List<Zrdb> paramList) {
    ZF(paramList).forEach(this::lambda$onIssuesSuperseded$15);
  }
  
  private void lambda$onIssuesSuperseded$15(Zble paramZble, List<Zrdb> paramList) {
    ZR(paramZble, paramList, true);
  }
  
  private static void lambda$updateIssuesForNode$14(Zble paramZble, List<Zrdb> paramList, Zg9p paramZg9p) {
    paramZg9p.ZT(paramZble, paramList);
  }
  
  private void lambda$onIssuesUpdated$13(List<Zrdb> paramList) {
    ZF(paramList).forEach(this::Zo);
  }
  
  private void lambda$onIssuesAdded$12(Zeaa paramZeaa) {
    // Byte code:
    //   0: invokestatic Zr : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual ZW : (Lburp/Zeaa;)Lburp/Zble;
    //   9: astore_3
    //   10: aload_3
    //   11: ifnull -> 226
    //   14: aload_3
    //   15: aload_0
    //   16: getfield Zo : Lburp/Zble;
    //   19: if_acmpeq -> 226
    //   22: aload_3
    //   23: invokevirtual Zg : ()Lburp/Zmnm;
    //   26: astore #4
    //   28: aload #4
    //   30: ifnull -> 226
    //   33: aload #4
    //   35: invokeinterface ZO1 : ()Ljava/util/List;
    //   40: astore #5
    //   42: aload_1
    //   43: invokevirtual Zb4 : ()Ljava/util/List;
    //   46: astore #6
    //   48: new java/util/ArrayList
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: astore #7
    //   57: aload #6
    //   59: invokeinterface iterator : ()Ljava/util/Iterator;
    //   64: astore #8
    //   66: aload #8
    //   68: invokeinterface hasNext : ()Z
    //   73: ifeq -> 128
    //   76: aload #8
    //   78: invokeinterface next : ()Ljava/lang/Object;
    //   83: checkcast burp/Zrdb
    //   86: astore #9
    //   88: aload #5
    //   90: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   95: aload #9
    //   97: <illegal opcode> test : (Lburp/Zrdb;)Ljava/util/function/Predicate;
    //   102: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   107: istore #10
    //   109: iload #10
    //   111: ifne -> 124
    //   114: aload #7
    //   116: aload #9
    //   118: invokeinterface add : (Ljava/lang/Object;)Z
    //   123: pop
    //   124: iload_2
    //   125: ifne -> 66
    //   128: aload #7
    //   130: invokeinterface isEmpty : ()Z
    //   135: ifne -> 226
    //   138: aload #4
    //   140: aload_0
    //   141: getfield ZZ : Z
    //   144: invokeinterface ZVD : (Z)I
    //   149: istore #8
    //   151: aload #4
    //   153: aload #7
    //   155: invokeinterface Zi : (Ljava/util/Collection;)V
    //   160: aload #4
    //   162: aload_0
    //   163: getfield ZZ : Z
    //   166: invokeinterface ZVD : (Z)I
    //   171: istore #9
    //   173: iload #9
    //   175: iload #8
    //   177: if_icmpeq -> 201
    //   180: aload_0
    //   181: getfield Zq : Ljavax/swing/tree/DefaultTreeModel;
    //   184: aload_3
    //   185: invokevirtual nodeChanged : (Ljavax/swing/tree/TreeNode;)V
    //   188: aload_0
    //   189: aload_3
    //   190: invokevirtual ZM : (Lburp/Zble;)V
    //   193: aload_0
    //   194: getfield Zp : Lburp/Zkct;
    //   197: aload_3
    //   198: invokevirtual Zk : (Lburp/Zble;)V
    //   201: aload_0
    //   202: getfield Zz : Lburp/Zk85;
    //   205: aload_3
    //   206: invokevirtual Zw : (Lburp/Zble;)V
    //   209: aload_0
    //   210: getfield Zh : Ljava/util/List;
    //   213: aload_3
    //   214: aload #7
    //   216: <illegal opcode> accept : (Lburp/Zble;Ljava/util/List;)Ljava/util/function/Consumer;
    //   221: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   226: return
  }
  
  private static void lambda$onIssuesAdded$11(Zble paramZble, List<Zrdb> paramList, Zg9p paramZg9p) {
    paramZg9p.Z_(paramZble, paramList);
  }
  
  private static boolean lambda$onIssuesAdded$10(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    return paramZrdb2.ZF(paramZrdb1);
  }
  
  private void lambda$onDoorwayMatchedSignpostFingerprint$9(Zbw4 paramZbw4) {
    this.Zg.forEach(paramZbw4::lambda$onDoorwayMatchedSignpostFingerprint$8);
  }
  
  private static void lambda$onDoorwayMatchedSignpostFingerprint$8(Zbw4 paramZbw4, Zku0 paramZku0) {
    paramZku0.ZD(paramZbw4.Znx(), paramZbw4.Zn7(), paramZbw4.Zng());
  }
  
  private static void lambda$onRoomDoorwaysUpdated$7(Zeu9 paramZeu9, Zefs paramZefs) {
    paramZefs.ZS(paramZeu9);
  }
  
  private void lambda$onRoomEntered$6(Zrp0 paramZrp0, Zeu9 paramZeu9, Zszw paramZszw, Zt8i paramZt8i, Ztas paramZtas) {
    // Byte code:
    //   0: invokestatic Zr : ()I
    //   3: istore #6
    //   5: aload_0
    //   6: getfield ZK : Lburp/Zxcz;
    //   9: aload_1
    //   10: aload_2
    //   11: aload_3
    //   12: invokevirtual Za : (Lburp/Zrp0;Lburp/Zeu9;Lburp/Zszw;)Lburp/Zble;
    //   15: ifnull -> 19
    //   18: return
    //   19: aload_0
    //   20: aload #4
    //   22: invokevirtual Zl : (Lburp/Zt8i;)Lburp/Zble;
    //   25: astore #7
    //   27: aload #7
    //   29: invokevirtual getChildCount : ()I
    //   32: istore #8
    //   34: aload_0
    //   35: aload #4
    //   37: aload #5
    //   39: invokevirtual ZU8 : ()Lburp/Zlat;
    //   42: invokevirtual ZM : (Lburp/Zt8i;Lburp/Zlat;)Lburp/Zble;
    //   45: astore #9
    //   47: aload #9
    //   49: invokevirtual Zg : ()Lburp/Zmnm;
    //   52: astore #10
    //   54: aload #7
    //   56: aload #9
    //   58: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   61: aload #7
    //   63: aload_0
    //   64: getfield Zo : Lburp/Zble;
    //   67: if_acmpne -> 84
    //   70: aload_0
    //   71: getfield ZW : Lburp/Zzg7;
    //   74: aload #10
    //   76: invokevirtual Zm : (Lburp/Zmnm;)V
    //   79: iload #6
    //   81: ifne -> 102
    //   84: aload #7
    //   86: invokevirtual Zg : ()Lburp/Zmnm;
    //   89: invokeinterface ZO2 : ()Lburp/Zefg;
    //   94: aload #10
    //   96: invokeinterface add : (Ljava/lang/Object;)Z
    //   101: pop
    //   102: aload_0
    //   103: aload #7
    //   105: iload #8
    //   107: invokevirtual Z_ : (Lburp/Zble;I)V
    //   110: aload_0
    //   111: getfield Zg : Ljava/util/List;
    //   114: aload_1
    //   115: <illegal opcode> accept : (Lburp/Zrp0;)Ljava/util/function/Consumer;
    //   120: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   125: return
  }
  
  private static void lambda$onRoomEntered$5(Zrp0 paramZrp0, Zku0 paramZku0) {
    paramZku0.Zx(paramZrp0);
  }
  
  private void lambda$addChildren$4(Zble paramZble, Zmnm paramZmnm) {
    ZJ(paramZble, paramZmnm);
  }
  
  private void lambda$subscribeToMapManager$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zz);
  }
  
  private void lambda$subscribeToMapManager$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZI);
  }
  
  private void lambda$subscribeToMapManager$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZE);
  }
  
  private void lambda$populateModelFromExistingData$0(Zmnm paramZmnm) {
    ZJ(this.Zo, paramZmnm);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzz2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */