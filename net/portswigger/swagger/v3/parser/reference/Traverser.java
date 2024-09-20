package net.portswigger.swagger.v3.parser.reference;

import net.portswigger.swagger.v3.oas.models.OpenAPI;

public interface Traverser {
  OpenAPI traverse(OpenAPI paramOpenAPI, Visitor paramVisitor) throws Exception;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\reference\Traverser.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */