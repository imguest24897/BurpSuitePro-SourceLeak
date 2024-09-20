package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Zbh0 extends Zbqc {
  private final Zbqc Zg;
  
  private final Zm99 Zt;
  
  private final Zex7 Zj;
  
  private final List<Zm99> ZI = new ArrayList<>();
  
  private final List<Zm99> ZS = new ArrayList<>();
  
  private final List<Zex7> ZM = new ArrayList<>();
  
  private Zlta ZB;
  
  private static Zbqc[] Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbh0(Ztwv paramZtwv) {
    setLayout(new BorderLayout());
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 10, 0 };
    Zbqc zbqc = new Zbqc(gridBagLayout1);
    Zbqc[] arrayOfZbqc = Ze();
    zbqc.setBorder(new EmptyBorder(0, 0, 0, 15));
    this.Zt = new Zm99();
    Zm99 zm99 = new Zm99();
    this.Zj = new Zex7();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.anchor = 21;
    zbqc.add(this.Zt, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.anchor = 21;
    zbqc.add(zm99, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 22;
    zbqc.add(this.Zj, gridBagConstraints);
    Ze9n ze9n = Ze3m.ZC(Zeuf.INFORMATION, Zlkk.ACTION_NORMAL).ZG(Zlkk.ACTION_HOVER).Z_();
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 40, 0 };
    this.Zg = new Zbh4(this, gridBagLayout2);
    this.Zg.setBorder(new EmptyBorder(5, 12, 5, 12));
    Zbcv zbcv = (new Zz5_(zbqc, this.Zg)).Zs(ze9n).ZZ(Zeyc.NORTH_EAST).Zn(5).ZT();
    add(zbcv, a(1600, -7515));
    paramZtwv.Ze().scheduleAtFixedRate(this::ZM, 0L, 2L, TimeUnit.SECONDS);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public void ZJ(long paramLong, int paramInt) {
    this.ZB = new Zlta(paramLong, paramInt);
  }
  
  public void Zf(List<Zebi> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface isEmpty : ()Z
    //   6: ifeq -> 10
    //   9: return
    //   10: aload_0
    //   11: aload_1
    //   12: <illegal opcode> run : (Lburp/Zbh0;Ljava/util/List;)Ljava/lang/Runnable;
    //   17: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   20: return
  }
  
  private void ZM() {
    if (this.ZB != null)
      SwingUtilities.invokeLater(this::lambda$updateMemoryUsage$1); 
  }
  
  private static String ZF(String paramString) {
    return String.format(a(1606, 26983), new Object[] { paramString });
  }
  
  private static String Zm(long paramLong) {
    return (paramLong >= 1073741824L) ? String.format(a(1607, 13655), new Object[] { Double.valueOf(paramLong / 1.073741824E9D) }) : ((paramLong >= 1048576L) ? String.format(a(1602, 13880), new Object[] { Double.valueOf(paramLong / 1048576.0D) }) : String.format(a(1601, -8751), new Object[] { Long.valueOf(paramLong / 1024L) }));
  }
  
  private void lambda$updateMemoryUsage$1() {
    this.Zt.setText(a(1603, 15159) + a(1603, 15159));
    this.Zj.setValue(this.ZB.ZN);
  }
  
  private void lambda$showDiskPressure$0(List<Zebi> paramList) {
    Zbqc[] arrayOfZbqc = Ze();
    if (this.ZI.isEmpty()) {
      GridBagLayout gridBagLayout = (GridBagLayout)this.Zg.getLayout();
      gridBagLayout.rowHeights = new int[paramList.size() * 2 - 1];
      byte b1 = 0;
      while (b1 < paramList.size()) {
        int i = b1 * 2;
        if (i + 1 < gridBagLayout.rowHeights.length)
          gridBagLayout.rowHeights[i + 1] = 10; 
        Zm99 zm991 = new Zm99();
        this.ZI.add(zm991);
        Zm99 zm992 = new Zm99();
        this.ZS.add(zm992);
        Zex7 zex7 = new Zex7();
        this.ZM.add(zex7);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = i;
        gridBagConstraints.anchor = 21;
        this.Zg.add(zm991, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = i;
        gridBagConstraints.anchor = 21;
        this.Zg.add(zm992, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = i;
        gridBagConstraints.weightx = 1.0D;
        gridBagConstraints.anchor = 22;
        this.Zg.add(zex7, gridBagConstraints);
        b1++;
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    byte b = 0;
    while (b < paramList.size()) {
      Zebi zebi = paramList.get(b);
      ((Zm99)this.ZI.get(b)).setText(ZF(zebi.Zw));
      ((Zm99)this.ZS.get(b)).setText(Zm(zebi.ZK));
      ((Zex7)this.ZM.get(b)).setValue(zebi.Zz);
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public static void ZW(Zbqc[] paramArrayOfZbqc) {
    Zv = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Ze() {
    return Zv;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¬»d=Ì*\\b&mòì¿þ<B8-c¥é^¢'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: anewarray burp/Zbqc
    //   22: bipush #7
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: invokestatic ZW : ([Lburp/Zbqc;)V
    //   30: bipush #29
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 149
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
    //   75: ldc 'p)ëS4èJ³'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: iconst_4
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #109
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zbh0.a : [Ljava/lang/String;
    //   138: bipush #6
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zbh0.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #46
    //   222: goto -> 252
    //   225: bipush #47
    //   227: goto -> 252
    //   230: bipush #91
    //   232: goto -> 252
    //   235: bipush #110
    //   237: goto -> 252
    //   240: bipush #38
    //   242: goto -> 252
    //   245: bipush #105
    //   247: goto -> 252
    //   250: bipush #31
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x642) & 0xFFFF;
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
      byte b1 = 43;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbh0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */