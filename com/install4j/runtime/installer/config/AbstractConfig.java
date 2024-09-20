/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.XmlHelper;
/*    */ import java.awt.Color;
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ 
/*    */ public abstract class AbstractConfig
/*    */   implements Serializable
/*    */ {
/*    */   protected abstract void read(Element paramElement);
/*    */   
/*    */   protected static String readAttribute(Element element, String attributeName, String defaultValue) {
/* 16 */     return XmlHelper.readAttribute(element, attributeName, defaultValue);
/*    */   }
/*    */   
/*    */   protected static String readFileAttribute(Element element, String attributeName) {
/* 20 */     return readFileAttribute(element, attributeName, "");
/*    */   }
/*    */   
/*    */   protected static String readFileAttribute(Element element, String attributeName, String defaultValue) {
/* 24 */     return XmlHelper.readFileAttribute(element, attributeName, defaultValue);
/*    */   }
/*    */   
/*    */   protected static boolean readAttribute(Element element, String attributeName, boolean defaultValue) {
/* 28 */     return XmlHelper.readAttribute(element, attributeName, defaultValue);
/*    */   }
/*    */   
/*    */   protected static int readAttribute(Element element, String attributeName, int defaultValue) {
/* 32 */     return XmlHelper.readAttribute(element, attributeName, defaultValue);
/*    */   }
/*    */   
/*    */   protected static long readAttribute(Element element, String attributeName, long defaultValue) {
/* 36 */     return XmlHelper.readAttribute(element, attributeName, defaultValue);
/*    */   }
/*    */   
/*    */   protected static Color readAttribute(Element element, String attributeName, Color defaultValue) {
/* 40 */     return XmlHelper.readAttribute(element, attributeName, defaultValue);
/*    */   }
/*    */   
/*    */   protected static Element findChild(Element element, String elementName) {
/* 44 */     return XmlHelper.findChild(element, elementName);
/*    */   }
/*    */   
/*    */   protected static Iterable<Element> childElements(Element parentElement) {
/* 48 */     return XmlHelper.childElements(parentElement);
/*    */   }
/*    */   
/*    */   protected <E extends Enum & com.ejt.internal.util.XMLEnum<E>> E readAttribute(Element element, String attributeName, E defaultValue) {
/* 52 */     return (E)XmlHelper.readAttribute(element, attributeName, (Enum)defaultValue);
/*    */   }
/*    */   
/*    */   protected final void readStringList(Element parentElement, String elementName, List<String> list) {
/* 56 */     Element element = XmlHelper.findChild(parentElement, elementName);
/* 57 */     if (element != null) {
/* 58 */       list.clear();
/*    */       
/* 60 */       for (Element entry : XmlHelper.childElements(element))
/* 61 */         list.add(entry.getTextContent()); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\AbstractConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */