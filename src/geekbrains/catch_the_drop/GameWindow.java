package geekbrains.catch_the_drop;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame
{
    private static GameWindow game_window;

    public static void main(String[] args)
    {
        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(200, 100);
        game_window.setSize(906, 478);
        game_window.setResizable(false);
        GameField game_filed = new GameField();
        game_window.add(game_filed);
        game_window.setVisible(true);
    }
    private static void onRepaint(Graphics g)
    {
        g.fillOval(10, 10, 200, 100);
        g.drawLine(130, 30, 530, 430);
    }
    private static class GameField extends JPanel
    {
        @Override
        protected void paintComponent (Graphics g)
        {
            super.paintComponent(g);
            onRepaint(g);
        }
    }
}
