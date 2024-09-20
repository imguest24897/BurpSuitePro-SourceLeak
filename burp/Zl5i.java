package burp;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Segment;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl5i implements Zxy9, Zc {
  private static final DataFlavor[] ZD;
  
  private static final DataFlavor[] Zv;
  
  protected final Zvo6 ZZ;
  
  protected final Zmgn ZI;
  
  protected final Zg4o Zw;
  
  protected final Zejf Zt;
  
  private final Zgb6 ZQ;
  
  private final Zzyl ZV;
  
  private final Zs7f Zg;
  
  private Zxch ZU;
  
  private String Zy;
  
  private boolean ZR;
  
  private boolean Zb;
  
  private static Zbqc[] Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl5i(Zvo6 paramZvo6, Zgb6 paramZgb6, Zzyl paramZzyl, Zejf paramZejf) {
    this.ZZ = paramZvo6;
    this.ZI = paramZvo6.ZC();
    this.Zw = this.ZI.ZC();
    this.Zt = paramZejf;
    this.ZQ = paramZgb6;
    this.ZV = paramZzyl;
    this.Zg = new Zv8_(this.ZI);
    Zbqc[] arrayOfZbqc = ZtD();
    paramZejf.Zi(this);
    ZtU().addDocumentListener(new Zka1(this));
    this.ZI.Zy(false);
    this.ZI.Zs(false);
    this.ZI.addFocusListener(new Zm5b(this));
    this.ZI.Zn(Zlkk.TEXT_EDITOR_BACKGROUND);
    this.ZI.setName(a(32345, -25775));
    paramZvo6.Zi(new Zt0p(this, paramZgb6));
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public void Ze() {
    this.ZI.updateUI();
  }
  
  public void Zg(boolean paramBoolean) {
    this.ZZ.setVisible(paramBoolean);
  }
  
  public JComponent ZiB() {
    return this.ZZ;
  }
  
  public void ZH(Zg90 paramZg90) {
    this.ZZ.Zl(paramZg90);
  }
  
  public boolean Zi3() {
    return this.Zb;
  }
  
  public void ZV(String paramString1, String paramString2, boolean paramBoolean) {
    this.Zy = paramString2;
    Zz(paramString1, paramBoolean);
  }
  
  public void Zz(String paramString, boolean paramBoolean) {
    this.ZI.ZJ();
    this.ZI.setText(paramString);
    this.ZI.ZA();
    this.ZI.setCaretPosition(0);
    if (paramBoolean) {
      this.Zb = false;
      this.ZI.Zn();
    } 
  }
  
  public byte[] ZiD() {
    Segment segment = new Segment();
    Ze9f ze9f = ZtU();
    int i = ze9f.getLength();
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
      ze9f.getText(0, i, segment);
      byte[] arrayOfByte = Zg12.ZB(segment.toString(), this.Zy);
      byteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
      return byteArrayOutputStream.toByteArray();
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
      return new byte[0];
    } 
  }
  
  void Zw(Zxch paramZxch) {
    this.ZQ.Zr(this.ZU);
    this.ZU = paramZxch;
    this.ZQ.ZC(paramZxch);
    paramZxch.Ze();
  }
  
  public int ZiO() {
    return this.ZI.getCaretPosition();
  }
  
  public void Zg(int paramInt) {
    this.ZZ.Zr(paramInt);
  }
  
  public void ZZ(int paramInt) {
    this.ZZ.Zv(paramInt);
  }
  
  public void Zu(int paramInt1, int paramInt2) {
    this.ZZ.ZW(paramInt1, paramInt2);
  }
  
  public void ZC(String paramString) {
    this.Zg.ZC(paramString);
  }
  
  public String ZT() {
    return this.Zg.ZT();
  }
  
  public void Zl(String paramString) {
    this.Zg.Zl(paramString);
  }
  
  public byte[] ZiS() {
    try {
      if (!Zid())
        return null; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int i = this.ZI.getSelectionStart();
    int j = this.ZI.getSelectionEnd();
    int k = j - i;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(k);
    try {
      ZB(i, j, byteArrayOutputStream);
      return byteArrayOutputStream.toByteArray();
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return new byte[0];
    } 
  }
  
  public void ZY(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic ZtD : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 14
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_2
    //   11: ifnonnull -> 23
    //   14: aload_1
    //   15: aload_0
    //   16: getfield Zy : Ljava/lang/String;
    //   19: invokestatic ZI : ([BLjava/lang/String;)Ljava/lang/String;
    //   22: astore_3
    //   23: aload_0
    //   24: aload_3
    //   25: invokevirtual ZC : (Ljava/lang/String;)V
    //   28: return
  }
  
  protected void Ztx() {
    Zxrf zxrf = (Zxrf)this.ZI.getHighlighter();
    zxrf.Zl();
    ArrayList<Zkv5> arrayList = new ArrayList<>(this.Zt.Zd());
    arrayList.sort(Comparator.comparingInt(Zkv5::ZOl).reversed().thenComparing(Zkv5::startOffset));
    int i = Zi1();
    ArrayList<Zgt5> arrayList1 = new ArrayList();
    Zbqc[] arrayOfZbqc = ZtD();
    for (Zkv5 zkv5 : arrayList) {
      if (zkv5.startOffset() >= 0 && zkv5.endOffset() <= i && zkv5.startOffset() < zkv5.endOffset())
        arrayList1.add(new Zgt5(zkv5)); 
      if (arrayOfZbqc == null)
        break; 
    } 
    zxrf.ZK((List)arrayList1);
  }
  
  private void ZB(int paramInt1, int paramInt2, ByteArrayOutputStream paramByteArrayOutputStream) throws BadLocationException {
    Segment segment = new Segment();
    int i = Math.max(paramInt1, 0);
    ZtU().getText(i, paramInt2 - i, segment);
    byte[] arrayOfByte = Zg12.ZB(segment.toString(), this.Zy);
    paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public int[] Zif() {
    return new int[] { this.ZI.getSelectionStart(), this.ZI.getSelectionEnd() };
  }
  
  public boolean Zid() {
    Caret caret = this.ZI.getCaret();
    return (caret.getDot() != caret.getMark());
  }
  
  public int Zi4() {
    return this.ZI.ZM();
  }
  
  public void ZS(boolean paramBoolean) {
    this.ZR = paramBoolean;
  }
  
  public void Zv(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.ZI.append(Zg12.Zh(paramArrayOfbyte, paramInt1, paramInt2, Ziz()));
    if (this.ZR && ZtU().getLength() > 10000) {
      String str = ZiW();
      int i = str.indexOf('\n', str.length() - 8000);
      int j = (i == -1) ? (str.length() - 8000) : (i + 1);
      Zz(str.substring(j), true);
    } 
  }
  
  public void ZW(String paramString, int paramInt1, int paramInt2) {
    int i = this.ZI.getSelectionStart();
    int j = this.ZI.getSelectionEnd();
    this.ZI.replaceRange(paramString, paramInt1, paramInt2);
    Zbqc[] arrayOfZbqc = ZtD();
    boolean bool = (j > i) ? true : false;
    if (bool && paramInt1 == i) {
      if (paramInt2 == j) {
        Zu(paramInt1, paramInt1 + paramString.length());
        if (arrayOfZbqc == null) {
          if (paramInt2 < j) {
            int k = paramString.length() - paramInt2 - paramInt1;
            Zu(paramInt1, j + k);
          } 
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    if (paramInt2 < j) {
      int k = paramString.length() - paramInt2 - paramInt1;
      Zu(paramInt1, j + k);
    } 
  }
  
  public void Zv(boolean paramBoolean) {
    if (this.ZI.Zb() != paramBoolean) {
      this.ZI.Zy(paramBoolean);
      this.ZI.ZG(paramBoolean);
      ZZ(ZiO());
    } 
  }
  
  public void ZB(boolean paramBoolean) {
    this.ZI.Zs(paramBoolean);
  }
  
  public void ZH(boolean paramBoolean) {
    this.ZI.setLineWrap(paramBoolean);
  }
  
  public void ZiK() {
    this.ZI.requestFocus();
  }
  
  public void ZA(MouseListener paramMouseListener) {
    this.ZI.addMouseListener(paramMouseListener);
  }
  
  public void ZT(DocumentListener paramDocumentListener) {
    ZtU().addDocumentListener(paramDocumentListener);
  }
  
  public void ZP(FocusListener paramFocusListener) {
    this.ZI.addFocusListener(paramFocusListener);
  }
  
  public void ZF(boolean paramBoolean) {
    this.ZI.setEditable(paramBoolean);
    if (paramBoolean)
      ((Ze9f)this.ZI.getDocument()).Zu(false); 
  }
  
  public boolean Zi0() {
    return this.ZI.isEditable();
  }
  
  public void ZY(boolean paramBoolean) {
    if (!this.ZI.isEditable())
      ((Ze9f)this.ZI.getDocument()).Zu(paramBoolean); 
  }
  
  public boolean Zip() {
    return this.ZI.Zc();
  }
  
  public String ZiW() {
    return this.ZI.getText();
  }
  
  public int Zi1() {
    return ZtU().getLength();
  }
  
  public String Ziz() {
    return this.Zy;
  }
  
  public void ZP(int paramInt, char paramChar) {
    Zuh.Zb(a(32344, -30851).equals(this.Zy), Zqf.Zr);
    this.ZI.insert(String.valueOf(paramChar), paramInt);
  }
  
  public DataFlavor[] getTransferDataFlavors() {
    return (this.ZI.getSelectionEnd() == this.ZI.getSelectionStart()) ? Zv : ZD;
  }
  
  public boolean isDataFlavorSupported(DataFlavor paramDataFlavor) {
    return (paramDataFlavor == DataFlavor.stringFlavor && this.ZI.getSelectionEnd() > this.ZI.getSelectionStart());
  }
  
  public Object getTransferData(DataFlavor paramDataFlavor) throws UnsupportedFlavorException {
    try {
      if (!isDataFlavorSupported(paramDataFlavor))
        throw new UnsupportedFlavorException(paramDataFlavor); 
    } catch (UnsupportedFlavorException unsupportedFlavorException) {
      throw a(null);
    } 
    String str = ZT();
    try {
    
    } catch (UnsupportedFlavorException unsupportedFlavorException) {
      throw a(null);
    } 
    return (str == null) ? "" : str;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZV.ZI(paramInt, paramObject);
  }
  
  public void ZX() {
    Ztx();
  }
  
  public Zvo6 ZtH() {
    return this.ZZ;
  }
  
  public void Zt(boolean paramBoolean) {
    TextUI textUI = this.ZI.getUI();
    if (textUI instanceof Ztfz) {
      Ztfz ztfz = (Ztfz)textUI;
      ztfz.ZD(paramBoolean);
    } 
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zb : Z
    //   4: istore_1
    //   5: aload_0
    //   6: getfield ZZ : Lburp/Zvo6;
    //   9: invokevirtual ZI : ()Lburp/Ztcw;
    //   12: astore_2
    //   13: iconst_2
    //   14: anewarray burp/Ztcw
    //   17: dup
    //   18: iconst_0
    //   19: aload_2
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: aload_0
    //   24: iload_1
    //   25: <illegal opcode> Zg : (Lburp/Zl5i;Z)Lburp/Ztcw;
    //   30: aastore
    //   31: invokestatic Zb : ([Lburp/Ztcw;)Lburp/Ztcw;
    //   34: areturn
  }
  
  public void ZU() {
    this.ZZ.ZU();
    this.Zb = false;
  }
  
  protected Ze9f ZtU() {
    return this.ZZ.ZW();
  }
  
  private void lambda$checkpoint$0(boolean paramBoolean) {
    this.Zb = paramBoolean;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_2
    //   7: anewarray burp/Zbqc
    //   10: iconst_0
    //   11: istore_3
    //   12: ldc 'ó¦ü®LCKÛéVAïÙïË:Q¹Ím¡'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: invokestatic Zr : ([Lburp/Zbqc;)V
    //   24: bipush #13
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #62
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 89
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: aload #5
    //   76: putstatic burp/Zl5i.a : [Ljava/lang/String;
    //   79: iconst_2
    //   80: anewarray java/lang/String
    //   83: putstatic burp/Zl5i.b : [Ljava/lang/String;
    //   86: goto -> 234
    //   89: dup_x2
    //   90: pop
    //   91: invokevirtual toCharArray : ()[C
    //   94: dup_x1
    //   95: arraylength
    //   96: dup_x2
    //   97: pop
    //   98: iconst_0
    //   99: istore #6
    //   101: dup2_x1
    //   102: pop2
    //   103: dup_x2
    //   104: iconst_1
    //   105: if_icmpgt -> 207
    //   108: dup2
    //   109: swap
    //   110: iload #6
    //   112: dup2_x1
    //   113: caload
    //   114: swap
    //   115: iload #6
    //   117: bipush #7
    //   119: irem
    //   120: tableswitch default -> 189, 0 -> 160, 1 -> 164, 2 -> 169, 3 -> 174, 4 -> 179, 5 -> 184
    //   160: iconst_2
    //   161: goto -> 191
    //   164: bipush #46
    //   166: goto -> 191
    //   169: bipush #60
    //   171: goto -> 191
    //   174: bipush #52
    //   176: goto -> 191
    //   179: bipush #95
    //   181: goto -> 191
    //   184: bipush #94
    //   186: goto -> 191
    //   189: bipush #69
    //   191: ixor
    //   192: ixor
    //   193: i2c
    //   194: castore
    //   195: iinc #6, 1
    //   198: dup
    //   199: ifne -> 207
    //   202: dup2
    //   203: dup_x1
    //   204: goto -> 112
    //   207: dup2_x1
    //   208: pop2
    //   209: dup_x2
    //   210: iload #6
    //   212: if_icmpgt -> 108
    //   215: pop
    //   216: new java/lang/String
    //   219: dup_x1
    //   220: swap
    //   221: invokespecial <init> : ([C)V
    //   224: invokevirtual intern : ()Ljava/lang/String;
    //   227: swap
    //   228: pop
    //   229: swap
    //   230: pop
    //   231: goto -> 46
    //   234: iconst_1
    //   235: anewarray java/awt/datatransfer/DataFlavor
    //   238: dup
    //   239: iconst_0
    //   240: getstatic java/awt/datatransfer/DataFlavor.stringFlavor : Ljava/awt/datatransfer/DataFlavor;
    //   243: aastore
    //   244: putstatic burp/Zl5i.ZD : [Ljava/awt/datatransfer/DataFlavor;
    //   247: iconst_0
    //   248: anewarray java/awt/datatransfer/DataFlavor
    //   251: putstatic burp/Zl5i.Zv : [Ljava/awt/datatransfer/DataFlavor;
    //   254: return
  }
  
  public static void Zr(Zbqc[] paramArrayOfZbqc) {
    Zn = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZtD() {
    return Zn;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7E59) & 0xFFFF;
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
      byte b1 = 98;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl5i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */