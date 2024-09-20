package net.portswigger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ze7 implements Zz6, Zld {
  private Zkd Zx;
  
  private Z_z ZV;
  
  private int Zw;
  
  private int ZJ;
  
  private boolean ZY;
  
  private Zld Zz;
  
  private String Zp;
  
  private Ze7 ZC;
  
  private Ze7 Zi;
  
  private boolean ZW;
  
  private static boolean ZP;
  
  private static final String b;
  
  public boolean Zl() {
    return this.ZW;
  }
  
  void ZO() {
    this.Zi = null;
  }
  
  public void Zc(int paramInt) {
    this.Zw = paramInt;
  }
  
  public void Zf(int paramInt) {
    this.ZJ = paramInt;
  }
  
  public Z_z ZE() {
    Z_z z_z = this.ZV;
    try {
      if (z_z == null) {
        if (this.ZC != null)
          z_z = this.ZC.ZE(); 
        try {
          if (z_z == null && this.Zi != null)
            z_z = this.Zi.ZE(); 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return z_z;
  }
  
  public void Zh(Z_z paramZ_z) {
    this.ZV = paramZ_z;
  }
  
  public Zkd ZX() {
    return this.Zx;
  }
  
  public int Zg() {
    return this.Zw;
  }
  
  public int Zu() {
    return this.ZJ;
  }
  
  public String ZT() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.Zp != null) ? this.Zp : Zz();
  }
  
  public final Ze7 ZR() {
    return ZF();
  }
  
  private Ze7 ZF() {
    Ze7 ze7 = ZC();
    boolean bool = ZN();
    while (ze7 != null && ze7.Zq()) {
      ze7 = ze7.ZC();
      if (!bool)
        break; 
    } 
    return ze7;
  }
  
  public Ze7 ZC() {
    try {
      if (ZX() == Zkd.EOF)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (this.Zi != null)
        return this.Zi; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Z_z z_z = ZE();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (z_z != null) ? z_z.ZF(Zu()) : null;
  }
  
  public Ze7 ZB() {
    try {
      if (this.ZC != null)
        return this.ZC; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (ZE() == null)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return ZE().Zo(Zg());
  }
  
  public String Zz() {
    try {
      if (this.Zx == Zkd.EOF)
        return ""; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Z_z z_z = ZE();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (z_z == null) ? null : z_z.ZH(Zg(), Zu());
  }
  
  protected Ze7() {}
  
  public Ze7(Zkd paramZkd, Z_z paramZ_z, int paramInt1, int paramInt2) {
    this.Zx = paramZkd;
    this.ZV = paramZ_z;
    this.Zw = paramInt1;
    this.ZJ = paramInt2;
  }
  
  public boolean Zq() {
    return this.ZY;
  }
  
  public void Zx(boolean paramBoolean) {
    this.ZY = paramBoolean;
  }
  
  public String ZH() {
    try {
      if (ZX() == Zkd.EOF)
        return b; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return ZT();
  }
  
  public String toString() {
    return ZH();
  }
  
  public List<Ze7> ZD() {
    ArrayList<Ze7> arrayList = new ArrayList();
    Ze7 ze7 = ZB();
    boolean bool = ZN();
    while (ze7 != null && ze7.Zq()) {
      arrayList.add(ze7);
      ze7 = ze7.ZB();
      if (!bool)
        break; 
    } 
    Collections.reverse(arrayList);
    return arrayList;
  }
  
  public static Ze7 ZV(Zkd paramZkd, Z_z paramZ_z, int paramInt1, int paramInt2) {
    try {
      switch (Zzg.Zf[paramZkd.ordinal()]) {
        case 1:
          return new Zer(Zkd.COMMENT, paramZ_z, paramInt1, paramInt2);
        case 2:
          return new Zpb(Zkd.NEWLINE, paramZ_z, paramInt1, paramInt2);
        case 3:
          return new Zpd(Zkd.METADATA_HEADER, paramZ_z, paramInt1, paramInt2);
        case 4:
          return new Zpf(Zkd.NAME_HEADER, paramZ_z, paramInt1, paramInt2);
        case 5:
          return new Ze2(Zkd.DESCRIPTION_HEADER, paramZ_z, paramInt1, paramInt2);
        case 6:
          return new Zpa(Zkd.LANGUAGE_HEADER, paramZ_z, paramInt1, paramInt2);
        case 7:
          return new Zpk(Zkd.LANGUAGE_LEVEL_1, paramZ_z, paramInt1, paramInt2);
        case 8:
          return new Zeg(Zkd.AUTHOR_HEADER, paramZ_z, paramInt1, paramInt2);
        case 9:
          return new Zwl(Zkd.TAGS_HEADER, paramZ_z, paramInt1, paramInt2);
        case 10:
          return new Zph(Zkd.GIVEN_HEADER, paramZ_z, paramInt1, paramInt2);
        case 11:
          return new Zpc(Zkd.HOST_FREQ, paramZ_z, paramInt1, paramInt2);
        case 12:
          return new Zw9(Zkd.REQUEST_FREQ, paramZ_z, paramInt1, paramInt2);
        case 13:
          return new Zwy(Zkd.RESPONSE_FREQ, paramZ_z, paramInt1, paramInt2);
        case 14:
          return new Zwx(Zkd.PATH_FREQ, paramZ_z, paramInt1, paramInt2);
        case 15:
          return new Zp0(Zkd.INSERTION_POINT_FREQ, paramZ_z, paramInt1, paramInt2);
        case 16:
          return new Ze0(Zkd.ANY, paramZ_z, paramInt1, paramInt2);
        case 17:
          return new Zp_(Zkd.HEADER, paramZ_z, paramInt1, paramInt2);
        case 18:
          return new Zwh(Zkd.QUERY, paramZ_z, paramInt1, paramInt2);
        case 19:
          return new Zeq(Zkd.COOKIE, paramZ_z, paramInt1, paramInt2);
        case 20:
          return new Zed(Zkd.DEFINE_HEADER, paramZ_z, paramInt1, paramInt2);
        case 21:
          return new Zwv(Zkd.RUN_FOR_EACH_HEADER, paramZ_z, paramInt1, paramInt2);
        case 22:
          return new Zpx(Zkd.EQUALS, paramZ_z, paramInt1, paramInt2);
        case 23:
          return new Zp6(Zkd.INTERPOLATABLE_STRING_OPENING_QUOTE, paramZ_z, paramInt1, paramInt2);
        case 24:
          return new Zp8(Zkd.LITERAL_STRING_OPENING_QUOTE, paramZ_z, paramInt1, paramInt2);
        case 25:
          return new Zwz(Zkd.OPEN_BRACKET, paramZ_z, paramInt1, paramInt2);
        case 26:
          return new Ze5(Zkd.CLOSE_BRACKET, paramZ_z, paramInt1, paramInt2);
        case 27:
          return new Zpw(Zkd.NATURAL_NUMBER, paramZ_z, paramInt1, paramInt2);
        case 28:
          return new Zel(Zkd.COMMA, paramZ_z, paramInt1, paramInt2);
        case 29:
          return new Zp1(Zkd.INTERPOLATABLE_STRING_CLOSING_QUOTE, paramZ_z, paramInt1, paramInt2);
        case 30:
          return new Zpg(Zkd.INTERPOLATABLE_STRING_LITERAL, paramZ_z, paramInt1, paramInt2);
        case 31:
          return new Zp5(Zkd.LITERAL_STRING_CLOSING_QUOTE, paramZ_z, paramInt1, paramInt2);
        case 32:
          return new Zpt(Zkd.LITERAL_STRING, paramZ_z, paramInt1, paramInt2);
        case 33:
          return new Zax(Zkd.VARIABLE_START, paramZ_z, paramInt1, paramInt2);
        case 34:
          return new Zaz(Zkd.VARIABLE_END, paramZ_z, paramInt1, paramInt2);
        case 35:
          return new Zpu(Zkd.GENERATE_COLLABORATOR_ADDRESS_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 36:
          return new Zws(Zkd.RANDOM_STR_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 37:
          return new Zwq(Zkd.TO_LOWER_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 38:
          return new Zwd(Zkd.TO_UPPER_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 39:
          return new Zwn(Zkd.REGEX_REPLACE_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 40:
          return new Zey(Zkd.BASE64_ENCODE_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 41:
          return new Ze6(Zkd.BASE64_DECODE_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 42:
          return new Zwt(Zkd.SHA1_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 43:
          return new Zw5(Zkd.SHA256_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 44:
          return new Zpi(Zkd.MD5_FUNCTION, paramZ_z, paramInt1, paramInt2);
        case 45:
          return new Zw1(Zkd.REQUEST_OBJECT, paramZ_z, paramInt1, paramInt2);
        case 46:
          return new Zw4(Zkd.RESPONSE_OBJECT, paramZ_z, paramInt1, paramInt2);
        case 47:
          return new Zwg(Zkd.REQUEST_RESPONSE_COMMON_PROPERTY, paramZ_z, paramInt1, paramInt2);
        case 48:
          return new Zw6(Zkd.REQUEST_SPECIFIC_PROPERTY, paramZ_z, paramInt1, paramInt2);
        case 49:
          return new Zwo(Zkd.RESPONSE_SPECIFIC_PROPERTY, paramZ_z, paramInt1, paramInt2);
        case 50:
          return new Zww(Zkd.URL, paramZ_z, paramInt1, paramInt2);
        case 51:
          return new Zwb(Zkd.URL_PROPERTY, paramZ_z, paramInt1, paramInt2);
        case 52:
          return new Zw7(Zkd.REPORT_ISSUE_HEADER, paramZ_z, paramInt1, paramInt2);
        case 53:
          return new Ze9(Zkd.AND_CONTINUE, paramZ_z, paramInt1, paramInt2);
        case 54:
          return new Zwk(Zkd.SEVERITY_HEADER, paramZ_z, paramInt1, paramInt2);
        case 55:
          return new Zpn(Zkd.HIGH_SEVERITY, paramZ_z, paramInt1, paramInt2);
        case 56:
          return new Zpq(Zkd.MEDIUM_SEVERITY, paramZ_z, paramInt1, paramInt2);
        case 57:
          return new Zpl(Zkd.LOW_SEVERITY, paramZ_z, paramInt1, paramInt2);
        case 58:
          return new Zp9(Zkd.INFO_SEVERITY, paramZ_z, paramInt1, paramInt2);
        case 59:
          return new Zp4(Zkd.ISSUE_NAME_HEADER, paramZ_z, paramInt1, paramInt2);
        case 60:
          return new Zei(Zkd.CONFIDENCE_HEADER, paramZ_z, paramInt1, paramInt2);
        case 61:
          return new Zet(Zkd.CERTAIN_CONFIDENCE, paramZ_z, paramInt1, paramInt2);
        case 62:
          return new Zpj(Zkd.FIRM_CONFIDENCE, paramZ_z, paramInt1, paramInt2);
        case 63:
          return new Zwr(Zkd.TENTATIVE_CONFIDENCE, paramZ_z, paramInt1, paramInt2);
        case 64:
          return new Zwc(Zkd.REMEDIATION_HEADER, paramZ_z, paramInt1, paramInt2);
        case 65:
          return new Zef(Zkd.DETAIL_HEADER, paramZ_z, paramInt1, paramInt2);
        case 66:
          return new Zp7(Zkd.IF_HEADER, paramZ_z, paramInt1, paramInt2);
        case 67:
          return new Zpm(Zkd.ELSE_HEADER, paramZ_z, paramInt1, paramInt2);
        case 68:
          return new Zpp(Zkd.IF_FOOTER, paramZ_z, paramInt1, paramInt2);
        case 69:
          return new Zpy(Zkd.IN_KEY, paramZ_z, paramInt1, paramInt2);
        case 70:
          return new Zpo(Zkd.IS_KEY, paramZ_z, paramInt1, paramInt2);
        case 71:
          return new Zpr(Zkd.MATCHES_KEY, paramZ_z, paramInt1, paramInt2);
        case 72:
          return new Zew(Zkd.DIFFERS_FROM_KEY, paramZ_z, paramInt1, paramInt2);
        case 73:
          return new Ze8(Zkd.COLON, paramZ_z, paramInt1, paramInt2);
        case 74:
          return new Zwi(Zkd.THEN, paramZ_z, paramInt1, paramInt2);
        case 75:
          return new Ze4(Zkd.BODY, paramZ_z, paramInt1, paramInt2);
        case 76:
          return new Zwa(Zkd.SEND, paramZ_z, paramInt1, paramInt2);
        case 77:
          return new Zw0(Zkd.REQUEST_HEADER, paramZ_z, paramInt1, paramInt2);
        case 78:
          return new Zek(Zkd.CALLED, paramZ_z, paramInt1, paramInt2);
        case 79:
          return new Zp2(Zkd.METHOD, paramZ_z, paramInt1, paramInt2);
        case 80:
          return new Zwm(Zkd.PATH, paramZ_z, paramInt1, paramInt2);
        case 81:
          return new Zwu(Zkd.QUERIES, paramZ_z, paramInt1, paramInt2);
        case 82:
          return new Zw_(Zkd.QUERY_STRING, paramZ_z, paramInt1, paramInt2);
        case 83:
          return new Ze1(Zkd.APPENDING, paramZ_z, paramInt1, paramInt2);
        case 84:
          return new Zw3(Zkd.REMOVING, paramZ_z, paramInt1, paramInt2);
        case 85:
          return new Zwp(Zkd.REPLACING, paramZ_z, paramInt1, paramInt2);
        case 86:
          return new Zps(Zkd.HEADERS, paramZ_z, paramInt1, paramInt2);
        case 87:
          return new Zee(Zkd.ANY_KEY, paramZ_z, paramInt1, paramInt2);
        case 88:
          return new Zeb(Zkd.DNS_KEY, paramZ_z, paramInt1, paramInt2);
        case 89:
          return new Zp3(Zkd.HTTP_KEY, paramZ_z, paramInt1, paramInt2);
        case 90:
          return new Zw8(Zkd.SMTP_KEY, paramZ_z, paramInt1, paramInt2);
        case 91:
          return new Zpe(Zkd.INTERACTIONS_KEY, paramZ_z, paramInt1, paramInt2);
        case 92:
          return new Zwj(Zkd.PAYLOAD_HEADER, paramZ_z, paramInt1, paramInt2);
        case 93:
          return new Zeo(Zkd.BOOL_AND, paramZ_z, paramInt1, paramInt2);
        case 94:
          return new Zea(Zkd.BOOL_OR, paramZ_z, paramInt1, paramInt2);
        case 95:
          return new Zev(Zkd.BOOL_NOT, paramZ_z, paramInt1, paramInt2);
        case 96:
          return new Zam(Zkd.VARIABLE_NAME, paramZ_z, paramInt1, paramInt2);
        case 97:
          return new Zwe(Zkd.REQUEST_NAME, paramZ_z, paramInt1, paramInt2);
        case 98:
          return new Zpz(Zkd.DOT, paramZ_z, paramInt1, paramInt2);
        case 99:
          return new Zw2(Zkd.UNKNOWN, paramZ_z, paramInt1, paramInt2);
        case 100:
          return new Zwf(Zkd.UNKNOWN_STRING, paramZ_z, paramInt1, paramInt2);
        case 101:
          return new Zpv(paramZ_z, paramInt1, paramInt2);
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return new Ze7(paramZkd, paramZ_z, paramInt1, paramInt2);
  }
  
  public String Zp() {
    return Zh() + ":" + Zh() + ":" + Zn();
  }
  
  public void ZL(int paramInt, Zld paramZld) {
    throw new UnsupportedOperationException();
  }
  
  public void ZO(Zld paramZld) {
    throw new UnsupportedOperationException();
  }
  
  public void Zo(int paramInt, Zld paramZld) {
    throw new UnsupportedOperationException();
  }
  
  public Zld ZN(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public final int Zf(Zld paramZld) {
    return -1;
  }
  
  public Zld Zo() {
    return this.Zz;
  }
  
  public void ZP(Zld paramZld) {
    this.Zz = paramZld;
  }
  
  public final int Zd() {
    return 0;
  }
  
  public final Zld Zu(int paramInt) {
    return null;
  }
  
  public final List<Zld> ZK() {
    return Collections.emptyList();
  }
  
  public static void ZA(boolean paramBoolean) {
    ZP = paramBoolean;
  }
  
  public static boolean ZN() {
    return ZP;
  }
  
  public static boolean Zy() {
    boolean bool = ZN();
    try {
      if (!bool)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zy : ()Z
    //   3: ifeq -> 10
    //   6: iconst_1
    //   7: invokestatic ZA : (Z)V
    //   10: bipush #18
    //   12: ldc 'pVs'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic net/portswigger/Ze7.b : Ljava/lang/String;
    //   21: goto -> 165
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 139
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 111, 5 -> 116
    //   92: bipush #39
    //   94: goto -> 123
    //   97: bipush #11
    //   99: goto -> 123
    //   102: bipush #39
    //   104: goto -> 123
    //   107: iconst_1
    //   108: goto -> 123
    //   111: bipush #111
    //   113: goto -> 123
    //   116: bipush #88
    //   118: goto -> 123
    //   121: bipush #26
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 45
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 42
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 18
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ze7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */