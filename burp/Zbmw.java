package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.ButtonGroup;

public class Zbmw extends Zbv5 implements Zsnh, Ztww {
  private final Zqu Zm;
  
  private final Zxts Zv;
  
  private final Ztfv Zg;
  
  private final Zr_4 Zr;
  
  private final Zgo0 Zx;
  
  private final Zzxj ZQ;
  
  private String ZA = "";
  
  private Zm99 ZN;
  
  private Zm99 ZB;
  
  private ButtonGroup ZR;
  
  private Zzdy ZJ;
  
  private Zzdy Zw;
  
  private Zzdy ZI;
  
  private Zzdy ZC;
  
  private Zzdy ZS;
  
  private Zzdy ZL;
  
  private Zl8w ZD;
  
  private Zbkc ZW;
  
  private Zmg2 ZH;
  
  private Zmg2 ZT;
  
  private Zm99 Zo;
  
  private Zm99 Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbmw(Zqu paramZqu, Zr49 paramZr49, Zbqp paramZbqp, Zxts paramZxts, Ztfv paramZtfv, Zbnt paramZbnt, Zr_4 paramZr_4) {
    this.Zm = paramZqu;
    this.Zv = paramZxts;
    this.Zg = paramZtfv;
    this.Zr = paramZr_4;
    this.ZQ = new Zzxj(paramZbnt, paramZr_4);
    Zy7();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Zx = new Zgo0(this, paramZr49, paramZbqp);
    add(this.Zx, gridBagConstraints);
  }
  
  public String ZZ() {
    return this.ZW.Zr();
  }
  
  public Zk97 ZR() {
    return Zk97.DESKTOP_SCANNING_LIVE_SCANS_LIVE_PASSIVE_CRAWL;
  }
  
  public String Zq() {
    return a(5689, 14363);
  }
  
  public Zmf_ Zn() {
    Zzkm zzkm = new Zzkm();
    Zl34 zl341 = this.Zm.ZGY();
    Zl34 zl342 = this.Zm.ZGp();
    zl341.Zjg().clear();
    zl341.ZjM().clear();
    zl342.Zjg().clear();
    zl342.ZjM().clear();
    this.ZQ.Ze(zl341, zl342, this.Zr);
    this.Zm.Zl(zzkm);
    return zzkm.ZV(new String[] { a(5690, 21676) });
  }
  
  public String ZE() {
    return a(5685, -2412);
  }
  
  public String Zd() {
    this.Zx.Zk();
    return this.ZA;
  }
  
  public void Zt2() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Lburp/Zzdy;
    //   4: aload_0
    //   5: getfield Zm : Lburp/Zqu;
    //   8: invokeinterface Zoy : ()Z
    //   13: invokevirtual setSelected : (Z)V
    //   16: invokestatic Zca : ()I
    //   19: aload_0
    //   20: getfield Zw : Lburp/Zzdy;
    //   23: aload_0
    //   24: getfield Zm : Lburp/Zqu;
    //   27: invokeinterface Zo1 : ()Z
    //   32: invokevirtual setSelected : (Z)V
    //   35: istore_1
    //   36: aload_0
    //   37: getfield ZJ : Lburp/Zzdy;
    //   40: aload_0
    //   41: getfield Zm : Lburp/Zqu;
    //   44: invokeinterface ZoR : ()Z
    //   49: invokevirtual setSelected : (Z)V
    //   52: aload_0
    //   53: getfield ZI : Lburp/Zzdy;
    //   56: aload_0
    //   57: getfield Zm : Lburp/Zqu;
    //   60: invokeinterface ZoG : ()Z
    //   65: invokevirtual setSelected : (Z)V
    //   68: aload_0
    //   69: getfield ZS : Lburp/Zzdy;
    //   72: aload_0
    //   73: getfield Zm : Lburp/Zqu;
    //   76: invokeinterface Zo7 : ()Z
    //   81: invokevirtual setSelected : (Z)V
    //   84: aload_0
    //   85: getfield ZL : Lburp/Zzdy;
    //   88: aload_0
    //   89: getfield Zm : Lburp/Zqu;
    //   92: invokeinterface Zo6 : ()Z
    //   97: invokevirtual setSelected : (Z)V
    //   100: aload_0
    //   101: getfield ZT : Lburp/Zmg2;
    //   104: aload_0
    //   105: getfield Zm : Lburp/Zqu;
    //   108: invokeinterface ZGk : ()Lburp/Zmet;
    //   113: getstatic burp/Zmet.SUITE : Lburp/Zmet;
    //   116: if_acmpne -> 123
    //   119: iconst_1
    //   120: goto -> 124
    //   123: iconst_0
    //   124: invokevirtual setSelected : (Z)V
    //   127: aload_0
    //   128: getfield ZH : Lburp/Zmg2;
    //   131: aload_0
    //   132: getfield Zm : Lburp/Zqu;
    //   135: invokeinterface ZGk : ()Lburp/Zmet;
    //   140: getstatic burp/Zmet.CUSTOM : Lburp/Zmet;
    //   143: if_acmpne -> 150
    //   146: iconst_1
    //   147: goto -> 151
    //   150: iconst_0
    //   151: invokevirtual setSelected : (Z)V
    //   154: aload_0
    //   155: getfield ZQ : Lburp/Zzxj;
    //   158: aload_0
    //   159: getfield Zm : Lburp/Zqu;
    //   162: invokeinterface ZGY : ()Lburp/Zl34;
    //   167: aload_0
    //   168: getfield Zm : Lburp/Zqu;
    //   171: invokeinterface ZGp : ()Lburp/Zl34;
    //   176: invokevirtual ZU : (Lburp/Zl34;Lburp/Zl34;)V
    //   179: aload_0
    //   180: getfield Zx : Lburp/Zgo0;
    //   183: aload_0
    //   184: getfield ZQ : Lburp/Zzxj;
    //   187: getfield ZJ : Ljava/util/List;
    //   190: aload_0
    //   191: getfield ZQ : Lburp/Zzxj;
    //   194: getfield Zl : Ljava/util/List;
    //   197: invokevirtual ZB : (Ljava/util/List;Ljava/util/List;)V
    //   200: aload_0
    //   201: getfield Zx : Lburp/Zgo0;
    //   204: aload_0
    //   205: getfield ZQ : Lburp/Zzxj;
    //   208: getfield Zm : Ljava/util/List;
    //   211: aload_0
    //   212: getfield ZQ : Lburp/Zzxj;
    //   215: getfield Zy : Ljava/util/List;
    //   218: invokevirtual ZQ : (Ljava/util/List;Ljava/util/List;)V
    //   221: aload_0
    //   222: getfield ZQ : Lburp/Zzxj;
    //   225: getfield Zq : Z
    //   228: ifeq -> 242
    //   231: aload_0
    //   232: getfield Zx : Lburp/Zgo0;
    //   235: invokevirtual Zi : ()V
    //   238: iload_1
    //   239: ifeq -> 249
    //   242: aload_0
    //   243: getfield Zx : Lburp/Zgo0;
    //   246: invokevirtual Zp : ()V
    //   249: aload_0
    //   250: invokevirtual Zyy : ()V
    //   253: return
  }
  
  public void Zb(boolean paramBoolean) {
    ZC("");
    this.ZQ.Zq = paramBoolean;
    int i = Zbmj.Zca();
    if (paramBoolean) {
      this.Zx.Zi();
      if (i != 0) {
        this.Zx.Zp();
        return;
      } 
      return;
    } 
    this.Zx.Zp();
  }
  
  public void Z_(List<String> paramList1, List<String> paramList2) {
    ZC(this.ZQ.ZW(paramList1, paramList2));
    this.Zx.ZB(this.ZQ.ZJ, this.ZQ.Zl);
  }
  
  public void ZA(Zmy8 paramZmy8) {
    this.ZQ.Zb(paramZmy8);
  }
  
  public void ZU(Zmy8 paramZmy8, int paramInt) {
    this.ZQ.Zr(paramInt, paramZmy8);
  }
  
  public void Zg(int paramInt) {
    this.ZQ.ZA(paramInt);
  }
  
  public void ZY(Zmy8 paramZmy8) {
    this.ZQ.ZK(paramZmy8);
  }
  
  public void ZZ(Zmy8 paramZmy8, int paramInt) {
    this.ZQ.Zv(paramInt, paramZmy8);
  }
  
  public void ZO(int paramInt) {
    this.ZQ.ZG(paramInt);
  }
  
  public void ZZK() {
    ZC("");
    this.Zx.ZG();
  }
  
  public void Zl(Zmf_ paramZmf_) {
    this.ZQ.ZI(paramZmf_);
    ZyZ();
  }
  
  public String Zv(String paramString) {
    return Zzqb.Za(this.Zv, paramString, ZyK());
  }
  
  public void ZC(String paramString) {
    paramString = paramString.isEmpty() ? "" : String.format(a(5682, 22793), new Object[] { a(5693, 31830), paramString });
    this.ZA = paramString;
    this.Zg.Zv(paramString);
  }
  
  private void ZyZ() {
    this.Zx.ZB(this.ZQ.ZJ, this.ZQ.Zl);
    this.Zx.ZQ(this.ZQ.Zm, this.ZQ.Zy);
    Zb(this.ZQ.Zq);
  }
  
  private void Zyy() {
    int i = Zbmj.ZcA();
    boolean bool = !this.Zm.ZoR() ? true : false;
    this.ZI.setEnabled(bool);
    this.ZS.setEnabled(bool);
    this.ZL.setEnabled(bool);
    if (bool && this.Zm.Zo6()) {
      this.ZT.setEnabled(true);
      this.ZH.setEnabled(true);
      this.Zx.setVisible((this.Zm.ZGk() == Zmet.CUSTOM));
      if (i == 0) {
        this.ZT.setEnabled(false);
        this.ZH.setEnabled(false);
        this.Zx.setVisible(false);
        return;
      } 
      return;
    } 
    this.ZT.setEnabled(false);
    this.ZH.setEnabled(false);
    this.Zx.setVisible(false);
  }
  
  private Zzkm ZyK() {
    Zl34 zl341 = this.Zr.<Zl34>ZH(new Ztwg(true));
    Zl34 zl342 = this.Zr.<Zl34>ZH(new Ztwg(false));
    Zlor zlor = this.ZQ.Ze(zl341, zl342, this.Zr);
    Zzkm zzkm = new Zzkm();
    zlor.Zf(zzkm, a(5686, 21111));
    return zzkm;
  }
  
  private void Zy7() {
    this.ZR = new ButtonGroup();
    this.ZW = new Zbkc();
    this.ZD = new Zl8w();
    this.ZN = new Zm99();
    this.ZC = new Zzdy();
    this.Zw = new Zzdy();
    this.ZB = new Zm99();
    this.ZJ = new Zzdy();
    this.ZI = new Zzdy();
    this.ZS = new Zzdy();
    this.ZL = new Zzdy();
    this.Zo = new Zm99();
    this.ZT = new Zmg2();
    this.ZH = new Zmg2();
    this.Zs = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZW.Zx(a(5684, 7178));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 21;
    add(this.ZW, gridBagConstraints);
    this.ZD.setText(a(5680, 21952));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZD, gridBagConstraints);
    this.ZN.setText(a(5691, -2786));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 5, 0);
    add(this.ZN, gridBagConstraints);
    this.ZC.setText(a(5672, -9809));
    this.ZC.addActionListener(new Ztl8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZC, gridBagConstraints);
    this.Zw.setText(a(5692, -14847));
    this.Zw.addActionListener(new Zt9l(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.Zw, gridBagConstraints);
    this.ZB.setText(a(5688, -9916));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(15, 0, 5, 0);
    add(this.ZB, gridBagConstraints);
    this.ZJ.setText(a(5695, -13691));
    this.ZJ.addActionListener(new Zrh6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZJ, gridBagConstraints);
    this.ZI.setText(a(5674, 32547));
    this.ZI.addActionListener(new Zz4d(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZI, gridBagConstraints);
    this.ZS.setText(a(5694, 2966));
    this.ZS.addActionListener(new Zrnq(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZS, gridBagConstraints);
    this.ZL.setText(a(5683, 16422));
    this.ZL.addActionListener(new Zk76(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZL, gridBagConstraints);
    this.Zo.setText(a(5675, -23239));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    add(this.Zo, gridBagConstraints);
    this.ZR.add(this.ZT);
    this.ZT.setText(a(5681, 21424));
    this.ZT.addActionListener(new Zger(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZT, gridBagConstraints);
    this.ZR.add(this.ZH);
    this.ZH.setText(a(5687, 11568));
    this.ZH.addActionListener(new Zmh8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZH, gridBagConstraints);
    this.Zs.setText(a(5673, 28254));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 24;
    add(this.Zs, gridBagConstraints);
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    this.Zm.ZJ(this.ZC.isSelected());
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    this.Zm.Zm(this.Zw.isSelected());
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    this.Zm.ZT(this.ZJ.isSelected());
    Zyy();
  }
  
  private void Zv(ActionEvent paramActionEvent) {
    this.Zm.Za(this.ZI.isSelected());
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    this.Zm.ZW(this.ZS.isSelected());
  }
  
  private void Za(ActionEvent paramActionEvent) {
    this.Zm.ZN(this.ZL.isSelected());
    Zyy();
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    this.Zm.ZN(Zmet.SUITE);
    this.Zx.setVisible(false);
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    this.Zm.ZN(Zmet.CUSTOM);
    this.Zx.setVisible(true);
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'L%Rê<$Ü³÷Ö[(ú4Ô\\tpB¢¦®eA\\tÃ:°Ë½@±@y¨ú·¯(nË\\f'Ûâë8VT?5¼±íÂæ{Ø\\f»$)¿ÏU|PTº*rÂþ4ä$¥*3òxYþ*Øi7$(#ò\\n F9ù5·qÁ¸ÿ)ë¸\\rª+§-Bqã\\f××® Ë÷9ÄAiýëfh\\r¦ôDú¾^÷'\\fm\\bßnù Ú/M+¦ÑÏ3Rò)b"&Ð«oøÉ]â¹Oj+ÏßËN^Ý©-=Ç`Mù{%å²s2µqY&NÇúFá ýecv7(èñBÕwe¯.«¸¢Z<X> gÁömÿÏý3Ó[deX­M#\\tüÎUM¥¶×ë/OTÊ^8û\\tàèÜùÿW0\\f\Íním%\§Å>¤T{MëÏ\\f¾¥ëC¯DèÏ#zAº*Õr`¯§=.3"@>ÜÉ;Ï3p³§éÈ{ß¸£éÚ8Bë]ö$4ç6°ÌBÌßçLX«RDì©_">Xl½PáÃ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #26
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #68
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 141
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
    //   68: ldc 'Ý¶+º""{5'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_2
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zbmw.a : [Ljava/lang/String;
    //   130: bipush #20
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbmw.b : [Ljava/lang/String;
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
    //   212: bipush #9
    //   214: goto -> 244
    //   217: bipush #25
    //   219: goto -> 244
    //   222: bipush #88
    //   224: goto -> 244
    //   227: bipush #20
    //   229: goto -> 244
    //   232: bipush #70
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #79
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
    //   283: tableswitch default -> 40, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x163A) & 0xFFFF;
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
      char c = 'Ñ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbmw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */