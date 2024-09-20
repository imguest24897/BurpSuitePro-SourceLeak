package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class Zbea extends Zbv5 implements Zsnh {
  private final Zkmo Zz;
  
  private boolean Zg;
  
  private boolean Zd;
  
  private boolean ZW;
  
  private boolean Z_;
  
  private boolean Zy;
  
  private boolean ZP;
  
  private Zm99 Zq;
  
  private Zm99 Zi;
  
  private Zm99 Zt;
  
  private Zm99 ZL;
  
  private Zm99 Za;
  
  private Zm99 ZC;
  
  private Zm99 ZX;
  
  private Zm99 Zv;
  
  private Zm99 Zs;
  
  private Zm99 Zh;
  
  private Zm99 Zu;
  
  private Zm99 Zb;
  
  private Zbqc ZQ;
  
  private Zbqc Zk;
  
  private Zzdy ZM;
  
  private Zzdy Zc;
  
  private Zl8w ZS;
  
  private Zm9v ZN;
  
  private Zm9v ZT;
  
  private Zm9v ZA;
  
  private Zm9v Zr;
  
  private Zm9v ZH;
  
  private Zm9v ZJ;
  
  private Zbkc Zw;
  
  private Zgfo Zx;
  
  private Zgfo ZO;
  
  private Zgfo Zl;
  
  private Zgfo ZB;
  
  private Zgfo ZV;
  
  private Zgfo ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbea(Zkmo paramZkmo) {
    this.Zz = paramZkmo;
    String[] arrayOfString = Zber.Za9();
    Zt();
    Objects.requireNonNull(paramZkmo);
    this.ZE.Zs(paramZkmo::Zkx, this::Zu);
    Objects.requireNonNull(paramZkmo);
    this.Zx.ZO(paramZkmo::Zk7, this::Zi, 1, 2147483647, 2147483647, new int[] { 0 });
    Objects.requireNonNull(paramZkmo);
    this.Zl.ZO(paramZkmo::ZkK, this::Zn, 1, 2147483647, 2147483647, new int[] { 0 });
    Objects.requireNonNull(paramZkmo);
    this.ZO.ZO(paramZkmo::ZkX, this::Zo, 1, 2147483647, 2147483647, new int[] { 0 });
    Objects.requireNonNull(paramZkmo);
    this.ZV.ZO(paramZkmo::Zkj, this::Zm, 1, 100, 100, new int[] { 0 });
    Objects.requireNonNull(paramZkmo);
    this.ZB.Zu(paramZkmo::Zk9, this::ZF, 0, 15);
    this.Zq.setVisible(false);
    this.Zs.setVisible(false);
    this.Zi.setVisible(false);
    this.ZE.setVisible(false);
    this.ZM.setVisible(false);
    this.Zc.setVisible(false);
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public String ZZ() {
    return this.Zw.Zr();
  }
  
  public Zk97 ZR() {
    return Zk97.DESKTOP_SCANNING_AUDIT_OPTIONS_HANDLING_APPLICATION_ERRORS_DURING_AUDIT;
  }
  
  public String Zq() {
    return a(-29274, 30498);
  }
  
  public Zmf_ Zn() {
    Zzkm zzkm = new Zzkm();
    this.Zz.Zl(zzkm);
    return zzkm.ZV(new String[] { a(-29278, 22615) });
  }
  
  public String ZE() {
    return a(-29273, -31991);
  }
  
  public void Zt2() {
    this.ZE.ZM(this.Zz.ZYn());
    this.Zx.ZM(this.Zz.ZYz());
    this.Zl.ZM(this.Zz.ZY2());
    this.Zc.setSelected(this.Zz.ZY5());
    this.ZM.setSelected(this.Zz.ZYH());
    this.ZO.ZM(this.Zz.ZYX());
    this.ZV.ZM(this.Zz.ZYe());
    this.ZB.ZM(this.Zz.ZY1());
    this.ZJ.setVisible(false);
    this.ZN.setVisible(false);
    this.ZA.setVisible(false);
    this.ZT.setVisible(false);
    this.ZH.setVisible(false);
    String[] arrayOfString = Zber.Za9();
    this.Zr.setVisible(false);
    if (Zbqc.Zwu() == null)
      Zber.Zx(new String[3]); 
  }
  
  public String Zd() {
    return this.Zg ? a(-29262, 20638) : (this.Zd ? a(-29277, 11504) : (this.ZW ? a(-29254, 3210) : (this.Z_ ? a(-29253, -14664) : (this.Zy ? a(-29252, -10465) : (this.ZP ? a(-29272, -12934) : "")))));
  }
  
  private void Zu(boolean paramBoolean) {
    this.Zg = !paramBoolean;
    this.ZJ.setVisible(!paramBoolean);
  }
  
  private void Zi(boolean paramBoolean) {
    this.Zd = !paramBoolean;
    this.ZN.setVisible(!paramBoolean);
  }
  
  private void Zn(boolean paramBoolean) {
    this.ZW = !paramBoolean;
    this.ZA.setVisible(!paramBoolean);
  }
  
  private void Zo(boolean paramBoolean) {
    this.Z_ = !paramBoolean;
    this.ZT.setVisible(!paramBoolean);
  }
  
  private void Zm(boolean paramBoolean) {
    this.Zy = !paramBoolean;
    this.ZH.setVisible(!paramBoolean);
  }
  
  private void ZF(boolean paramBoolean) {
    this.ZP = !paramBoolean;
    this.Zr.setVisible(!paramBoolean);
  }
  
  private void Zt() {
    this.Zw = new Zbkc();
    this.ZS = new Zl8w();
    this.ZQ = new Zbqc();
    this.Zq = new Zm99();
    this.ZE = new Zgfo();
    this.Zi = new Zm99();
    this.ZJ = new Zm9v();
    this.Za = new Zm99();
    this.Zx = new Zgfo();
    this.ZC = new Zm99();
    this.ZN = new Zm9v();
    this.ZX = new Zm99();
    this.Zl = new Zgfo();
    this.Zv = new Zm99();
    this.ZA = new Zm9v();
    this.Zs = new Zm99();
    this.Zc = new Zzdy();
    this.ZM = new Zzdy();
    this.Zh = new Zm99();
    this.ZO = new Zgfo();
    this.Zu = new Zm99();
    this.ZT = new Zm9v();
    this.ZV = new Zgfo();
    this.Zb = new Zm99();
    this.ZH = new Zm9v();
    this.Zk = new Zbqc();
    this.Zt = new Zm99();
    this.ZB = new Zgfo();
    this.ZL = new Zm99();
    this.Zr = new Zm9v();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zw.Zx(a(-29280, 6777));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 21;
    add(this.Zw, gridBagConstraints);
    this.ZS.setText(a(-29269, -12712));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZS, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZQ.setLayout(gridBagLayout2);
    this.Zq.setText(a(-29258, -11120));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZQ.add(this.Zq, gridBagConstraints);
    this.ZE.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZQ.add(this.ZE, gridBagConstraints);
    this.Zi.setText(a(-29260, 14857));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZQ.add(this.Zi, gridBagConstraints);
    this.ZJ.setText(a(-29276, -10865));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.ZQ.add(this.ZJ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZQ, gridBagConstraints);
    this.Za.setText(a(-29279, -28226));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Za, gridBagConstraints);
    this.Zx.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zx, gridBagConstraints);
    this.ZC.setText(a(-29275, -23227));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.ZC, gridBagConstraints);
    this.ZN.setText(a(-29250, 15926));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZN, gridBagConstraints);
    this.ZX.setText(a(-29261, 3655));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZX, gridBagConstraints);
    this.Zl.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.Zl, gridBagConstraints);
    this.Zv.setText(a(-29270, 19913));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 1280;
    add(this.Zv, gridBagConstraints);
    this.ZA.setText(a(-29250, 15926));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 12;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZA, gridBagConstraints);
    this.Zs.setText(a(-29264, -9205));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 10, 0);
    add(this.Zs, gridBagConstraints);
    this.Zc.setText(a(-29271, 3297));
    this.Zc.addActionListener(new Zr5z(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.anchor = 23;
    add(this.Zc, gridBagConstraints);
    this.ZM.setText(a(-29259, 20638));
    this.ZM.addActionListener(new Zx0a(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.anchor = 23;
    add(this.ZM, gridBagConstraints);
    this.Zh.setText(a(-29256, 10336));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 10, 0);
    add(this.Zh, gridBagConstraints);
    this.ZO.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    add(this.ZO, gridBagConstraints);
    this.Zu.setText(a(-29257, 30455));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zu, gridBagConstraints);
    this.ZT.setText(a(-29250, 15926));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZT, gridBagConstraints);
    this.ZV.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 1280;
    add(this.ZV, gridBagConstraints);
    this.Zb.setText(a(-29263, -11382));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 1280;
    add(this.Zb, gridBagConstraints);
    this.ZH.setText(a(-29250, 15926));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZH, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout3.rowHeights = new int[] { 0 };
    this.Zk.setLayout(gridBagLayout3);
    this.Zt.setText(a(-29251, 12974));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zk.add(this.Zt, gridBagConstraints);
    this.ZB.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zk.add(this.ZB, gridBagConstraints);
    this.ZL.setText(a(-29255, 19897));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zk.add(this.ZL, gridBagConstraints);
    this.Zr.setText(a(-29249, -3460));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.Zk.add(this.Zr, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zk, gridBagConstraints);
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    this.Zz.ZTl(this.Zc.isSelected());
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    this.Zz.ZTn(this.ZM.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'õgÃe\\r]OVÃÉb¸)K3Sèw/çGx%ÃLPÚß¬Ô§È¬ôTFôkØ'Õ¬9®9l Yä w[¸÷>>Ï°cê´ê6ÿô­ÆXôÓÆ ¹/Ún±®£iÓûWKÂ²çtTä\\rËÉÉÐàvKîúï÷OöèúfËä*I²dÔ¿G|ØkÚ51ãJ\\nõ±-.Æö@&ÖêÂãR%®0Û._ñb-"bÿ@õzÐÎ¢×¯q1¯µì·2]5¨rhÇxÞóÅvHi,¾±þß·²îÝ|®x¿¬}Q¡HQ¤I¿vá\\tß øÅ-Õ.á^0]Öë¯[\\tuÀtº¾\\t9X'TÖÑ%þª½vï1sÄt>çÙ\\b k6ÕþLül I"ÑjÌ©jE+3ÝËVW|Æ×§øýYk¢V{§þÆãa:f´½Ü¢Ñi\\r$m\\rØçîó?çað>²Ôª¬¾\\nNÇKf\\nCGEÇeæ ¦(WÃñ\\f~:J_N'ªîñææwòfÞï'n\\n÷#íú ¶#¸%µk[æ¼»AÖîyåú8»¯+ .¢ÖÊÇ©ÓA'¡×¤M¸vÙ©¹ñ£ÍI"eà®0·huû÷1csçWÚE#áJlà¹5ÞÎÁÙ.Ä(^=©(=Ek Ýá¥ÂyÕ¿(Ãp<léË²¬î³H4é9>3Ú¨T6¼nìÈ-/ÃE25o¯úßÝ?z\½{E#\\fJ3)K90Wºý}a>²jð7F^ùÍó5 æU3cþ=è'¦ºS¡3µþ`h]XQÎ÷O\\rïË_íõDdSÙGGé=ÚÍbd1YÑÎS¥¯£®ToÑâÍüÏçyÖ5Ó\\r ö®í`ÁÉ/T0ÂõHJB³L¥· AëÇob5øCZaÅ>²}1Óã{©_(I6dgåÔïBIhu@¡3(HÛÛdIÍíÕuW´Ëê0)d«þ<±a±¯üÆÌ<|å¨# =ÕMïî_Ý¾¯Ö×rÎâÛ&ûPD^Xþ*v×²ÐÉÌ\£ÑÖÅâïëºIfð`½KÂ&K~BÔñ°\\n6n '"O².Áàp2Æã2¸núYtÑhýx Ã\\t±q)®B{¥©äkÆ~ßõèªüdÐ.î\\r¸Æä ²ç¦×àbòw© íüóyAòi@L'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #20
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #80
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
    //   68: ldc 'ªCl¥¼Ö/@nÉÚSüî¶Ð-Ê\\bà¡daêl\¥_ºÌÛúÖXjs&§4tOÑ,íÏÏ|/9@0%,:+É"Uî~¬a¸öá[EÆÕr&õvØ{tö'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #48
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #57
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
    //   129: putstatic burp/Zbea.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbea.b : [Ljava/lang/String;
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
    //   212: bipush #99
    //   214: goto -> 244
    //   217: bipush #24
    //   219: goto -> 244
    //   222: bipush #93
    //   224: goto -> 244
    //   227: bipush #18
    //   229: goto -> 244
    //   232: bipush #80
    //   234: goto -> 244
    //   237: bipush #26
    //   239: goto -> 244
    //   242: bipush #41
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
    int i = (paramInt1 ^ 0xFFFF8DB2) & 0xFFFF;
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
      byte b1 = 20;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbea.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */