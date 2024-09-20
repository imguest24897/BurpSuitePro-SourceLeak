package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.MenuComponent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javafx.beans.property.Property;
import javax.swing.BoxLayout;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbcp extends Zbc4 {
  private final Zbqc Zd;
  
  private Zxj2 ZO;
  
  private Zeii Zc;
  
  private Zsyw Zb;
  
  private Consumer<MouseEvent> Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbcp() {
    this(new Ztk9());
  }
  
  public Zbcp(Ztk9 paramZtk9) {
    super(new BorderLayout());
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zd = new Zbqc();
    BoxLayout boxLayout = new BoxLayout(this.Zd, 1);
    this.Zd.setLayout(boxLayout);
    this.Zd.setName(a(21125, 30127));
    add(this.Zd, a(21124, 27772));
    Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    ZY(new Zr3a());
    Zc(new Zv4());
    ZU(paramZtk9);
  }
  
  public void ZQ(boolean paramBoolean) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    boolean bool = Zm99.ZQ();
    byte b = 0;
    while (b < this.ZO.ZA()) {
      this.ZO.ZE(b).Zp().setValue(Boolean.valueOf(paramBoolean));
      b++;
      if (bool)
        break; 
    } 
  }
  
  public Zxj2 Zz() {
    return this.ZO;
  }
  
  public void ZU(Zxj2 paramZxj2) {
    // Byte code:
    //   0: invokestatic isDispatchThread : ()Z
    //   3: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   6: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   9: aload_0
    //   10: aload_1
    //   11: putfield ZO : Lburp/Zxj2;
    //   14: aload_1
    //   15: aload_0
    //   16: aload_1
    //   17: <illegal opcode> ZB : (Lburp/Zbcp;Lburp/Zxj2;)Lburp/Zsm4;
    //   22: invokeinterface Zt : (Lburp/Zsm4;)V
    //   27: aload_0
    //   28: invokevirtual ZM : ()V
    //   31: return
  }
  
  public void ZY(Zeii paramZeii) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zc = paramZeii;
    ZM();
  }
  
  public void ZJ(Consumer<MouseEvent> paramConsumer) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zt = paramConsumer;
    boolean bool = Zm99.ZQ();
    for (Zbc1 zbc1 : ZQ()) {
      zbc1.Zd(paramConsumer);
      if (bool)
        break; 
    } 
    ZM();
  }
  
  public void Zc(Zsyw paramZsyw) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zb = paramZsyw;
    ZM();
  }
  
  public List<Zbc1> ZQ() {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    ArrayList<Zbc1> arrayList = new ArrayList();
    Component[] arrayOfComponent = this.Zd.getComponents();
    int i = arrayOfComponent.length;
    boolean bool = Zm99.ZM();
    byte b = 0;
    while (b < i) {
      Component component = arrayOfComponent[b];
      if (component instanceof Zbc1) {
        Zbc1 zbc1 = (Zbc1)component;
        arrayList.add(zbc1);
      } 
      b++;
      if (!bool)
        break; 
    } 
    return arrayList;
  }
  
  public Zbc1 Za(int paramInt) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    return ZQ().get(paramInt);
  }
  
  public int Zk(Component paramComponent) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    Zbc1 zbc1 = ZV(paramComponent);
    return (zbc1 == null) ? -1 : Ze(zbc1);
  }
  
  private int Ze(Zbc1 paramZbc1) {
    Component[] arrayOfComponent = this.Zd.getComponents();
    byte b = 0;
    boolean bool = Zm99.ZQ();
    while (b < arrayOfComponent.length) {
      if (arrayOfComponent[b] == paramZbc1)
        return b; 
      b++;
      if (bool)
        break; 
    } 
    return -1;
  }
  
  public Component add(String paramString, Component paramComponent) {
    return paramComponent;
  }
  
  public Component add(Component paramComponent, int paramInt) {
    return paramComponent;
  }
  
  public Component add(Component paramComponent) {
    return paramComponent;
  }
  
  public void remove(int paramInt) {}
  
  public void removeAll() {}
  
  public void remove(Component paramComponent) {}
  
  public void remove(MenuComponent paramMenuComponent) {}
  
  public void ZK(Zxtf paramZxtf) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zd.addContainerListener(new Zk5h(this, paramZxtf));
  }
  
  private Zbc1 Zi(Property<Boolean> paramProperty) {
    Zbc1 zbc1 = new Zbc1(null, null, false, this.Zt);
    zbc1.Zx().bindBidirectional(paramProperty);
    return zbc1;
  }
  
  private void Zy(Zbc1 paramZbc1, int paramInt) {
    Ze2_ ze2_ = this.ZO.ZE(paramInt);
    Component component1 = this.Zc.ZL(this, ze2_, paramInt);
    Component component2 = this.Zb.ZN(this, ze2_, paramInt);
    paramZbc1.Zc(component1);
    paramZbc1.ZR(component2);
  }
  
  private void ZM() {
    this.Zd.removeAll();
    boolean bool = Zm99.ZM();
    if (this.ZO != null) {
      byte b = 0;
      while (b < this.ZO.ZA()) {
        Zbc1 zbc1 = Zi((Property<Boolean>)this.ZO.ZE(b).Zp());
        this.Zd.add(zbc1, b);
        Zy(zbc1, b);
        b++;
        if (!bool)
          break; 
      } 
    } 
  }
  
  private static Zbc1 ZV(Component paramComponent) {
    return (paramComponent == null) ? null : ((paramComponent instanceof Zbc1) ? (Zbc1)paramComponent : ZV(paramComponent.getParent()));
  }
  
  private void lambda$setModel$0(Zxj2 paramZxj2, Zrna paramZrna) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_3
    //   4: getstatic burp/Zzpf.Zs : [I
    //   7: aload_2
    //   8: invokevirtual ZCL : ()Lburp/Zxxk;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 124, 1 -> 40, 2 -> 89, 3 -> 104
    //   40: aload_0
    //   41: aload_1
    //   42: aload_2
    //   43: invokevirtual ZC6 : ()I
    //   46: invokeinterface ZE : (I)Lburp/Ze2_;
    //   51: invokeinterface Zp : ()Ljavafx/beans/property/BooleanProperty;
    //   56: invokevirtual Zi : (Ljavafx/beans/property/Property;)Lburp/Zbc1;
    //   59: astore #4
    //   61: aload_0
    //   62: getfield Zd : Lburp/Zbqc;
    //   65: aload #4
    //   67: aload_2
    //   68: invokevirtual ZC6 : ()I
    //   71: invokevirtual add : (Ljava/awt/Component;I)Ljava/awt/Component;
    //   74: pop
    //   75: aload_0
    //   76: aload #4
    //   78: aload_2
    //   79: invokevirtual ZC6 : ()I
    //   82: invokevirtual Zy : (Lburp/Zbc1;I)V
    //   85: iload_3
    //   86: ifeq -> 124
    //   89: aload_0
    //   90: getfield Zd : Lburp/Zbqc;
    //   93: aload_2
    //   94: invokevirtual ZC6 : ()I
    //   97: invokevirtual remove : (I)V
    //   100: iload_3
    //   101: ifeq -> 124
    //   104: aload_0
    //   105: aload_2
    //   106: invokevirtual ZC6 : ()I
    //   109: invokevirtual Za : (I)Lburp/Zbc1;
    //   112: astore #4
    //   114: aload_0
    //   115: aload #4
    //   117: aload_2
    //   118: invokevirtual ZC6 : ()I
    //   121: invokevirtual Zy : (Lburp/Zbc1;I)V
    //   124: aload_0
    //   125: getfield Zd : Lburp/Zbqc;
    //   128: invokevirtual revalidate : ()V
    //   131: return
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'IR¥¤Î\\ta{<m½'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #91
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zbcp.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zbcp.b : [Ljava/lang/String;
    //   78: goto -> 226
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 156, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: iconst_2
    //   153: goto -> 183
    //   156: bipush #40
    //   158: goto -> 183
    //   161: bipush #9
    //   163: goto -> 183
    //   166: bipush #45
    //   168: goto -> 183
    //   171: bipush #63
    //   173: goto -> 183
    //   176: bipush #71
    //   178: goto -> 183
    //   181: bipush #104
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 38
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5284) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */