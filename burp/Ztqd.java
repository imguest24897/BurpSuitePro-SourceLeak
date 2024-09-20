package burp;

import java.awt.Window;
import java.util.List;
import java.util.function.Supplier;
import javax.swing.RowSorter;
import net.portswigger.Zm2;

public class Ztqd {
  private final Zs97<?> ZK;
  
  private final Window Zq;
  
  private final Supplier<Zbws> Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Ztqd(Zs97<?> paramZs97, Window paramWindow, Supplier<Zbws> paramSupplier) {
    this.ZK = paramZs97;
    this.Zq = paramWindow;
    this.Ze = paramSupplier;
  }
  
  public void ZK(int paramInt) {
    ZO(paramInt);
    Zk(this.Ze.get(), paramInt);
    this.ZK.ZI(paramInt);
  }
  
  private void ZO(int paramInt) {
    Zr6p<?> zr6p = this.ZK.ZZ(paramInt);
    if (zr6p instanceof Zb05) {
      Zb05<?, ?> zb05 = (Zb05)zr6p;
      Zrh7 zrh7 = Zgtg.Zf(zb05);
      if (zrh7 != null) {
        zrh7.setVisible(false);
        zrh7.dispose();
      } 
    } 
  }
  
  private void Zk(Zbws paramZbws, int paramInt) {
    if (paramZbws.getRowSorter() == null)
      return; 
    List<? extends RowSorter.SortKey> list1 = paramZbws.getRowSorter().getSortKeys();
    List<? extends RowSorter.SortKey> list2 = list1.stream().filter(paramInt::lambda$updateSortKeys$0).map(paramInt::lambda$updateSortKeys$1).toList();
    paramZbws.getRowSorter().setSortKeys(list2);
  }
  
  public boolean Zn(int paramInt) {
    String str = Zs23.ZX(a(-2669, 17819));
    boolean bool = Boolean.parseBoolean(str);
    if (bool) {
      ZK(paramInt);
      Zm2.ZB(Zec3.CUSTOM_COLUMN_DELETED, ((Zbws)this.Ze.get()).getName());
      return true;
    } 
    Zr7j zr7j = (new Zlvz(this.Zq)).Zf().ZN(a(-2670, 11145)).ZM(a(-2667, -16670)).Z_(new String[] { a(-2671, 5268), a(-2672, -32103) }).ZJ().Zs((new Ze3m(Zeuf.WARNING, Zlkk.FOREGROUND)).ZU(Zmcx.EXTRA_LARGE_LINE_SIZE).Z_()).Zc();
    Zt3 zt3 = zr7j.Zj();
    if (zt3.ZuX())
      Zs23.Zg(a(-2668, 22753), String.valueOf(true)); 
    if (zt3.ZuO()) {
      ZK(paramInt);
      Zm2.ZB(Zec3.CUSTOM_COLUMN_DELETED, ((Zbws)this.Ze.get()).getName());
      return true;
    } 
    return false;
  }
  
  private static RowSorter.SortKey lambda$updateSortKeys$1(int paramInt, RowSorter.SortKey paramSortKey) {
    return (paramSortKey.getColumn() > paramInt) ? new RowSorter.SortKey(paramSortKey.getColumn() - 1, paramSortKey.getSortOrder()) : paramSortKey;
  }
  
  private static boolean lambda$updateSortKeys$0(int paramInt, RowSorter.SortKey paramSortKey) {
    return (paramSortKey.getColumn() != paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¼íëdëØ¦¿h¾ó¹#æ}áÞ¸ÂãbÚËt\\nÑ\ä¾¢õæ¢÷)Û#u8 -êóI4éû/SÔ)Gd\\t7TiT9Iâðø\\b0\\b.ãa=é&Úúp|åæu9@æè5ú¯ÖTëÙ3°DÊcÒlÜëPq\\bVíMÖè®+ Käé435½ÛG|aiã#¨ì®*zvÈÀKÍûåg4Ör`CÓ7¥zòV\\tåHüL¿ºqq-ð´.÷¯«¯øÊePó#Q;dä¬òÊ)¶û»ØðRÇ¸u´MØºâºÉ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #128
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #97
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc '³;×ÖT÷}tO`YôQú\\r¿Å\\b°)".U|Ó¸¿îµ\ÞhÒ?,~tóo_Ä÷Ð|$dê:ºä\jÍÊy:ÿ³?iÿ=!öå}ow'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #46
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #87
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Ztqd.a : [Ljava/lang/String;
    //   133: bipush #6
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Ztqd.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #65
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #89
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #52
    //   234: goto -> 244
    //   237: bipush #76
    //   239: goto -> 244
    //   242: bipush #9
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 41, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF590) & 0xFFFF;
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
      byte b1 = 57;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztqd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */