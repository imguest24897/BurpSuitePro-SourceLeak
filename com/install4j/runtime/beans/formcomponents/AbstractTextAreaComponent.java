/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.runtime.util.MinimumSizeTextArea;
/*    */ import com.install4j.runtime.util.TextAreaScrollPane;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JTextArea;
/*    */ import javax.swing.UIManager;
/*    */ import javax.swing.text.JTextComponent;
/*    */ 
/*    */ public abstract class AbstractTextAreaComponent extends TextComponent {
/* 11 */   private int columns = 0;
/* 12 */   private int rows = 3;
/*    */   private boolean fillVertical = false;
/*    */   private boolean useLabelFont = false;
/*    */   
/*    */   public int getColumns() {
/* 17 */     return replaceWithTextOverride("columns", this.columns);
/*    */   }
/*    */   
/*    */   public void setColumns(int columns) {
/* 21 */     this.columns = columns;
/*    */   }
/*    */   
/*    */   public int getRows() {
/* 25 */     return replaceWithTextOverride("rows", this.rows);
/*    */   }
/*    */   
/*    */   public void setRows(int rows) {
/* 29 */     this.rows = rows;
/*    */   }
/*    */   
/*    */   public boolean isFillVertical() {
/* 33 */     return replaceWithTextOverride("fillVertical", this.fillVertical);
/*    */   }
/*    */   
/*    */   public void setFillVertical(boolean fillVertical) {
/* 37 */     this.fillVertical = fillVertical;
/*    */   }
/*    */   
/*    */   public boolean isUseLabelFont() {
/* 41 */     return replaceWithTextOverride("useLabelFont", this.useLabelFont);
/*    */   }
/*    */   
/*    */   public void setUseLabelFont(boolean useLabelFont) {
/* 45 */     this.useLabelFont = useLabelFont;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterVertical() {
/* 50 */     return isFillVertical();
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createCenterComponent() {
/* 55 */     return (JComponent)new TextAreaScrollPane(super.createCenterComponent(), (getColumns() > 0));
/*    */   }
/*    */ 
/*    */   
/*    */   protected JTextComponent createTextComponent() {
/* 60 */     MinimumSizeTextArea minimumSizeTextArea = new MinimumSizeTextArea();
/* 61 */     int columns = getColumns();
/* 62 */     if (columns > 0) {
/* 63 */       minimumSizeTextArea.setColumns(columns);
/*    */     }
/* 65 */     int rows = getRows();
/* 66 */     if (rows > 0) {
/* 67 */       minimumSizeTextArea.setRows(rows);
/*    */     }
/* 69 */     return (JTextComponent)minimumSizeTextArea;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void applyTextComponentProperties(JTextComponent textComponent) {
/* 74 */     super.applyTextComponentProperties(textComponent);
/* 75 */     if (isUseLabelFont()) {
/* 76 */       textComponent.setFont(UIManager.getFont("Label.font"));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 82 */     return (getColumns() == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public Class getConfigurationObjectClass() {
/* 87 */     return JTextArea.class;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean isLeadingLabelTopAligned() {
/* 92 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\AbstractTextAreaComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */