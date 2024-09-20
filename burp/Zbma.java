package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import javax.swing.JSeparator;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zbma extends Zbv5 implements MouseListener, Zzyl, Zg0 {
  private final Zrnm Zd;
  
  private final Supplier<Zbiv> ZJ;
  
  private final Zgb6 ZO;
  
  private final Zb0h Zr;
  
  private final Zbnt ZU;
  
  private final Ztr7 ZW;
  
  private final Ztwv ZV;
  
  private final Zr_4 ZQ;
  
  private final Zr_4 Zv;
  
  private final Zkr6 Z_;
  
  private final Zgso ZC;
  
  private final Zmzn Zc;
  
  private final Zmzn Zz;
  
  private final Zey9 Zm;
  
  private int ZD;
  
  private Zbkv Zo;
  
  private Zm2o ZM;
  
  private Zbkc Zx;
  
  private Zbqc Zl;
  
  private Zzdy ZN;
  
  private Ze01 ZA;
  
  private Ze01 ZX;
  
  private Ze01 ZP;
  
  private Ze01 ZR;
  
  private Ze01 ZT;
  
  private Zl8w Zb;
  
  private Zm99 Zs;
  
  private Zm99 Zy;
  
  private Zm99 Zh;
  
  private Zm9e ZY;
  
  private Zbqc ZS;
  
  private Zgff ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbma(Zrnm paramZrnm, Supplier<Zbiv> paramSupplier, Zgb6 paramZgb6, Zb0h paramZb0h, Zbnt paramZbnt, Ztwv paramZtwv, Zkl6 paramZkl6, Zr_4 paramZr_41, Zr_4 paramZr_42, Zkr6 paramZkr6, boolean paramBoolean, Zm6x paramZm6x) {
    this.Zd = paramZrnm;
    this.ZJ = paramSupplier;
    this.ZO = paramZgb6;
    this.Zr = paramZb0h;
    this.ZU = paramZbnt;
    this.ZW = new Ztr7(paramZbnt);
    this.ZV = paramZtwv;
    this.ZQ = paramZr_41;
    this.Zv = paramZr_42;
    this.Z_ = paramZkr6;
    this.ZC = new Zgso(paramZbnt, paramZkl6, paramZkr6.ZYa(), Zeew.INTRUDER, new Zsai(), paramZm6x);
    this.Zm = paramZkl6.ZH();
    Zv();
    Zw();
    this.Zc = new Zmz0(this.ZL, this::Zk);
    this.Zz = new Zmz_(this.Zo, this::Zk);
    this.ZS.Zl(Zlkk.TEXT_EDITOR_BACKGROUND);
    this.ZL.setName(a(10721, 244));
    this.ZL.getDocument().addDocumentListener(new Zkkd(this.Zc));
    if (paramBoolean)
      ZC(); 
    String str = Zkb.ZG(new byte[] { -89 });
    this.ZR.setText(a(10728, -5062) + a(10728, -5062));
    this.ZX.setText(a(10745, 29997) + a(10745, 29997));
    this.ZA.setText(a(10739, -21746) + a(10739, -21746));
    this.ZY.Zr(a(10704, 25355), Zbz3.ZK(Zxpj.TARGET), Zbz3.ZK(Zxpj.TARGET), Zbz3.ZK(Zxpj.TARGET), Zbma::lambda$new$0);
  }
  
  private void Zw() {
    this.Zo = new Zbkm(this);
    this.Zo.ZJ();
    this.Zo.ZV(a(10746, -15133));
    this.Zo.addMouseListener(this);
    this.Zo.setName(a(10725, 8350));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 5, 10);
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zo, gridBagConstraints);
  }
  
  private void ZC() {
    this.ZL.setEnabled(false);
    this.ZN.setEnabled(false);
    this.ZR.setEnabled(false);
    this.ZA.setEnabled(false);
    this.ZX.setEnabled(false);
    this.ZP.setEnabled(false);
    this.ZT.setEnabled(false);
    this.Zo.Zc(false);
  }
  
  private void Zk() {
    int i = this.Zc.ZF() + this.Zz.ZF();
    if (i != this.ZD) {
      this.ZD = i;
      this.Zd.ZE(this.ZD);
    } 
    this.Zy.setText(a(10733, 24888) + a(10733, 24888));
    this.Zh.setText((this.ZD == 1) ? a(10749, -7856) : ("" + this.ZD + this.ZD));
  }
  
  int ZQ() {
    return this.ZD;
  }
  
  void ZO(String paramString) {
    String str = (paramString == null) ? "" : paramString;
    this.ZL.setText(str);
  }
  
  void Zu(boolean paramBoolean) {
    this.ZN.setSelected(paramBoolean);
  }
  
  void Zy(Zstu paramZstu, List<int[]> paramList) {
    byte[] arrayOfByte = paramZstu.ZiD();
    this.Zo.Zk(this.Zm.ZY(null, arrayOfByte));
    int i = Zbyw.Zx();
    if (paramList != null) {
      ZS(paramList);
      if (i != 0) {
        this.Zz.ZU();
        return;
      } 
      return;
    } 
    this.Zz.ZU();
  }
  
  private void ZS(List<int[]> paramList) {
    int i = Zbyw.Zx();
    try {
      byte[] arrayOfByte1 = Zz96.ZA(this.Zo.ZF());
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(arrayOfByte1.length + 2 * paramList.size());
      int j = 0;
      for (int[] arrayOfInt : paramList) {
        byteArrayOutputStream.write(arrayOfByte1, j, arrayOfInt[0] - j);
        byteArrayOutputStream.write(-89);
        byteArrayOutputStream.write(arrayOfByte1, arrayOfInt[0], arrayOfInt[1] - arrayOfInt[0]);
        byteArrayOutputStream.write(-89);
        j = arrayOfInt[1];
        if (i != 0)
          break; 
      } 
      byteArrayOutputStream.write(arrayOfByte1, j, arrayOfByte1.length - j);
      byte[] arrayOfByte2 = byteArrayOutputStream.toByteArray();
      this.Zo.ZN(this.Zm.ZY(null, arrayOfByte2), false);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    this.Zz.Zh();
    this.Zo.requestFocus();
  }
  
  private void Zy() {
    int i = this.ZL.getSelectionStart();
    int j = this.ZL.getSelectionEnd();
    String str1 = this.ZL.getSelectedText();
    String str2 = Zz96.Zz(str1);
    Document document = this.ZL.getDocument();
    try {
      document.remove(i, j - i);
      document.insertString(i, str2, null);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
    this.Zc.Zh();
    this.ZL.requestFocus();
  }
  
  private void ZX() {
    String str1 = this.Zo.Zy();
    String str2 = Zz96.Zz(str1);
    this.Zo.ZY(str2);
    this.Zz.Zh();
    if (!this.ZL.hasFocus())
      this.Zo.requestFocus(); 
  }
  
  private void ZE() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZL : Lburp/Zgff;
    //   4: invokevirtual getSelectionStart : ()I
    //   7: istore_2
    //   8: invokestatic Zx : ()I
    //   11: aload_0
    //   12: getfield ZL : Lburp/Zgff;
    //   15: invokevirtual getSelectionEnd : ()I
    //   18: istore_3
    //   19: istore_1
    //   20: aload_0
    //   21: getfield Zo : Lburp/Zbkv;
    //   24: invokevirtual ZB : ()[I
    //   27: astore #4
    //   29: iload_2
    //   30: iload_3
    //   31: if_icmpeq -> 42
    //   34: aload_0
    //   35: invokevirtual Zy : ()V
    //   38: iload_1
    //   39: ifeq -> 65
    //   42: aload #4
    //   44: iconst_0
    //   45: iaload
    //   46: aload #4
    //   48: iconst_1
    //   49: iaload
    //   50: if_icmpeq -> 61
    //   53: aload_0
    //   54: invokevirtual ZX : ()V
    //   57: iload_1
    //   58: ifeq -> 65
    //   61: aload_0
    //   62: invokevirtual ZM : ()V
    //   65: return
  }
  
  private void ZM() {
    String str1 = Zz96.Zz(this.Zo.Zp());
    this.Zo.ZV(str1, false);
    this.Zz.ZU();
    String str2 = Zz96.Zz(this.ZL.getText());
    this.ZL.setText(str2);
    this.Zc.ZU();
  }
  
  private void Zv() {
    this.ZS = new Zbqc();
    this.Zs = new Zm99();
    this.ZL = new Zgff();
    this.ZN = new Zzdy();
    this.ZY = new Zm9e();
    this.Zl = new Zbqc();
    this.ZR = new Ze01();
    this.ZX = new Ze01();
    this.ZA = new Ze01();
    this.ZT = new Ze01();
    this.Zh = new Zm99();
    this.Zy = new Zm99();
    this.ZP = new Ze01();
    this.ZM = new Zm2o();
    this.Zb = new Zl8w();
    this.Zx = new Zbkc();
    setLayout(new GridBagLayout());
    this.ZS.setLayout(new GridBagLayout());
    this.Zs.setText(a(10735, 16380));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(15, 12, 15, 0);
    this.ZS.add(this.Zs, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(15, 10, 15, 0);
    this.ZS.add(this.ZL, gridBagConstraints);
    this.ZN.setSelected(true);
    this.ZN.setText(a(10726, -19561));
    this.ZN.setIconTextGap(9);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(15, 15, 15, 20);
    this.ZS.add(this.ZN, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(15, 20, 15, 0);
    this.ZS.add(this.ZY, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 3, 10);
    add(this.ZS, gridBagConstraints);
    this.Zl.setLayout(new GridLayout(0, 1, 0, 10));
    this.ZR.setText(a(10734, 25617));
    this.ZR.setToolTipText(a(10742, 6511));
    this.ZR.setIconTextGap(0);
    this.ZR.addActionListener(new Zxow(this));
    this.Zl.add(this.ZR);
    this.ZX.setText(a(10732, -24752));
    this.ZX.setToolTipText(a(10738, 27003));
    this.ZX.setIconTextGap(0);
    this.ZX.addActionListener(new Zxra(this));
    this.Zl.add(this.ZX);
    this.ZA.setText(a(10741, -14789));
    this.ZA.setToolTipText(a(10744, 19747));
    this.ZA.setIconTextGap(0);
    this.ZA.setName(a(10727, -25362));
    this.ZA.addActionListener(new Zgsx(this));
    this.Zl.add(this.ZA);
    this.ZT.setText(a(10720, 12319));
    this.ZT.setToolTipText(a(10730, 6280));
    this.ZT.setIconTextGap(0);
    this.ZT.addActionListener(new Zb9c(this));
    this.Zl.add(this.ZT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 19;
    add(this.Zl, gridBagConstraints);
    this.Zh.setText(a(10724, -5761));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.Zh, gridBagConstraints);
    this.Zy.setHorizontalAlignment(4);
    this.Zy.setText(a(10723, -19400));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = 1536;
    gridBagConstraints.insets = new Insets(5, 0, 0, 10);
    add(this.Zy, gridBagConstraints);
    this.ZP.setText(a(10722, -5853));
    this.ZP.setToolTipText(a(10750, 11161));
    this.ZP.addActionListener(new Zrgw(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 20;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.ZP, gridBagConstraints);
    this.ZM.Zi(Zk97.DESKTOP_TOOLS_INTRUDER_POSITIONS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 10);
    add(this.ZM, gridBagConstraints);
    this.Zb.setText(a(10751, 21278));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 5, 10);
    add(this.Zb, gridBagConstraints);
    this.Zx.Zx(a(10736, -4870));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 5, 10);
    add(this.Zx, gridBagConstraints);
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    if (!Zx6o.ZY(this, a(10743, -31773)))
      return; 
    this.ZD = this.Zc.ZF();
    this.Zo.Zx(Zdo.ZQ);
    this.Zz.ZU();
    this.Zo.requestFocus();
  }
  
  private void Zf(ActionEvent paramActionEvent) {
    this.Zz.Zh();
    this.Zo.requestFocus();
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zkr6;
    //   4: invokevirtual ZfW : ()Z
    //   7: istore_3
    //   8: invokestatic Zp : ()I
    //   11: aload_0
    //   12: getfield Zo : Lburp/Zbkv;
    //   15: invokevirtual ZB : ()[I
    //   18: astore #4
    //   20: istore_2
    //   21: aload #4
    //   23: iconst_0
    //   24: iaload
    //   25: aload #4
    //   27: iconst_1
    //   28: iaload
    //   29: if_icmpne -> 71
    //   32: iload_3
    //   33: aload_0
    //   34: getfield Zo : Lburp/Zbkv;
    //   37: invokevirtual ZF : ()[B
    //   40: aload_0
    //   41: getfield ZU : Lburp/Zbnt;
    //   44: invokestatic ZC : (Z[BLburp/Zbnt;)[B
    //   47: astore #5
    //   49: aload_0
    //   50: getfield Zo : Lburp/Zbkv;
    //   53: aload_0
    //   54: getfield Zm : Lburp/Zey9;
    //   57: aconst_null
    //   58: aload #5
    //   60: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   63: iconst_0
    //   64: invokevirtual ZN : (Lburp/Zefx;Z)V
    //   67: iload_2
    //   68: ifne -> 93
    //   71: iload_3
    //   72: aload_0
    //   73: getfield Zo : Lburp/Zbkv;
    //   76: invokevirtual Z_ : ()[B
    //   79: invokestatic ZG : (Z[B)[B
    //   82: astore #5
    //   84: aload_0
    //   85: getfield Zo : Lburp/Zbkv;
    //   88: aload #5
    //   90: invokevirtual Zj : ([B)V
    //   93: aload_0
    //   94: getfield Zz : Lburp/Zmzn;
    //   97: invokevirtual Zh : ()V
    //   100: aload_0
    //   101: getfield Zo : Lburp/Zbkv;
    //   104: invokevirtual requestFocus : ()V
    //   107: return
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    ZE();
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    Za();
  }
  
  public byte[] ZH() {
    return this.Zo.ZF();
  }
  
  public void ZP(Zb_j paramZb_j) {}
  
  public void Zs(Zb_j paramZb_j) {
    ZNH();
  }
  
  public void ZNH() {
    this.ZL.setText(a(10705, 25848));
    this.ZN.setSelected(true);
    byte[] arrayOfByte = Zkb.Zy(a(10731, 3368));
    this.Zo.Zk(this.Zm.ZY(null, arrayOfByte));
    this.Zc.ZU();
    this.Zz.Zh();
  }
  
  public Zm3l ZJ() {
    Zstu zstu1 = this.Zv.ZZ(ZH());
    Zstu zstu2 = this.Zv.ZZ(ZB());
    Zxpp zxpp = this.Zv.<Zxpp>ZH(new Zz1t(zstu2, this.ZN.isSelected()));
    return new Zm3l(zstu1, zxpp, this.ZW);
  }
  
  private byte[] ZB() {
    return Zkb.Zy(this.ZL.getText());
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      ZC(paramMouseEvent); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      ZC(paramMouseEvent); 
  }
  
  private void ZC(MouseEvent paramMouseEvent) {
    Zkj9 zkj9 = new Zkj9();
    zkj9.add(Ztsr.ZW(this, 131328));
    zkj9.add(Ztsr.ZW(this, 131584));
    zkj9.add(new JSeparator());
    int i = Zbyw.Zx();
    Objects.requireNonNull(this.Z_);
    ((Zbiv)this.ZJ.get()).ZK(zkj9, a(10748, -206), this.Z_::Zk, this);
    List<Zesk> list = this.Z_.ZYa().ZM().ZY();
    if (list != null) {
      List<Component> list1 = this.ZC.ZN(Zrpb.CONTEXT_INTRUDER_PAYLOAD_POSITIONS, paramMouseEvent, this.Zo.ZB(), new Zxai(this, ZJ()));
      for (Component component : list1) {
        zkj9.add(component);
        if (i != 0)
          break; 
      } 
    } 
    zkj9.add(new JSeparator());
    Objects.requireNonNull(zkj9);
    this.Zo.ZR(paramMouseEvent).forEach(zkj9::add);
    zkj9.show(paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    try {
      switch (paramInt) {
        case 131328:
          this.Z_.Zf1();
          return true;
        case 131584:
          this.Z_.Zf4();
          return true;
        case 136192:
          Za();
          return true;
        case 136448:
          this.Z_.ZfF();
          return true;
        case 136704:
          this.Z_.Zfd();
          return true;
        case 136960:
          this.Z_.ZfL();
          return true;
        case 527376:
          Zm((ActionEvent)null);
          return true;
      } 
      return false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return true;
    } 
  }
  
  private void Za() {
    int i = Zbyw.Zp();
    Zm2.ZC(Zrrh.INTRUDER_POSITIONS_MANUALLY_ADDED);
    if (this.ZL.hasFocus()) {
      Zc();
      if (i == 0) {
        ZS();
        return;
      } 
      return;
    } 
    ZS();
  }
  
  private void Zc() {
    int i = this.ZL.getSelectionStart();
    int j = this.ZL.getSelectionEnd();
    Document document = this.ZL.getDocument();
    try {
      document.insertString(i, "§", null);
      if (i != j) {
        document.insertString(j + 1, "§", null);
        this.ZL.setCaretPosition(j + 2);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
    this.ZL.requestFocus();
  }
  
  private void ZS() {
    int[] arrayOfInt = this.Zo.ZB();
    this.Zo.Zl(arrayOfInt[0], '§');
    if (arrayOfInt[0] != arrayOfInt[1]) {
      this.Zo.Zl(arrayOfInt[1] + 1, '§');
      this.Zo.Zr(arrayOfInt[1] + 2);
    } 
    this.Zo.requestFocus();
  }
  
  public void Zr(Zsh8 paramZsh8) {
    if (paramZsh8.ZPJ() != null) {
      byte[] arrayOfByte = paramZsh8.ZPJ().ZiD();
      Zefx zefx = this.Zm.ZY(null, arrayOfByte);
      this.Zo.ZN(zefx, false);
    } 
    Zxpp zxpp = paramZsh8.ZPE();
    Zstu zstu = zxpp.ZwZ();
    String str = (zstu == null) ? null : zstu.Zis();
    this.ZL.setText(str);
    this.ZN.setSelected(zxpp.ZwB());
    this.ZD = Zz96.Z_(paramZsh8.ZPJ(), paramZsh8.ZPq());
    this.Zc.Zh();
    this.Zz.Zh();
  }
  
  public void ZX(Zsh8 paramZsh8) {
    Zmzk zmzk = Zz96.ZL(this.ZL.getText());
    if (zmzk != null) {
      paramZsh8.Zx(this.ZQ.Zz(a(10740, -21172)), this.ZQ.Zz(zmzk.ZJ1()));
      paramZsh8.Zx(this.ZQ.Zz(a(10747, -16638)), this.ZQ.Zz(String.valueOf(zmzk.ZJO())));
      paramZsh8.Zx(this.ZQ.Zz(a(10737, 23328)), this.ZQ.Zz(Boolean.toString(zmzk.ZJZ())));
    } 
    Zstu zstu1 = this.ZQ.Zh(this.ZL.getText());
    Zxpp zxpp = this.ZQ.<Zxpp>ZH(new Zz1t(zstu1, this.ZN.isSelected()));
    paramZsh8.ZD(zxpp);
    Zstu zstu2 = this.ZQ.ZZ(this.Zo.ZF());
    paramZsh8.Zn(zstu2);
  }
  
  private static void lambda$new$0() {}
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '*G_=Øª2«ÉQÂ=Z¾6úRO3·Ê]JÙð`£Y\\r%Ît(þ¯lqë#å®ç8d;8M7\\tÓ-TçË¿×eue,Ö\\fÌýI Qï{Lã0Ü«}íð)zxß%-6¢ÓïÓ/JüJí¾Y¨è&\\n*r(BöØFYÁYÞOwBýB\\n%L<Zë8HH8ïéTóõ¬ÚxjÝÛù~²´j5Àm<6bÆÙHùù¬äÎ¨\\rQmÓ}ëéåÏ¥òì¹mmÄ¼M"5;×¨\\bÌÖu­Ç¢§BøDb<ô&{êfø¶WÊ[Ù¿6 QªìKRÄa"\\fæUNµw4fÓ 3\\nn3XÅª¥Í{C)4§¾Ô!3Mqö8ÒtôDÔ£\\t?ý|ÿ¶# ´X%3ú¯Ôw@2~æ6#£ØRÑfó¦O{qig¬*ø-Yô Yèl\ô¹.þái¹"è¥C¨"·G¨D¾¥·'Vµ6$õù»¬ÿ¹4*5V\\fÙVN®\\rÎ³$é¢¬BâÜ¼\\ti%\\fÕ^EUÑ¸åSýÍá<°zi ;g*ãt;!\\rÓ6=ø¥t!DMré!Ë`/køøY¾TíWÚ`¦òãHDî¹9ä°í$¿7R(2fÝ"à 3~0:æCE,Æ\\rEÊ=¢åÌuP3¥þ²×¶ÓQAmÇwp¤$5û¢|6"kriWóãñ  \\nýGNÝÊèÅç¤ÛnE7CÕÆÖÚ5EcåÜÞä³Q:ïÆÓ«(e§ç$¾@CË½|ædi½IèÍËÖS\\nò%ªþýìýXSéNÅ3jzäJZ>=;ÿg<ÉoktpLt@íÞÜPÑT©øH\Ã&4v/­öd>áJÜ\\beTÕúwøsµÝÒ-\\bUÒåÇS1{Æ1t=l*ðmÆ°<I'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #117
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
    //   67: ldc 'p9>&´±üñ¢8Ô¬èT`³£Ï'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #19
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
    //   128: putstatic burp/Zbma.a : [Ljava/lang/String;
    //   131: bipush #34
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbma.b : [Ljava/lang/String;
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
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #55
    //   214: goto -> 243
    //   217: bipush #22
    //   219: goto -> 243
    //   222: bipush #45
    //   224: goto -> 243
    //   227: bipush #53
    //   229: goto -> 243
    //   232: bipush #110
    //   234: goto -> 243
    //   237: iconst_3
    //   238: goto -> 243
    //   241: bipush #57
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
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x29F1) & 0xFFFF;
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
      char c = 'í';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbma.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */