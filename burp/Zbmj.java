package burp;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbmj extends Zbv5 implements Zsnh {
  private final Zmu3 Zk;
  
  private final boolean ZA;
  
  private boolean Zl;
  
  private boolean ZT;
  
  private boolean Zn;
  
  private Zbkc Zj;
  
  private Zm99 ZB;
  
  private Zm99 Zy;
  
  private Zm99 Zs;
  
  private Zedd Zw;
  
  private Zzdy ZF;
  
  private Zzdy Zd;
  
  private Zzdy ZP;
  
  private Zzdy Zz;
  
  private Zzdy ZX;
  
  private Zzdy Za;
  
  private Zzdy Zh;
  
  private Zzdy Zc;
  
  private Zzdy ZM;
  
  private Zzdy ZG;
  
  private Zedd Zb;
  
  private Zm99 Zu;
  
  private Zl8w ZL;
  
  private Zm9v Zo;
  
  private Zm9v Zi;
  
  private Zm99 ZE;
  
  private Zm9v ZW;
  
  private Zm9v Zt;
  
  private Zm99 Zr;
  
  private Zm99 ZV;
  
  private Zm99 Zx;
  
  private Zbkc ZN;
  
  private Zm99 Z_;
  
  private Zg85 ZO;
  
  private Zgfo ZJ;
  
  private Zgfo Zm;
  
  private Zgfo ZI;
  
  private static int ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbmj(Zmu3 paramZmu3, boolean paramBoolean) {
    this.ZA = paramBoolean;
    this.Zk = paramZmu3;
    Zt();
    this.ZX.setVisible(true);
    this.Za.setVisible(true);
    this.Za.setEnabled(paramZmu3.Ztv());
    this.ZO.setEditable(true);
    this.ZO.addKeyListener(new Zgda(this, paramZmu3));
    this.ZP.setSelected(paramZmu3.ZtY());
    Z_((ActionEvent)null);
    int i = Zca();
    this.Zi.setVisible(false);
    this.ZJ.setEnabled(true);
    this.Zo.setVisible(false);
    Objects.requireNonNull(paramZmu3);
    this.ZJ.Zu(paramZmu3::ZZ, this::ZO, 1, 50000);
    this.Zm.setEnabled(true);
    this.ZW.setVisible(false);
    Objects.requireNonNull(paramZmu3);
    this.Zm.Zu(paramZmu3::Zo, this::ZB, 1, 50000);
    Objects.requireNonNull(paramZmu3);
    this.ZI.Zu(paramZmu3::ZA, this::ZU, 1, 50000);
    this.Zt.setVisible(false);
    Zt4o[] arrayOfZt4o = Zt4o.values();
    int j = arrayOfZt4o.length;
    byte b = 0;
    while (b < j) {
      Zt4o zt4o = arrayOfZt4o[b];
      this.Zw.addItem(zt4o.displayLabel);
      b++;
      if (i != 0)
        break; 
    } 
    Zt4o zt4o1 = paramZmu3.ZtJ();
    Zt4o zt4o2 = paramZmu3.Ztk() ? Zt4o.USE : Zt4o.DONT_USE;
    this.Zw.setSelectedItem((zt4o1 == null) ? zt4o2.displayLabel : zt4o1.displayLabel);
    Arrays.<Zszj>stream(Zszj.values()).sorted(Comparator.comparing(Zszj::ZT).reversed()).forEach(this::lambda$new$0);
    this.Zb.setSelectedItem((paramZmu3.ZtD() == null) ? Zszj.DEFAULT : paramZmu3.ZtD());
    if (!paramBoolean) {
      this.ZG.setEnabled(false);
      this.ZP.setEnabled(false);
      this.Zu.setEnabled(false);
      this.ZO.setEnabled(false);
      this.Zh.setEnabled(false);
      this.Zc.setEnabled(false);
      this.ZJ.setEnabled(false);
      this.Zr.setEnabled(false);
      this.Zz.setEnabled(false);
      this.ZX.setEnabled(false);
      this.Za.setEnabled(false);
      this.Zd.setEnabled(false);
      this.ZM.setEnabled(false);
      this.Zm.setEnabled(false);
      this.ZV.setEnabled(false);
      this.Zb.setEnabled(false);
      this.Zw.setEnabled(false);
      this.ZF.setEnabled(false);
      this.Zx.setEnabled(false);
      this.ZI.setEnabled(false);
    } 
    this.ZG.setName(a(4452, 2689));
  }
  
  private void Zt() {
    this.ZN = new Zbkc();
    this.ZL = new Zl8w();
    this.ZG = new Zzdy();
    this.ZP = new Zzdy();
    this.Zu = new Zm99();
    this.ZO = new Zg85();
    this.Zi = new Zm9v();
    this.ZB = new Zm99();
    this.Zy = new Zm99();
    this.Zh = new Zzdy();
    this.Zc = new Zzdy();
    this.Zr = new Zm99();
    this.Zo = new Zm9v();
    this.ZJ = new Zgfo();
    this.ZM = new Zzdy();
    this.ZV = new Zm99();
    this.Zm = new Zgfo();
    this.Zt = new Zm9v();
    this.ZF = new Zzdy();
    this.Zx = new Zm99();
    this.ZW = new Zm9v();
    this.ZI = new Zgfo();
    this.Zw = new Zedd();
    this.Z_ = new Zm99();
    this.Zj = new Zbkc();
    this.Zz = new Zzdy();
    this.Zd = new Zzdy();
    this.ZE = new Zm99();
    this.Zb = new Zedd();
    this.ZX = new Zzdy();
    this.Za = new Zzdy();
    this.Zs = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZN.Zx(a(4475, -5367));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 21;
    add(this.ZN, gridBagConstraints);
    this.ZL.setText(a(4466, 7837));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZL, gridBagConstraints);
    this.ZG.setText(a(4468, -15232));
    this.ZG.addActionListener(new Zge5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    add(this.ZG, gridBagConstraints);
    this.ZP.setText(a(4448, 11905));
    this.ZP.addActionListener(new Zrck(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    add(this.ZP, gridBagConstraints);
    this.ZP.getAccessibleContext().setAccessibleName(a(4476, -32473));
    this.Zu.setText(a(4450, -13718));
    this.Zu.setToolTipText("");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zu, gridBagConstraints);
    this.ZO.setColumns(10);
    this.ZO.setFocusable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZO, gridBagConstraints);
    this.Zi.setText(a(4456, 28243));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 1280;
    add(this.Zi, gridBagConstraints);
    this.ZB.setText(a(4469, -11599));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    add(this.ZB, gridBagConstraints);
    this.Zy.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    add(this.Zy, gridBagConstraints);
    this.Zh.setText(a(4459, -16412));
    this.Zh.addActionListener(new Zb30(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    add(this.Zh, gridBagConstraints);
    this.Zc.setText(a(4462, -28727));
    this.Zc.addActionListener(new Zm8z(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    add(this.Zc, gridBagConstraints);
    this.Zr.setText(a(4458, 25593));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 1280;
    add(this.Zr, gridBagConstraints);
    this.Zo.setText(a(4474, 28797));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zo, gridBagConstraints);
    this.ZJ.setColumns(10);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZJ, gridBagConstraints);
    this.ZM.setText(a(4460, -24955));
    this.ZM.addActionListener(new Zx52(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    add(this.ZM, gridBagConstraints);
    this.ZV.setText(a(4473, 27147));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 1280;
    add(this.ZV, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zm, gridBagConstraints);
    this.Zt.setText(a(4474, 28797));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 46;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zt, gridBagConstraints);
    this.ZF.setText(a(4472, 11518));
    this.ZF.setMaximumSize(new Dimension(2147483647, 2147483647));
    this.ZF.setMinimumSize(new Dimension(199, 2826));
    this.ZF.addActionListener(new Zl5l(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 42;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.anchor = 23;
    add(this.ZF, gridBagConstraints);
    this.Zx.setText(a(4453, -20619));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 44;
    gridBagConstraints.anchor = 1280;
    add(this.Zx, gridBagConstraints);
    this.ZW.setText(a(4474, 28797));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 44;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZI, gridBagConstraints);
    this.Zw.addActionListener(new Zxyk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 40;
    gridBagConstraints.fill = 2;
    add(this.Zw, gridBagConstraints);
    this.Z_.setText(a(4471, -14462));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 40;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Z_, gridBagConstraints);
    this.Zj.Zx(a(4449, 6481));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 38;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 21;
    add(this.Zj, gridBagConstraints);
    this.Zz.setText(a(4477, 14205));
    this.Zz.addActionListener(new Ztk_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    add(this.Zz, gridBagConstraints);
    this.Zd.setText(a(4461, -8194));
    this.Zd.addActionListener(new Zz0_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    add(this.Zd, gridBagConstraints);
    this.ZE.setText(a(4465, -19669));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 36;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZE, gridBagConstraints);
    this.Zb.addActionListener(new Zzrw(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 36;
    gridBagConstraints.fill = 2;
    add(this.Zb, gridBagConstraints);
    this.ZX.setText(a(4463, -23410));
    this.ZX.addActionListener(new Ztmo(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 30;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    add(this.ZX, gridBagConstraints);
    this.Za.setText(a(4470, -8575));
    this.Za.addActionListener(new Zg3z(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 32;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 23;
    add(this.Za, gridBagConstraints);
    this.Zs.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 34;
    add(this.Zs, gridBagConstraints);
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    this.Zk.Zt(this.ZG.isSelected());
  }
  
  private void Z_(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZcA : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZP : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifne -> 34
    //   14: aload_0
    //   15: getfield Zu : Lburp/Zm99;
    //   18: iconst_0
    //   19: invokevirtual setEnabled : (Z)V
    //   22: aload_0
    //   23: getfield ZO : Lburp/Zg85;
    //   26: iconst_0
    //   27: invokevirtual setEnabled : (Z)V
    //   30: iload_2
    //   31: ifne -> 50
    //   34: aload_0
    //   35: getfield Zu : Lburp/Zm99;
    //   38: iconst_1
    //   39: invokevirtual setEnabled : (Z)V
    //   42: aload_0
    //   43: getfield ZO : Lburp/Zg85;
    //   46: iconst_1
    //   47: invokevirtual setEnabled : (Z)V
    //   50: aload_0
    //   51: getfield Zk : Lburp/Zmu3;
    //   54: aload_0
    //   55: getfield ZP : Lburp/Zzdy;
    //   58: invokevirtual isSelected : ()Z
    //   61: invokeinterface ZI : (Z)V
    //   66: return
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZcA : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zh : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 52
    //   14: aload_0
    //   15: getfield Zc : Lburp/Zzdy;
    //   18: iconst_1
    //   19: invokevirtual setEnabled : (Z)V
    //   22: aload_0
    //   23: getfield Zc : Lburp/Zzdy;
    //   26: invokevirtual isSelected : ()Z
    //   29: ifeq -> 76
    //   32: aload_0
    //   33: getfield Zr : Lburp/Zm99;
    //   36: iconst_1
    //   37: invokevirtual setEnabled : (Z)V
    //   40: aload_0
    //   41: getfield ZJ : Lburp/Zgfo;
    //   44: iconst_1
    //   45: invokevirtual setEnabled : (Z)V
    //   48: iload_2
    //   49: ifne -> 76
    //   52: aload_0
    //   53: getfield Zc : Lburp/Zzdy;
    //   56: iconst_0
    //   57: invokevirtual setEnabled : (Z)V
    //   60: aload_0
    //   61: getfield Zr : Lburp/Zm99;
    //   64: iconst_0
    //   65: invokevirtual setEnabled : (Z)V
    //   68: aload_0
    //   69: getfield ZJ : Lburp/Zgfo;
    //   72: iconst_0
    //   73: invokevirtual setEnabled : (Z)V
    //   76: aload_0
    //   77: getfield Zk : Lburp/Zmu3;
    //   80: aload_0
    //   81: getfield Zh : Lburp/Zzdy;
    //   84: invokevirtual isSelected : ()Z
    //   87: invokeinterface Zf : (Z)V
    //   92: return
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zca : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zc : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 34
    //   14: aload_0
    //   15: getfield Zr : Lburp/Zm99;
    //   18: iconst_1
    //   19: invokevirtual setEnabled : (Z)V
    //   22: aload_0
    //   23: getfield ZJ : Lburp/Zgfo;
    //   26: iconst_1
    //   27: invokevirtual setEnabled : (Z)V
    //   30: iload_2
    //   31: ifeq -> 50
    //   34: aload_0
    //   35: getfield Zr : Lburp/Zm99;
    //   38: iconst_0
    //   39: invokevirtual setEnabled : (Z)V
    //   42: aload_0
    //   43: getfield ZJ : Lburp/Zgfo;
    //   46: iconst_0
    //   47: invokevirtual setEnabled : (Z)V
    //   50: aload_0
    //   51: getfield Zk : Lburp/Zmu3;
    //   54: aload_0
    //   55: getfield Zc : Lburp/Zzdy;
    //   58: invokevirtual isSelected : ()Z
    //   61: invokeinterface Zj : (Z)V
    //   66: return
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZcA : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZM : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 34
    //   14: aload_0
    //   15: getfield ZV : Lburp/Zm99;
    //   18: iconst_1
    //   19: invokevirtual setEnabled : (Z)V
    //   22: aload_0
    //   23: getfield Zm : Lburp/Zgfo;
    //   26: iconst_1
    //   27: invokevirtual setEnabled : (Z)V
    //   30: iload_2
    //   31: ifne -> 50
    //   34: aload_0
    //   35: getfield ZV : Lburp/Zm99;
    //   38: iconst_0
    //   39: invokevirtual setEnabled : (Z)V
    //   42: aload_0
    //   43: getfield Zm : Lburp/Zgfo;
    //   46: iconst_0
    //   47: invokevirtual setEnabled : (Z)V
    //   50: aload_0
    //   51: getfield Zk : Lburp/Zmu3;
    //   54: aload_0
    //   55: getfield ZM : Lburp/Zzdy;
    //   58: invokevirtual isSelected : ()Z
    //   61: invokeinterface ZL : (Z)V
    //   66: return
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    this.Zk.Zp(this.ZF.isSelected());
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    Zc4();
  }
  
  private void Zc4() {
    Optional optional = Arrays.<Zt4o>stream(Zt4o.values()).filter(this::lambda$updateBrowserMode$1).findFirst();
    Zuh.Zb(optional.isPresent(), Zqf.Zr);
    optional.ifPresent(this::lambda$updateBrowserMode$2);
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    this.Zk.Zb(this.Zz.isSelected());
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    this.Zk.Zl(Zszj.Zv((String)this.Zb.getSelectedItem()));
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    this.Zk.Zn(this.Zd.isSelected());
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    boolean bool = this.ZX.isSelected();
    this.Zk.ZF(bool);
    this.Za.setEnabled(bool);
    if (!bool) {
      this.Za.setSelected(false);
      this.Zk.Zk(false);
    } 
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    this.Zk.Zk(this.Za.isSelected());
  }
  
  public String Zd() {
    // Byte code:
    //   0: invokestatic ZcA : ()I
    //   3: istore_1
    //   4: ldc ''
    //   6: astore_2
    //   7: aload_0
    //   8: getfield ZP : Lburp/Zzdy;
    //   11: invokevirtual isSelected : ()Z
    //   14: ifeq -> 50
    //   17: aload_0
    //   18: getfield ZO : Lburp/Zg85;
    //   21: invokevirtual getText : ()Ljava/lang/String;
    //   24: invokevirtual isEmpty : ()Z
    //   27: istore_3
    //   28: iload_3
    //   29: ifeq -> 42
    //   32: sipush #4454
    //   35: sipush #-10399
    //   38: invokestatic a : (II)Ljava/lang/String;
    //   41: astore_2
    //   42: aload_0
    //   43: getfield Zi : Lburp/Zm9v;
    //   46: iload_3
    //   47: invokevirtual setVisible : (Z)V
    //   50: aload_0
    //   51: getfield Zl : Z
    //   54: ifeq -> 71
    //   57: sipush #4464
    //   60: sipush #3324
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: astore_2
    //   67: iload_1
    //   68: ifne -> 109
    //   71: aload_0
    //   72: getfield ZT : Z
    //   75: ifeq -> 92
    //   78: sipush #4479
    //   81: sipush #14092
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: astore_2
    //   88: iload_1
    //   89: ifne -> 109
    //   92: aload_0
    //   93: getfield Zn : Z
    //   96: ifeq -> 109
    //   99: sipush #4451
    //   102: sipush #17729
    //   105: invokestatic a : (II)Ljava/lang/String;
    //   108: astore_2
    //   109: aload_2
    //   110: areturn
  }
  
  private void ZO(boolean paramBoolean) {
    this.Zl = !paramBoolean;
    this.Zo.setVisible(!paramBoolean);
  }
  
  private void ZB(boolean paramBoolean) {
    this.ZT = !paramBoolean;
    this.ZW.setVisible(!paramBoolean);
  }
  
  private void ZU(boolean paramBoolean) {
    this.Zn = !paramBoolean;
    this.Zt.setVisible(!paramBoolean);
  }
  
  public String ZZ() {
    return this.ZN.Zr();
  }
  
  public Zk97 ZR() {
    return Zk97.DESKTOP_SCANNING_CRAWL_OPTIONS_MISCELLANEOUS_CRAWL_SETTINGS;
  }
  
  public String Zq() {
    return a(4457, 10289);
  }
  
  public Zmf_ Zn() {
    Zzkm zzkm = new Zzkm();
    this.Zk.Zl(zzkm);
    return zzkm.ZV(new String[] { a(4455, -2611) });
  }
  
  public String ZE() {
    return a(4467, 10807);
  }
  
  public void Zt2() {
    this.ZG.setSelected(this.Zk.Zto());
    this.ZP.setSelected(this.Zk.ZtY());
    int i = Zca();
    if (this.ZA && this.ZP.isSelected()) {
      this.Zu.setEnabled(true);
      this.ZO.setEnabled(true);
    } 
    this.ZO.setText(this.Zk.Zt1());
    this.Zh.setSelected(this.Zk.ZtR());
    this.Zc.setSelected(this.Zk.ZtI());
    this.ZJ.ZM(this.Zk.Ztm());
    if (this.ZA && this.Zh.isSelected()) {
      this.Zc.setEnabled(true);
      if (this.Zc.isSelected()) {
        this.Zr.setEnabled(true);
        this.ZJ.setEnabled(true);
      } 
    } 
    this.ZM.setSelected(this.Zk.ZtW());
    this.Zm.ZM(this.Zk.ZtM());
    if (this.ZA && this.ZM.isSelected()) {
      this.ZV.setEnabled(true);
      this.Zm.setEnabled(true);
    } 
    this.Zz.setSelected(this.Zk.ZtN());
    boolean bool = this.Zk.Ztv();
    this.ZX.setSelected(bool);
    this.Za.setSelected(this.Zk.Ztn());
    this.Za.setEnabled((this.ZA && bool));
    Zt4o zt4o = this.Zk.ZtJ();
    if (zt4o == null)
      zt4o = this.Zk.Ztk() ? Zt4o.USE : Zt4o.DONT_USE; 
    boolean bool1 = (zt4o != Zt4o.DONT_USE) ? true : false;
    this.Zw.setSelectedItem(zt4o.displayLabel);
    this.Zb.setSelectedItem((this.Zk.ZtD() == null) ? Zszj.DEFAULT.Zt() : this.Zk.ZtD().Zt());
    this.ZF.setSelected(this.Zk.ZtA());
    this.ZF.setEnabled((this.ZA && bool1));
    this.Zd.setSelected(this.Zk.Ztj());
    this.Zd.setEnabled((this.ZA && bool1));
    this.ZI.ZM(this.Zk.Zt9());
    this.ZI.setEnabled((this.ZA && bool1));
    this.Zx.setEnabled((this.ZA && bool1));
    if (Zbqc.Zwu() == null)
      ZQ(++i); 
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  private void lambda$updateBrowserMode$2(Zt4o paramZt4o) {
    boolean bool = (paramZt4o != Zt4o.DONT_USE) ? true : false;
    this.ZF.setEnabled(bool);
    this.Zd.setEnabled(bool);
    this.Zx.setEnabled(bool);
    this.ZI.setEnabled(bool);
    this.Zk.Zb(paramZt4o);
  }
  
  private boolean lambda$updateBrowserMode$1(Zt4o paramZt4o) {
    return Zsw8.Zn((String)this.Zw.getSelectedItem(), paramZt4o.displayLabel);
  }
  
  private void lambda$new$0(Zszj paramZszj) {
    this.Zb.addItem(paramZszj.Zt());
  }
  
  public static void ZQ(int paramInt) {
    ZY = paramInt;
  }
  
  public static int ZcA() {
    return ZY;
  }
  
  public static int Zca() {
    int i = ZcA();
    return (i == 0) ? 80 : 0;
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: bipush #75
    //   11: ldc '¸Ërd·.üt(]=¤K÷Ã}6Úú1|ûðeª?Ý¢\§ãøÒQ6ÚÉKg«ªû².ÉÀWB{õÙ÷-¯ÀÜ¡aG?va<o¯O_+"å¿F8²øäA Öy×Üü¼Pb~½u_}vÏ--J¨Õ¤;¢{<^å×}jI/H nNÄÔbÐ+Cµ°Q·Ä"'$Øà÷TlÀ¬MCF\lé{éª½z¤(ÓxÚù°UA¼ EÚ¥Ïf=âÂæ9·!*}^C¨IíæÊu[¿á*BRhP®½×±Oy|\\tV5S²X;´oD3¸Ë"ÿ-à¦C¿\\ruiØOQ9îz,jñëNßÑò&ú£ÉJ?ù\\n9²\\t'ÌReÎ(éAûþ\\nàb8öWSÝi|ðàt-]H\Ü(Ò@P*(ôÞ¸ªYô\\tH³Ê`X\\bÔdwý-S©Z|Ú.ìðPóhÅÙ²($­r¡}z}zÜD;cwy ~qJ·ED·çõ¼.Ø«¸®¹ðß(×c|¦C>Æâ\\f*]>UÅ¹t*áÀÅþ\\rìDáW&]èÒ¯Ó2³JQ_­ê<OïóäÿRârº<àEò}ã÷ø½BµJ6ÍU¢ld\\fÏ©.«8vÀ`*Üv%ròS¥wZê¼|9ºLÕy&(³c3#C-Kæ"²§5\\tv=7Ùâæùq®I nþ¸©gèþú~±Òb| ì¾â7W8låÊ_îþàæ(;JëË`°÷nø,\\bRØ\\f:´0á\\f&LxaT$g^m@ã5È&ê÷©ÙæØ;8â'þË­7bÁú\û\\fÜZ ]ÍëØ·£¹¥&¹n"h}Û82¥FÆVDÿõ s·¬=.\\f'ïOrDË\\b¶êñJÉj|Â8÷æäÉHy\\n½÷3;¥sv2nkâÜxü_»Q3ÿTP=ó9Ì­¿l,ÛýYc½[br»²n|p¹~ q|l·±Dâlö¼Ü¦>c\\bÝ¶¤åÒ4dY\\r§¦4kêOX\\r¨§w¾>vh°}1¦ï°ì\\f9^]*V}m¤s$'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic ZQ : (I)V
    //   23: bipush #14
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #29
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc '\\nú-»õ9ð\\r!\\fKß¸ý#;ÂÇÙÂÉ¬Å¬{Õg£¾¸\\rüøX&£¦»PÈ#«^æ²V\\n\\tëGeÖ(Á=\\nÿu¡©w¹õ'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #20
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #39
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic burp/Zbmj.a : [Ljava/lang/String;
    //   137: bipush #31
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zbmj.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #47
    //   218: goto -> 248
    //   221: bipush #51
    //   223: goto -> 248
    //   226: bipush #59
    //   228: goto -> 248
    //   231: bipush #120
    //   233: goto -> 248
    //   236: bipush #71
    //   238: goto -> 248
    //   241: bipush #69
    //   243: goto -> 248
    //   246: bipush #23
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1161) & 0xFFFF;
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
      byte b1 = 0;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbmj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */