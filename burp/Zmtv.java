package burp;

class Zmtv implements Zi5 {
  public int Zk(Zrnc paramZrnc) {
    byte b1 = 0;
    byte[] arrayOfByte = paramZrnc.Zr().Zd4();
    int i = arrayOfByte.length;
    byte b2 = 0;
    String[] arrayOfString = Zrnc.ZD();
    while (b2 < i) {
      byte b = arrayOfByte[b2];
      if (b == 47)
        b1++; 
      b2++;
      if (arrayOfString == null)
        break; 
    } 
    return b1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmtv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */