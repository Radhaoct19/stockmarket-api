package com.rbc.task.stockmarket.batch;

import java.util.List;

import org.springframework.context.ApplicationContext;

import com.rbc.task.stockmarket.dto.DataSetDto;
import com.rbc.task.stockmarket.repositories.StockDao;
import com.rbc.task.stockmarket.vo.DataSetBulkUploadVo;
/**
 * 
 * Thread class to perform bulk dataset upload
 * @author Radha
 *
 */
public class ProcessDataSetBatchProcess implements Runnable{

	private DataSetBulkUploadVo dataSetBulkUploadVo;
	private StockDao stockDao;
	
	public ProcessDataSetBatchProcess(ApplicationContext applicationContext, DataSetBulkUploadVo dataSetBulkUploadVo){
		this.stockDao = applicationContext.getBean(StockDao.class);
		this.dataSetBulkUploadVo = dataSetBulkUploadVo;
	}
	public void run() {
		List<DataSetDto> datasetDtoList = dataSetBulkUploadVo.getDataSetList();
		for(DataSetDto dataSetDto : datasetDtoList) {
			stockDao.addRecord(dataSetDto);
		}
		
	}

}
