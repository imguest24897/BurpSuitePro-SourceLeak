package burp;

import java.util.HashSet;
import java.util.Set;

public class Zs1f implements Zt8x {
  private static final Set<Zgho> ZS = new HashSet<>();
  
  private static final char[] ZX = new char[] { '/', '*', '\r', '\n' };
  
  private static final char[] ZK = new char[] { 'i', 'g', 'm', 'y' };
  
  public boolean Zm(Zzih paramZzih) {
    if (paramZzih.Z_() == '/') {
      if (paramZzih.ZD + 1 >= paramZzih.Zp)
        return false; 
      if (ZM(paramZzih))
        return true; 
    } 
    return false;
  }
  
  public boolean Zp(Zzih paramZzih) {
    return Zc(paramZzih, '/');
  }
  
  public boolean Zl(Zzih paramZzih) {
    return Zc(paramZzih, '[');
  }
  
  public boolean Zn(Zzih paramZzih) {
    return Zc(paramZzih, ']');
  }
  
  public boolean ZG(Zzih paramZzih) {
    char c = paramZzih.Z_();
    char[] arrayOfChar = ZK;
    int i = arrayOfChar.length;
    byte b = 0;
    String[] arrayOfString = Zs2z.Zx();
    while (b < i) {
      char c1 = arrayOfChar[b];
      if (c == c1)
        return true; 
      b++;
      if (arrayOfString != null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    return false;
  }
  
  private boolean ZM(Zzih paramZzih) {
    if (Zx(paramZzih.ZO(paramZzih.ZD + 1))) {
      Zsvc zsvc = ZA(paramZzih);
      if (zsvc == null || ZS.contains(zsvc.ZE))
        return true; 
      if (zsvc.ZE == Zgho.CLOSING_PARENTHESIS && ZL(zsvc, paramZzih))
        return true; 
    } 
    return false;
  }
  
  private boolean Zx(char paramChar) {
    char[] arrayOfChar = ZX;
    int i = arrayOfChar.length;
    String[] arrayOfString = Zs2z.Zx();
    byte b = 0;
    while (b < i) {
      char c = arrayOfChar[b];
      if (paramChar == c)
        return false; 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return true;
  }
  
  private boolean ZL(Zsvc paramZsvc, Zzih paramZzih) {
    int i = ZJ(paramZsvc, paramZzih);
    Zsvc zsvc = paramZzih.ZW(i);
    String[] arrayOfString = Zs2z.Zx();
    while (zsvc != null && (zsvc.ZE == Zgho.LINE_TERMINATOR || zsvc.ZE == Zgho.COMMENT)) {
      zsvc = paramZzih.ZW(++i);
      if (arrayOfString != null)
        break; 
    } 
    return (zsvc != null && (zsvc.ZE == Zgho.KEYWORD_FOR || zsvc.ZE == Zgho.KEYWORD_IF || zsvc.ZE == Zgho.KEYWORD_WHILE || zsvc.ZE == Zgho.KEYWORD_WITH));
  }
  
  private int ZJ(Zsvc paramZsvc, Zzih paramZzih) {
    byte b1 = 1;
    byte b2 = 1;
    String[] arrayOfString = Zs2z.Zx();
    while (b2 > 0 && paramZsvc != null) {
      paramZsvc = paramZzih.ZW(b1++);
      if (paramZsvc != null) {
        if (paramZsvc.ZE == Zgho.CLOSING_PARENTHESIS) {
          b2++;
          if (arrayOfString != null)
            continue; 
          continue;
        } 
        continue;
      } 
      continue;
      if (paramZsvc.ZE == Zgho.OPENING_PARENTHESIS) {
        b2--;
        if (arrayOfString != null)
          break; 
      } 
    } 
    return b1;
  }
  
  private Zsvc ZA(Zzih paramZzih) {
    Zsvc zsvc = paramZzih.Zc();
    byte b = 1;
    String[] arrayOfString = Zs2z.Zx();
    while (zsvc != null && (zsvc.ZE == Zgho.LINE_TERMINATOR || zsvc.ZE == Zgho.COMMENT)) {
      zsvc = paramZzih.ZW(b++);
      if (arrayOfString != null)
        break; 
    } 
    return zsvc;
  }
  
  private boolean Zc(Zzih paramZzih, char paramChar) {
    return (paramZzih.Z_() == paramChar && (paramZzih.ZD == 0 || !ZO(paramZzih)));
  }
  
  private boolean ZO(Zzih paramZzih) {
    return (paramZzih.ZD > 0 && paramZzih.ZO(paramZzih.ZD - 1) == '\\' && (paramZzih.ZD == 1 || paramZzih.ZO(paramZzih.ZD - 2) != '\\'));
  }
  
  static {
    ZS.add(Zgho.DOT);
    ZS.add(Zgho.OPENING_PARENTHESIS);
    ZS.add(Zgho.COMMA);
    ZS.add(Zgho.OPENING_BRACE);
    ZS.add(Zgho.CLOSING_BRACE);
    ZS.add(Zgho.OPENING_SQUARE_BRACKET);
    ZS.add(Zgho.SEMICOLON);
    ZS.add(Zgho.COMMA);
    ZS.add(Zgho.LESS_THAN);
    ZS.add(Zgho.GREATER_THAN);
    ZS.add(Zgho.LESS_EQUALS);
    ZS.add(Zgho.GREATER_EQUALS);
    ZS.add(Zgho.EQUALS_EQUALS);
    ZS.add(Zgho.BANG_EQUALS);
    ZS.add(Zgho.EQUALS_EQUALS_EQUALS);
    ZS.add(Zgho.BANG_EQUALS_EQUALS);
    ZS.add(Zgho.PLUS);
    ZS.add(Zgho.MINUS);
    ZS.add(Zgho.STAR);
    ZS.add(Zgho.PERCENT);
    ZS.add(Zgho.SLASH);
    ZS.add(Zgho.AMPERSAND_AMPERSAND);
    ZS.add(Zgho.PIPE_PIPE);
    ZS.add(Zgho.QUERY);
    ZS.add(Zgho.COLON);
    ZS.add(Zgho.LESS_LESS);
    ZS.add(Zgho.GREATER_GREATER);
    ZS.add(Zgho.GREATER_GREATER_GREATER);
    ZS.add(Zgho.AMPERSAND);
    ZS.add(Zgho.PIPE);
    ZS.add(Zgho.CARET);
    ZS.add(Zgho.BANG);
    ZS.add(Zgho.TILDE);
    ZS.add(Zgho.EQUALS);
    ZS.add(Zgho.PLUS_EQUALS);
    ZS.add(Zgho.MINUS_EQUALS);
    ZS.add(Zgho.STAR_EQUALS);
    ZS.add(Zgho.PERCENT_EQUALS);
    ZS.add(Zgho.AMPERSAND_EQUALS);
    ZS.add(Zgho.PIPE_EQUALS);
    ZS.add(Zgho.CARET_EQUALS);
    ZS.add(Zgho.SLASH_EQUALS);
    ZS.add(Zgho.LESS_LESS_EQUALS);
    ZS.add(Zgho.GREATER_GREATER_EQUALS);
    ZS.add(Zgho.GREATER_GREATER_GREATER_EQUALS);
    ZS.add(Zgho.KEYWORD_NEW);
    ZS.add(Zgho.KEYWORD_DELETE);
    ZS.add(Zgho.KEYWORD_VOID);
    ZS.add(Zgho.KEYWORD_TYPEOF);
    ZS.add(Zgho.KEYWORD_INSTANCEOF);
    ZS.add(Zgho.KEYWORD_IN);
    ZS.add(Zgho.KEYWORD_DO);
    ZS.add(Zgho.KEYWORD_RETURN);
    ZS.add(Zgho.KEYWORD_CASE);
    ZS.add(Zgho.KEYWORD_THROW);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */