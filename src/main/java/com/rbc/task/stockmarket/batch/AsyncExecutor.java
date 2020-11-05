package com.rbc.task.stockmarket.batch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rbc.task.stockmarket.dto.DataSetDto;
import com.rbc.task.stockmarket.repositories.StockDao;
import com.rbc.task.stockmarket.vo.DataSetBulkUploadVo;
import com.rbc.task.stockmarket.vo.DataSetVo;

/**
 * To perform the bulk dataset upload using thread in the background
 * 
 * @author Radha
 *
 */
@Component
@Scope("prototype")
public class AsyncExecutor {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private TaskExecutor taskExecutor;
	
	public void performBulkUpload(DataSetBulkUploadVo dataSetBulkUploadVo) {
		taskExecutor.execute(new ProcessDataSetBatchProcess(applicationContext, dataSetBulkUploadVo));
	}
}
