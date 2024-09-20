package net.portswigger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zz implements Zgc, Zot {
  private Zfh Zo;
  
  private Zgp Zn;
  
  private int Zj;
  
  private int ZD;
  
  private boolean ZA;
  
  private Zot ZE;
  
  private String Zc;
  
  private Zz Zw;
  
  private Zz Ze;
  
  private boolean ZJ;
  
  private static String[] Zp;
  
  private static final String b;
  
  public boolean ZK() {
    return this.ZJ;
  }
  
  void Zd() {
    this.Ze = null;
  }
  
  public void ZG(int paramInt) {
    this.Zj = paramInt;
  }
  
  public void Zn(int paramInt) {
    this.ZD = paramInt;
  }
  
  public Zgp ZL() {
    Zgp zgp = this.Zn;
    try {
      if (zgp == null) {
        if (this.Zw != null)
          zgp = this.Zw.ZL(); 
        try {
          if (zgp == null && this.Ze != null)
            zgp = this.Ze.ZL(); 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return zgp;
  }
  
  public void ZA(Zgp paramZgp) {
    this.Zn = paramZgp;
  }
  
  public Zfh Zb() {
    return this.Zo;
  }
  
  public int ZZ() {
    return this.Zj;
  }
  
  public int Z_() {
    return this.ZD;
  }
  
  public String ZE() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.Zc != null) ? this.Zc : ZQ();
  }
  
  public final Zz ZP() {
    return Zp();
  }
  
  private Zz Zp() {
    Zz zz = ZX();
    String[] arrayOfString = Za();
    while (zz != null && zz.ZD()) {
      zz = zz.ZX();
      if (arrayOfString == null)
        break; 
    } 
    return zz;
  }
  
  public Zz ZX() {
    try {
      if (Zb() == Zfh.EOF)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (this.Ze != null)
        return this.Ze; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zgp zgp = ZL();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (zgp != null) ? zgp.Zx(Z_()) : null;
  }
  
  public Zz ZY() {
    try {
      if (this.Zw != null)
        return this.Zw; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (ZL() == null)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return ZL().ZC(ZZ());
  }
  
  public String ZQ() {
    try {
      if (this.Zo == Zfh.EOF)
        return ""; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zgp zgp = ZL();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (zgp == null) ? null : zgp.Zo(ZZ(), Z_());
  }
  
  protected Zz() {}
  
  public Zz(Zfh paramZfh, Zgp paramZgp, int paramInt1, int paramInt2) {
    this.Zo = paramZfh;
    this.Zn = paramZgp;
    this.Zj = paramInt1;
    this.ZD = paramInt2;
  }
  
  public boolean ZD() {
    return this.ZA;
  }
  
  public void ZD(boolean paramBoolean) {
    this.ZA = paramBoolean;
  }
  
  public String ZT() {
    try {
      if (Zb() == Zfh.EOF)
        return b; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return ZE();
  }
  
  public String toString() {
    return ZT();
  }
  
  public List<Zz> ZH() {
    ArrayList<Zz> arrayList = new ArrayList();
    String[] arrayOfString = Za();
    Zz zz = ZY();
    while (zz != null && zz.ZD()) {
      arrayList.add(zz);
      zz = zz.ZY();
      if (arrayOfString == null)
        break; 
    } 
    Collections.reverse(arrayList);
    return arrayList;
  }
  
  public static Zz ZO(Zfh paramZfh, Zgp paramZgp, int paramInt1, int paramInt2) {
    try {
      switch (Zcv.ZU[paramZfh.ordinal()]) {
        case 1:
          return new Zg(Zfh.COMMENT, paramZgp, paramInt1, paramInt2);
        case 2:
          return new Zjj(Zfh.NEWLINE, paramZgp, paramInt1, paramInt2);
        case 3:
          return new Zrb(Zfh.METADATA_HEADER, paramZgp, paramInt1, paramInt2);
        case 4:
          return new Zjm(Zfh.NAME_HEADER, paramZgp, paramInt1, paramInt2);
        case 5:
          return new Zrm(Zfh.DESCRIPTION_HEADER, paramZgp, paramInt1, paramInt2);
        case 6:
          return new Zr8(Zfh.LANGUAGE_HEADER, paramZgp, paramInt1, paramInt2);
        case 7:
          return new Zrl(Zfh.LANGUAGE_LEVEL_1, paramZgp, paramInt1, paramInt2);
        case 8:
          return new Z_(Zfh.AUTHOR_HEADER, paramZgp, paramInt1, paramInt2);
        case 9:
          return new Zji(Zfh.TAGS_HEADER, paramZgp, paramInt1, paramInt2);
        case 10:
          return new Zr3(Zfh.GIVEN_HEADER, paramZgp, paramInt1, paramInt2);
        case 11:
          return new Zr0(Zfh.HOST_FREQ, paramZgp, paramInt1, paramInt2);
        case 12:
          return new Zje(Zfh.REQUEST_FREQ, paramZgp, paramInt1, paramInt2);
        case 13:
          return new Zjo(Zfh.RESPONSE_FREQ, paramZgp, paramInt1, paramInt2);
        case 14:
          return new Zry(Zfh.INSERTION_POINT_FREQ, paramZgp, paramInt1, paramInt2);
        case 15:
          return new Zd(Zfh.ANY, paramZgp, paramInt1, paramInt2);
        case 16:
          return new Zrp(Zfh.HEADER, paramZgp, paramInt1, paramInt2);
        case 17:
          return new Zjn(Zfh.QUERY, paramZgp, paramInt1, paramInt2);
        case 18:
          return new Zi(Zfh.COOKIE, paramZgp, paramInt1, paramInt2);
        case 19:
          return new Zrz(Zfh.DEFINE_HEADER, paramZgp, paramInt1, paramInt2);
        case 20:
          return new Zjk(Zfh.RUN_FOR_EACH_HEADER, paramZgp, paramInt1, paramInt2);
        case 21:
          return new Zrs(Zfh.EQUALS, paramZgp, paramInt1, paramInt2);
        case 22:
          return new Zra(Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE, paramZgp, paramInt1, paramInt2);
        case 23:
          return new Zrq(Zfh.LITERAL_STRING_OPENING_QUOTE, paramZgp, paramInt1, paramInt2);
        case 24:
          return new Zju(Zfh.OPEN_BRACKET, paramZgp, paramInt1, paramInt2);
        case 25:
          return new Zl(Zfh.CLOSE_BRACKET, paramZgp, paramInt1, paramInt2);
        case 26:
          return new Zjx(Zfh.NATURAL_NUMBER, paramZgp, paramInt1, paramInt2);
        case 27:
          return new Zs(Zfh.COMMA, paramZgp, paramInt1, paramInt2);
        case 28:
          return new Zro(Zfh.INTERPOLATABLE_STRING_CLOSING_QUOTE, paramZgp, paramInt1, paramInt2);
        case 29:
          return new Zrv(Zfh.INTERPOLATABLE_STRING_LITERAL, paramZgp, paramInt1, paramInt2);
        case 30:
          return new Zri(Zfh.LITERAL_STRING_CLOSING_QUOTE, paramZgp, paramInt1, paramInt2);
        case 31:
          return new Zrr(Zfh.LITERAL_STRING, paramZgp, paramInt1, paramInt2);
        case 32:
          return new Zqu(Zfh.VARIABLE_START, paramZgp, paramInt1, paramInt2);
        case 33:
          return new Zqx(Zfh.VARIABLE_END, paramZgp, paramInt1, paramInt2);
        case 34:
          return new Zrc(Zfh.GENERATE_COLLABORATOR_ADDRESS_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 35:
          return new Zjc(Zfh.RANDOM_STR_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 36:
          return new Zj2(Zfh.TO_LOWER_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 37:
          return new Zjf(Zfh.TO_UPPER_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 38:
          return new Zj3(Zfh.REGEX_REPLACE_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 39:
          return new Zb(Zfh.BASE64_ENCODE_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 40:
          return new Zy(Zfh.BASE64_DECODE_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 41:
          return new Zj8(Zfh.SHA1_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 42:
          return new Zjl(Zfh.SHA256_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 43:
          return new Zrf(Zfh.MD5_FUNCTION, paramZgp, paramInt1, paramInt2);
        case 44:
          return new Zj6(Zfh.REQUEST_OBJECT, paramZgp, paramInt1, paramInt2);
        case 45:
          return new Zjv(Zfh.RESPONSE_OBJECT, paramZgp, paramInt1, paramInt2);
        case 46:
          return new Zjy(Zfh.REQUEST_RESPONSE_COMMON_PROPERTY, paramZgp, paramInt1, paramInt2);
        case 47:
          return new Zj4(Zfh.REQUEST_SPECIFIC_PROPERTY, paramZgp, paramInt1, paramInt2);
        case 48:
          return new Zja(Zfh.RESPONSE_SPECIFIC_PROPERTY, paramZgp, paramInt1, paramInt2);
        case 49:
          return new Zqz(Zfh.URL, paramZgp, paramInt1, paramInt2);
        case 50:
          return new Zqm(Zfh.URL_PROPERTY, paramZgp, paramInt1, paramInt2);
        case 51:
          return new Zj0(Zfh.REPORT_ISSUE_HEADER, paramZgp, paramInt1, paramInt2);
        case 52:
          return new Zj5(Zfh.SEVERITY_HEADER, paramZgp, paramInt1, paramInt2);
        case 53:
          return new Zr9(Zfh.HIGH_SEVERITY, paramZgp, paramInt1, paramInt2);
        case 54:
          return new Zrw(Zfh.MEDIUM_SEVERITY, paramZgp, paramInt1, paramInt2);
        case 55:
          return new Zrd(Zfh.LOW_SEVERITY, paramZgp, paramInt1, paramInt2);
        case 56:
          return new Zr6(Zfh.INFO_SEVERITY, paramZgp, paramInt1, paramInt2);
        case 57:
          return new Zk(Zfh.CONFIDENCE_HEADER, paramZgp, paramInt1, paramInt2);
        case 58:
          return new Za(Zfh.CERTAIN_CONFIDENCE, paramZgp, paramInt1, paramInt2);
        case 59:
          return new Zrn(Zfh.FIRM_CONFIDENCE, paramZgp, paramInt1, paramInt2);
        case 60:
          return new Zjq(Zfh.TENTATIVE_CONFIDENCE, paramZgp, paramInt1, paramInt2);
        case 61:
          return new Zjp(Zfh.REMEDIATION_HEADER, paramZgp, paramInt1, paramInt2);
        case 62:
          return new Zrx(Zfh.DETAIL_HEADER, paramZgp, paramInt1, paramInt2);
        case 63:
          return new Zrg(Zfh.IF_HEADER, paramZgp, paramInt1, paramInt2);
        case 64:
          return new Zr_(Zfh.ELSE_HEADER, paramZgp, paramInt1, paramInt2);
        case 65:
          return new Zr1(Zfh.IF_FOOTER, paramZgp, paramInt1, paramInt2);
        case 66:
          return new Zrk(Zfh.IN_KEY, paramZgp, paramInt1, paramInt2);
        case 67:
          return new Zrt(Zfh.IS_KEY, paramZgp, paramInt1, paramInt2);
        case 68:
          return new Zr2(Zfh.MATCHES_KEY, paramZgp, paramInt1, paramInt2);
        case 69:
          return new Zrj(Zfh.DIFFERS_FROM_KEY, paramZgp, paramInt1, paramInt2);
        case 70:
          return new Zm(Zfh.COLON, paramZgp, paramInt1, paramInt2);
        case 71:
          return new Zjd(Zfh.THEN, paramZgp, paramInt1, paramInt2);
        case 72:
          return new Zx(Zfh.BODY, paramZgp, paramInt1, paramInt2);
        case 73:
          return new Zjt(Zfh.SEND, paramZgp, paramInt1, paramInt2);
        case 74:
          return new Zj1(Zfh.REQUEST_HEADER, paramZgp, paramInt1, paramInt2);
        case 75:
          return new Zw(Zfh.CALLED, paramZgp, paramInt1, paramInt2);
        case 76:
          return new Zjz(Zfh.METHOD, paramZgp, paramInt1, paramInt2);
        case 77:
          return new Zjh(Zfh.PATH, paramZgp, paramInt1, paramInt2);
        case 78:
          return new Zjs(Zfh.QUERIES, paramZgp, paramInt1, paramInt2);
        case 79:
          return new Zv(Zfh.APPENDING, paramZgp, paramInt1, paramInt2);
        case 80:
          return new Zj7(Zfh.REMOVING, paramZgp, paramInt1, paramInt2);
        case 81:
          return new Zj9(Zfh.REPLACING, paramZgp, paramInt1, paramInt2);
        case 82:
          return new Zr7(Zfh.HEADERS, paramZgp, paramInt1, paramInt2);
        case 83:
          return new Zf(Zfh.ANY_KEY, paramZgp, paramInt1, paramInt2);
        case 84:
          return new Zru(Zfh.DNS_KEY, paramZgp, paramInt1, paramInt2);
        case 85:
          return new Zre(Zfh.HTTP_KEY, paramZgp, paramInt1, paramInt2);
        case 86:
          return new Zjr(Zfh.SMTP_KEY, paramZgp, paramInt1, paramInt2);
        case 87:
          return new Zr4(Zfh.INTERACTIONS_KEY, paramZgp, paramInt1, paramInt2);
        case 88:
          return new Zj_(Zfh.PAYLOAD_HEADER, paramZgp, paramInt1, paramInt2);
        case 89:
          return new Zh(Zfh.BOOL_AND, paramZgp, paramInt1, paramInt2);
        case 90:
          return new Zp(Zfh.BOOL_OR, paramZgp, paramInt1, paramInt2);
        case 91:
          return new Ze(Zfh.BOOL_NOT, paramZgp, paramInt1, paramInt2);
        case 92:
          return new Zqj(Zfh.VARIABLE_NAME, paramZgp, paramInt1, paramInt2);
        case 93:
          return new Zjg(Zfh.REQUEST_NAME, paramZgp, paramInt1, paramInt2);
        case 94:
          return new Zrh(Zfh.DOT, paramZgp, paramInt1, paramInt2);
        case 95:
          return new Zjw(Zfh.UNKNOWN, paramZgp, paramInt1, paramInt2);
        case 96:
          return new Zjb(Zfh.UNKNOWN_STRING, paramZgp, paramInt1, paramInt2);
        case 97:
          return new Zr5(paramZgp, paramInt1, paramInt2);
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return new Zz(paramZfh, paramZgp, paramInt1, paramInt2);
  }
  
  public String Zg() {
    return Zh() + ":" + Zh() + ":" + ZR();
  }
  
  public void ZD(int paramInt, Zot paramZot) {
    throw new UnsupportedOperationException();
  }
  
  public void Zs(Zot paramZot) {
    throw new UnsupportedOperationException();
  }
  
  public void Zl(int paramInt, Zot paramZot) {
    throw new UnsupportedOperationException();
  }
  
  public Zot ZR(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public final int ZG(Zot paramZot) {
    return -1;
  }
  
  public Zot Zi() {
    return this.ZE;
  }
  
  public void ZS(Zot paramZot) {
    this.ZE = paramZot;
  }
  
  public final int ZO() {
    return 0;
  }
  
  public final Zot ZO(int paramInt) {
    return null;
  }
  
  public final List<Zot> ZU() {
    return Collections.emptyList();
  }
  
  public static void ZW(String[] paramArrayOfString) {
    Zp = paramArrayOfString;
  }
  
  public static String[] Za() {
    return Zp;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_3
    //   7: anewarray java/lang/String
    //   10: invokestatic ZW : ([Ljava/lang/String;)V
    //   13: bipush #75
    //   15: ldc '2'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic net/portswigger/Zz.b : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #60
    //   94: goto -> 124
    //   97: bipush #15
    //   99: goto -> 124
    //   102: bipush #10
    //   104: goto -> 124
    //   107: bipush #52
    //   109: goto -> 124
    //   112: bipush #73
    //   114: goto -> 124
    //   117: bipush #104
    //   119: goto -> 124
    //   122: bipush #29
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */