package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.BorderFactory;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class Zrxq implements Zgx0 {
  private final Zz0n Zy;
  
  private final Zt4u Zc;
  
  private final Zerg Zz;
  
  private final Zz_r Zm;
  
  private final Zgbj ZL;
  
  private final Zgb6 Zq;
  
  private final Zxgc ZJ;
  
  private final Zgzy Zd;
  
  private final Zskh ZM;
  
  private final Zslu Zg;
  
  private final Zkl6 Za;
  
  private final Zbnt ZO;
  
  private final Ztwv Zo;
  
  private final Ztyg ZI;
  
  private final Zgq7 Zx;
  
  private final Zz1z ZX;
  
  private final Ztdq ZG;
  
  private final Ze8b Zu;
  
  private final Zbiv ZT;
  
  private final Zrag ZU;
  
  private final Zr_4 ZC;
  
  private final Zr_4 ZE;
  
  private final Zlaa ZV;
  
  private final Zlcb Zf;
  
  private final Zm6v Z_;
  
  private final Zs6i Zi;
  
  private final Zm6x ZS;
  
  private final Ze47 Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrxq(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zz_r paramZz_r, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zgzy paramZgzy, Zskh paramZskh, Zslu paramZslu, Zkl6 paramZkl6, Zbnt paramZbnt, Ztwv paramZtwv, Ztyg paramZtyg, Zgq7 paramZgq7, Zz1z paramZz1z, Ztdq paramZtdq, Ze8b paramZe8b, Zbiv paramZbiv, Zrag paramZrag, Zr_4 paramZr_41, Zr_4 paramZr_42, Zlaa paramZlaa, Zlcb paramZlcb, Zm6v paramZm6v, Zs6i paramZs6i, Zm6x paramZm6x) {
    this.Zy = paramZz0n;
    this.Zc = paramZt4u;
    this.Zz = paramZerg;
    this.Zm = paramZz_r;
    this.ZL = paramZgbj;
    this.Zq = paramZgb6;
    this.ZJ = paramZxgc;
    this.Zd = paramZgzy;
    this.ZM = paramZskh;
    this.Zg = paramZslu;
    this.Za = paramZkl6;
    this.ZO = paramZbnt;
    this.Zo = paramZtwv;
    this.ZI = paramZtyg;
    this.Zx = paramZgq7;
    this.ZX = paramZz1z;
    this.ZG = paramZtdq;
    this.Zu = paramZe8b;
    this.ZT = paramZbiv;
    this.ZU = paramZrag;
    this.ZC = paramZr_41;
    this.ZE = paramZr_42;
    this.ZV = paramZlaa;
    this.Zf = paramZlcb;
    this.Z_ = paramZm6v;
    this.Zi = paramZs6i;
    this.ZS = paramZm6x;
    Objects.requireNonNull(paramZgb6);
    this.Ze = new Ze47(paramZkl6.ZM(), paramZgb6::ZcC);
  }
  
  public Zor ZS(TreeModel paramTreeModel) {
    return new Zot(paramTreeModel);
  }
  
  public Zkmc ZJ(TreeNode paramTreeNode) {
    return new Ztot(paramTreeNode);
  }
  
  public Zbws Zz() {
    return new Zbws();
  }
  
  public Zmiw ZS(Ztdi paramZtdi, Zbws paramZbws) {
    ObservableList<Zz_1> observableList = FXCollections.observableArrayList();
    return new Zmiw(observableList, paramZtdi, this.Zo);
  }
  
  public Zl41 ZL(Window paramWindow, Zez3[] paramArrayOfZez3) {
    return new Zl41(paramWindow, this.Zz, this.Zm, this.ZM, this.Zg, this.Zo, this.ZI, this.Zx, this.ZX, paramArrayOfZez3, this.Za, this.Ze, this.Zi, this.ZS);
  }
  
  public Zl4s ZY(Window paramWindow, Zez3[] paramArrayOfZez3) {
    return new Zl4s(paramWindow, this.Zy, this.Zc, this.Zz, this.Zm, this.Zq, this.ZM, this.ZO, this.Zo, this.ZI, this.Zx, this.ZX, paramArrayOfZez3);
  }
  
  public Zl43 Zt(Window paramWindow, Zez3[] paramArrayOfZez3) {
    return new Zl43(paramWindow, this.Zy, this.Zc, this.Zz, this.Zm, this.Zq, this.ZM, this.ZO, this.Zo, this.ZI, this.Zx, this.ZX, paramArrayOfZez3);
  }
  
  public Zl4u Zc(Window paramWindow, Zez3[] paramArrayOfZez3) {
    return new Zl4u(paramWindow, this.Zc, this.ZM, this.ZO, this.Zo, this.ZI, this.Zx, this.ZX, paramArrayOfZez3, this.Za, this.Ze);
  }
  
  public Zl44 Zj(Window paramWindow, Zlit paramZlit) {
    return this.ZG.Za(paramWindow, paramZlit);
  }
  
  public Zzlr ZJ(Window paramWindow, Ztdi paramZtdi, Zmrj paramZmrj, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6) {
    return new Zzlr(paramWindow, this.Zy, this.Zc, this.Zz.Zj(), paramZtdi, paramZmrj, paramZxgc, paramZgzy, paramZkl6, this);
  }
  
  public Zl42 Zx(Window paramWindow, Zre_ paramZre_) {
    return new Zl42(paramWindow, paramZre_);
  }
  
  public Zlh4 Zx(Zzi paramZzi, Zggu paramZggu, boolean paramBoolean) {
    Zg8u zg8u = new Zg8u(paramZzi, paramBoolean, this.Z_);
    Zlbu zlbu = new Zlbu(this.Zg, paramBoolean, paramZzi);
    Zlh4 zlh4 = new Zlh4(zlbu, zg8u, paramZggu, this.Zo);
    paramZzi.ZG(zlh4);
    return zlh4;
  }
  
  public Zrau ZP(Zl2z paramZl2z, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6) {
    return new Zrau(this.Zy.ZP(), this.Zz.Zj(), paramZl2z, this.Zm, this.Zq, paramZxgc, paramZgzy, paramZkl6, this.Zo, this.ZE, this, this.ZS);
  }
  
  public Zbt9 Zd(Zzlr paramZzlr, Zbiw paramZbiw, boolean paramBoolean, Zkl6 paramZkl6, Zl2z paramZl2z) {
    Zskh zskh = this.Zz.Zj().ZY4();
    Zrzv zrzv = new Zrzv(this.ZV.Zk(Zeew.TARGET, zskh, this.Zf.ZW(Zeew.TARGET)), zskh, this.Zq);
    return new Zbt9(paramZzlr, paramZbiw, paramBoolean, paramZkl6, paramZl2z, this.Zo, this.ZE, zrzv);
  }
  
  public Zbt7 Z_(Zzlr paramZzlr, Zbiw paramZbiw, Zbth paramZbth, int paramInt, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6) {
    return new Zbt7(paramZzlr, paramZbiw, paramZbth, paramInt, this.Zy.ZP(), this.Zm, this.Zq, paramZxgc, paramZgzy, paramZkl6, this.Zo, this.ZE, this, this.ZS);
  }
  
  public Zmrj ZY(Zskz paramZskz, Ztdi paramZtdi, Zzi paramZzi, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6) {
    return new Zmrx(paramZskz, paramZtdi, paramZzi, this.Zz.Zj().Zj(), paramZxgc, paramZgzy, paramZkl6, this.Zo, this);
  }
  
  public Zmrj ZI(Ztdi paramZtdi, Zgd paramZgd, Zkf3 paramZkf3, Zzi paramZzi, Zslu paramZslu, boolean paramBoolean, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6) {
    Zmrj zmrj = new Zmrj(this.Zz, paramZtdi, paramZgd, paramZkf3, paramZzi, paramZslu, paramBoolean, paramZxgc, paramZgzy, paramZkl6, this.Zo, this, true);
    paramZzi.Zg(zmrj);
    return zmrj;
  }
  
  public Zmrj ZZ(Ztdi paramZtdi, Zgd paramZgd, Zzi paramZzi, Zslu paramZslu, boolean paramBoolean, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6) {
    Zmrw zmrw = new Zmrw(this, this.Zz, paramZtdi, paramZgd, null, paramZzi, paramZslu, paramBoolean, paramZxgc, paramZgzy, paramZkl6, this.Zo, this, false);
    paramZzi.Zg(zmrw);
    return zmrw;
  }
  
  public Zg8z Zo(Ztdi paramZtdi, Zkf3 paramZkf3, Zr8q paramZr8q, boolean paramBoolean) {
    Zs0g zs0g = (this.Zz.Zk() == null) ? null : this.Zz.Zk().ZFR();
    return new Zg8z(paramZtdi, this, this.ZI, this.Zx, this.ZO, paramZkf3, true, this.Zo, paramZr8q, zs0g, this.Zi, this.ZS, paramBoolean, this.Zq, this.Zy.ZD());
  }
  
  public Component ZK() {
    Zkrw zkrw = this.Zz.Zl();
    if (zkrw == null)
      return new Zbqc(); 
    Zbc2 zbc2 = new Zbc2(this.ZS);
    Zrju zrju = new Zrju(this.Zz, this.ZU, zbc2, this.ZS);
    this.Zz.ZJ().Zr(zrju);
    return zbc2;
  }
  
  public Zgos ZS(Component paramComponent, Zrhs paramZrhs, Zg6q paramZg6q, Ztos<Zt1_> paramZtos) {
    Zs0g zs0g = (this.Zz.Zk() == null) ? null : this.Zz.Zk().ZFR();
    return new Zgos(paramComponent, this.Zy, this.Zz, this.Zo, this.Zq, this.ZI, this.Zx, zs0g, this.Za, paramZg6q, paramZrhs, paramZtos, this.ZS);
  }
  
  public Zg_q Zp(Ztdi paramZtdi, Zgd paramZgd, Zmrj paramZmrj, Zzi paramZzi, Zxgc paramZxgc, Zgzy paramZgzy, Zslu paramZslu, Zkl6 paramZkl6) {
    return new Zg_q(paramZtdi, paramZgd, paramZmrj, paramZzi, paramZxgc, paramZgzy, paramZslu, paramZkl6, this.Zo, this);
  }
  
  public Zm3z ZP(Ztdi paramZtdi, Zmrj paramZmrj, Zzi paramZzi, Zmiw paramZmiw, Zbws paramZbws, Zor paramZor, Map<TreePath, Boolean> paramMap, Zg_q paramZg_q, Zxgc paramZxgc, Zgzy paramZgzy, Zslu paramZslu, Zkl6 paramZkl6) {
    return new Zm3z(this.Zy, this.Zc, paramZtdi, paramZmrj, paramZzi, paramZmiw, paramZbws, paramZor, paramMap, paramZg_q, this.ZL, this.Zq, paramZxgc, this.ZM, paramZgzy, paramZslu, paramZkl6, this.Zu, this.Zo, this.ZC, this.ZT, this, this.Zz, this.Zz.Zj().ZY4(), paramZmrj.ZE, this.ZS);
  }
  
  public Zmrz ZG(int paramInt, Zkr0 paramZkr0, Ztdi paramZtdi, Zgd paramZgd, Zz28 paramZz28, Zl2z paramZl2z, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6) {
    return new Zmrz(paramInt, paramZtdi, paramZgd, paramZkr0.Zj(), paramZl2z, paramZxgc, paramZgzy, paramZkl6, this.Zo, this);
  }
  
  public Zg83 Zn(int paramInt, Zkl6 paramZkl6, Zl2z paramZl2z, Zlli<Zt10> paramZlli) {
    return new Zg83(paramInt, paramZkl6, this.Ze, this.ZI, this.Zx, paramZl2z, this.ZS);
  }
  
  public Zg_q ZO(Zslu paramZslu, Ztdi paramZtdi, Zgd paramZgd, Zmrz paramZmrz, Zzi paramZzi, Zl2z paramZl2z, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6) {
    return new Zg_h(paramZslu, paramZtdi, paramZgd, paramZmrz, paramZzi, paramZl2z, paramZxgc, paramZgzy, paramZkl6, this.Zo, this);
  }
  
  public Zzm_ Zv(Ztdi paramZtdi, Zmrj paramZmrj, Zg_q paramZg_q, Zmlq paramZmlq, Zbkd paramZbkd, boolean paramBoolean) {
    Zbws zbws = Zz();
    zbws.setName(a(-24311, -31982));
    zbws.ZF(true);
    zbws.setAutoCreateRowSorter(true);
    zbws.getTableHeader().setReorderingAllowed(true);
    Zmiw zmiw = ZS(paramZtdi, zbws);
    zbws.ZL(zmiw);
    if (paramBoolean) {
      this.Zi.Zc(zbws::lambda$createMapTablePanel$0);
      this.ZS.ZO(Ztjx.class, Zehw.SWING, zbws::lambda$createMapTablePanel$1);
    } 
    paramZg_q.Zl(zmiw, zbws);
    Zbup zbup = new Zbup();
    zbup.setViewportView(zbws);
    paramZbkd.Zh(new Zm2j(zbws));
    Zgf8 zgf8 = new Zgf8();
    zgf8.setName(a(-24305, 6775));
    Objects.requireNonNull(zmiw);
    zgf8.Zv(zmiw::Zv, 20);
    zgf8.addFocusListener(new Zm9z(zgf8, zbws.getName()));
    paramZbkd.ZX(zgf8);
    paramZbkd.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    Zbqc zbqc = new Zbqc(new BorderLayout());
    zbqc.add(paramZbkd, a(-24309, -13124));
    zbqc.add(zbup, a(-24307, 16628));
    Zzm_ zzm_ = new Zzm_(paramZmrj, paramZg_q, zbws, zmiw, zbup, paramZmlq, zbqc);
    zbws.ZP(zzm_);
    zbws.Zc(zzm_);
    zbws.Zk(zzm_);
    zbup.addMouseListener(zzm_);
    return zzm_;
  }
  
  public Zg8s ZP(Zkl6 paramZkl6, Zlli<Zt10> paramZlli) {
    return new Zg8s(paramZkl6, this.Ze, this.ZI, this.Zx, this.ZS);
  }
  
  public Zzm_ Zc(Ztdi paramZtdi, Zmrz paramZmrz, Zg_q paramZg_q, Zl2z paramZl2z, Zmlq paramZmlq) {
    Zbws zbws = Zz();
    zbws.setName(a(-24310, 22426));
    zbws.ZF(true);
    zbws.setAutoCreateRowSorter(true);
    zbws.getTableHeader().setReorderingAllowed(true);
    Zmin zmin = new Zmin(paramZl2z, FXCollections.observableArrayList(), paramZtdi, zbws, this.Zo);
    zbws.ZL(zmin);
    paramZg_q.Zl(zmin, zbws);
    Zbup zbup = new Zbup();
    zbup.setViewportView(zbws);
    Zbkd zbkd = new Zbkd();
    zbkd.Zh(new Zm2j(zbws));
    Zbqc zbqc = new Zbqc(new BorderLayout());
    zbqc.add(zbkd, a(-24308, -21265));
    zbqc.add(zbup, a(-24312, 2048));
    Zzm_ zzm_ = new Zzm_(paramZmrz, paramZg_q, zbws, zmin, zbup, paramZmlq, zbqc);
    zbws.ZP(zzm_);
    zbws.Zc(zzm_);
    zbws.Zk(zzm_);
    zbup.addMouseListener(zzm_);
    return zzm_;
  }
  
  public Zb37 Zt(Zg_q paramZg_q, Zzi paramZzi, Zz28 paramZz28, boolean paramBoolean) {
    return new Zb37(paramZg_q, paramZzi, paramZz28, this.ZT, paramBoolean, this.Zz, ZY());
  }
  
  public Zels Zc(Ztdi paramZtdi) {
    return new Zels(this.Zy, this.Zc, this.ZL, this.Zq, this.ZM, this.Zg, this.Za, this.Zu, this.ZT, this, this.Zz, this.Zz.Zj().ZY4(), paramZtdi, ZY());
  }
  
  private Zgso ZY() {
    return new Zgso(this.ZO, this.Za, this.Zz, Zeew.TARGET, new Zsai(), this.ZS);
  }
  
  public Zzv5 Zy(Window paramWindow, Zlit paramZlit, Zm82 paramZm82, Ztdi paramZtdi, Zskz paramZskz) {
    return new Zgvc(paramWindow, this.Zy, this.Zc, paramZm82, this.Zz.Zj(), paramZtdi, paramZlit, paramZskz, this.ZJ, this.Zd, this.Zg, this.Za, this.Zo, this);
  }
  
  public Zkju Zr(Zsy paramZsy) {
    Zgso zgso = ZY();
    return new Zkju(this.Zz, this.Zg, this.ZT, zgso, paramZsy);
  }
  
  public Zsy ZC(Zg8x paramZg8x, Ztdi paramZtdi) {
    return new Zsy(this.Zy, this.Zc, paramZg8x, this.ZL, this.Zq, this.ZM, this.Zg, this.Za, this.Zu, this.ZT, this, this.Zz, this.Zz.Zj().ZY4(), paramZtdi);
  }
  
  private static void lambda$createMapTablePanel$1(Zbws paramZbws, Ztjx paramZtjx) {
    List<Zlz8> list = paramZtjx.ZEU();
    Iterator<Zlz8> iterator = list.iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zlz8 zlz8 = iterator.next();
      if (zlz8.ZLx().equals(Zru.TARGET_MAP.id)) {
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
  
  private static Zlz8 lambda$createMapTablePanel$0(Zbws paramZbws) {
    return new Zlz8(Zru.TARGET_MAP.id, paramZbws.ZHh());
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\b vÏf»xÓm OrÃlý\\bÓÎ»õø÷Zý'ó÷5¬âÎ,UÞøëmÇð¼ªx7I'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #20
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #35
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'Ê6Üãêí\Õ¡ÚÑòÈ±­í'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #6
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic burp/Zrxq.a : [Ljava/lang/String;
    //   131: bipush #7
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrxq.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #13
    //   214: goto -> 243
    //   217: bipush #19
    //   219: goto -> 243
    //   222: bipush #23
    //   224: goto -> 243
    //   227: bipush #119
    //   229: goto -> 243
    //   232: iconst_1
    //   233: goto -> 243
    //   236: bipush #103
    //   238: goto -> 243
    //   241: bipush #56
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA109) & 0xFFFF;
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
      byte b1 = 59;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrxq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */