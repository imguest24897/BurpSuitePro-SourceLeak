package org.bouncycastle.asn1.eac;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Integers;

public class CertificateHolderAuthorization extends ASN1Object {
  public static final ASN1ObjectIdentifier id_role_EAC = EACObjectIdentifiers.bsi_de.branch("3.1.2.1");
  
  public static final int CVCA = 192;
  
  public static final int DV_DOMESTIC = 128;
  
  public static final int DV_FOREIGN = 64;
  
  public static final int IS = 0;
  
  public static final int RADG4 = 2;
  
  public static final int RADG3 = 1;
  
  static Map RightsDecodeMap = new HashMap<>();
  
  static BidirectionalMap AuthorizationRole = new BidirectionalMap();
  
  private ASN1ObjectIdentifier oid;
  
  private byte accessRights;
  
  public static String getRoleDescription(int paramInt) {
    return (String)AuthorizationRole.get(Integers.valueOf(paramInt));
  }
  
  public static int getFlag(String paramString) {
    Integer integer = (Integer)AuthorizationRole.getReverse(paramString);
    if (integer == null)
      throw new IllegalArgumentException("Unknown value " + paramString); 
    return integer.intValue();
  }
  
  private void setPrivateData(ASN1Sequence paramASN1Sequence) {
    ASN1Primitive aSN1Primitive = (ASN1Primitive)paramASN1Sequence.getObjectAt(0);
    if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
      this.oid = (ASN1ObjectIdentifier)aSN1Primitive;
    } else {
      throw new IllegalArgumentException("no Oid in CerticateHolderAuthorization");
    } 
    aSN1Primitive = (ASN1Primitive)paramASN1Sequence.getObjectAt(1);
    if (aSN1Primitive instanceof ASN1TaggedObject) {
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Primitive, 64, 19);
      this.accessRights = ASN1OctetString.getInstance(aSN1TaggedObject.getBaseUniversal(false, 4)).getOctets()[0];
    } else {
      throw new IllegalArgumentException("No access rights in CerticateHolderAuthorization");
    } 
  }
  
  public CertificateHolderAuthorization(ASN1ObjectIdentifier paramASN1ObjectIdentifier, int paramInt) throws IOException {
    setOid(paramASN1ObjectIdentifier);
    setAccessRights((byte)paramInt);
  }
  
  public CertificateHolderAuthorization(ASN1TaggedObject paramASN1TaggedObject) throws IOException {
    if (paramASN1TaggedObject.hasTag(64, 76)) {
      setPrivateData(ASN1Sequence.getInstance(paramASN1TaggedObject.getBaseUniversal(false, 16)));
    } else {
      throw new IllegalArgumentException("Unrecognized object in CerticateHolderAuthorization");
    } 
  }
  
  public int getAccessRights() {
    return this.accessRights & 0xFF;
  }
  
  private void setAccessRights(byte paramByte) {
    this.accessRights = paramByte;
  }
  
  public ASN1ObjectIdentifier getOid() {
    return this.oid;
  }
  
  private void setOid(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.oid = paramASN1ObjectIdentifier;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.oid);
    aSN1EncodableVector.add((ASN1Encodable)EACTagged.create(19, new byte[] { this.accessRights }));
    return (ASN1Primitive)EACTagged.create(76, (ASN1Sequence)new DERSequence(aSN1EncodableVector));
  }
  
  static {
    RightsDecodeMap.put(Integers.valueOf(2), "RADG4");
    RightsDecodeMap.put(Integers.valueOf(1), "RADG3");
    AuthorizationRole.put(Integers.valueOf(192), "CVCA");
    AuthorizationRole.put(Integers.valueOf(128), "DV_DOMESTIC");
    AuthorizationRole.put(Integers.valueOf(64), "DV_FOREIGN");
    AuthorizationRole.put(Integers.valueOf(0), "IS");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\eac\CertificateHolderAuthorization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */