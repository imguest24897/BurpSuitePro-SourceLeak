package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zct;
import net.portswigger.browser.Ztz;

public class Zb5b extends Zbqc implements Zevz {
  private static final Zze2 Za;
  
  private final Ztf9 Zx;
  
  private final Zbqp Zd;
  
  private final Zt_i ZV;
  
  private final Zbws Zh;
  
  private final List<Zs3n> ZK = new ArrayList<>();
  
  private final Zlaa ZF;
  
  private final Zgb6 Zz;
  
  private final Ztks ZI;
  
  private final Zr_4 Zr;
  
  private final Ztwv Zg;
  
  private final Zskh Zi;
  
  private final Zlcb ZJ;
  
  private final Zz3j Zy;
  
  private boolean ZR;
  
  private boolean ZC;
  
  private boolean Zq;
  
  private Zbqc Zm;
  
  private Zm9e Zn;
  
  private Zm9e ZD;
  
  private Ze01 ZY;
  
  private Ze01 ZQ;
  
  private Ze01 Zf;
  
  private Ze01 ZL;
  
  private Ze01 Zw;
  
  private Ze01 Zs;
  
  private Zbqc ZB;
  
  private Zbqc ZW;
  
  private Box.Filler ZP;
  
  private Zm9v ZH;
  
  private Zm9v ZX;
  
  private ButtonGroup Zj;
  
  private Zmg2 ZS;
  
  private Zmg2 ZG;
  
  private Zbup ZU;
  
  private Zl8w Zc;
  
  private Zbkc ZZ;
  
  private Zbqc Zu;
  
  private static String[] ZM;
  
  private static final String[] a;
  
  private static final String[] c;
  
  public Zb5b(Ztf9 paramZtf9, Zbqp paramZbqp, Zlaa paramZlaa, Zgb6 paramZgb6, Ztks paramZtks, Zr_4 paramZr_4, Ztwv paramZtwv, Zskh paramZskh, Zlcb paramZlcb, Zz3j paramZz3j) {
    String[] arrayOfString = ZX();
    this.Zq = true;
    this.Zx = paramZtf9;
    this.Zd = paramZbqp;
    this.ZF = paramZlaa;
    this.Zz = paramZgb6;
    this.ZI = paramZtks;
    this.Zr = paramZr_4;
    this.Zg = paramZtwv;
    this.Zi = paramZskh;
    this.ZJ = paramZlcb;
    this.Zy = paramZz3j;
    Zr();
    setName(a(-1163, 12045));
    this.ZS.setName(a(-1183, 29782));
    this.ZG.setName(a(-1159, 6492));
    this.Zf.setName(a(-1168, -11951));
    this.ZY.setName(a(-1164, -3096));
    this.ZD.Zr(a(-1155, -31529), Zbz3.ZK(Zxpj.PANEL_CLOSE), Zbz3.ZK(Zxpj.PANEL_CLOSE_HOVER), Zbz3.ZK(Zxpj.PANEL_CLOSE_PRESSED), this::ZD);
    this.Zu.Zl(Zlkk.APP_LOGIN_WARNING);
    this.ZX.setIcon(Zbz3.ZK(Zxpj.WARNING));
    this.Zn.Zr(a(-1182, 32513), Zbz3.ZK(Zxpj.PANEL_CLOSE), Zbz3.ZK(Zxpj.PANEL_CLOSE_HOVER), Zbz3.ZK(Zxpj.PANEL_CLOSE_PRESSED), this::Z_);
    this.ZW.Zl(Zlkk.APP_LOGIN_WARNING);
    this.ZH.setIcon(Zbz3.ZK(Zxpj.WARNING));
    this.Zu.setVisible(false);
    this.ZW.setVisible(false);
    this.ZG.setSelected(this.Zq);
    this.ZS.setSelected(!this.Zq);
    this.ZL.setVisible(!this.Zq);
    this.ZV = new Zt_i(this.ZK);
    this.Zh = new Zbwv(this, this.ZV);
    this.Zh.setName(a(-1180, 6286));
    this.ZU.setViewportView(this.Zh);
    Zm();
    if (Zbqc.Zwu() == null)
      Zp(new String[5]); 
  }
  
  public void Zs() {
    this.Zm.setVisible(false);
  }
  
  private void Zm() {
    this.Zw.setEnabled(!this.ZK.isEmpty());
    int[] arrayOfInt = this.Zh.getSelectedRows();
    boolean bool1 = (arrayOfInt.length == 0) ? true : false;
    boolean bool2 = (arrayOfInt.length > 1) ? true : false;
    this.ZY.setEnabled((!bool1 && !bool2));
    this.ZQ.setEnabled(!bool1);
    this.ZL.setEnabled((!bool1 && !bool2));
  }
  
  public Zeuf ZL() {
    return Zeuf.APP_LOGIN;
  }
  
  public Zze2 Zx() {
    return Za;
  }
  
  public String ZP() {
    return a(-1156, 21590);
  }
  
  public Component ZZ() {
    return this;
  }
  
  public void ZG(List<Zs3n> paramList) {
    // Byte code:
    //   0: invokestatic ZX : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZK : Ljava/util/List;
    //   8: aload_1
    //   9: invokeinterface equals : (Ljava/lang/Object;)Z
    //   14: ifne -> 258
    //   17: aload_0
    //   18: getfield Zh : Lburp/Zbws;
    //   21: aload_0
    //   22: getfield Zh : Lburp/Zbws;
    //   25: invokevirtual getSelectedRow : ()I
    //   28: invokevirtual convertRowIndexToModel : (I)I
    //   31: istore_3
    //   32: iload_3
    //   33: iconst_m1
    //   34: if_icmpne -> 41
    //   37: aconst_null
    //   38: goto -> 54
    //   41: aload_0
    //   42: getfield ZK : Ljava/util/List;
    //   45: iload_3
    //   46: invokeinterface get : (I)Ljava/lang/Object;
    //   51: checkcast burp/Zs3n
    //   54: astore #4
    //   56: aload_0
    //   57: getfield ZK : Ljava/util/List;
    //   60: invokeinterface clear : ()V
    //   65: aload_0
    //   66: getfield ZK : Ljava/util/List;
    //   69: aload_1
    //   70: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   75: pop
    //   76: aload_1
    //   77: invokeinterface isEmpty : ()Z
    //   82: ifne -> 109
    //   85: aload_0
    //   86: aload_1
    //   87: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   92: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   97: invokeinterface allMatch : (Ljava/util/function/Predicate;)Z
    //   102: putfield Zq : Z
    //   105: aload_2
    //   106: ifnull -> 120
    //   109: aload_0
    //   110: aload_0
    //   111: getfield ZG : Lburp/Zmg2;
    //   114: invokevirtual isSelected : ()Z
    //   117: putfield Zq : Z
    //   120: aload_0
    //   121: getfield ZS : Lburp/Zmg2;
    //   124: aload_0
    //   125: getfield Zq : Z
    //   128: ifne -> 135
    //   131: iconst_1
    //   132: goto -> 136
    //   135: iconst_0
    //   136: invokevirtual setSelected : (Z)V
    //   139: aload_0
    //   140: getfield ZG : Lburp/Zmg2;
    //   143: aload_0
    //   144: getfield Zq : Z
    //   147: invokevirtual setSelected : (Z)V
    //   150: aload_0
    //   151: getfield ZL : Lburp/Ze01;
    //   154: aload_0
    //   155: getfield Zq : Z
    //   158: ifne -> 165
    //   161: iconst_1
    //   162: goto -> 166
    //   165: iconst_0
    //   166: invokevirtual setVisible : (Z)V
    //   169: aload_0
    //   170: getfield ZV : Lburp/Zt_i;
    //   173: aload_0
    //   174: getfield Zq : Z
    //   177: ifeq -> 185
    //   180: ldc burp/Zs7s
    //   182: goto -> 187
    //   185: ldc burp/Zko4
    //   187: invokevirtual Zb : (Ljava/lang/Class;)V
    //   190: aload_0
    //   191: getfield ZV : Lburp/Zt_i;
    //   194: invokevirtual fireTableDataChanged : ()V
    //   197: aload_1
    //   198: aload #4
    //   200: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   205: istore #5
    //   207: iload #5
    //   209: iconst_m1
    //   210: if_icmpeq -> 232
    //   213: aload_0
    //   214: getfield Zh : Lburp/Zbws;
    //   217: aload_0
    //   218: getfield Zh : Lburp/Zbws;
    //   221: iload #5
    //   223: invokevirtual convertRowIndexToView : (I)I
    //   226: iconst_m1
    //   227: iconst_0
    //   228: iconst_0
    //   229: invokevirtual changeSelection : (IIZZ)V
    //   232: aload_0
    //   233: getfield Zq : Z
    //   236: ifne -> 254
    //   239: aload_0
    //   240: getfield ZC : Z
    //   243: ifne -> 254
    //   246: aload_0
    //   247: getfield ZW : Lburp/Zbqc;
    //   250: iconst_1
    //   251: invokevirtual setVisible : (Z)V
    //   254: aload_0
    //   255: invokevirtual Zm : ()V
    //   258: return
  }
  
  public void Zn() {
    String[] arrayOfString = ZX();
    if (this.ZG.isSelected()) {
      this.Zx.Zg(this);
      if (arrayOfString != null) {
        if (this.ZS.isSelected())
          Zrvf.ZC(Zt2m.ZF(this), this.Zx); 
        return;
      } 
      return;
    } 
    if (this.ZS.isSelected())
      Zrvf.ZC(Zt2m.ZF(this), this.Zx); 
  }
  
  public void Zx(Zz62 paramZz62) {
    Zrv8.ZG(paramZz62, Zt2m.ZF(this), this.Zx);
  }
  
  public void ZD(int paramInt, Zs3n paramZs3n) {
    Zmg2 zmg2 = (paramZs3n instanceof Zs7s) ? this.ZG : this.ZS;
    zmg2.setSelected(true);
    this.ZK.add(paramInt, paramZs3n);
    this.ZV.Zb(paramZs3n.ZR() ? (Class)Zko4.class : (Class)Zs7s.class);
    this.ZV.fireTableRowsInserted(paramInt, paramInt);
    if (paramZs3n instanceof Zko4 && !this.ZC)
      this.ZW.setVisible(true); 
    Zm();
  }
  
  public void Zj(int paramInt, Zs3n paramZs3n) {
    String[] arrayOfString = ZX();
    if (paramZs3n instanceof Zs7s) {
      Zrv6.Zr(Zt2m.ZF(this), paramInt, (Zs7s)paramZs3n, this.Zx);
      if (arrayOfString != null) {
        Zrvf.ZO(Zt2m.ZF(this), paramInt, (Zko4)paramZs3n, this.Zx);
        return;
      } 
      return;
    } 
    Zrvf.ZO(Zt2m.ZF(this), paramInt, (Zko4)paramZs3n, this.Zx);
  }
  
  public void ZS(int paramInt, Zs3n paramZs3n) {
    this.ZK.set(paramInt, paramZs3n);
    this.ZV.fireTableRowsUpdated(paramInt, paramInt);
  }
  
  public void Zw() {
    Zrhb zrhb = this.Zd.Zh(this.Zs, new Zmln[] { Zmln.APPLICATION_LOGIN });
    Zrve zrve = zrhb.ZC();
    if (zrve != null)
      this.Zx.ZP(zrve.ZR()); 
  }
  
  private void ZA() {
    Objects.requireNonNull(this.Zx);
    new Zr7y(this, this.Zx::ZR, Zzv7.APP_LOGIN_SAVE_TO_LIBRARY_DIALOG);
  }
  
  private void ZD() {
    this.Zu.setVisible(false);
    this.ZR = true;
  }
  
  private void Z_() {
    this.ZW.setVisible(false);
    this.ZC = true;
  }
  
  private void ZU(Class<? extends Zs3n> paramClass) {
    // Byte code:
    //   0: invokestatic ZX : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zx : Lburp/Ztf9;
    //   8: invokeinterface Zk : ()V
    //   13: aload_0
    //   14: getfield Zx : Lburp/Ztf9;
    //   17: invokeinterface ZB : ()Z
    //   22: ifeq -> 44
    //   25: aload_0
    //   26: getfield ZR : Z
    //   29: ifne -> 44
    //   32: aload_0
    //   33: getfield Zu : Lburp/Zbqc;
    //   36: iconst_1
    //   37: invokevirtual setVisible : (Z)V
    //   40: aload_2
    //   41: ifnull -> 62
    //   44: aload_0
    //   45: getfield Zu : Lburp/Zbqc;
    //   48: invokevirtual isVisible : ()Z
    //   51: ifeq -> 62
    //   54: aload_0
    //   55: getfield Zu : Lburp/Zbqc;
    //   58: iconst_0
    //   59: invokevirtual setVisible : (Z)V
    //   62: aload_0
    //   63: getfield ZL : Lburp/Ze01;
    //   66: aload_1
    //   67: ldc burp/Zko4
    //   69: if_acmpne -> 76
    //   72: iconst_1
    //   73: goto -> 77
    //   76: iconst_0
    //   77: invokevirtual setVisible : (Z)V
    //   80: aload_0
    //   81: getfield ZV : Lburp/Zt_i;
    //   84: aload_1
    //   85: invokevirtual Zb : (Ljava/lang/Class;)V
    //   88: aload_0
    //   89: getfield ZV : Lburp/Zt_i;
    //   92: invokevirtual fireTableDataChanged : ()V
    //   95: return
  }
  
  public void Zj() {
    this.ZS.setEnabled(false);
    this.ZG.setEnabled(false);
    this.Zh.setEnabled(false);
    this.Zf.setEnabled(false);
    this.ZY.setEnabled(false);
    this.ZQ.setEnabled(false);
    this.ZL.setEnabled(false);
    this.Zs.setEnabled(false);
    this.Zw.setEnabled(false);
  }
  
  private List<Integer> Zd(int[] paramArrayOfint) {
    ArrayList<Integer> arrayList = new ArrayList(paramArrayOfint.length);
    int[] arrayOfInt = paramArrayOfint;
    String[] arrayOfString = ZX();
    int i = arrayOfInt.length;
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt[b];
      arrayList.add(Integer.valueOf(this.Zh.convertRowIndexToModel(j)));
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private void Zr() {
    this.Zj = new ButtonGroup();
    this.ZZ = new Zbkc();
    this.Zc = new Zl8w();
    this.ZU = new Zbup();
    this.ZB = new Zbqc();
    this.Zf = new Ze01();
    this.ZY = new Ze01();
    this.ZQ = new Ze01();
    this.ZL = new Ze01();
    this.Zm = new Zbqc();
    this.Zs = new Ze01();
    this.Zw = new Ze01();
    this.ZG = new Zmg2();
    this.ZS = new Zmg2();
    this.Zu = new Zbqc();
    this.ZX = new Zm9v();
    this.ZD = new Zm9e();
    this.ZW = new Zbqc();
    this.ZH = new Zm9v();
    this.Zn = new Zm9e();
    this.ZP = new Box.Filler(new Dimension(0, 10), new Dimension(0, 10), new Dimension(32767, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.ZZ.Zx(a(-1184, -3961));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZZ, gridBagConstraints);
    this.Zc.setText(a(-1174, 3468));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zc, gridBagConstraints);
    this.ZU.setHorizontalScrollBarPolicy(31);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZU, gridBagConstraints);
    this.ZB.setLayout(new GridLayout(5, 1, 0, 5));
    this.Zf.setText(a(-1154, -32490));
    this.Zf.addActionListener(new Zexq(this));
    this.ZB.add(this.Zf);
    this.ZY.setText(a(-1178, 29632));
    this.ZY.addActionListener(new Zgxb(this));
    this.ZB.add(this.ZY);
    this.ZQ.setText(a(-1160, -26216));
    this.ZQ.addActionListener(new Zzkq(this));
    this.ZB.add(this.ZQ);
    this.ZL.setText(a(-1175, -28677));
    this.ZL.addActionListener(new Zsb6(this));
    this.ZB.add(this.ZL);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 23;
    add(this.ZB, gridBagConstraints);
    this.Zm.setLayout(new GridLayout(1, 0, 10, 0));
    this.Zs.setText(a(-1161, -16149));
    this.Zs.addActionListener(new Zlzt(this));
    this.Zm.add(this.Zs);
    this.Zw.setText(a(-1177, -20742));
    this.Zw.addActionListener(new Zxdj(this));
    this.Zm.add(this.Zw);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 23;
    add(this.Zm, gridBagConstraints);
    this.Zj.add(this.ZG);
    this.ZG.setText(a(-1167, -30664));
    this.ZG.addActionListener(new Zsdc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZG, gridBagConstraints);
    this.Zj.add(this.ZS);
    this.ZS.setText(a(-1181, 10100));
    this.ZS.addActionListener(new Zlti(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZS, gridBagConstraints);
    this.Zu.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    this.Zu.setLayout(new BorderLayout());
    this.ZX.setText(a(-1173, 16506));
    this.Zu.add(this.ZX, a(-1153, -2858));
    this.Zu.add(this.ZD, a(-1166, -27816));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    add(this.Zu, gridBagConstraints);
    this.ZW.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    this.ZW.setLayout(new BorderLayout());
    this.ZH.setText(a(-1165, 12589));
    this.ZW.add(this.ZH, a(-1157, -15280));
    this.ZW.add(this.Zn, a(-1176, -16468));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    add(this.ZP, gridBagConstraints);
  }
  
  private void Zg() {
    try {
      Ztos<Zt3y> ztos = new Ztos<>(Zt35.ZP());
      Zz62 zz62 = ZC((Ztos)ztos);
      this.Zx.Z_(zz62);
    } catch (Ztz ztz) {
      Zah.Zl((Throwable)ztz, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zp() {
    this.Zx.ZQ();
  }
  
  private void Zc() {
    this.Zx.ZB(this.Zh.convertRowIndexToModel(this.Zh.getSelectedRow()));
  }
  
  private void ZT() {
    this.Zx.ZE(Zd(this.Zh.getSelectedRows()));
  }
  
  private void ZS() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZV : Lburp/Zt_i;
    //   4: aload_0
    //   5: getfield Zh : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: invokevirtual Zw : (I)Lburp/Zs3n;
    //   14: astore_1
    //   15: aload_0
    //   16: getfield ZL : Lburp/Ze01;
    //   19: iconst_0
    //   20: invokevirtual setEnabled : (Z)V
    //   23: aload_1
    //   24: instanceof burp/Zko4
    //   27: ifeq -> 52
    //   30: aload_1
    //   31: checkcast burp/Zko4
    //   34: astore_2
    //   35: aload_0
    //   36: getfield Zg : Lburp/Ztwv;
    //   39: aload_0
    //   40: aload_2
    //   41: <illegal opcode> run : (Lburp/Zb5b;Lburp/Zko4;)Ljava/lang/Runnable;
    //   46: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   51: pop
    //   52: return
  }
  
  private Zz62 ZC(Ztos<Zt35> paramZtos) throws Ztz {
    // Byte code:
    //   0: new burp/Zz62
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: getfield Zg : Lburp/Ztwv;
    //   12: aload_0
    //   13: aload_1
    //   14: aload_2
    //   15: <illegal opcode> run : (Lburp/Zb5b;Lburp/Ztos;Lburp/Zz62;)Ljava/lang/Runnable;
    //   20: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   25: pop
    //   26: aload_2
    //   27: areturn
  }
  
  private void Zr(Zko4 paramZko4, Zz62 paramZz62, Zlli<Zt35> paramZlli) {
    // Byte code:
    //   0: new burp/Zl04
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload #4
    //   11: bipush #6
    //   13: invokevirtual setExtendedState : (I)V
    //   16: aload #4
    //   18: sipush #-1179
    //   21: sipush #-5316
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: invokevirtual setTitle : (Ljava/lang/String;)V
    //   30: aload #4
    //   32: new java/awt/GridLayout
    //   35: dup
    //   36: iconst_1
    //   37: iconst_1
    //   38: invokespecial <init> : (II)V
    //   41: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   44: aload #4
    //   46: aload_0
    //   47: invokestatic getWindowAncestor : (Ljava/awt/Component;)Ljava/awt/Window;
    //   50: invokevirtual ZO : (Ljava/awt/Window;)V
    //   53: aload #4
    //   55: new java/awt/Dimension
    //   58: dup
    //   59: sipush #200
    //   62: sipush #200
    //   65: invokespecial <init> : (II)V
    //   68: invokevirtual setMinimumSize : (Ljava/awt/Dimension;)V
    //   71: aload #4
    //   73: iconst_1
    //   74: invokevirtual setVisible : (Z)V
    //   77: new burp/Zm99
    //   80: dup
    //   81: invokespecial <init> : ()V
    //   84: astore #5
    //   86: aload #4
    //   88: aload #5
    //   90: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   93: pop
    //   94: aload_2
    //   95: invokevirtual get : ()Ljava/lang/Object;
    //   98: checkcast burp/Zmle
    //   101: astore #6
    //   103: aload #4
    //   105: new burp/Zlds
    //   108: dup
    //   109: aload_0
    //   110: aload #6
    //   112: invokespecial <init> : (Lburp/Zb5b;Lburp/Zmle;)V
    //   115: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   118: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   123: astore #7
    //   125: aload_3
    //   126: getstatic burp/Zt35.Zd : Lburp/Zlnb;
    //   129: aload #7
    //   131: aload #4
    //   133: aload #5
    //   135: <illegal opcode> accept : (Ljava/util/function/Consumer;Lburp/Zl04;Lburp/Zm99;)Ljava/util/function/Consumer;
    //   140: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   145: pop
    //   146: aload_0
    //   147: getfield Zi : Lburp/Zskh;
    //   150: getstatic burp/Zeew.REPLAYER : Lburp/Zeew;
    //   153: invokeinterface ZQ : (Lburp/Zeew;)Lburp/Zskh;
    //   158: astore #8
    //   160: aload_3
    //   161: getstatic burp/Zt35.Zj : Lburp/Zlnb;
    //   164: aload #8
    //   166: <illegal opcode> accept : (Lburp/Zskh;)Ljava/util/function/Consumer;
    //   171: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   176: pop
    //   177: aload #6
    //   179: aload_1
    //   180: invokevirtual Z_ : (Lburp/Zko4;)Lburp/Zkbb;
    //   183: pop
    //   184: aload #6
    //   186: ifnull -> 224
    //   189: aload #6
    //   191: invokevirtual close : ()V
    //   194: goto -> 224
    //   197: astore #7
    //   199: aload #6
    //   201: ifnull -> 221
    //   204: aload #6
    //   206: invokevirtual close : ()V
    //   209: goto -> 221
    //   212: astore #8
    //   214: aload #7
    //   216: aload #8
    //   218: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   221: aload #7
    //   223: athrow
    //   224: aload_0
    //   225: getfield Zg : Lburp/Ztwv;
    //   228: invokeinterface Ze : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   233: aload_0
    //   234: aload #4
    //   236: <illegal opcode> run : (Lburp/Zb5b;Lburp/Zl04;)Ljava/lang/Runnable;
    //   241: ldc2_w 5
    //   244: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   247: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   252: pop
    //   253: goto -> 380
    //   256: astore #6
    //   258: aload #6
    //   260: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   263: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   266: invokestatic currentThread : ()Ljava/lang/Thread;
    //   269: invokevirtual interrupt : ()V
    //   272: aload_0
    //   273: getfield Zg : Lburp/Ztwv;
    //   276: invokeinterface Ze : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   281: aload_0
    //   282: aload #4
    //   284: <illegal opcode> run : (Lburp/Zb5b;Lburp/Zl04;)Ljava/lang/Runnable;
    //   289: ldc2_w 5
    //   292: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   295: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   300: pop
    //   301: goto -> 380
    //   304: astore #6
    //   306: aload #6
    //   308: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   311: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   314: aload_0
    //   315: getfield Zg : Lburp/Ztwv;
    //   318: invokeinterface Ze : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   323: aload_0
    //   324: aload #4
    //   326: <illegal opcode> run : (Lburp/Zb5b;Lburp/Zl04;)Ljava/lang/Runnable;
    //   331: ldc2_w 5
    //   334: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   337: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   342: pop
    //   343: goto -> 380
    //   346: astore #9
    //   348: aload_0
    //   349: getfield Zg : Lburp/Ztwv;
    //   352: invokeinterface Ze : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   357: aload_0
    //   358: aload #4
    //   360: <illegal opcode> run : (Lburp/Zb5b;Lburp/Zl04;)Ljava/lang/Runnable;
    //   365: ldc2_w 5
    //   368: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   371: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   376: pop
    //   377: aload #9
    //   379: athrow
    //   380: return
    // Exception table:
    //   from	to	target	type
    //   94	224	256	java/lang/InterruptedException
    //   94	224	304	java/lang/Exception
    //   94	224	346	finally
    //   103	184	197	java/lang/Throwable
    //   204	209	212	java/lang/Throwable
    //   256	272	346	finally
    //   304	314	346	finally
    //   346	348	346	finally
  }
  
  private void ZU() {
    this.Zx.ZU();
  }
  
  private void ZM() {
    ZA();
  }
  
  private void ZF() {
    if (!this.Zq) {
      ZU((Class)Zs7s.class);
      this.Zq = true;
    } 
  }
  
  private void Zf() {
    if (this.Zq) {
      ZU((Class)Zko4.class);
      this.Zq = false;
    } 
  }
  
  private void lambda$replayLogin$13(Zl04 paramZl04) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zb5b;Lburp/Zl04;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$replayLogin$12(Zl04 paramZl04) {
    paramZl04.dispose();
    this.ZL.setEnabled(true);
  }
  
  private static void lambda$replayLogin$11(Zskh paramZskh, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZskh::lambda$replayLogin$10);
  }
  
  private static void lambda$replayLogin$10(Zskh paramZskh, Zrtf paramZrtf) {
    paramZrtf.ZK().ifPresent(paramZskh::lambda$replayLogin$9);
  }
  
  private static void lambda$replayLogin$9(Zskh paramZskh, String paramString) {
    paramZskh.Zl(Zkqn.ERROR, paramString);
  }
  
  private static void lambda$replayLogin$8(Consumer paramConsumer, Zl04 paramZl04, Zm99 paramZm99, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_3
    //   1: aload_0
    //   2: aload_1
    //   3: aload_2
    //   4: <illegal opcode> accept : (Ljava/util/function/Consumer;Lburp/Zl04;Lburp/Zm99;)Ljava/util/function/Consumer;
    //   9: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   12: return
  }
  
  private static void lambda$replayLogin$7(Consumer<Zct> paramConsumer, Zl04 paramZl04, Zm99 paramZm99, Zlea paramZlea) {
    // Byte code:
    //   0: aload_0
    //   1: aload_3
    //   2: invokevirtual ZJ5 : ()Lnet/portswigger/browser/Zct;
    //   5: invokeinterface accept : (Ljava/lang/Object;)V
    //   10: new javax/swing/ImageIcon
    //   13: dup
    //   14: aload_3
    //   15: invokevirtual ZJ5 : ()Lnet/portswigger/browser/Zct;
    //   18: aload_1
    //   19: invokevirtual getWidth : ()I
    //   22: aload_1
    //   23: invokevirtual getHeight : ()I
    //   26: invokevirtual Zn : (II)Ljava/awt/Image;
    //   29: invokespecial <init> : (Ljava/awt/Image;)V
    //   32: astore #4
    //   34: aload_2
    //   35: aload #4
    //   37: <illegal opcode> run : (Lburp/Zm99;Ljavax/swing/ImageIcon;)Ljava/lang/Runnable;
    //   42: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   45: return
  }
  
  private static void lambda$replayLogin$6(Zm99 paramZm99, ImageIcon paramImageIcon) {
    paramZm99.setIcon(paramImageIcon);
  }
  
  private static void lambda$replayLogin$5(Zct paramZct) {}
  
  private void lambda$createFutureBrowserDriver$4(Ztos<Zt35> paramZtos, Zz62 paramZz62) {
    try {
      Zl11 zl11 = this.ZF.Zk(Zeew.SCANNER, this.Zi, this.ZJ.ZW(Zeew.SCANNER));
      Zr69 zr69 = Zkmg.ZL();
      Zzzx zzzx = new Zzzx(zl11, this.Zi, this.Zz, zr69, new Ztos<>(Zt16.Zs()), this.Zy);
      Zmle zmle = this.ZI.Zb(zr69, paramZtos, zzzx, this.Zr, this.Zz, new Zel_());
      paramZz62.complete(zmle);
    } catch (Ztz ztz) {
      Zah.Zl((Throwable)ztz, Zk_.UNEXPECTED);
      paramZz62.completeExceptionally((Throwable)ztz);
    } 
  }
  
  private void lambda$btnReplayActionPerformed$3(Zko4 paramZko4) {
    try {
      Ztos<Zt3y> ztos = new Ztos<>(Zt35.ZP());
      Zz62 zz62 = ZC((Ztos)ztos);
      Zr(paramZko4, zz62, (Zlli)ztos);
    } catch (Ztz ztz) {
      Zah.Zl((Throwable)ztz, Zk_.UNEXPECTED);
    } 
  }
  
  private static void lambda$showRecordedLoginPicker$2(Zrvl paramZrvl, ActionEvent paramActionEvent) {
    paramZrvl.dispose();
  }
  
  private void lambda$showRecordedLoginPicker$1(Zrvl paramZrvl, ActionEvent paramActionEvent) {
    String[] arrayOfString = ZX();
    paramZrvl.dispose();
    if (paramZrvl.Zh()) {
      Zg();
      if (arrayOfString != null) {
        this.Zx.Zl(this);
        return;
      } 
      return;
    } 
    this.Zx.Zl(this);
  }
  
  private static boolean lambda$setCredentialsList$0(Zs3n paramZs3n) {
    return paramZs3n instanceof Zs7s;
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zp : ([Ljava/lang/String;)V
    //   13: ldc '/<íS[#ßuuF[ksæÆd.µµR\\b;Û-ù5".¢ÕòAEý@^x|Ú)-5ñ4Ö½ÎÔ½jémö­TæI3òZÝ{È zg+AFóå<k@Ãì4ÖB¿.¨É~ú!j`Í®)w+Áó4_pu-½x5¾[-WpÃê¤Ê 7i¦»Ö¥ì$ä é(5Ð±óõläA Ý2uªÂþ× ÆãG>? Iäe×(bú* ÜnX#>Ð\\fiK°»®ÆìH\\nK®|1Ãmü5`ÀSÊ¶ÅV~çÏ¢\\r ^bNê«Ýº\\\rP\\f-N\òTD$lÈÆ@LnÖUqöú?uóNÕIrÈ8­xÒ0êiÍüV3y\\bèD³õ4iAÌ<ÒÂ>¬I<â'gÞëíåÂÉÐÖMJQ`ï,ìD¤¶C©ê(ïèÝ\\f¹ZÇ\ÆC¥uieØì&ÕenJOâÃãÀ»e4HA¯Ü»É@¯(ßó\\fõ¼[¼O²âùo>I¼@øeB­¿ÍMNþµ#\\tÆå§ÚIÃM:Ü:(bÙw¬¬BRæ®K-ú3ú³±C³4¢È"Õ#­éê§Xr¤WÈsPfÔ&ÒÏj5ß2Ò'Ië¾?  ®àW·r\\t(~×f¡"ðí{½6Á]þ&²¢i;L ï© °çm N¹%ÝÂÿ^¤8þÜ$5c[\¸®;z-ô\/"û4Ù¼#ÇWir¿Jy£\\r©§¯Î¯nHöâ$ÿ´>lÉã&&\\fxaHzÞ8øó0!§Ñ×Ðø,Múh(GYµ³ÃQ2*ªyn¸îÜMâVÚ¦Öó76T7~Ó½¼ôµ/8æR*¢åß:¬ÙK7CÇÖ2üZaà³``»Ê¯ú÷ñ1±\\rD'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: iconst_4
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #55
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
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
    //   71: ldc 'ê\\nsµAåy%'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: iconst_4
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #55
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
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
    //   131: putstatic burp/Zb5b.a : [Ljava/lang/String;
    //   134: bipush #28
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zb5b.c : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 263
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #79
    //   218: goto -> 247
    //   221: bipush #10
    //   223: goto -> 247
    //   226: bipush #127
    //   228: goto -> 247
    //   231: bipush #102
    //   233: goto -> 247
    //   236: bipush #112
    //   238: goto -> 247
    //   241: bipush #28
    //   243: goto -> 247
    //   246: iconst_5
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 168
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 164
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 43, 0 -> 101
    //   304: new burp/Zze2
    //   307: dup
    //   308: sipush #-1158
    //   311: sipush #6260
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: sipush #-1162
    //   320: sipush #-24976
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   329: putstatic burp/Zb5b.Za : Lburp/Zze2;
    //   332: return
  }
  
  public static void Zp(String[] paramArrayOfString) {
    ZM = paramArrayOfString;
  }
  
  public static String[] ZX() {
    return ZM;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFB72) & 0xFFFF;
    if (c[i] == null) {
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
      char c = '¨';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */