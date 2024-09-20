package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import net.portswigger.Zae;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbgt extends Zbg2 implements Zeq {
  private final Zrk1 ZO;
  
  private final Zb_j Zk;
  
  private final Zl0 Zn;
  
  private final Zt__ ZW;
  
  private final Zbws ZE;
  
  private Zxpz ZT = Zxpz.NOT_SET;
  
  private String ZM;
  
  private boolean Za = true;
  
  private Zm2o ZL;
  
  private Zl8w ZI;
  
  private Ze01 ZF;
  
  private ButtonGroup Zf;
  
  private Zzdy Zg;
  
  Zzdy ZX;
  
  private JSeparator ZY;
  
  private JSeparator ZS;
  
  private Zm99 ZD;
  
  Zm9v ZZ;
  
  private Zm99 ZR;
  
  private Zm99 Z_;
  
  Zmg2 ZJ;
  
  Zmg2 Zr;
  
  private Zmg2 Zm;
  
  private Zbup ZC;
  
  private Zbqc Zc;
  
  Zg85 Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbgt(Zrk1 paramZrk1, Zzxi paramZzxi, Zb_j paramZb_j, Zl0 paramZl0) {
    this.ZO = paramZrk1;
    this.Zk = paramZb_j;
    this.Zn = paramZl0;
    Zs();
    setName(a(8012, -10860));
    this.ZR.setIcon(Zgh4.ZO());
    this.Zm.Zs(Zt00.BOLD_FONT);
    this.Zr.Zs(Zt00.BOLD_FONT);
    this.ZJ.Zs(Zt00.BOLD_FONT);
    this.Z_.setText(a(8020, -19418));
    this.Zg.setSelected(false);
    this.ZX.setSelected(!paramZzxi.Zu());
    ZB();
    this.ZW = new Zt__((new Zs6p(paramZb_j)).Zt(paramZl0));
    this.ZE = new Zbws(this.ZW);
    this.ZC.setViewportView(this.ZE);
    this.ZC.Zy(this.ZE);
    this.ZE.Zc(this);
    ZZ();
    this.ZB = new String[] { a(8023, -4068), a(8015, -16597), a(8031, 8626) };
    this.ZA = new boolean[] { true, true, true };
    this.Zh = 2;
  }
  
  private void ZB() {
    String[] arrayOfString = Zrk1.ZT();
    this.ZT = Zxpz.ZG(this.Zk.Zn(a(8024, 10464)));
    if (this.ZT == Zxpz.USE_CONFIG_FILE) {
      this.ZM = this.Zk.Zn(a(8027, -31513));
      if (this.ZM == null || !this.Zn.Zg(this.ZM).canRead()) {
        this.ZT = Zxpz.USE_DEFAULTS;
        this.Zr.setSelected(true);
        if (arrayOfString != null) {
          this.Zr.setSelected(true);
          return;
        } 
      } 
      return;
    } 
    this.Zr.setSelected(true);
  }
  
  private void ZJ() {
    // Byte code:
    //   0: invokestatic ZT : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zg : Lburp/Zzdy;
    //   8: invokevirtual isEnabled : ()Z
    //   11: ifeq -> 132
    //   14: aload_0
    //   15: getfield Zg : Lburp/Zzdy;
    //   18: invokevirtual isSelected : ()Z
    //   21: ifeq -> 132
    //   24: aload_0
    //   25: getfield Zr : Lburp/Zmg2;
    //   28: invokevirtual isSelected : ()Z
    //   31: ifeq -> 62
    //   34: aload_0
    //   35: getfield Zk : Lburp/Zb_j;
    //   38: sipush #8006
    //   41: sipush #15821
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: getstatic burp/Zxpz.USE_DEFAULTS : Lburp/Zxpz;
    //   50: getfield Zn : Ljava/lang/String;
    //   53: invokeinterface ZV : (Ljava/lang/String;Ljava/lang/String;)V
    //   58: aload_1
    //   59: ifnull -> 132
    //   62: aload_0
    //   63: getfield ZJ : Lburp/Zmg2;
    //   66: invokevirtual isSelected : ()Z
    //   69: ifeq -> 125
    //   72: aload_0
    //   73: getfield Zk : Lburp/Zb_j;
    //   76: sipush #8024
    //   79: sipush #10464
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: getstatic burp/Zxpz.USE_CONFIG_FILE : Lburp/Zxpz;
    //   88: getfield Zn : Ljava/lang/String;
    //   91: invokeinterface ZV : (Ljava/lang/String;Ljava/lang/String;)V
    //   96: aload_0
    //   97: getfield Zk : Lburp/Zb_j;
    //   100: sipush #8009
    //   103: sipush #32530
    //   106: invokestatic a : (II)Ljava/lang/String;
    //   109: aload_0
    //   110: getfield Zi : Lburp/Zg85;
    //   113: invokevirtual getText : ()Ljava/lang/String;
    //   116: invokeinterface ZV : (Ljava/lang/String;Ljava/lang/String;)V
    //   121: aload_1
    //   122: ifnull -> 132
    //   125: iconst_0
    //   126: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   129: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   132: return
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZW : Lburp/Zt__;
    //   4: aload_0
    //   5: getfield ZE : Lburp/Zbws;
    //   8: iload_1
    //   9: invokevirtual convertRowIndexToModel : (I)I
    //   12: invokevirtual Zo : (I)Ljava/lang/String;
    //   15: astore #4
    //   17: invokestatic ZT : ()[Ljava/lang/String;
    //   20: aload_0
    //   21: getfield Zn : Lnet/portswigger/Zl0;
    //   24: aload #4
    //   26: invokeinterface Zg : (Ljava/lang/String;)Ljava/io/File;
    //   31: astore #5
    //   33: astore_3
    //   34: aload #5
    //   36: invokevirtual exists : ()Z
    //   39: ifeq -> 55
    //   42: aload_0
    //   43: getfield ZZ : Lburp/Zm9v;
    //   46: ldc ' '
    //   48: invokevirtual setText : (Ljava/lang/String;)V
    //   51: aload_3
    //   52: ifnull -> 71
    //   55: aload_0
    //   56: getfield ZZ : Lburp/Zm9v;
    //   59: sipush #8026
    //   62: sipush #28400
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: invokevirtual setText : (Ljava/lang/String;)V
    //   71: aload_0
    //   72: getfield Zi : Lburp/Zg85;
    //   75: aload #4
    //   77: invokevirtual setText : (Ljava/lang/String;)V
    //   80: aload_0
    //   81: getfield ZJ : Lburp/Zmg2;
    //   84: iconst_1
    //   85: invokevirtual setSelected : (Z)V
    //   88: return
  }
  
  private void ZZ() {
    this.ZZ.setText(" ");
  }
  
  void Zl() {
    ZQ();
  }
  
  void Zu() {
    ZQ();
  }
  
  void Zo() {
    Z_();
  }
  
  private void ZQ() {
    this.Zg.setEnabled(true);
    this.Zm.setEnabled(false);
    String[] arrayOfString = Zrk1.ZT();
    if (this.Za || this.Zm.isSelected()) {
      this.Za = false;
      switch (this.ZT.ordinal()) {
        case 0:
        case 1:
          this.Zr.setSelected(true);
          if (arrayOfString != null);
          return;
        case 2:
          this.ZJ.setSelected(true);
          Zi();
          if (arrayOfString != null)
            break; 
          return;
      } 
      Zuh.Zb(false, Zqf.Zk);
      this.Zr.setSelected(true);
    } 
  }
  
  private void Z_() {
    this.Zg.setEnabled(false);
    this.Zm.setEnabled(true);
    this.Zm.setSelected(true);
  }
  
  private void Zi() {
    this.Zi.setText(this.ZM);
    byte b = 0;
    String[] arrayOfString = Zrk1.ZT();
    while (b < this.ZW.getRowCount()) {
      if (this.ZW.Zo(b).equals(this.ZM))
        this.ZE.changeSelection(this.ZE.convertRowIndexToView(b), 0, false, false); 
      b++;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return this.ZO.Zo(this);
      case 1:
        return this.ZO.Zy(this);
      case 2:
        if (Zj()) {
          ZJ();
          return this.ZO.ZK(this);
        } 
        return this;
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  private boolean Zj() {
    String str = this.Zi.getText();
    if (this.ZJ.isSelected()) {
      if (str == null || str.isEmpty()) {
        this.ZZ.setText(a(8022, 29961));
        return false;
      } 
      File file = this.Zn.Zg(str);
      if (!file.exists()) {
        this.ZZ.setText(a(8008, 20496));
        return false;
      } 
      if (this.ZO.Zt(file.getAbsolutePath())) {
        this.ZZ.setText(a(8018, -30089));
        return false;
      } 
      if (!Zn(file)) {
        this.ZZ.setText(a(8028, 8416));
        return false;
      } 
    } 
    this.ZZ.setText(" ");
    return true;
  }
  
  private boolean Zn(File paramFile) {
    try {
      (new Zz0e()).ZC(Zs6n.Zr(paramFile, this.Zn, Zae.Z_));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.USER_ERROR);
      return false;
    } 
    return true;
  }
  
  private void Zs() {
    this.Zf = new ButtonGroup();
    this.ZL = new Zm2o();
    this.Zm = new Zmg2();
    this.Zr = new Zmg2();
    this.ZJ = new Zmg2();
    this.Zi = new Zg85();
    this.Z_ = new Zm99();
    this.ZF = new Ze01();
    this.Zc = new Zbqc();
    this.ZI = new Zl8w();
    this.ZR = new Zm99();
    this.ZY = new JSeparator();
    this.ZS = new JSeparator();
    this.ZD = new Zm99();
    this.ZZ = new Zm9v();
    this.ZC = new Zbup();
    this.Zg = new Zzdy();
    this.ZX = new Zzdy();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout1);
    this.ZL.Zi(Zk97.DESKTOP_GETTING_STARTED_SELECTING_A_CONFIGURATION);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 17;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(3, 0, 0, 5);
    add(this.ZL, gridBagConstraints);
    this.Zf.add(this.Zm);
    this.Zm.setText(a(8019, 15264));
    this.Zm.addActionListener(new Zlh6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    add(this.Zm, gridBagConstraints);
    this.Zf.add(this.Zr);
    this.Zr.setText(a(8030, -13533));
    this.Zr.addActionListener(new Zm64(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zr, gridBagConstraints);
    this.Zf.add(this.ZJ);
    this.ZJ.setText(a(8021, -12956));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 23;
    add(this.ZJ, gridBagConstraints);
    this.Zi.addMouseListener(new Zsdv(this));
    this.Zi.addKeyListener(new Zko8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zi, gridBagConstraints);
    this.Z_.setText(a(8017, 7759));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Z_, gridBagConstraints);
    this.ZF.setText(a(8025, -15316));
    this.ZF.addActionListener(new Zrj7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 1280;
    add(this.ZF, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.Zc.setLayout(gridBagLayout2);
    this.ZI.setText(a(8010, 23308));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.Zc.add(this.ZI, gridBagConstraints);
    this.ZR.setHorizontalAlignment(4);
    this.ZR.setVerticalAlignment(1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.Zc.add(this.ZR, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 1;
    add(this.Zc, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(15, 0, 15, 0);
    add(this.ZY, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(15, 0, 15, 0);
    add(this.ZS, gridBagConstraints);
    this.ZD.setText(a(8011, 1948));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 1536;
    add(this.ZD, gridBagConstraints);
    this.ZZ.setText(a(8014, -3544));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.ZZ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZC, gridBagConstraints);
    this.Zg.setText(a(8016, -28604));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(30, 0, 0, 0);
    add(this.Zg, gridBagConstraints);
    this.ZX.setText(a(8029, -29644));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    add(this.ZX, gridBagConstraints);
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    this.ZJ.setSelected(true);
    File file = Zs6n.Zp(Zg1m.CONFIG, new Zsw_(this.ZO), this.ZO.Zd(), 0, a(8013, -8669));
    if (file != null) {
      this.Zi.setText(file.getPath());
      this.Zi.grabFocus();
    } 
  }
  
  private void ZL(MouseEvent paramMouseEvent) {
    this.ZJ.setSelected(true);
  }
  
  private void Zs(KeyEvent paramKeyEvent) {
    this.ZJ.setSelected(true);
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    this.ZZ.setText(" ");
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    this.ZZ.setText(" ");
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '&6á¢D Pv(¶Ú`Ù\\nÔrªñÀò áøÿ2ÝÊ­4ÏÃvÏjCk)\\n+ØÅ£D­©ÜD^þ8¾$Ë<\\n7¬µ?»Bò ¯OÚÑo°SRÐnüYÓJð_s%±Á·|`ØÄ(q©ó(\\r)+Ù+êa:á)¥AÕ°qû-ê!Ö{yÁKÞã'25&sEmÆ4ís1G¹\\fãÜÞ+I.tò³¯MãÊKøH¦,ÞÇ-Qm2´\\føFîETz§VyKw5øf&ó¨M½}³EæÄï0)ÏÐ)ñGÔxö<vSÊÉ|\\n'àXg¢Dú3Î¶Ý<+ëVÕ¾)GIÛ¯4ñY)Ñéëü#ÉOü#Ð>Ë·Ån¶-WbümÑ³°`{|8ýù1m)y¤nÑ3£³lFÍÃ2LGP7öò¢%:¸¡üqÐcÔ¸ÈÖOÓ9¯¯b7Ó^¹èÚGÇwSÒDO|Þ<¾u* ërW\\tZ®¸è 5éøtC±'eD÷¹^!g^*üro f'»±BÎ}ë Q»-ÛßYãN1áFT·ûØ4"^³¹p¬o³Vpd»Fv[*÷Þ"Ë8öur6çN×Z´Áq2Àã\\fòÛ|àWP6.bø§ÕÊj± YÓ¡lC&ùN)¤XßhvõlÏE1º'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #17
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #47
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
    //   68: ldc 'Þý.ÖÑôÈ/êýpMu¿Oºd£\\tm8-! À¨%{Í¯²¡¤°¢¿L³F³ï\\tj8þi¶÷('
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #31
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #52
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
    //   129: putstatic burp/Zbgt.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbgt.b : [Ljava/lang/String;
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
    //   212: bipush #15
    //   214: goto -> 244
    //   217: bipush #63
    //   219: goto -> 244
    //   222: bipush #67
    //   224: goto -> 244
    //   227: bipush #26
    //   229: goto -> 244
    //   232: bipush #14
    //   234: goto -> 244
    //   237: bipush #89
    //   239: goto -> 244
    //   242: bipush #11
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
    int i = (paramInt1 ^ 0x1F5E) & 0xFFFF;
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
      byte b1 = 76;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */