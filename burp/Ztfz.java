package burp;

import java.awt.Rectangle;
import java.beans.PropertyChangeEvent;
import javax.swing.InputMap;
import javax.swing.JViewport;
import javax.swing.UIManager;
import javax.swing.plaf.InputMapUIResource;
import javax.swing.text.BadLocationException;
import javax.swing.text.EditorKit;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;
import javax.swing.text.View;

public class Ztfz extends Ztf6 {
  private static final EditorKit ZI;
  
  private final JViewport Zn;
  
  private final Zkjk Zo;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Ztfz(Zmgn paramZmgn, JViewport paramJViewport, Zkjk paramZkjk) {
    super(paramZmgn);
    this.Zn = paramJViewport;
    this.Zo = paramZkjk;
  }
  
  public View create(Element paramElement) {
    Zmgw zmgw = ZN();
    return (zmgw instanceof Zmgn) ? new Zgpw(paramElement, (Zmgn)zmgw, this.Zn, this.Zo) : null;
  }
  
  protected Highlighter createHighlighter() {
    return new Zxrf();
  }
  
  protected String ZF() {
    return b(27644, -31717);
  }
  
  public EditorKit getEditorKit(JTextComponent paramJTextComponent) {
    return ZI;
  }
  
  protected InputMap Zc() {
    InputMapUIResource inputMapUIResource = new InputMapUIResource();
    InputMap inputMap = (InputMap)UIManager.get(b(27645, -22139));
    if (inputMap == null) {
      inputMap = new Ze_o();
      UIManager.put(b(27641, -5607), inputMap);
    } 
    inputMapUIResource.setParent(inputMap);
    return inputMapUIResource;
  }
  
  protected Keymap createKeymap() {
    Keymap keymap = super.createKeymap();
    keymap.setDefaultAction(new Zzf4());
    return keymap;
  }
  
  protected void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: sipush #27646
    //   7: aload_1
    //   8: invokevirtual getPropertyName : ()Ljava/lang/String;
    //   11: astore_3
    //   12: sipush #-26128
    //   15: invokestatic b : (II)Ljava/lang/String;
    //   18: aload_3
    //   19: invokevirtual equals : (Ljava/lang/Object;)Z
    //   22: ifeq -> 33
    //   25: aload_0
    //   26: invokevirtual modelChanged : ()V
    //   29: aload_2
    //   30: ifnull -> 92
    //   33: sipush #27640
    //   36: sipush #6970
    //   39: invokestatic b : (II)Ljava/lang/String;
    //   42: aload_3
    //   43: invokevirtual equals : (Ljava/lang/Object;)Z
    //   46: ifne -> 65
    //   49: sipush #27647
    //   52: sipush #30565
    //   55: invokestatic b : (II)Ljava/lang/String;
    //   58: aload_3
    //   59: invokevirtual equals : (Ljava/lang/Object;)Z
    //   62: ifeq -> 87
    //   65: aload_0
    //   66: aload_0
    //   67: getfield Zq : Lburp/Zmgw;
    //   70: invokevirtual getRootView : (Ljavax/swing/text/JTextComponent;)Ljavax/swing/text/View;
    //   73: iconst_0
    //   74: invokevirtual getView : (I)Ljavax/swing/text/View;
    //   77: checkcast burp/Zgpw
    //   80: invokevirtual ZY : ()V
    //   83: aload_2
    //   84: ifnull -> 92
    //   87: aload_0
    //   88: aload_1
    //   89: invokespecial propertyChange : (Ljava/beans/PropertyChangeEvent;)V
    //   92: return
  }
  
  public float ZA(int paramInt) throws BadLocationException {
    Rectangle rectangle = getVisibleEditorRect();
    if (rectangle != null) {
      Zgxu zgxu = (Zgxu)getRootView(this.Zq).getView(0);
      return zgxu.Zp(rectangle, paramInt);
    } 
    return -1.0F;
  }
  
  public void ZD(boolean paramBoolean) {
    ((Zgxu)getRootView(this.Zq).getView(0)).Zb(paramBoolean);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ñRÒ\r"º{%ÝÌ};QúÌõ\\fÁnÿçJU½rø\\f§ª¼5G0Â»òêfS,Üeã*¤^;û1@]àØ$$ÔGW¥Ý³lûôÕ§Q«ÒÿP¸ÞëÇa¾cxáþáVÍ6'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_2
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
    //   64: goto -> 23
    //   67: ldc 'kit´y^¬î>ø3*`kQHºo!Y'¸¼¼ß0±p×ìö·M¿E-/7Ò'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #20
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
    //   128: putstatic burp/Ztfz.c : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Ztfz.d : [Ljava/lang/String;
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
    //   212: bipush #118
    //   214: goto -> 244
    //   217: bipush #21
    //   219: goto -> 244
    //   222: bipush #24
    //   224: goto -> 244
    //   227: bipush #93
    //   229: goto -> 244
    //   232: bipush #123
    //   234: goto -> 244
    //   237: bipush #108
    //   239: goto -> 244
    //   242: bipush #97
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
    //   300: new burp/Ze8z
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Ztfz.ZI : Ljavax/swing/text/EditorKit;
    //   310: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6BFC) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 107;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztfz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */