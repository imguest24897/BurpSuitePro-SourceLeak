package net.portswigger.browser;

import burp.Zbqc;

public class Zd1 {
  public static final Zdi ZE;
  
  private final Zl ZB;
  
  private Zdi ZR = Zdi.ZG;
  
  private String ZK;
  
  private String Ze;
  
  private String Za;
  
  private Integer Zi;
  
  private Integer Zn;
  
  private Boolean Zz;
  
  private Boolean ZH;
  
  private Boolean ZZ;
  
  private String Zy;
  
  private static final String a;
  
  private Zd1(Zl paramZl) {
    this.ZB = paramZl;
  }
  
  public static Zd1 ZX() {
    return new Zd1(Zl.KEY_UP);
  }
  
  public static Zd1 Zg(Za paramZa, Zdi paramZdi) {
    int[] arrayOfInt = Zdi.Zb();
    if (Zbqc.Zwu() == null)
      Zdi.Zb(new int[2]); 
    return (new Zd1(paramZa.eventType)).ZE(paramZdi).ZY(paramZa.keyText).Zc(paramZa.nativeKeyCode).Zu(paramZa.keyString).ZE(paramZa.keyIdentifier);
  }
  
  public static Zd1 ZQ(char paramChar) {
    int[] arrayOfInt = Zdi.Zb();
    Zdi zdi = (Character.isUpperCase(paramChar) || a.indexOf(paramChar) != -1) ? ZE : Zdi.ZG;
    String str = "" + paramChar;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
    return (new Zd1(Zl.KEY_DOWN)).ZE(zdi).ZY(str).Zc(ZA(paramChar)).Zu(str).ZE(str);
  }
  
  public Zl ZA() {
    return this.ZB;
  }
  
  public Zdi ZD() {
    return this.ZR;
  }
  
  public String ZM() {
    return this.ZK;
  }
  
  public String Zt() {
    return this.Ze;
  }
  
  public String ZL() {
    return this.Za;
  }
  
  public Integer Zv() {
    return this.Zi;
  }
  
  public Integer Zk() {
    return this.Zn;
  }
  
  public Boolean Zi() {
    return this.Zz;
  }
  
  public Boolean ZY() {
    return this.ZH;
  }
  
  public Boolean Zl() {
    return this.ZZ;
  }
  
  public String ZZ() {
    return this.Zy;
  }
  
  public Zd1 ZE(Zdi paramZdi) {
    this.ZR = paramZdi;
    return this;
  }
  
  public Zd1 ZY(String paramString) {
    this.ZK = paramString;
    this.Ze = paramString;
    return this;
  }
  
  public Zd1 Zu(String paramString) {
    this.Za = paramString;
    return this;
  }
  
  public Zd1 Zc(int paramInt) {
    this.Zn = Integer.valueOf(paramInt);
    this.Zi = Integer.valueOf(paramInt);
    return this;
  }
  
  public Zd1 ZE(String paramString) {
    this.Zy = paramString;
    return this;
  }
  
  private static int ZA(char paramChar) {
    switch (paramChar) {
      case 'A':
      
      case 'B':
      
      case 'C':
      
      case 'D':
      
      case 'E':
      
      case 'F':
      
      case 'G':
      
      case 'H':
      
      case 'I':
      
      case 'J':
      
      case 'K':
      
      case 'L':
      
      case 'M':
      
      case 'N':
      
      case 'O':
      
      case 'P':
      
      case 'Q':
      
      case 'R':
      
      case 'S':
      
      case 'T':
      
      case 'U':
      
      case 'V':
      
      case 'W':
      
      case 'X':
      
      case 'Y':
      
      case 'Z':
      
      case 'a':
      
      case 'b':
      
      case 'c':
      
      case 'd':
      
      case 'e':
      
      case 'f':
      
      case 'g':
      
      case 'h':
      
      case 'i':
      
      case 'j':
      
      case 'k':
      
      case 'l':
      
      case 'm':
      
      case 'n':
      
      case 'o':
      
      case 'p':
      
      case 'q':
      
      case 'r':
      
      case 's':
      
      case 't':
      
      case 'u':
      
      case 'v':
      
      case 'w':
      
      case 'x':
      
      case 'y':
      
      case 'z':
      
      case '0':
      
      case '1':
      
      case '2':
      
      case '3':
      
      case '4':
      
      case '5':
      
      case '6':
      
      case '7':
      
      case '8':
      
      case '9':
      
      case '!':
      
      case '@':
      
      case '#':
      
      case '$':
      
      case '%':
      
      case '^':
      
      case '&':
      
      case '*':
      
      case '(':
      
      case ')':
      
      case '-':
      
      case '_':
      
      case '=':
      
      case '+':
      
      case '[':
      
      case '{':
      
      case ']':
      
      case '}':
      
      case '\\':
      
      case '|':
      
      case ';':
      
      case ':':
      
      case '\'':
      
      case '"':
      
      case ',':
      
      case '<':
      
      case '.':
      
      case '>':
      
      case '/':
      
      case '?':
      
      case '`':
      
      case '~':
      
    } 
    return paramChar;
  }
  
  static {
    // Byte code:
    //   0: bipush #39
    //   2: ldc 'o aQd|[otL2n8z0'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/browser/Zd1.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #105
    //   82: goto -> 112
    //   85: bipush #115
    //   87: goto -> 112
    //   90: bipush #27
    //   92: goto -> 112
    //   95: bipush #35
    //   97: goto -> 112
    //   100: bipush #99
    //   102: goto -> 112
    //   105: bipush #40
    //   107: goto -> 112
    //   110: bipush #22
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: iconst_1
    //   155: anewarray net/portswigger/browser/Zz2
    //   158: dup
    //   159: iconst_0
    //   160: getstatic net/portswigger/browser/Zz2.SHIFT : Lnet/portswigger/browser/Zz2;
    //   163: aastore
    //   164: invokestatic Zk : ([Lnet/portswigger/browser/Zz2;)Lnet/portswigger/browser/Zdi;
    //   167: putstatic net/portswigger/browser/Zd1.ZE : Lnet/portswigger/browser/Zdi;
    //   170: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zd1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */