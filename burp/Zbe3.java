package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import net.portswigger.Zm2;

public class Zbe3 extends Zbv5 implements Zt3u {
  private final Zekl ZS;
  
  private final Zr1m ZL;
  
  private final Set<String> Zo;
  
  private Zzdy ZT;
  
  private Zzdy ZH;
  
  private Zzdy Zi;
  
  private Zzdy Zn;
  
  private Zzdy ZQ;
  
  private Zzdy Zt;
  
  private Zzdy ZO;
  
  private Zzdy ZM;
  
  private Zzdy ZI;
  
  private Zzdy ZA;
  
  private Zzdy ZD;
  
  private Zzdy Zf;
  
  private Zzdy ZW;
  
  private Zzdy ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbe3(Zekl paramZekl, Zr1m paramZr1m) {
    this.ZS = paramZekl;
    this.ZL = paramZr1m;
    this.Zo = Set.of(new String[] { 
          Zjd(), a(-1550, 642), a(-1552, 32056), a(-1570, -22768), a(-1560, 4152), a(-1577, -27340), a(-1561, 13669), a(-1554, 15838), a(-1543, -16021), a(-1558, -606), 
          a(-1583, 8654), a(-1553, 22609), a(-1545, 7900), a(-1580, -29484), a(-1582, -29203), a(-1562, 9258), a(-1579, -25138), a(-1539, -14893), a(-1575, -14547), a(-1538, 7244), 
          a(-1551, 27950), a(-1574, -20967), a(-1564, -15477), a(-1578, -1392), a(-1566, 26513), a(-1548, 15522) });
    ZJ();
    setName(a(-1549, -26869));
  }
  
  public String Zjd() {
    return a(-1569, -3885);
  }
  
  public String ZjS() {
    return a(-1576, 15013);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_MISCELLANEOUS, this.ZL, new String[] { a(-1565, 5870) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zo;
  }
  
  public void Zt2() {
    this.ZH.setSelected(this.ZS.ZlM());
    this.ZW.setSelected(this.ZS.ZlJ());
    this.ZR.setSelected(this.ZS.Zlv());
    this.Zf.setSelected(this.ZS.ZlC());
    this.ZT.setSelected(this.ZS.Zl0());
    this.ZO.setSelected(this.ZS.Zl2());
    this.Zt.setSelected(this.ZS.Zl1());
    this.ZM.setSelected(this.ZS.ZlV());
    this.ZA.setSelected(this.ZS.Zlk());
    this.ZD.setSelected(this.ZS.ZlR());
    this.ZQ.setSelected(this.ZS.Zl9());
    this.ZI.setSelected(this.ZS.ZlS());
    this.Zi.setSelected(this.ZS.Zlc());
    this.Zn.setSelected(this.ZS.ZlI());
    this.Zn.setEnabled(!this.Zi.isSelected());
  }
  
  private void ZJ() {
    this.ZW = new Zzdy();
    this.ZD = new Zzdy();
    this.ZQ = new Zzdy();
    this.ZI = new Zzdy();
    this.ZR = new Zzdy();
    this.ZT = new Zzdy();
    this.Zi = new Zzdy();
    this.ZA = new Zzdy();
    this.ZO = new Zzdy();
    this.ZH = new Zzdy();
    this.Zt = new Zzdy();
    this.ZM = new Zzdy();
    this.Zn = new Zzdy();
    this.Zf = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZW.setText(a(-1542, 4673));
    this.ZW.addActionListener(new Zkuz(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZW, gridBagConstraints);
    this.ZD.setText(a(-1556, 5008));
    this.ZD.setName(a(-1557, 14872));
    this.ZD.addActionListener(new Zs8n(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZD, gridBagConstraints);
    this.ZQ.setText(a(-1559, -5262));
    this.ZQ.addActionListener(new Zeae(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZQ, gridBagConstraints);
    this.ZI.setText(a(-1567, -29922));
    this.ZI.addActionListener(new Zewv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZI, gridBagConstraints);
    this.ZR.setText(a(-1573, -18818));
    this.ZR.addActionListener(new Zsw3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZR, gridBagConstraints);
    this.ZT.setText(a(-1572, 1564));
    this.ZT.addActionListener(new Zsfm(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZT, gridBagConstraints);
    this.Zi.setText(a(-1540, 19464));
    this.Zi.addActionListener(new Zlsx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 18;
    add(this.Zi, gridBagConstraints);
    this.ZA.setText(a(-1547, 17904));
    this.ZA.setName(a(-1581, 8028));
    this.ZA.addActionListener(new Zkyd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZA, gridBagConstraints);
    this.ZO.setText(a(-1546, 1392));
    this.ZO.addActionListener(new Zkft(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 23;
    add(this.ZO, gridBagConstraints);
    this.ZH.setText(a(-1541, -4885));
    this.ZH.addActionListener(new Zgx4(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZH, gridBagConstraints);
    this.Zt.setText(a(-1563, 30433));
    this.Zt.setName(a(-1555, -23072));
    this.Zt.addActionListener(new Zxg8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 23;
    add(this.Zt, gridBagConstraints);
    this.ZM.setText(a(-1544, -22651));
    this.ZM.addActionListener(new Zgbc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 23;
    add(this.ZM, gridBagConstraints);
    this.Zn.setText(a(-1584, 8510));
    this.Zn.setName(a(-1571, -3700));
    this.Zn.addActionListener(new Ze5k(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 18;
    add(this.Zn, gridBagConstraints);
    this.Zf.setText(a(-1537, 24375));
    this.Zf.setName(a(-1568, 522));
    this.Zf.addActionListener(new Zxkm(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    add(this.Zf, gridBagConstraints);
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    this.ZS.Zfp(this.ZD.isSelected());
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    this.ZS.ZfB(this.ZW.isSelected());
  }
  
  private void Zh(ActionEvent paramActionEvent) {
    this.ZS.Zfc(this.ZQ.isSelected());
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    this.ZS.Zf7(this.ZI.isSelected());
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    this.ZS.Zfi(this.ZR.isSelected());
  }
  
  private void Za(ActionEvent paramActionEvent) {
    this.ZS.ZfY(this.ZT.isSelected());
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    this.ZS.ZfL(this.Zi.isSelected());
    this.Zn.setEnabled(!this.Zi.isSelected());
  }
  
  private void Zk(ActionEvent paramActionEvent) {
    this.ZS.Zfb(this.ZA.isSelected());
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    this.ZS.Zfn(this.ZO.isSelected());
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    boolean bool = this.ZH.isSelected();
    if (!bool)
      Zm2.ZC(Zrrh.PROXY_OPTIONS_MISC_SET_CONNECTION_HEADER_IN_REQUESTS_DISABLED); 
    this.ZS.Zft(bool);
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    this.ZS.ZfR(this.Zt.isSelected());
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    this.ZS.ZfX(this.ZM.isSelected());
  }
  
  private void Zv(ActionEvent paramActionEvent) {
    this.ZS.ZfI(this.Zn.isSelected());
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    this.ZS.Zfu(this.Zf.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #48
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '°àÕf r¤ãøÍJE}Î#]¬K_UÆõÞµGÀÒE7Ñ?HBô<ï/Fu­sÿJ«¨uzÉq \·O>þ2B")°ñabf·ÊTsmn^cÚü>B®J7Ìb/«³Ú>·«3uHå_ðß7°¬ÜÊÌR~ýçM¡ÄU"ÊWf:Ì\\fý±{%DS@óZýñojqlñÖ»Õ«\\fò9`/Ì{ÕNugv¹¬Iwd\\fmw ÍÆuÊKó\\n¹»Vzú)|pWªX¶ÃdyC·@y®¬\jìo¸pÐ×Lây®®¢:&Îå£<³ÛêUOe`Í=4g¯¦o©¡Ó%%¯8B/º¸:%3ýÚ­á _|o]VÕ'â'm°õ9Þ^¢IH{~«ÒöDÄÀI;6ÈEMQÊ¯XR\\fbzÅÄMg+s´÷óÕ°Âñ*\\f÷XÈßNÒ&WOæ Ñ<ÛÌäZ<mèwsâÜúZx]]£ÍªY¶¯¦bÚ zÏÍ·äïâ¢Ì¢(le$ÝÏÒ/\\t|l£_ºá',Xo©5%i+Üe÷ÁìñP^[*Ú©O©¡DJ.[i;Úí.ùXSÉçØê>}ä&G¶sçgiéÑA)JÎ-åi¢ºõÎ\\fbezxsMõsn)-°ÚÛVo~¤ß»î2ìFÛc<éYe|VÈrÌ"¬­þRÌ(;T¸UÏ/%:/Jñ0æ.Â9tÝ».¸RöÍ*Õ\\tî34\(8 ±©%N&¡»w~ß¼~×Ñ¸2F6Qk'yS\\f©è÷¯û¨ôÆ=B°jÌKrM!5wD ëXßÌ"ÏXÂ¨\ÐD´(wÍuÅ6 ö ÷·?¬87þÌâ;Y=ñ03ÔÝä+9k*Q¤aïÁÛWÄ©U¡"ðLxWï\\tyEÎt¥iÞ*kt\\fj­á'?_&©>×0&¾JP\\ndà¿¦OZç¸Ý7TA« ø7eø&¥/çïò±ù9£Dÿ¿}Ê/ä1AÀä\\n=Sµ\\tqÛOvÙ¨@Û¬Û"z×W¤s9cR\\b½E9®\\r/~¡3õ­ï<ðª;7Å×£SUN=¾ç;JÚid¶Ò5E½?ð}q¾ðû¹ñé\\fÀc'®Fù½íU©cØ7#,yR½¬¢ÇoïòÒEý?;|Ayñ`~Ç\\b1¼¨[%+¥´ÃÙ$ä¿õ±\\n¼K|9ÓÀÓ:n{C¯®Ô-GT!HyL;&q ©ý3&¸¸Îàá?þ+ÍÃ°Ä.EÀw)A{@C&¯økMY GóeúrÜÊSïygR ¬9Ê!R¸ý?MºÄeGÞËð"ò´«û#û«)ªÞS8gÖÚ^È±ë£P\\flFÞ#T ';gþÏü|ÐãäHo,,é@|q+áÞ"¹æf©þ"Ê!6ò3çe¡Õ%Ð<ï86þt\\tï*ÚS\\tbG\\b±^JIÓã­FÃóÎée[ª"¦¬\\flÜ»O JMkn`\\r^¶ÔLx|w/Ë¯¤@ÍìÑSõ¼t\\bù}AMeÁ,s=Mee¾\\rÅ³Û±W=ÚÁxm×\\t,´M$¨KoÓXÏçÕ[`ÏìL·¹GiÈ¿´ÆÝßWùAc\\bæáWÙ\\rA`2/ )Ò+Åô$guÌ£\\rAßëü§³CT§0±±¦¥rø9­]TþF[*pÎX>q}fþï915ö¦¬b\\bý·Zô8ãÝªðpÉ©oA"3Ý+'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #59
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #124
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
    //   68: ldc '6³*=¶Ïõ:Gñ¬H×:Kl=\\n^á'hVU£\\n'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #23
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #116
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
    //   129: putstatic burp/Zbe3.a : [Ljava/lang/String;
    //   132: bipush #48
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbe3.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_1
    //   213: goto -> 243
    //   216: bipush #40
    //   218: goto -> 243
    //   221: bipush #91
    //   223: goto -> 243
    //   226: bipush #31
    //   228: goto -> 243
    //   231: bipush #110
    //   233: goto -> 243
    //   236: bipush #60
    //   238: goto -> 243
    //   241: bipush #97
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
    int i = (paramInt1 ^ 0xFFFFF9F8) & 0xFFFF;
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
      char c = '÷';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbe3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */