import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController{
    private CalculatorModel theModel;
    private CalculatorView theView;

    public CalculatorController(CalculatorView theView,CalculatorModel theModel){
        this.theView=theView;
        this.theModel=theModel;
        this.theView.addCalulationListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            int fnum,snum=0;
            try{
                fnum=theView.getFirstNumber();
                snum=theView.getSecondNumber();

                theModel.addTwoNumbers(fnum,snum);
                theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch (NumberFormatException e1){
                theView.displayErrorMessage("YOU NEED TO ENTER 2 INTEGERS");
            }
        }
    }
}