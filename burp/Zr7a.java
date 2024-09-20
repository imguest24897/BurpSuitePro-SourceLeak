package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zr7a extends Zrh7 {
  private final Zbe4 Ze;
  
  private final Zkl6 ZR;
  
  private final Zr_4 ZB;
  
  private boolean Zh = true;
  
  private Zm99 ZJ;
  
  private Zm99 ZE;
  
  private Zbqc Zc;
  
  private Zzdy ZA;
  
  private Ze01 ZV;
  
  private Ze01 ZF;
  
  private Zedd<Zl25> Zt;
  
  private Zl8w ZI;
  
  private Zm2o Zv;
  
  private Zm99 Zb;
  
  private Zm99 ZG;
  
  private Zbqc Zd;
  
  private Zm9v Zx;
  
  private Zgff ZQ;
  
  private Zgff ZY;
  
  private Zgff ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zr7a(Zbe4 paramZbe4, Zgaj paramZgaj, Zkl6 paramZkl6, Zr_4 paramZr_4) {
    super(Zt2m.ZF(paramZbe4), true, Zzv7.CONFIG_PANEL_MATCH_REPLACE_POPUP);
    this.Ze = paramZbe4;
    this.ZR = paramZkl6;
    int[] arrayOfInt = Zr7c.Zv();
    this.ZB = paramZr_4;
    Zs();
    ZG();
    this.Zv.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_MATCH_AND_REPLACE);
    setTitle((paramZgaj == null) ? a(-17384, -6809) : a(-17386, 28235));
    this.ZY.ZM(a(-17401, -31940));
    this.ZO.ZM(a(-17379, 29683));
    Zl25[] arrayOfZl25 = Zl25.ZE();
    int i = arrayOfZl25.length;
    byte b = 0;
    while (b < i) {
      Zl25 zl25 = arrayOfZl25[b];
      this.Zt.addItem(zl25);
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    ItemListener itemListener = this::lambda$new$0;
    this.Zt.addItemListener(itemListener);
    if (paramZgaj != null)
      ZV(paramZgaj); 
    addWindowListener(new Ztbh(this, itemListener));
    pack();
    Zq(Zt2m.ZF(paramZbe4));
  }
  
  private void ZG() {
    setName(a(-17392, 20447));
    this.Zt.setName(a(-17407, -29838));
    this.ZQ.setName(a(-17387, 14314));
    this.ZY.setName(a(-17377, 15137));
    this.ZO.setName(a(-17404, 17426));
    this.ZA.setName(a(-17397, 5375));
    this.ZV.setName(a(-17385, -22711));
  }
  
  private void ZV(Zgaj paramZgaj) {
    this.Zt.setSelectedItem(paramZgaj.ZJ());
    this.ZY.setText(paramZgaj.Zu());
    this.ZO.setText(paramZgaj.Zt());
    this.ZQ.setText(paramZgaj.ZY());
    this.ZA.setSelected(!paramZgaj.ZD());
    this.Zh = paramZgaj.ZU();
  }
  
  private void Zs() {
    this.Zc = new Zbqc();
    this.ZI = new Zl8w();
    this.Zv = new Zm2o();
    this.Zb = new Zm99();
    this.ZG = new Zm99();
    this.Zd = new Zbqc();
    this.ZV = new Ze01();
    this.ZF = new Ze01();
    this.ZJ = new Zm99();
    this.Zt = new Zedd<>();
    this.ZY = new Zgff();
    this.ZO = new Zgff();
    this.Zx = new Zm9v();
    this.ZE = new Zm99();
    this.ZQ = new Zgff();
    this.ZA = new Zzdy();
    setDefaultCloseOperation(2);
    this.Zc.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    this.Zc.setLayout(gridBagLayout);
    this.ZI.setText(a(-17388, -27027));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.Zc.add(this.ZI, gridBagConstraints);
    this.Zv.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_MATCH_AND_REPLACE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zc.add(this.Zv, gridBagConstraints);
    this.Zb.setText(a(-17382, -6696));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 2048;
    this.Zc.add(this.Zb, gridBagConstraints);
    this.ZG.setText(a(-17380, -15969));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    this.Zc.add(this.ZG, gridBagConstraints);
    this.Zd.setLayout(new GridLayout(1, 2, 5, 0));
    this.ZV.setText(a(-17390, -25729));
    this.ZV.addActionListener(new Zzmf(this));
    this.Zd.add(this.ZV);
    this.ZF.setText(a(-17389, -8019));
    this.ZF.addActionListener(new Zl28(this));
    this.Zd.add(this.ZF);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weighty = 1.0D;
    this.Zc.add(this.Zd, gridBagConstraints);
    this.ZJ.setText(a(-17381, 2943));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    this.Zc.add(this.ZJ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 2048;
    this.Zc.add(this.Zt, gridBagConstraints);
    this.ZY.setColumns(35);
    this.ZY.ZH(Zlw9.SEARCH_TERM);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 2048;
    this.Zc.add(this.ZY, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 2048;
    this.Zc.add(this.ZO, gridBagConstraints);
    this.Zx.setText(a(-17391, 3810));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zc.add(this.Zx, gridBagConstraints);
    this.ZE.setText(a(-17405, 14950));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    this.Zc.add(this.ZE, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    this.Zc.add(this.ZQ, gridBagConstraints);
    this.ZA.setText(a(-17383, -18372));
    this.ZA.setToolTipText(a(-17378, -2313));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 2048;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.Zc.add(this.ZA, gridBagConstraints);
    getContentPane().add(this.Zc, a(-17408, -24289));
    pack();
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    Zgaj zgaj;
    try {
      try {
      
      } catch (Ztr8 ztr8) {
        throw a(null);
      } 
      Zku8 zku8 = this.ZB.<Zku8>ZH(new Zggq(((Zl25)this.Zt.getSelectedItem()).projectPersistedId, this.Zh, this.ZY.getText(), this.ZO.getText(), !this.ZA.isSelected(), this.ZQ.getText()));
      zgaj = Zeuq.ZG(zku8, this.ZR);
    } catch (Ztr8 ztr8) {
      Zah.Zl(ztr8, Zk_.USER_ERROR);
      this.Zx.setText(ztr8.getMessage());
      return;
    } 
    setVisible(false);
    dispose();
    this.Ze.ZW(zgaj);
  }
  
  private void ZP(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
    this.Ze.ZW(null);
  }
  
  private void lambda$new$0(ItemEvent paramItemEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getStateChange : ()I
    //   8: iconst_1
    //   9: if_icmpne -> 116
    //   12: aload_1
    //   13: invokevirtual getItem : ()Ljava/lang/Object;
    //   16: checkcast burp/Zl25
    //   19: astore_3
    //   20: aload_3
    //   21: getstatic burp/Zl25.REQUEST_HEADER : Lburp/Zl25;
    //   24: if_acmpeq -> 34
    //   27: aload_3
    //   28: getstatic burp/Zl25.RESPONSE_HEADER : Lburp/Zl25;
    //   31: if_acmpne -> 70
    //   34: aload_0
    //   35: getfield ZY : Lburp/Zgff;
    //   38: sipush #-17398
    //   41: sipush #8642
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: invokevirtual ZM : (Ljava/lang/String;)V
    //   50: aload_0
    //   51: getfield ZO : Lburp/Zgff;
    //   54: sipush #-17402
    //   57: sipush #19664
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: invokevirtual ZM : (Ljava/lang/String;)V
    //   66: aload_2
    //   67: ifnull -> 102
    //   70: aload_0
    //   71: getfield ZY : Lburp/Zgff;
    //   74: sipush #-17406
    //   77: sipush #-10801
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual ZM : (Ljava/lang/String;)V
    //   86: aload_0
    //   87: getfield ZO : Lburp/Zgff;
    //   90: sipush #-17403
    //   93: sipush #-5463
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: invokevirtual ZM : (Ljava/lang/String;)V
    //   102: aload_0
    //   103: getfield ZY : Lburp/Zgff;
    //   106: invokevirtual repaint : ()V
    //   109: aload_0
    //   110: getfield ZO : Lburp/Zgff;
    //   113: invokevirtual repaint : ()V
    //   116: return
  }
  
  private static Ztr8 a(Ztr8 paramZtr8) {
    return paramZtr8;
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ï³´½-ÒL~¶PþÝZje²\\nv~hyÉxn\|û§¶¥ïß!@ë\\rÂ}áèÎ\îõM¼vI17¸¢|3¯ËuIR.kïÏ«+iGÍÐÎVÖ ·n³yÛÀ|õ¿ØË+aÕ\\n iNwmÕçúx Óêe_\\n«]Àµ¼êziÕ~UÆ~\\f¯õf§äù³\\bé«,r4IÚQ¬>O>µù§F6oû4þa^°Î9w÷7LÕ4ÒNj-?,TK/p21|v_ gu<Ý|ãÜÍ2xó°ÈUªBò\\nÜ±´@Þp4ÙµiI_!É2êõ_ÐTûC%@Deä?II¢ë?W£B\\f~BÓ\\n5+\¸Ä¬&tã²³çbÈÖæ¦¿f*B67'C±[Òl=+×,wò5µg}²]b°$4uIaµkØÉ¤ð[<ú¦Åý~äB\\búÆç|+TÇys«ÕãocRëXÞéáÄIþ5ñB¼aØFás¥æø¢8hîèh¥¢{QI?¸üÄMló`Ê.\\f´ìg¸ãýÃ¥¬wmyÐ2â6£d¸ËÐK~7%á8{iË°4"§åzÂT\\npî=(Gb½OheÄ=\\tðqäF¯i¶;,ßßÉsªÎWf;Ä<¬`Üñs\\fÙj¢æ}[U¶åÑ4¢ssR¯Ed*¸ØÇg'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #28
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
    //   67: ldc '¸{HV-5sºi&Z^bR4ã0åuADjÆ¾À-"Hÿ½æÒÑsãìf¶ZÙCA6Ê#xÒzÊèã%2FÖÓ|f{ñ\\n5¨ÿvíýýîyò'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #55
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #106
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
    //   128: putstatic burp/Zr7a.a : [Ljava/lang/String;
    //   131: bipush #26
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr7a.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 258
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #121
    //   214: goto -> 242
    //   217: iconst_5
    //   218: goto -> 242
    //   221: bipush #78
    //   223: goto -> 242
    //   226: bipush #116
    //   228: goto -> 242
    //   231: bipush #36
    //   233: goto -> 242
    //   236: bipush #100
    //   238: goto -> 242
    //   241: iconst_4
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 165
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 161
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBC12) & 0xFFFF;
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
      byte b1 = 85;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */