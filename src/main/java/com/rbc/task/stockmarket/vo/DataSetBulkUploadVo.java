package com.rbc.task.stockmarket.vo;

import java.util.List;

import com.rbc.task.stockmarket.dto.DataSetDto;
/**
 * 
 * Request object for bulkupoad call
 * 
 * @author Radha
 *
 */
public class DataSetBulkUploadVo {

	private List<DataSetDto>  dataSetList;

	public List<DataSetDto> getDataSetList() {
		return dataSetList;
	}

	public void setDataSetList(List<DataSetDto> dataSetList) {
		this.dataSetList = dataSetList;
	}

	@Override
	public String toString() {
		return "DataSetBulkUploadVo [dataSetList=" + dataSetList + "]";
	}	
}
