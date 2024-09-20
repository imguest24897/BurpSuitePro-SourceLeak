package org.bouncycastle.asn1;

import java.util.Date;

public class DERUTCTime extends ASN1UTCTime {
  DERUTCTime(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
  }
  
  public DERUTCTime(Date paramDate) {
    super(paramDate);
  }
  
  public DERUTCTime(String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DERUTCTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */