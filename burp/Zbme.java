package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.ListSelectionModel;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zvy;

class Zbme extends Zbv5 implements Zg0 {
  private final Zxaw Zn;
  
  private final Zt0_<Zkk3> Zx;
  
  private final Zbws ZG;
  
  private final String ZC = a(-20546, 16379);
  
  private final Zr_4 Zb;
  
  private final Zgb6 Zq;
  
  private final Zbnt Zk;
  
  private final Zb0h Zv;
  
  private final Ztwv Zt;
  
  private final boolean ZH;
  
  private final Zbma ZR;
  
  private final Ze4m ZN;
  
  private final Zt84 ZD;
  
  private final Zey9 Z_;
  
  private Zbkk ZA;
  
  private Zmyw Zy;
  
  private Zzdy Zc;
  
  private Ze01 ZB;
  
  private Ze01 ZF;
  
  private Ze01 Za;
  
  private Ze01 Zr;
  
  private Ze01 ZO;
  
  private Ze01 Zd;
  
  private Ze01 ZQ;
  
  private Zl8w Zh;
  
  private Zm99 ZK;
  
  private Zbkc Zo;
  
  private Zbup ZL;
  
  private Zgff ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbme(Zxaw paramZxaw, Zbma paramZbma, boolean paramBoolean, Zgb6 paramZgb6, Zbnt paramZbnt, Zey9 paramZey9, Zb0h paramZb0h, Ztwv paramZtwv, Ze4m paramZe4m, Zt84 paramZt84, Zr_4 paramZr_4) {
    Zuh.Zv((paramZgb6 != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZr_4 != null), Zqf.Zv, 2L);
    this.Zn = paramZxaw;
    this.ZH = paramBoolean;
    this.Zq = paramZgb6;
    this.Zk = paramZbnt;
    this.Z_ = paramZey9;
    this.Zv = paramZb0h;
    this.Zt = paramZtwv;
    this.Zb = paramZr_4;
    this.ZR = paramZbma;
    this.ZN = paramZe4m;
    this.ZD = paramZt84;
    Zy();
    this.ZA.ZB(Zk97.DESKTOP_TOOLS_INTRUDER_OPTIONS_GREP_EXTRACT, this, a(-20572, -29244));
    if (paramBoolean) {
      this.Zr.setEnabled(false);
      this.ZO.setEnabled(false);
    } 
    this.Zx = new Zt0_<>();
    this.ZG = new Zbws(this.Zx);
    this.ZL.setViewportView(this.ZG);
  }
  
  Zbws ZS() {
    return new Zbws(this.Zx);
  }
  
  void Zq(Zgxp paramZgxp) {
    ZN(paramZgxp.Zod(), paramZgxp.Zos().ZiD(), paramZgxp);
  }
  
  private void ZN(Zmzk paramZmzk, byte[] paramArrayOfbyte, Zt84 paramZt84) {
    // Byte code:
    //   0: new burp/Zrvm
    //   3: dup
    //   4: aload_0
    //   5: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   8: sipush #-20566
    //   11: sipush #30605
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: sipush #-20579
    //   20: sipush #7581
    //   23: invokestatic a : (II)Ljava/lang/String;
    //   26: new burp/Zkk3
    //   29: dup
    //   30: aload_0
    //   31: getfield Zb : Lburp/Zr_4;
    //   34: new burp/Zxlb
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   46: checkcast burp/Zg05
    //   49: aload_0
    //   50: getfield Zb : Lburp/Zr_4;
    //   53: invokespecial <init> : (Lburp/Zg05;Lburp/Zr_4;)V
    //   56: aload_0
    //   57: getfield ZN : Lburp/Ze4m;
    //   60: aload_1
    //   61: aload_2
    //   62: aload_3
    //   63: aload_0
    //   64: getfield Zq : Lburp/Zgb6;
    //   67: aload_0
    //   68: getfield Zk : Lburp/Zbnt;
    //   71: aload_0
    //   72: getfield Zv : Lburp/Zb0h;
    //   75: aload_0
    //   76: getfield Zt : Lburp/Ztwv;
    //   79: aload_0
    //   80: getfield Zb : Lburp/Zr_4;
    //   83: aload_0
    //   84: getfield Z_ : Lburp/Zey9;
    //   87: invokespecial <init> : (Ljava/awt/Window;Ljava/lang/String;Ljava/lang/String;Lburp/Zkk3;Lburp/Ze4m;Lburp/Zmzk;[BLburp/Zt84;Lburp/Zgb6;Lburp/Zbnt;Lburp/Zb0h;Lburp/Ztwv;Lburp/Zr_4;Lburp/Zey9;)V
    //   90: astore #5
    //   92: invokestatic Zx : ()I
    //   95: aload #5
    //   97: iconst_1
    //   98: invokevirtual setVisible : (Z)V
    //   101: istore #4
    //   103: aload #5
    //   105: invokevirtual ZM : ()Lburp/Zkk3;
    //   108: astore #6
    //   110: aload #6
    //   112: ifnonnull -> 116
    //   115: return
    //   116: aload_0
    //   117: getfield Zx : Lburp/Zt0_;
    //   120: aload #6
    //   122: invokevirtual Zr : (Ljava/lang/Object;)V
    //   125: aload_0
    //   126: getfield ZH : Z
    //   129: ifeq -> 210
    //   132: aload_0
    //   133: getfield Zc : Lburp/Zzdy;
    //   136: invokevirtual isSelected : ()Z
    //   139: ifeq -> 180
    //   142: aload_0
    //   143: getfield Zx : Lburp/Zt0_;
    //   146: invokevirtual getRowCount : ()I
    //   149: newarray boolean
    //   151: astore #7
    //   153: aload #7
    //   155: aload #7
    //   157: arraylength
    //   158: iconst_1
    //   159: isub
    //   160: iconst_1
    //   161: bastore
    //   162: aload_0
    //   163: getfield Zn : Lburp/Zxaw;
    //   166: iconst_2
    //   167: aload #7
    //   169: aload_0
    //   170: invokeinterface ZA : (B[ZLburp/Zr23;)V
    //   175: iload #4
    //   177: ifeq -> 210
    //   180: aload_0
    //   181: getfield Zx : Lburp/Zt0_;
    //   184: invokevirtual getRowCount : ()I
    //   187: newarray boolean
    //   189: astore #7
    //   191: aload #7
    //   193: iconst_1
    //   194: invokestatic fill : ([ZZ)V
    //   197: aload_0
    //   198: getfield Zn : Lburp/Zxaw;
    //   201: iconst_2
    //   202: aload #7
    //   204: aload_0
    //   205: invokeinterface ZA : (B[ZLburp/Zr23;)V
    //   210: aload_0
    //   211: getfield Zc : Lburp/Zzdy;
    //   214: iconst_1
    //   215: invokevirtual setSelected : (Z)V
    //   218: return
  }
  
  private boolean Zk() {
    return this.Zc.isSelected();
  }
  
  private Zg05[] Zv() {
    return (Zg05[])this.Zx.ZL().stream().map(Zkk3::Z_).toArray(Zbme::lambda$getExtractorModels$0);
  }
  
  private void Zy(Zkk3[] paramArrayOfZkk3) {
    ArrayList<? super Zkk3> arrayList = new ArrayList();
    if (paramArrayOfZkk3 != null)
      Collections.addAll(arrayList, paramArrayOfZkk3); 
    this.Zx.ZS();
    this.Zx.Za((Collection)arrayList);
  }
  
  private short Zc() {
    try {
      return Short.parseShort(this.ZU.getText());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      return -1;
    } 
  }
  
  private boolean[] ZQ() {
    List<Zkk3> list = this.Zx.ZL();
    boolean[] arrayOfBoolean = new boolean[list.size()];
    int i = Zbyw.Zp();
    byte b = 1;
    while (b < list.size()) {
      if (((Zkk3)list.get(b)).Zg(list.get(b - 1)))
        arrayOfBoolean[b] = true; 
      b++;
      if (i == 0)
        break; 
    } 
    return arrayOfBoolean;
  }
  
  public void Zr(Zsh8 paramZsh8) {
    if (paramZsh8.ZP_() == null)
      return; 
    this.Zc.setSelected(paramZsh8.ZP_().Zv_());
    Zy(paramZsh8.ZP_().ZvZ());
    this.ZU.setText((paramZsh8.ZP_().Zvf() == -1) ? "" : Integer.toString(paramZsh8.ZP_().Zvf()));
  }
  
  public void ZX(Zsh8 paramZsh8) {
    Zz4g zz4g = paramZsh8.ZP_();
    if (zz4g == null)
      zz4g = this.Zb.<Zz4g>ZH(new Zrrq()); 
    zz4g.ZVu(Zk());
    zz4g.ZQ(Zv());
    zz4g.Zd(ZQ());
    zz4g.Zv(Zc());
    paramZsh8.ZK(zz4g);
  }
  
  private void ZM() {
    int i = Zbyw.Zp();
    int[] arrayOfInt = this.ZG.getSelectedRows();
    if (arrayOfInt.length == 0)
      return; 
    int j = this.Zx.getRowCount();
    boolean[] arrayOfBoolean = new boolean[j];
    int k = arrayOfInt.length - 1;
    while (k >= 0) {
      int m = arrayOfInt[k];
      this.Zx.Zq(m);
      arrayOfBoolean[m] = true;
      k--;
      if (i == 0)
        break; 
    } 
    if (ZJ())
      this.Zn.ZM((byte)2, arrayOfBoolean, this); 
  }
  
  private void Zu() {
    int i = Zbyw.Zp();
    int[] arrayOfInt1 = this.ZG.getSelectedRows();
    if (arrayOfInt1.length == 0)
      return; 
    List<Zkk3> list = this.Zx.ZL();
    ArrayList<Zkk3> arrayList = new ArrayList();
    int[] arrayOfInt2 = arrayOfInt1;
    int j = arrayOfInt2.length;
    byte b = 0;
    while (b < j) {
      int k = arrayOfInt2[b];
      Zkk3 zkk31 = list.get(k);
      Zkk3 zkk32 = zkk31.ZI();
      arrayList.add(zkk32);
      b++;
      if (i == 0)
        break; 
    } 
    this.Zx.Za(arrayList);
    if (ZJ()) {
      boolean[] arrayOfBoolean = new boolean[this.Zx.getRowCount()];
      j = 0;
      while (j < arrayList.size()) {
        arrayOfBoolean[arrayOfBoolean.length - 1 - j] = true;
        j++;
        if (i == 0)
          break; 
      } 
      this.Zn.ZA((byte)2, arrayOfBoolean, this);
    } 
  }
  
  private void Zw() {
    int[] arrayOfInt1 = this.ZG.getSelectedRows();
    ListSelectionModel listSelectionModel = this.ZG.getSelectionModel();
    int[] arrayOfInt2 = arrayOfInt1;
    int j = arrayOfInt2.length;
    int i = Zbyw.Zx();
    byte b = 0;
    while (b < j) {
      int k = arrayOfInt2[b];
      ZF(k, listSelectionModel);
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  private void ZF(int paramInt, ListSelectionModel paramListSelectionModel) {
    if (paramInt == 0)
      return; 
    int i = paramInt - 1;
    this.Zx.Zn(i);
    paramListSelectionModel.removeSelectionInterval(paramInt, paramInt);
    paramListSelectionModel.addSelectionInterval(i, i);
  }
  
  private void ZE() {
    int[] arrayOfInt = this.ZG.getSelectedRows();
    ListSelectionModel listSelectionModel = this.ZG.getSelectionModel();
    int j = arrayOfInt.length - 1;
    int i = Zbyw.Zx();
    while (j >= 0) {
      ZY(arrayOfInt[j], listSelectionModel);
      j--;
      if (i != 0)
        break; 
    } 
  }
  
  private void ZY(int paramInt, ListSelectionModel paramListSelectionModel) {
    int i = this.Zx.getRowCount() - 1;
    if (paramInt == i)
      return; 
    this.Zx.Zn(paramInt);
    int j = paramInt + 1;
    paramListSelectionModel.removeSelectionInterval(paramInt, paramInt);
    paramListSelectionModel.addSelectionInterval(j, j);
  }
  
  private boolean ZJ() {
    return (this.ZH && this.Zc.isSelected());
  }
  
  private void ZX() {
    int i = this.ZG.getSelectedRow();
    if (i < 0 || i >= this.ZG.getRowCount())
      return; 
    Zm3l zm3l = this.ZR.ZJ();
    Zkk3 zkk3 = this.Zx.ZL().get(i);
    Zrvm zrvm = new Zrvm(Zt2m.ZF(this), a(-20592, -19259), a(-20565, -27896), zkk3, this.ZN, zm3l.ZI(), Zz96.ZA(zm3l.ZY.ZiD()), this.ZD, this.Zq, this.Zk, this.Zv, this.Zt, this.Zb, this.Z_);
    Zxjb zxjb = zrvm.Zn();
    if (zxjb == Zxjb.CANCEL)
      return; 
    this.Zx.fireTableRowsUpdated(i, i);
    if (ZJ()) {
      boolean[] arrayOfBoolean = new boolean[this.Zx.getRowCount()];
      arrayOfBoolean[i] = true;
      this.Zn.ZJ((byte)2, arrayOfBoolean, this);
    } 
    this.Zc.setSelected(true);
  }
  
  private void Zy() {
    this.Zd = new Ze01();
    this.ZQ = new Ze01();
    this.ZB = new Ze01();
    this.Zc = new Zzdy();
    this.Zr = new Ze01();
    this.ZO = new Ze01();
    this.ZF = new Ze01();
    this.Za = new Ze01();
    this.ZK = new Zm99();
    this.ZU = new Zgff();
    this.Zy = new Zmyw();
    this.ZL = new Zbup();
    this.Zh = new Zl8w();
    this.Zo = new Zbkc();
    this.ZA = new Zbkk();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zd.setText(a(-20585, -24509));
    this.Zd.setName(a(-20563, -26991));
    this.Zd.setToolTipText(a(-20557, 25243));
    this.Zd.addActionListener(new Ztjp(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zd, gridBagConstraints);
    this.ZQ.setText(a(-20553, 26016));
    this.ZQ.setToolTipText(a(-20590, 17162));
    this.ZQ.addActionListener(new Zxge(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZQ, gridBagConstraints);
    this.ZB.setText(a(-20547, 18341));
    this.ZB.setToolTipText(a(-20548, 7540));
    this.ZB.addActionListener(new Zm1t(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZB, gridBagConstraints);
    this.Zc.setText(a(-20555, -23159));
    this.Zc.addActionListener(new Zr9s(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.Zc, gridBagConstraints);
    this.Zr.setText(a(-20575, 30799));
    this.Zr.setToolTipText(a(-20574, -71));
    this.Zr.setIconTextGap(0);
    this.Zr.addActionListener(new Zreb(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zr, gridBagConstraints);
    this.ZO.setText(a(-20573, -14090));
    this.ZO.setToolTipText(a(-20550, -2188));
    this.ZO.setIconTextGap(0);
    this.ZO.addActionListener(new Zrsl(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZO, gridBagConstraints);
    this.ZF.setText(a(-20578, -12036));
    this.ZF.setToolTipText(a(-20569, -21260));
    this.ZF.setIconTextGap(0);
    this.ZF.addActionListener(new Zlcp(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZF, gridBagConstraints);
    this.Za.setText(a(-20576, -19227));
    this.Za.setToolTipText(a(-20551, 17158));
    this.Za.addActionListener(new Zl1x(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Za, gridBagConstraints);
    this.ZK.setText(a(-20583, -21048));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZK, gridBagConstraints);
    this.ZU.setColumns(5);
    this.ZU.ZH(Zlw9.NUMBER);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZU, gridBagConstraints);
    this.Zy.setLeftComponent(this.ZL);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 13;
    gridBagConstraints.fill = 1;
    add(this.Zy, gridBagConstraints);
    this.Zh.setText(a(-20568, 23508));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zh, gridBagConstraints);
    this.Zo.Zx(a(-20549, -19153));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 21;
    add(this.Zo, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.anchor = 23;
    add(this.ZA, gridBagConstraints);
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    if (this.Zx.getRowCount() == 0)
      return; 
    if (!Zx6o.ZY(this, a(-20567, -19749)))
      return; 
    int i = this.Zx.getRowCount();
    this.Zx.ZS();
    if (ZJ()) {
      boolean[] arrayOfBoolean = new boolean[i];
      Arrays.fill(arrayOfBoolean, true);
      this.Zn.ZM((byte)2, arrayOfBoolean, this);
    } 
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    ZM();
  }
  
  private void Zf(ActionEvent paramActionEvent) {
    Zm3l zm3l = this.ZR.ZJ();
    ZN(zm3l.ZI(), Zz96.ZA(zm3l.ZY.ZiD()), this.ZD);
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    boolean[] arrayOfBoolean;
    int i = Zbyw.Zp();
    if (this.ZH) {
      arrayOfBoolean = new boolean[this.Zx.getRowCount()];
      Arrays.fill(arrayOfBoolean, true);
      if (this.Zc.isSelected()) {
        this.Zn.ZA((byte)2, arrayOfBoolean, this);
        if (i == 0) {
          this.Zn.ZM((byte)2, arrayOfBoolean, this);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    this.Zn.ZM((byte)2, arrayOfBoolean, this);
  }
  
  private void Zv(ActionEvent paramActionEvent) {
    Zw();
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    ZE();
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    Zu();
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    ZX();
  }
  
  public void ZP(Zb_j paramZb_j) {
    int i = Zbyw.Zp();
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    paramZb_j.ZR(Zeew.INTRUDER, a(-20558, 13905), this.Zc.isSelected() ? a(-20580, -31078) : a(-20554, -3562));
    paramZb_j.ZR(Zeew.INTRUDER, a(-20562, 27404), this.ZU.getText());
    List<Zkk3> list = this.Zx.ZL();
    int j = 0;
    while (j < list.size()) {
      try {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        zipOutputStream.putNextEntry(new ZipEntry(a(-20589, 20962)));
        Zxpa zxpa = new Zxpa(zipOutputStream);
        zxpa.ZX(a(-20584, 5854), list.get(j));
        zipOutputStream.close();
        paramZb_j.ZR(Zeew.INTRUDER, a(-20552, -17557) + a(-20552, -17557), new String(Zvy.ZZ(byteArrayOutputStream.toByteArray())));
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      j++;
      if (i == 0)
        break; 
    } 
    j = list.size();
    while (paramZb_j.Za(Zeew.INTRUDER, a(-20545, -12276) + a(-20545, -12276))) {
      j++;
      if (i == 0)
        break; 
    } 
    try {
      if (list.isEmpty())
        paramZb_j.ZR(Zeew.INTRUDER, a(-20556, 26233), a(-20587, 11377)); 
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  public void Zs(Zb_j paramZb_j) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   8: sipush #-20564
    //   11: sipush #20754
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   22: astore_3
    //   23: aload_3
    //   24: ifnonnull -> 46
    //   27: aload_0
    //   28: getfield Zc : Lburp/Zzdy;
    //   31: iconst_0
    //   32: invokevirtual setSelected : (Z)V
    //   35: iload_2
    //   36: ifne -> 73
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_0
    //   47: getfield Zc : Lburp/Zzdy;
    //   50: aload_3
    //   51: sipush #-20602
    //   54: sipush #8203
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: invokevirtual equals : (Ljava/lang/Object;)Z
    //   63: invokevirtual setSelected : (Z)V
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: aload_1
    //   74: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   77: sipush #-20570
    //   80: sipush #19543
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   91: astore_3
    //   92: aload_0
    //   93: getfield ZU : Lburp/Zgff;
    //   96: aload_3
    //   97: sipush #-20577
    //   100: sipush #-29052
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokestatic requireNonNullElse : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   109: checkcast java/lang/String
    //   112: invokevirtual setText : (Ljava/lang/String;)V
    //   115: aload_0
    //   116: getfield Zx : Lburp/Zt0_;
    //   119: invokevirtual ZL : ()Ljava/util/List;
    //   122: invokeinterface clear : ()V
    //   127: aload_1
    //   128: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   131: sipush #-20586
    //   134: sipush #26008
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   145: astore #4
    //   147: aload #4
    //   149: ifnonnull -> 589
    //   152: aload_1
    //   153: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   156: sipush #-20582
    //   159: sipush #-20332
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   170: astore #5
    //   172: aload #5
    //   174: ifnonnull -> 192
    //   177: aload_0
    //   178: invokevirtual ZB : ()V
    //   181: iload_2
    //   182: ifne -> 585
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: aload_1
    //   193: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   196: sipush #-20591
    //   199: sipush #9510
    //   202: invokestatic a : (II)Ljava/lang/String;
    //   205: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   210: astore_3
    //   211: aload_3
    //   212: ifnull -> 238
    //   215: aload_3
    //   216: sipush #-20602
    //   219: sipush #8203
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   228: ifeq -> 246
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   237: athrow
    //   238: iconst_1
    //   239: goto -> 247
    //   242: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   245: athrow
    //   246: iconst_0
    //   247: istore #6
    //   249: aload_1
    //   250: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   253: sipush #-20560
    //   256: sipush #-11704
    //   259: invokestatic a : (II)Ljava/lang/String;
    //   262: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   267: astore_3
    //   268: aload_3
    //   269: ifnonnull -> 281
    //   272: ldc ''
    //   274: goto -> 282
    //   277: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   280: athrow
    //   281: aload_3
    //   282: astore #7
    //   284: aload_1
    //   285: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   288: sipush #-20588
    //   291: sipush #-17004
    //   294: invokestatic a : (II)Ljava/lang/String;
    //   297: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   302: astore_3
    //   303: aload_3
    //   304: ifnull -> 330
    //   307: aload_3
    //   308: sipush #-20602
    //   311: sipush #8203
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: invokevirtual equals : (Ljava/lang/Object;)Z
    //   320: ifeq -> 338
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   329: athrow
    //   330: iconst_1
    //   331: goto -> 339
    //   334: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   337: athrow
    //   338: iconst_0
    //   339: istore #8
    //   341: aload_1
    //   342: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   345: sipush #-20559
    //   348: sipush #-3403
    //   351: invokestatic a : (II)Ljava/lang/String;
    //   354: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   359: astore_3
    //   360: aload_3
    //   361: ifnull -> 387
    //   364: aload_3
    //   365: sipush #-20602
    //   368: sipush #8203
    //   371: invokestatic a : (II)Ljava/lang/String;
    //   374: invokevirtual equals : (Ljava/lang/Object;)Z
    //   377: ifeq -> 395
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   386: athrow
    //   387: iconst_1
    //   388: goto -> 396
    //   391: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   394: athrow
    //   395: iconst_0
    //   396: istore #9
    //   398: aload_0
    //   399: getfield ZU : Lburp/Zgff;
    //   402: invokevirtual getText : ()Ljava/lang/String;
    //   405: invokestatic parseInt : (Ljava/lang/String;)I
    //   408: istore #10
    //   410: iconst_0
    //   411: istore #11
    //   413: aload_1
    //   414: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   417: iload #11
    //   419: sipush #-20581
    //   422: sipush #-26715
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: swap
    //   429: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   434: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   439: dup
    //   440: astore #12
    //   442: ifnull -> 585
    //   445: iload #9
    //   447: ifeq -> 510
    //   450: aload_0
    //   451: getfield Zx : Lburp/Zt0_;
    //   454: new burp/Zkk3
    //   457: dup
    //   458: aload #12
    //   460: invokestatic Zy : (Ljava/lang/String;)[B
    //   463: aload #7
    //   465: invokestatic Zy : (Ljava/lang/String;)[B
    //   468: iload #8
    //   470: aload_0
    //   471: getfield Zb : Lburp/Zr_4;
    //   474: new burp/Zxlb
    //   477: dup
    //   478: invokespecial <init> : ()V
    //   481: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   486: checkcast burp/Zg05
    //   489: aload_0
    //   490: getfield Zb : Lburp/Zr_4;
    //   493: invokespecial <init> : ([B[BZLburp/Zg05;Lburp/Zr_4;)V
    //   496: invokevirtual Zr : (Ljava/lang/Object;)V
    //   499: iload_2
    //   500: ifne -> 565
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   509: athrow
    //   510: aload_0
    //   511: getfield Zx : Lburp/Zt0_;
    //   514: new burp/Zkk3
    //   517: dup
    //   518: aload #12
    //   520: iload #6
    //   522: aload #7
    //   524: invokestatic Zy : (Ljava/lang/String;)[B
    //   527: iload #8
    //   529: aload_0
    //   530: getfield Zb : Lburp/Zr_4;
    //   533: new burp/Zxlb
    //   536: dup
    //   537: invokespecial <init> : ()V
    //   540: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   545: checkcast burp/Zg05
    //   548: aload_0
    //   549: getfield Zb : Lburp/Zr_4;
    //   552: invokespecial <init> : (Ljava/lang/String;Z[BZLburp/Zg05;Lburp/Zr_4;)V
    //   555: invokevirtual Zr : (Ljava/lang/Object;)V
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   564: athrow
    //   565: goto -> 578
    //   568: astore #13
    //   570: aload #13
    //   572: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   575: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   578: iinc #11, 1
    //   581: iload_2
    //   582: ifne -> 413
    //   585: iload_2
    //   586: ifne -> 760
    //   589: sipush #-20571
    //   592: sipush #-26709
    //   595: invokestatic a : (II)Ljava/lang/String;
    //   598: aload #4
    //   600: invokevirtual equals : (Ljava/lang/Object;)Z
    //   603: ifne -> 760
    //   606: goto -> 613
    //   609: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   612: athrow
    //   613: iconst_0
    //   614: istore #5
    //   616: aload_1
    //   617: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   620: iload #5
    //   622: sipush #-20545
    //   625: sipush #-12276
    //   628: invokestatic a : (II)Ljava/lang/String;
    //   631: swap
    //   632: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   637: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   642: dup
    //   643: astore #6
    //   645: ifnull -> 760
    //   648: new java/io/ByteArrayInputStream
    //   651: dup
    //   652: aload #6
    //   654: invokevirtual getBytes : ()[B
    //   657: invokestatic Zt : ([B)[B
    //   660: invokespecial <init> : ([B)V
    //   663: astore #7
    //   665: sipush #-20584
    //   668: new java/util/zip/ZipInputStream
    //   671: dup
    //   672: aload #7
    //   674: invokespecial <init> : (Ljava/io/InputStream;)V
    //   677: astore #8
    //   679: sipush #5854
    //   682: aload #8
    //   684: invokevirtual getNextEntry : ()Ljava/util/zip/ZipEntry;
    //   687: pop
    //   688: new burp/Zxyn
    //   691: dup
    //   692: aload #8
    //   694: ldc ''
    //   696: aload_0
    //   697: getfield Zb : Lburp/Zr_4;
    //   700: invokespecial <init> : (Ljava/io/InputStream;Ljava/lang/String;Lburp/Zr_4;)V
    //   703: astore #9
    //   705: invokestatic a : (II)Ljava/lang/String;
    //   708: aload #9
    //   710: aload_0
    //   711: getfield Zb : Lburp/Zr_4;
    //   714: invokestatic Za : (Ljava/lang/String;Lburp/Zgyp;Lburp/Zr_4;)Lburp/Zkk3;
    //   717: astore #10
    //   719: aload #10
    //   721: ifnull -> 740
    //   724: aload_0
    //   725: getfield Zx : Lburp/Zt0_;
    //   728: aload #10
    //   730: invokevirtual Zr : (Ljava/lang/Object;)V
    //   733: goto -> 740
    //   736: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   739: athrow
    //   740: goto -> 753
    //   743: astore #7
    //   745: aload #7
    //   747: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   750: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   753: iinc #5, 1
    //   756: iload_2
    //   757: ifne -> 616
    //   760: aload_0
    //   761: getfield Zx : Lburp/Zt0_;
    //   764: invokevirtual fireTableDataChanged : ()V
    //   767: return
    // Exception table:
    //   from	to	target	type
    //   23	39	42	java/lang/Exception
    //   27	66	69	java/lang/Exception
    //   172	185	188	java/lang/Exception
    //   211	231	234	java/lang/Exception
    //   215	242	242	java/lang/Exception
    //   268	277	277	java/lang/Exception
    //   303	323	326	java/lang/Exception
    //   307	334	334	java/lang/Exception
    //   360	380	383	java/lang/Exception
    //   364	391	391	java/lang/Exception
    //   445	503	506	java/lang/Exception
    //   445	565	568	java/lang/Exception
    //   450	558	561	java/lang/Exception
    //   585	606	609	java/lang/Exception
    //   648	740	743	java/lang/Exception
    //   719	733	736	java/lang/Exception
  }
  
  private void ZB() {
    this.Zx.ZL().clear();
    this.Zx.fireTableDataChanged();
  }
  
  public void ZNH() {
    ZB();
    this.Zc.setSelected(false);
    this.ZU.setText(a(-20561, -22696));
  }
  
  private static Zg05[] lambda$getExtractorModels$0(int paramInt) {
    return new Zg05[paramInt];
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #49
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÚÇMÃ_Ç þ,>Ë²ÿ;bxr\\bGÃ/05+ÿ ¶Z£Íc:ðµ©³L(T ¤wâÜâ@èÜÅô[Ñ_°\\f\\t»'Õõ×ðïôNX®5ÒÜôF¯~{VÕxÞ^µ_\\t§CæÄÔõ¡Þ3Ò¥Å'äÆ¨?Þ]?6øø×!t\\rÿÿ3÷>³¬Ûý¯"êzZÆáµrÃÈ½®°ÜÔ\ÒpZ«¦-êi òñÔX~ â0l¾Òey0û­¬2û<áLi­t÷" \\tnó§tkû»7¨óz÷:9ç'ÑM°³q¨~-ìÎè_pM/ÿxà1/¡"|ðZJÃÄ`òÞ4ÑOõ¡CzÊ Ðqxìªðkå !äJVD2LÖé¶Á/câ-VSh,ÊUøMsÍPÒt®ü\\fb !NQOG3âàù¾\\t[é±taãY¿p[x0\\füôIÖÔ8ýÊ³'ûju&\\t1r'ü¶ÆzµÃ¦I½°ëÜ£ÖÂæþ+¼¤úÚ*Ý(&úDVK$\)¢å·SéÉÅ½ÖáKÐ­¢,/}òýWs» ¿éòMæ¦þë\\b$ÊéHddVLu+&vròÕ´løaT,¾¼ÂlcËrî³fÍ<ÒÚ¿íCC°ÚìßÃíh>ÒYq¬ÛK×\ÍêOCü[K\\fFÈ2ðâåÄà¿ã=0ÙQi¬£*£U¬Ã¬½B,6!ÇúíÑ¾á2UÏÇöºÏX°íid<2êðÆ(öÔÍ+´2©Ç¨çñB:¶ìøði¶qÙ¿íòÒëÏ¨>xz·"k[SlcO«¡¥ZuOàþÎÀçõ!y{£Åºèå0þ\\tÏF#3]5Mh"¨©Me)wjàÉÕTúCÍçþ\\tÃ\\to×køíø«ô_f<LßÇ~¼$&òûF8,tèÀh`N÷e÷h ».Xq²\\b\\nk\\t¶Ï* qMi8Ú1ï4æ<<¸òu Êm¹¸Ì,sI,"I¹gfOÖþGÀÖÓ-±q6þ²¼#\\t¿>ÉÀ0ÖÍ¹\\t÷dÂÞN®'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #46
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
    //   67: ldc 'Éãè6KÙºÝk×Ô*.\\fn)$Ê§¸X'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #23
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #51
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
    //   128: putstatic burp/Zbme.a : [Ljava/lang/String;
    //   131: bipush #49
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbme.b : [Ljava/lang/String;
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
    //   212: bipush #81
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #17
    //   224: goto -> 244
    //   227: bipush #66
    //   229: goto -> 244
    //   232: bipush #39
    //   234: goto -> 244
    //   237: bipush #122
    //   239: goto -> 244
    //   242: bipush #91
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
    int i = (paramInt1 ^ 0xFFFFAFB6) & 0xFFFF;
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
      char c = 'Ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */