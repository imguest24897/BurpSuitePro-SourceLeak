package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.filechooser.FileSystemView;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zvh;

class Zbgr extends Zbg2 implements Zeq {
  private final Zrk1 ZW;
  
  private final Zl0 ZC;
  
  private final Zt_0 Zq;
  
  private final Zbn ZG;
  
  private boolean ZM;
  
  Zbws Zz;
  
  private Zm2o Zy;
  
  private Ze01 Zu;
  
  private Ze01 Zx;
  
  private ButtonGroup Zk;
  
  Zzdy ZY;
  
  private JSeparator ZX;
  
  private JSeparator ZV;
  
  private Zl8w Zi;
  
  private Zm99 ZF;
  
  private Zm9v Zj;
  
  private Zm99 ZS;
  
  private Zm99 Za;
  
  private Zm99 Zt;
  
  Zm9v Zw;
  
  private Zm99 Zb;
  
  private Zl8w ZI;
  
  Zmg2 Zv;
  
  Zmg2 ZT;
  
  Zmg2 ZJ;
  
  private Zbup ZZ;
  
  private Zbqc Z_;
  
  private Zzdy Zr;
  
  Zg85 ZQ;
  
  Zg85 ZN;
  
  Zg85 ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbgr(Zrk1 paramZrk1, boolean paramBoolean1, boolean paramBoolean2, Zgb6 paramZgb6, Zb_j paramZb_j, Zl0 paramZl0) {
    this.ZW = paramZrk1;
    this.ZC = paramZl0;
    Zy();
    setName(a(-4696, -7298));
    String[] arrayOfString = Zrk1.ZT();
    this.ZS.setIcon(Zgh4.ZO());
    this.ZI.setText(a(-4733, 2294));
    this.ZJ.Zs(Zt00.BOLD_FONT);
    this.ZT.setName(a(-4717, -4061));
    this.ZT.Zs(Zt00.BOLD_FONT);
    this.Zv.Zs(Zt00.BOLD_FONT);
    this.Zb.setText(a(-4734, 30879));
    this.ZY.setSelected(paramBoolean2);
    this.ZY.setName(a(-4716, 20173));
    this.ZP.setName(a(-4698, -22314));
    this.ZP.getDocument().addDocumentListener(new Zgl3(this));
    List<Zr4b> list = (new Zsyo(paramZb_j)).ZY(paramZl0);
    this.Zq = new Zt_0(list);
    this.Zz = new Zbws(this.Zq);
    this.ZZ.setViewportView(this.Zz);
    this.ZZ.Zy(this.Zz);
    this.Zz.Zc(this);
    this.Zz.addMouseListener(new Zt3e(this, paramZrk1));
    List<String> list1 = (List)list.stream().map(Zbgr::lambda$new$0).collect(Collectors.toList());
    try {
      this.ZG = new Zbn(list1, paramZgb6, paramZb_j);
      Zx(this.ZG);
      Zl(paramZb_j);
      Zr();
      ZV();
      (new String[2])[0] = a(-4731, 30019);
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    try {
      this.ZB = new String[] { null, paramBoolean1 ? a(-4706, -4826) : a(-4728, 21762) };
      this.ZA = new boolean[] { true, true };
      this.Zh = 1;
      this.ZM = false;
      if (arrayOfString != null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
  }
  
  private void Zl(Zb_j paramZb_j) {
    Zrgz zrgz = new Zrgz(paramZb_j);
    boolean bool = zrgz.ZF();
    this.Zr.setSelected(bool);
  }
  
  private void Zx(Zbn paramZbn) {
    Zgjx zgjx = new Zgjx(paramZbn, this::Zu);
    this.ZY.addActionListener(zgjx);
    Zu((String)null);
  }
  
  private String Zu() {
    int i = this.Zz.getSelectedRow();
    int j = this.Zz.convertRowIndexToModel(i);
    Zr4b zr4b = this.Zq.ZC(j);
    try {
    
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    return (zr4b != null) ? zr4b.Zh : null;
  }
  
  private void Zr() {
    Objects.requireNonNull(this.Zi);
    Zs().ifPresentOrElse(this.Zi::setText, this::lambda$configureForPlatformCapabilities$1);
  }
  
  private Optional<String> Zs() {
    try {
      if (Zvh.ZU.ZM()) {
        Z_();
        Zk();
        return Optional.of(a(-4714, -19575));
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    String str = null;
    return Optional.ofNullable(str);
  }
  
  private void Z_() {
    this.ZT.setEnabled(false);
    this.Zt.setEnabled(false);
    this.ZP.setEnabled(false);
    this.Za.setEnabled(false);
    this.ZN.setEnabled(false);
    this.Zx.setEnabled(false);
  }
  
  private void Zk() {
    this.Zv.setEnabled(false);
    this.ZF.setEnabled(false);
    this.ZQ.setEnabled(false);
    this.Zz.setEnabled(false);
    this.Zz.setVisible(false);
    this.Zu.setEnabled(false);
  }
  
  private void ZV() {
    this.Zw.setText(" ");
    this.Zj.setText(" ");
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zq : Lburp/Zt_0;
    //   4: aload_0
    //   5: getfield Zz : Lburp/Zbws;
    //   8: iload_1
    //   9: invokevirtual convertRowIndexToModel : (I)I
    //   12: invokevirtual ZC : (I)Lburp/Zr4b;
    //   15: astore #4
    //   17: invokestatic ZT : ()[Ljava/lang/String;
    //   20: aload_0
    //   21: getfield ZC : Lnet/portswigger/Zl0;
    //   24: aload #4
    //   26: getfield Zb : Ljava/lang/String;
    //   29: invokeinterface Zg : (Ljava/lang/String;)Ljava/io/File;
    //   34: astore #5
    //   36: astore_3
    //   37: aload #5
    //   39: invokevirtual exists : ()Z
    //   42: ifeq -> 163
    //   45: iconst_0
    //   46: istore #6
    //   48: aload #5
    //   50: invokestatic ZW : (Ljava/io/File;)S
    //   53: getstatic burp/Zrnb.Zk : S
    //   56: if_icmpge -> 67
    //   59: iconst_1
    //   60: goto -> 68
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: iconst_0
    //   68: istore #6
    //   70: goto -> 83
    //   73: astore #7
    //   75: aload #7
    //   77: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   80: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   83: iload #6
    //   85: ifeq -> 143
    //   88: aload_0
    //   89: getfield ZW : Lburp/Zrk1;
    //   92: invokevirtual Zd : ()Lburp/Zl04;
    //   95: sipush #-4712
    //   98: sipush #-26589
    //   101: invokestatic a : (II)Ljava/lang/String;
    //   104: sipush #-4699
    //   107: sipush #24508
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   116: aload_0
    //   117: getfield Zj : Lburp/Zm9v;
    //   120: sipush #-4709
    //   123: sipush #-8055
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: invokevirtual setText : (Ljava/lang/String;)V
    //   132: aload_3
    //   133: ifnull -> 159
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: aload_0
    //   144: getfield Zj : Lburp/Zm9v;
    //   147: ldc ' '
    //   149: invokevirtual setText : (Ljava/lang/String;)V
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload_3
    //   160: ifnull -> 186
    //   163: aload_0
    //   164: getfield Zj : Lburp/Zm9v;
    //   167: sipush #-4689
    //   170: sipush #11382
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: invokevirtual setText : (Ljava/lang/String;)V
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: aload_0
    //   187: getfield ZQ : Lburp/Zg85;
    //   190: aload #4
    //   192: getfield Zb : Ljava/lang/String;
    //   195: invokevirtual setText : (Ljava/lang/String;)V
    //   198: aload_0
    //   199: getfield Zv : Lburp/Zmg2;
    //   202: iconst_1
    //   203: invokevirtual setSelected : (Z)V
    //   206: aload_0
    //   207: iconst_1
    //   208: invokevirtual Zg : (Z)V
    //   211: aload_0
    //   212: aload #4
    //   214: getfield Zh : Ljava/lang/String;
    //   217: invokevirtual Zu : (Ljava/lang/String;)V
    //   220: return
    // Exception table:
    //   from	to	target	type
    //   48	63	63	burp/Zev3
    //   48	70	73	burp/Zev3
    //   83	136	139	burp/Zev3
    //   88	152	155	burp/Zev3
    //   159	179	182	burp/Zev3
  }
  
  private void Zu(String paramString) {
    if (this.Zr.isSelected()) {
      boolean bool = this.ZG.ZZ(paramString);
      this.ZY.setSelected(bool);
    } 
  }
  
  public Zsic Zn(int paramInt) {
    try {
      switch (paramInt) {
        case 0:
          return this.ZW.Zo(this);
        case 1:
          try {
            if (ZR())
              return this.ZW.ZK(this); 
          } catch (InvalidPathException invalidPathException) {
            throw a(null);
          } 
          return this;
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  boolean ZR() {
    // Byte code:
    //   0: invokestatic ZT : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zw : Lburp/Zm9v;
    //   8: ldc ' '
    //   10: invokevirtual setText : (Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield ZT : Lburp/Zmg2;
    //   17: invokevirtual isSelected : ()Z
    //   20: ifeq -> 135
    //   23: aload_0
    //   24: getfield ZN : Lburp/Zg85;
    //   27: invokevirtual getText : ()Ljava/lang/String;
    //   30: astore_2
    //   31: aload_2
    //   32: invokestatic ZP : (Ljava/lang/String;)Z
    //   35: ifeq -> 84
    //   38: aload_0
    //   39: getfield ZP : Lburp/Zg85;
    //   42: invokevirtual getText : ()Ljava/lang/String;
    //   45: astore_3
    //   46: aload_3
    //   47: invokestatic ZP : (Ljava/lang/String;)Z
    //   50: ifeq -> 75
    //   53: aload_0
    //   54: getfield Zw : Lburp/Zm9v;
    //   57: sipush #-4732
    //   60: sipush #22059
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual setText : (Ljava/lang/String;)V
    //   69: iconst_0
    //   70: ireturn
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload_3
    //   76: invokestatic ZV : (Ljava/lang/String;)Ljava/lang/String;
    //   79: astore_2
    //   80: aload_1
    //   81: ifnull -> 120
    //   84: aload_2
    //   85: invokestatic Zc : (Ljava/lang/String;)Z
    //   88: ifne -> 120
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload_0
    //   99: getfield Zw : Lburp/Zm9v;
    //   102: sipush #-4697
    //   105: sipush #-8941
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: invokevirtual setText : (Ljava/lang/String;)V
    //   114: iconst_0
    //   115: ireturn
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload_0
    //   121: getfield ZN : Lburp/Zg85;
    //   124: aload_2
    //   125: invokestatic Zm : (Ljava/lang/String;)Ljava/lang/String;
    //   128: invokevirtual setText : (Ljava/lang/String;)V
    //   131: aload_1
    //   132: ifnull -> 273
    //   135: aload_0
    //   136: getfield Zv : Lburp/Zmg2;
    //   139: invokevirtual isSelected : ()Z
    //   142: ifeq -> 273
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload_0
    //   153: getfield ZQ : Lburp/Zg85;
    //   156: invokevirtual getText : ()Ljava/lang/String;
    //   159: astore_2
    //   160: aload_2
    //   161: ifnull -> 178
    //   164: aload_2
    //   165: invokevirtual isEmpty : ()Z
    //   168: ifeq -> 200
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   177: athrow
    //   178: aload_0
    //   179: getfield Zj : Lburp/Zm9v;
    //   182: sipush #-4710
    //   185: sipush #-22185
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokevirtual setText : (Ljava/lang/String;)V
    //   194: iconst_0
    //   195: ireturn
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: aload_0
    //   201: getfield ZC : Lnet/portswigger/Zl0;
    //   204: aload_2
    //   205: invokeinterface Zg : (Ljava/lang/String;)Ljava/io/File;
    //   210: astore_3
    //   211: aload_3
    //   212: invokevirtual exists : ()Z
    //   215: ifne -> 240
    //   218: aload_0
    //   219: getfield Zj : Lburp/Zm9v;
    //   222: sipush #-4713
    //   225: sipush #26330
    //   228: invokestatic a : (II)Ljava/lang/String;
    //   231: invokevirtual setText : (Ljava/lang/String;)V
    //   234: iconst_0
    //   235: ireturn
    //   236: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   239: athrow
    //   240: aload_3
    //   241: invokestatic Zi : (Ljava/io/File;)Z
    //   244: ifeq -> 273
    //   247: aload_0
    //   248: getfield Zj : Lburp/Zm9v;
    //   251: sipush #-4725
    //   254: sipush #9055
    //   257: invokestatic a : (II)Ljava/lang/String;
    //   260: invokevirtual setText : (Ljava/lang/String;)V
    //   263: aload_0
    //   264: invokevirtual ZS : ()V
    //   267: iconst_0
    //   268: ireturn
    //   269: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   272: athrow
    //   273: aload_0
    //   274: getfield Zj : Lburp/Zm9v;
    //   277: ldc ' '
    //   279: invokevirtual setText : (Ljava/lang/String;)V
    //   282: iconst_1
    //   283: ireturn
    // Exception table:
    //   from	to	target	type
    //   46	71	71	java/nio/file/InvalidPathException
    //   80	91	94	java/nio/file/InvalidPathException
    //   84	116	116	java/nio/file/InvalidPathException
    //   120	145	148	java/nio/file/InvalidPathException
    //   160	171	174	java/nio/file/InvalidPathException
    //   164	196	196	java/nio/file/InvalidPathException
    //   211	236	236	java/nio/file/InvalidPathException
    //   240	269	269	java/nio/file/InvalidPathException
  }
  
  public void ZG(String paramString) {
    this.Zw.setText(paramString);
  }
  
  private static boolean Zc(String paramString) {
    try {
      Paths.get(paramString, new String[0]);
    } catch (InvalidPathException|NullPointerException invalidPathException) {
      Zah.Zl(invalidPathException, Zk_.IGNORED);
      return false;
    } 
    return true;
  }
  
  private static String Zm(String paramString) {
    try {
      if (Paths.get(paramString, new String[0]).isAbsolute())
        return paramString; 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    String str = Zs6n.ZK(Zg1m.PROJECT);
    if (str == null)
      str = Zo(); 
    return str + str + File.separator;
  }
  
  private static String Zo() {
    String str = System.getProperty(a(-4702, 5105));
    try {
      if (str != null)
        try {
          if (!str.isEmpty())
            return str; 
          Zuh.ZT(false, Zqf.Zx, a(-4707, -18378));
          return FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        } catch (InvalidPathException invalidPathException) {
          throw a(null);
        }  
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    Zuh.ZT(false, Zqf.Zx, a(-4707, -18378));
    return FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
  }
  
  private void ZS() {
    Zx6o.Zv(this.ZW.Zd(), a(-4721, -444), a(-4735, -30967));
  }
  
  private void Zg(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Zzdy;
    //   4: iload_1
    //   5: ifeq -> 33
    //   8: aload_0
    //   9: getfield Zr : Lburp/Zzdy;
    //   12: invokevirtual isSelected : ()Z
    //   15: ifeq -> 33
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: iconst_1
    //   26: goto -> 34
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: iconst_0
    //   34: invokevirtual setEnabled : (Z)V
    //   37: aload_0
    //   38: getfield Zr : Lburp/Zzdy;
    //   41: iload_1
    //   42: invokevirtual setEnabled : (Z)V
    //   45: return
    // Exception table:
    //   from	to	target	type
    //   0	18	21	java/nio/file/InvalidPathException
    //   8	29	29	java/nio/file/InvalidPathException
  }
  
  public Zrx7 ZL() {
    try {
      if (this.ZJ.isSelected())
        return new Zrx7(Zik.TEMPORARY, null, null, false, false); 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    try {
      if (this.ZT.isSelected())
        return new Zrx7(Zik.NEW, this.ZN.getText(), this.ZP.getText(), false, false); 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    return new Zrx7(Zik.EXISTING, this.ZQ.getText(), null, this.ZY.isSelected(), this.Zr.isSelected());
  }
  
  private void ZJ() {
    ZY();
  }
  
  private void ZY() {
    String[] arrayOfString = Zrk1.ZT();
    try {
      if (this.Zr.isSelected()) {
        try {
          this.ZY.setEnabled(true);
          if (arrayOfString != null) {
            this.ZY.setSelected(true);
            this.ZY.setEnabled(false);
            return;
          } 
        } catch (InvalidPathException invalidPathException) {
          throw a(null);
        } 
        return;
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    this.ZY.setSelected(true);
    this.ZY.setEnabled(false);
  }
  
  private void ZB() {
    try {
      if (Zsw8.ZP(this.ZP.getText())) {
        this.ZP.setText(Zgh4.ZZ());
        ZK();
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
  }
  
  private void ZK() {
    String[] arrayOfString = Zrk1.ZT();
    try {
      if (!this.ZM) {
        if (Zsw8.ZS(this.ZP.getText())) {
          String str = Zgh4.ZV(this.ZP.getText());
          try {
            this.ZN.setText(str);
            if (arrayOfString != null) {
              this.ZN.setText("");
              return;
            } 
          } catch (InvalidPathException invalidPathException) {
            throw a(null);
          } 
          return;
        } 
      } else {
        return;
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    this.ZN.setText("");
  }
  
  private void Zw() {
    try {
      if (ZR())
        this.ZW.ZU(this); 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
  }
  
  private void Zy() {
    this.Zk = new ButtonGroup();
    this.ZJ = new Zmg2();
    this.ZT = new Zmg2();
    this.Zv = new Zmg2();
    this.Zx = new Ze01();
    this.ZN = new Zg85();
    this.ZQ = new Zg85();
    this.Zu = new Ze01();
    this.Zw = new Zm9v();
    this.Zj = new Zm9v();
    this.Zt = new Zm99();
    this.ZP = new Zg85();
    this.ZZ = new Zbup();
    this.ZF = new Zm99();
    this.Za = new Zm99();
    this.Zy = new Zm2o();
    this.ZX = new JSeparator();
    this.ZV = new JSeparator();
    this.Z_ = new Zbqc();
    this.ZI = new Zl8w();
    this.Zi = new Zl8w();
    this.ZS = new Zm99();
    this.Zb = new Zm99();
    this.ZY = new Zzdy();
    this.Zr = new Zzdy();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zk.add(this.ZJ);
    this.ZJ.setSelected(true);
    this.ZJ.setText(a(-4693, -754));
    this.ZJ.setName(a(-4715, 1707));
    this.ZJ.addActionListener(new Zkth(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZJ, gridBagConstraints);
    this.Zk.add(this.ZT);
    this.ZT.setText(a(-4708, 10701));
    this.ZT.addActionListener(new Zg9_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZT, gridBagConstraints);
    this.Zk.add(this.Zv);
    this.Zv.setText(a(-4694, -21233));
    this.Zv.addActionListener(new Zm4z(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zv, gridBagConstraints);
    this.Zx.setText(a(-4704, 31890));
    this.Zx.addActionListener(new Ztfj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1536;
    add(this.Zx, gridBagConstraints);
    this.ZN.setName(a(-4722, 18002));
    this.ZN.addMouseListener(new Ztv5(this));
    this.ZN.addActionListener(new Ze8g(this));
    this.ZN.addKeyListener(new Zgew(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZN, gridBagConstraints);
    this.ZQ.setName(a(-4727, 22452));
    this.ZQ.addMouseListener(new Zsdx(this));
    this.ZQ.addKeyListener(new Ze10(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZQ, gridBagConstraints);
    this.Zu.setText(a(-4718, -27862));
    this.Zu.addActionListener(new Zm4l(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1536;
    add(this.Zu, gridBagConstraints);
    this.Zw.setText(a(-4736, -21372));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.Zw, gridBagConstraints);
    this.Zj.setText(a(-4719, -9832));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.Zj, gridBagConstraints);
    this.Zt.setText(a(-4701, 9812));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1536;
    add(this.Zt, gridBagConstraints);
    this.ZP.addFocusListener(new Zxyw(this));
    this.ZP.addMouseListener(new Zxnu(this));
    this.ZP.addActionListener(new Zemf(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZP, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZZ, gridBagConstraints);
    this.ZF.setText(a(-4720, -11024));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1536;
    add(this.ZF, gridBagConstraints);
    this.Za.setText(a(-4729, -13228));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1536;
    add(this.Za, gridBagConstraints);
    this.Zy.Zi(Zk97.DESKTOP_GETTING_STARTED_SELECTING_A_PROJECT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(3, 0, 0, 5);
    add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 1;
    gridBagConstraints.insets = new Insets(15, 0, 15, 0);
    add(this.ZX, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 1;
    gridBagConstraints.insets = new Insets(15, 0, 15, 0);
    add(this.ZV, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 5, 0 };
    this.Z_.setLayout(gridBagLayout2);
    this.ZI.setText(a(-4726, -26926));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.Z_.add(this.ZI, gridBagConstraints);
    this.Zi.setText(a(-4730, -18996));
    this.Zi.Zl(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.Z_.add(this.Zi, gridBagConstraints);
    this.ZS.setHorizontalAlignment(4);
    this.ZS.setVerticalAlignment(1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 24;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.Z_.add(this.ZS, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 1;
    add(this.Z_, gridBagConstraints);
    this.Zb.setText(a(-4711, 1793));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.Zb, gridBagConstraints);
    this.ZY.setText(a(-4695, 10955));
    this.ZY.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZY, gridBagConstraints);
    this.Zr.setSelected(true);
    this.Zr.setText(a(-4724, -23271));
    this.Zr.setEnabled(false);
    this.Zr.addActionListener(new Zbwa(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 23;
    add(this.Zr, gridBagConstraints);
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    this.ZT.setSelected(true);
    File file1 = ZD();
    File file2 = Zs6n.ZE(Zg1m.PROJECT, Zmjm.ZW, this.ZW.Zd(), 2, a(-4703, 30736), file1);
    if (file2 != null) {
      String str1 = file2.getAbsolutePath();
      try {
      
      } catch (InvalidPathException invalidPathException) {
        throw a(null);
      } 
      String str2 = str1.endsWith(a(-4723, -521)) ? str1 : (str1 + str1);
      this.ZN.setText(str2);
      this.ZM = true;
      this.ZN.grabFocus();
      Zg(false);
    } 
  }
  
  private void Za(ActionEvent paramActionEvent) {
    try {
      this.Zv.setSelected(true);
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    File file1 = Zsw8.ZP(this.ZQ.getText()) ? null : new File(this.ZQ.getText());
    File file2 = Zs6n.ZE(Zg1m.PROJECT, Zmjm.ZW, this.ZW.Zd(), 0, a(-4705, 1390), file1);
    try {
      if (file2 != null) {
        this.Zj.setText(" ");
        this.ZQ.setText(file2.getPath());
        this.ZQ.grabFocus();
        Zg(true);
        Zu((String)null);
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
  }
  
  private void Zv(MouseEvent paramMouseEvent) {
    try {
      if (this.ZQ.isEnabled()) {
        this.Zv.setSelected(true);
        this.Zw.setText(" ");
        Zg(true);
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
  }
  
  private void Zq(KeyEvent paramKeyEvent) {
    this.Zv.setSelected(true);
    this.Zw.setText("");
    Zg(true);
  }
  
  private void ZM(KeyEvent paramKeyEvent) {
    this.ZM = Zsw8.ZS(this.ZN.getText());
    this.ZT.setSelected(true);
    this.Zj.setText(" ");
    Zg(false);
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    this.Zw.setText(" ");
    Zg(true);
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    this.Zj.setText(" ");
    ZB();
    Zg(false);
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    this.Zj.setText(" ");
    this.Zw.setText(" ");
    Zg(false);
  }
  
  private void ZK(FocusEvent paramFocusEvent) {
    try {
      if (Zsw8.ZS(this.ZP.getText()))
        try {
          if (Zsw8.ZP(this.ZN.getText()))
            ZK(); 
        } catch (InvalidPathException invalidPathException) {
          throw a(null);
        }  
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
  }
  
  private void ZZ(MouseEvent paramMouseEvent) {
    try {
      if (this.ZP.isEnabled()) {
        ZB();
        this.ZT.setSelected(true);
        this.Zj.setText(" ");
        Zg(false);
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
  }
  
  private void Zm(MouseEvent paramMouseEvent) {
    try {
      if (this.ZN.isEnabled()) {
        ZB();
        this.ZT.setSelected(true);
        this.Zj.setText(" ");
        Zg(false);
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    ZJ();
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    Zw();
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    Zw();
  }
  
  private File ZD() {
    try {
      if (Zsw8.ZP(this.ZN.getText())) {
        try {
          if (Zsw8.ZP(this.ZP.getText()))
            return null; 
        } catch (InvalidPathException invalidPathException) {
          throw a(null);
        } 
        return new File(Zgh4.ZV(this.ZP.getText()));
      } 
    } catch (InvalidPathException invalidPathException) {
      throw a(null);
    } 
    return new File(this.ZN.getText());
  }
  
  private void lambda$configureForPlatformCapabilities$1() {
    this.Z_.remove(this.Zi);
  }
  
  private static String lambda$new$0(Zr4b paramZr4b) {
    return paramZr4b.Zh;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ã/Îp.ç(oSÅ+R½½ùÙéJO|ã¬FËWhÿ»Å&aÕü¯10M5®ÿÏ¹Ûþ×:³É*\WUý\\t}G:%øÓÉOÆK©ÀR#7ëè\\nò&e¹#9È"ÝËµY¦©;Æ¿*Ê_.¢»)ø+hjj0Â\\b/îæ-S«Ähå²'¹\\f\\r¯¶±xKcÉ´C@®Ä²#">m~78AÄâã®÷2Í·6éýKetàýºþdñufè/©E5Ò)m W52pVál:[,¿¾Fu\\rãÝìLÁÒÏ)Ôdfi½ìÜÝé²ÃÂâ2u6y´÷a°B?lÌ$ë±wq±"#Þ ²rn;k§¡0Mq¤&¦AÑÙ¨`®ýQÛô^ TBãÖ³m]Ý§Ì²°\\bh'[kP¡V\\tÒh`÷åÛTÔûò¢³c  §0¹-"^4ýDèÿ4À:QèôÅt21ìß¹I¢Þ½6$Êí£jÄ£!©¾?øQ¿Ì¸§±!`r¦EòÜ½`¬ðµEìðxþÒàsÔ\\tÒ±~\\tw|NÓ]ÕuÌDð£Ø3ÞäÐ-ywzÄ·§$´ÿ±}`¸K¢£ÝTç"­¥â\ËÌÁæD¨Tk}¬>²òÞ2ì;öyhCÂAì|}¡S«i9_Îþcìo\\bÍ¤òLoÿä<spï_²¢Hì/Üé|ÓIèkH©Â¥\\rrpBÏUý(-ÞÚÏ_'¨Gâ´a$X*"Æf^åõÁíÕ¿^Kb>Î¢ÄJÆÝ?pS\\rCQ{>Ù4¦OÑ4Xr6úûpB¼¥ â*ø@°c¬qÂ¿ ¦lÕJmÿÃ È\º¹ù)(ëz@¢É)&A4»}AÏÅûC íÔëÖÞîö`"»=+ubpñî]%§øKÜÊ¬? tû¸Zÿ¤¡ý\bf{#ðPS!\\t#3$¹W ±-ë1X3O$\\fd\³¢zîÊÐ :cÁ¨Iæé\\rã\\n"În¯ZGi{åM¨]ëó½µyêtûu0Kúß{®cA *NÞ»8ÝRuÁEüÁbîhYõ`COÔ÷L´¨ÎW')2A»¡òs\\fÚ_ð[E;÷\\rå°· T@¦&pBÁw»\\tÕ%gôrAÀSÇ.°\\r&­ã7*ñÖýF7¤ÑH¬#Ý«0Ñ!º´ó8A$u1[+Ð:4±[nÜk\\tÓ}î ~®r2\\t£<jÿÈ[Ô³à¶ÁÍµ4Æ9R¨x½§wZ\2º\\rUæK^zÞ¬7;o5ê{=Añcüùß(ÒbXc, ¹FùJßB~oÄU©ã¾ÖbÌ 8N»/±miLS[ñ%~·^HP©ø¹8à/â"£\\fEóÛáôÃ4Ñââ{u±uÝÝ(iH¿à«c°\\n}º´39»aÒÊät"[ì·3qß\\rõý1×¼P¼6Ð\\t§Sôs9½J÷û7ÑY±µfvIªýHNæfÜªZ;öÍ Ét0ù¦DOÞ:4Íodª1'Oz&ø @L\\tNKÐÍ[#TFgÊ3#²É2'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #86
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #112
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
    //   68: ldc '§´2[OþYû´ðáNvª¸ø ÅêÉpp=4$^(#'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #90
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
    //   129: putstatic burp/Zbgr.a : [Ljava/lang/String;
    //   132: bipush #45
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbgr.b : [Ljava/lang/String;
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
    //   212: bipush #43
    //   214: goto -> 244
    //   217: bipush #59
    //   219: goto -> 244
    //   222: bipush #120
    //   224: goto -> 244
    //   227: bipush #38
    //   229: goto -> 244
    //   232: bipush #8
    //   234: goto -> 244
    //   237: bipush #49
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
    int i = (paramInt1 ^ 0xFFFFED83) & 0xFFFF;
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
      char c = '¿';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */