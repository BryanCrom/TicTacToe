import javax.swing.*;
import java.awt.*;

public class View extends JPanel {
    private JLabel text;
    private JLabel turnInfo;

    private JButton topLeft;
    private JLabel topLeftInfo;

    private JButton topCenter;
    private JLabel topCenterInfo;

    private JButton topRight;
    private JLabel topRightInfo;

    private JButton middleLeft;
    private JLabel middleLeftInfo;

    private JButton middleCenter;
    private JLabel middleCenterInfo;

    private JButton middleRight;
    private JLabel middleRightInfo;

    private JButton bottomLeft;
    private JLabel bottomLeftInfo;

    private JButton bottomCenter;
    private JLabel bottomCenterInfo;

    private JButton bottomRight;
    private JLabel bottomRightInfo;

    private JLabel results;

    public View() {
        setLayout(null);

        //Label for instructions
        this.text = new JLabel("Please select a square", SwingConstants.CENTER);
        this.text.setVisible(true);
        this.text.setFont(new Font("Arial", Font.BOLD, 20));
        this.text.setBounds(0, 0, 650, 100);
        this.add(this.text);

        //label to show the user whose turn it is
        this.turnInfo = new JLabel("X's Turn", SwingConstants.CENTER);
        this.turnInfo.setVisible(true);
        this.turnInfo.setFont(new Font("Arial", Font.BOLD, 20));
        this.turnInfo.setBounds(0, 50, 650, 100);
        this.add(this.turnInfo);

        //top left button and associated label after pressed
        this.topLeft = new JButton();
        this.topLeft.setVisible(true);
        this.topLeft.setBounds(50, 150, 150, 150);
        this.add(this.topLeft);

        this.topLeftInfo = new JLabel("",SwingConstants.CENTER);
        this.topLeftInfo.setVisible(false);
        this.topLeftInfo.setFont(new Font("Arial", Font.BOLD, 50));
        this.topLeftInfo.setBounds(50, 150, 150, 150);
        this.add(this.topLeftInfo);

        //top center button and associated label after pressed
        this.topCenter = new JButton();
        this.topCenter.setVisible(true);
        this.topCenter.setBounds(250, 150, 150, 150);
        this.add(this.topCenter);

        this.topCenterInfo = new JLabel("",SwingConstants.CENTER);
        this.topCenterInfo.setVisible(false);
        this.topCenterInfo.setFont(new Font("Arial", Font.BOLD, 50));
        this.topCenterInfo.setBounds(250, 150, 150, 150);
        this.add(this.topCenterInfo);

        //top right button and associated label after pressed
        this.topRight = new JButton();
        this.topRight.setVisible(true);
        this.topRight.setBounds(450, 150, 150, 150);
        this.add(this.topRight);

        this.topRightInfo = new JLabel("",SwingConstants.CENTER);
        this.topRightInfo.setVisible(false);
        this.topRightInfo.setFont(new Font("Arial", Font.BOLD, 50));
        this.topRightInfo.setBounds(450, 150, 150, 150);
        this.add(this.topRightInfo);

        //middle left button and associated label after pressed
        this.middleLeft = new JButton();
        this.middleLeft.setVisible(true);
        this.middleLeft.setBounds(50, 350, 150, 150);
        this.add(this.middleLeft);

        this.middleLeftInfo = new JLabel("",SwingConstants.CENTER);
        this.middleLeftInfo.setVisible(false);
        this.middleLeftInfo.setFont(new Font("Arial", Font.BOLD, 50));
        this.middleLeftInfo.setBounds(50, 350, 150, 150);
        this.add(this.middleLeftInfo);

        //middle center button and associated label after pressed
        this.middleCenter = new JButton();
        this.middleCenter.setVisible(true);
        this.middleCenter.setBounds(250, 350, 150, 150);
        this.add(this.middleCenter);

        this.middleCenterInfo = new JLabel("",SwingConstants.CENTER);
        this.middleCenterInfo.setVisible(false);
        this.middleCenterInfo.setFont(new Font("Arial", Font.BOLD, 50));
        this.middleCenterInfo.setBounds(250, 350, 150, 150);
        this.add(this.middleCenterInfo);

        //middle right button and associated label after pressed
        this.middleRight = new JButton();
        this.middleRight.setVisible(true);
        this.middleRight.setBounds(450, 350, 150, 150);
        this.add(this.middleRight);

        this.middleRightInfo = new JLabel("",SwingConstants.CENTER);
        this.middleRightInfo.setVisible(false);
        this.middleRightInfo.setFont(new Font("Arial", Font.BOLD, 50));
        this.middleRightInfo.setBounds(450, 350, 150, 150);
        this.add(this.middleRightInfo);

        //bottom left button and associated label after pressed
        this.bottomLeft = new JButton();
        this.bottomLeft.setVisible(true);
        this.bottomLeft.setBounds(50, 550, 150, 150);
        this.add(this.bottomLeft);

        this.bottomLeftInfo = new JLabel("",SwingConstants.CENTER);
        this.bottomLeftInfo.setVisible(false);
        this.bottomLeftInfo.setFont(new Font("Arial", Font.BOLD, 50));
        this.bottomLeftInfo.setBounds(50, 550, 150, 150);
        this.add(this.bottomLeftInfo);

        //bottom center button and associated label after pressed
        this.bottomCenter = new JButton();
        this.bottomCenter.setVisible(true);
        this.bottomCenter.setBounds(250, 550, 150, 150);
        this.add(this.bottomCenter);

        this.bottomCenterInfo = new JLabel("",SwingConstants.CENTER);
        this.bottomCenterInfo.setVisible(false);
        this.bottomCenterInfo.setFont(new Font("Arial", Font.BOLD, 50));
        this.bottomCenterInfo.setBounds(250, 550, 150, 150);
        this.add(this.bottomCenterInfo);

        //bottom right button and associated label after pressed
        this.bottomRight = new JButton();
        this.bottomRight.setVisible(true);
        this.bottomRight.setBounds(450, 550, 150, 150);
        this.add(this.bottomRight);

        this.bottomRightInfo = new JLabel("",SwingConstants.CENTER);
        this.bottomRightInfo.setVisible(false);
        this.bottomRightInfo.setFont(new Font("Arial", Font.BOLD, 50));
        this.bottomRightInfo.setBounds(450, 550, 150, 150);
        this.add(this.bottomRightInfo);

        //results label when a player has won
        this.results = new JLabel("", SwingConstants.CENTER);
        this.results.setVisible(true);
        this.results.setFont(new Font("Arial", Font.BOLD, 20));
        this.results.setBounds(0, 725, 650, 100);
        this.add(this.results);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(220,150, 10, 550);
        g.fillRect(420,150, 10, 550);
        g.fillRect(50,320, 550, 10);
        g.fillRect(50,520, 550, 10);
    }

    //getters and setters

    public JLabel getText() {
        return text;
    }

    public void setText(JLabel text) {
        this.text = text;
    }

    public JLabel getTurnInfo() {
        return turnInfo;
    }

    public void setTurnInfo(JLabel turnInfo) {
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

    public JLabel getTopCenterInfo() {
        return topCenterInfo;
    }

    public void setTopCenterInfo(JLabel topCenterInfo) {
        this.topCenterInfo = topCenterInfo;
    }

    public JButton getTopRight() {
        return topRight;
    }

    public void setTopRight(JButton topRight) {
        this.topRight = topRight;
    }

    public JLabel getTopRightInfo() {
        return topRightInfo;
    }

    public void setTopRightInfo(JLabel topRightInfo) {
        this.topRightInfo = topRightInfo;
    }

    public JLabel getMiddleLeftInfo() {
        return middleLeftInfo;
    }

    public void setMiddleLeftInfo(JLabel middleLeftInfo) {
        this.middleLeftInfo = middleLeftInfo;
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

    public JLabel getMiddleCenterInfo() {
        return middleCenterInfo;
    }

    public void setMiddleCenterInfo(JLabel middleCenterInfo) {
        this.middleCenterInfo = middleCenterInfo;
    }

    public JButton getMiddleRight() {
        return middleRight;
    }

    public void setMiddleRight(JButton middleRight) {
        this.middleRight = middleRight;
    }

    public JLabel getMiddleRightInfo() {
        return middleRightInfo;
    }

    public void setMiddleRightInfo(JLabel middleRightInfo) {
        this.middleRightInfo = middleRightInfo;
    }

    public JButton getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(JButton bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public JLabel getBottomLeftInfo() {
        return bottomLeftInfo;
    }

    public void setBottomLeftInfo(JLabel bottomLeftInfo) {
        this.bottomLeftInfo = bottomLeftInfo;
    }

    public JButton getBottomCenter() {
        return bottomCenter;
    }

    public void setBottomCenter(JButton bottomCenter) {
        this.bottomCenter = bottomCenter;
    }

    public JLabel getBottomCenterInfo() {
        return bottomCenterInfo;
    }

    public void setBottomCenterInfo(JLabel bottomCenterInfo) {
        this.bottomCenterInfo = bottomCenterInfo;
    }

    public JButton getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(JButton bottomRight) {
        this.bottomRight = bottomRight;
    }

    public JLabel getBottomRightInfo() {
        return bottomRightInfo;
    }

    public void setBottomRightInfo(JLabel bottomRightInfo) {
        this.bottomRightInfo = bottomRightInfo;
    }

    public JLabel getResults() {
        return results;
    }

    public void setResults(JLabel results) {
        this.results = results;
    }
}
