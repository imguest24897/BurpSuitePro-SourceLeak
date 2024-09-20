package org.bouncycastle.util.encoders;

public class UrlBase64Encoder extends Base64Encoder {
  public UrlBase64Encoder() {
    this.encodingTable[this.encodingTable.length - 2] = 45;
    this.encodingTable[this.encodingTable.length - 1] = 95;
    this.padding = 46;
    initialiseDecodingTable();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\encoders\UrlBase64Encoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */