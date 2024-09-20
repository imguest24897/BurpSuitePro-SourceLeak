package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Zep2 implements Zkrr {
  private static final List<String> ZT;
  
  private static final List<String> Z_;
  
  private static final List<String> Zo;
  
  private final Zsoh ZV;
  
  private final Zm6e Zz;
  
  private final Ze3n ZI;
  
  private final Zkq4 ZD;
  
  private final Zkc4 Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zep2(Zsoh paramZsoh, Zkl6 paramZkl6, Ze3n paramZe3n, Zkq4 paramZkq4) {
    this.ZV = paramZsoh;
    String[] arrayOfString = Zsmw.ZB();
    this.Zz = paramZkl6.Zs();
    this.ZI = paramZe3n;
    this.ZD = paramZkq4;
    this.Zf = new Zkc4();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APH_OpenApiDefinitionFound;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    Zz(paramZtpx, paramZz4_);
    Zy(paramZtpx, paramZz4_);
    Zx(paramZtpx, paramZz4_);
    String[] arrayOfString = Zsmw.ZB();
    if (this.ZD.ZqT() == Zlk4.THOROUGH)
      Zl(paramZtpx, paramZz4_); 
    if (Zbqc.Zwu() == null)
      Zsmw.ZO(new String[3]); 
  }
  
  private void Zz(Ztpx paramZtpx, Zz4_ paramZz4_) {
    String[] arrayOfString = Zsmw.ZB();
    for (String str : ZT) {
      byte[] arrayOfByte = this.Zz.ZO().Zf(new Zax(this.ZI.Za(), Zkb.Zy(str))).Zr().ZiD();
      Zsxd zsxd = Zq(paramZtpx, arrayOfByte);
      Zefx zefx = zsxd.ZG().ZL();
      Zb6q zb6q = zsxd.ZG().Ze();
      Zsmw zsmw = this.Zf.Zs(zb6q);
      if (zsmw.ZV())
        Zo(str, zefx, zb6q, paramZz4_); 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void Zy(Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: invokestatic ZB : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: getstatic burp/Zep2.Z_ : Ljava/util/List;
    //   7: invokeinterface iterator : ()Ljava/util/Iterator;
    //   12: astore #4
    //   14: aload #4
    //   16: invokeinterface hasNext : ()Z
    //   21: ifeq -> 182
    //   24: aload #4
    //   26: invokeinterface next : ()Ljava/lang/Object;
    //   31: checkcast java/lang/String
    //   34: astore #5
    //   36: aload_0
    //   37: getfield Zz : Lburp/Zm6e;
    //   40: invokeinterface ZO : ()Lburp/Ztom;
    //   45: new burp/Zax
    //   48: dup
    //   49: aload_0
    //   50: getfield ZI : Lburp/Ze3n;
    //   53: invokevirtual Za : ()Lburp/Zmzk;
    //   56: aload #5
    //   58: invokestatic Zy : (Ljava/lang/String;)[B
    //   61: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   64: invokevirtual Zf : (Lburp/Zlit;)Lburp/Ztom;
    //   67: invokevirtual Zr : ()Lburp/Zstu;
    //   70: invokeinterface ZiD : ()[B
    //   75: astore #6
    //   77: aload_0
    //   78: aload_1
    //   79: aload #6
    //   81: invokevirtual Zq : (Lburp/Ztpx;[B)Lburp/Zsxd;
    //   84: astore #7
    //   86: aload #7
    //   88: invokeinterface ZG : ()Lburp/Zg3d;
    //   93: invokeinterface ZL : ()Lburp/Zefx;
    //   98: astore #8
    //   100: aload #7
    //   102: invokeinterface ZG : ()Lburp/Zg3d;
    //   107: invokeinterface Ze : ()Lburp/Zb6q;
    //   112: astore #9
    //   114: aload_0
    //   115: getfield Zf : Lburp/Zkc4;
    //   118: aload #9
    //   120: invokevirtual Zs : (Lburp/Zb6q;)Lburp/Zsmw;
    //   123: astore #10
    //   125: aload #10
    //   127: invokevirtual ZV : ()Z
    //   130: ifeq -> 148
    //   133: aload_0
    //   134: aload #5
    //   136: aload #8
    //   138: aload #9
    //   140: aload_2
    //   141: invokevirtual Zo : (Ljava/lang/String;Lburp/Zefx;Lburp/Zb6q;Lburp/Zz4_;)V
    //   144: aload_3
    //   145: ifnonnull -> 178
    //   148: aload_0
    //   149: getfield Zf : Lburp/Zkc4;
    //   152: aload #9
    //   154: invokevirtual Zx : (Lburp/Zb6q;)Lburp/Zsmw;
    //   157: astore #10
    //   159: aload #10
    //   161: invokevirtual ZV : ()Z
    //   164: ifeq -> 178
    //   167: aload_0
    //   168: aload #5
    //   170: aload #8
    //   172: aload #9
    //   174: aload_2
    //   175: invokevirtual Zo : (Ljava/lang/String;Lburp/Zefx;Lburp/Zb6q;Lburp/Zz4_;)V
    //   178: aload_3
    //   179: ifnonnull -> 14
    //   182: return
  }
  
  private void Zx(Ztpx paramZtpx, Zz4_ paramZz4_) {
    byte[] arrayOfByte = this.Zz.ZO().Zf(new Zax(this.ZI.Za(), Zkb.Zy(a(-16114, -8517)))).Zr().ZiD();
    Zsxd zsxd = Zq(paramZtpx, arrayOfByte);
    Zefx zefx = zsxd.ZG().ZL();
    Zb6q zb6q = zsxd.ZG().Ze();
    Zsmw zsmw = this.Zf.Zf(zb6q);
    if (zsmw.ZV())
      Zo(a(-16097, 6875), zefx, zb6q, paramZz4_); 
  }
  
  private void Zl(Ztpx paramZtpx, Zz4_ paramZz4_) {
    String[] arrayOfString = Zsmw.ZB();
    for (String str : Zo) {
      byte[] arrayOfByte = this.Zz.ZO().Zf(new Zax(this.ZI.Za(), Zkb.Zy(str))).Zr().ZiD();
      Zsxd zsxd = Zq(paramZtpx, arrayOfByte);
      Zefx zefx = zsxd.ZG().ZL();
      Zb6q zb6q = zsxd.ZG().Ze();
      Zsmw zsmw = this.Zf.Zx(zb6q);
      if (zsmw.ZV())
        Zo(str, zefx, zb6q, paramZz4_); 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private Zsxd Zq(Ztpx paramZtpx, byte[] paramArrayOfbyte) {
    return this.ZV.ZD(Ztao.Zc(paramZtpx, this.ZI.ZM(), paramArrayOfbyte).Zz(true).ZA());
  }
  
  private void Zo(String paramString, Zefx paramZefx, Zb6q paramZb6q, Zz4_ paramZz4_) {
    Zvow zvow = this.ZI.ZI().ZC(paramZefx).Zo(paramZb6q);
    paramZz4_.Zz(Zxr0.Z_(Zzu2.OPENAPI_DEFINITION_FOUND_ACTIVE, this.ZI.Za(), Zkb.Zy(paramString), zvow));
  }
  
  public String toString() {
    return Zp().name();
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '²\\tÚÓ&âyõ7ÝcÕøu Ó±yþ½Ëµ@\\n(ÏÈqÔè)óue"Z¹-ã°ò^+2­Ô\\rÈ9fOûLË}µnD#òTk(/4!®¾ï±s~»=ksà+ËzxÝHIa%Þ¸sh~w%ä¡÷øM&JyØÊ$Ä.dwWÅ­¹,¹ÍâKC½o>ý½U½3sÑñ\\rïëíWêPÙhÏÁJÌ?U)þ½bþJ±ßJðY\\rÐ£ÿ÷Í»_È\\nk]K¯ñHwÓ{ù_4û\\reÖ%ÊÞ³ÑÌ¾è1¢ÇñÌòbÝ1#-©0V¤\\bÖSèzg¥æY­âºmêrwÀ¦Ï4úNÍÝ»ËJÄÏ4#\\nXYå{ÀC¸xmå§q¬çÍia¢9Õ/nâDLòcTÖ¸5Û\\b'ómn×'ð^~FÒ²°\¬ëVnnò@cuK²¨;Óé2è´BDÁBùBÌÁ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #26
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
    //   68: ldc 'Ði1­pw\\rç¾×:ª"Àõ6R'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #31
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
    //   129: putstatic burp/Zep2.a : [Ljava/lang/String;
    //   132: bipush #24
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zep2.b : [Ljava/lang/String;
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
    //   212: bipush #81
    //   214: goto -> 244
    //   217: bipush #89
    //   219: goto -> 244
    //   222: bipush #71
    //   224: goto -> 244
    //   227: bipush #30
    //   229: goto -> 244
    //   232: bipush #53
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #27
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
    //   300: sipush #-16104
    //   303: sipush #21055
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: sipush #-16115
    //   312: sipush #6761
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: sipush #-16118
    //   321: sipush #13356
    //   324: invokestatic a : (II)Ljava/lang/String;
    //   327: sipush #-16120
    //   330: sipush #-2676
    //   333: invokestatic a : (II)Ljava/lang/String;
    //   336: sipush #-16128
    //   339: sipush #4638
    //   342: invokestatic a : (II)Ljava/lang/String;
    //   345: sipush #-16098
    //   348: sipush #-2705
    //   351: invokestatic a : (II)Ljava/lang/String;
    //   354: sipush #-16117
    //   357: sipush #-25090
    //   360: invokestatic a : (II)Ljava/lang/String;
    //   363: sipush #-16101
    //   366: sipush #-13120
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   375: putstatic burp/Zep2.ZT : Ljava/util/List;
    //   378: sipush #-16103
    //   381: sipush #-5027
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: sipush #-16100
    //   390: sipush #26856
    //   393: invokestatic a : (II)Ljava/lang/String;
    //   396: sipush #-16116
    //   399: sipush #-23144
    //   402: invokestatic a : (II)Ljava/lang/String;
    //   405: sipush #-16122
    //   408: sipush #-4474
    //   411: invokestatic a : (II)Ljava/lang/String;
    //   414: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   417: putstatic burp/Zep2.Z_ : Ljava/util/List;
    //   420: sipush #-16124
    //   423: sipush #29078
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: sipush #-16126
    //   432: sipush #20073
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: sipush #-16125
    //   441: sipush #-7307
    //   444: invokestatic a : (II)Ljava/lang/String;
    //   447: sipush #-16113
    //   450: sipush #20714
    //   453: invokestatic a : (II)Ljava/lang/String;
    //   456: sipush #-16123
    //   459: sipush #-6524
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: sipush #-16127
    //   468: sipush #1184
    //   471: invokestatic a : (II)Ljava/lang/String;
    //   474: sipush #-16099
    //   477: sipush #1377
    //   480: invokestatic a : (II)Ljava/lang/String;
    //   483: sipush #-16121
    //   486: sipush #16656
    //   489: invokestatic a : (II)Ljava/lang/String;
    //   492: sipush #-16119
    //   495: sipush #-26021
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: sipush #-16102
    //   504: sipush #21184
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   513: putstatic burp/Zep2.Zo : Ljava/util/List;
    //   516: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC10F) & 0xFFFF;
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
      byte b1 = 102;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zep2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */