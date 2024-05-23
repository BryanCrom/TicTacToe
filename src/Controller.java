import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame {
    private Board board;
    private View view;

    public Controller(String title) {
        super(title);
        this.board = new Board();
        this.view = new View();

        this.getContentPane().add(this.view);
        this.setResizable(false);
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.view.getTopLeft().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                board.setSpot(0,0);
                view.getTopLeft().setVisible(false);
                view.getTopLeftInfo().setText(board.getTurn() + "");
                view.getTopLeftInfo().setVisible(true);
            }
        });
    }
}
