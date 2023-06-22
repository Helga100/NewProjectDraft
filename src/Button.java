import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Button extends JButton {

    private boolean isLastButton;

    public Button() {
        super();
        initUI();
    }

    public Button(Image i) {
        super(new ImageIcon(i));
    }

    public boolean isLastButton() {
        return isLastButton;
    }

    public void setLastButton(boolean isLastButton) {
        this.isLastButton = isLastButton;
    }

    private void initUI() {
        isLastButton = false;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.yellow));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.gray));
            }
        });
    }
}
