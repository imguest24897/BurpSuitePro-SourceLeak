package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zt_f extends Ztn0 {
  private final List<Ztbr> Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zt_f(List<Ztbr> paramList) {
    this.Zo = paramList;
    this.Zf = new String[] { a(-6420, 10785), a(-6419, 9179), a(-6418, 9233), a(-6421, -9105), a(-6417, -30492) };
    this.ZV = new byte[] { 0, 0, 0, 0, 6 };
    this.Zc = new int[] { 12, 12, 12, 25, 8 };
    this.ZZ = 4;
  }
  
  public int getRowCount() {
    return this.Zo.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    try {
      if (paramInt1 >= this.Zo.size())
        return ZW(paramInt2); 
      Ztbr ztbr = this.Zo.get(paramInt1);
      switch (paramInt2) {
        case 0:
          return ztbr.ZqJ();
        case 1:
          try {
          
          } catch (Exception exception) {
            throw a(null);
          } 
          return (ztbr.ZqD() == null) ? "" : ztbr.ZqD();
        case 2:
          return ztbr.Zqy();
        case 3:
          try {
          
          } catch (Exception exception) {
            throw a(null);
          } 
          return (ztbr.Zq0() == null) ? "" : ztbr.Zq0();
        case 4:
          return ztbr.ZqU();
      } 
      Zuh.Zv(false, Zqf.Zk, paramInt2);
      return "";
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return ZW(paramInt2);
    } 
  }
  
  private Object ZW(int paramInt) {
    switch (paramInt) {
      case 0:
      case 1:
      case 2:
      case 3:
        return "";
      case 4:
        return null;
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return "";
  }
  
  Ztbr ZG(int paramInt) {
    try {
      try {
        if (paramInt < 0 || paramInt >= this.Zo.size())
          return null; 
      } catch (Exception exception) {
        throw a(null);
      } 
      return this.Zo.get(paramInt);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  int Zc(Ztbr paramZtbr) {
    return this.Zo.indexOf(paramZtbr);
  }
  
  void ZR(int paramInt) {
    synchronized (this.Zo) {
      this.Zo.remove(paramInt);
      fireTableRowsDeleted(paramInt, paramInt);
    } 
  }
  
  void Zf() {
    synchronized (this.Zo) {
      this.Zo.clear();
      fireTableDataChanged();
    } 
  }
  
  void ZJ(Ztbr paramZtbr) {
    // Byte code:
    //   0: invokestatic Zs : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zo : Ljava/util/List;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: iconst_m1
    //   12: istore #4
    //   14: iconst_0
    //   15: istore #5
    //   17: iload #5
    //   19: aload_0
    //   20: getfield Zo : Ljava/util/List;
    //   23: invokeinterface size : ()I
    //   28: if_icmpge -> 100
    //   31: aload_0
    //   32: getfield Zo : Ljava/util/List;
    //   35: iload #5
    //   37: invokeinterface get : (I)Ljava/lang/Object;
    //   42: checkcast burp/Ztbr
    //   45: astore #6
    //   47: aload #6
    //   49: invokeinterface ZqJ : ()Ljava/lang/String;
    //   54: aload_1
    //   55: invokeinterface ZqJ : ()Ljava/lang/String;
    //   60: invokevirtual equals : (Ljava/lang/Object;)Z
    //   63: ifeq -> 93
    //   66: aload #6
    //   68: invokeinterface Zqy : ()Ljava/lang/String;
    //   73: aload_1
    //   74: invokeinterface Zqy : ()Ljava/lang/String;
    //   79: invokevirtual equals : (Ljava/lang/Object;)Z
    //   82: ifeq -> 93
    //   85: iload #5
    //   87: istore #4
    //   89: aload_2
    //   90: ifnonnull -> 100
    //   93: iinc #5, 1
    //   96: aload_2
    //   97: ifnonnull -> 17
    //   100: iload #4
    //   102: iflt -> 115
    //   105: aload_0
    //   106: iload #4
    //   108: invokevirtual ZR : (I)V
    //   111: aload_2
    //   112: ifnonnull -> 122
    //   115: iconst_0
    //   116: getstatic net/portswigger/Zqf.ZH : Lnet/portswigger/Zqf;
    //   119: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   122: aload_3
    //   123: monitorexit
    //   124: goto -> 134
    //   127: astore #7
    //   129: aload_3
    //   130: monitorexit
    //   131: aload #7
    //   133: athrow
    //   134: return
    // Exception table:
    //   from	to	target	type
    //   11	124	127	finally
    //   127	131	127	finally
  }
  
  void Zy(Ztbr paramZtbr) {
    // Byte code:
    //   0: invokestatic Zs : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zo : Ljava/util/List;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: iconst_m1
    //   12: istore #4
    //   14: iconst_0
    //   15: istore #5
    //   17: iload #5
    //   19: aload_0
    //   20: getfield Zo : Ljava/util/List;
    //   23: invokeinterface size : ()I
    //   28: if_icmpge -> 100
    //   31: aload_0
    //   32: getfield Zo : Ljava/util/List;
    //   35: iload #5
    //   37: invokeinterface get : (I)Ljava/lang/Object;
    //   42: checkcast burp/Ztbr
    //   45: astore #6
    //   47: aload #6
    //   49: invokeinterface ZqJ : ()Ljava/lang/String;
    //   54: aload_1
    //   55: invokeinterface ZqJ : ()Ljava/lang/String;
    //   60: invokevirtual equals : (Ljava/lang/Object;)Z
    //   63: ifeq -> 93
    //   66: aload #6
    //   68: invokeinterface Zqy : ()Ljava/lang/String;
    //   73: aload_1
    //   74: invokeinterface Zqy : ()Ljava/lang/String;
    //   79: invokevirtual equals : (Ljava/lang/Object;)Z
    //   82: ifeq -> 93
    //   85: iload #5
    //   87: istore #4
    //   89: aload_2
    //   90: ifnonnull -> 100
    //   93: iinc #5, 1
    //   96: aload_2
    //   97: ifnonnull -> 17
    //   100: iload #4
    //   102: iflt -> 141
    //   105: aload_0
    //   106: getfield Zo : Ljava/util/List;
    //   109: iload #4
    //   111: invokeinterface remove : (I)Ljava/lang/Object;
    //   116: pop
    //   117: aload_0
    //   118: getfield Zo : Ljava/util/List;
    //   121: iload #4
    //   123: aload_1
    //   124: invokeinterface add : (ILjava/lang/Object;)V
    //   129: aload_0
    //   130: iload #4
    //   132: iload #4
    //   134: invokevirtual fireTableRowsUpdated : (II)V
    //   137: aload_2
    //   138: ifnonnull -> 148
    //   141: iconst_0
    //   142: getstatic net/portswigger/Zqf.ZH : Lnet/portswigger/Zqf;
    //   145: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   148: aload_3
    //   149: monitorexit
    //   150: goto -> 160
    //   153: astore #7
    //   155: aload_3
    //   156: monitorexit
    //   157: aload #7
    //   159: athrow
    //   160: return
    // Exception table:
    //   from	to	target	type
    //   11	150	153	finally
    //   153	157	153	finally
  }
  
  void ZV(Ztbr paramZtbr) {
    Zbqc[] arrayOfZbqc = Zxzh.Zs();
    synchronized (this.Zo) {
      String str = paramZtbr.ZqJ();
      byte b = 0;
      while (b < this.Zo.size() && str.compareTo(((Ztbr)this.Zo.get(b)).ZqJ()) >= 0) {
        b++;
        if (arrayOfZbqc == null)
          break; 
      } 
      this.Zo.add(b, paramZtbr);
      fireTableRowsInserted(b, b);
    } 
  }
  
  void Zf(Ztbr paramZtbr) {
    // Byte code:
    //   0: invokestatic Zs : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zo : Ljava/util/List;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: iconst_0
    //   12: istore #4
    //   14: iload #4
    //   16: aload_0
    //   17: getfield Zo : Ljava/util/List;
    //   20: invokeinterface size : ()I
    //   25: if_icmpge -> 80
    //   28: aload_1
    //   29: aload_0
    //   30: getfield Zo : Ljava/util/List;
    //   33: iload #4
    //   35: invokeinterface get : (I)Ljava/lang/Object;
    //   40: checkcast burp/Zgpi
    //   43: invokestatic ZI : (Lburp/Zgpi;Lburp/Zgpi;)Z
    //   46: ifeq -> 73
    //   49: aload_0
    //   50: getfield Zo : Ljava/util/List;
    //   53: iload #4
    //   55: invokeinterface remove : (I)Ljava/lang/Object;
    //   60: pop
    //   61: aload_0
    //   62: iload #4
    //   64: iload #4
    //   66: invokevirtual fireTableRowsDeleted : (II)V
    //   69: aload_2
    //   70: ifnonnull -> 80
    //   73: iinc #4, 1
    //   76: aload_2
    //   77: ifnonnull -> 14
    //   80: aload_3
    //   81: monitorexit
    //   82: goto -> 92
    //   85: astore #5
    //   87: aload_3
    //   88: monitorexit
    //   89: aload #5
    //   91: athrow
    //   92: return
    // Exception table:
    //   from	to	target	type
    //   11	82	85	finally
    //   85	89	85	finally
  }
  
  void ZP(Ztbr paramZtbr1, Ztbr paramZtbr2) {
    // Byte code:
    //   0: invokestatic Zs : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Zo : Ljava/util/List;
    //   8: dup
    //   9: astore #4
    //   11: monitorenter
    //   12: iconst_0
    //   13: istore #5
    //   15: iload #5
    //   17: aload_0
    //   18: getfield Zo : Ljava/util/List;
    //   21: invokeinterface size : ()I
    //   26: if_icmpge -> 93
    //   29: aload_0
    //   30: getfield Zo : Ljava/util/List;
    //   33: iload #5
    //   35: invokeinterface get : (I)Ljava/lang/Object;
    //   40: checkcast burp/Zgpi
    //   43: aload_1
    //   44: invokestatic ZI : (Lburp/Zgpi;Lburp/Zgpi;)Z
    //   47: ifeq -> 86
    //   50: aload_0
    //   51: getfield Zo : Ljava/util/List;
    //   54: iload #5
    //   56: invokeinterface remove : (I)Ljava/lang/Object;
    //   61: pop
    //   62: aload_0
    //   63: getfield Zo : Ljava/util/List;
    //   66: iload #5
    //   68: aload_2
    //   69: invokeinterface add : (ILjava/lang/Object;)V
    //   74: aload_0
    //   75: iload #5
    //   77: iload #5
    //   79: invokevirtual fireTableRowsUpdated : (II)V
    //   82: aload_3
    //   83: ifnonnull -> 93
    //   86: iinc #5, 1
    //   89: aload_3
    //   90: ifnonnull -> 15
    //   93: aload #4
    //   95: monitorexit
    //   96: goto -> 107
    //   99: astore #6
    //   101: aload #4
    //   103: monitorexit
    //   104: aload #6
    //   106: athrow
    //   107: return
    // Exception table:
    //   from	to	target	type
    //   12	96	99	finally
    //   99	104	99	finally
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '5eL¨S»ÒÙÇ\\tª*\\fz'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #83
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc '¿?µÔì4Îý'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #106
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zt_f.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zt_f.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #82
    //   214: goto -> 243
    //   217: bipush #91
    //   219: goto -> 243
    //   222: iconst_4
    //   223: goto -> 243
    //   226: bipush #72
    //   228: goto -> 243
    //   231: bipush #61
    //   233: goto -> 243
    //   236: bipush #87
    //   238: goto -> 243
    //   241: bipush #74
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE6EF) & 0xFFFF;
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
      byte b1 = 111;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt_f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */