package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zrv2 extends Zrh7 {
  private final Zbk3 ZK;
  
  private final Ze5p Zg;
  
  private Zbqc ZY;
  
  private Ze01 Zf;
  
  private Ze01 Zz;
  
  private Zedd Za;
  
  private Zl8w ZJ;
  
  private Zm2o Zd;
  
  private Zm99 ZU;
  
  private Zm99 ZE;
  
  private Zm99 Z_;
  
  private Zm99 ZD;
  
  private Zm99 Zx;
  
  private Zm99 Zi;
  
  private Zm99 ZZ;
  
  private Zm99 Zl;
  
  private Zbqc ZG;
  
  private Zm9v Zp;
  
  private Zgff Zk;
  
  private Zgff Zy;
  
  private Zgff ZP;
  
  private Zgff ZX;
  
  private Ztln Zc;
  
  private Zgff ZM;
  
  private Zgff ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrv2(Window paramWindow, Zbk3 paramZbk3, Zeap paramZeap, Ze5p paramZe5p) {
    super(paramWindow, true, Zzv7.CONFIG_PANEL_UPSTREAM_PROXIES_POPUP);
    this.ZK = paramZbk3;
    this.Zg = paramZe5p;
    ZD();
    setTitle((paramZeap == null) ? a(26494, 18940) : a(26487, -4547));
    this.Zk.ZM(a(26475, -5605));
    this.ZP.ZM(a(26492, 141));
    this.Za.addItem(a(26478, -23437));
    this.Za.addItem(a(26495, 4106));
    this.Za.addItem(a(26477, 20728));
    this.Za.addItem(a(26484, -2212));
    if (paramZeap != null)
      ZM(paramZeap); 
    addWindowListener(new Zgjr(this));
    pack();
    Zq(paramWindow);
  }
  
  private void ZM(Zeap paramZeap) {
    this.Zk.setText(paramZeap.ZO());
    this.ZP.setText((paramZeap.ZK() == null) ? "" : paramZeap.ZK().ZH().ZJ1());
    this.ZM.setText((paramZeap.ZK() == null) ? "" : Integer.toString(paramZeap.ZK().ZH().ZJO()));
    Zkjm zkjm = (paramZeap.ZK() == null) ? null : paramZeap.ZK().ZD();
    this.Za.setSelectedIndex((zkjm == null) ? 0 : zkjm.Zn());
    this.ZW.setText((zkjm == null) ? "" : zkjm.Zk());
    this.Zc.setText((zkjm == null) ? "" : zkjm.ZK());
    this.Zy.setText((zkjm == null) ? "" : zkjm.Zd());
    this.ZX.setText((zkjm == null) ? "" : zkjm.ZJ());
  }
  
  private void ZD() {
    this.ZY = new Zbqc();
    this.ZJ = new Zl8w();
    this.Zd = new Zm2o();
    this.Z_ = new Zm99();
    this.ZE = new Zm99();
    this.ZD = new Zm99();
    this.Za = new Zedd();
    this.ZM = new Zgff();
    this.ZP = new Zgff();
    this.Zi = new Zm99();
    this.Zx = new Zm99();
    this.ZZ = new Zm99();
    this.ZU = new Zm99();
    this.ZX = new Zgff();
    this.Zy = new Zgff();
    this.Zc = new Ztln();
    this.ZW = new Zgff();
    this.Zl = new Zm99();
    this.Zk = new Zgff();
    this.ZG = new Zbqc();
    this.Zf = new Ze01();
    this.Zz = new Ze01();
    this.Zp = new Zm9v();
    setDefaultCloseOperation(2);
    this.ZY.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    this.ZY.setLayout(gridBagLayout);
    this.ZJ.setText(a(26482, 26112));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.ZY.add(this.ZJ, gridBagConstraints);
    this.Zd.Zi(Zk97.DESKTOP_SETTINGS_NETWORK_CONNECTIONS_UPSTREAM_PROXY_SERVERS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZY.add(this.Zd, gridBagConstraints);
    this.Z_.setText(a(26490, 9396));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.Z_, gridBagConstraints);
    this.ZE.setText(a(26491, -14446));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.ZE, gridBagConstraints);
    this.ZD.setText(a(26486, -30782));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.ZD, gridBagConstraints);
    this.Za.addActionListener(new Zxtq(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.Za, gridBagConstraints);
    this.ZM.ZH(Zlw9.PORT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.ZM, gridBagConstraints);
    this.ZP.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.ZP, gridBagConstraints);
    this.Zi.setText(a(26479, 11420));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.Zi, gridBagConstraints);
    this.Zx.setText(a(26480, 17985));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.Zx, gridBagConstraints);
    this.ZZ.setText(a(26474, -8237));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.ZZ, gridBagConstraints);
    this.ZU.setText(a(26483, -19899));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.ZU, gridBagConstraints);
    this.ZX.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.ZX, gridBagConstraints);
    this.Zy.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.Zc, gridBagConstraints);
    this.ZW.ZH(Zlw9.USERNAME);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.ZW, gridBagConstraints);
    this.Zl.setText(a(26485, 28071));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.Zl, gridBagConstraints);
    this.Zk.setColumns(30);
    this.Zk.ZH(Zlw9.HOST_WILDCARD);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.Zk, gridBagConstraints);
    this.ZG.setLayout(new GridLayout(1, 2, 5, 0));
    this.Zf.setText(a(26481, 24998));
    this.Zf.addActionListener(new Zm4a(this));
    this.ZG.add(this.Zf);
    this.Zz.setText(a(26489, 6129));
    this.Zz.addActionListener(new Ztfw(this));
    this.ZG.add(this.Zz);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weighty = 1.0D;
    this.ZY.add(this.ZG, gridBagConstraints);
    this.Zp.setText(a(26488, -11137));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZY.add(this.Zp, gridBagConstraints);
    getContentPane().add(this.ZY, a(26493, 30176));
    pack();
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Za : Lburp/Zedd;
    //   8: invokevirtual getSelectedIndex : ()I
    //   11: tableswitch default -> 147, 0 -> 40, 1 -> 76, 2 -> 112, 3 -> 112
    //   40: aload_0
    //   41: getfield ZW : Lburp/Zgff;
    //   44: iconst_0
    //   45: invokevirtual setEnabled : (Z)V
    //   48: aload_0
    //   49: getfield Zc : Lburp/Ztln;
    //   52: iconst_0
    //   53: invokevirtual setEnabled : (Z)V
    //   56: aload_0
    //   57: getfield Zy : Lburp/Zgff;
    //   60: iconst_0
    //   61: invokevirtual setEnabled : (Z)V
    //   64: aload_0
    //   65: getfield ZX : Lburp/Zgff;
    //   68: iconst_0
    //   69: invokevirtual setEnabled : (Z)V
    //   72: aload_2
    //   73: ifnonnull -> 147
    //   76: aload_0
    //   77: getfield ZW : Lburp/Zgff;
    //   80: iconst_1
    //   81: invokevirtual setEnabled : (Z)V
    //   84: aload_0
    //   85: getfield Zc : Lburp/Ztln;
    //   88: iconst_1
    //   89: invokevirtual setEnabled : (Z)V
    //   92: aload_0
    //   93: getfield Zy : Lburp/Zgff;
    //   96: iconst_0
    //   97: invokevirtual setEnabled : (Z)V
    //   100: aload_0
    //   101: getfield ZX : Lburp/Zgff;
    //   104: iconst_0
    //   105: invokevirtual setEnabled : (Z)V
    //   108: aload_2
    //   109: ifnonnull -> 147
    //   112: aload_0
    //   113: getfield ZW : Lburp/Zgff;
    //   116: iconst_1
    //   117: invokevirtual setEnabled : (Z)V
    //   120: aload_0
    //   121: getfield Zc : Lburp/Ztln;
    //   124: iconst_1
    //   125: invokevirtual setEnabled : (Z)V
    //   128: aload_0
    //   129: getfield Zy : Lburp/Zgff;
    //   132: iconst_1
    //   133: invokevirtual setEnabled : (Z)V
    //   136: aload_0
    //   137: getfield ZX : Lburp/Zgff;
    //   140: iconst_1
    //   141: invokevirtual setEnabled : (Z)V
    //   144: goto -> 147
    //   147: return
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    Zeap zeap;
    try {
      int i = -1;
      try {
        if (!this.ZM.getText().isEmpty()) {
          i = Integer.parseInt(this.ZM.getText());
          try {
            if (!Zgxs.ZO(i))
              throw new Exception(); 
          } catch (Exception exception) {
            throw a(null);
          } 
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.USER_ERROR);
        throw new Zto6(a(26476, -14158));
      } 
      zeap = this.Zg.Zw(true, this.Zk.getText(), this.ZP.getText(), i, (byte)this.Za.getSelectedIndex(), this.ZW.getText(), new String(this.Zc.getPassword()), this.Zy.getText(), this.ZX.getText());
    } catch (Zto6 zto6) {
      Zah.Zl(zto6, Zk_.USER_ERROR);
      this.Zp.setText(zto6.getMessage());
      return;
    } 
    setVisible(false);
    dispose();
    this.ZK.Zb(zeap);
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
    this.ZK.Zb(null);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'igUº¿fdaí /DºÃË±OR(ô°+ähñQâÇÝé?åÄð°~Â:ÇÈ+¶ Yèú9Þ¶O*¿Ló×s÷§È.71Ö0}4~kX\ö»ÈÈ+Òì%ì Ïôñ49$DÎ¬jËs²`76Ãlè1íèpÌÃíW+(£Ñèg¸b©ëV¶©r8ñÒô³ìk¿ÆþNó¿=_vÞÏ:$vn(átúFª¿@Æ{pëãPk%»û<ãâ´uïz¤6X\\bt__M|gH¬?«n w6Å\\njâ{§´fæõÁîÄ0uäb\\bjyÿ£ò2ûÝÓÌ°ãoæq\\rÜvÈ|Â#ÂnsSµÛJÞnÅ3É^H­¼v9;X\\b Ñ°ö«è9Ru­°íRTÝa0*| ¤Ïü+z\\t½|·²0¹:7:óÖt.¾ÓpHßävÏÇ/YB«Ó\\rHþÔ.,"Åp,ò¤é¿Æä;MRñ4¿'.Jó6n§õ¨Ñ\^ÅêãO|ã óô¤.Ñ§X\\t¹­:óÿ¤¨Å(\\tCRæëïb ÖmùÍä\\t|\\f­ââa¶ÏÛdM¾\\bX»Å(4À¯9%Ü'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
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
    //   37: goto -> 142
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
    //   68: ldc 'éÊDÉ)'>< Ih?rn)Û4×t'®#6³ýäë[´´Zðuã\\f¤²í§'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_4
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zrv2.a : [Ljava/lang/String;
    //   131: bipush #22
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrv2.b : [Ljava/lang/String;
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
    //   212: bipush #18
    //   214: goto -> 244
    //   217: bipush #102
    //   219: goto -> 244
    //   222: bipush #30
    //   224: goto -> 244
    //   227: bipush #59
    //   229: goto -> 244
    //   232: bipush #79
    //   234: goto -> 244
    //   237: bipush #97
    //   239: goto -> 244
    //   242: bipush #55
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x677E) & 0xFFFF;
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
      byte b1 = 24;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrv2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */