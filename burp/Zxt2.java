package burp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JLayeredPane;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zxt2 {
  private final Path ZA;
  
  private final Zi7 ZW;
  
  private final AtomicBoolean Zb = new AtomicBoolean(false);
  
  private final AtomicBoolean Zi = new AtomicBoolean(false);
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxt2(Zz0n paramZz0n, Zi7 paramZi7) {
    this.ZA = Zz(paramZz0n);
    this.ZW = paramZi7;
  }
  
  public void ZS() {
    this.Zi.set(true);
    Zc();
  }
  
  private void Zc() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZW : Lburp/Zi7;
    //   4: getfield Zl : Ljava/util/function/Supplier;
    //   7: invokeinterface get : ()Ljava/lang/Object;
    //   12: checkcast burp/Zl04
    //   15: astore_2
    //   16: invokestatic Za : ()[Lburp/Zbqc;
    //   19: aload_2
    //   20: invokestatic ZE : (Ljava/awt/Window;)Z
    //   23: istore_3
    //   24: astore_1
    //   25: iload_3
    //   26: ifne -> 129
    //   29: invokestatic ZK : ()Z
    //   32: ifeq -> 129
    //   35: aload_0
    //   36: invokevirtual ZV : ()Ljava/util/Optional;
    //   39: astore #4
    //   41: invokestatic ZG : ()Z
    //   44: ifeq -> 69
    //   47: aload_0
    //   48: getfield ZW : Lburp/Zi7;
    //   51: getfield ZY : Ljava/util/function/Supplier;
    //   54: invokeinterface get : ()Ljava/lang/Object;
    //   59: checkcast java/lang/Runnable
    //   62: invokestatic Zm : (Ljava/lang/Runnable;)V
    //   65: aload_1
    //   66: ifnonnull -> 129
    //   69: aload_0
    //   70: getfield Zi : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   73: invokevirtual get : ()Z
    //   76: ifeq -> 129
    //   79: aload #4
    //   81: invokevirtual isPresent : ()Z
    //   84: ifeq -> 129
    //   87: aload #4
    //   89: invokevirtual get : ()Ljava/lang/Object;
    //   92: checkcast burp/Zga8
    //   95: astore #5
    //   97: aload_0
    //   98: getfield ZW : Lburp/Zi7;
    //   101: invokevirtual Zw : ()Z
    //   104: ifeq -> 129
    //   107: aload_0
    //   108: getfield Zb : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   111: invokevirtual get : ()Z
    //   114: ifne -> 129
    //   117: aload_0
    //   118: aload_2
    //   119: aload #5
    //   121: <illegal opcode> run : (Lburp/Zxt2;Lburp/Zl04;Lburp/Zga8;)Ljava/lang/Runnable;
    //   126: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   129: return
  }
  
  private void Zy(Zl04 paramZl04, Runnable paramRunnable, String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getRootPane : ()Ljavax/swing/JRootPane;
    //   4: astore #5
    //   6: aload #5
    //   8: invokevirtual getLayeredPane : ()Ljavax/swing/JLayeredPane;
    //   11: astore #6
    //   13: new burp/Zg8l
    //   16: dup
    //   17: aload_3
    //   18: aload #4
    //   20: aload_2
    //   21: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   24: astore #7
    //   26: new burp/Zg86
    //   29: dup
    //   30: aload #7
    //   32: aload_1
    //   33: invokespecial <init> : (Lburp/Zg8l;Lburp/Zl04;)V
    //   36: astore #8
    //   38: aload #7
    //   40: aload #6
    //   42: aload #8
    //   44: <illegal opcode> run : (Ljavax/swing/JLayeredPane;Lburp/Zg86;)Ljava/lang/Runnable;
    //   49: invokevirtual ZE : (Ljava/lang/Runnable;)V
    //   52: aload #6
    //   54: aload #8
    //   56: getstatic javax/swing/JLayeredPane.POPUP_LAYER : Ljava/lang/Integer;
    //   59: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   62: aload_0
    //   63: getfield Zb : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   66: iconst_1
    //   67: invokevirtual set : (Z)V
    //   70: aload #7
    //   72: invokevirtual ZL : ()V
    //   75: return
  }
  
  public void ZU(Zga8 paramZga8) {
    if (paramZga8.ZO() && !Zsht.ZK()) {
      Zsht.ZO(paramZga8.ZR().getAbsolutePath(), paramZga8.Zz());
      ZR();
      Zc();
    } 
  }
  
  public Zga8 Zb(Zge8 paramZge8) {
    ZV().ifPresent(paramZge8::lambda$createDownload$3);
    return new Zga8(ZQ(paramZge8.ZE), ZN(), paramZge8);
  }
  
  public Optional<Zga8> ZV() {
    if (!Files.exists(this.ZA, new java.nio.file.LinkOption[0]))
      try {
        Files.createDirectories(this.ZA, (FileAttribute<?>[])new FileAttribute[0]);
      } catch (IOException iOException) {
        Zah.Zl(iOException, Zk_.UNEXPECTED);
      }  
    File file = ZN();
    Zge8 zge8 = null;
    if (file.exists())
      zge8 = Zxeh.ZQ(file); 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (zge8 == null) ? Optional.<Zga8>empty() : Optional.<Zga8>of(new Zga8(ZQ(zge8.ZE), ZN(), zge8));
  }
  
  private File ZN() {
    return Paths.get(this.ZA.toString(), new String[] { a(-15409, -19750) }).toFile();
  }
  
  private File ZQ(String paramString) {
    return Paths.get(this.ZA.toString(), new String[] { paramString }).toFile();
  }
  
  public boolean Zz() {
    return ((Boolean)ZV().map(Zxt2::lambda$installerIsFailing$4).map(Zxt2::lambda$installerIsFailing$5).orElse(Boolean.valueOf(false))).booleanValue();
  }
  
  private void ZR() {
    ZV().ifPresent(Zxt2::lambda$incrementScheduledCount$6);
  }
  
  public void Zf() {
    ZV().ifPresent(Zga8::Zf);
  }
  
  private static Path Zz(Zz0n paramZz0n) {
    return Paths.get(paramZz0n.ZR().Zc().getPath(), new String[] { a(-15410, 22429), Zsk5.Zd() });
  }
  
  private static void lambda$incrementScheduledCount$6(Zga8 paramZga8) {
    Zxeh.Zw(paramZga8.Zk());
  }
  
  private static Boolean lambda$installerIsFailing$5(Integer paramInteger) {
    return Boolean.valueOf((paramInteger.intValue() >= 2));
  }
  
  private static Integer lambda$installerIsFailing$4(Zga8 paramZga8) {
    return Integer.valueOf(Zxeh.ZB(paramZga8.Zk()));
  }
  
  private static void lambda$createDownload$3(Zge8 paramZge8, Zga8 paramZga8) {
    if (!paramZga8.Zz().equals(paramZge8.Zo))
      paramZga8.Zf(); 
  }
  
  private static void lambda$displayUpdateReadyPrompt$2(JLayeredPane paramJLayeredPane, Zg86 paramZg86) {
    paramJLayeredPane.remove(paramZg86);
    paramJLayeredPane.repaint();
  }
  
  private void lambda$installUpdateIfRequired$1(Zl04 paramZl04, Zga8 paramZga8) {
    Zy(paramZl04, this::lambda$installUpdateIfRequired$0, paramZga8.Zc(), paramZga8.ZN());
  }
  
  private void lambda$installUpdateIfRequired$0() {
    Zsht.Zm(this.ZW.ZY.get());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '@Ê_ñ}R¯úýù!`IùåT'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #19
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
    //   69: putstatic burp/Zxt2.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zxt2.b : [Ljava/lang/String;
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
    //   152: bipush #113
    //   154: goto -> 183
    //   157: bipush #98
    //   159: goto -> 183
    //   162: bipush #102
    //   164: goto -> 183
    //   167: bipush #57
    //   169: goto -> 183
    //   172: bipush #58
    //   174: goto -> 183
    //   177: iconst_2
    //   178: goto -> 183
    //   181: bipush #23
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
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC3CE) & 0xFFFF;
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
      byte b1 = 46;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxt2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */