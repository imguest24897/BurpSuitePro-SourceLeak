package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zejp {
  private final Ztew Zd;
  
  private final Zlof ZS;
  
  private final Zkit Zh;
  
  private final Zkit Zf;
  
  private final Ze24 ZW;
  
  private final Zl2m ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zejp(Ztew paramZtew, Zlof paramZlof, Zkit paramZkit1, Zkit paramZkit2, Ze24 paramZe24, Zl2m paramZl2m) {
    this.Zd = paramZtew;
    this.ZS = paramZlof;
    this.Zh = paramZkit1;
    this.Zf = paramZkit2;
    this.ZW = paramZe24;
    this.ZV = paramZl2m;
  }
  
  Zrpj Zm(Zrpj paramZrpj) {
    String[] arrayOfString = Ztgq.ZZ();
    try {
      if (Zszd.ZL)
        try {
          if (this.Zh != null)
            ZO(paramZrpj); 
        } catch (Ztgq ztgq) {
          throw a(null);
        }  
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    try {
      Zrpj zrpj = this.Zf.<Zrpj>ZH(new Zzzk());
      this.ZW.Zb(paramZrpj, zrpj);
      for (Integer integer : paramZrpj) {
        try {
          zrpj.add(integer);
        } catch (Ztgq|Zb_f ztgq) {
          Zah.Zl(ztgq, Zk_.RETHROWN);
          throw ztgq;
        } catch (Throwable throwable) {
          Zah.Zl(throwable, Zk_.PROCESSED_LATER);
          this.ZS.ZG(throwable);
        } 
        if (arrayOfString == null)
          break; 
      } 
      return zrpj;
    } catch (Ztgq|Zb_f ztgq) {
      Zah.Zl(ztgq, Zk_.RETHROWN);
      throw ztgq;
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.ZS.ZG(throwable);
      return null;
    } 
  }
  
  Ze68 Zx(Ze68 paramZe68) {
    String[] arrayOfString = Ztgq.ZZ();
    try {
      if (Zszd.ZL)
        try {
          if (this.Zh != null)
            Zn(paramZe68); 
        } catch (Ztgq ztgq) {
          throw a(null);
        }  
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    try {
      Ze68 ze68 = this.Zf.<Ze68>ZH(new Zmpk());
      this.ZW.Zb(paramZe68, ze68);
      for (Long long_ : paramZe68) {
        try {
          ze68.add(long_);
        } catch (Ztgq|Zb_f ztgq) {
          Zah.Zl(ztgq, Zk_.RETHROWN);
          throw ztgq;
        } catch (Throwable throwable) {
          Zah.Zl(throwable, Zk_.PROCESSED_LATER);
          this.ZS.ZG(throwable);
        } 
        if (arrayOfString == null)
          break; 
      } 
      return ze68;
    } catch (Ztgq|Zb_f ztgq) {
      Zah.Zl(ztgq, Zk_.RETHROWN);
      throw ztgq;
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.ZS.ZG(throwable);
      return null;
    } 
  }
  
  <T extends Zgpi> Zrfx<T> Zs(Zrfx<T> paramZrfx, Zeu4<Zgpi> paramZeu4) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: getstatic burp/Zszd.ZL : Z
    //   7: ifeq -> 36
    //   10: aload_0
    //   11: getfield Zh : Lburp/Zkit;
    //   14: ifnull -> 36
    //   17: goto -> 24
    //   20: invokestatic a : (Lburp/Ztgq;)Lburp/Ztgq;
    //   23: athrow
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual ZW : (Lburp/Zrfx;)V
    //   29: goto -> 36
    //   32: invokestatic a : (Lburp/Ztgq;)Lburp/Ztgq;
    //   35: athrow
    //   36: new burp/Zl0w
    //   39: dup
    //   40: aload_2
    //   41: aload_1
    //   42: invokeinterface size : ()I
    //   47: invokespecial <init> : (Lburp/Zeu4;I)V
    //   50: astore #4
    //   52: aload_0
    //   53: getfield Zf : Lburp/Zkit;
    //   56: aload #4
    //   58: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   61: checkcast burp/Zrfx
    //   64: astore #5
    //   66: aload_0
    //   67: getfield ZW : Lburp/Ze24;
    //   70: aload_1
    //   71: aload #5
    //   73: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   78: aload_1
    //   79: invokeinterface iterator : ()Ljava/util/Iterator;
    //   84: astore #6
    //   86: aload #6
    //   88: invokeinterface hasNext : ()Z
    //   93: ifeq -> 195
    //   96: aload #6
    //   98: invokeinterface next : ()Ljava/lang/Object;
    //   103: checkcast burp/Zgpi
    //   106: astore #7
    //   108: aload #7
    //   110: ifnonnull -> 133
    //   113: aload #5
    //   115: aconst_null
    //   116: invokeinterface add : (Ljava/lang/Object;)Z
    //   121: pop
    //   122: aload_3
    //   123: ifnonnull -> 154
    //   126: goto -> 133
    //   129: invokestatic a : (Lburp/Ztgq;)Lburp/Ztgq;
    //   132: athrow
    //   133: aload_0
    //   134: getfield Zd : Lburp/Ztew;
    //   137: aload #7
    //   139: invokevirtual ZT : (Lburp/Zgpi;)Lburp/Zgpi;
    //   142: astore #8
    //   144: aload #5
    //   146: aload #8
    //   148: invokeinterface add : (Ljava/lang/Object;)Z
    //   153: pop
    //   154: goto -> 191
    //   157: astore #8
    //   159: aload #8
    //   161: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   164: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   167: aload #8
    //   169: athrow
    //   170: astore #8
    //   172: aload #8
    //   174: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   177: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   180: aload_0
    //   181: getfield ZS : Lburp/Zlof;
    //   184: aload #8
    //   186: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   191: aload_3
    //   192: ifnonnull -> 86
    //   195: aload #5
    //   197: areturn
    //   198: astore #4
    //   200: aload #4
    //   202: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   205: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   208: aload #4
    //   210: athrow
    //   211: astore #4
    //   213: aload #4
    //   215: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   218: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   221: aload_0
    //   222: getfield ZS : Lburp/Zlof;
    //   225: aload #4
    //   227: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   232: aconst_null
    //   233: areturn
    // Exception table:
    //   from	to	target	type
    //   4	17	20	burp/Ztgq
    //   10	29	32	burp/Ztgq
    //   36	197	198	burp/Ztgq
    //   36	197	198	burp/Zb_f
    //   36	197	211	java/lang/Throwable
    //   108	126	129	burp/Ztgq
    //   108	154	157	burp/Ztgq
    //   108	154	157	burp/Zb_f
    //   108	154	170	java/lang/Throwable
  }
  
  private void ZO(Zrpj paramZrpj) {
    try {
      Zx29<Zmg> zx29 = (Zx29)this.Zh.ZJ(paramZrpj, Zxsw.ZV);
      Zg(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(-21009, 11926), Zk_.UNEXPECTED);
    } 
  }
  
  private void Zn(Ze68 paramZe68) {
    try {
      Zx29<Zxsn> zx29 = (Zx29)this.Zh.ZJ(paramZe68, Zsr5.Zz);
      ZO(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(-21011, 6370), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZW(Zrfx<? extends Zgpi> paramZrfx) {
    try {
      Zx29<Zrvk> zx29 = (Zx29)this.Zh.ZJ(paramZrfx, ((Zk2o)paramZrfx.ZF()).Zd);
      Zf(zx29);
    } catch (Exception exception) {
      Zah.ZU(exception, a(-21012, 12863), Zk_.UNEXPECTED);
    } 
  }
  
  private void Zg(Zx29<Zmg> paramZx29) {
    this.ZV.ZU(paramZx29);
    Zx2h zx2h = this.Zh.<Zx2h>ZJ(paramZx29, ((Zkdo)paramZx29.ZF()).Zn);
    this.ZV.ZU(zx2h);
    String[] arrayOfString = Ztgq.ZZ();
    Zgpi zgpi = (Zgpi)this.Zh.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
    this.ZV.ZU(zgpi);
    for (Zrte<Zmg> zrte : (Iterable<Zrte<Zmg>>)zx2h) {
      if (zrte != null) {
        this.ZV.ZU(zrte);
        byte b = 0;
        while (b < zrte.Zpu()) {
          Zmg zmg = zrte.ZdF(b);
          if (zmg != null) {
            this.ZV.ZU(zmg);
            Zmyi zmyi = this.Zh.<Zmyi>ZA(zmg, ((Zlqd)zmg.ZF()).ZY);
            this.ZV.ZU(zmyi);
          } 
          b++;
          if (arrayOfString == null)
            break; 
        } 
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void ZO(Zx29<Zxsn> paramZx29) {
    this.ZV.ZU(paramZx29);
    Zx2h zx2h = this.Zh.<Zx2h>ZJ(paramZx29, ((Zkdo)paramZx29.ZF()).Zn);
    this.ZV.ZU(zx2h);
    String[] arrayOfString = Ztgq.ZZ();
    Zgpi zgpi = (Zgpi)this.Zh.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
    this.ZV.ZU(zgpi);
    for (Zrte<Zxsn> zrte : (Iterable<Zrte<Zxsn>>)zx2h) {
      if (zrte != null) {
        this.ZV.ZU(zrte);
        byte b = 0;
        while (b < zrte.Zpu()) {
          Zxsn zxsn = zrte.ZdF(b);
          if (zxsn != null) {
            this.ZV.ZU(zxsn);
            Zrap zrap = this.Zh.<Zrap>ZA(zxsn, ((Zsif)zxsn.ZF()).ZH);
            this.ZV.ZU(zrap);
          } 
          b++;
          if (arrayOfString == null)
            break; 
        } 
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void Zf(Zx29<Zrvk> paramZx29) {
    this.ZV.ZU(paramZx29);
    Zx2h zx2h = this.Zh.<Zx2h>ZJ(paramZx29, ((Zkdo)paramZx29.ZF()).Zn);
    this.ZV.ZU(zx2h);
    Zgpi zgpi = (Zgpi)this.Zh.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
    String[] arrayOfString = Ztgq.ZZ();
    this.ZV.ZU(zgpi);
    for (Zrte<Zrvk> zrte : (Iterable<Zrte<Zrvk>>)zx2h) {
      if (zrte != null) {
        this.ZV.ZU(zrte);
        byte b = 0;
        while (b < zrte.Zpu()) {
          Zrvk zrvk = zrte.ZdF(b);
          if (zrvk != null) {
            this.ZV.ZU(zrvk);
            Ztrj ztrj = this.Zh.<Ztrj>ZA(zrvk, ((Zxa9)zrvk.ZF()).Zv);
            this.ZV.ZU(ztrj);
          } 
          b++;
          if (arrayOfString == null)
            break; 
        } 
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private static Ztgq a(Ztgq paramZtgq) {
    return paramZtgq;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '8ÊÞû}ZÒ»ÔG÷çrënK@¦ä?Ù«Qý­ôÎ¸Ì7,ïÃÂì!¦¡%^(3ÅÔgÄåDô¥Sø<?Â¨M%"»û'_Òf êL,\\r»¶ê0{5wÈÚ¥gskxKÂÉLýKÂWmÍ¤ûÀåT¹ÞEÐ.×¬\\t\2+Y §ÔVøÛE¬¹\\t+Ëlõ®Ñ²¾¸9 l·¹L/,È±¬ãc_'ÑW ="Ìù¹'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #66
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #46
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
    //   69: putstatic burp/Zejp.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zejp.b : [Ljava/lang/String;
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
    //   152: bipush #62
    //   154: goto -> 184
    //   157: bipush #127
    //   159: goto -> 184
    //   162: bipush #6
    //   164: goto -> 184
    //   167: bipush #105
    //   169: goto -> 184
    //   172: bipush #92
    //   174: goto -> 184
    //   177: bipush #99
    //   179: goto -> 184
    //   182: bipush #21
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
    int i = (paramInt1 ^ 0xFFFFADED) & 0xFFFF;
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
      char c = '°';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zejp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */