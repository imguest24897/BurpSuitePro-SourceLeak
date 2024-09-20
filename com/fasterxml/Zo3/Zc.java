package com.fasterxml.Zo3;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zp.Zd;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zp.Zz;
import com.fasterxml.Zyc;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zc extends Zi {
  private static final long serialVersionUID = 1L;
  
  private static final BitSet Zz;
  
  private final Map<String, Integer> Zi = new HashMap<>();
  
  private final Map<BitSet, String> ZE;
  
  private static final String[] g;
  
  private static final String[] h;
  
  public Zc(Zk paramZk1, Zz paramZz, Zk paramZk2, Zyc paramZyc, Collection<Zd> paramCollection) {
    super(paramZk1, paramZz, (String)null, false, paramZk2, (Zyc)null, true);
    this.ZE = ZE(paramZyc, paramCollection);
  }
  
  public Zc(Zc paramZc, Zo paramZo) {
    super(paramZc, paramZo);
    this.ZE = paramZc.ZE;
  }
  
  public Zt Zf(Zo paramZo) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (paramZo == this.ZU) ? this : new Zc(this, paramZo);
  }
  
  protected Map<BitSet, String> ZE(Zyc paramZyc, Collection<Zd> paramCollection) {
    boolean bool = paramZyc.ZB(Zy9.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
    byte b = 0;
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Zd> iterator = paramCollection.iterator();
    String[] arrayOfString = Zo.Zs();
    while (iterator.hasNext()) {
      Zd zd = iterator.next();
      Zk zk = paramZyc.Zg().ZY(zd.Zm());
      List list = paramZyc.ZA(zk).ZT();
      BitSet bitSet = new BitSet(b + list.size());
      for (Zp zp : list) {
        String str1 = zp.ZT();
        if (bool)
          str1 = str1.toLowerCase(); 
        Integer integer = this.Zi.get(str1);
        if (integer == null) {
          integer = Integer.valueOf(b++);
          this.Zi.put(str1, integer);
        } 
        for (Zr zr : zp.Zp()) {
          String str2 = zr.Zb();
          if (bool)
            str2 = str2.toLowerCase(); 
          try {
            if (!this.Zi.containsKey(str2))
              this.Zi.put(str2, integer); 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          if (arrayOfString != null)
            break; 
        } 
        bitSet.set(integer.intValue());
        if (arrayOfString != null)
          break; 
      } 
      String str = (String)hashMap.put(bitSet, zd.Zm().getName());
      try {
        if (str != null)
          throw new IllegalStateException(String.format(d(27919, 27960), new Object[] { str, zd.Zm().getName() })); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      if (arrayOfString != null)
        break; 
    } 
    return (Map)hashMap;
  }
  
  public Object ZC(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zs : ()[Ljava/lang/String;
    //   3: aload_1
    //   4: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   7: astore #4
    //   9: astore_3
    //   10: aload #4
    //   12: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   15: if_acmpne -> 28
    //   18: aload_1
    //   19: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   22: astore #4
    //   24: aload_3
    //   25: ifnull -> 64
    //   28: aload #4
    //   30: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   33: if_acmpeq -> 64
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_0
    //   44: aload_1
    //   45: aload_2
    //   46: aconst_null
    //   47: sipush #27918
    //   50: sipush #-10476
    //   53: invokestatic d : (II)Ljava/lang/String;
    //   56: invokevirtual Zp : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zm/Zl;Ljava/lang/String;)Ljava/lang/Object;
    //   59: areturn
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload #4
    //   66: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   69: if_acmpne -> 108
    //   72: aload_0
    //   73: getfield ZE : Ljava/util/Map;
    //   76: getstatic com/fasterxml/Zo3/Zc.Zz : Ljava/util/BitSet;
    //   79: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   84: checkcast java/lang/String
    //   87: astore #5
    //   89: aload #5
    //   91: ifnull -> 108
    //   94: aload_0
    //   95: aload_1
    //   96: aload_2
    //   97: aconst_null
    //   98: aload #5
    //   100: invokevirtual ZG : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zm/Zl;Ljava/lang/String;)Ljava/lang/Object;
    //   103: areturn
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: new java/util/LinkedList
    //   111: dup
    //   112: aload_0
    //   113: getfield ZE : Ljava/util/Map;
    //   116: invokeinterface keySet : ()Ljava/util/Set;
    //   121: invokespecial <init> : (Ljava/util/Collection;)V
    //   124: astore #5
    //   126: aload_2
    //   127: aload_1
    //   128: invokevirtual Zb : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zm/Zl;
    //   131: astore #6
    //   133: aload_2
    //   134: getstatic com/fasterxml/Zor/Zy9.ACCEPT_CASE_INSENSITIVE_PROPERTIES : Lcom/fasterxml/Zor/Zy9;
    //   137: invokevirtual Zm : (Lcom/fasterxml/Zor/Zy9;)Z
    //   140: istore #7
    //   142: aload #4
    //   144: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   147: if_acmpne -> 266
    //   150: aload_1
    //   151: invokevirtual ZS : ()Ljava/lang/String;
    //   154: astore #8
    //   156: iload #7
    //   158: ifeq -> 168
    //   161: aload #8
    //   163: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   166: astore #8
    //   168: aload #6
    //   170: aload_1
    //   171: invokevirtual ZE : (Lcom/fasterxml/Zb/Zg;)V
    //   174: aload_0
    //   175: getfield Zi : Ljava/util/Map;
    //   178: aload #8
    //   180: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   185: checkcast java/lang/Integer
    //   188: astore #9
    //   190: aload #9
    //   192: ifnull -> 256
    //   195: aload #5
    //   197: aload #9
    //   199: invokevirtual intValue : ()I
    //   202: invokestatic Za : (Ljava/util/List;I)V
    //   205: aload #5
    //   207: invokeinterface size : ()I
    //   212: iconst_1
    //   213: if_icmpne -> 256
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: aload_0
    //   224: aload_1
    //   225: aload_2
    //   226: aload #6
    //   228: aload_0
    //   229: getfield ZE : Ljava/util/Map;
    //   232: aload #5
    //   234: iconst_0
    //   235: invokeinterface get : (I)Ljava/lang/Object;
    //   240: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   245: checkcast java/lang/String
    //   248: invokevirtual ZG : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zm/Zl;Ljava/lang/String;)Ljava/lang/Object;
    //   251: areturn
    //   252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: aload_1
    //   257: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   260: astore #4
    //   262: aload_3
    //   263: ifnull -> 142
    //   266: sipush #27917
    //   269: sipush #-8408
    //   272: invokestatic d : (II)Ljava/lang/String;
    //   275: iconst_2
    //   276: anewarray java/lang/Object
    //   279: dup
    //   280: iconst_0
    //   281: aload_0
    //   282: getfield Za : Lcom/fasterxml/Zor/Zk;
    //   285: invokestatic ZN : (Lcom/fasterxml/Zor/Zk;)Ljava/lang/String;
    //   288: aastore
    //   289: dup
    //   290: iconst_1
    //   291: aload #5
    //   293: invokeinterface size : ()I
    //   298: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   301: aastore
    //   302: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   305: astore #8
    //   307: aload_0
    //   308: aload_1
    //   309: aload_2
    //   310: aload #6
    //   312: aload #8
    //   314: invokevirtual Zp : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zm/Zl;Ljava/lang/String;)Ljava/lang/Object;
    //   317: areturn
    // Exception table:
    //   from	to	target	type
    //   24	36	39	java/io/IOException
    //   28	60	60	java/io/IOException
    //   89	104	104	java/io/IOException
    //   190	216	219	java/io/IOException
    //   195	252	252	java/io/IOException
  }
  
  private static void Za(List<BitSet> paramList, int paramInt) {
    Iterator<BitSet> iterator = paramList.iterator();
    String[] arrayOfString = Zo.Zs();
    while (iterator.hasNext()) {
      if (!((BitSet)iterator.next()).get(paramInt)) {
        iterator.remove();
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ªñpCè]ÞlðË¥9¥úí±µ÷¦ìVòE\\n¯<²ÅV­ajcùH½¼âó1[/XNNäÆ)42\\tÜÕEñW%qßE4¦FmöCþ8Xí±âL/\\n¾Iò­>øiÉÐÈbÂ¾a± ÊÉ4:0jÑ&+$Ý¹T´[ÌÑQóR'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #74
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #96
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
    //   69: putstatic com/fasterxml/Zo3/Zc.g : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zo3/Zc.h : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #116
    //   154: goto -> 183
    //   157: bipush #42
    //   159: goto -> 183
    //   162: bipush #29
    //   164: goto -> 183
    //   167: bipush #85
    //   169: goto -> 183
    //   172: bipush #40
    //   174: goto -> 183
    //   177: iconst_1
    //   178: goto -> 183
    //   181: bipush #99
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
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
    //   223: goto -> 39
    //   226: new java/util/BitSet
    //   229: dup
    //   230: iconst_0
    //   231: invokespecial <init> : (I)V
    //   234: putstatic com/fasterxml/Zo3/Zc.Zz : Ljava/util/BitSet;
    //   237: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6D0F) & 0xFFFF;
    if (h[i] == null) {
      char[] arrayOfChar = g[i].toCharArray();
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
      byte b1 = 48;
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
      h[i] = (new String(arrayOfChar)).intern();
    } 
    return h[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */