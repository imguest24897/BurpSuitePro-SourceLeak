package burp;

public class Zec7 implements Zr9v {
  public boolean ZM(char paramChar) {
    return (Character.isLetter(paramChar) || Character.getType(paramChar) == 10 || paramChar == '_' || paramChar == '$');
  }
  
  public boolean Zp(char paramChar) {
    return (ZM(paramChar) || Character.isDigit(paramChar) || Zk(paramChar) || Zb(paramChar));
  }
  
  private boolean Zk(char paramChar) {
    int i = Character.getType(paramChar);
    return (i == 6 || i == 8 || i == 23);
  }
  
  private boolean Zb(char paramChar) {
    return (paramChar == '‌' || paramChar == '‍');
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zec7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */