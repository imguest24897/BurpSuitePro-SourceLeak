package burp;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.im.InputContext;
import java.io.IOException;
import java.io.Reader;
import javax.swing.JComponent;
import javax.swing.TransferHandler;
import javax.swing.text.JTextComponent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zz9m extends TransferHandler {
  private JTextComponent ZW;
  
  private boolean ZQ;
  
  private int ZC;
  
  private int Zy;
  
  private boolean ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected DataFlavor ZQ(DataFlavor[] paramArrayOfDataFlavor, JTextComponent paramJTextComponent) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #4
    //   3: aconst_null
    //   4: astore #5
    //   6: invokestatic Zm : ()I
    //   9: iconst_0
    //   10: istore #6
    //   12: istore_3
    //   13: iload #6
    //   15: aload_1
    //   16: arraylength
    //   17: if_icmpge -> 126
    //   20: aload_1
    //   21: iload #6
    //   23: aaload
    //   24: invokevirtual getMimeType : ()Ljava/lang/String;
    //   27: astore #7
    //   29: aload #7
    //   31: sipush #-3076
    //   34: sipush #30536
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   43: ifeq -> 51
    //   46: aload_1
    //   47: iload #6
    //   49: aaload
    //   50: areturn
    //   51: aload #4
    //   53: ifnonnull -> 95
    //   56: aload #7
    //   58: sipush #-3075
    //   61: sipush #20680
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   70: ifeq -> 95
    //   73: aload_1
    //   74: iload #6
    //   76: aaload
    //   77: invokevirtual getRepresentationClass : ()Ljava/lang/Class;
    //   80: ldc java/lang/String
    //   82: if_acmpne -> 95
    //   85: aload_1
    //   86: iload #6
    //   88: aaload
    //   89: astore #4
    //   91: iload_3
    //   92: ifeq -> 119
    //   95: aload #5
    //   97: ifnonnull -> 119
    //   100: aload_1
    //   101: iload #6
    //   103: aaload
    //   104: getstatic java/awt/datatransfer/DataFlavor.stringFlavor : Ljava/awt/datatransfer/DataFlavor;
    //   107: invokevirtual equals : (Ljava/awt/datatransfer/DataFlavor;)Z
    //   110: ifeq -> 119
    //   113: aload_1
    //   114: iload #6
    //   116: aaload
    //   117: astore #5
    //   119: iinc #6, 1
    //   122: iload_3
    //   123: ifeq -> 13
    //   126: aload #4
    //   128: ifnull -> 134
    //   131: aload #4
    //   133: areturn
    //   134: aload #5
    //   136: ifnull -> 142
    //   139: aload #5
    //   141: areturn
    //   142: aconst_null
    //   143: areturn
  }
  
  protected void ZS(Reader paramReader, JTextComponent paramJTextComponent) throws IOException {
    char[] arrayOfChar = new char[1024];
    StringBuilder stringBuilder = null;
    int i = Zz85.Zm();
    int j;
    while ((j = paramReader.read(arrayOfChar, 0, arrayOfChar.length)) != -1) {
      if (stringBuilder == null)
        stringBuilder = new StringBuilder(j); 
      stringBuilder.append(arrayOfChar, 0, j);
      if (i != 0)
        break; 
    } 
    try {
      if (this.ZO)
        ((Zmgw)paramJTextComponent).ZJ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJTextComponent.replaceSelection((stringBuilder != null) ? stringBuilder.toString() : "");
  }
  
  public int getSourceActions(JComponent paramJComponent) {
    return ((JTextComponent)paramJComponent).isEditable() ? 3 : 1;
  }
  
  protected Transferable createTransferable(JComponent paramJComponent) {
    this.ZW = (JTextComponent)paramJComponent;
    this.ZQ = true;
    this.ZC = this.ZW.getSelectionStart();
    this.Zy = this.ZW.getSelectionEnd();
    return (this.ZC != this.Zy) ? new Zr6_(this.ZW, this.ZC, this.Zy) : null;
  }
  
  protected void exportDone(JComponent paramJComponent, Transferable paramTransferable, int paramInt) {
    if (this.ZQ && paramInt == 2) {
      Zr6_ zr6_ = (Zr6_)paramTransferable;
      zr6_.Zm();
      if (this.ZO) {
        ((Zmgw)paramJComponent).ZA();
        this.ZO = false;
      } 
    } 
    this.ZW = null;
  }
  
  public boolean importData(JComponent paramJComponent, Transferable paramTransferable) {
    JTextComponent jTextComponent = (JTextComponent)paramJComponent;
    try {
    
    } catch (UnsupportedFlavorException unsupportedFlavorException) {
      throw a(null);
    } 
    try {
      this.ZO = (jTextComponent == this.ZW);
      if (this.ZO)
        try {
          if (jTextComponent.getCaretPosition() >= this.ZC)
            try {
              if (jTextComponent.getCaretPosition() <= this.Zy) {
                this.ZQ = false;
                return true;
              } 
            } catch (UnsupportedFlavorException unsupportedFlavorException) {
              throw a(null);
            }  
        } catch (UnsupportedFlavorException unsupportedFlavorException) {
          throw a(null);
        }  
    } catch (UnsupportedFlavorException unsupportedFlavorException) {
      throw a(null);
    } 
    boolean bool = false;
    DataFlavor dataFlavor = ZQ(paramTransferable.getTransferDataFlavors(), jTextComponent);
    if (dataFlavor != null)
      try {
        InputContext inputContext = jTextComponent.getInputContext();
        try {
          if (inputContext != null)
            inputContext.endComposition(); 
        } catch (UnsupportedFlavorException unsupportedFlavorException) {
          throw a(null);
        } 
        Reader reader = dataFlavor.getReaderForText(paramTransferable);
        ZS(reader, jTextComponent);
        bool = true;
      } catch (UnsupportedFlavorException|IOException unsupportedFlavorException) {
        Zah.Zl(unsupportedFlavorException, Zk_.COMMON_RUNTIME_FAILURE);
      }  
    return bool;
  }
  
  public boolean canImport(JComponent paramJComponent, DataFlavor[] paramArrayOfDataFlavor) {
    JTextComponent jTextComponent = (JTextComponent)paramJComponent;
    return (!jTextComponent.isEditable() || !jTextComponent.isEnabled()) ? false : ((ZQ(paramArrayOfDataFlavor, jTextComponent) != null));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'BBÄ]ßh|ûBÏ5«U"Fõ\\bõ6t $=í7©=\\nÂG;øÞb®'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #38
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #53
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
    //   69: putstatic burp/Zz9m.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zz9m.b : [Ljava/lang/String;
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
    //   152: bipush #88
    //   154: goto -> 184
    //   157: bipush #29
    //   159: goto -> 184
    //   162: bipush #121
    //   164: goto -> 184
    //   167: bipush #97
    //   169: goto -> 184
    //   172: bipush #123
    //   174: goto -> 184
    //   177: bipush #107
    //   179: goto -> 184
    //   182: bipush #85
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
    int i = (paramInt1 ^ 0xFFFFF3FD) & 0xFFFF;
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
      byte b1 = 58;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz9m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */