package com.rbc.task.stockmarket.vo;

import com.rbc.task.stockmarket.dto.DataSetDto;

/**
 * 
 * Request object to add DataSet
 * 
 * @author Radha
 *
 */
public class DataSetVo {

	private DataSetDto dataSet;

	public DataSetDto getDataSet() {
		return dataSet;
	}

	public void setDataSet(DataSetDto dataSet) {
		this.dataSet = dataSet;
	}

	@Override
	public String toString() {
		return "DataSetVo [dataSet=" + dataSet + "]";
	}

	
}
