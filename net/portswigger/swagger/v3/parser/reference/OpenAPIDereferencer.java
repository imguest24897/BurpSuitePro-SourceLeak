package net.portswigger.swagger.v3.parser.reference;

import java.util.Iterator;

public interface OpenAPIDereferencer {
  boolean canDereference(DereferencerContext paramDereferencerContext);
  
  void dereference(DereferencerContext paramDereferencerContext, Iterator<OpenAPIDereferencer> paramIterator);
  
  Traverser buildTraverser(DereferencerContext paramDereferencerContext);
  
  Visitor buildReferenceVisitor(DereferencerContext paramDereferencerContext, Reference paramReference, Traverser paramTraverser);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\reference\OpenAPIDereferencer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */