package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbrd extends Zbg2 {
  private static boolean ZC;
  
  private final Zt4u ZF;
  
  private final Zkeg ZR;
  
  private final Zbre Zk;
  
  private File Zx;
  
  private Zep Zy;
  
  private Zm2o Zo;
  
  private Zl8w ZD;
  
  private Zl8w ZY;
  
  private Zm99 Za;
  
  private Zm99 Zf;
  
  private Zm99 Zt;
  
  private Zzdy Zw;
  
  private Ze01 Zn;
  
  private Zedd<String> ZN;
  
  private Zedd<String> ZS;
  
  private Zedd<String> ZW;
  
  private Zedd<String> Zz;
  
  private Zm99 Zm;
  
  private Zm99 ZO;
  
  private Zm99 ZT;
  
  private Zm9v Zu;
  
  private Zg85 Zs;
  
  private Zgff ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbrd(Zt4u paramZt4u, Zkeg paramZkeg, Zbre paramZbre) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZF : Lburp/Zt4u;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield ZR : Lburp/Zkeg;
    //   14: aload_0
    //   15: aload_3
    //   16: putfield Zk : Lburp/Zbre;
    //   19: invokestatic ZX : ()Z
    //   22: aload_0
    //   23: invokevirtual Zs : ()V
    //   26: aload_0
    //   27: getfield Zw : Lburp/Zzdy;
    //   30: getstatic burp/Zbrd.ZC : Z
    //   33: invokevirtual setSelected : (Z)V
    //   36: aload_0
    //   37: getfield ZW : Lburp/Zedd;
    //   40: sipush #-1091
    //   43: sipush #27879
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokevirtual addItem : (Ljava/lang/Object;)V
    //   52: aload_0
    //   53: getfield ZW : Lburp/Zedd;
    //   56: sipush #-1096
    //   59: sipush #24713
    //   62: invokestatic a : (II)Ljava/lang/String;
    //   65: invokevirtual addItem : (Ljava/lang/Object;)V
    //   68: aload_0
    //   69: getfield ZW : Lburp/Zedd;
    //   72: sipush #-1110
    //   75: sipush #14483
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: invokevirtual addItem : (Ljava/lang/Object;)V
    //   84: aload_0
    //   85: getfield ZW : Lburp/Zedd;
    //   88: sipush #-1117
    //   91: sipush #-11207
    //   94: invokestatic a : (II)Ljava/lang/String;
    //   97: invokevirtual addItem : (Ljava/lang/Object;)V
    //   100: aload_0
    //   101: getfield ZW : Lburp/Zedd;
    //   104: sipush #-1102
    //   107: sipush #-32140
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: invokevirtual addItem : (Ljava/lang/Object;)V
    //   116: aload_0
    //   117: getfield ZW : Lburp/Zedd;
    //   120: sipush #-1107
    //   123: sipush #-25528
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: invokevirtual addItem : (Ljava/lang/Object;)V
    //   132: aload_0
    //   133: getfield ZS : Lburp/Zedd;
    //   136: sipush #-1105
    //   139: sipush #26339
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokevirtual addItem : (Ljava/lang/Object;)V
    //   148: aload_0
    //   149: getfield ZS : Lburp/Zedd;
    //   152: sipush #-1106
    //   155: sipush #-5574
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokevirtual addItem : (Ljava/lang/Object;)V
    //   164: aload_0
    //   165: getfield ZS : Lburp/Zedd;
    //   168: sipush #-1111
    //   171: sipush #-16473
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual addItem : (Ljava/lang/Object;)V
    //   180: istore #4
    //   182: aload_0
    //   183: getfield ZS : Lburp/Zedd;
    //   186: sipush #-1115
    //   189: sipush #-23548
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual addItem : (Ljava/lang/Object;)V
    //   198: aload_0
    //   199: getfield ZS : Lburp/Zedd;
    //   202: sipush #-1094
    //   205: sipush #-27424
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: invokevirtual addItem : (Ljava/lang/Object;)V
    //   214: aload_0
    //   215: getfield ZS : Lburp/Zedd;
    //   218: sipush #-1090
    //   221: sipush #9838
    //   224: invokestatic a : (II)Ljava/lang/String;
    //   227: invokevirtual addItem : (Ljava/lang/Object;)V
    //   230: aload_0
    //   231: getfield ZX : Lburp/Zgff;
    //   234: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   237: getfield ZX : [B
    //   240: invokestatic ZG : ([B)Ljava/lang/String;
    //   243: invokevirtual setText : (Ljava/lang/String;)V
    //   246: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   249: getfield ZQ : B
    //   252: tableswitch default -> 342, 0 -> 280, 1 -> 314, 2 -> 327
    //   280: aload_0
    //   281: getfield ZN : Lburp/Zedd;
    //   284: iconst_0
    //   285: invokevirtual setSelectedIndex : (I)V
    //   288: iload #4
    //   290: ifne -> 342
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   299: athrow
    //   300: iconst_3
    //   301: anewarray burp/Zbqc
    //   304: invokestatic Zr : ([Lburp/Zbqc;)V
    //   307: goto -> 314
    //   310: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   313: athrow
    //   314: aload_0
    //   315: getfield ZN : Lburp/Zedd;
    //   318: iconst_1
    //   319: invokevirtual setSelectedIndex : (I)V
    //   322: iload #4
    //   324: ifne -> 342
    //   327: aload_0
    //   328: getfield ZN : Lburp/Zedd;
    //   331: iconst_2
    //   332: invokevirtual setSelectedIndex : (I)V
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   341: athrow
    //   342: aload_0
    //   343: aconst_null
    //   344: invokevirtual ZW : (Ljava/awt/event/ActionEvent;)V
    //   347: aload_0
    //   348: getfield Zz : Lburp/Zedd;
    //   351: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   354: getfield Ze : B
    //   357: iconst_1
    //   358: isub
    //   359: invokevirtual setSelectedIndex : (I)V
    //   362: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   365: getfield ZM : B
    //   368: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   371: getfield Zx : Z
    //   374: invokestatic ZQ : (BZ)I
    //   377: istore #5
    //   379: aload_0
    //   380: getfield ZW : Lburp/Zedd;
    //   383: iload #5
    //   385: invokevirtual setSelectedIndex : (I)V
    //   388: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   391: getfield ZT : B
    //   394: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   397: getfield Zh : Z
    //   400: invokestatic ZQ : (BZ)I
    //   403: istore #6
    //   405: aload_0
    //   406: getfield ZS : Lburp/Zedd;
    //   409: iload #6
    //   411: invokevirtual setSelectedIndex : (I)V
    //   414: aload_0
    //   415: getfield Zu : Lburp/Zm9v;
    //   418: iconst_0
    //   419: invokevirtual setVisible : (Z)V
    //   422: aload_0
    //   423: iconst_2
    //   424: anewarray java/lang/String
    //   427: dup
    //   428: iconst_0
    //   429: sipush #-1089
    //   432: sipush #-19042
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: aastore
    //   439: dup
    //   440: iconst_1
    //   441: sipush #-1092
    //   444: sipush #20559
    //   447: invokestatic a : (II)Ljava/lang/String;
    //   450: aastore
    //   451: putfield ZB : [Ljava/lang/String;
    //   454: aload_0
    //   455: iconst_2
    //   456: newarray boolean
    //   458: dup
    //   459: iconst_0
    //   460: iconst_1
    //   461: bastore
    //   462: dup
    //   463: iconst_1
    //   464: iconst_1
    //   465: bastore
    //   466: putfield ZA : [Z
    //   469: aload_0
    //   470: iconst_1
    //   471: putfield Zh : I
    //   474: return
    // Exception table:
    //   from	to	target	type
    //   182	293	296	java/lang/IllegalStateException
    //   280	307	310	java/lang/IllegalStateException
    //   314	335	338	java/lang/IllegalStateException
  }
  
  public void ZC() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool = (this.Zk.Zv() != Zxtk.XML) ? true : false;
    this.ZX.setEnabled(bool);
    this.ZN.setEnabled(bool);
    this.Zz.setEnabled(bool);
    this.ZW.setEnabled(bool);
    this.ZS.setEnabled(bool);
    this.Zw.setEnabled(bool);
  }
  
  public Zsic Zn(int paramInt) {
    try {
      boolean bool;
      switch (paramInt) {
        case 0:
          return this.ZR.ZS(this);
        case 1:
          bool = true;
          try {
            String str = Zs6n.Zc(this.Zs.getText(), (this.Zk.Zv()).fileExtension);
            this.Zx = new File(str);
            this.Zy = new Zep(this.Zx);
            this.Zu.setVisible(false);
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
            bool = false;
            this.Zu.setVisible(true);
          } 
          try {
          
          } catch (Exception exception) {
            throw a(null);
          } 
          return bool ? this.ZR.Zh(this) : this;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  Zep ZZ() {
    return this.Zy;
  }
  
  File Zk() {
    return this.Zx;
  }
  
  byte[] Zm() {
    String str = this.ZX.getText();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (str.length() == 0) ? null : Zkb.Zy(str);
  }
  
  byte Zu() {
    return (byte)this.ZN.getSelectedIndex();
  }
  
  byte Zv() {
    return (byte)(1 + this.Zz.getSelectedIndex());
  }
  
  byte ZU() {
    try {
      switch (this.ZW.getSelectedIndex()) {
        case 0:
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return -1;
  }
  
  private static int ZQ(byte paramByte, boolean paramBoolean) {
    try {
      switch (paramByte) {
        case 4:
        
        case 3:
        
        case 2:
        
        case 1:
          try {
          
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          return paramBoolean ? 0 : 1;
        case -1:
        
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(a(-1120, -994).formatted(new Object[] { Byte.valueOf(paramByte) }));
  }
  
  byte Za() {
    try {
      switch (this.ZS.getSelectedIndex()) {
        case 0:
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return -1;
  }
  
  boolean ZY() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZW.getSelectedIndex() == 0);
  }
  
  boolean ZS() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZS.getSelectedIndex() == 0);
  }
  
  boolean Zt() {
    return this.Zw.isSelected();
  }
  
  private void Zs() {
    this.Zs = new Zg85();
    this.Zn = new Ze01();
    this.Zu = new Zm9v();
    this.Zm = new Zm99();
    this.ZO = new Zm99();
    this.ZX = new Zgff();
    this.ZT = new Zm99();
    this.Zz = new Zedd<>();
    this.ZN = new Zedd<>();
    this.ZD = new Zl8w();
    this.Zo = new Zm2o();
    this.ZY = new Zl8w();
    this.Za = new Zm99();
    this.Zf = new Zm99();
    this.Zt = new Zm99();
    this.ZW = new Zedd<>();
    this.ZS = new Zedd<>();
    this.Zw = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zs.setColumns(25);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zs, gridBagConstraints);
    this.Zn.setText(a(-1108, 9929));
    this.Zn.addActionListener(new Zev5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zn, gridBagConstraints);
    this.Zu.setText(a(-1114, 31304));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.Zu, gridBagConstraints);
    this.Zm.setText(a(-1118, -6170));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zm, gridBagConstraints);
    this.ZO.setText(a(-1113, -881));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZO, gridBagConstraints);
    this.ZX.setColumns(25);
    this.ZX.ZH(Zlw9.REPORT_TITLE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.ZX, gridBagConstraints);
    this.ZT.setText(a(-1101, -29145));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZT, gridBagConstraints);
    this.Zz.setModel(new DefaultComboBoxModel<>(new String[] { "1", "2" }));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zz, gridBagConstraints);
    this.ZN.setModel(new DefaultComboBoxModel<>(new String[] { a(-1095, -20327), a(-1112, -3510), a(-1119, 19343) }));
    this.ZN.addActionListener(new Zm_1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZN, gridBagConstraints);
    this.ZD.setText(a(-1093, 10968));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.ZD, gridBagConstraints);
    this.Zo.Zi(Zk97.DESKTOP_SCANNING_REPORTING_RESULTS_REPORT_DETAILS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zo, gridBagConstraints);
    this.ZY.setText(a(-1109, 22255));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZY, gridBagConstraints);
    this.Za.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.Za, gridBagConstraints);
    this.Zf.setText(a(-1116, 2184));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    add(this.Zf, gridBagConstraints);
    this.Zt.setText(a(-1103, -7666));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 1280;
    add(this.Zt, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZS, gridBagConstraints);
    this.Zw.setText(a(-1104, -7768));
    this.Zw.addActionListener(new Zluu(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zw, gridBagConstraints);
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    File file = Zs6n.ZP(Zg1m.DATA, this.ZF, this, 1);
    if (file != null) {
      String str = Zs6n.Zc(file.getPath(), (this.Zk.Zv()).fileExtension);
      this.Zs.setText(str);
      this.Zu.setVisible(false);
    } 
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    boolean bool = Zsh9.Zq();
    try {
      if (this.ZN.getSelectedIndex() == 0) {
        try {
          if (this.Zz.getItemCount() == 3)
            try {
              this.Zz.removeItemAt(2);
              if (bool) {
                try {
                  if (this.Zz.getItemCount() == 2)
                    this.Zz.addItem("3"); 
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                } 
                return;
              } 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Zz.getItemCount() == 2)
        this.Zz.addItem("3"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private void ZU(ActionEvent paramActionEvent) {
    ZC = this.Zw.isSelected();
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' ×"ÓcÄgr?¤S,¶ã?s¢:»/º\\r51³kzÍçÀÄ¥\\f \\bdjkªè+fÆÉ§\ÏArUHÆâ.ãÚ»¡¼gõ%÷1ê+Lu¹¸»pà¯¢þ¾\\f=5z¦Ù@;\Ó(#RÑÅâßËZÇLSÕâÂ\\fâãF>µÙí¦TÇ#E6)\\bÑ^~ô\\n¤¦~Ëhü xùm¯¸¸sà³ 7EºØ=j·Í3"Óñ©½«QEÅ£U»H lÜj9[£weþ+Õ"\\b92w^*U.\\n]rWË?:3izuí÷ÌN§@é7Ü¥n0Ð°o´èðÝUàÚ!¹\\fÑe¸7±5¸ë\\rÇy¥Eö×[ÇC\\ncQPÞk!ßYÈ{ÏßÁeS\\fò²o+ÆtÈ²åJâ\\rÈ5Ä-óI\\t_2\\n=âu¨5þ"þþ½Åïß®ãz¬X+©Þ¤µ ?Ð5)\M:®xÎm(;ÛvkþØPÃmï\\fCÃð0iªOO«kÉElÄ1ntL@}WëÕ[»rÞ­5^ºÐw¸R2Ä¼l¸Ó\\reUd+\\n+WõvÂ?ãx¡ê%MUJÏÝÔ_þÚ2'î+tècà^)Ü¨'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #84
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
    //   68: ldc 'ä:$D¾pYZt:¾BfÊFç?-\CïÐàÐ}$\\b%½S!çáïu´èuÊÖKàNL´¾ÿ¶d?àø¹\\n''
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #50
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #109
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
    //   129: putstatic burp/Zbrd.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbrd.b : [Ljava/lang/String;
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
    //   212: bipush #6
    //   214: goto -> 244
    //   217: bipush #30
    //   219: goto -> 244
    //   222: bipush #41
    //   224: goto -> 244
    //   227: bipush #33
    //   229: goto -> 244
    //   232: bipush #108
    //   234: goto -> 244
    //   237: bipush #10
    //   239: goto -> 244
    //   242: bipush #24
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
    //   300: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   303: getfield Zc : Z
    //   306: putstatic burp/Zbrd.ZC : Z
    //   309: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFBAA) & 0xFFFF;
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
      byte b1 = 79;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbrd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */