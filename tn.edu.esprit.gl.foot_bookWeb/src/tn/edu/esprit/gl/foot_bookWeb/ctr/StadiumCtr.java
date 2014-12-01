package tn.edu.esprit.gl.foot_bookWeb.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import tn.edu.esprit.gl.foot_bookEJB.model.Stadium;
import tn.edu.esprit.gl.foot_bookEJB.services.interfaces.StadiumServicesLocal;

@ManagedBean(name = "stadiumManager")
@SessionScoped
public class StadiumCtr {
	private List<Stadium> stadiums = new ArrayList<Stadium>();
	private Stadium stadium = new Stadium();
	private DataModel<Stadium> datamodel = new ListDataModel<Stadium>();

	@EJB
	private StadiumServicesLocal stadiumServicesLocal;

	public String showSelectedStadium() {
		stadium = datamodel.getRowData();
		System.out.println(stadium.getLibele());
		return "";
	}

	public List<Stadium> getStadiums() {
		stadiums = stadiumServicesLocal.findAllStadiums();
		return stadiums;
	}

	public void setStadiums(List<Stadium> stadiums) {
		this.stadiums = stadiums;
	}

	public DataModel<Stadium> getDatamodel() {
		datamodel.setWrappedData(stadiumServicesLocal.findAllStadiums());
		return datamodel;
	}

	public void setDatamodel(DataModel<Stadium> datamodel) {
		this.datamodel = datamodel;
	}

}
