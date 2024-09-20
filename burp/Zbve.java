package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SwingUtilities;
import javax.swing.table.TableRowSorter;

public class Zbve extends Zbqc {
  private final Zgb6 Zx;
  
  private final Ztwv Zz;
  
  private final Zkc0 ZB;
  
  private final Zemk ZN;
  
  private final Ztnq ZS;
  
  private final ListSelectionModel ZV;
  
  private final Zzln Za;
  
  private final Zed0 Zf;
  
  private final Zbva ZJ;
  
  private final TableRowSorter<Ztnq> Zc;
  
  private Zl09 ZQ;
  
  private int Zq = 0;
  
  private String ZK;
  
  private Future<?> ZF;
  
  private Zbqc Zl;
  
  private Ze01 Zu;
  
  private Ze01 Zy;
  
  private Ze01 Zv;
  
  private Box.Filler ZZ;
  
  private Ze01 ZR;
  
  private Zbqc ZO;
  
  private Zm99 Zb;
  
  private Ze0q ZD;
  
  private Ze01 ZT;
  
  private Zbc9 Zg;
  
  private Zbws Zn;
  
  private Zgf8 Zi;
  
  private Zmyz Zh;
  
  private JScrollPane ZI;
  
  private static String ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbve(Zgb6 paramZgb6, Ztwv paramZtwv, Zkc0 paramZkc0, Zemk paramZemk, Zr_r paramZr_r, Ztq1 paramZtq1, Zed0 paramZed0) {
    this.Zx = paramZgb6;
    this.Zz = paramZtwv;
    this.ZB = paramZkc0;
    this.ZN = paramZemk;
    this.ZS = new Ztnq(paramZemk);
    this.Zf = paramZed0;
    Zb();
    this.Zh.setDividerSize(1);
    Objects.requireNonNull(this.Zn);
    this.Za = new Zzln(paramZtwv, paramZtq1, paramZemk, paramZr_r, paramZed0, this::ZT, this::ZW, this::ZQ, this.Zn::convertRowIndexToModel, this, new Zg0t(this));
    this.Zn.ZL(this.ZS);
    this.Zc = new TableRowSorter<>(this.ZS);
    this.Zn.setRowSorter((RowSorter)this.Zc);
    this.ZD.setIcon(Ze3m.ZC(Zeuf.ADD_CIRCLE, Zlkk.PRIMARY_BUTTON_FOREGROUND).ZU(Zmcx.LINE_SIZE).Z_());
    this.ZD.setName(a(-6748, 26505));
    this.Zy.setIcon(Ze3m.ZC(Zeuf.EDIT, Zlkk.FOREGROUND).ZU(Zmcx.SMALL_LINE_SIZE).Z_());
    this.Zy.setEnabled(false);
    this.Zy.setName(a(-6750, 25582));
    this.Zy.setToolTipText(a(-6742, 10552));
    this.Zy.setMargin(new Insets(5, 5, 4, 5));
    this.Zu.setIcon(Ze3m.ZC(Zeuf.COPY, Zlkk.FOREGROUND).ZU(Zmcx.SMALL_LINE_SIZE).Z_());
    this.Zu.setEnabled(false);
    this.Zu.setToolTipText(a(-6744, 9748));
    this.Zu.setMargin(new Insets(5, 5, 4, 5));
    this.ZT.setIcon(Ze3m.ZC(Zeuf.DELETE, Zlkk.FOREGROUND).ZU(Zmcx.SMALL_LINE_SIZE).Z_());
    this.ZT.setEnabled(false);
    this.ZT.setToolTipText(a(-6749, -31216));
    this.ZT.setMargin(new Insets(5, 5, 4, 5));
    this.Zv.setIcon(Ze3m.ZC(Zeuf.GROUP, Zlkk.FOREGROUND).ZU(Zmcx.SMALL_LINE_SIZE).Z_());
    this.Zv.setEnabled(false);
    this.Zv.setToolTipText(a(-6745, -6051));
    this.Zv.setMargin(new Insets(5, 5, 4, 5));
    this.Zb.setVisible(false);
    this.Zb.setIcon(new Zkaz(Ze3m.ZC(Zeuf.SPINNER, Zlkk.FOREGROUND).ZU(Zmcx.LINE_SIZE).Z_()));
    this.Zi.Zv(this::ZH, 20);
    this.Zi.setName(a(-6739, -6983));
    this.Zh.Za(83);
    String str = ZH();
    this.ZJ = new Zbva(paramZgb6, paramZed0, paramZkc0);
    Zt2_ zt2_ = new Zt2_(this.Za);
    Objects.requireNonNull(this.Za);
    Zbi zbi = new Zbi(this.Za::Zu, zt2_, this::ZT);
    this.Zn.Zk(zbi);
    this.ZV = this.Zn.getSelectionModel();
    this.ZV.addListSelectionListener(new Zb3o(this, this.ZV, this.ZJ, this.Zg, this.Zu, this.ZT, this.Zy, this.Zv, paramZemk, this::lambda$new$0));
    ZG(paramZemk);
    SwingUtilities.invokeLater(this::lambda$new$1);
    if (str != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private void ZH(String paramString) {
    Zy();
    this.ZK = (paramString == null) ? "" : paramString;
    Zz();
  }
  
  private void Zy() {
    if (this.ZF != null)
      this.ZF.cancel(true); 
  }
  
  private void Zz() {
    this.ZF = this.Zz.Ze().schedule(new Zri(this::Zw), 500L, TimeUnit.MILLISECONDS);
  }
  
  private void Zw() {
    String str = ZH();
    Runnable runnable = this::lambda$refreshSearch$2;
    if (SwingUtilities.isEventDispatchThread()) {
      runnable.run();
      if (str != null) {
        SwingUtilities.invokeLater(runnable);
        return;
      } 
      return;
    } 
    SwingUtilities.invokeLater(runnable);
  }
  
  private List<Zryx> ZT() {
    int[] arrayOfInt = this.Zn.getSelectedRows();
    return Arrays.stream(arrayOfInt).<Zryx>mapToObj(this::ZZ).filter(Objects::nonNull).toList();
  }
  
  private void ZG(Zemk paramZemk) {
    Zm2b zm2b = new Zm2b(this::Zo);
    Objects.requireNonNull(paramZemk);
    this.Zn.setDefaultRenderer(Boolean.class, new Zbgs(this::ZZ, paramZemk::Zw));
    this.Zn.getColumnModel().getColumn(Zt5z.TAGS.ZM).setCellRenderer(zm2b);
  }
  
  private Zryx ZZ(int paramInt) {
    int i = this.Zn.convertRowIndexToModel(paramInt);
    return this.ZN.Zm(i);
  }
  
  private String Zo(int paramInt) {
    return ZZ(paramInt).ZQ();
  }
  
  private void Zb(Zbqc paramZbqc) {
    this.Zg.add(Zltn.ZK(Zgzq.BCHECK_EMPTY_PANEL_ICON, a(-6735, 8851)).Za(a(-6727, -20549)).ZC(54).ZN(Zlar.BCHECK_LEARN_MORE_INFO).ZE(a(-6741, 27285)).Zi());
    this.Zg.add(paramZbqc);
    this.Zg.Zv(0);
  }
  
  private void ZW(List<Zmz9> paramList) {
    paramList.forEach(this::lambda$dataChanged$3);
    ZQ();
  }
  
  private void ZQ() {
    String str = ZH();
    Runnable runnable = this::lambda$refreshUserInterface$4;
    if (SwingUtilities.isEventDispatchThread()) {
      runnable.run();
      if (str != null) {
        SwingUtilities.invokeLater(runnable);
        return;
      } 
      return;
    } 
    SwingUtilities.invokeLater(runnable);
  }
  
  private void Zb() {
    this.Zh = new Zmyz();
    this.ZO = new Zbqc();
    this.Zl = new Zbqc();
    this.ZD = new Ze0q();
    this.ZR = new Ze01();
    this.Zv = new Ze01();
    this.Zy = new Ze01();
    this.ZT = new Ze01();
    this.Zu = new Ze01();
    this.ZZ = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    this.Zb = new Zm99();
    this.Zi = new Zgf8();
    this.ZI = new JScrollPane();
    this.Zn = new Zbws();
    this.Zg = new Zbc9();
    setLayout(new BorderLayout());
    this.Zh.setResizeWeight(0.5D);
    this.ZO.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 8));
    this.ZO.setLayout(new BorderLayout());
    this.Zl.setBorder(BorderFactory.createEmptyBorder(2, 0, 10, 0));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 
        0, 10, 0, 10, 0, 10, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.Zl.setLayout(gridBagLayout);
    this.ZD.setText(a(-6738, -1806));
    this.ZD.addActionListener(new Zzad(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    this.Zl.add(this.ZD, gridBagConstraints);
    this.ZR.setText(a(-6729, 31504));
    this.ZR.setName(a(-6752, -32036));
    this.ZR.addActionListener(new Zzui(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.ZR, gridBagConstraints);
    this.Zv.setName(a(-6743, 4151));
    this.Zv.addActionListener(new Zt2g(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.Zv, gridBagConstraints);
    this.Zy.addActionListener(new Zka7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.Zy, gridBagConstraints);
    this.ZT.setName(a(-6734, -5907));
    this.ZT.addActionListener(new Zkv_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.ZT, gridBagConstraints);
    this.Zu.setName(a(-6747, 29156));
    this.Zu.addActionListener(new Zm8p(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.Zu, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 12;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    this.Zl.add(this.ZZ, gridBagConstraints);
    this.Zb.setText(a(-6726, -14579));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 14;
    gridBagConstraints.gridy = 0;
    this.Zl.add(this.Zb, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 16;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    this.Zl.add(this.Zi, gridBagConstraints);
    this.ZO.add(this.Zl, a(-6731, 23483));
    this.Zn.ZL(this.ZS);
    this.Zn.setToolTipText("");
    this.Zn.setName(a(-6746, 11189));
    this.ZI.setViewportView(this.Zn);
    this.ZO.add(this.ZI, a(-6730, 15114));
    this.Zh.setLeftComponent(this.ZO);
    this.Zh.setRightComponent(this.Zg);
    add(this.Zh, a(-6728, 16099));
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    this.Za.Zp();
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    this.Za.Zn();
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    this.Za.ZJ();
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    Component component = (Component)paramActionEvent.getSource();
    Point point = this.ZD.getLocation();
    int i = point.x;
    int j = point.y + (this.ZD.getSize()).height;
    Zkj9 zkj9 = Zg();
    zkj9.show(component, i, j);
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    this.Za.Zk();
  }
  
  private void Za(ActionEvent paramActionEvent) {
    this.Za.ZK();
  }
  
  private Zkj9 Zg() {
    Zkj9 zkj9 = new Zkj9();
    zkj9.ZE(Zlkk.TABLE_BACKGROUND);
    zkj9.setName(a(-6737, 29266));
    Zepe zepe1 = new Zepe(a(-6733, -27464));
    zepe1.setName(a(-6740, -17909));
    zepe1.addActionListener(this::lambda$buildCmdNewPopoutMenu$5);
    Zepe zepe2 = new Zepe(a(-6732, -31462));
    zepe2.setName(a(-6751, -9168));
    zepe2.addActionListener(this::lambda$buildCmdNewPopoutMenu$6);
    zkj9.add(zepe1);
    zkj9.addSeparator();
    zkj9.add(zepe2);
    return zkj9;
  }
  
  private void ZL() {
    if (this.Zf.Zc(this)) {
      if (this.ZQ == null)
        this.ZQ = new Zl09(Zt2m.ZF(this), this.Zx, this.ZB, this.Zf); 
      this.ZQ.setVisible(true);
    } 
  }
  
  private void lambda$buildCmdNewPopoutMenu$6(ActionEvent paramActionEvent) {
    ZL();
  }
  
  private void lambda$buildCmdNewPopoutMenu$5(ActionEvent paramActionEvent) {
    this.Zf.Zk(Zt2m.ZF(this));
  }
  
  private void lambda$refreshUserInterface$4() {
    boolean bool = this.Za.Ze();
    this.Zb.setVisible(bool);
    this.ZR.setEnabled(!bool);
    this.Zy.setEnabled((!bool && !this.ZV.isSelectionEmpty()));
    this.Zu.setEnabled((!bool && !this.ZV.isSelectionEmpty()));
    this.Zv.setEnabled((!bool && !this.ZV.isSelectionEmpty()));
    this.ZT.setEnabled((!bool && !this.ZV.isSelectionEmpty()));
    if (this.Zq > 0) {
      Zryx zryx = this.ZN.Zd(this.Zq);
      if (zryx != null)
        this.ZJ.Zt(zryx, true); 
    } 
  }
  
  private void lambda$dataChanged$3(Zmz9 paramZmz9) {
    // Byte code:
    //   0: invokestatic ZH : ()Ljava/lang/String;
    //   3: astore_2
    //   4: getstatic burp/Zqh.Zi : [I
    //   7: aload_1
    //   8: invokevirtual ZG9 : ()Lburp/Zkgw;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 93, 1 -> 40, 2 -> 59, 3 -> 78
    //   40: aload_0
    //   41: getfield ZS : Lburp/Ztnq;
    //   44: aload_1
    //   45: invokevirtual ZGl : ()I
    //   48: aload_1
    //   49: invokevirtual ZGQ : ()I
    //   52: invokevirtual fireTableRowsInserted : (II)V
    //   55: aload_2
    //   56: ifnull -> 93
    //   59: aload_0
    //   60: getfield ZS : Lburp/Ztnq;
    //   63: aload_1
    //   64: invokevirtual ZGl : ()I
    //   67: aload_1
    //   68: invokevirtual ZGQ : ()I
    //   71: invokevirtual fireTableRowsUpdated : (II)V
    //   74: aload_2
    //   75: ifnull -> 93
    //   78: aload_0
    //   79: getfield ZS : Lburp/Ztnq;
    //   82: aload_1
    //   83: invokevirtual ZGl : ()I
    //   86: aload_1
    //   87: invokevirtual ZGQ : ()I
    //   90: invokevirtual fireTableRowsDeleted : (II)V
    //   93: return
  }
  
  private void lambda$refreshSearch$2() {
    RowFilter<?, ?> rowFilter = RowFilter.regexFilter(a(-6736, -21977) + a(-6736, -21977), new int[] { 1, 2, 3 });
    this.Zc.setRowFilter((RowFilter)rowFilter);
  }
  
  private void lambda$new$1() {
    Zb(this.ZJ);
  }
  
  private void lambda$new$0(int paramInt) {
    this.Zq = paramInt;
  }
  
  public static void Zd(String paramString) {
    ZM = paramString;
  }
  
  public static String ZH() {
    return ZM;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'Lô¦D#Î©¾Óa!w0³x£Eú(Û\\tG¸Ôò\\fV \\b]Ã\ñ°¯!ËLü\\tÙ¦ÀA'Ä+Ã{À&\\bi×øs\\f|§f­³\ü¯&?Ígÿk3ÁÅá¸ö»6ã)Ì Ñ\\t´¡Ð³÷>hi«]zÞÌXÌ)Ì×Õ)\\tÙOl¾*Cr­Îó^ðÃøÎDçÛ&¯vÔËD÷\\b¸ìÝ®V<Ín8!EP¥t½ñõÂùîx¡dÖÄ5OÕ"Ô5fi âKÜ×­òëE6DH\\bOÝ:iøÙm,í\\t¦*P©<:Vñ³BY>{hç'X°{îv¯\\néRxà«ZòÛÝß;½à[RÃ$$#[i8_Z²ëõØ\\r1ÉÁv4;Sjqã`v°Ag üÜÚ×'|³\\tÛ'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #18
    //   21: istore_1
    //   22: invokestatic Zd : (Ljava/lang/String;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #106
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
    //   72: ldc 'õ»çÃP*C¨µ9êâþ!¼^ÍzldK8+6×³2ãåEÕÓ½W#1 CsyT­¹z:0rSs¥'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #53
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #112
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
    //   133: putstatic burp/Zbve.a : [Ljava/lang/String;
    //   136: bipush #27
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zbve.b : [Ljava/lang/String;
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
    //   178: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 230, 4 -> 235, 5 -> 240
    //   216: bipush #103
    //   218: goto -> 247
    //   221: bipush #52
    //   223: goto -> 247
    //   226: iconst_3
    //   227: goto -> 247
    //   230: bipush #75
    //   232: goto -> 247
    //   235: bipush #7
    //   237: goto -> 247
    //   240: bipush #107
    //   242: goto -> 247
    //   245: bipush #118
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
    int i = (paramInt1 ^ 0xFFFFE5A0) & 0xFFFF;
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
      char c = 'æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbve.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */