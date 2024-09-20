package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;

public class Zzff extends Zz85 {
  private static final long serialVersionUID = 1L;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zzff() {
    super(b(8055, 9450));
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_2
    //   5: invokevirtual isEditable : ()Z
    //   8: ifeq -> 25
    //   11: aload_2
    //   12: invokevirtual isEnabled : ()Z
    //   15: ifne -> 37
    //   18: goto -> 25
    //   21: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   24: athrow
    //   25: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   28: aload_2
    //   29: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   32: return
    //   33: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   36: athrow
    //   37: aload_2
    //   38: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   41: astore #4
    //   43: aload #4
    //   45: invokeinterface getDefaultRootElement : ()Ljavax/swing/text/Element;
    //   50: astore #5
    //   52: aload_2
    //   53: invokevirtual getCaret : ()Ljavax/swing/text/Caret;
    //   56: astore #6
    //   58: aload #6
    //   60: invokeinterface getDot : ()I
    //   65: istore #7
    //   67: aload #6
    //   69: invokeinterface getMark : ()I
    //   74: istore #8
    //   76: aload #5
    //   78: iload #7
    //   80: invokeinterface getElementIndex : (I)I
    //   85: istore #9
    //   87: aload #5
    //   89: iload #8
    //   91: invokeinterface getElementIndex : (I)I
    //   96: istore #10
    //   98: iload #9
    //   100: iload #10
    //   102: if_icmpeq -> 279
    //   105: iload #9
    //   107: iload #10
    //   109: invokestatic min : (II)I
    //   112: istore #11
    //   114: iload #9
    //   116: iload #10
    //   118: invokestatic max : (II)I
    //   121: istore #12
    //   123: ldc '\\t'
    //   125: astore #15
    //   127: aload_2
    //   128: invokevirtual ZJ : ()V
    //   131: iload #11
    //   133: istore #16
    //   135: iload #16
    //   137: iload #12
    //   139: if_icmpge -> 181
    //   142: aload #5
    //   144: iload #16
    //   146: invokeinterface getElement : (I)Ljavax/swing/text/Element;
    //   151: astore #13
    //   153: aload #13
    //   155: invokeinterface getStartOffset : ()I
    //   160: istore #14
    //   162: aload #4
    //   164: iload #14
    //   166: aload #15
    //   168: aconst_null
    //   169: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   174: iinc #16, 1
    //   177: aload_3
    //   178: ifnull -> 135
    //   181: aload #5
    //   183: iload #12
    //   185: invokeinterface getElement : (I)Ljavax/swing/text/Element;
    //   190: astore #13
    //   192: aload #13
    //   194: invokeinterface getStartOffset : ()I
    //   199: istore #14
    //   201: aload #6
    //   203: invokeinterface getDot : ()I
    //   208: aload #6
    //   210: invokeinterface getMark : ()I
    //   215: invokestatic max : (II)I
    //   218: iload #14
    //   220: if_icmpeq -> 242
    //   223: aload #4
    //   225: iload #14
    //   227: aload #15
    //   229: aconst_null
    //   230: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   235: goto -> 242
    //   238: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   241: athrow
    //   242: aload_2
    //   243: invokevirtual ZA : ()V
    //   246: goto -> 275
    //   249: astore #16
    //   251: aload #16
    //   253: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   256: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   259: aload_2
    //   260: invokevirtual ZA : ()V
    //   263: goto -> 275
    //   266: astore #17
    //   268: aload_2
    //   269: invokevirtual ZA : ()V
    //   272: aload #17
    //   274: athrow
    //   275: aload_3
    //   276: ifnull -> 318
    //   279: aload_2
    //   280: aload_2
    //   281: checkcast burp/Zmgn
    //   284: invokevirtual Zc : ()Z
    //   287: ifeq -> 313
    //   290: goto -> 297
    //   293: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   296: athrow
    //   297: sipush #8054
    //   300: sipush #-18055
    //   303: invokestatic b : (II)Ljava/lang/String;
    //   306: goto -> 315
    //   309: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   312: athrow
    //   313: ldc '\\t'
    //   315: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   318: return
    // Exception table:
    //   from	to	target	type
    //   4	18	21	javax/swing/text/BadLocationException
    //   11	33	33	javax/swing/text/BadLocationException
    //   131	242	249	javax/swing/text/BadLocationException
    //   131	242	266	finally
    //   201	235	238	javax/swing/text/BadLocationException
    //   249	259	266	finally
    //   266	268	266	finally
    //   275	290	293	javax/swing/text/BadLocationException
    //   279	309	309	javax/swing/text/BadLocationException
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Å\\n$v)%»ËA*'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #29
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zzff.c : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zzff.d : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #120
    //   154: goto -> 184
    //   157: bipush #103
    //   159: goto -> 184
    //   162: bipush #43
    //   164: goto -> 184
    //   167: bipush #127
    //   169: goto -> 184
    //   172: bipush #42
    //   174: goto -> 184
    //   177: bipush #75
    //   179: goto -> 184
    //   182: bipush #86
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
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
    //   224: goto -> 38
    //   227: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1F76) & 0xFFFF;
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
      byte b1 = 115;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzff.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */