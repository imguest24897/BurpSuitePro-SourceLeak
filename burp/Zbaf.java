package burp;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;

public class Zbaf extends Zbv5 implements Zeq {
  private final Zt4u ZR;
  
  private final Zm5v Zj;
  
  private final Zgb6 ZA;
  
  private final Zbnt ZO;
  
  private final Zb0h Zt;
  
  private final Zqe Zq;
  
  private final Ztwv Z_;
  
  private final Zr_4 Zf;
  
  private final Zr1m ZH;
  
  private final Zey9 Za;
  
  private final List<Zke9> ZC;
  
  private final Zt_a ZS;
  
  private final Zbws ZV;
  
  private Zke9 Zd;
  
  private Zm2o ZN;
  
  private Zm2o Zy;
  
  private Zl8w Zb;
  
  private Zl8w Zk;
  
  private Zbkc ZW;
  
  private Zbkc ZX;
  
  private Zmyw ZT;
  
  private ButtonGroup ZY;
  
  private Ze01 Zh;
  
  private Ze01 Zc;
  
  private Ze01 Zz;
  
  private Ze0q ZB;
  
  private Zedd Zl;
  
  private Zedd Zs;
  
  private Box.Filler Zx;
  
  private JSeparator Zw;
  
  private Zg85 Zv;
  
  private Zmg2 ZI;
  
  private Zmg2 ZL;
  
  private Zmg2 ZG;
  
  private Zbup ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbaf(Zt4u paramZt4u, Zm5v paramZm5v, Zgb6 paramZgb6, Zbnt paramZbnt, Zb0h paramZb0h, Zqe paramZqe, Ztwv paramZtwv, Zr_4 paramZr_4, Zr1m paramZr1m, Zey9 paramZey9) {
    this.ZR = paramZt4u;
    this.Zj = paramZm5v;
    this.ZA = paramZgb6;
    this.ZO = paramZbnt;
    this.Zt = paramZb0h;
    this.Zq = paramZqe;
    this.Z_ = paramZtwv;
    this.Zf = paramZr_4;
    this.ZH = paramZr1m;
    this.Za = paramZey9;
    ZQ();
    ZK(false);
    this.ZC = new ArrayList<>();
    this.ZS = new Zt_a(this.ZC);
    this.ZV = new Zbws(this.ZS);
    this.ZV.setName(a(2401, -26675));
    this.ZV.Zc(this);
    this.ZV.setSelectionMode(0);
    this.ZP.setViewportView(this.ZV);
    this.ZP.Zy(this.ZV);
  }
  
  public void Zr(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2) {
    Zke9 zke9 = new Zke9(paramZmzk, (paramZstu1 == null) ? null : paramZstu1.ZiD(), (paramZstu2 == null) ? null : paramZstu2.ZiD(), this.ZO);
    int i = this.ZC.size();
    this.ZC.add(zke9);
    this.ZS.fireTableRowsInserted(i, i);
    this.ZV.getSelectionModel().setSelectionInterval(i, i);
    ZC(zke9);
  }
  
  private void ZK(boolean paramBoolean) {
    this.ZB.setEnabled(paramBoolean);
    this.ZI.setEnabled(paramBoolean);
    this.Zc.setEnabled(paramBoolean);
    this.Zv.setEnabled(paramBoolean);
    this.ZG.setEnabled(paramBoolean);
    this.ZL.setEnabled(paramBoolean);
    this.Zl.setEnabled(paramBoolean);
    this.Zs.setEnabled(paramBoolean);
    this.ZB.setEnabled(paramBoolean);
    this.Zl.removeAllItems();
    this.Zs.removeAllItems();
    this.Zv.setText("");
  }
  
  private void ZC(Zke9 paramZke9) {
    // Byte code:
    //   0: invokestatic ZT : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zd : Lburp/Zke9;
    //   9: aload_1
    //   10: ifnonnull -> 22
    //   13: aload_0
    //   14: iconst_0
    //   15: invokevirtual ZK : (Z)V
    //   18: iload_2
    //   19: ifne -> 318
    //   22: aload_0
    //   23: iconst_1
    //   24: invokevirtual ZK : (Z)V
    //   27: aload_1
    //   28: getfield ZK : Ljava/util/Map;
    //   31: invokeinterface isEmpty : ()Z
    //   36: ifeq -> 59
    //   39: aload_0
    //   40: getfield Zs : Lburp/Zedd;
    //   43: iconst_0
    //   44: invokevirtual setEnabled : (Z)V
    //   47: aload_0
    //   48: getfield ZG : Lburp/Zmg2;
    //   51: iconst_0
    //   52: invokevirtual setEnabled : (Z)V
    //   55: iload_2
    //   56: ifne -> 137
    //   59: aload_1
    //   60: getfield ZK : Ljava/util/Map;
    //   63: invokeinterface keySet : ()Ljava/util/Set;
    //   68: invokeinterface iterator : ()Ljava/util/Iterator;
    //   73: astore_3
    //   74: aload_3
    //   75: invokeinterface hasNext : ()Z
    //   80: ifeq -> 137
    //   83: aload_3
    //   84: invokeinterface next : ()Ljava/lang/Object;
    //   89: checkcast java/lang/String
    //   92: astore #4
    //   94: aload_1
    //   95: getfield ZK : Ljava/util/Map;
    //   98: aload #4
    //   100: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   105: checkcast java/lang/String
    //   108: astore #5
    //   110: aload_0
    //   111: getfield Zs : Lburp/Zedd;
    //   114: aload #4
    //   116: aload #5
    //   118: bipush #25
    //   120: bipush #20
    //   122: invokestatic ZL : (Ljava/lang/String;II)Ljava/lang/String;
    //   125: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   130: invokevirtual addItem : (Ljava/lang/Object;)V
    //   133: iload_2
    //   134: ifne -> 74
    //   137: aload_1
    //   138: getfield ZR : Ljava/util/Map;
    //   141: invokeinterface isEmpty : ()Z
    //   146: ifeq -> 169
    //   149: aload_0
    //   150: getfield Zl : Lburp/Zedd;
    //   153: iconst_0
    //   154: invokevirtual setEnabled : (Z)V
    //   157: aload_0
    //   158: getfield ZI : Lburp/Zmg2;
    //   161: iconst_0
    //   162: invokevirtual setEnabled : (Z)V
    //   165: iload_2
    //   166: ifne -> 247
    //   169: aload_1
    //   170: getfield ZR : Ljava/util/Map;
    //   173: invokeinterface keySet : ()Ljava/util/Set;
    //   178: invokeinterface iterator : ()Ljava/util/Iterator;
    //   183: astore_3
    //   184: aload_3
    //   185: invokeinterface hasNext : ()Z
    //   190: ifeq -> 247
    //   193: aload_3
    //   194: invokeinterface next : ()Ljava/lang/Object;
    //   199: checkcast java/lang/String
    //   202: astore #4
    //   204: aload_1
    //   205: getfield ZR : Ljava/util/Map;
    //   208: aload #4
    //   210: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   215: checkcast java/lang/String
    //   218: astore #5
    //   220: aload_0
    //   221: getfield Zl : Lburp/Zedd;
    //   224: aload #4
    //   226: aload #5
    //   228: bipush #25
    //   230: bipush #20
    //   232: invokestatic ZL : (Ljava/lang/String;II)Ljava/lang/String;
    //   235: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   240: invokevirtual addItem : (Ljava/lang/Object;)V
    //   243: iload_2
    //   244: ifne -> 184
    //   247: aload_1
    //   248: getfield ZK : Ljava/util/Map;
    //   251: invokeinterface isEmpty : ()Z
    //   256: ifeq -> 279
    //   259: aload_1
    //   260: getfield ZR : Ljava/util/Map;
    //   263: invokeinterface isEmpty : ()Z
    //   268: ifeq -> 279
    //   271: aload_0
    //   272: getfield ZL : Lburp/Zmg2;
    //   275: iconst_1
    //   276: invokevirtual setSelected : (Z)V
    //   279: aload_1
    //   280: getfield ZL : Lburp/Zkk3;
    //   283: ifnull -> 318
    //   286: aload_1
    //   287: getfield ZL : Lburp/Zkk3;
    //   290: invokevirtual Zr : ()Ljava/lang/String;
    //   293: astore_3
    //   294: aload_0
    //   295: getfield Zv : Lburp/Zg85;
    //   298: aload_3
    //   299: ifnonnull -> 314
    //   302: sipush #2413
    //   305: sipush #26733
    //   308: invokestatic a : (II)Ljava/lang/String;
    //   311: goto -> 315
    //   314: aload_3
    //   315: invokevirtual setText : (Ljava/lang/String;)V
    //   318: return
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    ZC(this.ZC.get(this.ZV.convertRowIndexToModel(paramInt1)));
  }
  
  private void ZQ() {
    this.ZY = new ButtonGroup();
    this.Zz = new Ze01();
    this.Zh = new Ze01();
    this.ZB = new Ze0q();
    this.ZI = new Zmg2();
    this.ZG = new Zmg2();
    this.ZL = new Zmg2();
    this.Zl = new Zedd();
    this.Zs = new Zedd();
    this.Zc = new Ze01();
    this.Zv = new Zg85();
    this.ZT = new Zmyw();
    this.ZP = new Zbup();
    this.ZN = new Zm2o();
    this.ZW = new Zbkc();
    this.Zb = new Zl8w();
    this.Zk = new Zl8w();
    this.ZX = new Zbkc();
    this.Zy = new Zm2o();
    this.Zw = new JSeparator();
    this.Zx = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zz.setText(a(2404, 8585));
    this.Zz.setToolTipText(a(2410, 25344));
    this.Zz.addActionListener(new Zs1c(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zz, gridBagConstraints);
    this.Zh.setText(a(2425, 14384));
    this.Zh.setToolTipText(a(2430, 4167));
    this.Zh.addActionListener(new Zgnj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zh, gridBagConstraints);
    this.ZB.setText(a(2426, 1382));
    this.ZB.setEnabled(false);
    this.ZB.setName(a(2421, 23241));
    this.ZB.addActionListener(new Zt3a(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(15, 0, 5, 0);
    add(this.ZB, gridBagConstraints);
    this.ZY.add(this.ZI);
    this.ZI.setText(a(2411, 10271));
    this.ZI.setEnabled(false);
    this.ZI.setMargin(new Insets(0, 0, 0, 0));
    this.ZI.setName(a(2422, -22091));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZI, gridBagConstraints);
    this.ZY.add(this.ZG);
    this.ZG.setText(a(2406, 27437));
    this.ZG.setEnabled(false);
    this.ZG.setMargin(new Insets(0, 0, 0, 0));
    this.ZG.setName(a(2416, -7621));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZG, gridBagConstraints);
    this.ZY.add(this.ZL);
    this.ZL.setSelected(true);
    this.ZL.setText(a(2424, -26224));
    this.ZL.setEnabled(false);
    this.ZL.setMargin(new Insets(0, 0, 0, 0));
    this.ZL.setName(a(2400, -18918));
    this.ZL.addActionListener(new Ztut(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZL, gridBagConstraints);
    this.Zl.setEnabled(false);
    this.Zl.setName(a(2412, 31406));
    this.Zl.addActionListener(new Zlv0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zl, gridBagConstraints);
    this.Zs.setEnabled(false);
    this.Zs.setName(a(2420, -18156));
    this.Zs.addActionListener(new Zgr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zs, gridBagConstraints);
    this.Zc.setText(a(2405, 13001));
    this.Zc.setToolTipText(a(2415, -10585));
    this.Zc.setName(a(2417, 19218));
    this.Zc.addActionListener(new Zl2l(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 1280;
    add(this.Zc, gridBagConstraints);
    this.Zv.setEditable(false);
    this.Zv.setColumns(30);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 1280;
    add(this.Zv, gridBagConstraints);
    this.ZT.setLeftComponent(this.ZP);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZT, gridBagConstraints);
    this.ZN.Zi(Zk97.DESKTOP_TOOLS_SEQUENCER_SAMPLE_TOKEN_LOCATION_WITHIN_RESPONSE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZN, gridBagConstraints);
    this.ZW.Zx(a(2427, 31882));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 23;
    add(this.ZW, gridBagConstraints);
    this.Zb.setColumns(20);
    this.Zb.setText(a(2419, 23621));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zb, gridBagConstraints);
    this.Zk.setColumns(20);
    this.Zk.setText(a(2418, 16104));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zk, gridBagConstraints);
    this.ZX.Zx(a(2423, -8882));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 23;
    add(this.ZX, gridBagConstraints);
    this.Zy.Zi(Zk97.DESKTOP_TOOLS_SEQUENCER_SAMPLE_SELECT_LIVE_CAPTURE_REQUEST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 0, 15, 0);
    add(this.Zw, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zx, gridBagConstraints);
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    this.ZG.setSelected(true);
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    this.ZI.setSelected(true);
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    int i = this.ZV.getSelectedRow();
    if (i < 0 || i > this.ZC.size())
      return; 
    this.ZS.Zh(this.ZV.convertRowIndexToModel(i));
    ZC((Zke9)null);
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    this.ZS.ZU();
    ZC((Zke9)null);
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZY : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgml.COOKIE : Lburp/Zgml;
    //   7: astore_3
    //   8: aload_0
    //   9: getfield ZG : Lburp/Zmg2;
    //   12: invokevirtual isSelected : ()Z
    //   15: ifeq -> 26
    //   18: getstatic burp/Zgml.FORM_FIELD : Lburp/Zgml;
    //   21: astore_3
    //   22: iload_2
    //   23: ifeq -> 47
    //   26: aload_0
    //   27: getfield ZL : Lburp/Zmg2;
    //   30: invokevirtual isSelected : ()Z
    //   33: ifeq -> 47
    //   36: goto -> 43
    //   39: invokestatic a : (Lburp/Zs0j;)Lburp/Zs0j;
    //   42: athrow
    //   43: getstatic burp/Zgml.MANUAL : Lburp/Zgml;
    //   46: astore_3
    //   47: aconst_null
    //   48: astore #4
    //   50: getstatic burp/Zlmt.Z_ : [I
    //   53: aload_3
    //   54: invokevirtual ordinal : ()I
    //   57: iaload
    //   58: tableswitch default -> 275, 1 -> 84, 2 -> 134, 3 -> 184
    //   84: aload_0
    //   85: getfield Zl : Lburp/Zedd;
    //   88: invokevirtual getSelectedItem : ()Ljava/lang/Object;
    //   91: checkcast java/lang/String
    //   94: astore #5
    //   96: aload #5
    //   98: iconst_0
    //   99: aload #5
    //   101: bipush #61
    //   103: invokevirtual indexOf : (I)I
    //   106: invokevirtual substring : (II)Ljava/lang/String;
    //   109: astore #5
    //   111: new burp/Zb8s
    //   114: dup
    //   115: invokespecial <init> : ()V
    //   118: getstatic burp/Zgml.COOKIE : Lburp/Zgml;
    //   121: invokevirtual ZF : (Lburp/Zgml;)Lburp/Zb8s;
    //   124: aload #5
    //   126: invokevirtual ZG : (Ljava/lang/String;)Lburp/Zb8s;
    //   129: astore #4
    //   131: goto -> 275
    //   134: aload_0
    //   135: getfield Zs : Lburp/Zedd;
    //   138: invokevirtual getSelectedItem : ()Ljava/lang/Object;
    //   141: checkcast java/lang/String
    //   144: astore #5
    //   146: aload #5
    //   148: iconst_0
    //   149: aload #5
    //   151: bipush #61
    //   153: invokevirtual indexOf : (I)I
    //   156: invokevirtual substring : (II)Ljava/lang/String;
    //   159: astore #5
    //   161: new burp/Zb8s
    //   164: dup
    //   165: invokespecial <init> : ()V
    //   168: getstatic burp/Zgml.FORM_FIELD : Lburp/Zgml;
    //   171: invokevirtual ZF : (Lburp/Zgml;)Lburp/Zb8s;
    //   174: aload #5
    //   176: invokevirtual ZG : (Ljava/lang/String;)Lburp/Zb8s;
    //   179: astore #4
    //   181: goto -> 275
    //   184: aload_0
    //   185: getfield Zd : Lburp/Zke9;
    //   188: getfield ZL : Lburp/Zkk3;
    //   191: ifnull -> 214
    //   194: aload_0
    //   195: getfield Zd : Lburp/Zke9;
    //   198: getfield ZL : Lburp/Zkk3;
    //   201: invokevirtual Zr : ()Ljava/lang/String;
    //   204: ifnonnull -> 247
    //   207: goto -> 214
    //   210: invokestatic a : (Lburp/Zs0j;)Lburp/Zs0j;
    //   213: athrow
    //   214: aload_0
    //   215: getfield Zj : Lburp/Zm5v;
    //   218: invokevirtual Zn : ()Lburp/Zl04;
    //   221: sipush #2408
    //   224: sipush #20364
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: sipush #2402
    //   233: sipush #13081
    //   236: invokestatic a : (II)Ljava/lang/String;
    //   239: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   242: return
    //   243: invokestatic a : (Lburp/Zs0j;)Lburp/Zs0j;
    //   246: athrow
    //   247: new burp/Zb8s
    //   250: dup
    //   251: invokespecial <init> : ()V
    //   254: getstatic burp/Zgml.MANUAL : Lburp/Zgml;
    //   257: invokevirtual ZF : (Lburp/Zgml;)Lburp/Zb8s;
    //   260: aload_0
    //   261: getfield Zd : Lburp/Zke9;
    //   264: getfield ZL : Lburp/Zkk3;
    //   267: invokevirtual Zv : (Lburp/Zkk3;)Lburp/Zb8s;
    //   270: astore #4
    //   272: goto -> 275
    //   275: aload_0
    //   276: getfield Zq : Lburp/Zqe;
    //   279: invokeinterface ZGc : ()Lburp/Zrwv;
    //   284: astore #5
    //   286: aload #4
    //   288: aload #5
    //   290: invokevirtual ZW : (Lburp/Zrwv;)Lburp/Zb8s;
    //   293: pop
    //   294: goto -> 326
    //   297: astore #6
    //   299: aload #6
    //   301: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   304: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   307: aload_0
    //   308: sipush #2431
    //   311: sipush #21233
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: aload #6
    //   319: invokevirtual getMessage : ()Ljava/lang/String;
    //   322: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   325: return
    //   326: aload_0
    //   327: getfield Zj : Lburp/Zm5v;
    //   330: iconst_1
    //   331: invokevirtual Zq : (Z)Lburp/Zx_j;
    //   334: astore #6
    //   336: goto -> 372
    //   339: astore #7
    //   341: aload #7
    //   343: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   346: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   349: aload_0
    //   350: sipush #2431
    //   353: sipush #21233
    //   356: invokestatic a : (II)Ljava/lang/String;
    //   359: sipush #2407
    //   362: sipush #15720
    //   365: invokestatic a : (II)Ljava/lang/String;
    //   368: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   371: return
    //   372: getstatic burp/Zze0.SEQUENCER_LIVE_CAPTURE_ANALYSIS : Lburp/Zze0;
    //   375: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   378: new burp/Zl4x
    //   381: dup
    //   382: aload_0
    //   383: getfield ZR : Lburp/Zt4u;
    //   386: aload_0
    //   387: getfield Zj : Lburp/Zm5v;
    //   390: invokevirtual Zn : ()Lburp/Zl04;
    //   393: aload_0
    //   394: getfield Zd : Lburp/Zke9;
    //   397: getfield Zj : I
    //   400: aload_0
    //   401: getfield Zd : Lburp/Zke9;
    //   404: getfield ZA : Lburp/Zmzk;
    //   407: invokeinterface toString : ()Ljava/lang/String;
    //   412: sipush #2403
    //   415: sipush #-28953
    //   418: invokestatic a : (II)Ljava/lang/String;
    //   421: dup_x2
    //   422: pop
    //   423: sipush #2414
    //   426: sipush #-8383
    //   429: invokestatic a : (II)Ljava/lang/String;
    //   432: swap
    //   433: ldc ']'
    //   435: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   440: aload #6
    //   442: aconst_null
    //   443: aload_0
    //   444: getfield Zt : Lburp/Zb0h;
    //   447: aload_0
    //   448: getfield Z_ : Lburp/Ztwv;
    //   451: aload_0
    //   452: getfield Zf : Lburp/Zr_4;
    //   455: aload_0
    //   456: getfield ZH : Lburp/Zr1m;
    //   459: invokespecial <init> : (Lburp/Zt4u;Ljava/awt/Window;Ljava/lang/String;Lburp/Zx_j;Ljava/util/List;Lburp/Zb0h;Lburp/Ztwv;Lburp/Zr_4;Lburp/Zr1m;)V
    //   462: astore #7
    //   464: aload #7
    //   466: sipush #2409
    //   469: sipush #3821
    //   472: invokestatic a : (II)Ljava/lang/String;
    //   475: invokevirtual setName : (Ljava/lang/String;)V
    //   478: aload #7
    //   480: iconst_1
    //   481: invokevirtual setVisible : (Z)V
    //   484: aload #4
    //   486: aload_0
    //   487: getfield Zd : Lburp/Zke9;
    //   490: getfield ZA : Lburp/Zmzk;
    //   493: invokevirtual Zu : (Lburp/Zmzk;)Lburp/Zb8s;
    //   496: aload_0
    //   497: getfield Zd : Lburp/Zke9;
    //   500: getfield Zf : [B
    //   503: invokevirtual Za : ([B)Lburp/Zb8s;
    //   506: invokevirtual Zq : ()Lburp/Zl5k;
    //   509: astore #8
    //   511: new burp/Ze8
    //   514: dup
    //   515: aload_0
    //   516: getfield Zj : Lburp/Zm5v;
    //   519: aload #8
    //   521: aload #7
    //   523: aload_0
    //   524: getfield Zj : Lburp/Zm5v;
    //   527: invokevirtual Zz : ()Lburp/Zkr_;
    //   530: invokevirtual ZA : ()Lburp/Zbx9;
    //   533: aload_0
    //   534: getfield ZO : Lburp/Zbnt;
    //   537: aload_0
    //   538: getfield Z_ : Lburp/Ztwv;
    //   541: aload_0
    //   542: getfield Za : Lburp/Zey9;
    //   545: invokespecial <init> : (Lburp/Zm5v;Lburp/Zl5k;Lburp/Ztg9;Lburp/Zbx9;Lburp/Zbnt;Lburp/Ztwv;Lburp/Zey9;)V
    //   548: invokevirtual Ze : ()V
    //   551: return
    // Exception table:
    //   from	to	target	type
    //   22	36	39	burp/Zs0j
    //   184	207	210	burp/Zs0j
    //   194	243	243	burp/Zs0j
    //   275	294	297	burp/Zs0j
    //   326	336	339	burp/Zs0j
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    this.ZL.setSelected(true);
    Zrvm zrvm = new Zrvm(Zt2m.ZF(this), a(2428, -23441), a(2429, 6974), (this.Zd.ZL == null) ? new Zkk3(this.Zf.<Zg05>ZH(new Zxlb()), this.Zf) : this.Zd.ZL, this.Zj.Zz().ZA(), this.Zd.ZA, this.Zd.Zf, this.Zd, this.ZA, this.ZO, this.Zt, this.Z_, this.Zf, this.Za);
    zrvm.setVisible(true);
    Zkk3 zkk3 = zrvm.ZM();
    if (zkk3 == null)
      return; 
    this.Zd.ZL = zkk3;
    String str = zkk3.Zr();
    this.Zv.setText((str == null) ? "" : str);
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    if (this.Zd.ZL == null || this.Zd.ZL.Zr() == null)
      Zs(paramActionEvent); 
  }
  
  private static Zs0j a(Zs0j paramZs0j) {
    return paramZs0j;
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'DCìÃ[L\\bEq]¶èr}ïLÊ\\nÕ§«îr¸Ë@dÜtÕ ä>;m_8ºÃV;ã<:Q´Ëú¼Ú(Jfj£Õ0\\bó=ÖY¶½\\tÎ}±\\tA%­jûÝm¿IÂ\\r4¦lÈÏúî8:BÍx+J~Þæ©\Û2fO0ï\\n=ëÀ¬Íx;móäßÐ*"ÿöh¿¦oI üTåí×ìÀn3÷çÐÒ\\rîucLûÍÍL!Ê9±ÆÊÐt~Ïá7%Jø¤%ÈÀ®ùt¼°¦¿*áUÏóÁ½al8GÚÈM\\tZ¨ z©­2Ì<ö4è\\bC?Ï\\tÅ5ºÚS'\\râ[Çÿág.{VÝ¤rTÆ6<¨5zeßdJW2åD,Æõ]l¦fiGÓuò6«¼¡\\t3E÷Îä¨?B3Úô"·ÔQ5Kâ¶é®5rÖÿ[%ÙÄn¥æÝÃ[Ñô²|Wÿ\ê/Ü0¼Å¦ö%Á)Ñ}vÎögY»Ñ ª%ÇÎç9UÚd >¥ßl$é9\\b,¢çåî¿áq£°ÿaÁ´×kª®ÙÄµÆ»ÂæåP¬@ë£ô¹Ý7ÄñqiÎIrïlRñ4¦ÅpÌ¥íõO:Ä|QÁfÃgKã&vêYÖ«ÑBHáQzÝ³Ñ\çÛfª2¨(ÇMnåçðpß[ð±mþÈIö6^îIMÃ!!süÄ2\\nvò}C«dÅ<îXjÂ{Ìí´`L¹Vxå8³¾@³KÏ´&2&òÓ[ó¯ê²vÁÊªxZÐµÚ0ëyÝ6óþÓH²öÓ>g­/³CÌÒ·j­INÃ`ÁîA\\n%´3#6²¹DÏë«°JÇò½¸Ø<2-¯¿èüû¬RúµýiÒ¸\\tØ7'ñá·ø`]3a5%¢;¸I/¼*N«Ñg 0}/5cÃ\\tïeOYqhyú[ð#2V4gãëF6ÂQvÕÐ\\nÊRË\\bÙÀ¸Ðá¹*f'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #30
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'Vìµí´d¨g$º·×ä%Á\\nÐ|Ôxh§Ãdjo»®ý¥RÔ0ðì²[E5¦{Õö'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #26
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #35
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
    //   128: putstatic burp/Zbaf.a : [Ljava/lang/String;
    //   131: bipush #32
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbaf.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #123
    //   214: goto -> 244
    //   217: bipush #8
    //   219: goto -> 244
    //   222: bipush #73
    //   224: goto -> 244
    //   227: bipush #36
    //   229: goto -> 244
    //   232: bipush #124
    //   234: goto -> 244
    //   237: bipush #25
    //   239: goto -> 244
    //   242: bipush #96
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
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
    int i = (paramInt1 ^ 0x968) & 0xFFFF;
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
      byte b1 = 12;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbaf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */