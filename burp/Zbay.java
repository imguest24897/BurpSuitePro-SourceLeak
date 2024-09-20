package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.Box;
import net.portswigger.Zkb;
import net.portswigger.Ztu;

class Zbay extends Zbv5 implements Zt3u, Zky2 {
  private final Zr1m ZG;
  
  private final Zgdu Zi;
  
  private final Zldl Zs;
  
  private final Zt0z ZQ;
  
  private final Zbws ZS;
  
  private final Set<String> Zv;
  
  private Zbkc Zu;
  
  private Ze01 ZT;
  
  private Ze01 ZX;
  
  private Ze01 Zb;
  
  private Ze01 Zq;
  
  private Zbqc ZA;
  
  private Zzdy Zw;
  
  private Zzdy Zd;
  
  private Zm9v Zf;
  
  private Box.Filler Zk;
  
  private Zx0x ZH;
  
  private Zm99 ZI;
  
  private Zbqc ZW;
  
  private Zmyw Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbay(Zr1m paramZr1m, Zgdu paramZgdu, Zldl paramZldl) {
    this.ZG = paramZr1m;
    this.Zi = paramZgdu;
    this.Zs = paramZldl;
    ZE();
    this.Zv = Set.of(Zjd(), a(-4940, -26843), a(-4960, 353), a(-4951, 10009), a(-4949, 1885), a(-4933, -7516), a(-4930, 20065), a(-4959, -22642), a(-4942, -21910));
    setName(a(-4952, 17256));
    this.ZH.setContentType(a(-4932, -17975));
    this.ZH.addHyperlinkListener(new Zew1(this));
    this.ZH.setBorder(BorderFactory.createEmptyBorder());
    this.ZH.Zx(Zlkk.PANEL_BACKGROUND);
    this.ZH.setCaret(new Zgka());
    ZZ();
    this.Zf.setText(" ");
    this.Zw.setSelected(paramZgdu.ZR());
    this.ZQ = new Zt0z(paramZgdu);
    this.ZS = new Zbws(this.ZQ);
    this.ZS.Zk(this);
    Zbup zbup = new Zbup(this.ZS);
    this.Zr.setLeftComponent(zbup);
  }
  
  public String Zjd() {
    return a(-4947, 8835);
  }
  
  public String ZjS() {
    return a(-4955, 23153);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(-4946, 17127), Zk97.DESKTOP_SETTINGS_SUITE_REST_API, this.ZG, new String[] { a(-4943, 17136) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zv;
  }
  
  private void ZZ() {
    ZR();
    String str = this.Zs.Zn();
    this.Zf.setText((str == null) ? " " : str);
  }
  
  private void ZR() {
    String str1 = Zbk_.Zb();
    String str2 = ZV(this.Zi.ZF().ZK());
    if (this.Zs.ZR()) {
      this.ZH.setText(String.format(a(-4956, -1775), new Object[] { Zlkk.HTML_LINK_FOREGROUND.ZC(), str2, str2 }));
      this.Zd.setSelected(true);
      if (str1 == null) {
        this.ZH.setText(str2);
        this.Zd.setSelected(false);
        return;
      } 
      return;
    } 
    this.ZH.setText(str2);
    this.Zd.setSelected(false);
  }
  
  private static String ZV(String paramString) {
    return Zkb.ZG(Ztu.Zs(Zkb.Zy(paramString)));
  }
  
  public void Zt2() {
    this.Zs.Zt2();
    ZZ();
    this.Zd.setSelected(this.Zs.ZR());
    this.Zw.setSelected(this.Zi.ZR());
    this.ZQ.fireTableDataChanged();
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zs != null)
      ZR(); 
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    int i = this.ZS.convertRowIndexToModel(paramInt1);
    Zgt zgt = this.Zi.Zs().get(i);
    this.Zi.Zs().set(i, new Zgt(!zgt.ZE, zgt.Zi, zgt.Zb, zgt.ZL));
    this.ZQ.fireTableRowsUpdated(i, i);
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    ZD(this.ZS.convertRowIndexToModel(paramInt1));
  }
  
  private int ZT() {
    int i = this.ZS.getSelectedRow();
    return (i == -1) ? i : this.ZS.convertRowIndexToModel(i);
  }
  
  private void ZD(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Zgdu;
    //   4: invokevirtual Zs : ()Ljava/util/List;
    //   7: astore_2
    //   8: new burp/Zrvi
    //   11: dup
    //   12: aload_0
    //   13: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   16: aload_0
    //   17: getfield Zi : Lburp/Zgdu;
    //   20: aload_2
    //   21: iload_1
    //   22: invokeinterface get : (I)Ljava/lang/Object;
    //   27: checkcast burp/Zgt
    //   30: invokestatic empty : ()Ljava/util/Optional;
    //   33: aload_0
    //   34: aload_2
    //   35: iload_1
    //   36: <illegal opcode> accept : (Lburp/Zbay;Ljava/util/List;I)Ljava/util/function/Consumer;
    //   41: invokespecial <init> : (Ljava/awt/Window;Lburp/Zgdu;Lburp/Zgt;Ljava/util/Optional;Ljava/util/function/Consumer;)V
    //   44: astore_3
    //   45: aload_3
    //   46: sipush #-4937
    //   49: sipush #-18156
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: invokevirtual setTitle : (Ljava/lang/String;)V
    //   58: aload_3
    //   59: iconst_1
    //   60: invokevirtual setVisible : (Z)V
    //   63: return
  }
  
  private void ZY() {
    this.Zs.ZT();
    ZZ();
  }
  
  private void ZE() {
    this.ZW = new Zbqc();
    this.ZI = new Zm99();
    this.ZH = new Zx0x();
    this.ZT = new Ze01();
    this.Zk = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    this.Zd = new Zzdy();
    this.Zf = new Zm9v();
    this.Zw = new Zzdy();
    this.Zu = new Zbkc();
    this.ZA = new Zbqc();
    this.Zq = new Ze01();
    this.Zb = new Ze01();
    this.ZX = new Ze01();
    this.Zr = new Zmyw();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout1);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZW.setLayout(gridBagLayout2);
    this.ZI.setText(a(-4939, 1233));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.ZW.add(this.ZI, gridBagConstraints);
    this.ZH.setEditable(false);
    this.ZH.setText(a(-4941, -13342));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.ZW.add(this.ZH, gridBagConstraints);
    this.ZT.setText(a(-4954, -14175));
    this.ZT.addActionListener(new Zlud(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    this.ZW.add(this.ZT, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    this.ZW.add(this.Zk, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZW, gridBagConstraints);
    this.Zd.setText(a(-4957, -21306));
    this.Zd.addActionListener(new Zxgz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zd, gridBagConstraints);
    this.Zf.setText(a(-4931, -29687));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    add(this.Zf, gridBagConstraints);
    this.Zw.setText(a(-4944, 19346));
    this.Zw.addActionListener(new Zz5c(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zw, gridBagConstraints);
    this.Zu.Zx(a(-4938, -5883));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.Zu, gridBagConstraints);
    this.ZA.setLayout(new GridLayout(0, 1));
    this.Zq.setText(a(-4945, -9190));
    this.Zq.addActionListener(new Zg9s(this));
    this.ZA.add(this.Zq);
    this.Zb.setText(a(-4958, -29442));
    this.Zb.addActionListener(new Zl58(this));
    this.ZA.add(this.Zb);
    this.ZX.setText(a(-4948, 16904));
    this.ZX.addActionListener(new Ztoj(this));
    this.ZA.add(this.ZX);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 24;
    add(this.ZA, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    add(this.Zr, gridBagConstraints);
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    Zrv9 zrv9 = new Zrv9(Zt2m.ZF(this), a(-4953, -22422), this.Zi.ZF(), this::lambda$btnChangeActionPerformed$1);
    zrv9.setTitle(a(-4950, 24542));
    zrv9.setVisible(true);
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    String str1 = this.Zs.Zq();
    String str2 = Zldl.ZI(str1);
    Zrvi zrvi = new Zrvi(Zt2m.ZF(this), this.Zi, new Zgt(true, "", str2, Long.valueOf((new Date()).getTime())), Optional.of(str1), this::lambda$btnNewApiKeyActionPerformed$2);
    zrvi.setTitle(a(-4929, -30350));
    zrvi.setVisible(true);
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    int i = ZT();
    if (i != -1)
      ZD(i); 
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    int i = ZT();
    if (i != -1) {
      this.Zi.Zs().remove(i);
      this.ZQ.fireTableRowsDeleted(i, i);
    } 
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    this.Zi.Zw(this.Zd.isSelected());
    ZY();
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    this.Zi.Zd(this.Zw.isSelected());
    ZY();
  }
  
  private void lambda$btnNewApiKeyActionPerformed$2(Zgt paramZgt) {
    List<Zgt> list = this.Zi.Zs();
    int i = list.size();
    list.add(paramZgt);
    this.ZQ.fireTableRowsInserted(i, i);
  }
  
  private void lambda$btnChangeActionPerformed$1(Zzqi paramZzqi) {
    this.Zi.ZG(paramZzqi);
    ZY();
  }
  
  private void lambda$edit$0(List<Zgt> paramList, int paramInt, Zgt paramZgt) {
    paramList.set(paramInt, paramZgt);
    this.ZQ.fireTableRowsUpdated(paramInt, paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'á\\b©°5%ì³\\tS½þ´ìQÏ_ũµ¬ÓØø{£ ½=ÌShÄ*x¨b)æèUBÝÞMëP¥b\\bKý\\t`½@#æ¶{u¢­»ÔÝqKç$ÄQHÿl²6]¢ÑF³÷ê8Xùd!?Jr&sôÉÖü·ùÔÅTkÂ3\YØo1Ëd]CÇWo °DÝL~ïùºÔî]féêLV6ü·\\t«,³$&¨H>\Û©í|dÃ¥}ùéGÃ\\bYE­ìøA?êÇæóN õJ/µ-ù<]½zëûU{C=\\b´8-öÃ\\né½¦$¬ÎÛ\\tØBõÛ<ô÷,í§Ë9¦\\t·3Ì¤M¤§÷ÏÅ9qmúÒÁùLÿ(c-CQL2`Dp±uÅ8P.`b£k-8Á¤\\rë=ôô¯¯ >öR*z\\nKX<5ç±DXÙ<4.ÛÅP¾H&«Ç6·®Ï®I¼cçLÊAL\ç7qáf\\t*â:ÚÂ³hÂ-~a¿|{\8\\fÕTèèS;¨1\\rðÕÃ/'bsÙJ¨Zvq\\rÛ'pOjDÁ£Wá]pqØÜÃ".ÿ×X ÿ.Nrf¾íSwu©å q:\\b\\fzþaóÕ\\bØ×ªúËÜg¼3ÞËxÆAUÂ1´õZxoÒ/ÉsýªCÿ@<é cÿxÂ^´Zà|Ky®­P)jK\\f#å>(º¿Ô\\n9ô\\bg.·p¶¢±\\fs´û!3þ°-é\\r\\t¢º.Ógz§Êj\\bØ5áð\\n^É¬ªÆ5¿)¥¶¸ôÿxßZÀ<T>Ýº=ØÏ÷]6!HÖÓevÊÙ§IæiT¬¤>æþÂDWío4xOÚñf´Ë;:©äK tbûëkÙ%EcÝ»¥ñX·\\f¢.õpÞ6ñ¬'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
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
    //   68: ldc '¼9w3(zïÀ"`~¹yXÍ¢ZÎP¢µÀß'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #23
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
    //   129: putstatic burp/Zbay.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbay.b : [Ljava/lang/String;
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
    //   212: bipush #54
    //   214: goto -> 244
    //   217: bipush #10
    //   219: goto -> 244
    //   222: bipush #58
    //   224: goto -> 244
    //   227: bipush #107
    //   229: goto -> 244
    //   232: bipush #124
    //   234: goto -> 244
    //   237: bipush #78
    //   239: goto -> 244
    //   242: bipush #90
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
    int i = (paramInt1 ^ 0xFFFFECA7) & 0xFFFF;
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
      char c = 'Ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbay.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */