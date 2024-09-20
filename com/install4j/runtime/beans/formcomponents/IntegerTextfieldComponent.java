/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import java.text.NumberFormat;
/*    */ import javax.swing.text.DefaultFormatter;
/*    */ import javax.swing.text.NumberFormatter;
/*    */ 
/*    */ public class IntegerTextfieldComponent
/*    */   extends FormattedTextfieldComponent {
/*  9 */   private int minimumDigits = 0;
/* 10 */   private int maximumDigits = 0;
/*    */   private boolean useGrouping = false;
/*    */   private boolean allowsInvalid = false;
/*    */   
/*    */   public int getMinimumDigits() {
/* 15 */     return replaceWithTextOverride("minimumDigits", this.minimumDigits);
/*    */   }
/*    */   
/*    */   public void setMinimumDigits(int minimumDigits) {
/* 19 */     this.minimumDigits = minimumDigits;
/*    */   }
/*    */   
/*    */   public int getMaximumDigits() {
/* 23 */     return replaceWithTextOverride("maximumDigits", this.maximumDigits);
/*    */   }
/*    */   
/*    */   public void setMaximumDigits(int maximumDigits) {
/* 27 */     this.maximumDigits = maximumDigits;
/*    */   }
/*    */   
/*    */   public boolean isUseGrouping() {
/* 31 */     return replaceWithTextOverride("useGrouping", this.useGrouping);
/*    */   }
/*    */   
/*    */   public void setUseGrouping(boolean useGrouping) {
/* 35 */     this.useGrouping = useGrouping;
/*    */   }
/*    */   
/*    */   public boolean isAllowsInvalid() {
/* 39 */     return replaceWithTextOverride("allowsInvalid", this.allowsInvalid);
/*    */   }
/*    */   
/*    */   public void setAllowsInvalid(boolean allowsInvalid) {
/* 43 */     this.allowsInvalid = allowsInvalid;
/*    */   }
/*    */ 
/*    */   
/*    */   protected DefaultFormatter createFormatter() {
/* 48 */     NumberFormat integerInstance = NumberFormat.getIntegerInstance();
/* 49 */     if (getMaximumDigits() > 0) {
/* 50 */       integerInstance.setMaximumIntegerDigits(getMaximumDigits());
/*    */     }
/* 52 */     integerInstance.setMinimumIntegerDigits(getMinimumDigits());
/* 53 */     integerInstance.setGroupingUsed(isUseGrouping());
/* 54 */     NumberFormatter numberFormatter = new NumberFormatter(integerInstance);
/* 55 */     numberFormatter.setAllowsInvalid(isAllowsInvalid());
/* 56 */     return numberFormatter;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Object getValue() {
/* 61 */     Object value = super.getValue();
/* 62 */     if (value instanceof Double) {
/* 63 */       return Long.valueOf(0L);
/*    */     }
/* 65 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\IntegerTextfieldComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */