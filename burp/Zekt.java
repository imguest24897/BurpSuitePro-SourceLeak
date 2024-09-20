package burp;

public class Zekt {
  static boolean ZV(char paramChar) {
    return (paramChar == '"' || paramChar == '\'' || paramChar == '`');
  }
  
  static boolean Zy(char paramChar) {
    return (paramChar <= ' ');
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zekt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */