import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame {
    private Board board;
    private View view;
    private char winState;

    public Controller(String title) {
        super(title);
        this.board = new Board();
        this.view = new View();
        this.setWinState(' ');

        this.getContentPane().add(this.view);
        this.setResizable(false);
        this.setSize(650, 900);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.view.getTopLeft().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTopLeftInfo().setText(board.getTurn() + "");
                board.setSpot(0,0);
                view.getTopLeft().setVisible(false);
                view.getTopLeftInfo().setVisible(true);
                view.getTurnInfo().setText(board.getTurn() + "'s Turn");
                displayResults();
            }
        });

        this.view.getTopCenter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTopCenterInfo().setText(board.getTurn() + "");
                board.setSpot(0,1);
                view.getTopCenter().setVisible(false);
                view.getTopCenterInfo().setVisible(true);
                view.getTurnInfo().setText(board.getTurn() + "'s Turn");
                displayResults();
            }
        });

        this.view.getTopRight().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTopRightInfo().setText(board.getTurn() + "");
                board.setSpot(0,2);
                view.getTopRight().setVisible(false);
                view.getTopRightInfo().setVisible(true);
                view.getTurnInfo().setText(board.getTurn() + "'s Turn");
                displayResults();
            }
        });

        this.view.getMiddleLeft().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMiddleLeftInfo().setText(board.getTurn() + "");
                board.setSpot(1,0);
                view.getMiddleLeft().setVisible(false);
                view.getMiddleLeftInfo().setVisible(true);
                view.getTurnInfo().setText(board.getTurn() + "'s Turn");
                displayResults();
            }
        });

        this.view.getMiddleCenter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMiddleCenterInfo().setText(board.getTurn() + "");
                board.setSpot(1,1);
                view.getMiddleCenter().setVisible(false);
                view.getMiddleCenterInfo().setVisible(true);
                view.getTurnInfo().setText(board.getTurn() + "'s Turn");
                displayResults();
            }
        });

        this.view.getMiddleRight().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMiddleRightInfo().setText(board.getTurn() + "");
                board.setSpot(1,2);
                view.getMiddleRight().setVisible(false);
                view.getMiddleRightInfo().setVisible(true);
                view.getTurnInfo().setText(board.getTurn() + "'s Turn");
                displayResults();
            }
        });

        this.view.getBottomLeft().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getBottomLeftInfo().setText(board.getTurn() + "");
                board.setSpot(2,0);
                view.getBottomLeft().setVisible(false);
                view.getBottomLeftInfo().setVisible(true);
                view.getTurnInfo().setText(board.getTurn() + "'s Turn");
                displayResults();
            }
        });

        this.view.getBottomCenter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getBottomCenterInfo().setText(board.getTurn() + "");
                board.setSpot(2,1);
                view.getBottomCenter().setVisible(false);
                view.getBottomCenterInfo().setVisible(true);
                view.getTurnInfo().setText(board.getTurn() + "'s Turn");
                displayResults();
            }
        });

        this.view.getBottomRight().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getBottomRightInfo().setText(board.getTurn() + "");
                board.setSpot(2,2);
                view.getBottomRight().setVisible(false);
                view.getBottomRightInfo().setVisible(true);
                view.getTurnInfo().setText(board.getTurn() + "'s Turn");
                displayResults();
            }
        });
    }

    public char getWinState() {
        return winState;
    }

    public void setWinState(char winState) {
        this.winState = winState;
    }

    public void displayResults(){
        setWinState(this.board.checkResults());
        if(this.winState == 'D'){
            this.view.getResults().setText("Draw");
        }
        else if(this.winState == 'X' || this.winState == 'O'){
            this.view.getResults().setText(winState + "'s Wins");
            this.view.getTopLeft().setVisible(false);
            this.view.getTopCenter().setVisible(false);
            this.view.getTopRight().setVisible(false);
            this.view.getMiddleLeft().setVisible(false);
            this.view.getMiddleCenter().setVisible(false);
            this.view.getMiddleRight().setVisible(false);
            this.view.getBottomLeft().setVisible(false);
            this.view.getBottomCenter().setVisible(false);
            this.view.getBottomRight().setVisible(false);
        }
    }
}
