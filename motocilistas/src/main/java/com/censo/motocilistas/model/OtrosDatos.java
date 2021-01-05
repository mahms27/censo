package com.censo.motocilistas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="otrosdatos")
public class OtrosDatos {
	
	@Id
    @Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	private Boolean hijos;
	
	private Integer canthijos;
	
	private String nomconyu;
	
	private Boolean clabora;
	
	private String tipocasa;
	
	private Boolean isactinfo;
	
	private String actinfo;
	
	private String npuesto;
	
	private String dirpues;
	
	private Boolean isotraact;
	
	private String otraact;
	
	private String promingr;
	
	private String promgas;
	
	private String nivelaca;
	
	private String ocursos;
	
	private String tobtenido;
	
	private Boolean propietario;
	
	private String placa;
	
	private Boolean ccctivos;
	
	private String modelo;
	
	private String color;
	
	private String tpropnom;
	
	private String numdocprop;
	
	private String celprop;
	
	private String soat;
	
	private String tecmec;
	
	private Integer cantidad;
	
	private String mensaje;

	private String qr;
	
	@OneToOne
    @JoinColumn(name = "FK_MOTOCICLISTA", updatable = false, nullable = false)
    private Motociclista motociclista;

	public Integer getCodigo() {
		return codigo;
	}

	public Boolean getHijos() {
		return hijos;
	}

	public Integer getCanthijos() {
		return canthijos;
	}

	public String getNomconyu() {
		return nomconyu;
	}

	public Boolean getClabora() {
		return clabora;
	}

	public String getTipocasa() {
		return tipocasa;
	}

	public Boolean getIsactinfo() {
		return isactinfo;
	}

	public String getActinfo() {
		return actinfo;
	}

	public String getNpuesto() {
		return npuesto;
	}

	public String getDirpues() {
		return dirpues;
	}

	public Boolean getIsotraact() {
		return isotraact;
	}

	public String getOtraact() {
		return otraact;
	}

	public String getPromingr() {
		return promingr;
	}

	public String getPromgas() {
		return promgas;
	}

	public String getNivelaca() {
		return nivelaca;
	}

	public String getOcursos() {
		return ocursos;
	}

	public String getTobtenido() {
		return tobtenido;
	}

	public Boolean getPropietario() {
		return propietario;
	}

	public String getPlaca() {
		return placa;
	}

	public Boolean getCcctivos() {
		return ccctivos;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public String getTpropnom() {
		return tpropnom;
	}

	public String getNumdocprop() {
		return numdocprop;
	}

	public String getCelprop() {
		return celprop;
	}

	public String getSoat() {
		return soat;
	}

	public String getTecmec() {
		return tecmec;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public String getMensaje() {
		return mensaje;
	}

	public String getQr() {
		return qr;
	}

	public Motociclista getMotociclista() {
		return motociclista;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setHijos(Boolean hijos) {
		this.hijos = hijos;
	}

	public void setCanthijos(Integer canthijos) {
		this.canthijos = canthijos;
	}

	public void setNomconyu(String nomconyu) {
		this.nomconyu = nomconyu;
	}

	public void setClabora(Boolean clabora) {
		this.clabora = clabora;
	}

	public void setTipocasa(String tipocasa) {
		this.tipocasa = tipocasa;
	}

	public void setIsactinfo(Boolean isactinfo) {
		this.isactinfo = isactinfo;
	}

	public void setActinfo(String actinfo) {
		this.actinfo = actinfo;
	}

	public void setNpuesto(String npuesto) {
		this.npuesto = npuesto;
	}

	public void setDirpues(String dirpues) {
		this.dirpues = dirpues;
	}

	public void setIsotraact(Boolean isotraact) {
		this.isotraact = isotraact;
	}

	public void setOtraact(String otraact) {
		this.otraact = otraact;
	}

	public void setPromingr(String promingr) {
		this.promingr = promingr;
	}

	public void setPromgas(String promgas) {
		this.promgas = promgas;
	}

	public void setNivelaca(String nivelaca) {
		this.nivelaca = nivelaca;
	}

	public void setOcursos(String ocursos) {
		this.ocursos = ocursos;
	}

	public void setTobtenido(String tobtenido) {
		this.tobtenido = tobtenido;
	}

	public void setPropietario(Boolean propietario) {
		this.propietario = propietario;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setCcctivos(Boolean ccctivos) {
		this.ccctivos = ccctivos;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setTpropnom(String tpropnom) {
		this.tpropnom = tpropnom;
	}

	public void setNumdocprop(String numdocprop) {
		this.numdocprop = numdocprop;
	}

	public void setCelprop(String celprop) {
		this.celprop = celprop;
	}

	public void setSoat(String soat) {
		this.soat = soat;
	}

	public void setTecmec(String tecmec) {
		this.tecmec = tecmec;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void setQr(String qr) {
		this.qr = qr;
	}

	public void setMotociclista(Motociclista motociclista) {
		this.motociclista = motociclista;
	}
	

}
