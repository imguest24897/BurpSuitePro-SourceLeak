package burp;

import javax.swing.ImageIcon;

class Zsps {
  private final ImageIcon ZQ;
  
  private final ImageIcon[] Zj;
  
  Zsps(ImageIcon paramImageIcon, ImageIcon[] paramArrayOfImageIcon) {
    this.ZQ = paramImageIcon;
    this.Zj = paramArrayOfImageIcon;
  }
  
  ImageIcon Ze() {
    return this.ZQ;
  }
  
  ImageIcon Zu(byte paramByte1, byte paramByte2) {
    return (paramByte1 == 0 || paramByte2 == 0) ? this.Zj[0] : this.Zj[Zb3i.ZE(paramByte1, paramByte2)];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsps.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */