package domain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Tadeu on 24/10/2015.
 */
public class RSD implements Parcelable {

    //ABA 'DADOS GERAIS'
    private int idrsd;
    private String subarea;
    private String PGV;
    private String data; //private Date data;
    private String turno;
    private String horabaixamar; //verificar variável mais adequada
    private String horapreamar; //verificar variável mais adequada
    private int amplibaixamar;
    private int amplipreamar;
    private String condicaoclimatica;
    private String gv1;
    private String gv2;
    private String gv3;
    private String gv4;
    private String observacoesrsd;

    //ABA 'SERVIÇO PRAIA'
    private int qtdorientacao;
    private int qtdadvertencia;
    private int qtdcriancaperdida;
    private int qtdpulseiras;
    private int qtdanimalmarinho; //verificar separar 'água-viva' em outra variável?
    private int qtdresgate;
    private int qtdafogamento;
    private int qtdg1;
    private int qtdg2;
    private int qtdg3;
    private int qtdg4;
    private int qtdg5;
    private int qtdg6;
    private int qtdcadaver;

    //CONSTRUTOR
    public RSD(int idrsd, String subarea, String PGV, String data, String turno, String horabaixamar,
               String horapreamar, int amplibaixamar, int amplipreamar, String condicaoclimatica,
               String gv1, String gv2, String gv3, String gv4, String observacoesrsd, int qtdorientacao,
               int qtdadvertencia, int qtdcriancaperdida, int qtdpulseiras, int qtdanimalmarinho,
               int qtdresgate, int qtdafogamento, int qtdg1, int qtdg2, int qtdg3, int qtdg4,
               int qtdg5, int qtdg6, int qtdcadaver) {
        this.idrsd = idrsd;
        this.subarea = subarea;
        this.PGV = PGV;
        this.data = data;
        this.turno = turno;
        this.horabaixamar = horabaixamar;
        this.horapreamar = horapreamar;
        this.amplibaixamar = amplibaixamar;
        this.amplipreamar = amplipreamar;
        this.condicaoclimatica = condicaoclimatica;
        this.gv1 = gv1;
        this.gv2 = gv2;
        this.gv3 = gv3;
        this.gv4 = gv4;
        this.observacoesrsd = observacoesrsd;
        this.qtdorientacao = qtdorientacao;
        this.qtdadvertencia = qtdadvertencia;
        this.qtdcriancaperdida = qtdcriancaperdida;
        this.qtdpulseiras = qtdpulseiras;
        this.qtdanimalmarinho = qtdanimalmarinho;
        this.qtdresgate = qtdresgate;
        this.qtdafogamento = qtdafogamento;
        this.qtdg1 = qtdg1;
        this.qtdg2 = qtdg2;
        this.qtdg3 = qtdg3;
        this.qtdg4 = qtdg4;
        this.qtdg5 = qtdg5;
        this.qtdg6 = qtdg6;
        this.qtdcadaver = qtdcadaver;
    }

    //GETTERS ANS SETTERS
    public int getIdrsd() {
        return idrsd;
    }

    public void setIdrsd(int idrsd) {
        this.idrsd = idrsd;
    }

    public String getSubarea() {
        return subarea;
    }

    public void setSubarea(String subarea) {
        this.subarea = subarea;
    }

    public String getPGV() {
        return PGV;
    }

    public void setPGV(String PGV) {
        this.PGV = PGV;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getHorabaixamar() {
        return horabaixamar;
    }

    public void setHorabaixamar(String horabaixamar) {
        this.horabaixamar = horabaixamar;
    }

    public String getHorapreamar() {
        return horapreamar;
    }

    public void setHorapreamar(String horapreamar) {
        this.horapreamar = horapreamar;
    }

    public int getAmplibaixamar() {
        return amplibaixamar;
    }

    public void setAmplibaixamar(int amplibaixamar) {
        this.amplibaixamar = amplibaixamar;
    }

    public int getAmplipreamar() {
        return amplipreamar;
    }

    public void setAmplipreamar(int amplipreamar) {
        this.amplipreamar = amplipreamar;
    }

    public String getCondicaoclimatica() {
        return condicaoclimatica;
    }

    public void setCondicaoclimatica(String condicaoclimatica) {
        this.condicaoclimatica = condicaoclimatica;
    }

    public String getGv1() {
        return gv1;
    }

    public void setGv1(String gv1) {
        this.gv1 = gv1;
    }

    public String getGv2() {
        return gv2;
    }

    public void setGv2(String gv2) {
        this.gv2 = gv2;
    }

    public String getGv3() {
        return gv3;
    }

    public void setGv3(String gv3) {
        this.gv3 = gv3;
    }

    public String getGv4() {
        return gv4;
    }

    public void setGv4(String gv4) {
        this.gv4 = gv4;
    }

    public String getObservacoesrsd() {
        return observacoesrsd;
    }

    public void setObservacoesrsd(String observacoesrsd) {
        this.observacoesrsd = observacoesrsd;
    }

    public int getQtdorientacao() {
        return qtdorientacao;
    }

    public void setQtdorientacao(int qtdorientacao) {
        this.qtdorientacao = qtdorientacao;
    }

    public int getQtdadvertencia() {
        return qtdadvertencia;
    }

    public void setQtdadvertencia(int qtdadvertencia) {
        this.qtdadvertencia = qtdadvertencia;
    }

    public int getQtdcriancaperdida() {
        return qtdcriancaperdida;
    }

    public void setQtdcriancaperdida(int qtdcriancaperdida) {
        this.qtdcriancaperdida = qtdcriancaperdida;
    }

    public int getQtdpulseiras() {
        return qtdpulseiras;
    }

    public void setQtdpulseiras(int qtdpulseiras) {
        this.qtdpulseiras = qtdpulseiras;
    }

    public int getQtdanimalmarinho() {
        return qtdanimalmarinho;
    }

    public void setQtdanimalmarinho(int qtdanimalmarinho) {
        this.qtdanimalmarinho = qtdanimalmarinho;
    }

    public int getQtdresgate() {
        return qtdresgate;
    }

    public void setQtdresgate(int qtdresgate) {
        this.qtdresgate = qtdresgate;
    }

    public int getQtdafogamento() {
        return qtdafogamento;
    }

    public void setQtdafogamento(int qtdafogamento) {
        this.qtdafogamento = qtdafogamento;
    }

    public int getQtdg1() {
        return qtdg1;
    }

    public void setQtdg1(int qtdg1) {
        this.qtdg1 = qtdg1;
    }

    public int getQtdg2() {
        return qtdg2;
    }

    public void setQtdg2(int qtdg2) {
        this.qtdg2 = qtdg2;
    }

    public int getQtdg3() {
        return qtdg3;
    }

    public void setQtdg3(int qtdg3) {
        this.qtdg3 = qtdg3;
    }

    public int getQtdg4() {
        return qtdg4;
    }

    public void setQtdg4(int qtdg4) {
        this.qtdg4 = qtdg4;
    }

    public int getQtdg5() {
        return qtdg5;
    }

    public void setQtdg5(int qtdg5) {
        this.qtdg5 = qtdg5;
    }

    public int getQtdg6() {
        return qtdg6;
    }

    public void setQtdg6(int qtdg6) {
        this.qtdg6 = qtdg6;
    }

    public int getQtdcadaver() {
        return qtdcadaver;
    }

    public void setQtdcadaver(int qtdcadaver) {
        this.qtdcadaver = qtdcadaver;
    }

    //PARCELABLE
    public RSD(Parcel parcel) {
        setIdrsd(parcel.readInt());
        setSubarea(parcel.readString());
        setPGV(parcel.readString());
        setData(parcel.readString());
        setTurno(parcel.readString());
        setHorabaixamar(parcel.readString());
        setHorapreamar(parcel.readString());
        setAmplibaixamar(parcel.readInt());
        setAmplipreamar(parcel.readInt());
        setCondicaoclimatica(parcel.readString());
        setGv1(parcel.readString());
        setGv2(parcel.readString());
        setGv3(parcel.readString());
        setGv4(parcel.readString());
        setObservacoesrsd(parcel.readString());
        setQtdorientacao(parcel.readInt());
        setQtdadvertencia(parcel.readInt());
        setQtdcriancaperdida(parcel.readInt());
        setQtdpulseiras(parcel.readInt());
        setQtdanimalmarinho(parcel.readInt());
        setQtdresgate(parcel.readInt());
        setQtdafogamento(parcel.readInt());
        setQtdg1(parcel.readInt());
        setQtdg2(parcel.readInt());
        setQtdg3(parcel.readInt());
        setQtdg4(parcel.readInt());
        setQtdg5(parcel.readInt());
        setQtdg6(parcel.readInt());
        setQtdcadaver(parcel.readInt());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(getIdrsd());
        dest.writeString(getSubarea());
        dest.writeString(getPGV());
        dest.writeString(getData());
        dest.writeString(getTurno());
        dest.writeString(getHorabaixamar());
        dest.writeString(getHorapreamar());
        dest.writeInt(getAmplibaixamar());
        dest.writeInt(getAmplipreamar());
        dest.writeString(getCondicaoclimatica());
        dest.writeString(getGv1());
        dest.writeString(getGv2());
        dest.writeString(getGv3());
        dest.writeString(getGv4());
        dest.writeString(getObservacoesrsd());
        dest.writeInt(getQtdorientacao());
        dest.writeInt(getQtdadvertencia());
        dest.writeInt(getQtdcriancaperdida());
        dest.writeInt(getQtdpulseiras());
        dest.writeInt(getQtdanimalmarinho());
        dest.writeInt(getQtdresgate());
        dest.writeInt(getQtdafogamento());
        dest.writeInt(getQtdg1());
        dest.writeInt(getQtdg2());
        dest.writeInt(getQtdg3());
        dest.writeInt(getQtdg4());
        dest.writeInt(getQtdg5());
        dest.writeInt(getQtdg6());
        dest.writeInt(getQtdcadaver());

    }

    public static final Parcelable.Creator<RSD> CREATOR = new Parcelable.Creator<RSD>() {
        @Override
        public RSD createFromParcel(Parcel source) {
            return new RSD(source);
        }

        @Override
        public RSD[] newArray(int size) {
            return new RSD[size];
        }
    };


}
