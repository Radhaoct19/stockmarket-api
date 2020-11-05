package com.rbc.task.stockmarket.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.Scope;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rbc.task.stockmarket.batch.ProcessDataSetBatchProcess;
import com.rbc.task.stockmarket.dto.DataSetDto;
import com.rbc.task.stockmarket.repositories.StockDao;
import com.rbc.task.stockmarket.vo.DataSetBulkUploadVo;
import com.rbc.task.stockmarket.vo.DataSetVo;

/**
 * 
 * Bean configuration class
 * 
 * @author 09292537
 *
 */
@Configuration
public class CustomConfig {

	@Bean
	public TaskExecutor taskExecutor() {
		return new SimpleAsyncTaskExecutor();
	}
}
