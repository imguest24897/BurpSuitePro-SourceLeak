package burp;

import java.util.List;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zen;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Ze_j {
  private final Ze3n ZC;
  
  private final Zsy Zt;
  
  private final Zbnt Zp;
  
  private final Zz4_ ZP;
  
  private final Zbjl Zf;
  
  private final Ztai ZO;
  
  private final int Zg;
  
  private final int Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze_j(Ze3n paramZe3n, Zsy paramZsy, Zbnt paramZbnt, Zz4_ paramZz4_, Zbjl paramZbjl, Ztai paramZtai, int paramInt1, int paramInt2) {
    this.ZC = paramZe3n;
    this.Zt = paramZsy;
    this.Zp = paramZbnt;
    this.ZP = paramZz4_;
    this.Zf = paramZbjl;
    this.ZO = paramZtai;
    this.Zg = paramInt1;
    this.Zh = paramInt2;
  }
  
  public boolean ZM() {
    String str1 = this.Zt.Zi().ZG().ZK(10);
    boolean bool = ZI();
    Zbqc[] arrayOfZbqc = Zk9x.Za();
    if (bool) {
      Ztuw ztuw = new Ztuw(this.ZC, this.Zp, this.Zf, str1, this.Zh);
      List<Zewx> list = ztuw.ZK();
      try {
      
      } catch (Zscd zscd) {
        throw a(null);
      } 
      Zuh.Zb((list.size() == 1), Zqf.Zr);
      Zewx zewx = list.iterator().next();
      Zen zen = zewx.ZF();
      String str4 = zen.toString();
      String str5 = ztuw.ZG(zen, this.Zf.ZB());
      try {
        if (arrayOfZbqc != null) {
          Zbqc.Zr(new Zbqc[1]);
        } else {
          Zt9 zt91 = (new Zsqj(this.ZC.Za(), this.Zp, str1, this.ZC.Za().ZJ1())).Zg(Map.of(a(21118, -13183), str5)).ZX();
          Zxgd zxgd1 = zt91.ZU().Zz().ZV();
          return Zg(str1, str4, str5, zxgd1);
        } 
      } catch (Zscd zscd) {
        throw a(null);
      } 
    } 
    String str2 = this.Zt.Zi().ZG().ZK(10);
    String str3 = String.format(a(21119, -17692), new Object[] { str2 });
    Zt9 zt9 = (new Zsqj(this.ZC.Za(), this.Zp, str1, this.ZC.Za().ZJ1())).Zg(Map.of(a(21118, -13183), str3)).ZX();
    Zxgd zxgd = zt9.ZU().Zz().ZV();
    return Zg(str1, str2, str3, zxgd);
  }
  
  private boolean Zg(String paramString1, String paramString2, String paramString3, Zxgd paramZxgd) {
    Zsex zsex1;
    Zstu zstu1;
    Zbqc[] arrayOfZbqc = Zk9x.Za();
    try {
      zsex1 = new Zsex(this.ZC.Zr((new Zlv5()).Za(paramZxgd).ZD(false)));
      zstu1 = zsex1.Zl();
      if (!zstu1.Zis().contains(paramString2))
        return false; 
      byte b = 0;
      while (b < this.Zg) {
        this.ZC.Zr((new Zlv5()).Za(paramZxgd).ZD(false));
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
    } catch (Zscd zscd) {
      Zah.Zl(zscd, Zk_.IGNORED);
      return false;
    } 
    Zt9 zt9 = (new Zsqj(this.ZC.Za(), this.Zp, paramString1, this.ZC.Za().ZJ1())).ZX();
    Zxgd zxgd = zt9.ZU().Zz().ZV();
    Zsex zsex2 = new Zsex(this.ZC.Zr((new Zlv5()).Za(zxgd).ZD(false)).ZBB());
    Zstu zstu2 = zsex2.Zl();
    try {
      if (!zstu2.Zis().contains(paramString2))
        return false; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    List<Zl1r> list1 = Zl8v.ZJ(paramString2, zstu1.ZiD(), false);
    Zefx zefx1 = zsex1.ZL();
    List<Zl1r> list2 = Zex2.ZT(zefx1, paramString2::lambda$issueCheckRequests$0);
    Zvow zvow1 = this.ZC.Zt().ZC(zefx1).Zu(zstu1).Z_(list1).ZK(list2);
    List<Zl1r> list3 = Zl8v.ZJ(paramString2, zstu2.ZiD(), false);
    Zefx zefx2 = zsex2.ZL();
    List<Zl1r> list4 = Zex2.ZT(zefx2, paramString2::lambda$issueCheckRequests$0);
    Zvow zvow2 = this.ZC.Zt().ZC(zefx2).Zu(zstu2).Z_(list3).ZK(list4);
    this.ZP.Zz(Zmtk.ZZ(this.ZC.Za(), this.ZC.ZN(), null, zvow1, zvow2, paramString3, (byte)4, false));
    return true;
  }
  
  private boolean ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zbjl;
    //   4: invokeinterface ZG : ()Z
    //   9: ifeq -> 114
    //   12: aload_0
    //   13: getfield Zf : Lburp/Zbjl;
    //   16: invokeinterface ZB : ()Lburp/Zzi5;
    //   21: invokevirtual Zi : ()Z
    //   24: ifne -> 114
    //   27: goto -> 34
    //   30: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   33: athrow
    //   34: aload_0
    //   35: getfield ZO : Lburp/Ztai;
    //   38: getstatic burp/Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS : Lburp/Zzu2;
    //   41: getstatic burp/Zr3z.COLLABORATOR_BASED : Lburp/Zr3z;
    //   44: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   49: ifne -> 106
    //   52: goto -> 59
    //   55: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   58: athrow
    //   59: aload_0
    //   60: getfield ZO : Lburp/Ztai;
    //   63: getstatic burp/Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP : Lburp/Zzu2;
    //   66: getstatic burp/Zr3z.COLLABORATOR_BASED : Lburp/Zr3z;
    //   69: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   74: ifne -> 106
    //   77: goto -> 84
    //   80: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   83: athrow
    //   84: aload_0
    //   85: getfield ZO : Lburp/Ztai;
    //   88: getstatic burp/Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP : Lburp/Zzu2;
    //   91: invokeinterface Zr : (Lburp/Zvs;)Z
    //   96: ifeq -> 114
    //   99: goto -> 106
    //   102: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   105: athrow
    //   106: iconst_1
    //   107: goto -> 115
    //   110: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   113: athrow
    //   114: iconst_0
    //   115: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	27	30	burp/Zscd
    //   12	52	55	burp/Zscd
    //   34	77	80	burp/Zscd
    //   59	99	102	burp/Zscd
    //   84	110	110	burp/Zscd
  }
  
  private static List lambda$issueCheckRequests$0(String paramString, Zr6q paramZr6q) {
    return Zl8v.ZJ(paramString, paramZr6q.ZD(), false);
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¯zÎy×ä'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #50
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Ze_j.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Ze_j.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #54
    //   154: goto -> 184
    //   157: bipush #95
    //   159: goto -> 184
    //   162: bipush #101
    //   164: goto -> 184
    //   167: bipush #111
    //   169: goto -> 184
    //   172: bipush #108
    //   174: goto -> 184
    //   177: bipush #73
    //   179: goto -> 184
    //   182: bipush #62
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x527F) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */