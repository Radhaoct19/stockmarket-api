package com.rbc.task.stockmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbc.task.stockmarket.batch.AsyncExecutor;
import com.rbc.task.stockmarket.dto.DataSetDto;
import com.rbc.task.stockmarket.repositories.StockDao;
import com.rbc.task.stockmarket.vo.DataSetBulkUploadVo;
import com.rbc.task.stockmarket.vo.DataSetVo;

/**
 * 
 * Servcie class for stock market
 * 
 * @author Radha
 *
 */
@Service
public class StockService {

	@Autowired
	private AsyncExecutor asyncExecuter;
	
	@Autowired
	private StockDao stockDao;
	public String addRecord(DataSetVo dataSetVo) {
		stockDao.addRecord(dataSetVo.getDataSet());
		return "Record added sucessfully";
	}
	
	public void bulkUpload(DataSetBulkUploadVo dataSetBulkUploadVo) {
		asyncExecuter.performBulkUpload(dataSetBulkUploadVo);
	}
	
	public List<DataSetDto> queryStock(String stock) {
		return stockDao.queryStock(stock);
	}
}
