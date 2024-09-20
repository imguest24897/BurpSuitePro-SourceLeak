package net.portswigger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;

public class Zrmx implements Zm1 {
  private static final Pattern Zd;
  
  public final Type Zp;
  
  public final String Zk;
  
  public final boolean ZF;
  
  public final Znu Zc;
  
  public final List<Zmx> ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static boolean Ze(Class<?> paramClass) {
    Zsi zsi = paramClass.<Zsi>getAnnotation(Zsi.class);
    return (zsi != null);
  }
  
  public Zrmx(Type paramType, boolean paramBoolean1, boolean paramBoolean2) {
    Zas zas = new Zas();
    if (Zt7.Zb(paramType) || !(paramType instanceof Class) || ((Class)paramType).isArray()) {
      zas.ZR((Function)Zqg.Zw(Zla.TYPE), paramType, a(-25176, -16270), new Object[0]);
      zas.Zz();
    } 
    Class clazz = (Class)paramType;
    int i = clazz.getModifiers();
    if (clazz.getEnclosingClass() != null && (i & 0x8) == 0) {
      zas.ZR((Function)Zqg.Zw(Zla.TYPE), paramType, a(-25172, -32610), new Object[0]);
      zas.Zz();
    } 
    if (!Modifier.isPublic(i))
      zas.ZR((Function)Zqg.Zy(Zla.MODIFIER), paramType, a(-25171, 2703), new Object[0]); 
    Zsi zsi = (Zsi)clazz.getAnnotation(Zsi.class);
    if (zsi == null)
      zas.ZR((Function)Zqg.Zi(Zla.ANNOTATION), paramType, a(-25156, -7399), new Object[] { Zsi.class }); 
    this.Zp = paramType;
    this.Zk = zsi.value();
    this.ZF = zsi.ZD();
    for (Method method : clazz.getDeclaredMethods()) {
      Zsb zsb = method.<Zsb>getAnnotation(Zsb.class);
      if (zsb != null)
        zas.ZZ((Function)Zqg.Zw(Zla.PATH_ELEMENT), clazz, zsi, method, zsb, a(-25181, 22359), new Object[] { Zsb.class, Zsi.class }); 
    } 
    ArrayList<Zmx> arrayList = new ArrayList();
    if (clazz.isEnum()) {
      this.Zc = null;
      HashMap<Object, Object> hashMap = new HashMap<>();
      if ((clazz.getEnumConstants()).length == 0)
        zas.Zs((Function)Zqg.Zi(Zla.VALUE), clazz, zsi, a(-25173, 29320), new Object[0]); 
      boolean bool = false;
      for (Field field : clazz.getFields()) {
        if (!field.isEnumConstant()) {
          Zvd zvd = field.<Zvd>getAnnotation(Zvd.class);
          if (zvd != null)
            zas.ZS((Function)Zqg.Zw(Zla.FIELD), clazz, zsi, field, zvd.Zp(), a(-25159, 14935), new Object[] { Zvd.class }); 
        } else {
          Zsr zsr = field.<Zsr>getAnnotation(Zsr.class);
          Zs9 zs9 = field.<Zs9>getAnnotation(Zs9.class);
          if (zs9 != null) {
            if (bool)
              zas.ZS((Function)Zqg.Zw(Zla.ANNOTATION), clazz, zsi, field, field.getName(), a(-25175, 11765), new Object[] { Zs9.class }); 
            bool = true;
          } 
          if (zsr == null) {
            zas.ZS((Function)Zqg.Zi(Zla.ANNOTATION), clazz, zsi, field, field.getName(), a(-25154, -198), new Object[] { Zsr.class });
          } else {
            Zmx zmx = new Zmx(field, Zt7.Zh(zsr.Zl(), zsi.value()), zsr.Zt());
            if (hashMap.containsKey(zmx.ZV))
              zas.ZS((Function)Zqg.Zw(Zla.CONSTANT), clazz, zsi, field, zsr.Zl(), a(-25178, -15073), new Object[] { zmx.ZV }); 
            arrayList.add(zmx);
            hashMap.put(zmx.ZV, zmx);
          } 
        } 
      } 
    } else {
      Constructor<?> constructor = Zt7.ZY(zas, paramType);
      if (constructor == null) {
        zas.Zs((Function)Zqg.Zi(Zla.CONSTRUCTOR), clazz, zsi, a(-25155, -3456), new Object[0]);
        zas.Zz();
      } 
      this.Zc = (constructor == null) ? null : new Znu(constructor, paramBoolean1, paramBoolean2);
      HashMap<Object, Object> hashMap = new HashMap<>();
      for (Class clazz1 = clazz; !Object.class.equals(clazz1); clazz1 = clazz1.getSuperclass()) {
        for (Field field : clazz1.getDeclaredFields()) {
          Zvd zvd = field.<Zvd>getAnnotation(Zvd.class);
          if (zvd != null) {
            if (field.getAnnotation(Zsr.class) != null)
              zas.ZS((Function)Zqg.Zw(Zla.ANNOTATION), clazz1, zsi, field, zvd.Zp(), a(-25184, 9287), new Object[] { Zsr.class, Zvd.class }); 
            int j = field.getModifiers();
            if (!Modifier.isPublic(j))
              zas.ZS((Function)Zqg.Zy(Zla.MODIFIER), clazz1, zsi, field, zvd.Zp(), a(-25179, -22912), new Object[0]); 
            String str1 = ZM(zvd.Zp(), field.getName());
            String str2 = paramBoolean1 ? Zt7.Zu(str1) : str1;
            Zmx zmx = new Zmx(field, str2, zvd.ZY());
            if (hashMap.containsKey(zmx.ZV))
              zas.ZS((Function)Zqg.Zw(Zla.FIELD), clazz1, zsi, field, zvd.Zp(), a(-25169, -21275), new Object[] { zmx.ZV }); 
            arrayList.add(zmx);
            hashMap.put(zmx.ZV, zmx);
          } 
        } 
      } 
      LinkedList<Class<?>> linkedList = new LinkedList(Arrays.asList((Object[])clazz.getInterfaces()));
      Class<?> clazz2 = clazz.getSuperclass();
      linkedList.add(clazz2);
      for (Class<?> clazz3 : linkedList) {
        if (Zkr.Za(clazz3)) {
          Zkr zkr = new Zkr(clazz3);
          if (!Arrays.<Class<?>>asList(zkr.ZF).contains(clazz))
            zas.Zs((Function)Zqg.Zi(Zla.IMPLEMENTATION), clazz, zsi, a(-25177, 28853), new Object[] { clazz3, Zt8.class }); 
          if (hashMap.containsKey(zkr.ZQ))
            zas.Zs((Function)Zqg.Zw(Zla.DISCRIMINATOR), clazz, zsi, a(-25182, -18087), new Object[] { clazz3, Zt8.class, zkr.ZQ }); 
        } 
      } 
      HashSet<String> hashSet = new HashSet();
      if (this.Zc != null) {
        for (Zmx zmx : arrayList) {
          Zm7 zm7 = this.Zc.ZW.ZY.get(zmx.ZV);
          if (zm7 == null) {
            zas.ZS((Function)Zqg.Zi(Zla.CONSTRUCTOR), clazz, zsi, zmx.ZW, zmx.ZV, a(-25160, 31329), new Object[0]);
            continue;
          } 
          if (!ZO(zmx, zm7)) {
            hashSet.add(zmx.ZV);
            zas.ZS((Function)Zqg.Zy(Zla.CONSTRUCTOR), clazz, zsi, zmx.ZW, zmx.ZV, a(-25180, 24815), new Object[] { zmx.Ze, zm7.Zq });
          } 
        } 
        for (Zm7 zm7 : this.Zc.ZW.ZA) {
          Zmx zmx = (Zmx)hashMap.get(zm7.ZF);
          if (zmx == null) {
            zas.Zs((Function)Zqg.Zi(Zla.FIELD), clazz, zsi, a(-25170, -14299), new Object[] { zm7.ZF });
            continue;
          } 
          if (!ZO(zmx, zm7) && !hashSet.contains(zmx.ZV))
            zas.ZS((Function)Zqg.Zy(Zla.FIELD), clazz, zsi, zmx.ZW, zmx.ZV, a(-25153, 11481), new Object[] { zmx.Ze, zm7.Zq }); 
        } 
      } 
    } 
    zas.Zz();
    this.ZP = Collections.unmodifiableList(arrayList);
  }
  
  private static boolean ZO(Zmx paramZmx, Zm7 paramZm7) {
    boolean bool = paramZm7.Zq.equals(paramZmx.Ze);
    return (bool || (paramZm7.Zq instanceof java.lang.reflect.GenericArrayType && paramZmx.Ze instanceof Class && ((Class)paramZmx.Ze).getCanonicalName().equals(paramZm7.Zq.toString().replace('$', '.'))));
  }
  
  private static String ZM(String paramString1, String paramString2) {
    return Zt7.ZS(a(-25174, 4366), Zd, a(-25183, 1963), paramString1, paramString2);
  }
  
  public void Zu(Zak paramZak) {
    paramZak.ZT(this);
  }
  
  public String Za() {
    return this.Zk;
  }
  
  public Type Zo() {
    return this.Zp;
  }
  
  static String Zd(String paramString) {
    return (paramString == null || paramString.isEmpty()) ? null : paramString;
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '+w*,¶Èn~Uä«EEµìþ1ðtFû=â5×¿vúHdª<|½ÊÒEðó9s´1ânÕ^ÏôÑÓk%êñHl×Qâö°.nÃùsÅâmÑÓã<È®z½v<ÓýB°åvÚ¥ À"\\fÊ-Óÿª2Å°òzm`V±ém5á·&Î°çp¶TæHæWséÜ:¦ËÙÿ\\fi=­Þ\\bu·ÑTqùß²þ°)gð'7Ú#â\òØ:0Ï%³b½u¨ç=I¹I"qúYÓ ëiS;%¥i¥{ä°,x\÷¾9ýÕ\\fËìúíü"ÿ]ð\\nb´>v0ÕGdå"c¡)HF¤nÉÕ\\rtn¸COùKá8Ø'éJ¸¬)piÆAÅ¸WÐñfÿïñ-÷,)Fæýá^lú*Ôqà·±ö=é3±Ðï¹dX¶5º6bKÅÝZ;sLôÿØëx{0'vÊù¢rã-@Þ\\njätøg-U©åðaáuè¹ðpË;f967þ\\f|EÖ§7×67>~ym®¶ò·;nðÕì§Ð-d®ÎªT;~îqeÞÕôCn%ù\@{EKTã>³rÛÔ­uvK¯>xù§/§²är 0TB=-,¸a2Å_`'Ð*çÆ\«ØÁý´*ýk=\\n¡`²!ôòªò)K¨YYtKöIr#¤­Íþx)j[î©Î4&ßìïÚ(n¹b¦B\\rÏ)Ý+%8_ÌâÐ¯ÌS'WÑ=½C]ÛX)Òèü->èÜPk°f§µº ÔêtFÂÉwÉàHÌAklkÐ}|Ø;Ú¯&fÜ²iHSN@½V#@°¿CÔ´ÛÀÑ?©HNCaiÓt®8tÒ»P9h×q1D¦:ÓzöBXj`õ5t"Ðl6ì÷+ "ØÈ_@îH~ð©5_,RÉFZ÷$Äºþq£M0H\\b»ëñòL!&¹òcÎ`÷\\nây·N`þÍcûÂÎìW·u¿éHxYvØúÕh,±C0ã¤¢êPg*ëFööf®aÐè'PË0wÖW6Æ¾ì©Í÷AÈ«~[3¼'N'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #33
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #37
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
    //   68: ldc 'áäÊA¸,\\bbqÀJ¶yæ©Ð×h´ðCî~ÈåDJ:¨Â}Ä "Cöæ\\n¼«.øðÈ«âE=IlL¹=z+öìaÿ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #40
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #9
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
    //   129: putstatic net/portswigger/Zrmx.a : [Ljava/lang/String;
    //   132: bipush #22
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/Zrmx.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_1
    //   213: goto -> 243
    //   216: bipush #34
    //   218: goto -> 243
    //   221: bipush #125
    //   223: goto -> 243
    //   226: bipush #80
    //   228: goto -> 243
    //   231: bipush #45
    //   233: goto -> 243
    //   236: bipush #127
    //   238: goto -> 243
    //   241: bipush #71
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: getstatic net/portswigger/Zfm.Zq : Ljava/util/regex/Pattern;
    //   303: putstatic net/portswigger/Zrmx.Zd : Ljava/util/regex/Pattern;
    //   306: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9DAC) & 0xFFFF;
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
      byte b1 = 86;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrmx.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */