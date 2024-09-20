package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Set;
import javax.swing.ButtonGroup;
import net.portswigger.Zm2;

public class Zbk_ extends Zbv5 implements Zt3u {
  private final Zgb6 Zs;
  
  private final Zr1m Zr;
  
  private final Zbwe ZM;
  
  private final Zbwe ZF;
  
  private final Collection<String> Zy;
  
  private Zmyw ZX;
  
  private Zmyw Zb;
  
  private ButtonGroup Zo;
  
  private Zzdy ZU;
  
  private Zzdy Zf;
  
  private Zzdy Zk;
  
  private Ze01 Zv;
  
  private Ze01 Zg;
  
  private Ze01 Zx;
  
  private Ze01 Zd;
  
  private Zm99 ZY;
  
  private Zm99 Zz;
  
  private Zm99 ZK;
  
  private Zm99 Zq;
  
  private Zbqc Zi;
  
  private Zmg2 ZL;
  
  private Zmg2 ZD;
  
  private Zmg2 ZR;
  
  private Zbup Zl;
  
  private Zbup Zn;
  
  private static String Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbk_(Zgb6 paramZgb6, Zkl6 paramZkl6, Zr1m paramZr1m) {
    this.Zs = paramZgb6;
    this.Zr = paramZr1m;
    ZC();
    this.Zy = Set.of(new String[] { 
          Zjd(), a(-31382, -26541), a(-31365, -17820), a(-31366, 22322), a(-31390, 23339), a(-31371, -24277), a(-31378, -20142), a(-31372, -4813), a(-31376, -5988), a(-31422, 15578), 
          a(-31362, 6788), a(-31391, 28770), a(-31364, -21374), a(-31424, -794), a(-31368, 21745), a(-31392, 28864), a(-31373, 2523), a(-31388, -13728) });
    setName(a(-31387, 19781));
    this.ZY.Ze(Zlkk.BURP_TITLE);
    this.Zz.Ze(Zlkk.BURP_TITLE);
    this.ZK.Ze(Zlkk.BURP_TITLE);
    this.Zq.Ze(Zlkk.BURP_TITLE);
    Zrm1 zrm1 = paramZkl6.Zc();
    this.ZM = new Zbwe(true, zrm1);
    this.Zn.setViewportView(this.ZM);
    this.ZF = new Zbwe(false, zrm1);
    this.Zl.setViewportView(this.ZF);
    zrm1.ZY(new Zedo[] { this.ZM, this.ZF });
  }
  
  public String Zjd() {
    return a(-31421, 10757);
  }
  
  public String ZjS() {
    return a(-31389, 1564);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(-31380, 20225), Zk97.DESKTOP_SETTINGS_NETWORK_TLS_TLS_NEGOTIATION, this.Zr, new String[] { a(-31379, 23226) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zy;
  }
  
  public void Zt2() {
    Zbii zbii = this.Zs.Zfm();
    this.ZD.setSelected((zbii == Zbii.USE_ALL_SUPPORTED));
    this.ZR.setSelected((zbii == Zbii.USE_PLATFORM_DEFAULTS));
    boolean bool = (zbii == Zbii.USE_CUSTOM) ? true : false;
    this.ZL.setSelected(bool);
    this.Zi.setVisible(bool);
    this.ZM.Zt2();
    this.ZF.Zt2();
    this.ZU.setSelected(this.Zs.ZE1());
    this.Zk.setSelected(this.Zs.Zfq());
  }
  
  private void ZC() {
    this.Zo = new ButtonGroup();
    this.Zi = new Zbqc();
    this.ZX = new Zmyw();
    this.Zn = new Zbup();
    this.Zb = new Zmyw();
    this.Zl = new Zbup();
    this.Zg = new Ze01();
    this.Zd = new Ze01();
    this.Zv = new Ze01();
    this.Zx = new Ze01();
    this.ZY = new Zm99();
    this.Zz = new Zm99();
    this.ZR = new Zmg2();
    this.ZL = new Zmg2();
    this.ZD = new Zmg2();
    this.ZU = new Zzdy();
    this.ZK = new Zm99();
    this.Zf = new Zzdy();
    this.Zq = new Zm99();
    this.Zk = new Zzdy();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    this.Zi.setLayout(gridBagLayout2);
    this.ZX.setLeftComponent(this.Zn);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    this.Zi.add(this.ZX, gridBagConstraints);
    this.Zb.setLeftComponent(this.Zl);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    this.Zi.add(this.Zb, gridBagConstraints);
    this.Zg.setText(a(-31386, -8067));
    this.Zg.addActionListener(new Zh(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zi.add(this.Zg, gridBagConstraints);
    this.Zd.setText(a(-31385, 7348));
    this.Zd.addActionListener(new Zxg3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zi.add(this.Zd, gridBagConstraints);
    this.Zv.setText(a(-31377, 23298));
    this.Zv.addActionListener(new Zsah(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zi.add(this.Zv, gridBagConstraints);
    this.Zx.setText(a(-31363, 18674));
    this.Zx.addActionListener(new Zeq5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zi.add(this.Zx, gridBagConstraints);
    this.ZY.setText(a(-31374, -25833));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.Zi.add(this.ZY, gridBagConstraints);
    this.Zz.setText(a(-31384, -18562));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.Zi.add(this.Zz, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zi, gridBagConstraints);
    this.Zo.add(this.ZR);
    this.ZR.setText(a(-31361, 7318));
    this.ZR.addActionListener(new Zmcd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    add(this.ZR, gridBagConstraints);
    this.Zo.add(this.ZL);
    this.ZL.setText(a(-31423, -21785));
    this.ZL.addActionListener(new Zb61(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    add(this.ZL, gridBagConstraints);
    this.Zo.add(this.ZD);
    this.ZD.setSelected(true);
    this.ZD.setText(a(-31383, -2432));
    this.ZD.setToolTipText("");
    this.ZD.addActionListener(new Zmrm(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZD, gridBagConstraints);
    this.ZU.setText(a(-31381, -30776));
    this.ZU.addActionListener(new Zsjs(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 23;
    add(this.ZU, gridBagConstraints);
    this.ZK.setText(a(-31370, -2009));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZK, gridBagConstraints);
    this.Zf.setText(a(-31375, 17335));
    this.Zf.addActionListener(new Zsw7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 23;
    add(this.Zf, gridBagConstraints);
    this.Zq.setText(a(-31367, 6781));
    this.Zq.setToolTipText("");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zq, gridBagConstraints);
    this.Zk.setText(a(-31369, -26618));
    this.Zk.addActionListener(new Zxte(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zk, gridBagConstraints);
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    this.Zs.ZHE(this.ZU.isSelected());
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    this.ZM.Z_(true);
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    this.ZM.Z_(false);
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    this.ZF.Z_(true);
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    this.ZF.Z_(false);
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    this.Zs.ZA(Zbii.USE_ALL_SUPPORTED);
    Zm2.ZC(Zrrh.PROJECT_OPTIONS_SSL_NEGOTIATION_USE_ALL_SUPPORTED_PROTOCOLS_AND_CIPHERS);
    this.Zi.setVisible(false);
  }
  
  private void ZP(ActionEvent paramActionEvent) {
    this.Zs.ZA(Zbii.USE_PLATFORM_DEFAULTS);
    Zm2.ZC(Zrrh.PROJECT_OPTIONS_SSL_NEGOTIATION_USE_DEFAULT_PROTOCOLS_AND_CIPHERS);
    this.Zi.setVisible(false);
  }
  
  private void Zh(ActionEvent paramActionEvent) {
    this.Zs.ZA(Zbii.USE_CUSTOM);
    Zm2.ZC(Zrrh.PROJECT_OPTIONS_SSL_NEGOTIATION_USE_CUSTOM_PROTOCOLS_AND_CIPHERS);
    this.Zi.setVisible(true);
  }
  
  private void Z_(ActionEvent paramActionEvent) {
    this.Zs.ZHu(this.Zf.isSelected());
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    this.Zs.ZHF(this.Zk.isSelected());
  }
  
  public static void ZL(String paramString) {
    Zj = paramString;
  }
  
  public static String Zb() {
    return Zj;
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'sTf0oc'
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc 'þûO1yjKESaòÉ-Á-0T$rQ)û(K¡áÔîÙ$ù¤³Døßü{¥b¯åéÅ¡%¾C[Vnq-#)¬DùÙoûÞíîÁäíÇÄ\\blÊð¬MÂ§í±ÝZ?¥ýpº)=y°çqâp­£=2@¯$ÉlvèÆÛØËCT½{(«Ê>òQ<¶¢ß2º93/\,ñ[õ6­·|¬U0 ´\\tÈ è=­î\\bÈ,%¯??¬Ì:ì§â]Ûd°Øÿ\\f-Ðç5²ø"ííCXáÀíÍÔ1ÇÿV_U Ye{õy3óåÍÅ4¶\\f¼jÆû£­"^G£úÅvI>sìÙóÓª}U*®Í*-~eìfÄÂÕ´x­lE^"<×Aû¢«ùmÒÏáòë«áQdw«¢\\nøúêÃy ð\\bAË,Cf¼n9oÖ°×âuÅÇ!îOÕ4[µôüä/ïMêêëçê=DùimØ^|c\\rÃÀî.ÌãéÛÇa¾Êú9¨d>;MB·S/Z¢$qLÈvØàyÛa(ØççÅU:ÏåÎe÷×½ÜÛ5«ªØ°ð\\f2_âÇíåÒ|¢ÈíY¨2ÄK±ÍqpáE>3Ñ#æSm\\fì £;ÑüÑïcÏ¢Qü|~{É tj=Jf_á>Ícþ¥ÿ©iô;Û\\nÕOÍ·ÚÁZtb\b¬¬ïPéH.sLÝ¤h!&Ny0äßX3¥Ë|ÄÌ7[çá(~c?û"gøû6\\rb3k»TªOA«5¤\\r;@/x\\n~zÚ]ÎC`#ñîêÑ´h¸ry\\r¶|Ó9]úD°iÇ Ü¬gÖÇmrç~-ÂëÀZÅre¸3\\t0\\f®}e$òÊÎ¥½lÓ@yrñc4»RÎg\\f=%ÄmWæAJé_xy[TËÁä©\\tîðÕÍU¢cÓÂ8xÇg9æõÆºì½>gI\\r9¸ÖÜi\\t\\nüxBÊ\\\r@JÙD\\f;@¿1*ãQÁÍ]óÝÄE[Âû¤§¸×À*b.ã¢«?N±ó;eÎ°óÏýÃ¸R=,(lóP½ËÐàÓZÉ`DÕA"PÎ¶24¢ÑñPü7C¡ÍãÙ±K[Fâûâ±ºM W»g±Iº= ÷[ÄfxmÏïÎoÏ^kì°¤ËQmh¾w^]æ #/ÓoO+¸®²ÒÊ8{ÏÑ}#'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic ZL : (Ljava/lang/String;)V
    //   23: bipush #19
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #17
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'gÅæJ\\nÊ!·ÌâDmê;ë"éñ=Ä¹bÕßÕº?^oí.'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #15
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #123
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic burp/Zbk_.a : [Ljava/lang/String;
    //   137: bipush #36
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zbk_.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #62
    //   218: goto -> 248
    //   221: bipush #105
    //   223: goto -> 248
    //   226: bipush #84
    //   228: goto -> 248
    //   231: bipush #46
    //   233: goto -> 248
    //   236: bipush #31
    //   238: goto -> 248
    //   241: bipush #19
    //   243: goto -> 248
    //   246: bipush #83
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8561) & 0xFFFF;
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
      byte b1 = 60;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbk_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */