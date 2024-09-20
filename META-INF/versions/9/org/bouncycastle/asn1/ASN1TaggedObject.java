package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1UniversalType;
import org.bouncycastle.asn1.ASN1UniversalTypes;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.BERFactory;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLFactory;
import org.bouncycastle.asn1.DLTaggedObject;
import org.bouncycastle.util.Arrays;

public abstract class ASN1TaggedObject extends ASN1Primitive implements ASN1TaggedObjectParser {
  private static final int DECLARED_EXPLICIT = 1;
  
  private static final int DECLARED_IMPLICIT = 2;
  
  private static final int PARSED_EXPLICIT = 3;
  
  private static final int PARSED_IMPLICIT = 4;
  
  final int explicitness;
  
  final int tagClass;
  
  final int tagNo;
  
  final ASN1Encodable obj;
  
  public static org.bouncycastle.asn1.ASN1TaggedObject getInstance(Object paramObject) {
    if (paramObject == null || paramObject instanceof org.bouncycastle.asn1.ASN1TaggedObject)
      return (org.bouncycastle.asn1.ASN1TaggedObject)paramObject; 
    if (paramObject instanceof ASN1Encodable) {
      ASN1Primitive aSN1Primitive = ((ASN1Encodable)paramObject).toASN1Primitive();
      if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject)
        return (org.bouncycastle.asn1.ASN1TaggedObject)aSN1Primitive; 
    } else if (paramObject instanceof byte[]) {
      try {
        return checkedCast(fromByteArray((byte[])paramObject));
      } catch (IOException iOException) {
        throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + iOException.getMessage());
      } 
    } 
    throw new IllegalArgumentException("unknown object in getInstance: " + paramObject.getClass().getName());
  }
  
  public static org.bouncycastle.asn1.ASN1TaggedObject getInstance(Object paramObject, int paramInt) {
    return ASN1Util.checkTagClass(checkInstance(paramObject), paramInt);
  }
  
  public static org.bouncycastle.asn1.ASN1TaggedObject getInstance(Object paramObject, int paramInt1, int paramInt2) {
    return ASN1Util.checkTag(checkInstance(paramObject), paramInt1, paramInt2);
  }
  
  public static org.bouncycastle.asn1.ASN1TaggedObject getInstance(org.bouncycastle.asn1.ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return ASN1Util.getExplicitContextBaseTagged(checkInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public static org.bouncycastle.asn1.ASN1TaggedObject getInstance(org.bouncycastle.asn1.ASN1TaggedObject paramASN1TaggedObject, int paramInt, boolean paramBoolean) {
    return ASN1Util.getExplicitBaseTagged(checkInstance(paramASN1TaggedObject, paramBoolean), paramInt);
  }
  
  public static org.bouncycastle.asn1.ASN1TaggedObject getInstance(org.bouncycastle.asn1.ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2, boolean paramBoolean) {
    return ASN1Util.getExplicitBaseTagged(checkInstance(paramASN1TaggedObject, paramBoolean), paramInt1, paramInt2);
  }
  
  private static org.bouncycastle.asn1.ASN1TaggedObject checkInstance(Object paramObject) {
    if (paramObject == null)
      throw new NullPointerException("'obj' cannot be null"); 
    return getInstance(paramObject);
  }
  
  private static org.bouncycastle.asn1.ASN1TaggedObject checkInstance(org.bouncycastle.asn1.ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    if (!paramBoolean)
      throw new IllegalArgumentException("this method not valid for implicitly tagged tagged objects"); 
    if (paramASN1TaggedObject == null)
      throw new NullPointerException("'taggedObject' cannot be null"); 
    return paramASN1TaggedObject;
  }
  
  protected ASN1TaggedObject(boolean paramBoolean, int paramInt, ASN1Encodable paramASN1Encodable) {
    this(paramBoolean, 128, paramInt, paramASN1Encodable);
  }
  
  protected ASN1TaggedObject(boolean paramBoolean, int paramInt1, int paramInt2, ASN1Encodable paramASN1Encodable) {
    this(paramBoolean ? 1 : 2, paramInt1, paramInt2, paramASN1Encodable);
  }
  
  ASN1TaggedObject(int paramInt1, int paramInt2, int paramInt3, ASN1Encodable paramASN1Encodable) {
    if (null == paramASN1Encodable)
      throw new NullPointerException("'obj' cannot be null"); 
    if (paramInt2 == 0 || (paramInt2 & 0xC0) != paramInt2)
      throw new IllegalArgumentException("invalid tag class: " + paramInt2); 
    this.explicitness = (paramASN1Encodable instanceof org.bouncycastle.asn1.ASN1Choice) ? 1 : paramInt1;
    this.tagClass = paramInt2;
    this.tagNo = paramInt3;
    this.obj = paramASN1Encodable;
  }
  
  final boolean asn1Equals(ASN1Primitive paramASN1Primitive) {
    if (!(paramASN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject))
      return false; 
    org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject)paramASN1Primitive;
    if (this.tagNo != aSN1TaggedObject.tagNo || this.tagClass != aSN1TaggedObject.tagClass)
      return false; 
    if (this.explicitness != aSN1TaggedObject.explicitness && isExplicit() != aSN1TaggedObject.isExplicit())
      return false; 
    ASN1Primitive aSN1Primitive1 = this.obj.toASN1Primitive();
    ASN1Primitive aSN1Primitive2 = aSN1TaggedObject.obj.toASN1Primitive();
    if (aSN1Primitive1 == aSN1Primitive2)
      return true; 
    if (!isExplicit())
      try {
        byte[] arrayOfByte1 = getEncoded();
        byte[] arrayOfByte2 = aSN1TaggedObject.getEncoded();
        return Arrays.areEqual(arrayOfByte1, arrayOfByte2);
      } catch (IOException iOException) {
        return false;
      }  
    return aSN1Primitive1.asn1Equals(aSN1Primitive2);
  }
  
  public int hashCode() {
    return this.tagClass * 7919 ^ this.tagNo ^ (isExplicit() ? 15 : 240) ^ this.obj.toASN1Primitive().hashCode();
  }
  
  public int getTagClass() {
    return this.tagClass;
  }
  
  public int getTagNo() {
    return this.tagNo;
  }
  
  public boolean hasContextTag() {
    return (this.tagClass == 128);
  }
  
  public boolean hasContextTag(int paramInt) {
    return (this.tagClass == 128 && this.tagNo == paramInt);
  }
  
  public boolean hasTag(int paramInt1, int paramInt2) {
    return (this.tagClass == paramInt1 && this.tagNo == paramInt2);
  }
  
  public boolean hasTagClass(int paramInt) {
    return (this.tagClass == paramInt);
  }
  
  public boolean isExplicit() {
    switch (this.explicitness) {
      case 1:
      case 3:
        return true;
    } 
    return false;
  }
  
  boolean isParsed() {
    switch (this.explicitness) {
      case 3:
      case 4:
        return true;
    } 
    return false;
  }
  
  public ASN1Object getBaseObject() {
    return (this.obj instanceof ASN1Object) ? (ASN1Object)this.obj : (ASN1Object)this.obj.toASN1Primitive();
  }
  
  public ASN1Object getExplicitBaseObject() {
    if (!isExplicit())
      throw new IllegalStateException("object implicit - explicit expected."); 
    return (this.obj instanceof ASN1Object) ? (ASN1Object)this.obj : (ASN1Object)this.obj.toASN1Primitive();
  }
  
  public org.bouncycastle.asn1.ASN1TaggedObject getExplicitBaseTagged() {
    if (!isExplicit())
      throw new IllegalStateException("object implicit - explicit expected."); 
    return checkedCast(this.obj.toASN1Primitive());
  }
  
  public org.bouncycastle.asn1.ASN1TaggedObject getImplicitBaseTagged(int paramInt1, int paramInt2) {
    org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject;
    if (paramInt1 == 0 || (paramInt1 & 0xC0) != paramInt1)
      throw new IllegalArgumentException("invalid base tag class: " + paramInt1); 
    switch (this.explicitness) {
      case 1:
        throw new IllegalStateException("object explicit - implicit expected.");
      case 2:
        aSN1TaggedObject = checkedCast(this.obj.toASN1Primitive());
        return ASN1Util.checkTag(aSN1TaggedObject, paramInt1, paramInt2);
    } 
    return replaceTag(paramInt1, paramInt2);
  }
  
  public ASN1Primitive getBaseUniversal(boolean paramBoolean, int paramInt) {
    ASN1UniversalType aSN1UniversalType = ASN1UniversalTypes.get(paramInt);
    if (null == aSN1UniversalType)
      throw new IllegalArgumentException("unsupported UNIVERSAL tag number: " + paramInt); 
    return getBaseUniversal(paramBoolean, aSN1UniversalType);
  }
  
  ASN1Primitive getBaseUniversal(boolean paramBoolean, ASN1UniversalType paramASN1UniversalType) {
    if (paramBoolean) {
      if (!isExplicit())
        throw new IllegalStateException("object explicit - implicit expected."); 
      return paramASN1UniversalType.checkedCast(this.obj.toASN1Primitive());
    } 
    if (1 == this.explicitness)
      throw new IllegalStateException("object explicit - implicit expected."); 
    ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
    switch (this.explicitness) {
      case 3:
        return paramASN1UniversalType.fromImplicitConstructed(rebuildConstructed(aSN1Primitive));
      case 4:
        return (aSN1Primitive instanceof ASN1Sequence) ? paramASN1UniversalType.fromImplicitConstructed((ASN1Sequence)aSN1Primitive) : paramASN1UniversalType.fromImplicitPrimitive((DEROctetString)aSN1Primitive);
    } 
    return paramASN1UniversalType.checkedCast(aSN1Primitive);
  }
  
  public ASN1Encodable parseBaseUniversal(boolean paramBoolean, int paramInt) throws IOException {
    ASN1Primitive aSN1Primitive = getBaseUniversal(paramBoolean, paramInt);
    switch (paramInt) {
      case 3:
        return (ASN1Encodable)((ASN1BitString)aSN1Primitive).parser();
      case 4:
        return (ASN1Encodable)((ASN1OctetString)aSN1Primitive).parser();
      case 16:
        return (ASN1Encodable)((ASN1Sequence)aSN1Primitive).parser();
      case 17:
        return (ASN1Encodable)((ASN1Set)aSN1Primitive).parser();
    } 
    return (ASN1Encodable)aSN1Primitive;
  }
  
  public ASN1Encodable parseExplicitBaseObject() throws IOException {
    return (ASN1Encodable)getExplicitBaseObject();
  }
  
  public ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException {
    return getExplicitBaseTagged();
  }
  
  public ASN1TaggedObjectParser parseImplicitBaseTagged(int paramInt1, int paramInt2) throws IOException {
    return getImplicitBaseTagged(paramInt1, paramInt2);
  }
  
  public final ASN1Primitive getLoadedObject() {
    return this;
  }
  
  abstract ASN1Sequence rebuildConstructed(ASN1Primitive paramASN1Primitive);
  
  abstract org.bouncycastle.asn1.ASN1TaggedObject replaceTag(int paramInt1, int paramInt2);
  
  ASN1Primitive toDERObject() {
    return (ASN1Primitive)new DERTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
  }
  
  ASN1Primitive toDLObject() {
    return (ASN1Primitive)new DLTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
  }
  
  public String toString() {
    return ASN1Util.getTagText(this.tagClass, this.tagNo) + ASN1Util.getTagText(this.tagClass, this.tagNo);
  }
  
  static ASN1Primitive createConstructedDL(int paramInt1, int paramInt2, ASN1EncodableVector paramASN1EncodableVector) {
    boolean bool = (paramASN1EncodableVector.size() == 1) ? true : false;
    return bool ? (ASN1Primitive)new DLTaggedObject(3, paramInt1, paramInt2, paramASN1EncodableVector.get(0)) : (ASN1Primitive)new DLTaggedObject(4, paramInt1, paramInt2, (ASN1Encodable)DLFactory.createSequence(paramASN1EncodableVector));
  }
  
  static ASN1Primitive createConstructedIL(int paramInt1, int paramInt2, ASN1EncodableVector paramASN1EncodableVector) {
    boolean bool = (paramASN1EncodableVector.size() == 1) ? true : false;
    return bool ? (ASN1Primitive)new BERTaggedObject(3, paramInt1, paramInt2, paramASN1EncodableVector.get(0)) : (ASN1Primitive)new BERTaggedObject(4, paramInt1, paramInt2, (ASN1Encodable)BERFactory.createSequence(paramASN1EncodableVector));
  }
  
  static ASN1Primitive createPrimitive(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    return (ASN1Primitive)new DLTaggedObject(4, paramInt1, paramInt2, (ASN1Encodable)new DEROctetString(paramArrayOfbyte));
  }
  
  private static org.bouncycastle.asn1.ASN1TaggedObject checkedCast(ASN1Primitive paramASN1Primitive) {
    if (paramASN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject)
      return (org.bouncycastle.asn1.ASN1TaggedObject)paramASN1Primitive; 
    throw new IllegalStateException("unexpected object: " + paramASN1Primitive.getClass().getName());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ASN1TaggedObject.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */