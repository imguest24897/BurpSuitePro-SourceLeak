package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import net.portswigger.Zfc;
import net.portswigger.Zqf;
import net.portswigger.Zs1;
import net.portswigger.Zuh;
import net.portswigger.Zup;

public class Zbts extends Zbg2 {
  private final Ztq5 ZG;
  
  private final Zeyi Za;
  
  private final Zup ZJ;
  
  private final Zz9q ZC;
  
  private final Ztad ZZ;
  
  private Zkka Zb;
  
  private Zs1 Zk;
  
  private Zm99 Zy;
  
  private Zm99 Zt;
  
  private Zm99 Zz;
  
  private Zbqc ZV;
  
  private Zedd Zw;
  
  private Zm99 Zv;
  
  private Zm99 ZD;
  
  private Zm99 Zg;
  
  private Zm99 Zu;
  
  private Zbqc ZI;
  
  private Zbqc ZE;
  
  private Zl8w ZT;
  
  private Zl8w Zn;
  
  private Zbqc Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbts(Ztq5 paramZtq5, Zeyi paramZeyi, Zup paramZup, Zz9q paramZz9q) {
    this.ZG = paramZtq5;
    this.Za = paramZeyi;
    this.ZJ = paramZup;
    this.ZC = paramZz9q;
    this.ZZ = new Ztad(paramZeyi, paramZup);
    ZU();
    ZS();
  }
  
  private void ZS() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Lburp/Zm99;
    //   4: iconst_1
    //   5: invokevirtual setFocusable : (Z)V
    //   8: invokestatic Zz : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: getfield Zg : Lburp/Zm99;
    //   15: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   18: invokevirtual Ze : (Lburp/Zlkk;)V
    //   21: astore_1
    //   22: aload_0
    //   23: getfield Zg : Lburp/Zm99;
    //   26: new java/awt/Cursor
    //   29: dup
    //   30: bipush #12
    //   32: invokespecial <init> : (I)V
    //   35: invokevirtual setCursor : (Ljava/awt/Cursor;)V
    //   38: aload_0
    //   39: getfield ZJ : Lnet/portswigger/Zup;
    //   42: ifnonnull -> 50
    //   45: aload_0
    //   46: invokevirtual Zl : ()V
    //   49: return
    //   50: aload_0
    //   51: getfield ZJ : Lnet/portswigger/Zup;
    //   54: getfield ZS : Lnet/portswigger/Za8;
    //   57: getstatic net/portswigger/Za8.UPDATE_AVAILABLE : Lnet/portswigger/Za8;
    //   60: if_acmpne -> 136
    //   63: aload_0
    //   64: getfield Zw : Lburp/Zedd;
    //   67: ldc ' '
    //   69: invokevirtual addItem : (Ljava/lang/Object;)V
    //   72: aload_0
    //   73: getfield Zw : Lburp/Zedd;
    //   76: sipush #-8005
    //   79: sipush #-16480
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: invokevirtual addItem : (Ljava/lang/Object;)V
    //   88: aload_0
    //   89: getfield Zw : Lburp/Zedd;
    //   92: aload_0
    //   93: getfield ZJ : Lnet/portswigger/Zup;
    //   96: getfield ZU : Ljava/util/List;
    //   99: invokeinterface size : ()I
    //   104: iconst_1
    //   105: if_icmple -> 120
    //   108: sipush #-8009
    //   111: sipush #20895
    //   114: invokestatic a : (II)Ljava/lang/String;
    //   117: goto -> 129
    //   120: sipush #-8010
    //   123: sipush #-2191
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: invokevirtual addItem : (Ljava/lang/Object;)V
    //   132: aload_1
    //   133: ifnull -> 141
    //   136: aload_0
    //   137: iconst_0
    //   138: invokevirtual Zi : (Z)V
    //   141: aload_0
    //   142: invokevirtual ZO : ()V
    //   145: aload_0
    //   146: invokevirtual ZW : ()V
    //   149: return
  }
  
  private void Zi(boolean paramBoolean) {
    this.Zu.setVisible(paramBoolean);
    this.Zw.setVisible(paramBoolean);
  }
  
  private void Zl() {
    String str = a(-8004, -1776);
    this.Zn.setText(str);
    remove(this.Z_);
    Zi(false);
    Zh();
  }
  
  private void ZO() {
    Zbqc[] arrayOfZbqc = Ztad.Zz();
    if (this.ZZ.ZD()) {
      String str = (this.Za.ZY == Zzty.GET_AVAILABLE_INSTALLERS) ? a(-8006, 8521) : a(-8028, -14767);
      this.ZB = new String[] { a(-8003, 28238), str };
      this.ZA = new boolean[] { true, true };
      this.Zh = 1;
      if (arrayOfZbqc != null) {
        Zh();
        return;
      } 
      return;
    } 
    Zh();
  }
  
  private void Zh() {
    this.ZB = new String[] { a(-8014, -22300) };
    this.ZA = new boolean[] { true };
    this.Zh = 0;
  }
  
  private void ZW() {
    // Byte code:
    //   0: invokestatic Zz : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zn : Lburp/Zl8w;
    //   8: aload_0
    //   9: getfield ZZ : Lburp/Ztad;
    //   12: invokevirtual Zh : ()Ljava/lang/String;
    //   15: invokevirtual setText : (Ljava/lang/String;)V
    //   18: aload_0
    //   19: getfield ZZ : Lburp/Ztad;
    //   22: invokevirtual ZT : ()Z
    //   25: ifeq -> 85
    //   28: aload_0
    //   29: getfield ZZ : Lburp/Ztad;
    //   32: invokevirtual Zt : ()Ljava/util/List;
    //   35: astore_2
    //   36: aload_0
    //   37: aload_2
    //   38: aload_0
    //   39: invokestatic Zb : (Ljava/util/List;Lburp/Zbts;)Lburp/Zkka;
    //   42: putfield Zb : Lburp/Zkka;
    //   45: new java/awt/GridBagConstraints
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore_3
    //   53: aload_3
    //   54: bipush #23
    //   56: putfield anchor : I
    //   59: aload_3
    //   60: iconst_2
    //   61: putfield fill : I
    //   64: aload_0
    //   65: getfield ZI : Lburp/Zbqc;
    //   68: aload_0
    //   69: getfield Zb : Lburp/Zkka;
    //   72: invokeinterface Zj : ()Ljava/awt/Component;
    //   77: aload_3
    //   78: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   81: aload_1
    //   82: ifnull -> 93
    //   85: aload_0
    //   86: aload_0
    //   87: getfield Z_ : Lburp/Zbqc;
    //   90: invokevirtual remove : (Ljava/awt/Component;)V
    //   93: aload_0
    //   94: getfield ZZ : Lburp/Ztad;
    //   97: invokevirtual Zu : ()Z
    //   100: ifne -> 125
    //   103: aload_0
    //   104: getfield Z_ : Lburp/Zbqc;
    //   107: aload_0
    //   108: getfield Zv : Lburp/Zm99;
    //   111: invokevirtual remove : (Ljava/awt/Component;)V
    //   114: aload_0
    //   115: getfield Z_ : Lburp/Zbqc;
    //   118: aload_0
    //   119: getfield ZV : Lburp/Zbqc;
    //   122: invokevirtual remove : (Ljava/awt/Component;)V
    //   125: return
  }
  
  public Zsic Zn(int paramInt) {
    String str;
    Zbqc[] arrayOfZbqc = Ztad.Zz();
    switch (paramInt) {
      case 0:
        switch (this.Zw.getSelectedIndex()) {
          case -1:
          case 0:
            if (arrayOfZbqc != null);
            return null;
          case 1:
            this.ZC.Zl();
            if (arrayOfZbqc != null);
            return null;
          case 2:
            this.ZJ.ZU.forEach(this::lambda$buttonClicked$0);
            if (arrayOfZbqc != null);
            return null;
          case 3:
            this.ZC.ZD();
            if (arrayOfZbqc != null)
              break; 
            return null;
        } 
        Zuh.Zv(false, Zqf.Zr, this.Zw.getSelectedIndex());
        return null;
      case 1:
        if (this.Za.Zy)
          return this.ZG.ZM(this); 
        str = a(-8007, -16710) + a(-8007, -16710);
        Zke4.Zt(this.ZG.ZE().ZF(), str, true);
        return null;
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  Zmp9 Zs() {
    return this.Zb.ZQ();
  }
  
  Zs1 Zk() {
    return this.Zk;
  }
  
  String Zv() {
    return this.ZJ.Zv;
  }
  
  private void ZU() {
    this.Zn = new Zl8w();
    this.Z_ = new Zbqc();
    this.Zy = new Zm99();
    this.Zt = new Zm99();
    this.Zz = new Zm99();
    this.Zv = new Zm99();
    this.Zg = new Zm99();
    this.ZV = new Zbqc();
    this.ZT = new Zl8w();
    this.ZI = new Zbqc();
    this.ZD = new Zm99();
    this.ZE = new Zbqc();
    this.Zu = new Zm99();
    this.Zw = new Zedd();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zn.setText(a(-8013, 20874));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.Zn, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    this.Z_.setLayout(gridBagLayout2);
    this.Zy.setText(a(-8027, -28450));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.Z_.add(this.Zy, gridBagConstraints);
    this.Zt.setText(a(-8016, 11373));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.Z_.add(this.Zt, gridBagConstraints);
    this.Zz.setText(a(-8012, -6749));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.Z_.add(this.Zz, gridBagConstraints);
    this.Zv.setText(a(-8002, 11992));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 23;
    this.Z_.add(this.Zv, gridBagConstraints);
    this.Zg.setText(a(-8008, 24503));
    this.Zg.addMouseListener(new Zkq5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    this.Z_.add(this.Zg, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    this.Z_.add(this.ZV, gridBagConstraints);
    this.ZT.setText(a(-8001, 15844));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.Z_.add(this.ZT, gridBagConstraints);
    this.ZI.setLayout(new GridBagLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.Z_.add(this.ZI, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Z_, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZD, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout3.rowHeights = new int[] { 0 };
    this.ZE.setLayout(gridBagLayout3);
    this.Zu.setText(a(-8015, -14191));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    this.ZE.add(this.Zu, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 17;
    gridBagConstraints.weightx = 0.1D;
    this.ZE.add(this.Zw, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZE, gridBagConstraints);
  }
  
  private void Zl(MouseEvent paramMouseEvent) {
    Zke4.Zt(Zt2m.ZF(this), this.Zg.getText(), true);
  }
  
  void ZQ(Zmp9 paramZmp9) {
    this.ZT.setText(paramZmp9.Zy());
    this.Zg.setText(paramZmp9.Zd());
    Zbqc[] arrayOfZbqc = Ztad.Zz();
    if (this.ZZ.Zu()) {
      ArrayList<Zs1> arrayList = new ArrayList<>(paramZmp9.ZL());
      arrayList.sort(new Zxog());
      int i = arrayList.size();
      this.ZV.removeAll();
      Zo(i);
      ButtonGroup buttonGroup = new ButtonGroup();
      byte b = 0;
      while (b < i) {
        Zs1 zs1 = arrayList.get(b);
        Zh(zs1, b, buttonGroup);
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
  }
  
  private void Zo(int paramInt) {
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 20, 0 };
    gridBagLayout.rowHeights = new int[paramInt];
    this.ZV.setLayout(gridBagLayout);
  }
  
  private void Zh(Zs1 paramZs1, int paramInt, ButtonGroup paramButtonGroup) {
    // Byte code:
    //   0: new burp/Zmg2
    //   3: dup
    //   4: aload_1
    //   5: getfield Za : Lnet/portswigger/Zt5;
    //   8: getfield installationMediaUiDescription : Ljava/lang/String;
    //   11: invokespecial <init> : (Ljava/lang/String;)V
    //   14: astore #4
    //   16: aload_3
    //   17: aload #4
    //   19: invokevirtual add : (Ljavax/swing/AbstractButton;)V
    //   22: new java/awt/GridBagConstraints
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #5
    //   31: aload #5
    //   33: sipush #1280
    //   36: putfield anchor : I
    //   39: aload #5
    //   41: iconst_0
    //   42: putfield gridx : I
    //   45: aload #5
    //   47: iload_2
    //   48: putfield gridy : I
    //   51: aload_0
    //   52: getfield ZV : Lburp/Zbqc;
    //   55: aload #4
    //   57: aload #5
    //   59: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   62: getstatic net/portswigger/Zt5.CURRENT : Lnet/portswigger/Zt5;
    //   65: aload_1
    //   66: getfield Za : Lnet/portswigger/Zt5;
    //   69: if_acmpne -> 79
    //   72: aload_0
    //   73: aload_1
    //   74: aload #4
    //   76: invokevirtual ZM : (Lnet/portswigger/Zs1;Lburp/Zmg2;)V
    //   79: aload #4
    //   81: aload_0
    //   82: aload_1
    //   83: aload #4
    //   85: <illegal opcode> actionPerformed : (Lburp/Zbts;Lnet/portswigger/Zs1;Lburp/Zmg2;)Ljava/awt/event/ActionListener;
    //   90: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   93: sipush #-8011
    //   96: aload_1
    //   97: getfield ZH : I
    //   100: bipush #20
    //   102: ishr
    //   103: istore #6
    //   105: sipush #6331
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: iconst_1
    //   112: anewarray java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: iload #6
    //   119: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   122: aastore
    //   123: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   126: astore #7
    //   128: aload #5
    //   130: iconst_2
    //   131: putfield gridx : I
    //   134: new javax/swing/JLabel
    //   137: dup
    //   138: aload #7
    //   140: invokespecial <init> : (Ljava/lang/String;)V
    //   143: astore #8
    //   145: aload_0
    //   146: getfield ZV : Lburp/Zbqc;
    //   149: aload #8
    //   151: aload #5
    //   153: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   156: aload #8
    //   158: new burp/Zmzb
    //   161: dup
    //   162: aload_0
    //   163: aload_1
    //   164: aload #4
    //   166: invokespecial <init> : (Lburp/Zbts;Lnet/portswigger/Zs1;Lburp/Zmg2;)V
    //   169: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   172: return
  }
  
  private void ZM(Zs1 paramZs1, Zmg2 paramZmg2) {
    paramZmg2.setSelected(true);
    this.Zk = paramZs1;
  }
  
  private void lambda$addRadioButtonForBuild$1(Zs1 paramZs1, Zmg2 paramZmg2, ActionEvent paramActionEvent) {
    ZM(paramZs1, paramZmg2);
  }
  
  private void lambda$buttonClicked$0(Zfc paramZfc) {
    this.ZC.Zg(paramZfc.Zu);
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ñiJñÀ û9¹lcTÚ¶_)æé&\\fÞlDàg"\\t#\»0£ 6«|Pô¤¤\\f^Wt0èä¨%þ¡Æ½zb+p-·qéÛ¢á¡`GdnÈ/÷\\t)³«"ò/hÌAÈçEHrý¬ÛC@¹.µh­á1°[&æOh&,£RºÖ8øµhìÇúàTÿÁ»lm´\\n¼b¾4]Ut?:N\\bÉåxÅ=ä4¿ þZÈFÄ«ÁYª»­ñÐ¾²ö\\r×í¹+\\fñ]|>ñJ2Ä¶ÿR$b§ãPýI88ý\\t¹ú#­¯óá¢7Él\\bRhñÂz­\\bvÑ\\rÉüõ9'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #17
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #63
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
    //   68: ldc 'O¸MG{NóÜ\\b¥IeÜÏR'É'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #7
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
    //   129: putstatic burp/Zbts.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbts.b : [Ljava/lang/String;
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
    //   212: bipush #126
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #23
    //   224: goto -> 244
    //   227: bipush #74
    //   229: goto -> 244
    //   232: bipush #51
    //   234: goto -> 244
    //   237: bipush #21
    //   239: goto -> 244
    //   242: bipush #117
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
    int i = (paramInt1 ^ 0xFFFFE0B4) & 0xFFFF;
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
      byte b1 = 89;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbts.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */