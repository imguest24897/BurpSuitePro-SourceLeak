package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Objects;

public class Zbml extends Zbv5 implements Zsnh {
  private final Zrl9 Zc;
  
  private boolean Z_;
  
  private boolean Zt;
  
  private boolean Za;
  
  private boolean Zw;
  
  private Zm99 ZH;
  
  private Zm99 ZX;
  
  private Zm99 Zf;
  
  private Zm99 ZI;
  
  private Zm99 Zn;
  
  private Zm99 ZO;
  
  private Zm99 ZA;
  
  private Zbqc Zm;
  
  private Zl8w ZM;
  
  private Zm9v ZE;
  
  private Zm9v ZG;
  
  private Zm9v ZJ;
  
  private Zm9v Zo;
  
  private Zbkc Zu;
  
  private Zbqc ZT;
  
  private Zgfo Zz;
  
  private Zgfo ZD;
  
  private Zgfo Zb;
  
  private Zgfo ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbml(Zrl9 paramZrl9, boolean paramBoolean) {
    this.Zc = paramZrl9;
    Zt();
    Objects.requireNonNull(paramZrl9);
    this.ZC.Zs(paramZrl9::ZP, this::Z_);
    Objects.requireNonNull(paramZrl9);
    this.Zz.ZO(paramZrl9::Zz, this::ZW, 1, 2147483647, 0, new int[0]);
    Objects.requireNonNull(paramZrl9);
    this.Zb.ZO(paramZrl9::Za, this::ZZ, 1, 100, 0, new int[0]);
    Objects.requireNonNull(paramZrl9);
    this.ZD.Zs(paramZrl9::ZK, this::Zy);
    this.ZD.setEnabled(paramBoolean);
    this.ZT.setVisible(false);
  }
  
  public String ZZ() {
    return this.Zu.Zr();
  }
  
  public Zk97 ZR() {
    return Zk97.DESKTOP_SCANNING_CRAWL_OPTIONS_HANDLING_APPLICATION_ERRORS_DURING_CRAWL;
  }
  
  public String Zq() {
    return a(27183, 11547);
  }
  
  public Zmf_ Zn() {
    Zzkm zzkm = new Zzkm();
    this.Zc.Zl(zzkm);
    return zzkm.ZV(new String[] { a(27171, 23621) });
  }
  
  public String ZE() {
    return a(27181, -15194);
  }
  
  public void Zt2() {
    this.ZC.ZM(this.Zc.Zdd());
    this.Zz.ZM(this.Zc.ZdD());
    this.Zb.ZM(this.Zc.Zdf());
    this.ZD.ZM(this.Zc.ZdM());
    this.Zo.setVisible(false);
    this.ZE.setVisible(false);
    this.ZJ.setVisible(false);
    this.ZG.setVisible(false);
  }
  
  public String Zd() {
    return this.Z_ ? a(27170, 5859) : (this.Zt ? a(27175, 9234) : (this.Za ? a(27176, 15855) : (this.Zw ? a(27173, -1409) : "")));
  }
  
  private void Z_(boolean paramBoolean) {
    this.Z_ = !paramBoolean;
    this.Zo.setVisible(!paramBoolean);
  }
  
  private void ZW(boolean paramBoolean) {
    this.Zt = !paramBoolean;
    this.ZE.setVisible(!paramBoolean);
  }
  
  private void ZZ(boolean paramBoolean) {
    this.Za = !paramBoolean;
    this.ZJ.setVisible(!paramBoolean);
  }
  
  private void Zy(boolean paramBoolean) {
    this.Zw = !paramBoolean;
    this.ZG.setVisible(!paramBoolean);
  }
  
  private void Zt() {
    this.Zu = new Zbkc();
    this.ZM = new Zl8w();
    this.ZT = new Zbqc();
    this.ZH = new Zm99();
    this.ZC = new Zgfo();
    this.ZX = new Zm99();
    this.Zo = new Zm9v();
    this.Zn = new Zm99();
    this.Zz = new Zgfo();
    this.ZO = new Zm99();
    this.ZE = new Zm9v();
    this.Zb = new Zgfo();
    this.ZA = new Zm99();
    this.ZJ = new Zm9v();
    this.Zm = new Zbqc();
    this.Zf = new Zm99();
    this.ZD = new Zgfo();
    this.ZI = new Zm99();
    this.ZG = new Zm9v();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zu.Zx(a(27180, 6153));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 21;
    add(this.Zu, gridBagConstraints);
    this.ZM.setText(a(27182, 12140));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZM, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZT.setLayout(gridBagLayout2);
    this.ZH.setText(a(27178, -10634));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.ZH, gridBagConstraints);
    this.ZC.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.ZC, gridBagConstraints);
    this.ZX.setText(a(27168, 696));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.ZX, gridBagConstraints);
    this.Zo.setText(a(27177, -17032));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.ZT.add(this.Zo, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 20, 0);
    add(this.ZT, gridBagConstraints);
    this.Zn.setText(a(27192, -2505));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.Zn, gridBagConstraints);
    this.Zz.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.Zz, gridBagConstraints);
    this.ZO.setText(a(27179, -646));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZO, gridBagConstraints);
    this.ZE.setText(a(27193, -4602));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZE, gridBagConstraints);
    this.Zb.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 1280;
    add(this.Zb, gridBagConstraints);
    this.ZA.setText(a(27174, 23686));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 1280;
    add(this.ZA, gridBagConstraints);
    this.ZJ.setText(a(27193, -4602));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZJ, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout3.rowHeights = new int[] { 0 };
    this.Zm.setLayout(gridBagLayout3);
    this.Zf.setText(a(27172, 29796));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.Zf, gridBagConstraints);
    this.ZD.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.ZD, gridBagConstraints);
    this.ZI.setText(a(27169, -11952));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.ZI, gridBagConstraints);
    this.ZG.setText(a(27193, -4602));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.Zm.add(this.ZG, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zm, gridBagConstraints);
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÿëÖÜz/Ò¡ ëÙ-ºÈÈGÇÊÇ»û¾ÁN¹\\bïÅÐ¨SÕM9\\rí©7F&õUç íu9æþ&°{nb4¦G¬gÀÁÍÝz>¨¤'¨iR0ÄQuÞÓÈBÇûwä{¾(ÁÎÕ½¥|Qã¼Z)Á\jkãþ¦&IáIoL5¦s©\\b75åÎÂÎ#êg«ÞK¢qn|rãæ[SÜ¥TMÙßWèlÐzàèËÒKNÒÃÍÎ®`µÕ1à,ùdm|Ù¸F³¤{RlzàµyÕîÈpêN¥¬µ(£ñ$Á·Fq÷L×¹Ãñ(îlFðÙ¥Êóì*(ç\93Þÿÿ´µÓ9âQXu-HÔ1¹ÿþF^Z±qØ»GÐ<ÓÚæ6év$ÝôÙ­_yö9MÃ1a'%¤p?ÆI¡<q:V: +91_0fê^5±¯iO(Wå Ú¬EæñÊy$d²ÎIõÔf1ºiE³x!ö\îÒklSÓ«Y§BT8ûG\ aïy¶¤Î¥x:©ØÇÎ?Í.­q6ór@=ûIqÿ\\b[Ê55òüºiÌà¿Ö²_|QNXp¸Ïñ:®óB¨¨»=P)é_ ñÇÆ"$ç0]¦ÊÂáÿv´hYúù~«ì³WD Hýã»ÝCl4ý÷¬ÆKé%ß1¬³·<&&vÐz»ïÃ¥\ý;Ñ(ºÑçÀ¨ýnýôàxÚ@º\wSU^'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #40
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #110
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
    //   68: ldc 'P;ia¨Û×E¡Jás`×\\r¼zÍµVX0yªÃV6'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #18
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #69
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
    //   129: putstatic burp/Zbml.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbml.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #63
    //   214: goto -> 243
    //   217: bipush #38
    //   219: goto -> 243
    //   222: bipush #70
    //   224: goto -> 243
    //   227: bipush #17
    //   229: goto -> 243
    //   232: bipush #30
    //   234: goto -> 243
    //   237: iconst_5
    //   238: goto -> 243
    //   241: bipush #81
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6A28) & 0xFFFF;
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
      char c = 'é';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbml.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */