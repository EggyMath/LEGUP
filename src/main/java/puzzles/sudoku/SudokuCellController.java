package puzzles.sudoku;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SudokuCellController implements MouseListener
{
    private SudokuView sudokuView;

    public SudokuCellController(SudokuView sudokuView)
    {
        this.sudokuView = sudokuView;
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e)
    {
        SudokuElement cell = (SudokuElement) e.getSource();
        cell.getData().setValueInt(cell.getData().getValueInt() + 1);
        cell.repaint();
        cell.revalidate();
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e)
    {

    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e)
    {

    }
}
