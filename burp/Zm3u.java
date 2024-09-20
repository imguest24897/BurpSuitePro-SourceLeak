package burp;

class Zm3u {
  static Zs5n ZH(Zs_n paramZs_n, String paramString) {
    Zbqc[] arrayOfZbqc = Zmx9.Zd();
    for (Zs5n zs5n : paramZs_n.ZJo()) {
      if (paramString.equalsIgnoreCase(zs5n.ZQd()))
        return zs5n; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
  
  static String ZJ(Zs_n paramZs_n, String paramString) {
    Zs5n zs5n = ZH(paramZs_n, paramString);
    return (zs5n == null) ? null : zs5n.ZQG();
  }
  
  static String Zc(Zs_n paramZs_n) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramZs_n.ZJ3());
    stringBuilder.append("\n");
    Zbqc[] arrayOfZbqc = Zmx9.Zd();
    for (Zs5n zs5n : paramZs_n.ZJo()) {
      stringBuilder.append(zs5n);
      if (arrayOfZbqc == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zmx9.ZR(new Zbqc[2]); 
    return stringBuilder.toString();
  }
  
  static String ZF(Zs_n paramZs_n) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramZs_n.ZJ3());
    Zbqc[] arrayOfZbqc = Zmx9.Zd();
    stringBuilder.append(" ");
    for (Zs5n zs5n : paramZs_n.ZJo()) {
      stringBuilder.append(zs5n.ZQd()).append('=').append('"').append(zs5n.ZQG()).append('"').append(' ');
      if (arrayOfZbqc == null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */