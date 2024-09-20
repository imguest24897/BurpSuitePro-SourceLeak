package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.regex.PatternSyntaxException;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import net.portswigger.Zl0;
import net.portswigger.Zm2;

public class Zb5z extends Zbqc implements Zzit<Zzh2, Zkvy>, Zm3g {
  private final Zkvy ZU;
  
  private final Zt4u Zh;
  
  private final Zskh Zi;
  
  private final Zm6v Zw;
  
  private final Zl0 ZZ;
  
  private final Zbqa Zj;
  
  private final Zr_4 ZO;
  
  private final TitledBorder Zu;
  
  private final TitledBorder Zy;
  
  private final TitledBorder ZI;
  
  private final TitledBorder ZN;
  
  private final Zbqc Zq;
  
  private Zb07 Zl;
  
  private boolean Zc;
  
  private boolean Zz;
  
  private Zbqc Zv;
  
  private Zzdy ZR;
  
  private Zzdy Zd;
  
  private Zzdy ZW;
  
  private Zzdy ZB;
  
  private Zzdy ZF;
  
  private Zzdy Za;
  
  private Zzdy Zo;
  
  private Zzdy ZQ;
  
  private Zbqc ZD;
  
  private Zm99 ZY;
  
  private Zm9v Zs;
  
  private Zbqc ZS;
  
  private Zbqc Zn;
  
  private Zbqc ZT;
  
  private Zgff Zm;
  
  private Zgff ZL;
  
  private static Zbqc[] Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb5z(Zkvy paramZkvy, Zt4u paramZt4u, Zskh paramZskh, Zm6v paramZm6v, Zl0 paramZl0, Zbqa paramZbqa, Zr_4 paramZr_4) {
    this.ZU = paramZkvy;
    this.Zh = paramZt4u;
    this.Zi = paramZskh;
    this.Zw = paramZm6v;
    this.ZZ = paramZl0;
    this.Zj = paramZbqa;
    this.ZO = paramZr_4;
    this.Zz = true;
    paramZkvy.ZGN();
    ZpQ();
    this.Zs.setVisible(false);
    this.Zu = (TitledBorder)this.Zn.getBorder();
    this.Zy = (TitledBorder)this.ZT.getBorder();
    this.ZI = (TitledBorder)this.Zv.getBorder();
    this.ZN = (TitledBorder)this.ZS.getBorder();
    Ztl4 ztl4 = new Ztl4(this, paramZr_4, paramZbqa);
    this.Zq = new Zgoa(ztl4, false);
  }
  
  private void ZT(Zzdx paramZzdx) {
    paramZzdx.ZMm(this.ZQ.isSelected());
    paramZzdx.ZM4(this.Zd.isSelected());
    paramZzdx.ZMv(this.ZR.isSelected());
    paramZzdx.Zyr(this.ZL.getText());
    paramZzdx.ZMT(this.ZF.isSelected());
    paramZzdx.ZMH(this.ZW.isSelected());
    paramZzdx.ZMB(this.ZB.isSelected());
    paramZzdx.ZMC(this.Za.isSelected());
    paramZzdx.ZMs(this.Zo.isSelected());
    paramZzdx.Zyx(this.Zm.getText());
    paramZzdx.Zh(Zzca.SETTINGS);
  }
  
  public boolean Zly() {
    return this.Zz;
  }
  
  public JComponent Zlh() {
    return this.Zq;
  }
  
  public void Zq(Zb07 paramZb07) {
    this.Zl = paramZb07;
    this.Zc = false;
  }
  
  public JComponent Zlj() {
    return this;
  }
  
  public void ZlQ() {
    try {
      if (!this.Zc)
        ZpO(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void Zlt() {
    Zm2.Zo(Zze0.PROXY_WEB_SOCKET_HISTORY_FILTER_APPLIED);
    ZpA();
  }
  
  public void Zlm() {
    ZpO();
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      Arrays.<Component>stream(getComponents()).forEach(SwingUtilities::updateComponentTreeUI);
      if (this.ZN != null) {
        this.Zu.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zy.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZI.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZN.setTitleFont(Zt00.DEFAULT_FONT.ZV());
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public Zr1m Zlr() {
    return this.Zw.ZL(this);
  }
  
  public void Zt2() {
    this.ZQ.setSelected(this.ZU.ZFK());
    this.Zd.setSelected(this.ZU.ZFZ());
    this.ZR.setSelected(this.ZU.ZFk());
    this.ZL.setText(this.ZU.ZFJ());
    this.ZF.setSelected(this.ZU.ZFs());
    this.ZW.setSelected(this.ZU.ZFF());
    this.ZB.setSelected(this.ZU.ZFo());
    Zpq();
    this.Za.setSelected(this.ZU.ZFe());
    this.Zo.setSelected(this.ZU.ZFd());
    this.Zm.setText(this.ZU.ZFc());
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.ZQ.setSelected(paramZmf_.ZC(a(25214, -32303), this.ZQ.isSelected()));
    this.Zd.setSelected(paramZmf_.ZC(a(25175, -10145), this.Zd.isSelected()));
    this.ZR.setSelected(paramZmf_.ZC(a(25199, 2027), this.ZR.isSelected()));
    this.ZL.setText(paramZmf_.Zm(a(25197, 8607), this.ZL.getText()));
    this.ZF.setSelected(paramZmf_.ZC(a(25209, -6184), this.ZF.isSelected()));
    this.ZW.setSelected(paramZmf_.ZC(a(25202, -4799), this.ZW.isSelected()));
    Zbqc[] arrayOfZbqc = Zp6();
    try {
      this.ZB.setSelected(paramZmf_.ZC(a(25190, -14755), this.ZB.isSelected()));
      this.Za.setSelected(paramZmf_.ZC(a(25189, -26859), this.Za.isSelected()));
      this.Zo.setSelected(paramZmf_.ZC(a(25174, 4456), this.Zo.isSelected()));
      this.Zm.setText(paramZmf_.Zm(a(25212, -13619), this.Zm.getText()));
      if (Zbqc.Zwu() == null)
        ZI(new Zbqc[2]); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void Zl(Zg4j paramZg4j) {
    paramZg4j.Zh(a(25200, -10028), this.ZQ.isSelected());
    paramZg4j.Zh(a(25213, 23974), this.Zd.isSelected());
    paramZg4j.Zh(a(25206, -14322), this.ZR.isSelected());
    paramZg4j.Za(a(25185, -11767), this.ZL.getText());
    paramZg4j.Zh(a(25172, -14938), this.ZF.isSelected());
    paramZg4j.Zh(a(25205, 28416), this.ZW.isSelected());
    paramZg4j.Zh(a(25196, -1370), this.ZB.isSelected());
    paramZg4j.Zh(a(25201, -1609), this.Za.isSelected());
    paramZg4j.Zh(a(25187, -23395), this.Zo.isSelected());
    paramZg4j.Za(a(25211, -32456), this.Zm.getText());
  }
  
  private void ZpT() {
    this.ZQ.setSelected(false);
    this.Zd.setSelected(false);
    this.ZR.setSelected(false);
    this.ZL.setText("");
    this.ZF.setSelected(false);
    this.ZW.setSelected(false);
    this.ZB.setSelected(false);
    this.Za.setSelected(false);
    this.Zo.setSelected(false);
    this.Zm.setText("");
  }
  
  private void ZpA() {
    this.Zc = true;
    this.ZU.Za6(this.ZQ.isSelected());
    this.ZU.ZaE(this.Zd.isSelected());
    this.ZU.Zan(this.ZR.isSelected());
    this.ZU.Zf(this.ZL.getText());
    this.ZU.Zao(this.ZF.isSelected());
    this.ZU.Za_(this.ZW.isSelected());
    this.ZU.ZaC(this.ZB.isSelected());
    Zpq();
    this.ZU.Zag(this.Za.isSelected());
    this.ZU.ZaI(this.Zo.isSelected());
    this.ZU.ZL(this.Zm.getText());
    this.ZU.Zw(Zzca.SETTINGS);
  }
  
  private void ZpO() {
    Zt2();
  }
  
  private void Zpq() {
    // Byte code:
    //   0: invokestatic Zp6 : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZF : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 66
    //   14: aload_0
    //   15: getfield ZL : Lburp/Zgff;
    //   18: invokevirtual getText : ()Ljava/lang/String;
    //   21: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   24: pop
    //   25: aload_0
    //   26: getfield Zs : Lburp/Zm9v;
    //   29: iconst_0
    //   30: invokevirtual setVisible : (Z)V
    //   33: aload_0
    //   34: iconst_1
    //   35: putfield Zz : Z
    //   38: goto -> 86
    //   41: astore_2
    //   42: aload_2
    //   43: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   46: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   49: aload_0
    //   50: getfield Zs : Lburp/Zm9v;
    //   53: iconst_1
    //   54: invokevirtual setVisible : (Z)V
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield Zz : Z
    //   62: aload_1
    //   63: ifnonnull -> 86
    //   66: aload_0
    //   67: getfield Zs : Lburp/Zm9v;
    //   70: iconst_0
    //   71: invokevirtual setVisible : (Z)V
    //   74: aload_0
    //   75: iconst_1
    //   76: putfield Zz : Z
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   85: athrow
    //   86: aload_0
    //   87: getfield Zl : Lburp/Zb07;
    //   90: ifnull -> 109
    //   93: aload_0
    //   94: getfield Zl : Lburp/Zb07;
    //   97: invokeinterface ZgU : ()V
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   108: athrow
    //   109: return
    // Exception table:
    //   from	to	target	type
    //   14	38	41	java/util/regex/PatternSyntaxException
    //   42	79	82	java/util/regex/PatternSyntaxException
    //   86	102	105	java/util/regex/PatternSyntaxException
  }
  
  private void ZpQ() {
    this.ZD = new Zbqc();
    this.Zn = new Zbqc();
    this.ZQ = new Zzdy();
    this.Zd = new Zzdy();
    this.ZR = new Zzdy();
    this.ZT = new Zbqc();
    this.ZL = new Zgff();
    this.ZF = new Zzdy();
    this.ZW = new Zzdy();
    this.Zs = new Zm9v();
    this.ZB = new Zzdy();
    this.Zv = new Zbqc();
    this.Za = new Zzdy();
    this.Zo = new Zzdy();
    this.ZS = new Zbqc();
    this.Zm = new Zgff();
    this.ZY = new Zm99();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    setLayout(new BorderLayout());
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0 };
    this.ZD.setLayout(gridBagLayout1);
    this.Zn.setBorder(BorderFactory.createTitledBorder(a(25168, -22270)));
    this.Zn.setLayout(new GridLayout(4, 0, 0, 5));
    this.ZQ.setText(a(25184, 9027));
    this.Zn.add(this.ZQ);
    this.Zd.setText(a(25170, -4916));
    this.Zn.add(this.Zd);
    this.ZR.setText(a(25186, 28405));
    this.Zn.add(this.ZR);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.ZD.add(this.Zn, gridBagConstraints);
    this.ZT.setBorder(BorderFactory.createTitledBorder(a(25210, -9953)));
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.ZT.setLayout(gridBagLayout2);
    this.ZL.setColumns(20);
    this.ZL.ZH(Zlw9.SEARCH_TERM);
    this.ZL.setName(a(25198, 9960));
    this.ZL.addKeyListener(new Zxd7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.ZT.add(this.ZL, gridBagConstraints);
    this.ZF.setText(a(25191, -30373));
    this.ZF.setName(a(25203, 15327));
    this.ZF.addActionListener(new Zkg6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.ZF, gridBagConstraints);
    this.ZW.setText(a(25194, -23152));
    this.ZW.setName(a(25173, -12591));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    this.ZT.add(this.ZW, gridBagConstraints);
    this.Zs.setHorizontalAlignment(4);
    this.Zs.setText(a(25188, -20912));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1536;
    this.ZT.add(this.Zs, gridBagConstraints);
    this.ZB.setText(a(25207, 22670));
    this.ZB.setName(a(25204, -25707));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weightx = 1.0D;
    this.ZT.add(this.ZB, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.ZD.add(this.ZT, gridBagConstraints);
    this.Zv.setBorder(BorderFactory.createTitledBorder(a(25171, -26746)));
    this.Zv.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0 };
    gridBagLayout3.rowHeights = new int[] { 0, 10, 0 };
    this.Zv.setLayout(gridBagLayout3);
    this.Za.setText(a(25192, -7372));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.Zv.add(this.Za, gridBagConstraints);
    this.Zo.setText(a(25215, 3074));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    this.Zv.add(this.Zo, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.ZD.add(this.Zv, gridBagConstraints);
    this.ZS.setBorder(BorderFactory.createTitledBorder(a(25195, -1505)));
    this.ZS.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout4 = new GridBagLayout();
    gridBagLayout4.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout4.rowHeights = new int[] { 0 };
    this.ZS.setLayout(gridBagLayout4);
    this.Zm.setColumns(5);
    this.Zm.ZH(Zlw9.PORT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZS.add(this.Zm, gridBagConstraints);
    this.ZY.setText(a(25208, 13823));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZS.add(this.ZY, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.ZD.add(this.ZS, gridBagConstraints);
    add(this.ZD, a(25193, 1166));
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    Zpq();
  }
  
  private void Zv(KeyEvent paramKeyEvent) {
    Zpq();
  }
  
  public static void ZI(Zbqc[] paramArrayOfZbqc) {
    Z_ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zp6() {
    return Z_;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #39
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc 'ndàîµâCôX4pÜ"WÇÍC{~Ö{^´Â+§(ÍÏÍB®DwRoÀY¢3£y®Á[Na=À@nbsk¼×k\\n¶ÙûÖê2Gèæ.óì¢ù g¿æòÏ¤"Àþzv\\t?éTYWÐ<ÄAÂwÝ¹{¶Ëç(Ç5A^Ü©2\\n³éF³{nRó¶ýñü&fýw¶S)'.÷!)¬OqcÖJ-gx}(©{óº1Ë¾v.d/Abÿ.Vú?÷×T(]I¯ÁÒfªx>EÎ&ïý7ËM\Qà ¨®\\f"¯AÍl÷by³øyæ6Þzö-wã´Pò"ÀÍ>\\rWt2÷ÜÞòUQ[Ï\\tPÿkÏÇqHEÛ.øâ¤jä­F¼uhã4¶ò2¥K¸ËÍø3«Üml²W¸daòÁ|ßùP( Ï/6Ú,0r¤k\\bPäj±/ÚóðÔe´_ÚRÝÉQF|¯¾¡Þ$|½EÃL|2UÇ L¾+!Ï'<¡:uârêgèÎ-PÔìª%C&okQÑ!FK÷V£`ùs\\bè:ëk\\tÙü\\nËHÄöÕçpêêPQ¨ð&(Üò~¹½(â-\\rñáLæoD4ßpç@¥½óÃ¸ÎÂµ2¶ÀHÐçã!Wà~zú|XJ×Bô±³TßµñiE¤°©ZÍù)®iÒücUNøÄ:¸Æl\\tÚ±\\r4Gó\\f8´ZÈs÷¸O°;Î_,CµÂÍÑ¡xY¨® Ã¹Ìê¨\\t|Þ¶¢Æ¯Õùå6ä|xÕ4ø¯÷Îµªg'Ùáf©áØ©ó/Ðë)LkW{<ºHÁ;;t}á§£çCïB,Õ¨Ø¼$b,|/ôl°¯vur¸÷£#E0¡»Ë:@|Ut§VKÛÝÁ½Ãw.Bw/$b`\\nòëÔþjG°/ÜÂiLý8lß ½\\fB)xtx2ÿU|4s×¦'å°µ«I8Ív]5¦ªvO{]Õ²MxtõüT´"ÔB­z-º¢ûdÕ÷3æ[ÒÙµt7t;¿3þÛ 6=\\fÓe¡<]S!ÞÂ$vY4Yl%jOvôvVfW)Gà«Ô\\rGÂtÞÌÛ }>:P@%²\\riTº,Êdÿ5y%\\bÃõÁ\\nåpè YÚá/ØÏ`#îg«¨Ð58h¨Ù;ÀÃ¤Bh=Z°ÂgÐàëØT½\\fûfgV*TDÖ|&Êø¼¹lËSR¡èÐ¤²¤üïåÿðFK4ÒDL1=û+ÛØV© AäÓv\\bÆ»ÓÛb¾\\tÏ4¶?ø»?MÜa`|F¼âÚLÛ¨9²,K4+²bÜ¼SÉê6Y"H´í´7¯Ñ\~\\bÿ«ü¢]í->|ë Á@1µÙûµ4R}G£J®È_­Q¬Ý»f¾[úÃº"ìdpÞnk]¥² Ð®Z¬4ô¸ñ¡nqCó{¹{OaNöövîd¦ÌÕ\\n<Â ãÖjcù±bÈñæså¤ÈpâPÂÐÙ¨éâ"ª^#µÌ)uÂØ2¥aÇýC}ëªµ¢ly`ºäM2§uB©]Éª h$§ÿ}ç°ëþ5dd5ç{Í;°Úé\\bôåe± ÎSÖÐÃíV`0~ìø5hüAwFn-¥7²p{lÆ²-þuÉ'!ÙhÓVÁ\\b.¸qÊ\\rê¢ÎmÙÀÝX¢à¦\\t+SGY2éj!)*JÜfê:8¨òL\\nWW<ºøÁ-$ºp³P)Ò9v×^dª±uÞÛ1Ïyîó·ðRÐ97EOZ³á\\rµ¹{ÈéèÕìÉxðÝ'qÊéT1(ü$ÿUo'õWÆ Ü¡"¿çKÆ­°NFûZ2[9eÆ§ÅEPO4Í«ÛÜDn ý®Ä\¶\o\\rnvØû¯¢Ä ½ÍúdVwÇâZÊZíñ¥É«ãò \\bíËøÇ8Ö=]'T}ëÅú¢ñZ\\r8°;Î=,µKÍà¡!x0½ ¡¹ê!\\t-ZÞr:Æ¼Õ©¿äM^)°Ï=Q®àò"Ñ0K@À |óæBO\uÀÌºýb"9,êXòOÌð²Õÿ~Ae½0Ï'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #79
    //   24: istore_1
    //   25: invokestatic ZI : ([Lburp/Zbqc;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #23
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'ÏþY«jÖ³y<¼.­2Úgö¶²ûßÆSH¹®ïï]+¶Ë'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #20
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #43
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zb5z.a : [Ljava/lang/String;
    //   139: bipush #39
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zb5z.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #117
    //   222: goto -> 252
    //   225: bipush #55
    //   227: goto -> 252
    //   230: bipush #103
    //   232: goto -> 252
    //   235: bipush #53
    //   237: goto -> 252
    //   240: bipush #75
    //   242: goto -> 252
    //   245: bipush #53
    //   247: goto -> 252
    //   250: bipush #72
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6276) & 0xFFFF;
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
      byte b1 = 39;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */