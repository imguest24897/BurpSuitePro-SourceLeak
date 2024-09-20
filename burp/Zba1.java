package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.text.AbstractDocument;

public class Zba1 extends Zbv5 implements Zt3u, Zgdq {
  private static final Integer ZT;
  
  private final Zs53 Zc;
  
  private final Zmg2 ZU;
  
  private final Zm9v ZY;
  
  private final Zgfo ZE;
  
  private final Zmg2 ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zba1(Zs53 paramZs53) {
    this.Zc = paramZs53;
    this.ZU = new Zmg2();
    this.ZS = new Zmg2();
    this.ZY = new Zm9v();
    this.ZE = new Zgfo();
    ZQ(this.ZS, this.ZU, this.ZE, this.ZY);
    ZF(this.ZS, this.ZU, this.ZE, this.ZY);
  }
  
  public void ZZ() {
    Stream<JComponent> stream = Stream.of(new JComponent[] { this.ZU, this.ZS, this.ZE });
    stream.forEach(Zba1::lambda$disableConfig$1);
  }
  
  public String Zjd() {
    return a(30595, -31685);
  }
  
  public String ZjS() {
    return a(30605, 5426);
  }
  
  public Component ZjY() {
    Zbkk zbkk = new Zbkk();
    zbkk.ZB(Zk97.CONFIGURE_JVM_RAM_USAGE, this, Zjd().toLowerCase(Locale.ENGLISH));
    return zbkk;
  }
  
  public Collection<String> ZjD() {
    return Set.of(a(30594, -776), a(30601, -11862), a(30592, -31607), a(30600, 24342), a(30604, 12298), a(30596, 31659), a(30606, 30508), a(30607, 12438));
  }
  
  public void Zt2() {}
  
  public void ZNH() {
    this.Zc.ZNH();
    this.ZU.setSelected(true);
    this.ZE.setEnabled(false);
    this.ZY.setText("");
  }
  
  private void ZF(Zmg2 paramZmg21, Zmg2 paramZmg22, Zgfo paramZgfo, Zm9v paramZm9v) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicBoolean
    //   3: dup
    //   4: iconst_1
    //   5: invokespecial <init> : (Z)V
    //   8: astore #5
    //   10: aload_3
    //   11: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   16: aload_0
    //   17: aload #5
    //   19: aload_3
    //   20: aload #4
    //   22: <illegal opcode> accept : (Lburp/Zba1;Ljava/util/concurrent/atomic/AtomicBoolean;Lburp/Zgfo;Lburp/Zm9v;)Ljava/util/function/Consumer;
    //   27: sipush #256
    //   30: getstatic burp/Zba1.ZT : Ljava/lang/Integer;
    //   33: invokevirtual intValue : ()I
    //   36: invokevirtual Zu : (Ljava/util/function/Consumer;Ljava/util/function/Consumer;II)V
    //   39: aload_1
    //   40: aload #5
    //   42: aload_3
    //   43: aload #4
    //   45: aload_0
    //   46: getfield Zc : Lburp/Zs53;
    //   49: invokestatic ZH : (Ljava/util/concurrent/atomic/AtomicBoolean;Lburp/Zgfo;Lburp/Zm99;Lburp/Zs53;)Ljava/awt/event/ActionListener;
    //   52: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   55: aload_2
    //   56: aload_3
    //   57: aload #4
    //   59: aload_0
    //   60: getfield Zc : Lburp/Zs53;
    //   63: invokestatic ZL : (Lburp/Zgfo;Lburp/Zm99;Lburp/Zs53;)Ljava/awt/event/ActionListener;
    //   66: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   69: aload_3
    //   70: new burp/Zkab
    //   73: dup
    //   74: aload_0
    //   75: aload #5
    //   77: aload_3
    //   78: invokespecial <init> : (Lburp/Zba1;Ljava/util/concurrent/atomic/AtomicBoolean;Lburp/Zgfo;)V
    //   81: invokevirtual addKeyListener : (Ljava/awt/event/KeyListener;)V
    //   84: aload_1
    //   85: invokevirtual isSelected : ()Z
    //   88: ifeq -> 103
    //   91: aload #4
    //   93: aload_3
    //   94: invokevirtual ZE : ()I
    //   97: invokestatic Z_ : (I)Ljava/lang/String;
    //   100: invokevirtual setText : (Ljava/lang/String;)V
    //   103: return
  }
  
  private static String Z_(int paramInt) {
    return (paramInt < 256) ? a(30603, 12539) : ((paramInt < 2000) ? a(30599, -6322) : ((paramInt > ZT.intValue()) ? a(30593, -22757) : ""));
  }
  
  private void ZQ(Zmg2 paramZmg21, Zmg2 paramZmg22, Zgfo paramZgfo, Zm9v paramZm9v) {
    ButtonGroup buttonGroup = new ButtonGroup();
    paramZmg22.setText(a(30598, 26383));
    paramZmg22.setSelected(this.Zc.ZT());
    paramZmg21.setText(a(30597, -20854));
    paramZmg21.setSelected(!this.Zc.ZT());
    buttonGroup.add(paramZmg22);
    buttonGroup.add(paramZmg21);
    paramZgfo.ZM(this.Zc.Zf().orElse(ZR()));
    paramZgfo.setColumns(8);
    paramZgfo.setEnabled(!this.Zc.ZT());
    ((AbstractDocument)paramZgfo.getDocument()).setDocumentFilter(new Ze1e());
    Zm99 zm99 = new Zm99(a(30602, -25681));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 10, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 17;
    add(paramZgfo, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 17;
    add(zm99, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 17;
    add(paramZmg22, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 17;
    add(paramZmg21, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 17;
    gridBagConstraints.weightx = 1.0D;
    add(paramZm9v, gridBagConstraints);
  }
  
  private static ActionListener ZH(AtomicBoolean paramAtomicBoolean, Zgfo paramZgfo, Zm99 paramZm99, Zs53 paramZs53) {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: aload_0
    //   3: aload_3
    //   4: <illegal opcode> actionPerformed : (Lburp/Zgfo;Lburp/Zm99;Ljava/util/concurrent/atomic/AtomicBoolean;Lburp/Zs53;)Ljava/awt/event/ActionListener;
    //   9: areturn
  }
  
  private static ActionListener ZL(Zgfo paramZgfo, Zm99 paramZm99, Zs53 paramZs53) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: <illegal opcode> actionPerformed : (Lburp/Zgfo;Lburp/Zm99;Lburp/Zs53;)Ljava/awt/event/ActionListener;
    //   8: areturn
  }
  
  private static int ZR() {
    return (int)(Runtime.getRuntime().maxMemory() / 1048576L);
  }
  
  private static void lambda$getDefaultsRadioButtonActionListener$5(Zgfo paramZgfo, Zm99 paramZm99, Zs53 paramZs53, ActionEvent paramActionEvent) {
    paramZgfo.setEnabled(false);
    paramZm99.setText("");
    paramZs53.ZNH();
  }
  
  private static void lambda$getCustomRadioButtonActionListener$4(Zgfo paramZgfo, Zm99 paramZm99, AtomicBoolean paramAtomicBoolean, Zs53 paramZs53, ActionEvent paramActionEvent) {
    paramZgfo.setEnabled(true);
    paramZm99.setText(Z_(paramZgfo.ZE()));
    if (paramAtomicBoolean.get())
      paramZs53.ZJ(paramZgfo.ZE()); 
  }
  
  private void lambda$attachBehaviourListeners$3(AtomicBoolean paramAtomicBoolean, Zgfo paramZgfo, Zm9v paramZm9v, Boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_1
    //   6: aload #4
    //   8: invokevirtual booleanValue : ()Z
    //   11: invokevirtual set : (Z)V
    //   14: aload #4
    //   16: invokevirtual booleanValue : ()Z
    //   19: ifeq -> 38
    //   22: aload_0
    //   23: getfield Zc : Lburp/Zs53;
    //   26: aload_2
    //   27: invokevirtual ZE : ()I
    //   30: invokevirtual ZJ : (I)V
    //   33: aload #5
    //   35: ifnonnull -> 45
    //   38: aload_0
    //   39: getfield Zc : Lburp/Zs53;
    //   42: invokevirtual ZNH : ()V
    //   45: aload_3
    //   46: aload_2
    //   47: invokevirtual ZE : ()I
    //   50: invokestatic Z_ : (I)Ljava/lang/String;
    //   53: invokevirtual setText : (Ljava/lang/String;)V
    //   56: return
  }
  
  private static void lambda$attachBehaviourListeners$2(Integer paramInteger) {}
  
  private static void lambda$disableConfig$1(JComponent paramJComponent) {
    paramJComponent.setEnabled(false);
  }
  
  private static Integer lambda$static$0(Long paramLong) {
    return Integer.valueOf((int)(paramLong.longValue() / 1024L / 1024L));
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'å'vÀibü'\\fÿÅÎdYp9`ã9ku{äAæÆ}«¯öÆ`ÎjGÁ%@×gI¿§J`¦£\\tÀ¿NNºÃ­höÂL+ª¸/Xêf»î]UæÄ&ÊÐ©F*ü=WÝÝkT÷i©¦è§U¡eõæk2¯{¸s×¹ú (ÿ~\\b³TÝÏF±].$(Ë(?\ÅQºWR{\\nmu?!û£¹iÖÇR>ï·{ha9Sw%G>}P+9fê'é9Â=bë'µÅ[òÁ!/Õ¶¡)¤=öB¼ftQLè"¨KíîglU£¹ö÷3¦\\r=þu\¶ÎÔs\\fXhïÑõ#\\rôÜ~vg}å(WC/G,cçbx^z¨Û[D\\tæäK;\\r/ûJÚ¡Q½ò@Æ¸ÒÝæÖ©uÛ=èj3Î)>RÎ*àJ¢T51'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #40
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
    //   68: ldc 'æ;ZÄàsÙN¸¦Û·Óÿ\\tû>L×î'þ y¾áýIBlÆòßÛ´Xñà»6ÍÐOT¬×oõ\øÈà1ø©'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #63
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
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
    //   129: putstatic burp/Zba1.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zba1.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #119
    //   214: goto -> 243
    //   217: bipush #14
    //   219: goto -> 243
    //   222: iconst_5
    //   223: goto -> 243
    //   226: bipush #103
    //   228: goto -> 243
    //   231: bipush #121
    //   233: goto -> 243
    //   236: bipush #99
    //   238: goto -> 243
    //   241: bipush #60
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
    //   300: getstatic burp/Zl_6.TOTAL_PHYSICAL_MEMORY_SIZE : Lburp/Zl_6;
    //   303: invokestatic getPlatformMBeanServer : ()Ljavax/management/MBeanServer;
    //   306: invokestatic ZE : (Lburp/Zl_6;Ljavax/management/MBeanServer;)Ljava/util/Optional;
    //   309: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   314: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   317: sipush #4096
    //   320: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   323: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   326: checkcast java/lang/Integer
    //   329: putstatic burp/Zba1.ZT : Ljava/lang/Integer;
    //   332: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x778F) & 0xFFFF;
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
      char c = 'ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zba1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */