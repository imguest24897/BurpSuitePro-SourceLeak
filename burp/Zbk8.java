package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Set;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbk8 extends Zbv5 implements Zky2, Zt3u {
  private final Zxzh ZD;
  
  private final Ze5r<Zm1n, Zt9r> Zv;
  
  private final Zt_j ZS;
  
  private final Zbws ZL;
  
  private final Zerg Zx;
  
  private final Zr_4 ZR;
  
  private final Zz0n Zq;
  
  private final Zt4u Z_;
  
  private final Zgb6 Zo;
  
  private final Zkl6 ZM;
  
  private final Ztwv ZY;
  
  private final Zslu Zt;
  
  private final Ztyg Za;
  
  private final Zgq7 Zz;
  
  private final Zskh Zb;
  
  private final Zr_4 Zu;
  
  private final Zlr9 ZJ;
  
  private final Zr1m ZN;
  
  private final Ze4m Zk;
  
  private final Collection<String> ZF;
  
  private Zl0r Zm;
  
  private Zl8w Zi;
  
  private Zmyw Zh;
  
  private Ze01 Zr;
  
  private Ze01 ZX;
  
  private Ze01 Zs;
  
  private Ze01 ZU;
  
  private Ze01 Zy;
  
  private Ze01 Zn;
  
  private Ze01 ZO;
  
  private Zbup ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbk8(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zskh paramZskh, Zgb6 paramZgb6, Zgzy paramZgzy, Zslu paramZslu, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Ztyg paramZtyg, Zgq7 paramZgq7, Zlr9 paramZlr9, Zr1m paramZr1m, Ze4m paramZe4m) {
    Zuh.Zb((null != paramZerg), Zqf.Zv);
    Zuh.Zb((null != paramZr_41), Zqf.Zv);
    Zuh.Zb((null != paramZgzy.Zh()), Zqf.Zx);
    this.Zq = paramZz0n;
    this.Z_ = paramZt4u;
    this.Zx = paramZerg;
    this.Zb = paramZskh;
    this.Zo = paramZgb6;
    this.Zt = paramZslu;
    this.ZM = paramZkl6;
    this.ZY = paramZtwv;
    this.ZR = paramZr_41;
    this.Zu = paramZr_42;
    this.Za = paramZtyg;
    this.Zz = paramZgq7;
    this.ZJ = paramZlr9;
    this.ZN = paramZr1m;
    this.Zk = paramZe4m;
    this.ZD = paramZgzy.Zh();
    this.Zv = this.ZD.Ze();
    this.ZS = new Zt_j(this.Zv);
    this.ZL = new Zbws(this.ZS);
    Zq();
    this.ZF = Set.of(Zjd(), a(23672, -31072), a(23650, -1069), a(23656, -9854), a(23653, -2045), a(23671, -3925), a(23678, -28561), a(23661, 23235), a(23668, -4029), a(23649, 10216));
    setName(a(23623, 19398));
    this.ZL.setName(a(23660, -26892));
    this.Zy.setName(a(23666, 25122));
    this.Zn.setName(a(23654, -21366));
    this.ZK.setViewportView(this.ZL);
    this.ZL.Zk(this);
  }
  
  public String Zjd() {
    return a(23667, 27361);
  }
  
  public String ZjS() {
    return a(23651, -31490);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(23679, 21993), Zk97.DESKTOP_SETTINGS_SESSIONS_SESSION_HANDLING_RULES, this.ZN, new String[] { a(23655, 26917) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZF;
  }
  
  public void Zm(Zm1n paramZm1n) {
    synchronized (this.Zv.ZB()) {
      this.ZD.Zr++;
      int i = this.Zv.ZG();
      this.Zv.Ze(paramZm1n);
      this.ZS.fireTableRowsInserted(i, i);
      this.ZL.getSelectionModel().setSelectionInterval(i, i);
    } 
  }
  
  public void ZU(Zm1n paramZm1n) {
    int i = this.Zv.Zo(paramZm1n);
    if (i != -1)
      this.ZS.fireTableRowsUpdated(i, i); 
  }
  
  private Zm1n Zs(int paramInt) {
    return this.Zv.ZV(paramInt);
  }
  
  private void ZS(int paramInt) {
    this.Zv.Zf(paramInt);
    this.ZS.fireTableRowsDeleted(paramInt, paramInt);
  }
  
  private void ZJ(int paramInt) {
    this.Zv.ZH(paramInt);
    this.ZS.fireTableRowsUpdated(paramInt, paramInt + 1);
  }
  
  public void ZR() {
    this.Zm = null;
    this.ZD.Zj(null);
  }
  
  public void Zt2() {
    this.ZS.fireTableDataChanged();
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    Zm1n zm1n = this.Zv.ZV(paramInt1);
    zm1n.ZH();
    this.ZS.fireTableCellUpdated(paramInt1, 0);
  }
  
  private void Zq() {
    this.Zy = new Ze01();
    this.ZX = new Ze01();
    this.Zn = new Ze01();
    this.ZU = new Ze01();
    this.Zs = new Ze01();
    this.Zr = new Ze01();
    this.Zi = new Zl8w();
    this.Zh = new Zmyw();
    this.ZK = new Zbup();
    this.ZO = new Ze01();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zy.setText(a(23674, -31900));
    this.Zy.setToolTipText(a(23621, -14082));
    this.Zy.addActionListener(new Zgar(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zy, gridBagConstraints);
    this.ZX.setText(a(23659, 26144));
    this.ZX.setToolTipText(a(23622, 4262));
    this.ZX.addActionListener(new Zgd6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZX, gridBagConstraints);
    this.Zn.setText(a(23665, 31079));
    this.Zn.setToolTipText(a(23673, 16410));
    this.Zn.addActionListener(new Zbzy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zn, gridBagConstraints);
    this.ZU.setText(a(23676, 26331));
    this.ZU.setToolTipText(a(23664, 23726));
    this.ZU.addActionListener(new Zrdp(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZU, gridBagConstraints);
    this.Zs.setText(a(23663, 1427));
    this.Zs.setToolTipText(a(23675, -4490));
    this.Zs.addActionListener(new Zmpz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zs, gridBagConstraints);
    this.Zr.setText(a(23658, -14537));
    this.Zr.setToolTipText(a(23648, -2324));
    this.Zr.addActionListener(new Zlj0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zr, gridBagConstraints);
    this.Zi.setText(a(23669, 4870));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.Zi, gridBagConstraints);
    this.Zh.setLeftComponent(this.ZK);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 11;
    gridBagConstraints.fill = 1;
    add(this.Zh, gridBagConstraints);
    this.ZO.setText(a(23677, -10982));
    this.ZO.setToolTipText(a(23652, 20474));
    this.ZO.addActionListener(new Zsv2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    add(this.ZO, gridBagConstraints);
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    int i = this.ZL.getSelectedRow();
    if (i == -1 || i == this.ZL.getRowCount() - 1)
      return; 
    ZJ(i);
    this.ZL.getSelectionModel().setSelectionInterval(i + 1, i + 1);
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    int i = this.ZL.getSelectedRow();
    if (i < 1)
      return; 
    ZJ(i - 1);
    this.ZL.getSelectionModel().setSelectionInterval(i - 1, i - 1);
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    int i = this.ZL.getSelectedRow();
    if (i == -1)
      return; 
    if (0 != Zx6o.Zc(Zt2m.ZF(this), a(23670, 15860), a(23662, -20415), new String[] { a(23657, 6871), a(23620, -15797) }1))
      return; 
    ZS(i);
    if (i >= this.ZL.getRowCount())
      i--; 
    if (i >= 0 && i < this.ZL.getRowCount())
      this.ZL.getSelectionModel().setSelectionInterval(i, i); 
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    int i = this.ZL.getSelectedRow();
    if (i == -1)
      return; 
    Zm1n zm1n = Zs(i);
    Zr72 zr72 = new Zr72(this.Zq, this.Z_, this.ZD, this, zm1n, false, this.Zx, this.Zb, this.Zo, this.ZM, Zt2m.ZF(this), this.ZY, this.ZR, this.Za, this.Zz, this.ZJ, this.Zk);
    zr72.setVisible(true);
  }
  
  private void Z_(ActionEvent paramActionEvent) {
    Zr72 zr72 = new Zr72(this.Zq, this.Z_, this.ZD, this, new Zm1n(this.ZD.Zr, this.Z_, this.Zt, this.ZM, this.Zu, this.ZR), true, this.Zx, this.Zb, this.Zo, this.ZM, Zt2m.ZF(this), this.ZY, this.ZR, this.Za, this.Zz, this.ZJ, this.Zk);
    zr72.setVisible(true);
  }
  
  private void Zq(ActionEvent paramActionEvent) {
    if (this.Zm == null)
      this.Zm = new Zl0r(this, this.Zq, this.Zo, this.ZY, this.Zu, this.Za, this.Zz, this.Zq.ZP()); 
    this.ZD.Zj(this.Zm);
    this.Zm.setVisible(true);
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    int i = this.ZL.getSelectedRow();
    if (i == -1)
      return; 
    Zm1n zm1n = Zs(i);
    Zm(zm1n.ZB(this.ZM, this.ZD));
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'g´Iè"ò<ýô!8¶6®mû.(ôdìYí+Mç5Õ*0æ§ÖG.WßP%^J¤^èó}U2ãU!Y´EäUãýû¨Á­ °½Gù¢N4âj®ì+uö¢ëå·\\nÎ)cí÷«ùh{çÖ{êCRǓsî¥íÁ~XîçcÏØíUü6YÅ)é|1?÷qe¸äú3tíêyES39&hsæ µ!`ëa"?f´ô´n8¡qÖéâë¹f{Pðÿ¥È¦JòçÍòÛ"ea­ÜG¬$§ì¤Øhaâ\\tÚ¾níçÿr¹~52ÃÞ_«Ûä±ÛB¬äyÖx?\ËM~´ÆÈð£½×¬ú¼Â«èVãbYEºð|ÂÐG|à\\r|¢"\\b8mã¸l:Hù¦pÆ=l+¦ïíJ,ì{ºoÆfè¼óÊj`-ÁxòhúçÕ:wÐ3C+be½©PzøÅµpýà·~Í¥ññB¹@7Ë§¡DÕj2¯zª/Sh$e_$\÷ØõVFR§d¹³juõæÑ)¡ìíãO¦×àfQó!å;8MpZ²n;oVÀZãz×vø3¸6ç5k´>° ¯AõÉ¿NlÄÒ¹rê)^\\rtP7\\n¿ß¦\\t ~SùT'\höç¾âVúÑ)b]Ø\\ffJ?ïÃ´.gß\\bó¤KwP<\\fsre¿iÔ6rt\rÿX2Fj`*5ºsm4pÔxkâ×¿«ÀHÑ?*jLÕ¶wzÍúX¬§±Óæ\\fÆýß5Â¦÷z³ÄEÚJøÆf¸Ñ5Âd\\b"R8R)Û'®#¶èn¶lù­9pÊ%\\nÄj{©ýÆ/¶v;ßÉDÂà ò@¨N\\t¥)zHdÙë9FbãC\\nM¸](ý\\rYoÕÓ/MÐ_³Xé¾i0ã¨P·ûEvÜÜÈ Dq¬\\fõÔ ¦RØad£?M¯Whü9n±\\r½mÙÖð­IQ<¸Nèô¯­e¢¶°ã¶ù+Æ¹Îzæõ<\\fK7unö#öd%­?me`c;½¿Ð³9x­î+\³èú¥ô±,HÌî¡øT4°GÐµé&SW&HMèÔ8I@\\bHòå\\r»Ý³û¢i4Ö+èK^÷Ï!<Ë¼ ýt¤¯[Âº.wX,0¦\\bk£\\r~w×2þ[ÅÏ}ò¥ï~Kð48å¯Éë¦{U§8ñn3¤©g²KyGlv_ '%ZèØQR¯¯«Ûr§èpÏFWgDK¶¦fÊ$gÐ \\rLGê¸ØôF¼pß|»dÝ+¶U¿TÜFëÈ¢ÕI¦UÊHB³¨Ê,¯ÃÎÓp²xñì\q¸ë©1ä'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #47
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
    //   68: ldc 'û©uza¿ÝÁÜ&XÂñ '
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #17
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #64
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
    //   129: putstatic burp/Zbk8.a : [Ljava/lang/String;
    //   132: bipush #36
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbk8.b : [Ljava/lang/String;
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
    //   212: bipush #58
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #75
    //   224: goto -> 244
    //   227: bipush #70
    //   229: goto -> 244
    //   232: bipush #72
    //   234: goto -> 244
    //   237: bipush #89
    //   239: goto -> 244
    //   242: bipush #107
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
    int i = (paramInt1 ^ 0x5C67) & 0xFFFF;
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
      char c = 'Ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbk8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */