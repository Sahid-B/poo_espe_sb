
package control;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.Modelo;
import vista.Vista2;

public class Control implements ActionListener {
    private Vista2 view;
    private Modelo model;

    public Control(Vista2 view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.botonSumar.addActionListener(this);
        this.view.BotonRestar.addActionListener(this);
        this.view.BotonMultiplicar.addActionListener(this);
        this.view.BotonDividir.addActionListener(this);
    }

    public void iniciar() {
        view.setTitle("va_a_sumar_por_medio_de_mvc");
        view.setLocationRelativeTo(null);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN2.setText(String.valueOf(model.getV2()));
        view.txtResultado.setText(String.valueOf(model.getTotal()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setV1(Integer.valueOf(view.txtN1.getText()));
        model.setV2(Integer.valueOf(view.txtN2.getText()));
        
        if (e.getSource() == view.botonSumar) {
            model.sumar();
        } else if (e.getSource() == view.BotonRestar) {
            model.restar();
        } else if (e.getSource() == view.BotonMultiplicar) {
            model.multiplicar();
        } else if (e.getSource() == view.BotonDividir) {
            model.dividir();
        }
        
        view.txtResultado.setText(String.valueOf(model.getTotal()));
    }
}

