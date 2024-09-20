package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Zz_ {
  private final byte[] Zu;
  
  private final List<Zen> ZM;
  
  public Zz_(byte[] paramArrayOfbyte) {
    this.Zu = paramArrayOfbyte;
    this.ZM = new ArrayList<>();
  }
  
  public List<Zen> Z_() {
    int i = Zen.ZE();
    if (this.Zu == null || this.Zu.length < 4)
      return this.ZM; 
    int j = 2;
    while (j < this.Zu.length) {
      byte b1 = this.Zu[j - 2];
      byte b2 = this.Zu[j - 1];
      byte b3 = this.Zu[j];
      if (Zna.ZD(new byte[] { b3, b2, b1 })) {
        b1 = Zna.ZU(b1);
        b2 = Zna.ZU(b2);
        b3 = Zna.ZU(b3);
        char c = Zrx9.ZQ(b1, b2);
        if (c == b3)
          j = Zy(b1, b2, j); 
      } 
      j++;
      if (i == 0)
        break; 
    } 
    return this.ZM;
  }
  
  private int Zy(byte paramByte1, byte paramByte2, int paramInt) {
    Zcu zcu = new Zcu(paramByte1, paramByte2, this.Zu, paramInt + 1);
    byte[] arrayOfByte = new byte[22];
    int i = Zen.Zx();
    int j = zcu.Zl(arrayOfByte);
    if (j != 22)
      return paramInt; 
    if (!Zna.ZD(arrayOfByte))
      return paramInt; 
    Zco zco = Zco.ZV(Zkb.ZG(arrayOfByte));
    if (zco == null)
      return paramInt; 
    int k = ZN(zcu);
    if (k == -1)
      return paramInt; 
    if (!Zrxz.Zu(k))
      return paramInt; 
    StringBuilder stringBuilder = new StringBuilder();
    byte b = zcu.Zn();
    byte b1 = 0;
    while (b != 122) {
      if (b == -1 || !Zna.Zt(b))
        return paramInt; 
      stringBuilder.append((char)b);
      if (++b1 >= 'È')
        return paramInt; 
      b = zcu.Zn();
      if (i != 0)
        break; 
    } 
    String str = stringBuilder.toString();
    Zen zen = new Zen(new byte[] { paramByte1, paramByte2 }, zco, k, str);
    this.ZM.add(zen);
    return paramInt + zen.toString().length() - 2;
  }
  
  public static int ZN(Zcu paramZcu) {
    byte b1 = 8;
    int j = 0;
    int i = Zen.Zx();
    byte b2 = 0;
    while (b2 <= 8) {
      byte b = paramZcu.Zn();
      if (b == -1)
        return -1; 
      int k = Character.digit(b, 16);
      if (k == -1)
        return (b2 > 0 && b > 102 && b < 122) ? j : -1; 
      b2++;
      j = j * 16 + k;
      if (i != 0)
        break; 
    } 
    return -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zz_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */