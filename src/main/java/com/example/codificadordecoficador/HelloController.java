package com.example.codificadordecoficador;

import com.example.codificadordecoficador.CodificadorBinario.CodificadorBinario;
import com.example.codificadordecoficador.DecodificadorBinario.DecodificadorBinario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Pane PanelPrincipal;

    @FXML
    private VBox PanelMenu;

    @FXML
    private VBox NombresPanelMenu;

    @FXML
    private Pane PanelCodificador;

    @FXML
    private Pane PanelDecodificador;

    @FXML
    private Pane PanelErrorDecodificar;

    @FXML
    private Pane PanelErrorCodificar;

    @FXML
    private Pane PanelEntregaDatos;

    @FXML
    private Pane PanelEntregaDatos2;

    @FXML
    private Button AtrasCodificador;

    @FXML
    private TextField Nombre;

    @FXML
    private TextField Apellidos;

    @FXML
    private TextField Documento;

    @FXML
    private TextField DiagnosticoI;

    @FXML
    private TextField DiagnosticoF;

    @FXML
    private TextField Medicamento;

    @FXML
    private DatePicker Fecha;

    @FXML
    private TextArea textoBinario;

    @FXML
    private TextArea EntregaCodificacion;

    @FXML
    private TextArea SalidaDecodificacion;

    @FXML
    private Text TextoErrorDecodificar;

    @FXML
    private Text TextoErrorCodificar;

    @FXML
    private Text NombreSalida;

    @FXML
    private Text ApellidoSalida;

    @FXML
    private Text DocumentoSalida;

    @FXML
    private Text DiagnosticoISalida;

    @FXML
    private Text DiagnosticoFSalida;

    @FXML
    private Text MedicamentoSalida;

    @FXML
    private Text FechaSalida;

    @FXML
    private Button Codificar;

    @FXML
    private Button BorrarCodificador;

    @FXML
    private Button DecodificarMenu;

    @FXML
    private Button BorrarDecodificador;

    @FXML
    private Button Salida;


    public String textoMenu = "";

    private CodificadorBinario codificadorBinario = new CodificadorBinario(12345);

    private DecodificadorBinario decodificadorBinario = new DecodificadorBinario(1234);


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    public void onCodificarButton() {

        PanelPrincipal.setVisible(false);
        PanelCodificador.setVisible(true);
        NombresPanelMenu.setVisible(true);
        PanelMenu.setVisible(true);
        Codificar.setVisible(true);
        BorrarCodificador.setVisible(true);
        PanelEntregaDatos.setVisible(false);
        PanelErrorCodificar.setVisible(false);
    }

    public void onDecodificarButton() {

        PanelPrincipal.setVisible(false);
        PanelDecodificador.setVisible(true);
        textoBinario.setText(null);
        BorrarDecodificador.setVisible(true);
        DecodificarMenu.setVisible(true);
        PanelEntregaDatos2.setVisible(false);
        PanelErrorDecodificar.setVisible(false);

    }

    public void onAtrasCodificador() {

        PanelPrincipal.setVisible(true);
        PanelCodificador.setVisible(false);
    }

    public void onAtrasDecodificador() {

        PanelPrincipal.setVisible(true);
        PanelDecodificador.setVisible(false);


    }

    public void onCodificarMenuButton() {


        try {

            PanelErrorCodificar.setVisible(false);
            textoMenu = Nombre.getText() +"\n"+ Apellidos.getText() + "\n" + Documento.getText() + "\n" + DiagnosticoI.getText() + "\n"
                    + DiagnosticoF.getText() + "\n" + Medicamento.getText() + "\n" + Fecha.getValue().toString();


            PanelEntregaDatos.setVisible(true);
            Codificar.setVisible(false);
            BorrarCodificador.setVisible(false);
            PanelMenu.setVisible(false);
            NombresPanelMenu.setVisible(false);

            NombreSalida.setText(Nombre.getText());
            ApellidoSalida.setText(Apellidos.getText());
            DocumentoSalida.setText(Documento.getText());
            DiagnosticoISalida.setText(DiagnosticoI.getText());
            DiagnosticoFSalida.setText(DiagnosticoF.getText());
            MedicamentoSalida.setText(Medicamento.getText());
            FechaSalida.setText(Fecha.getValue().toString());

            EntregaCodificacion.setText(codificadorBinario.codificador(textoMenu));




        }catch (Exception e){

            PanelErrorCodificar.setVisible(true);
            TextoErrorCodificar.setText("Algun campo esta vacio revise nuevamente");

        }




    }


    public void onDecodificarMenuButton() {


        if (textoBinario.getText() == null){

            PanelErrorDecodificar.setVisible(true);
            TextoErrorDecodificar.setText("Deber agregar una codificacion");
        }else{


            PanelErrorDecodificar.setVisible(false);


            DecodificarMenu.setVisible(false);
            BorrarDecodificador.setVisible(false);
            PanelEntregaDatos2.setVisible(true);
            SalidaDecodificacion.setText(decodificadorBinario.Decodificador(textoBinario.getText()));

        }


    }

    public void onBorrarDecodificador() {

        textoBinario.setText(null);
    }

    public void onBorrarCodificador() {

        Nombre.setText(null);
        Apellidos.setText(null);
        Documento.setText(null);
        DiagnosticoI.setText(null);
        DiagnosticoF.setText(null);
        Medicamento.setText(null);
        Fecha.setValue(null);
    }


    public static void cerrarVentana (ActionEvent e ){

        Node source = (Node) e.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }


    public void onClickSalida(ActionEvent e) {

        cerrarVentana(e);
    }
}