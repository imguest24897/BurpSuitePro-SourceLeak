package org.bouncycastle.its;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.oer.Element;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.OERInputStream;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataEncrypted;
import org.bouncycastle.oer.its.ieee1609dot2.EncryptedData;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;
import org.bouncycastle.oer.its.ieee1609dot2.RecipientInfo;
import org.bouncycastle.oer.its.template.etsi103097.EtsiTs103097Module;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Store;

public class ETSIEncryptedData {
  private static final Element oerDef = EtsiTs103097Module.EtsiTs103097Data_Encrypted.build();
  
  private final EncryptedData encryptedData;
  
  public ETSIEncryptedData(byte[] paramArrayOfbyte) throws IOException {
    this(new ByteArrayInputStream(paramArrayOfbyte));
  }
  
  public ETSIEncryptedData(InputStream paramInputStream) throws IOException {
    OERInputStream oERInputStream;
    if (paramInputStream instanceof OERInputStream) {
      oERInputStream = (OERInputStream)paramInputStream;
    } else {
      oERInputStream = new OERInputStream(paramInputStream);
    } 
    ASN1Object aSN1Object = oERInputStream.parse(oerDef);
    Ieee1609Dot2Content ieee1609Dot2Content = EtsiTs103097DataEncrypted.getInstance(aSN1Object).getContent();
    if (ieee1609Dot2Content.getChoice() != 2)
      throw new IllegalStateException("EtsiTs103097Data-Encrypted did not have encrypted data content"); 
    this.encryptedData = EncryptedData.getInstance(ieee1609Dot2Content.getIeee1609Dot2Content());
  }
  
  ETSIEncryptedData(EncryptedData paramEncryptedData) {
    this.encryptedData = paramEncryptedData;
  }
  
  public byte[] getEncoded() {
    return OEREncoder.toByteArray((ASN1Encodable)new EtsiTs103097DataEncrypted(Ieee1609Dot2Content.encryptedData(this.encryptedData)), oerDef);
  }
  
  public EncryptedData getEncryptedData() {
    return this.encryptedData;
  }
  
  public Store<ETSIRecipientInfo> getRecipients() {
    ArrayList<ETSIRecipientInfo> arrayList = new ArrayList();
    for (RecipientInfo recipientInfo : this.encryptedData.getRecipients().getRecipientInfos())
      arrayList.add(new ETSIRecipientInfo(this.encryptedData, recipientInfo)); 
    return (Store<ETSIRecipientInfo>)new CollectionStore(arrayList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ETSIEncryptedData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */