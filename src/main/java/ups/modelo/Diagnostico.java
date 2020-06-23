/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.modelo;

/**
 *
 * @author dilgg
 */
public class Diagnostico extends HistoriaClinica{
    private int codigoDiagnostico;
    private String enfermedadActualDiag;
    private Tratamiento tratamiento;
    private CitaMedica citaMedica;

    public Diagnostico(int codigoDiagnostico, String enfermedadActualDiag, Tratamiento tratamiento, CitaMedica citaMedica, int codigoHistoria) {
        super(codigoHistoria);
        this.codigoDiagnostico = codigoDiagnostico;
        this.enfermedadActualDiag = enfermedadActualDiag;
        this.tratamiento = tratamiento;
        this.citaMedica = citaMedica;
    }

    public Diagnostico(int codigoHistoria) {
        super(codigoHistoria);
    }

    public int getCodigoDiagnostico() {
        return codigoDiagnostico;
    }

    public void setCodigoDiagnostico(int codigoDiagnostico) {
        this.codigoDiagnostico = codigoDiagnostico;
    }

    public String getEnfermedadActualDiag() {
        return enfermedadActualDiag;
    }

    public void setEnfermedadActualDiag(String enfermedadActualDiag) {
        this.enfermedadActualDiag = enfermedadActualDiag;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    @Override
    protected int verificarcodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
