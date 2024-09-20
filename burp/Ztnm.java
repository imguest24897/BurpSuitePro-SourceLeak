package burp;

import java.awt.Component;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

class Ztnm extends Ztn0 implements Zran {
  private final Component ZJ;
  
  private final boolean Ze;
  
  private final Zemv ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Ztnm(Component paramComponent, boolean paramBoolean) {
    this.ZJ = paramComponent;
    this.Ze = paramBoolean;
    this.ZW = new Zg5z();
    this.Zf = new String[] { 
        "", "", "", "", "", "", "", "", "", "", 
        "", "", "", "", "", "", "", "" };
    this.ZV = new byte[] { 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0 };
    boolean bool = Zbw2.ZH();
    try {
      this.Zc = new int[] { 
          11, 3, 3, 3, 3, 3, 3, 3, 5, 3, 
          3, 3, 3, 3, 3, 3, 5, 20 };
      this.ZZ = 4;
      this.Zu = false;
      this.Zx = true;
      if (!bool)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void Zx(Zbws paramZbws) {
    super.Zx(paramZbws);
    paramZbws.setDefaultRenderer(String.class, new Zm2h());
  }
  
  public int getRowCount() {
    return (int)Math.ceil((this.ZW.Zb()).length / 16.0D);
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    try {
      if (this.Ze) {
        try {
          if (paramInt2 != 0) {
            try {
              if (paramInt2 == 17)
                return false; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
          } else {
            return false;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (paramInt1 >= getRowCount() - 1) {
        try {
          if (paramInt2 <= ((this.ZW.Zb()).length - 1) % 16 + 1);
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    try {
      if (paramInt2 == 0)
        return String.format(a(-20185, -29580), new Object[] { Integer.valueOf(paramInt1 * 16) }); 
    } catch (Exception exception) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.ZW.Zb();
    try {
      if (paramInt2 == 17) {
        try {
        
        } catch (Exception exception) {
          throw a(null);
        } 
        boolean bool = (paramInt1 == getRowCount() - 1) ? ((arrayOfByte.length - 1) % 16 + 1) : true;
        return Zkb.Zo(arrayOfByte, paramInt1 * 16, bool);
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      int i = paramInt1 * 16 + paramInt2 - 1;
      if (i >= arrayOfByte.length)
        return a(-20190, 30515); 
      null = "0" + Integer.toHexString(arrayOfByte[i]);
      return null.substring(null.length() - 2);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return a(-20187, 8713);
    } 
  }
  
  public void setValueAt(Object paramObject, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast java/lang/String
    //   4: astore #4
    //   6: aload #4
    //   8: invokevirtual length : ()I
    //   11: iconst_1
    //   12: if_icmplt -> 31
    //   15: aload #4
    //   17: invokevirtual length : ()I
    //   20: iconst_2
    //   21: if_icmple -> 61
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: getfield ZJ : Ljava/awt/Component;
    //   35: sipush #-20186
    //   38: sipush #5002
    //   41: invokestatic a : (II)Ljava/lang/String;
    //   44: sipush #-20192
    //   47: sipush #-7688
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: invokestatic Zt : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   56: return
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: aload #4
    //   63: invokevirtual length : ()I
    //   66: iconst_2
    //   67: if_icmpne -> 138
    //   70: aload #4
    //   72: iconst_0
    //   73: invokevirtual charAt : (I)C
    //   76: invokestatic isLetterOrDigit : (C)Z
    //   79: ifeq -> 108
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload #4
    //   91: iconst_1
    //   92: invokevirtual charAt : (I)C
    //   95: invokestatic isLetterOrDigit : (C)Z
    //   98: ifne -> 138
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: getfield ZJ : Ljava/awt/Component;
    //   112: sipush #-20191
    //   115: sipush #18174
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: sipush #-20189
    //   124: sipush #3152
    //   127: invokestatic a : (II)Ljava/lang/String;
    //   130: invokestatic Zt : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   133: return
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload #4
    //   140: bipush #16
    //   142: invokestatic parseInt : (Ljava/lang/String;I)I
    //   145: i2b
    //   146: istore #5
    //   148: aload_0
    //   149: getfield ZW : Lburp/Zemv;
    //   152: invokeinterface Zb : ()[B
    //   157: iload_2
    //   158: bipush #16
    //   160: imul
    //   161: iload_3
    //   162: iadd
    //   163: iconst_1
    //   164: isub
    //   165: iload #5
    //   167: bastore
    //   168: aload_0
    //   169: iload_2
    //   170: iload_3
    //   171: invokevirtual fireTableCellUpdated : (II)V
    //   174: aload_0
    //   175: iload_2
    //   176: bipush #17
    //   178: invokevirtual fireTableCellUpdated : (II)V
    //   181: aload_0
    //   182: getfield ZW : Lburp/Zemv;
    //   185: iconst_1
    //   186: invokeinterface ZW : (Z)V
    //   191: goto -> 229
    //   194: astore #5
    //   196: aload #5
    //   198: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   201: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   204: aload_0
    //   205: getfield ZJ : Ljava/awt/Component;
    //   208: sipush #-20191
    //   211: sipush #18174
    //   214: invokestatic a : (II)Ljava/lang/String;
    //   217: sipush #-20189
    //   220: sipush #3152
    //   223: invokestatic a : (II)Ljava/lang/String;
    //   226: invokestatic Zt : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   229: return
    // Exception table:
    //   from	to	target	type
    //   6	24	27	java/lang/NumberFormatException
    //   15	57	57	java/lang/NumberFormatException
    //   61	82	85	java/lang/NumberFormatException
    //   70	101	104	java/lang/NumberFormatException
    //   89	134	134	java/lang/NumberFormatException
    //   138	191	194	java/lang/NumberFormatException
  }
  
  public void Zt(byte[] paramArrayOfbyte, boolean paramBoolean) {
    Zp(paramArrayOfbyte, paramBoolean, true);
  }
  
  public void Zp(byte[] paramArrayOfbyte, boolean paramBoolean1, boolean paramBoolean2) {
    try {
      this.ZW.Zy(paramArrayOfbyte);
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      this.ZW.ZW(!paramBoolean1);
      if (paramBoolean2)
        fireTableDataChanged(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public byte[] Zj(boolean paramBoolean) {
    byte[] arrayOfByte = this.ZW.Zb();
    try {
      if (paramBoolean)
        try {
          if (this.ZW.ZC());
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return arrayOfByte;
  }
  
  public int ZC() {
    return (this.ZW.Zb()).length;
  }
  
  public boolean Zm() {
    return this.ZW.ZC();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '..&UÞ×èCT (ÎÊUî¯NzÇyýüJµú-#C'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #119
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'q¬.'[¨ð'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #26
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
    //   128: putstatic burp/Ztnm.a : [Ljava/lang/String;
    //   131: bipush #7
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Ztnm.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #78
    //   214: goto -> 243
    //   217: bipush #45
    //   219: goto -> 243
    //   222: bipush #15
    //   224: goto -> 243
    //   227: bipush #29
    //   229: goto -> 243
    //   232: bipush #104
    //   234: goto -> 243
    //   237: iconst_4
    //   238: goto -> 243
    //   241: bipush #108
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB123) & 0xFFFF;
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
      char c = 'ø';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */