package domain;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by Tadeu on 24/10/2015.
 */
public class RML { //implements Parcelable

    //PARA TESTE DO SQLITE
    private int idrml;
    private String PGV;
    private String data;

    public RML(int idrml, String PGV, String data) {
        this.idrml = idrml;
        this.PGV = PGV;
        this.data = data;
    }

    public int getIdrml() {
        return idrml;
    }

    public void setIdrml(int idrml) {
        this.idrml = idrml;
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



    /*
    //ABA 'DADOS GERAIS'
    private int idrml;
    private String subarea;
    private String PGV;
    private String data; //private Date data;
    private String turno;
    private String horainicio; //verificar variável mais adequada
    private String horafim; //verificar variável mais adequada
    private String condicaoclimatica;
    private String mare;
    private String gv1;
    private String gv2;
    private String gv3;
    private String gv4;
    private String observacoes;

    //ABA 'VÍTIMA'
    private String nomevitima;
    private int idadevitima;
    private String sexovitima;
    private String cidadeorigemvitima;
    private String estadoorigemvitima;
    private int grauafogamentovitima;
    private String experienciameio;
    private String atividadevitimaincidente;
    private String previsaoestadiavitima;
    private String habilidadenatacaovitima;
    private String ciavitima;
    private String escolaridadevitima;

    //ABA 'ATENDIMENTO'
    private String formaaviso;
    private String distpgvincidente;
    private String localavbordagemvitima;
    private String causaincidentes; //verificar variável mais adequada
    private String procedadotados; //verificar variável mais adequada

    private int photo; //excluir após implementação do SQLITE e comunicação com BD MYSQL

    //CONSTRUTOR
    public RML(int idrml, String subarea, String PGV, String data, String turno, String horainicio,
               String horafim, String condicaoclimatica, String mare, String gv1, String gv2, String gv3,
               String gv4, String observacoes, String nomevitima, int idadevitima, String sexovitima,
               String cidadeorigemvitima, String estadoorigemvitima, int grauafogamentovitima,
               String experienciameio, String atividadevitimaincidente, String previsaoestadiavitima,
               String habilidadenatacaovitima, String ciavitima, String escolaridadevitima, String formaaviso,
               String distpgvincidente, String localavbordagemvitima, String causaincidentes, String procedadotados, int photo) {
        this.idrml = idrml;
        this.subarea = subarea;
        this.PGV = PGV;
        this.data = data;
        this.turno = turno;
        this.horainicio = horainicio;
        this.horafim = horafim;
        this.condicaoclimatica = condicaoclimatica;
        this.mare = mare;
        this.gv1 = gv1;
        this.gv2 = gv2;
        this.gv3 = gv3;
        this.gv4 = gv4;
        this.observacoes = observacoes;
        this.nomevitima = nomevitima;
        this.idadevitima = idadevitima;
        this.sexovitima = sexovitima;
        this.cidadeorigemvitima = cidadeorigemvitima;
        this.estadoorigemvitima = estadoorigemvitima;
        this.grauafogamentovitima = grauafogamentovitima;
        this.experienciameio = experienciameio;
        this.atividadevitimaincidente = atividadevitimaincidente;
        this.previsaoestadiavitima = previsaoestadiavitima;
        this.habilidadenatacaovitima = habilidadenatacaovitima;
        this.ciavitima = ciavitima;
        this.escolaridadevitima = escolaridadevitima;
        this.formaaviso = formaaviso;
        this.distpgvincidente = distpgvincidente;
        this.localavbordagemvitima = localavbordagemvitima;
        this.causaincidentes = causaincidentes;
        this.procedadotados = procedadotados;
        this.photo = photo;
    }

        //GETTERS AND SETTERS
    public int getIdrml() {
        return idrml;
    }

    public void setIdrml(int idrml) {
        this.idrml = idrml;
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

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafim() {
        return horafim;
    }

    public void setHorafim(String horafim) {
        this.horafim = horafim;
    }

    public String getCondicaoclimatica() {
        return condicaoclimatica;
    }

    public void setCondicaoclimatica(String condicaoclimatica) {
        this.condicaoclimatica = condicaoclimatica;
    }

    public String getMare() {
        return mare;
    }

    public void setMare(String mare) {
        this.mare = mare;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getNomevitima() {
        return nomevitima;
    }

    public void setNomevitima(String nomevitima) {
        this.nomevitima = nomevitima;
    }

    public int getIdadevitima() {
        return idadevitima;
    }

    public void setIdadevitima(int idadevitima) {
        this.idadevitima = idadevitima;
    }

    public String getSexovitima() {
        return sexovitima;
    }

    public void setSexovitima(String sexovitima) {
        this.sexovitima = sexovitima;
    }

    public String getCidadeorigemvitima() {
        return cidadeorigemvitima;
    }

    public void setCidadeorigemvitima(String cidadeorigemvitima) {
        this.cidadeorigemvitima = cidadeorigemvitima;
    }

    public String getEstadoorigemvitima() {
        return estadoorigemvitima;
    }

    public void setEstadoorigemvitima(String estadoorigemvitima) {
        this.estadoorigemvitima = estadoorigemvitima;
    }

    public int getGrauafogamentovitima() {
        return grauafogamentovitima;
    }

    public void setGrauafogamentovitima(int grauafogamentovitima) {
        this.grauafogamentovitima = grauafogamentovitima;
    }

    public String getExperienciameio() {
        return experienciameio;
    }

    public void setExperienciameio(String experienciameio) {
        this.experienciameio = experienciameio;
    }

    public String getAtividadevitimaincidente() {
        return atividadevitimaincidente;
    }

    public void setAtividadevitimaincidente(String atividadevitimaincidente) {
        this.atividadevitimaincidente = atividadevitimaincidente;
    }

    public String getPrevisaoestadiavitima() {
        return previsaoestadiavitima;
    }

    public void setPrevisaoestadiavitima(String previsaoestadiavitima) {
        this.previsaoestadiavitima = previsaoestadiavitima;
    }

    public String getHabilidadenatacaovitima() {
        return habilidadenatacaovitima;
    }

    public void setHabilidadenatacaovitima(String habilidadenatacaovitima) {
        this.habilidadenatacaovitima = habilidadenatacaovitima;
    }

    public String getCiavitima() {
        return ciavitima;
    }

    public void setCiavitima(String ciavitima) {
        this.ciavitima = ciavitima;
    }

    public String getEscolaridadevitima() {
        return escolaridadevitima;
    }

    public void setEscolaridadevitima(String escolaridadevitima) {
        this.escolaridadevitima = escolaridadevitima;
    }

    public String getFormaaviso() {
        return formaaviso;
    }

    public void setFormaaviso(String formaaviso) {
        this.formaaviso = formaaviso;
    }

    public String getDistpgvincidente() {
        return distpgvincidente;
    }

    public void setDistpgvincidente(String distpgvincidente) {
        this.distpgvincidente = distpgvincidente;
    }

    public String getLocalavbordagemvitima() {
        return localavbordagemvitima;
    }

    public void setLocalavbordagemvitima(String localavbordagemvitima) {
        this.localavbordagemvitima = localavbordagemvitima;
    }

    public String getCausaincidentes() {
        return causaincidentes;
    }

    public void setCausaincidentes(String causaincidentes) {
        this.causaincidentes = causaincidentes;
    }

    public String getProcedadotados() {
        return procedadotados;
    }

    public void setProcedadotados(String procedadotados) {
        this.procedadotados = procedadotados;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    //MÉTODOS PARCELABLE
    public RML(Parcel parcel) {
        setIdrml(parcel.readInt());
        setSubarea(parcel.readString());
        setPGV(parcel.readString());
        setData(parcel.readString());
        setTurno(parcel.readString());
        setHorainicio(parcel.readString());
        setHorafim(parcel.readString());
        setCondicaoclimatica(parcel.readString());
        setMare(parcel.readString());
        setGv1(parcel.readString());
        setGv2(parcel.readString());
        setGv3(parcel.readString());
        setGv4(parcel.readString());
        setObservacoes(parcel.readString());
        setNomevitima(parcel.readString());
        setIdadevitima(parcel.readInt());
        setSexovitima(parcel.readString());
        setCidadeorigemvitima(parcel.readString());
        setEstadoorigemvitima(parcel.readString());
        setGrauafogamentovitima(parcel.readInt());
        setExperienciameio(parcel.readString());
        setAtividadevitimaincidente(parcel.readString());
        setPrevisaoestadiavitima(parcel.readString());
        setHabilidadenatacaovitima(parcel.readString());
        setCiavitima(parcel.readString());
        setEscolaridadevitima(parcel.readString());
        setFormaaviso(parcel.readString());
        setDistpgvincidente(parcel.readString());
        setLocalavbordagemvitima(parcel.readString());
        setCausaincidentes(parcel.readString());
        setProcedadotados(parcel.readString());
        setPhoto(parcel.readInt());
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(getIdrml());
        dest.writeString(getSubarea());
        dest.writeString(getPGV());
        dest.writeString(getData());
        dest.writeString(getTurno());
        dest.writeString(getHorainicio());
        dest.writeString(getHorafim());
        dest.writeString(getCondicaoclimatica());
        dest.writeString(getMare());
        dest.writeString(getGv1());
        dest.writeString(getGv2());
        dest.writeString(getGv3());
        dest.writeString(getGv4());
        dest.writeString(getObservacoes());
        dest.writeString(getNomevitima());
        dest.writeInt(getIdadevitima());
        dest.writeString(getSexovitima());
        dest.writeString(getCidadeorigemvitima());
        dest.writeString(getEstadoorigemvitima());
        dest.writeInt(getGrauafogamentovitima());
        dest.writeString(getExperienciameio());
        dest.writeString(getAtividadevitimaincidente());
        dest.writeString(getPrevisaoestadiavitima());
        dest.writeString(getHabilidadenatacaovitima());
        dest.writeString(getCiavitima());
        dest.writeString(getEscolaridadevitima());
        dest.writeString(getFormaaviso());
        dest.writeString(getDistpgvincidente());
        dest.writeString(getLocalavbordagemvitima());
        dest.writeString(getCausaincidentes());
        dest.writeString(getProcedadotados());
        dest.writeInt(getPhoto());
    }

    public static final Parcelable.Creator<RML> CREATOR = new Parcelable.Creator<RML>() {
        @Override
        public RML createFromParcel(Parcel source) {
            return new RML(source);
        }

        @Override
        public RML[] newArray(int size) {
            return new RML[size];
        }
    };
    */


}
