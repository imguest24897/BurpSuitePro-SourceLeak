/*     */ package com.install4j.runtime.alert;
/*     */ import com.ejt.internal.gui.KeyboardUtil;
/*     */ import com.ejt.internal.util.CommonStringUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.util.AlertLafHelper;
/*     */ import com.install4j.runtime.util.ButtonBoxLayout;
/*     */ import com.install4j.runtime.util.DisplayTextArea;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.io.File;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ 
/*     */ public class DefaultAlertDialog extends CustomDialog {
/*     */   private static final int MIN_MESSAGE_WIDTH = 300;
/*     */   private static final int MAX_MESSAGE_WIDTH = 600;
/*  35 */   private static final Pattern LINE_PATTERN = Pattern.compile("[^\n\r]+"); private static final int REL_HORIZONTAL = 4; private static final int UNREL_HORIZONTAL = 7; private static final int PARA = 14; private static JCheckBox chkDoNotShowAgain; private int defaultButtonIndex; private int cancelButtonIndex; private int selectedButtonIndex; private int width;
/*     */   private FontMetrics fontMetrics;
/*     */   private int maxCharsPerLine;
/*     */   
/*     */   public static boolean isDoNotShowAgain() {
/*  40 */     return (chkDoNotShowAgain != null && chkDoNotShowAgain.isSelected());
/*     */   }
/*     */   
/*     */   public static int show(Window parentWindow, AlertType alertType, String windowTitle, String mainMessage, String contentMessage, List<String> buttonTitles, int defaultButtonIndex, int cancelButtonIndex, boolean doNotShowAgainOption, boolean rawMode) {
/*  44 */     DefaultAlertDialog dialog = new DefaultAlertDialog(parentWindow);
/*  45 */     dialog.init(windowTitle, alertType, mainMessage, contentMessage, buttonTitles, defaultButtonIndex, cancelButtonIndex, doNotShowAgainOption, rawMode);
/*  46 */     dialog.setVisible(true);
/*  47 */     dialog.dispose();
/*  48 */     return dialog.selectedButtonIndex;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private DefaultAlertDialog(Window parentWindow) {
/*  59 */     super(parentWindow);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameWidth() {
/*  64 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameHeight() {
/*  69 */     return -1;
/*     */   }
/*     */   
/*     */   private void init(String windowTitle, AlertType alertType, String mainMessage, String contentMessage, List<String> buttonTitles, int defaultButtonIndex, int cancelButtonIndex, boolean doNotShowAgainOption, boolean rawMode) {
/*  73 */     this.defaultButtonIndex = defaultButtonIndex;
/*  74 */     this.cancelButtonIndex = cancelButtonIndex;
/*     */     
/*  76 */     pack();
/*  77 */     this.fontMetrics = getGraphics().getFontMetrics(AlertLafHelper.getAlertFont());
/*  78 */     this.maxCharsPerLine = 600 / this.fontMetrics.charWidth('o');
/*     */     
/*  80 */     mainMessage = Alert.replaceTabs(mainMessage);
/*  81 */     if (!rawMode) {
/*  82 */       mainMessage = ellipsify(mainMessage);
/*     */     }
/*  84 */     this.width = calculateWidth(mainMessage, rawMode);
/*  85 */     if (contentMessage != null) {
/*  86 */       contentMessage = Alert.replaceTabs(contentMessage);
/*  87 */       if (!rawMode) {
/*  88 */         contentMessage = ellipsify(contentMessage);
/*     */       }
/*  90 */       this.width = Math.max(this.width, calculateWidth(contentMessage, rawMode));
/*     */     } 
/*     */     
/*  93 */     getRootPane().putClientProperty("JRootPane.titleBarBackground", GUIHelper.CONTENT_BACKGROUND_COLOR);
/*  94 */     setTitle(windowTitle);
/*  95 */     setModal(true);
/*  96 */     setResizable(false);
/*  97 */     addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowClosing(WindowEvent e) {
/* 100 */             DefaultAlertDialog.this.cancel();
/*     */           }
/*     */         });
/*     */     
/* 104 */     JPanel panel = new JPanel(new GridBagLayout());
/* 105 */     GridBagConstraints gc = new GridBagConstraints();
/* 106 */     gc.gridx = gc.gridy = 0;
/* 107 */     gc.weightx = gc.weighty = 1.0D;
/* 108 */     gc.fill = 1;
/* 109 */     panel.setFocusable(true);
/* 110 */     panel.add(createMessagePanel(alertType, mainMessage, contentMessage), gc);
/*     */     
/* 112 */     gc.weighty = 1.0D;
/* 113 */     gc.fill = 2;
/* 114 */     gc.insets.top = 7;
/* 115 */     gc.insets.bottom = 8;
/* 116 */     gc.gridy++;
/* 117 */     panel.add(createButtonPanel(doNotShowAgainOption, buttonTitles), gc);
/*     */     
/* 119 */     KeyboardUtil.addAccelerator(1, panel, panel, e -> defaultButton(), 10, 0);
/* 120 */     KeyboardUtil.addAccelerator(1, panel, panel, e -> cancel(), 27, 0);
/*     */     
/* 122 */     setContentPane(panel);
/* 123 */     setBounds(getFrameBounds());
/* 124 */     setBounds(getFrameBounds());
/*     */ 
/*     */     
/* 127 */     if (Util.isLinux()) {
/* 128 */       addWindowListener(new WindowAdapter() {
/*     */             boolean activated = false;
/*     */             
/*     */             public void windowActivated(WindowEvent e) {
/* 132 */               if (!this.activated) {
/* 133 */                 this.activated = true;
/* 134 */                 DefaultAlertDialog.this.setBounds(DefaultAlertDialog.this.getFrameBounds());
/*     */               } 
/*     */             }
/*     */           });
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private String ellipsify(String text) {
/* 143 */     Matcher matcher = Alert.NO_WRAP_PATTERN.matcher(text);
/* 144 */     StringBuffer buffer = new StringBuffer();
/* 145 */     while (matcher.find()) {
/* 146 */       String match = matcher.group();
/* 147 */       boolean ellipsedFile = false;
/* 148 */       if (match.contains(File.separator)) {
/*     */         try {
/* 150 */           matcher.appendReplacement(buffer, Matcher.quoteReplacement(CommonStringUtil.ellipseFileName(new File(match), this.maxCharsPerLine)));
/* 151 */           ellipsedFile = true;
/* 152 */         } catch (Exception exception) {}
/*     */       }
/*     */       
/* 155 */       if (!ellipsedFile) {
/* 156 */         matcher.appendReplacement(buffer, Matcher.quoteReplacement(CommonStringUtil.ellipse(match, this.maxCharsPerLine)));
/*     */       }
/*     */     } 
/* 159 */     matcher.appendTail(buffer);
/*     */     
/* 161 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   private int calculateWidth(String text, boolean rawMode) {
/* 165 */     int width = 300;
/*     */     
/* 167 */     Matcher matcher = (rawMode ? LINE_PATTERN : Alert.NO_WRAP_PATTERN).matcher(text);
/* 168 */     while (matcher.find()) {
/* 169 */       String match = matcher.group();
/* 170 */       width = Math.max(width, this.fontMetrics.stringWidth(match));
/*     */     } 
/* 172 */     return width + 2;
/*     */   }
/*     */   
/*     */   private Component createMessagePanel(AlertType alertType, String mainMessage, String contentMessage) {
/* 176 */     JPanel panel = new JPanel(new GridBagLayout());
/* 177 */     GridBagConstraints gc = new GridBagConstraints();
/* 178 */     gc.gridx = gc.gridy = 0;
/* 179 */     gc.gridheight = (contentMessage != null) ? 2 : 1;
/* 180 */     gc.anchor = 23;
/* 181 */     gc.insets.right = 10;
/* 182 */     panel.add(new JLabel(alertType.getIcon()), gc);
/* 183 */     gc.gridheight = 1;
/* 184 */     gc.insets.right = 0;
/* 185 */     gc.gridx = 1;
/* 186 */     gc.weightx = 1.0D;
/* 187 */     gc.fill = 2;
/* 188 */     boolean mainMessageAdded = !mainMessage.isEmpty();
/* 189 */     if (mainMessageAdded) {
/* 190 */       panel.add((Component)createMessageLabel(mainMessage, true), gc);
/*     */     }
/* 192 */     if (contentMessage != null) {
/* 193 */       gc.anchor = 21;
/* 194 */       if (mainMessageAdded) {
/* 195 */         gc.gridy++;
/* 196 */         gc.insets.top = 14;
/*     */       } 
/* 198 */       panel.add((Component)createMessageLabel(contentMessage, false), gc);
/*     */     } 
/* 200 */     panel.setOpaque(true);
/* 201 */     panel.setBackground(GUIHelper.CONTENT_BACKGROUND_COLOR);
/* 202 */     AlertLafHelper.applyBottomSeparator(panel);
/* 203 */     Border border = panel.getBorder();
/* 204 */     panel.setBorder(new CompoundBorder(border, new EmptyBorder(10, 10, 15, 10)));
/* 205 */     return panel;
/*     */   }
/*     */   
/*     */   private DisplayTextArea createMessageLabel(String text, boolean title) {
/* 209 */     DisplayTextArea displayTextArea = (DisplayTextArea)AlertLafHelper.alertFont((JComponent)new DisplayTextArea());
/* 210 */     displayTextArea.setText(text);
/* 211 */     if (title) {
/* 212 */       AlertLafHelper.makeAlertTitleLabel((JComponent)displayTextArea);
/*     */     }
/* 214 */     Dimension preferredSize = displayTextArea.getPreferredSize();
/* 215 */     preferredSize.width = this.width;
/* 216 */     displayTextArea.setSize(preferredSize);
/* 217 */     displayTextArea.setMinimumSize(preferredSize);
/* 218 */     return displayTextArea;
/*     */   }
/*     */   
/*     */   private JPanel createButtonPanel(boolean doNotShowAgainOption, List<String> buttonTitles) {
/* 222 */     JPanel panel = new JPanel(new GridBagLayout());
/* 223 */     GridBagConstraints gc = new GridBagConstraints();
/* 224 */     gc.gridy = 0;
/* 225 */     gc.gridx = -1;
/* 226 */     if (doNotShowAgainOption) {
/* 227 */       if (chkDoNotShowAgain == null) {
/* 228 */         chkDoNotShowAgain = (JCheckBox)AlertLafHelper.alertFont(new JCheckBox(" " + AlertOptionPane.getDontShowAgainMessage()));
/*     */       }
/* 230 */       chkDoNotShowAgain.setSelected(false);
/* 231 */       gc.insets.left = 7;
/* 232 */       panel.add(chkDoNotShowAgain, gc);
/*     */     } 
/* 234 */     gc.insets.left = gc.insets.right = 10;
/* 235 */     JPanel buttonBox = new JPanel((LayoutManager)new ButtonBoxLayout(4));
/* 236 */     for (int i = 0; i < buttonTitles.size(); i++) {
/* 237 */       JButton cancelButton = createButton(buttonTitles.get(i), i);
/* 238 */       buttonBox.add(cancelButton);
/*     */     } 
/*     */     
/* 241 */     gc.fill = 2;
/* 242 */     gc.anchor = 22;
/* 243 */     panel.add(buttonBox, gc);
/*     */     
/* 245 */     return panel;
/*     */   }
/*     */   
/*     */   private JButton createButton(String caption, int index) {
/* 249 */     JButton button = (JButton)AlertLafHelper.alertFont(new JButton(caption));
/* 250 */     ActionListener cancelListener = e -> {
/*     */         this.selectedButtonIndex = index;
/*     */         setVisible(false);
/*     */       };
/* 254 */     button.addActionListener(cancelListener);
/* 255 */     if (index == this.defaultButtonIndex) {
/* 256 */       getRootPane().setDefaultButton(button);
/*     */     }
/* 258 */     return button;
/*     */   }
/*     */   
/*     */   private void cancel() {
/* 262 */     this.selectedButtonIndex = this.cancelButtonIndex;
/* 263 */     setVisible(false);
/*     */   }
/*     */   
/*     */   private void defaultButton() {
/* 267 */     this.selectedButtonIndex = this.defaultButtonIndex;
/* 268 */     setVisible(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws Exception {
/* 273 */     UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/* 274 */     EventQueue.invokeLater(() -> {
/*     */           test1();
/*     */           test2();
/*     */           test3();
/*     */           testLongMessage();
/*     */           testLongFile();
/*     */           testLongText();
/*     */         });
/*     */   }
/*     */   
/*     */   private static void test1() {
/* 285 */     int selectedButtonIndex = show((Window)null, AlertType.INFORMATION, "Title", "Main message", "This is the content message", Arrays.asList(new String[] { "OK", "Cancel" }, ), 0, 1, true, false);
/* 286 */     System.out.println("selected index : " + selectedButtonIndex);
/*     */   }
/*     */   
/*     */   private static void test2() {
/* 290 */     int selectedButtonIndex = show((Window)null, AlertType.WARNING, "Title", "Just a very long title message. Just a very long title message. Just a very long title message. Just a very long title message.", (String)null, Arrays.asList(new String[] { "OK", "Cancel" }, ), 0, 1, false, false);
/* 291 */     System.out.println("selected index : " + selectedButtonIndex);
/*     */   }
/*     */   
/*     */   private static void test3() {
/* 295 */     int selectedButtonIndex = show((Window)null, AlertType.QUESTION, "Title", "Main message", "This is a long content message. This is a long content message. This is a long content message. This is a long content message. This is a long content message. ", Arrays.asList(new String[] { "Skip", "Retry", "Ignore" }, ), 1, -1, true, false);
/* 296 */     System.out.println("selected index : " + selectedButtonIndex);
/*     */   }
/*     */   
/*     */   private static void testLongMessage() {
/* 300 */     int selectedButtonIndex = show((Window)null, AlertType.INFORMATION, "Title", "Main message", "This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. This is the content message. ", Arrays.asList(new String[] { "OK", "Cancel" }, ), 0, 1, true, false);
/* 301 */     System.out.println("selected index : " + selectedButtonIndex);
/*     */   }
/*     */   
/*     */   private static void testLongFile() {
/* 305 */     int selectedButtonIndex = show((Window)null, AlertType.INFORMATION, "Title", "Main message", "This is the content message width a file name of c:\\Users\\bob\\folder1\\folder2\\folder3\\folder4\\folder5\\folder6\\folder7\\folder8\\folder9\\folder10\\fileName.txt which is too long to be displayed.", Arrays.asList(new String[] { "OK", "Cancel" }, ), 0, 1, true, false);
/* 306 */     System.out.println("selected index : " + selectedButtonIndex);
/*     */   }
/*     */ 
/*     */   
/*     */   private static void testLongText() {
/* 311 */     int selectedButtonIndex = show((Window)null, AlertType.INFORMATION, "Title", "Main message", "This is the content message width a file name aaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccccccccccccddddddddddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeee which is too long to be displayed.", Arrays.asList(new String[] { "OK", "Cancel" }, ), 0, 1, true, false);
/* 312 */     System.out.println("selected index : " + selectedButtonIndex);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\DefaultAlertDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */