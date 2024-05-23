import javax.swing.*;

public class View extends JPanel {
    private JLabel text;
    private JLabel turnInfo;

    private JButton topLeft;
    private JLabel topLeftInfo;

    private JButton topCenter;
    private JButton topRight;
    private JButton middleLeft;
    private JButton middleCenter;
    private JButton middleRight;
    private JButton bottomLeft;
    private JButton bottomCenter;
    private JButton bottomRight;
    private JLabel results;

    public View() {
        setLayout(null);

        this.text = new JLabel("Please select a square", SwingConstants.CENTER);
        this.text.setVisible(true);
        this.text.setBounds(0, 0, 500, 100);
        this.add(this.text);

        this.turnInfo = new JLabel("X's Turn", SwingConstants.CENTER);
        this.turnInfo.setVisible(true);
        this.turnInfo.setBounds(0, 100, 500, 100);
        this.add(this.turnInfo);

        this.topLeft = new JButton();
        this.topLeft.setVisible(true);
        this.topLeft.setBounds(0, 200, 150, 150);
        this.add(this.topLeft);

        this.topLeftInfo = new JLabel("",SwingConstants.CENTER);
        this.topLeftInfo.setVisible(false);
        this.topLeftInfo.setBounds(0, 200, 150, 150);
        this.add(this.topLeftInfo);

        this.topCenter = new JButton();
        this.topCenter.setVisible(true);
        this.topCenter.setBounds(200, 200, 100, 100);
        this.add(this.topCenter);

        this.topRight = new JButton();
        this.topRight.setVisible(true);
        this.topRight.setBounds(400, 200, 200, 200);
        this.add(this.topRight);

        this.middleLeft = new JButton();
        this.middleLeft.setVisible(true);
        this.middleLeft.setBounds(0, 400, 200, 200);
        this.add(this.middleLeft);

        this.middleCenter = new JButton();
        this.middleCenter.setVisible(true);
        this.middleCenter.setBounds(200, 400, 200, 200);
        this.add(this.middleCenter);

        this.middleRight = new JButton();
        this.middleRight.setVisible(true);
        this.middleRight.setBounds(400, 400, 200, 200);
        this.add(this.middleRight);

        this.bottomLeft = new JButton();
        this.bottomLeft.setVisible(true);
        this.bottomLeft.setBounds(0, 600, 200, 200);
        this.add(this.bottomLeft);

        this.bottomCenter = new JButton();
        this.bottomCenter.setVisible(true);
        this.bottomCenter.setBounds(200, 600, 200, 200);
        this.add(this.bottomCenter);

        this.bottomRight = new JButton();
        this.bottomRight.setVisible(true);
        this.bottomRight.setBounds(400, 600, 200, 200);
        this.add(this.bottomRight);

        this.results = new JLabel();
        this.results.setVisible(true);
        this.results.setBounds(0, 1500, 500, 100);
        this.add(this.results);
    }

    public JLabel getText() {
        return text;
    }

    public void setText(JLabel text) {
        this.text = text;
    }

    public JLabel getTitle() {
        return turnInfo;
    }

    public void setTitle(JLabel turnInfo) {
        this.turnInfo = turnInfo;
    }

    public JButton getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(JButton topLeft) {
        this.topLeft = topLeft;
    }

    public JLabel getTopLeftInfo() {
        return topLeftInfo;
    }

    public void setTopLeftInfo(JLabel topLeftInfo) {
        this.topLeftInfo = topLeftInfo;
    }

    public JButton getTopCenter() {
        return topCenter;
    }

    public void setTopCenter(JButton topCenter) {
        this.topCenter = topCenter;
    }

    public JButton getTopRight() {
        return topRight;
    }

    public void setTopRight(JButton topRight) {
        this.topRight = topRight;
    }

    public JButton getMiddleLeft() {
        return middleLeft;
    }

    public void setMiddleLeft(JButton middleLeft) {
        this.middleLeft = middleLeft;
    }

    public JButton getMiddleCenter() {
        return middleCenter;
    }

    public void setMiddleCenter(JButton middleCenter) {
        this.middleCenter = middleCenter;
    }

    public JButton getMiddleRight() {
        return middleRight;
    }

    public void setMiddleRight(JButton middleRight) {
        this.middleRight = middleRight;
    }

    public JButton getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(JButton bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public JButton getBottomCenter() {
        return bottomCenter;
    }

    public void setBottomCenter(JButton bottomCenter) {
        this.bottomCenter = bottomCenter;
    }

    public JButton getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(JButton bottomRight) {
        this.bottomRight = bottomRight;
    }

    public JLabel getResults() {
        return results;
    }

    public void setResults(JLabel results) {
        this.results = results;
    }
}
