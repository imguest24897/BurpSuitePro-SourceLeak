package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.border.EmptyBorder;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbvq extends Zbqc implements Ztf1 {
  private final Zt4u Zd;
  
  private final Zlte Za;
  
  private final int Zi;
  
  private final Zkvz Zt;
  
  private final boolean ZV;
  
  private Zbkv ZT;
  
  private ButtonGroup ZE;
  
  private Zm2o Zo;
  
  private Ze01 ZP;
  
  private Zm99 ZA;
  
  private Zm9v Zx;
  
  private Zbqc Zl;
  
  private Zmg2 Zw;
  
  private Zmg2 ZQ;
  
  private Zmg2 ZR;
  
  private Zg85 Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbvq(Zt4u paramZt4u, Zlte paramZlte, int paramInt, Zkvz paramZkvz, boolean paramBoolean, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv) {
    this(paramZt4u, paramZlte, paramInt, paramZkvz, paramBoolean, paramZgb6, paramZb0h, paramZtwv, (String)null);
  }
  
  Zbvq(Zt4u paramZt4u, Zlte paramZlte, int paramInt, Zkvz paramZkvz, boolean paramBoolean, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, String paramString) {
    this.Zd = paramZt4u;
    this.Za = paramZlte;
    this.Zi = paramInt;
    this.Zt = paramZkvz;
    this.ZV = paramBoolean;
    ZJ();
    int i = Zbm2.ZS();
    this.Zx.setVisible(false);
    if (paramBoolean) {
      setBorder(new EmptyBorder(10, 10, 10, 10));
      this.ZR.setSelected(true);
      remove(this.ZA);
      remove(this.Zo);
      if (i == 0) {
        this.ZR.setText(this.ZR.getText() + ":");
        this.ZT = new Zbkv(false, paramZgb6, paramZb0h, paramZtwv);
        this.ZT.setName(paramString);
        this.ZT.ZJ();
        this.ZT.ZM(paramZkvz);
        this.ZT.Zh(true);
        this.ZT.ZY(true);
        this.Zl.add(this.ZT, a(-16478, -20061));
        Zd((byte)-1, paramZkvz.Zj());
        return;
      } 
      return;
    } 
    this.ZR.setText(this.ZR.getText() + ":");
    this.ZT = new Zbkv(false, paramZgb6, paramZb0h, paramZtwv);
    this.ZT.setName(paramString);
    this.ZT.ZJ();
    this.ZT.ZM(paramZkvz);
    this.ZT.Zh(true);
    this.ZT.ZY(true);
    this.Zl.add(this.ZT, a(-16478, -20061));
    Zd((byte)-1, paramZkvz.Zj());
  }
  
  public void removeNotify() {
    super.removeNotify();
    if (!this.ZV)
      this.Zt.Zi(this); 
  }
  
  private void Zd(byte paramByte1, byte paramByte2) {
    // Byte code:
    //   0: invokestatic ZS : ()I
    //   3: istore_3
    //   4: iload_1
    //   5: iload_2
    //   6: if_icmpeq -> 13
    //   9: iconst_1
    //   10: goto -> 14
    //   13: iconst_0
    //   14: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   17: iload_1
    //   18: i2l
    //   19: iload_2
    //   20: i2l
    //   21: invokestatic ZC : (ZLnet/portswigger/Zqf;JJ)V
    //   24: iload_1
    //   25: iconst_2
    //   26: if_icmpne -> 37
    //   29: aload_0
    //   30: getfield Zt : Lburp/Zkvz;
    //   33: aload_0
    //   34: invokevirtual Zi : (Lburp/Ztf1;)V
    //   37: iload_2
    //   38: tableswitch default -> 183, 0 -> 64, 1 -> 86, 2 -> 153
    //   64: aload_0
    //   65: getfield Zw : Lburp/Zmg2;
    //   68: iconst_1
    //   69: invokevirtual setSelected : (Z)V
    //   72: aload_0
    //   73: getfield ZT : Lburp/Zbkv;
    //   76: getstatic net/portswigger/Zdo.ZQ : [B
    //   79: invokevirtual Zx : ([B)V
    //   82: iload_3
    //   83: ifne -> 183
    //   86: aload_0
    //   87: getfield Zt : Lburp/Zkvz;
    //   90: invokevirtual ZT : ()Ljava/lang/Object;
    //   93: astore #4
    //   95: aload #4
    //   97: instanceof java/io/File
    //   100: ifeq -> 122
    //   103: aload_0
    //   104: getfield Zb : Lburp/Zg85;
    //   107: aload #4
    //   109: checkcast java/io/File
    //   112: invokevirtual getPath : ()Ljava/lang/String;
    //   115: invokevirtual setText : (Ljava/lang/String;)V
    //   118: iload_3
    //   119: ifne -> 131
    //   122: aload_0
    //   123: getfield Zb : Lburp/Zg85;
    //   126: ldc ''
    //   128: invokevirtual setText : (Ljava/lang/String;)V
    //   131: aload_0
    //   132: getfield ZQ : Lburp/Zmg2;
    //   135: iconst_1
    //   136: invokevirtual setSelected : (Z)V
    //   139: aload_0
    //   140: getfield ZT : Lburp/Zbkv;
    //   143: getstatic net/portswigger/Zdo.ZQ : [B
    //   146: invokevirtual Zx : ([B)V
    //   149: iload_3
    //   150: ifne -> 183
    //   153: aload_0
    //   154: getfield ZR : Lburp/Zmg2;
    //   157: iconst_1
    //   158: invokevirtual setSelected : (Z)V
    //   161: aload_0
    //   162: getfield ZT : Lburp/Zbkv;
    //   165: aload_0
    //   166: getfield Zt : Lburp/Zkvz;
    //   169: invokevirtual ZK : ()[B
    //   172: invokevirtual Zx : ([B)V
    //   175: aload_0
    //   176: getfield Zt : Lburp/Zkvz;
    //   179: aload_0
    //   180: invokevirtual Zy : (Lburp/Ztf1;)V
    //   183: return
  }
  
  byte ZD() {
    return this.Zw.isSelected() ? 0 : (this.ZQ.isSelected() ? 1 : 2);
  }
  
  File ZK() {
    return !this.ZQ.isSelected() ? null : new File(this.Zb.getText());
  }
  
  private void ZJ() {
    this.ZE = new ButtonGroup();
    this.Zw = new Zmg2();
    this.ZQ = new Zmg2();
    this.ZR = new Zmg2();
    this.Zl = new Zbqc();
    this.ZP = new Ze01();
    this.Zb = new Zg85();
    this.Zx = new Zm9v();
    this.ZA = new Zm99();
    this.Zo = new Zm2o();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZE.add(this.Zw);
    this.Zw.setText(a(-16474, -12277));
    this.Zw.addActionListener(this::Zg);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 21;
    add(this.Zw, gridBagConstraints);
    this.ZE.add(this.ZQ);
    this.ZQ.setText(a(-16476, -29455));
    this.ZQ.addActionListener(this::Zp);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZQ, gridBagConstraints);
    this.ZE.add(this.ZR);
    this.ZR.setText(a(-16475, -1944));
    this.ZR.addActionListener(this::ZR);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 21;
    add(this.ZR, gridBagConstraints);
    this.Zl.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zl, gridBagConstraints);
    this.ZP.setText(a(-16480, 6424));
    this.ZP.addActionListener(this::ZM);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZP, gridBagConstraints);
    this.Zb.setColumns(20);
    this.Zb.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zb, gridBagConstraints);
    this.Zx.setText(a(-16479, 26862));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zx, gridBagConstraints);
    this.ZA.setText(a(-16473, -26895));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    add(this.ZA, gridBagConstraints);
    this.Zo.Zi(Zk97.DESKTOP_TOOLS_EXTENDER_EXTENSION_DETAILS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 24;
    add(this.Zo, gridBagConstraints);
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    int i = Zbm2.ZS();
    try {
      File file = Ze();
      try {
        this.Zx.setVisible(false);
        if (this.ZV) {
          try {
            this.ZQ.setSelected(true);
            if (i == 0) {
              try {
                if (this.Zt.Zj() != 1)
                  Zd(this.Zt.Zj(), (byte)1); 
              } catch (Exception exception) {
                throw a(null);
              } 
              try {
                if (this.ZQ.isSelected())
                  this.Zt.ZI((byte)1, file); 
              } catch (Exception exception) {
                throw a(null);
              } 
            } 
          } catch (Exception exception) {
            throw a(null);
          } 
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (this.Zt.Zj() != 1)
          Zd(this.Zt.Zj(), (byte)1); 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (this.ZQ.isSelected())
          this.Zt.ZI((byte)1, file); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      ZU();
    } 
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    this.Zx.setVisible(false);
    if (!this.ZV) {
      if (this.Zt.Zj() == 0)
        return; 
      Zd(this.Zt.Zj(), (byte)0);
      this.Zt.Zq((byte)0);
    } 
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    File file;
    try {
      if (!this.ZV)
        try {
          if (this.Zt.Zj() == 1)
            return; 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      String str = this.Zb.getText();
      try {
        if (str.isEmpty())
          throw new Exception(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      file = new File(str);
      try {
        if (!file.exists())
          try {
            if (!file.createNewFile())
              throw new Exception(); 
          } catch (Exception exception) {
            throw a(null);
          }  
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      try {
        file = Ze();
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
        ZU();
        return;
      } 
    } 
    this.Zx.setVisible(false);
    if (!this.ZV) {
      Zd(this.Zt.Zj(), (byte)1);
      this.Zb.setText(file.getPath());
      try {
        this.Zt.ZI((byte)1, file);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
        this.Zx.setVisible(true);
        ZM((ActionEvent)null);
      } 
    } 
  }
  
  private File Ze() throws Exception {
    File file = Zs6n.Zp(Zg1m.EXTENSIONS, this.Zd, this, 1, a(-16477, -22795));
    try {
      if (file == null)
        throw new Exception(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      this.Zb.setText(file.getPath());
      if (!file.exists())
        try {
          if (!file.createNewFile())
            throw new Exception(); 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return file;
  }
  
  private void ZU() {
    this.Zx.setVisible(true);
    if (!this.ZV) {
      this.ZR.setSelected(true);
      if (this.Zt.Zj() != 2)
        ZR((ActionEvent)null); 
    } 
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    if (!this.ZV && this.Zt.Zj() == 2)
      return; 
    this.Zx.setVisible(false);
    if (!this.ZV) {
      Zd(this.Zt.Zj(), (byte)2);
      this.Zt.Zq((byte)2);
    } 
  }
  
  public void Zc(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Zuh.Zb((this.Zt.Zj() == 2), Zqf.Zr);
    this.ZT.ZX(paramArrayOfbyte, paramInt1, paramInt2);
    this.Za.Z_(this.Zi, Zlkk.TAB_FLASH_COLOUR.ZS(), true);
  }
  
  public void Z_() {
    Zuh.Zb((this.Zt.Zj() == 2), Zqf.Zr);
    this.ZT.Zx(Zdo.ZQ);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'qK¡æÿ ³üjÅ5âL%²[²Òå°¼ØuF9-O×ÎeG# Àñ»Í>ÔRzáÀ÷Ä,tÜÛ\\rï/hîÜÕU-OÍS\\n\\faj½Wü½('
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #35
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
    //   68: ldc 'âdªzÔP@:êcb.+ÃfÈþ)Nö)Ó/ç'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #24
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #120
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
    //   129: putstatic burp/Zbvq.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbvq.b : [Ljava/lang/String;
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
    //   212: bipush #45
    //   214: goto -> 244
    //   217: bipush #32
    //   219: goto -> 244
    //   222: bipush #56
    //   224: goto -> 244
    //   227: bipush #96
    //   229: goto -> 244
    //   232: bipush #9
    //   234: goto -> 244
    //   237: bipush #42
    //   239: goto -> 244
    //   242: bipush #54
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
    int i = (paramInt1 ^ 0xFFFFBFA0) & 0xFFFF;
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
      byte b1 = 106;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */