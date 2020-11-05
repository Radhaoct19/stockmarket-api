package com.rbc.task.stockmarket.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rbc.task.stockmarket.StockData.ReadStockData;
import com.rbc.task.stockmarket.dto.DataSetDto;

/**
 * Repository class to store data in DB
 * @author Radha
 *
 */
@Repository
public class StockDao {

	public void addRecord(DataSetDto dataSetDto) {
		ReadStockData.addRecord(dataSetDto);
	}
	
	public List<DataSetDto> queryStock(String stock) {
		return ReadStockData.queryForStock(stock);
	}
	
}
