package org.bouncycastle.asn1.x509;

public interface NameConstraintValidator {
  void checkPermitted(GeneralName paramGeneralName) throws NameConstraintValidatorException;
  
  void checkExcluded(GeneralName paramGeneralName) throws NameConstraintValidatorException;
  
  void intersectPermittedSubtree(GeneralSubtree paramGeneralSubtree);
  
  void intersectPermittedSubtree(GeneralSubtree[] paramArrayOfGeneralSubtree);
  
  void intersectEmptyPermittedSubtree(int paramInt);
  
  void addExcludedSubtree(GeneralSubtree paramGeneralSubtree);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\NameConstraintValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */