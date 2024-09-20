package net.portswigger;

import burp.Zbqc;
import java.util.Iterator;
import java.util.Map;

public class Zez extends Zhb {
  private Integer Zw = null;
  
  private Integer Zk = null;
  
  private int Zg = 32768;
  
  private int ZY;
  
  private static final String[] c;
  
  private static final String[] d;
  
  protected Zez(Zlj paramZlj) {
    super(b(-358, -24949), paramZlj);
  }
  
  private int Zk() {
    return this.ZY;
  }
  
  public Zd2 Zf() {
    int i = Zhb.Zo();
    try {
      if (this.ZO == Zlj.SERVER)
        throw new IllegalStateException(b(-360, -5102)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    String str = String.format(b(-359, 23860), new Object[] { b(-361, -24628), b(-353, 32272), b(-354, 18255), b(-365, 31217) });
    Zvw zvw = Zvw.ZQ(new String[] { b(-367, 24050), str });
    try {
      if (Zbqc.Zwu() == null)
        Zhb.Zz(++i); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Zd2.ZN(zvw);
  }
  
  public Zd2 ZA() {
    int i = Zhb.ZK();
    try {
      if (this.ZO == Zlj.CLIENT)
        throw new IllegalStateException(b(-383, 17705)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    try {
      stringBuilder.append(b(-361, -24628)).append(";").append(" ");
      stringBuilder.append(b(-366, 25843)).append(";").append(" ");
      stringBuilder.append(b(-355, -20306)).append(";").append(" ");
      if (this.Zw != null)
        stringBuilder.append(b(-364, -10748)).append("=").append(this.Zw).append(";").append(" "); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
    Zvw zvw = Zvw.ZQ(new String[] { b(-362, 13763), stringBuilder.toString() });
    try {
      if (i != 0)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Zd2.ZN(zvw);
  }
  
  public void Zv() throws Zrmv {
    Iterator<Map.Entry> iterator = this.Zd.entrySet().iterator();
    int i = Zhb.Zo();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      Zp((String)entry.getKey(), (String)entry.getValue());
      if (i == 0)
        break; 
    } 
    this.ZY = 1024 + this.Zg;
  }
  
  private void Zp(String paramString1, String paramString2) throws Zrmv {
    // Byte code:
    //   0: aload_1
    //   1: astore #4
    //   3: invokestatic Zo : ()I
    //   6: iconst_m1
    //   7: istore #5
    //   9: istore_3
    //   10: aload #4
    //   12: invokevirtual hashCode : ()I
    //   15: lookupswitch default -> 176, -708713803 -> 56, 646404390 -> 149, 1266201133 -> 87, 2034279582 -> 118
    //   56: aload #4
    //   58: sipush #-355
    //   61: sipush #-20306
    //   64: invokestatic b : (II)Ljava/lang/String;
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: ifeq -> 176
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: iconst_0
    //   81: istore #5
    //   83: iload_3
    //   84: ifne -> 176
    //   87: aload #4
    //   89: sipush #-366
    //   92: sipush #25843
    //   95: invokestatic b : (II)Ljava/lang/String;
    //   98: invokevirtual equals : (Ljava/lang/Object;)Z
    //   101: ifeq -> 176
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: iconst_1
    //   112: istore #5
    //   114: iload_3
    //   115: ifne -> 176
    //   118: aload #4
    //   120: sipush #-363
    //   123: sipush #20718
    //   126: invokestatic b : (II)Ljava/lang/String;
    //   129: invokevirtual equals : (Ljava/lang/Object;)Z
    //   132: ifeq -> 176
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: iconst_2
    //   143: istore #5
    //   145: iload_3
    //   146: ifne -> 176
    //   149: aload #4
    //   151: sipush #-357
    //   154: sipush #4775
    //   157: invokestatic b : (II)Ljava/lang/String;
    //   160: invokevirtual equals : (Ljava/lang/Object;)Z
    //   163: ifeq -> 176
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: iconst_3
    //   174: istore #5
    //   176: iload #5
    //   178: tableswitch default -> 315, 0 -> 208, 1 -> 208, 2 -> 219, 3 -> 267
    //   208: iload_3
    //   209: ifne -> 351
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: aload_0
    //   220: getfield ZO : Lnet/portswigger/Zlj;
    //   223: getstatic net/portswigger/Zlj.SERVER : Lnet/portswigger/Zlj;
    //   226: if_acmpne -> 351
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   235: athrow
    //   236: aload_0
    //   237: aload_1
    //   238: aload_2
    //   239: invokevirtual ZH : (Ljava/lang/String;Ljava/lang/String;)I
    //   242: istore #6
    //   244: aload_0
    //   245: iload #6
    //   247: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   250: putfield Zw : Ljava/lang/Integer;
    //   253: aload_0
    //   254: aload_0
    //   255: iload #6
    //   257: invokevirtual Zk : (I)I
    //   260: putfield Zg : I
    //   263: iload_3
    //   264: ifne -> 351
    //   267: aload_0
    //   268: getfield ZO : Lnet/portswigger/Zlj;
    //   271: getstatic net/portswigger/Zlj.CLIENT : Lnet/portswigger/Zlj;
    //   274: if_acmpne -> 351
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   283: athrow
    //   284: aload_0
    //   285: aload_1
    //   286: aload_2
    //   287: invokevirtual ZH : (Ljava/lang/String;Ljava/lang/String;)I
    //   290: istore #6
    //   292: aload_0
    //   293: iload #6
    //   295: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   298: putfield Zk : Ljava/lang/Integer;
    //   301: aload_0
    //   302: aload_0
    //   303: iload #6
    //   305: invokevirtual Zk : (I)I
    //   308: putfield Zg : I
    //   311: iload_3
    //   312: ifne -> 351
    //   315: new net/portswigger/Zrmv
    //   318: dup
    //   319: sipush #-368
    //   322: sipush #30215
    //   325: invokestatic b : (II)Ljava/lang/String;
    //   328: iconst_2
    //   329: anewarray java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload_1
    //   335: aastore
    //   336: dup
    //   337: iconst_1
    //   338: aload_2
    //   339: aastore
    //   340: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   343: invokespecial <init> : (Ljava/lang/String;)V
    //   346: athrow
    //   347: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   350: athrow
    //   351: return
    // Exception table:
    //   from	to	target	type
    //   10	73	76	net/portswigger/Zrmv
    //   83	104	107	net/portswigger/Zrmv
    //   114	135	138	net/portswigger/Zrmv
    //   145	166	169	net/portswigger/Zrmv
    //   176	212	215	net/portswigger/Zrmv
    //   208	229	232	net/portswigger/Zrmv
    //   244	277	280	net/portswigger/Zrmv
    //   292	347	347	net/portswigger/Zrmv
  }
  
  private int Zk(int paramInt) {
    int j = 256;
    byte b = 8;
    int i = Zhb.Zo();
    while (b < paramInt) {
      j *= 2;
      b++;
      if (i == 0)
        break; 
    } 
    return j;
  }
  
  private int ZH(String paramString1, String paramString2) throws Zrmv {
    int i = Zc(paramString2);
    if (i < 0) {
      String str = String.format(b(-356, 14410), new Object[] { paramString1, paramString2 });
      throw new Zrmv(str);
    } 
    return i;
  }
  
  private int Zc(String paramString) {
    int i;
    try {
      if (paramString == null)
        return -1; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      i = Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      return -1;
    } 
    try {
      if (i >= 8)
        try {
          return (15 >= i) ? i : -1;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return -1;
  }
  
  public Zto<byte[], Zo> Z_(byte[] paramArrayOfbyte) {
    try {
      if (Za(paramArrayOfbyte))
        return (Zto)Zto.ZM(ZT(paramArrayOfbyte), new Zo(true, false, false)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (Zto)Zto.ZM(paramArrayOfbyte, new Zo());
  }
  
  public Zto<byte[], Zo> ZE(byte[] paramArrayOfbyte, Zo paramZo) {
    try {
      if (Zf(paramZo))
        return (Zto)Zto.ZM(ZY(paramArrayOfbyte), Zr(paramZo)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (Zto)Zto.ZM(paramArrayOfbyte, paramZo);
  }
  
  private Zo Zr(Zo paramZo) {
    return paramZo.Zv();
  }
  
  private boolean Zf(Zo paramZo) {
    return paramZo.ZO;
  }
  
  private byte[] ZT(byte[] paramArrayOfbyte) {
    try {
      Zmb zmb = new Zmb();
      zmb.ZU(paramArrayOfbyte);
      byte[] arrayOfByte = zmb.Zd();
      return Zv(arrayOfByte);
    } catch (Exception exception) {
      throw new RuntimeException(exception.getMessage(), exception);
    } 
  }
  
  private byte[] Zv(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length + 1];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
    arrayOfByte[paramArrayOfbyte.length] = 1;
    return arrayOfByte;
  }
  
  private boolean Za(byte[] paramArrayOfbyte) {
    try {
      if (this.Zg != 32768) {
        try {
          if (paramArrayOfbyte.length < this.Zg);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private byte[] ZY(byte[] paramArrayOfbyte) {
    try {
      Znh znh = new Znh(Zk());
      znh.Zc(paramArrayOfbyte);
      return znh.Zw();
    } catch (Exception exception) {
      throw new RuntimeException(exception.getMessage(), exception);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'çMsvoUcc¾è¬|ûlÊ.ü1-±æ÷u¢ñaÄ­{Cé©#¨ÿÐ=E×é¬¸cãä¸µ6¶85Âá«Séé]qCÓÜïÿ!³Fá){ÖÌ«9ÊWôËD¹u;ìÅçFWøAØoèNliçÎlw/ÉrÐ(v\\tËæ>/d,øf4 îLï\ñï¼Ùç»¿w¹õ \\f¹å;öv é²J$ìTPÌpÇ`ùðvRDØùÓ|¼ðaÙîZV=Ê}oÃyÐS ê)5õÛ3ÓS²Åþ1t?Ø/rR°ÄmÂ\\b+û<ûè¶UÅÔÁ(:ô>¬½Ü]ÁnV,ÏR3Ù¨/hñü8b¹Ì$ZYè:Ú§TºBN:e¤<Ê}?nü7(wì­Â°¾Ee2ÿûÔ¼Ô_Jíó¾ÞcN\\b½oþ]H 9H´èåã^y<Å?¡^X\N?Çëù,:ñÞÒ²\\b¡µÚä?ÀñÃë¤õÙÚ`H1Ä¨Ú¼Rc¶©EËËìèMcÏi¯×;i"R"&H'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #24
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #73
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
    //   68: ldc '§ÉL¯É["IþÏéò=}%7õ¿æZ¾ÉL IKã\\n|ëi^»³Ão¨ÆQÎ5.áª]+¼Óíöé°C²1Ó µÐ¬oxZwblÀ!²Æ¤ÙÃºéTC×N´ÒR®s¨spe'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #26
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #20
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
    //   129: putstatic net/portswigger/Zez.c : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/Zez.d : [Ljava/lang/String;
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
    //   212: bipush #56
    //   214: goto -> 244
    //   217: bipush #81
    //   219: goto -> 244
    //   222: bipush #79
    //   224: goto -> 244
    //   227: bipush #6
    //   229: goto -> 244
    //   232: bipush #115
    //   234: goto -> 244
    //   237: bipush #27
    //   239: goto -> 244
    //   242: bipush #56
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
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFE91) & 0xFFFF;
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
      byte b1 = 109;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zez.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */