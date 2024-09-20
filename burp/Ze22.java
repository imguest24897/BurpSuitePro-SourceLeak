package burp;

import java.util.zip.Deflater;

class Ze22 {
  static double ZZ(byte[] paramArrayOfbyte) {
    Deflater deflater = new Deflater(-1, false);
    deflater.setLevel(9);
    deflater.setInput(paramArrayOfbyte);
    int i = Zl4x.ZD();
    deflater.finish();
    int j = 0;
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    while (!deflater.needsInput()) {
      j = deflater.deflate(arrayOfByte);
      if (i == 0)
        break; 
    } 
    deflater.end();
    return (paramArrayOfbyte.length - j) / paramArrayOfbyte.length;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze22.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */