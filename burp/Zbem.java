package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

public class Zbem extends Zbv5 implements Zt3u {
  private final Zr1m Zm;
  
  private final Ze63 ZC;
  
  private final Collection<String> ZB;
  
  private Zzdy ZP;
  
  private Zzdy ZL;
  
  private Zzdy ZH;
  
  private Zzdy Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbem(Zr1m paramZr1m, Ze63 paramZe63) {
    this.Zm = paramZr1m;
    this.ZC = paramZe63;
    this.ZB = Set.of(Zjd(), a(-10335, 27586), a(-10314, 1246), a(-10331, -16427), a(-10333, 17423), a(-10334, -7342), a(-10321, 27369), a(-10328, 22824), a(-10327, 13567), a(-10316, -10424));
    ZV();
    setName(a(-10326, -758));
  }
  
  public String Zjd() {
    return a(-10329, 21567);
  }
  
  public String ZjS() {
    return a(-10322, 26402);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_SETTINGS_TOOLS_REPEATER_MESSAGE_MODIFICATION, this.Zm, new String[] { a(-10325, -8749), a(-10336, 16480), a(-10315, 32684), a(-10332, 21701) });
    String[] arrayOfString = Zbeb.Z_();
    if (Zbqc.Zwu() == null)
      Zbeb.ZP(new String[5]); 
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZB;
  }
  
  public void Zt2() {
    this.Zc.setSelected(this.ZC.Zsl());
    this.ZH.setSelected(this.ZC.ZsR());
    this.ZP.setSelected(this.ZC.Zsw());
    this.ZL.setSelected(this.ZC.Zs2());
  }
  
  private void ZV() {
    this.Zc = new Zzdy();
    this.ZH = new Zzdy();
    this.ZP = new Zzdy();
    this.ZL = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zc.setText(a(-10330, 28728));
    this.Zc.addActionListener(new Zmnj(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zc, gridBagConstraints);
    this.ZH.setText(a(-10313, -3475));
    this.ZH.addActionListener(new Zsxq(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    add(this.ZH, gridBagConstraints);
    this.ZP.setText(a(-10323, -27998));
    this.ZP.addActionListener(new Zb2d(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 21;
    add(this.ZP, gridBagConstraints);
    this.ZL.setText(a(-10324, -1781));
    this.ZL.addActionListener(new Zs96(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 21;
    add(this.ZL, gridBagConstraints);
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    this.ZC.ZAA(this.Zc.isSelected());
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    this.ZC.ZAE(this.ZH.isSelected());
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    this.ZC.ZAe(this.ZP.isSelected());
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    this.ZC.ZAl(this.ZL.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'õFcz¦=Ë~\\bCÇ5 àvs+¤Rqæð(\\rÃGÓW[kL ®ìL7Faº!\\f¤b¬~Þ?4*«ôzQ@²eWjTÑ9bxá´CËUwÝÕÚ±ºlp'üÁ=<\\n¥¿È´QºAHúÁÉ+TÒpØb +ìÞIé/Ý*ÇÃcs4,ÉZO¼±Âæ¤à,ÎªmúÕÏc:SZ%]ËJ,5/&ÄÐ ÷#$d3¼\î=ªYÔ»ÍûÈ5 Ä¿\\nÚ\\f«à6I3¿¢"&ì¯O^5@f¢¼mïm\\fÙ¶¯5ºÞ),*°øUðzÖÔ¤Ô¯¤Á0@á·ymê³F§­v!ÄÜD¯m¶Ç¶G·oISè&?PÛ"ç·Û,`¡{=ò+Øà\\n9bþàìS¯êÆãÈF;¦À_`{Õ¬ÿ'b!aW:¤`º¤TàËÄo£?¼(»Þd×þ¤\\r#íÈ>8÷XÑÀ«kª&H¡2ßNgÃcpOéVx;±T°¬ûpÌO½>c}hÿaU:ú}stfÐ) -\\fd7+6_íöåtd£®k_#Èh,\\t0zé|ªd×t¦¥\\n8ç´8\\t\\fÿéõ»ù×'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #18
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #60
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
    //   68: ldc '7Ý¾Kâ±Üpk¤ ­Zó¸Þ³SúTúu;ËÔ\\nøk'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #27
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #51
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
    //   129: putstatic burp/Zbem.a : [Ljava/lang/String;
    //   132: bipush #20
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbem.b : [Ljava/lang/String;
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
    //   212: bipush #86
    //   214: goto -> 244
    //   217: bipush #64
    //   219: goto -> 244
    //   222: bipush #43
    //   224: goto -> 244
    //   227: bipush #36
    //   229: goto -> 244
    //   232: bipush #19
    //   234: goto -> 244
    //   237: bipush #74
    //   239: goto -> 244
    //   242: bipush #62
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
    int i = (paramInt1 ^ 0xFFFFD7A5) & 0xFFFF;
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
      char c = 'È';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */