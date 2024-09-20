package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zbta extends Zbqc implements Zspz {
  private final TitledBorder ZB;
  
  private final TitledBorder ZJ;
  
  private final TitledBorder Zd;
  
  private final Zvoc Zc;
  
  private final Runnable Z_;
  
  private Zb07 ZK;
  
  private boolean ZN;
  
  private Zbqc ZQ;
  
  private Zm2o Zr;
  
  private Zzdy Zi;
  
  private Zzdy Zg;
  
  private Zzdy Zf;
  
  private Zzdy ZF;
  
  private Zzdy Zw;
  
  private Zzdy Zu;
  
  private Zzdy ZC;
  
  private Zzdy ZE;
  
  private Zzdy ZH;
  
  private Ze0q ZY;
  
  private Ze01 ZS;
  
  private Ze01 ZP;
  
  private Ze01 Zy;
  
  private Ze01 Zb;
  
  private Zbqc ZI;
  
  private Zbqc ZX;
  
  private Zbqc ZL;
  
  private Zbqc Zl;
  
  private Zm9v ZW;
  
  private Zbqc Zn;
  
  private Zgff ZU;
  
  private static String[] Zv;
  
  private static final String[] a;
  
  private static final String[] c;
  
  public Zbta(Zvoc paramZvoc, Runnable paramRunnable) {
    this.Zc = paramZvoc;
    this.Z_ = paramRunnable;
    ZkN();
    this.ZW.setVisible(false);
    Zkz();
    String[] arrayOfString = Zki();
    try {
      this.ZB = (TitledBorder)this.Zn.getBorder();
      this.ZJ = (TitledBorder)this.ZL.getBorder();
      this.Zd = (TitledBorder)this.ZX.getBorder();
      if (arrayOfString != null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void updateUI() {
    super.updateUI();
    Arrays.<Component>stream(getComponents()).forEach(SwingUtilities::updateComponentTreeUI);
    String[] arrayOfString = Zki();
    try {
      if (this.ZB != null) {
        this.ZB.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZJ.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zd.setTitleFont(Zt00.DEFAULT_FONT.ZV());
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (Zbqc.Zwu() == null)
        ZE(new String[1]); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void Zq(Zb07 paramZb07) {
    this.ZK = paramZb07;
  }
  
  public JComponent Zlj() {
    return this;
  }
  
  public void ZlQ() {}
  
  public void Zlt() {
    Zj((ActionEvent)null);
  }
  
  public void Zlm() {
    Zq((ActionEvent)null);
  }
  
  private void ZkX() {
    Zkz();
    this.ZN = false;
  }
  
  private void ZkM() {
    try {
      if (!this.ZN)
        return; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZW.setVisible(false);
    String str1 = this.ZU.getText();
    byte[] arrayOfByte = null;
    Pattern pattern = null;
    try {
      if (!str1.isEmpty())
        if (this.Zf.isSelected()) {
          try {
            try {
            
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            pattern = Pattern.compile(str1, 0x20 | (this.Zi.isSelected() ? 0 : 2));
          } catch (PatternSyntaxException patternSyntaxException) {
            Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
            this.ZW.setVisible(true);
            return;
          } 
        } else {
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          arrayOfByte = this.Zi.isSelected() ? Zkb.Zy(str1) : Zkb.Zy(str1.toLowerCase());
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    String str2 = (pattern == null) ? null : pattern.pattern();
    Zt(arrayOfByte, str2);
    this.ZN = false;
  }
  
  private void Zt(byte[] paramArrayOfbyte, String paramString) {
    Zlee zlee = this.Zc.Zc();
    zlee.Z_F(this.Zu.isSelected());
    zlee.Z_w(this.ZC.isSelected());
    zlee.Z_A(this.ZE.isSelected());
    zlee.Z_x(this.ZH.isSelected());
    zlee.ZM(paramArrayOfbyte);
    zlee.Z_o(this.Zi.isSelected());
    zlee.ZaU(paramString);
    zlee.Z_a(this.Zg.isSelected());
    zlee.Z_5(this.ZF.isSelected());
    zlee.Z_s(this.Zw.isSelected());
  }
  
  public void Zkz() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zc : Lburp/Zvoc;
    //   4: invokevirtual Zc : ()Lburp/Zlee;
    //   7: astore_1
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zbta;Lburp/Zlee;)Ljava/lang/Runnable;
    //   15: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   18: return
  }
  
  private void ZkN() {
    this.Zr = new Zm2o();
    this.Zl = new Zbqc();
    this.ZL = new Zbqc();
    this.Zu = new Zzdy();
    this.ZC = new Zzdy();
    this.ZE = new Zzdy();
    this.ZH = new Zzdy();
    this.Zn = new Zbqc();
    this.ZU = new Zgff();
    this.Zf = new Zzdy();
    this.Zi = new Zzdy();
    this.ZW = new Zm9v();
    this.Zg = new Zzdy();
    this.ZX = new Zbqc();
    this.ZF = new Zzdy();
    this.Zw = new Zzdy();
    this.ZI = new Zbqc();
    this.Zy = new Ze01();
    this.Zb = new Ze01();
    this.ZP = new Ze01();
    this.ZQ = new Zbqc();
    this.ZS = new Ze01();
    this.ZY = new Ze0q();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 10, 0 };
    setLayout(gridBagLayout1);
    this.Zr.Zi(Zk97.DESKTOP_TOOLS_INTRUDER_ATTACKS_INTRUDER_ATTACKS_DISPLAY_FILTER);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zr, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.Zl.setLayout(gridBagLayout2);
    this.ZL.setBorder(BorderFactory.createTitledBorder(a(-31682, 21262)));
    this.ZL.setLayout(new GridLayout(4, 0, 0, 5));
    this.Zu.setSelected(true);
    this.Zu.setText(a(-31693, -8789));
    this.Zu.addActionListener(new Zkv1(this));
    this.ZL.add(this.Zu);
    this.ZC.setSelected(true);
    this.ZC.setText(a(-31685, -31665));
    this.ZC.addActionListener(new Zdw(this));
    this.ZL.add(this.ZC);
    this.ZE.setSelected(true);
    this.ZE.setText(a(-31687, 11252));
    this.ZE.addActionListener(new Zx89(this));
    this.ZL.add(this.ZE);
    this.ZH.setSelected(true);
    this.ZH.setText(a(-31692, -13264));
    this.ZH.addActionListener(new Zzyc(this));
    this.ZL.add(this.ZH);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.Zl.add(this.ZL, gridBagConstraints);
    this.Zn.setBorder(BorderFactory.createTitledBorder(a(-31694, 6268)));
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout3.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.Zn.setLayout(gridBagLayout3);
    this.ZU.setColumns(20);
    this.ZU.ZH(Zlw9.SEARCH_TERM);
    this.ZU.addKeyListener(new Zmoc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.Zn.add(this.ZU, gridBagConstraints);
    this.Zf.setText(a(-31708, 1918));
    this.Zf.addActionListener(new Ztj7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zn.add(this.Zf, gridBagConstraints);
    this.Zi.setText(a(-31690, -31055));
    this.Zi.addActionListener(new Zzvt(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    this.Zn.add(this.Zi, gridBagConstraints);
    this.ZW.setHorizontalAlignment(4);
    this.ZW.setText(a(-31695, 27043));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1536;
    this.Zn.add(this.ZW, gridBagConstraints);
    this.Zg.setText(a(-31691, 15784));
    this.Zg.addActionListener(new Zlyz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weightx = 1.0D;
    this.Zn.add(this.Zg, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.Zl.add(this.Zn, gridBagConstraints);
    this.ZX.setBorder(BorderFactory.createTitledBorder(a(-31689, 29307)));
    this.ZX.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout4 = new GridBagLayout();
    gridBagLayout4.columnWidths = new int[] { 0 };
    gridBagLayout4.rowHeights = new int[] { 0, 5, 0 };
    this.ZX.setLayout(gridBagLayout4);
    this.ZF.setText(a(-31684, -32357));
    this.ZF.addActionListener(new Zr68(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.ZX.add(this.ZF, gridBagConstraints);
    this.Zw.setText(a(-31686, -24996));
    this.Zw.addActionListener(new Zmfx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    this.ZX.add(this.Zw, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.Zl.add(this.ZX, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zl, gridBagConstraints);
    GridBagLayout gridBagLayout5 = new GridBagLayout();
    gridBagLayout5.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout5.rowHeights = new int[] { 0 };
    this.ZI.setLayout(gridBagLayout5);
    this.Zy.setText(a(-31707, -9011));
    this.Zy.addActionListener(new Zsxx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.ZI.add(this.Zy, gridBagConstraints);
    this.Zb.setText(a(-31688, -28793));
    this.Zb.addActionListener(new Zkbc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.ZI.add(this.Zb, gridBagConstraints);
    this.ZP.setText(a(-31696, -20465));
    this.ZP.addActionListener(new Zmnn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.ZI.add(this.ZP, gridBagConstraints);
    this.ZQ.setLayout(new GridLayout(1, 0, 5, 0));
    this.ZS.setText(a(-31681, -16962));
    this.ZS.addActionListener(new Zeep(this));
    this.ZQ.add(this.ZS);
    this.ZY.setText(a(-31683, 16353));
    this.ZY.addActionListener(new Zmam(this));
    this.ZQ.add(this.ZY);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.weightx = 1.0D;
    this.ZI.add(this.ZQ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZI, gridBagConstraints);
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    this.ZN = true;
  }
  
  private void ZV(boolean paramBoolean) {
    try {
      this.Zu.setSelected(paramBoolean);
      this.ZC.setSelected(paramBoolean);
      this.ZE.setSelected(paramBoolean);
      this.ZH.setSelected(paramBoolean);
      if (paramBoolean) {
        this.ZU.setText("");
        this.ZF.setSelected(false);
        this.Zw.setSelected(false);
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void ZkQ() {
    Zm2.Zo(Zze0.INTRUDER_ATTACK_FILTER_APPLIED);
    ZkM();
    this.ZK.Zgf();
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    ZV(true);
    ZT((ActionEvent)null);
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    ZV(false);
    ZT((ActionEvent)null);
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    ZT((ActionEvent)null);
    this.ZW.setVisible(false);
    if (this.Zf.isSelected())
      try {
        Pattern.compile(this.ZU.getText());
      } catch (PatternSyntaxException patternSyntaxException) {
        Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
        this.ZW.setVisible(true);
      }  
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    ZT(paramActionEvent);
  }
  
  private void Z_(ActionEvent paramActionEvent) {
    ZT(paramActionEvent);
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    ZT(paramActionEvent);
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    ZT(paramActionEvent);
  }
  
  private void Zq(ActionEvent paramActionEvent) {
    this.ZK.Zgf();
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    ZkQ();
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    ZkX();
  }
  
  private void ZK(KeyEvent paramKeyEvent) {
    ZT((ActionEvent)null);
    this.ZW.setVisible(false);
    if (this.Zf.isSelected())
      try {
        Pattern.compile(this.ZU.getText());
      } catch (PatternSyntaxException patternSyntaxException) {
        Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
        this.ZW.setVisible(true);
      }  
  }
  
  private void lambda$resetFilterFieldsFromCurrentState$0(Zlee paramZlee) {
    this.Zu.setSelected(paramZlee.ZdS());
    this.ZC.setSelected(paramZlee.Zd9());
    this.ZE.setSelected(paramZlee.Zdc());
    this.ZH.setSelected(paramZlee.ZdX());
    this.ZU.setText(paramZlee.ZdN());
    this.Zi.setSelected(paramZlee.ZdK());
    this.Zg.setSelected(paramZlee.ZdB());
    this.ZF.setSelected(paramZlee.ZdW());
    this.Zw.setSelected(paramZlee.ZdU());
  }
  
  public static void ZE(String[] paramArrayOfString) {
    Zv = paramArrayOfString;
  }
  
  public static String[] Zki() {
    return Zv;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc '$¶xÑ\\bi.¤hä#x_f\\b$Ý'MTVg!äk}Èt\pðC`Hó<í/\\nõ¶úQö×<õ+\\rï¸÷zP};vN=¤B:¤5Yj²ò"\\bÓhWd\\ttì*XC§òw qê° õî¬W®Ú¼C)S»zôãn1(û!ùR}¨ccûëËÚ²¥ÌçÀ}¤ÚuÝ1E¸õôP»zMÊ¾£æ\\t>¥Làô>Fc+NnìùT\\bÔó£ðÆ $=§\\fÿèõH<Îjkvc&¯}ñÆãIK=ñý%³!`XóGð²'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #15
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZE : ([Ljava/lang/String;)V
    //   27: bipush #118
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'VËdê)êò}ý÷2'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #8
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #124
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zbta.a : [Ljava/lang/String;
    //   136: bipush #18
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zbta.c : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 262
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 244, 0 -> 216, 1 -> 221, 2 -> 225, 3 -> 229, 4 -> 234, 5 -> 239
    //   216: bipush #13
    //   218: goto -> 246
    //   221: iconst_3
    //   222: goto -> 246
    //   225: iconst_5
    //   226: goto -> 246
    //   229: bipush #119
    //   231: goto -> 246
    //   234: bipush #98
    //   236: goto -> 246
    //   239: bipush #64
    //   241: goto -> 246
    //   244: bipush #64
    //   246: ixor
    //   247: ixor
    //   248: i2c
    //   249: castore
    //   250: iinc #6, 1
    //   253: dup
    //   254: ifne -> 262
    //   257: dup2
    //   258: dup_x1
    //   259: goto -> 170
    //   262: dup2_x1
    //   263: pop2
    //   264: dup_x2
    //   265: iload #6
    //   267: if_icmpgt -> 166
    //   270: pop
    //   271: new java/lang/String
    //   274: dup_x1
    //   275: swap
    //   276: invokespecial <init> : ([C)V
    //   279: invokevirtual intern : ()Ljava/lang/String;
    //   282: swap
    //   283: pop
    //   284: swap
    //   285: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8435) & 0xFFFF;
    if (c[i] == null) {
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
      char c = 'ð';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbta.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */