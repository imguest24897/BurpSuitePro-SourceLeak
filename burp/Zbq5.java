package burp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.Border;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zbq5 extends Zbqc implements Zsni, Zb3a, Zmi {
  private final Ztoz ZQ;
  
  private final Zsv9 ZI;
  
  private final Zmud ZR;
  
  private final Zbq6 ZZ;
  
  private final Zmd5 ZT;
  
  private boolean Z_;
  
  private Zm99 ZD;
  
  private Zbqc ZF;
  
  private Zm99 Zf;
  
  private Zzdy ZN;
  
  private Ze0q ZU;
  
  private Ze01 Zq;
  
  private Zm99 Zv;
  
  private Zm99 ZW;
  
  private Zm99 ZE;
  
  private Zm99 Zh;
  
  private Zm99 ZM;
  
  private JPanel Zg;
  
  private Zbqc Zy;
  
  private Zem9 ZK;
  
  private Zbkd Zt;
  
  private Zm99 ZB;
  
  private Zmyz Zi;
  
  private Box.Filler ZG;
  
  private Zem9 Zc;
  
  private Zbup ZH;
  
  private Zg85 ZO;
  
  private static int Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbq5(Zz0n paramZz0n, Zgb6 paramZgb6, Ztyg paramZtyg, Zgq7 paramZgq7, Ztoz paramZtoz, Zsv9 paramZsv9, boolean paramBoolean, Zey9 paramZey9, Zbq6 paramZbq6) {
    this.ZQ = paramZtoz;
    this.ZI = paramZsv9;
    this.Z_ = paramBoolean;
    this.ZZ = paramZbq6;
    Zbqc zbqc = new Zbqc();
    zbqc.setName(a(22491, 2664));
    zbqc.setLayout(new BorderLayout());
    zbqc.setBorder(new Zr43(Zlkk.BORDER));
    zbqc.setLayout(new GridLayout(1, 3));
    Zbcg zbcg = Zltn.ZK(Zgzq.COLLABORATOR_EMPTY_PANEL_ICON, a(22490, -15891)).Za(a(22488, -9212)).ZC(54).ZN(Zlar.COLLABORATOR_INTERACTIONS_TABLE_LEARN_MORE_INFO).ZS(Zlkk.TABLE_BACKGROUND).Zi();
    this.ZR = new Zmud(zbqc, paramZtoz.ZR());
    int i = ZX();
    this.ZT = new Zl3o(new Zxco(paramZz0n, paramZgb6, paramZtyg, paramZgq7, paramZey9));
    Zbws zbws = ZY(paramZtoz, zbcg, zbqc);
    Zr();
    Ze9n ze9n = Ze3m.ZC(Zeuf.INFORMATION, Zlkk.ACTION_NORMAL).ZU(Zmcx.EXTRA_LARGE_LINE_SIZE).Z_();
    try {
      this.ZB.setIcon(ze9n);
      this.ZW.ZE(Zt00.BOLD_FONT);
      this.Zh.ZE(Zt00.BOLD_FONT);
      this.ZN.setSelected(paramZtoz.ZA());
      this.ZN.setName(a(22483, 10365));
      this.Zq.setName(a(22495, 6871));
      this.ZD.setName(a(22468, 22179));
      setVisible(true);
      this.ZH.setViewportView(zbws);
      this.Zi.setBottomComponent(zbqc);
      this.Zi.Za(35);
      this.ZH.setVisible(true);
      this.ZR.addTableModelListener(new Zxle(this.Zi));
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    boolean bool = (this.ZR.getRowCount() == 0) ? true : false;
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      zbqc.setVisible(!bool);
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zi.Zl(!bool);
    this.Zq.setEnabled(this.Z_);
    this.ZD.setVisible(this.Z_);
    Zes1 zes1 = paramZgb6.ZU0();
    try {
      Zd(zes1.ZT);
      ZF(zbws);
      if (i != 0)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private Zbws ZY(Ztoz paramZtoz, Zbqc paramZbqc1, Zbqc paramZbqc2) {
    Zbws zbws = new Zbws(this.ZR, paramZbqc1);
    zbws.setName(a(22492, 19582));
    zbws.setAutoCreateRowSorter(true);
    zbws.ZF(true);
    zbws.setFillsViewportHeight(true);
    zbws.getTableHeader().setReorderingAllowed(true);
    zbws.ZL(this.ZR);
    Zmeg zmeg = new Zmeg(zbws, paramZtoz.ZR(), this::lambda$createInteractionsTable$0, paramZbqc2, this.ZT, this.ZZ);
    zbws.Zc(zmeg);
    Zzlc zzlc = new Zzlc(this.ZR, zbws, paramZtoz.ZR(), this.ZZ);
    zbws.ZP(zzlc);
    zbws.addMouseListener(zzlc);
    return zbws;
  }
  
  private void ZF(Zbws paramZbws) {
    this.Zt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    Zm2o zm2o = new Zm2o(Zmcx.LARGE_LINE_SIZE);
    zm2o.Zi(Zk97.DESKTOP_TOOLS_COLLABORATOR_CLIENT);
    this.Zt.Zh(zm2o);
    Zm2j zm2j = new Zm2j(paramZbws);
    this.Zt.Zh(zm2j);
    Zgf8 zgf8 = new Zgf8();
    zgf8.setName(a(22469, 21098));
    Objects.requireNonNull(this.ZR);
    zgf8.Zv(this.ZR::Zv, 20);
    zgf8.addFocusListener(new Zm9z(zgf8, paramZbws.getName()));
    this.Zt.ZX(zgf8);
  }
  
  public int ZL() {
    return this.ZQ.Zg();
  }
  
  public void Zw() {
    Zd(true);
  }
  
  public void ZJ() {
    Zd(false);
  }
  
  private void Zd(boolean paramBoolean) {
    try {
      this.ZO.setEnabled(paramBoolean);
      this.ZU.setEnabled(paramBoolean);
      this.ZN.setEnabled(paramBoolean);
      if (this.Z_)
        this.Zq.setEnabled(paramBoolean); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zg.setVisible(!paramBoolean);
  }
  
  private void Zr() {
    this.ZF = new Zbqc();
    this.Zy = new Zbqc();
    this.Zf = new Zm99();
    this.ZO = new Zg85();
    this.ZU = new Ze0q();
    this.ZN = new Zzdy();
    this.ZK = new Zem9();
    this.Zq = new Ze01();
    this.ZD = new Zm99();
    this.Zg = new JPanel();
    this.ZB = new Zm99();
    this.ZG = new Box.Filler(new Dimension(10, 0), new Dimension(10, 0), new Dimension(10, 32767));
    this.Zv = new Zm99();
    this.ZW = new Zm99();
    this.ZE = new Zm99();
    this.Zh = new Zm99();
    this.ZM = new Zm99();
    this.Zc = new Zem9();
    this.Zt = new Zbkd();
    this.Zi = new Zmyz();
    this.ZH = new Zbup();
    setLayout(new BorderLayout());
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    this.ZF.setLayout(gridBagLayout1);
    this.Zy.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 0, 0 };
    this.Zy.setLayout(gridBagLayout2);
    this.Zf.setText(a(22493, 3915));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 0.1D;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zy.add(this.Zf, gridBagConstraints);
    this.ZO.setColumns(6);
    this.ZO.setText("1");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 0.1D;
    gridBagConstraints.insets = new Insets(0, 0, 0, 15);
    this.Zy.add(this.ZO, gridBagConstraints);
    this.ZU.setText(a(22486, -32008));
    this.ZU.addActionListener(new Ztat(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 0.1D;
    gridBagConstraints.insets = new Insets(0, 0, 0, 15);
    this.Zy.add(this.ZU, gridBagConstraints);
    this.ZN.setSelected(true);
    this.ZN.setText(a(22480, -21580));
    this.ZN.addActionListener(new Zxlx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 0.1D;
    gridBagConstraints.insets = new Insets(0, 0, 0, 15);
    this.Zy.add(this.ZN, gridBagConstraints);
    this.ZK.setOrientation(1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 25;
    gridBagConstraints.weightx = 0.1D;
    gridBagConstraints.insets = new Insets(0, 0, 0, 15);
    this.Zy.add(this.ZK, gridBagConstraints);
    this.Zq.setText(a(22481, 27777));
    this.Zq.addActionListener(new Zkmr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 0.1D;
    this.Zy.add(this.Zq, gridBagConstraints);
    this.ZD.setText(a(22484, -9141));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 12;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 0.1D;
    gridBagConstraints.insets = new Insets(0, 15, 0, 0);
    this.Zy.add(this.ZD, gridBagConstraints);
    this.Zg.setLayout(new FlowLayout(0, 0, 0));
    this.Zg.add(this.ZB);
    this.Zg.add(this.ZG);
    this.Zv.setText(a(22485, -3277));
    this.Zg.add(this.Zv);
    this.ZW.setText(a(22494, -19636));
    this.Zg.add(this.ZW);
    this.ZE.setText(a(22487, -9270));
    this.Zg.add(this.ZE);
    this.Zh.setText(a(22489, -31167));
    this.Zg.add(this.Zh);
    this.ZM.setText(a(22482, -7871));
    this.Zg.add(this.ZM);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(30, 0, 0, 0);
    this.Zy.add(this.Zg, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(20, 0, 20, 0);
    this.ZF.add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.ZF.add(this.Zc, gridBagConstraints);
    this.Zt.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.Zt.setLayout(new FlowLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.ZF.add(this.Zt, gridBagConstraints);
    this.Zi.setOrientation(0);
    this.ZH.setBorder((Border)null);
    this.Zi.setTopComponent(this.ZH);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZF.add(this.Zi, gridBagConstraints);
    add(this.ZF, a(22471, -3214));
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    this.ZI.Ze();
    Zm2.Zo(Zze0.COLLABORATOR_UI_MANUAL_POLL_PERFORMED);
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    try {
      if (!Zh())
        this.ZO.setText("1"); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    int i = Integer.parseInt(this.ZO.getText().trim());
    this.ZI.ZE(i, this.ZN.isSelected());
    Zm2.Zo(Zze0.COLLABORATOR_UI_PAYLOAD_ADDED_TO_CLIPBOARD);
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    this.ZQ.Zo(this.ZN.isSelected());
    Zm2.Zo(Zze0.COLLABORATOR_UI_INCLUDE_SERVER_LOCATION_TOGGLED);
  }
  
  private boolean Zh() {
    try {
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return (Integer.parseInt(this.ZO.getText().trim()) > 0);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      return false;
    } 
  }
  
  public void ZL(List<Zzem> paramList) {
    this.ZR.Zl(paramList);
  }
  
  public void ZG() {
    this.Z_ = true;
    this.Zq.setEnabled(true);
    this.ZD.setVisible(true);
  }
  
  public void updateUI() {
    try {
      if (this.ZT != null)
        this.ZT.Zh(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private void lambda$createInteractionsTable$0(Integer paramInteger) {
    this.ZR.fireTableRowsUpdated(paramInteger.intValue(), paramInteger.intValue());
  }
  
  public static void Zn(int paramInt) {
    Zs = paramInt;
  }
  
  public static int ZD() {
    return Zs;
  }
  
  public static int ZX() {
    int i = ZD();
    try {
      if (i == 0)
        return 121; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: bipush #107
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc 'Ô@g\\nDJL^\\bÁ\\fck[Ý§2va)HýI¥Â¹Xäy¯.'iønË}x^ÐL§»§1,çõæÑývcîdÿEñÙºû3_­Á\\fõT,¤^H©\\bß¯Wª$GQ ³û(þYy+>%\\fí6î[ä)P4ÜBü*Þºqé!:FÕ+ufÚÑKWþ\\tîòö>M:Û2óß\\t¬NVvblûÐì/z8\z!«h3qxÐÒé¥§¡ÜÉÌñV=¾ºÇ:x­ÌKS3p`´­Òñ~Øw¶ÜTÀþÖÌx[ë³mÐG6ñ¯JI¶âm´âzÓn¤ùâ¬A¦\\t.ýÃT~ÅÓüý"ÚÝýÕ1Ï¸qN/Ï_,HÞäªuMï¶êT*|ª§íáå!të\\t¬=à»æm6ÉÍÜH«¬bÎ^ß/É"Ña*É¥wyí¹ÿa·q?Z©?ãÞvLÓl¾.CMy©>Nu%Þ\\fÅ6ë[¥ø7³½¯8>Í®Õ½NW\\r[~gÊÔû«1÷ÆF°\\n\vfuCÜøÏMö¸]lav'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic Zn : (I)V
    //   23: bipush #61
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #66
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
    //   73: ldc 'ç`\\flL\\rL±íx/¡´tã«[3õÃÞ½WsHt\\rº.ÝTÍ\ Ú'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #35
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #125
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
    //   134: putstatic burp/Zbq5.a : [Ljava/lang/String;
    //   137: bipush #19
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zbq5.b : [Ljava/lang/String;
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
    //   216: bipush #113
    //   218: goto -> 248
    //   221: bipush #73
    //   223: goto -> 248
    //   226: bipush #111
    //   228: goto -> 248
    //   231: bipush #117
    //   233: goto -> 248
    //   236: bipush #114
    //   238: goto -> 248
    //   241: bipush #127
    //   243: goto -> 248
    //   246: bipush #123
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
    int i = (paramInt1 ^ 0x57D5) & 0xFFFF;
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
      byte b1 = 89;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbq5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */