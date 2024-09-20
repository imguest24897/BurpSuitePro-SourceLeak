package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JPopupMenu;

public class Zg1v {
  private final Zerx Zm;
  
  private final Zrtw Zg;
  
  private final Zrtw Zi;
  
  private final Ze01 ZR;
  
  private Zkj9 Za;
  
  private Ze01 Zd;
  
  private Zsuy ZJ;
  
  private Zsuy Zk;
  
  private Zsuy ZY;
  
  private Zsuy ZK;
  
  private Zsuy ZZ;
  
  private Zsuy Zh;
  
  private Zsuy ZE;
  
  private Zsuy ZG;
  
  private Zsuy Zy;
  
  private Ze7h Zl;
  
  private Ze7h Zz;
  
  private Ze7h ZV;
  
  private Ze7h ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg1v(Zerx paramZerx, Zmjz paramZmjz, Ze01 paramZe01) {
    this.Zm = paramZerx;
    this.ZR = paramZe01;
    this.Zg = paramZmjz.ZT();
    this.Zi = paramZmjz.Zv();
  }
  
  public void ZQ() {
    if (!this.Zm.Zgn())
      ZU(); 
    this.Za = new Zkj9();
    this.Za.ZE(Zlkk.PANEL_BACKGROUND);
    Zz();
    ZZ();
    this.Za.show(this.ZR.getParent(), this.ZR.getX(), this.ZR.getY() + this.ZR.getHeight());
  }
  
  private void Zz() {
    GridBagLayout gridBagLayout = new GridBagLayout();
    Zbqc zbqc = new Zbqc(gridBagLayout);
    Zm99 zm99 = new Zm99(a(-32228, -2665));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.insets = new Insets(5, 10, 5, 25);
    gridBagConstraints.anchor = 17;
    zbqc.add(zm99, gridBagConstraints);
    this.Zd = new Ze01(a(-32232, 28422));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.insets = new Insets(5, 25, 5, 10);
    gridBagConstraints.anchor = 13;
    zbqc.add(this.Zd, gridBagConstraints);
    this.Zd.setEnabled(this.Zm.Zgn());
    this.Zd.setName(a(-32252, 14111));
    this.Zd.addActionListener(this::lambda$buildPopupMenuHeader$0);
    this.Za.add(zbqc);
    this.Za.add(new JPopupMenu.Separator());
  }
  
  private void ZZ() {
    Zq();
    Zztv zztv = ZR();
    ZP(zztv);
  }
  
  private void Zq() {
    this.ZJ = new Zsuy(a(-32242, 7806), this.Zi.Zsl(), false);
    this.ZJ.setName(a(-32248, -18391));
    this.ZJ.addActionListener(this::lambda$buildConfigurationMenuItems$1);
    this.Zk = new Zsuy(a(-32253, 31853), this.Zi.ZsR(), false);
    this.Zk.setName(a(-32256, 15450));
    this.Zk.addActionListener(this::lambda$buildConfigurationMenuItems$2);
    this.ZY = new Zsuy(a(-32239, 8052), this.Zi.ZTk(), false);
    this.ZY.setName(a(-32240, -26493));
    this.ZY.addActionListener(this::lambda$buildConfigurationMenuItems$3);
    this.ZK = new Zsuy(a(-32236, -11896), this.Zi.ZTD(), false);
    this.ZK.setName(a(-32233, 22337));
    this.ZK.addActionListener(this::lambda$buildConfigurationMenuItems$4);
    this.ZZ = new Zsuy(a(-32255, -2139), this.Zi.Zsw(), false);
    this.ZZ.setName(a(-32243, -14672));
    this.ZZ.addActionListener(this::lambda$buildConfigurationMenuItems$5);
    this.Zh = new Zsuy(a(-32245, -28938), this.Zi.Zuq(), false);
    this.Zh.setName(a(-32250, -23409));
    this.Zh.addActionListener(this::lambda$buildConfigurationMenuItems$6);
    this.ZE = new Zsuy(a(-32251, -4482), this.Zi.Zu8(), false);
    this.ZE.setName(a(-32241, 32145));
    this.ZE.addActionListener(this::lambda$buildConfigurationMenuItems$7);
    this.ZG = new Zsuy(a(-32230, 7100), this.Zi.Zs2(), false);
    this.ZG.setName(a(-32225, 9836));
    this.ZG.addActionListener(this::lambda$buildConfigurationMenuItems$8);
    this.Zy = new Zsuy(a(-32234, 25909), this.Zi.ZuU(), false);
    this.Zy.setName(a(-32244, 4842));
    this.Zy.addActionListener(this::lambda$buildConfigurationMenuItems$9);
  }
  
  private Zztv ZR() {
    Zztv zztv = new Zztv(a(-32249, 26597));
    zztv.setName(a(-32235, -18936));
    this.Zl = new Ze7h(a(-32254, 27985), false);
    this.Zl.setName(a(-32237, -8984));
    this.Zl.addActionListener(this::lambda$buildRedirectionsSubMenu$10);
    this.Zz = new Ze7h(a(-32229, -10316), false);
    this.Zz.setName(a(-32238, -25480));
    this.Zz.addActionListener(this::lambda$buildRedirectionsSubMenu$11);
    this.ZV = new Ze7h(a(-32247, -9836), false);
    this.ZV.setName(a(-32226, 32726));
    this.ZV.addActionListener(this::lambda$buildRedirectionsSubMenu$12);
    this.ZF = new Ze7h(a(-32246, 29847), false);
    this.ZF.setName(a(-32231, 21384));
    this.ZF.addActionListener(this::lambda$buildRedirectionsSubMenu$13);
    Zl();
    return zztv;
  }
  
  private void ZP(Zztv paramZztv) {
    this.Za.add(this.ZJ);
    this.Za.add(this.Zk);
    this.Za.add(paramZztv);
    this.Za.add(this.ZY);
    this.Za.add(this.ZK);
    this.Za.add(this.ZZ);
    this.Za.add(this.Zh);
    this.Za.add(this.ZE);
    this.Za.add(this.ZG);
    this.Za.add(this.Zy);
    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(this.Zl);
    buttonGroup.add(this.Zz);
    buttonGroup.add(this.ZV);
    buttonGroup.add(this.ZF);
    paramZztv.add(this.Zl);
    paramZztv.add(this.Zz);
    paramZztv.add(this.ZV);
    paramZztv.add(this.ZF);
  }
  
  private void Zg() {
    this.ZJ.setSelected(this.Zi.Zsl());
    this.Zk.setSelected(this.Zi.ZsR());
    this.ZY.setSelected(this.Zi.ZTk());
    this.ZK.setSelected(this.Zi.ZTD());
    this.ZZ.setSelected(this.Zi.Zsw());
    this.Zh.setSelected(this.Zi.Zuq());
    this.ZE.setSelected(this.Zi.Zu8());
    this.ZG.setSelected(this.Zi.Zs2());
    this.Zy.setSelected(this.Zi.ZuU());
    Zl();
  }
  
  private void Zl() {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zi : Lburp/Zrtw;
    //   8: invokeinterface ZTQ : ()I
    //   13: tableswitch default -> 88, 0 -> 44, 1 -> 56, 2 -> 68, 3 -> 80
    //   44: aload_0
    //   45: getfield Zl : Lburp/Ze7h;
    //   48: iconst_1
    //   49: invokevirtual setSelected : (Z)V
    //   52: iload_1
    //   53: ifeq -> 88
    //   56: aload_0
    //   57: getfield Zz : Lburp/Ze7h;
    //   60: iconst_1
    //   61: invokevirtual setSelected : (Z)V
    //   64: iload_1
    //   65: ifeq -> 88
    //   68: aload_0
    //   69: getfield ZV : Lburp/Ze7h;
    //   72: iconst_1
    //   73: invokevirtual setSelected : (Z)V
    //   76: iload_1
    //   77: ifeq -> 88
    //   80: aload_0
    //   81: getfield ZF : Lburp/Ze7h;
    //   84: iconst_1
    //   85: invokevirtual setSelected : (Z)V
    //   88: return
  }
  
  private void ZU() {
    this.Zi.ZAA(this.Zg.Zsl());
    this.Zi.ZAE(this.Zg.ZsR());
    this.Zi.Zis(this.Zg.ZTQ());
    this.Zi.ZYF(this.Zg.ZTk());
    this.Zi.ZYk(this.Zg.ZTD());
    this.Zi.ZAe(this.Zg.Zsw());
    this.Zi.Zej(this.Zg.Zuq());
    this.Zi.Zef(this.Zg.Zu8());
    this.Zi.ZAl(this.Zg.Zs2());
    this.Zi.ZeE(this.Zg.ZuU());
  }
  
  private void Zy() {
    this.Zm.ZXX(true);
    this.Zd.setEnabled(true);
    this.ZR.Zj(Zlkk.REPEATER_CONFIGURATION_BUTTON_BACKGROUND_ACTIVE);
    this.ZR.setIcon(Ze3m.ZC(Zeuf.SETTINGS, Zlkk.REPEATER_CONFIGURATION_BUTTON_ICON_ACTIVE).ZU(Zmcx.LARGE_LINE_SIZE).Z_());
  }
  
  private void Zi() {
    ZU();
    this.Zm.ZXX(false);
    this.Zd.setEnabled(false);
    this.ZR.Zj(Zlkk.REPEATER_CONFIGURATION_BUTTON_BACKGROUND);
    this.ZR.setIcon(Ze3m.ZC(Zeuf.SETTINGS, Zlkk.REPEATER_CONFIGURATION_BUTTON_ICON).ZU(Zmcx.LARGE_LINE_SIZE).Z_());
    Zg();
  }
  
  private void lambda$buildRedirectionsSubMenu$13(ActionEvent paramActionEvent) {
    this.Zi.Zis(3);
    Zy();
  }
  
  private void lambda$buildRedirectionsSubMenu$12(ActionEvent paramActionEvent) {
    this.Zi.Zis(2);
    Zy();
  }
  
  private void lambda$buildRedirectionsSubMenu$11(ActionEvent paramActionEvent) {
    this.Zi.Zis(1);
    Zy();
  }
  
  private void lambda$buildRedirectionsSubMenu$10(ActionEvent paramActionEvent) {
    this.Zi.Zis(0);
    Zy();
  }
  
  private void lambda$buildConfigurationMenuItems$9(ActionEvent paramActionEvent) {
    this.Zi.ZeE(this.Zy.isSelected());
    Zy();
  }
  
  private void lambda$buildConfigurationMenuItems$8(ActionEvent paramActionEvent) {
    this.Zi.ZAl(this.ZG.isSelected());
    Zy();
  }
  
  private void lambda$buildConfigurationMenuItems$7(ActionEvent paramActionEvent) {
    this.Zi.Zef(this.ZE.isSelected());
    Zy();
  }
  
  private void lambda$buildConfigurationMenuItems$6(ActionEvent paramActionEvent) {
    this.Zi.Zej(this.Zh.isSelected());
    Zy();
  }
  
  private void lambda$buildConfigurationMenuItems$5(ActionEvent paramActionEvent) {
    this.Zi.ZAe(this.ZZ.isSelected());
    Zy();
  }
  
  private void lambda$buildConfigurationMenuItems$4(ActionEvent paramActionEvent) {
    this.Zi.ZYk(this.ZK.isSelected());
    Zy();
  }
  
  private void lambda$buildConfigurationMenuItems$3(ActionEvent paramActionEvent) {
    this.Zi.ZYF(this.ZY.isSelected());
    Zy();
  }
  
  private void lambda$buildConfigurationMenuItems$2(ActionEvent paramActionEvent) {
    this.Zi.ZAE(this.Zk.isSelected());
    Zy();
  }
  
  private void lambda$buildConfigurationMenuItems$1(ActionEvent paramActionEvent) {
    this.Zi.ZAA(this.ZJ.isSelected());
    Zy();
  }
  
  private void lambda$buildPopupMenuHeader$0(ActionEvent paramActionEvent) {
    Zi();
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '0`¿ó×ât·Ç\\rÐ&øöþ0©léÊº¤ä/S ±5½}\\bkw¼ÝLÙEÓÓF\(ßüu3à¹(¾nop5:Ó:²B¨ywó+â­H7»£ìÑÃG0p%Þ=9?XÒ<xÔÝ°ÿ($º@!ÙàÐ=a¶@ê½N^eÞ à½¤ÂÃCåÑ\\r=~nªX !AûVêpßJç<!<K3ÑõÑâk²>TÞN,Þ÷ a*h{ÖÐl¾µÿbüpît$ (NwYÕ3ZÎs@°¨¬ô4 A÷)`²±§®°«àªïlV¸jªÜ±#i¦KCàÛÉ¼ë~f=ØÌpÜ&UVVí´KIø7¿[ft®g^8âbÓÚ>eG9±üTS§åNWð¾çYPex<4>ÔXÌ©¶ü0}.³IÇÊðÁE\\ryõ`ëeÉÇ\\bÚÎ½õo4T6y«¨oúvq;<èkGÖYeïÚ,h^oÀ\\t}Cûñp¡jh^´4¨¬[¢sÈ(n¹7¢~7o5+3=K*6+úY¸ÓÕ«®SGXùgréÍ÷@n3tïDå*£ÚD,\\bÁ,¼å2-t96xY%o6ìëNé«ñXEÄ¯Í)Ëð§FVØVÛÜ0dð\G6c|G\\f=ÌùB bPrÑñþH:% =89çsà\\fRóÚEâ!O¿ï¾*ÀÝÝ^ÐóÆrP¿¬èç</ùñ<~{ð¨Z+ÚÖ-º°;\\bvmò3¾2.ÈiW_zÐöÍËïÛåçkëõ¸[|$çtðïfâÄ§³0Mÿ3°\\tu_uTjü¬H÷ÅÓÃkQÊ× t¸Àe¨{ÖxÜwÁßñºOGØUª\\b9Ó¢Ö:a¯>£Ìà£4#ñ¼,ýÁÏþæ¹Â±åçußâql¾Ä\\n3°ÿ=x³4XsÐñ0z8¸Va¸Û ²lj­6LH%GÖxá¶µÅîCÆõfÃ,°\\r9Èÿí4y3>K Ky} Bù¦if9t²ñ\\rè¤HLËù`éÚK1Aq#»ieGèÛ\\f7+L¾ý¥eÃw"n?Ü§ï©{»Ã9\\n·zOÆúa\\t9Mð¾5)é°^!Ç¬\\t3>n#ä¦@tqzÐ4ïs¹ñÜcIWñ m¾ì0»½É\\f¬Tiå½>â¬è®á[{\\fH^Þ}ÁûÏD_®Ü)<=Ð4Ág|70"p=iÅáG£HéÄ<4Éô©¥=aØ°ÌåÅ×÷oÚ¿ÓÜßPÊ¨>Yù´Ò,ôóOM2ËT*)O»\\t#Øê·ò«çüï&«fmPz×f§¬aöÒë«Ûjs±N0cr'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #88
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
    //   67: ldc 'QÃm1·%¸xÀµ\\fC"¡ðÐX"e¦ØB± Õaëçrù`Õ¾8[ûaxî0\\nc`G\\rÑg}3%e ¬¾Kv!Qd¼æõ½ÊL.M°'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #58
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #103
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
    //   128: putstatic burp/Zg1v.a : [Ljava/lang/String;
    //   131: bipush #31
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zg1v.b : [Ljava/lang/String;
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
    //   212: bipush #101
    //   214: goto -> 244
    //   217: bipush #99
    //   219: goto -> 244
    //   222: bipush #104
    //   224: goto -> 244
    //   227: bipush #12
    //   229: goto -> 244
    //   232: bipush #107
    //   234: goto -> 244
    //   237: bipush #43
    //   239: goto -> 244
    //   242: bipush #40
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8202) & 0xFFFF;
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
      byte b1 = 91;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */