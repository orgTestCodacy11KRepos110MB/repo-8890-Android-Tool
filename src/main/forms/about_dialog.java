import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

public class about_dialog extends JDialog {
    public JLabel version;
    public JButton adbDriversWinButton;
    public JButton githubButton;
    public JButton telegramButton;
    public JButton webButton;
    public JButton alphaBuildButton;
    public JButton buyMeACoffeButton;
    public JButton byLavenderButton;
    private JPanel contentPane;

    public about_dialog() {
        setContentPane(contentPane);
        setModal(true);
        setIconImage(MainKt.getApp_icon());
        adbDriversWinButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/koush/adb.clockworkmod.com/releases/latest/download/UniversalAdbDriverSetup.msi"));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
        telegramButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://t.me/Android_TooI"));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
        githubButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/fast-geek/Android-Tool/"));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
        webButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://Android-Tool.ml/"));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
        alphaBuildButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/fast-geek/Android-Tool/releases/latest/download/Android-Tool.jar"));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
        buyMeACoffeButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://lavblog.ml/donat"));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
        byLavenderButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/fast-geek"));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
    }

    public static void main() {
        about_dialog dialog = new about_dialog();
        dialog.version.setText(MainKt.getProgram_version());
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setResizable(false);
        dialog.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(6, 5, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, -1, 26, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setText("Android-Tool");
        panel1.add(label1, new GridConstraints(0, 3, 1, 2, GridConstraints.ANCHOR_SOUTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setEnabled(true);
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD, 16, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setText("Version");
        panel1.add(label2, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        version = new JLabel();
        Font versionFont = this.$$$getFont$$$(null, -1, 14, version.getFont());
        if (versionFont != null) version.setFont(versionFont);
        version.setText("");
        panel1.add(version, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setIcon(new ImageIcon(getClass().getResource("/appIcon.png")));
        label3.setText("");
        panel1.add(label3, new GridConstraints(0, 0, 4, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        githubButton = new JButton();
        githubButton.setFocusable(false);
        githubButton.setIcon(new ImageIcon(getClass().getResource("/githubLogo.png")));
        githubButton.setText("");
        githubButton.setToolTipText("GitHub Repo");
        panel1.add(githubButton, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        telegramButton = new JButton();
        telegramButton.setFocusable(false);
        telegramButton.setIcon(new ImageIcon(getClass().getResource("/telegramLogo.png")));
        telegramButton.setText("");
        telegramButton.setToolTipText("Telegram channel");
        panel1.add(telegramButton, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        alphaBuildButton = new JButton();
        alphaBuildButton.setFocusable(false);
        alphaBuildButton.setText("Last Build");
        alphaBuildButton.setToolTipText("Download a latest unstable build");
        panel1.add(alphaBuildButton, new GridConstraints(5, 3, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        webButton = new JButton();
        webButton.setFocusable(false);
        webButton.setIcon(new ImageIcon(getClass().getResource("/webIcon.png")));
        webButton.setText("");
        webButton.setToolTipText("Android-Tool Site");
        panel1.add(webButton, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adbDriversWinButton = new JButton();
        adbDriversWinButton.setFocusable(false);
        adbDriversWinButton.setText("ADB Drivers");
        adbDriversWinButton.setToolTipText("ADB Drivers for WIndows. Required for WIndows 7");
        panel1.add(adbDriversWinButton, new GridConstraints(5, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buyMeACoffeButton = new JButton();
        buyMeACoffeButton.setFocusable(false);
        buyMeACoffeButton.setText("Buy Me a Coffee");
        buyMeACoffeButton.setToolTipText("Donate link");
        panel1.add(buyMeACoffeButton, new GridConstraints(4, 3, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        byLavenderButton = new JButton();
        byLavenderButton.setBorderPainted(false);
        byLavenderButton.setContentAreaFilled(false);
        byLavenderButton.setFocusPainted(false);
        byLavenderButton.setFocusable(false);
        byLavenderButton.setOpaque(false);
        byLavenderButton.setText("<html>by <a href=\\\"https://t.me/fast_geek\">lavender</a></html>");
        panel1.add(byLavenderButton, new GridConstraints(1, 3, 2, 2, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }

}
