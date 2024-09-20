package burp;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.border.EmptyBorder;

class Zgoi extends Zbqc {
  protected boolean[] Zk;
  
  protected String ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgoi(String paramString1, Zbcc paramZbcc, List<Zrmm> paramList, int paramInt, String paramString2) {
    this(paramString1, paramZbcc, paramList, paramInt, (boolean[])null, (String)null, paramString2);
  }
  
  public Zgoi(String paramString1, Zbcc paramZbcc, List<Zrmm> paramList, int paramInt, boolean[] paramArrayOfboolean, String paramString2, String paramString3) {
    this.Zk = paramArrayOfboolean;
    this.ZG = paramString2;
    setBorder(new EmptyBorder(20, 15, 15, 15));
    setLayout(new BorderLayout());
    Zbkc zbkc1 = new Zbkc(paramString1);
    add(zbkc1, a(18920, -27396));
    add(paramZbcc, a(18922, -29328));
    int i = Zl4x.Zt();
    Zbqc zbqc1 = new Zbqc();
    zbqc1.setLayout(new BorderLayout());
    add(zbqc1, a(18925, 3337));
    zbqc1.add(ZP(paramList, paramInt), a(18920, -27396));
    Zbqc zbqc2 = new Zbqc();
    zbqc2.setBorder(new EmptyBorder(0, 0, 15, 0));
    zbqc2.setLayout(new BorderLayout());
    Zbkc zbkc2 = new Zbkc(a(18923, 28102));
    zbqc2.add(zbkc2, a(18920, -27396));
    Zl8w zl8w = new Zl8w(paramString3);
    zbqc2.add(zl8w, a(18922, -29328));
    zbqc1.add(zbqc2, a(18922, -29328));
    if (Zbqc.Zwu() == null)
      Zl4x.Zt(++i); 
  }
  
  protected Zbqc ZP(List<Zrmm> paramList, int paramInt) {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: istore_3
    //   4: iload_2
    //   5: ifne -> 23
    //   8: sipush #18926
    //   11: sipush #-11331
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: astore #4
    //   19: iload_3
    //   20: ifne -> 174
    //   23: new java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore #5
    //   32: aload #5
    //   34: iload_2
    //   35: invokestatic toString : (I)Ljava/lang/String;
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: sipush #18912
    //   44: sipush #6922
    //   47: invokestatic a : (II)Ljava/lang/String;
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: iconst_0
    //   55: istore #6
    //   57: iload #6
    //   59: aload_1
    //   60: invokeinterface size : ()I
    //   65: if_icmpge -> 110
    //   68: aload #5
    //   70: aload_1
    //   71: iload #6
    //   73: invokeinterface get : (I)Ljava/lang/Object;
    //   78: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: iload #6
    //   84: iconst_1
    //   85: iadd
    //   86: aload_1
    //   87: invokeinterface size : ()I
    //   92: if_icmpge -> 103
    //   95: aload #5
    //   97: ldc '\\n'
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: iinc #6, 1
    //   106: iload_3
    //   107: ifne -> 57
    //   110: iload_2
    //   111: aload_1
    //   112: invokeinterface size : ()I
    //   117: if_icmple -> 167
    //   120: aload #5
    //   122: sipush #18927
    //   125: sipush #8901
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload #5
    //   137: iload_2
    //   138: aload_1
    //   139: invokeinterface size : ()I
    //   144: isub
    //   145: invokestatic toString : (I)Ljava/lang/String;
    //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: pop
    //   152: aload #5
    //   154: sipush #18914
    //   157: sipush #30497
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload #5
    //   169: invokevirtual toString : ()Ljava/lang/String;
    //   172: astore #4
    //   174: new burp/Zbqc
    //   177: dup
    //   178: invokespecial <init> : ()V
    //   181: astore #5
    //   183: aload #5
    //   185: new javax/swing/border/EmptyBorder
    //   188: dup
    //   189: iconst_0
    //   190: iconst_0
    //   191: bipush #15
    //   193: iconst_0
    //   194: invokespecial <init> : (IIII)V
    //   197: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   200: aload #5
    //   202: new java/awt/BorderLayout
    //   205: dup
    //   206: invokespecial <init> : ()V
    //   209: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   212: new burp/Zbkc
    //   215: dup
    //   216: sipush #18924
    //   219: sipush #3677
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: invokespecial <init> : (Ljava/lang/String;)V
    //   228: astore #6
    //   230: aload #5
    //   232: aload #6
    //   234: sipush #18921
    //   237: sipush #-490
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   246: new burp/Zl8w
    //   249: dup
    //   250: aload #4
    //   252: invokespecial <init> : (Ljava/lang/String;)V
    //   255: astore #7
    //   257: aload #5
    //   259: aload #7
    //   261: sipush #18913
    //   264: sipush #29653
    //   267: invokestatic a : (II)Ljava/lang/String;
    //   270: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   273: aload #5
    //   275: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'kåQx&3nÞ5'*o.±¡×å^"wâÔüôõY\\t0¹É¥6"²\\tZÎ*, ë»ÛoÉ|xb×)ä§¸J÷ýã~ªÖûá\\tÓEó\\bcdëÃÂ#»f²u)î²£t­^ã¢áÖGM6X¯8^Æs©¦NØ@ß/ãþÐû8µ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #36
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
    //   67: ldc '×»¬êP|?Ö[6'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #49
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
    //   128: putstatic burp/Zgoi.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgoi.b : [Ljava/lang/String;
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
    //   212: bipush #81
    //   214: goto -> 244
    //   217: bipush #70
    //   219: goto -> 244
    //   222: bipush #67
    //   224: goto -> 244
    //   227: bipush #52
    //   229: goto -> 244
    //   232: bipush #36
    //   234: goto -> 244
    //   237: bipush #28
    //   239: goto -> 244
    //   242: bipush #88
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
    int i = (paramInt1 ^ 0x49E8) & 0xFFFF;
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
      char c = 'õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgoi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */