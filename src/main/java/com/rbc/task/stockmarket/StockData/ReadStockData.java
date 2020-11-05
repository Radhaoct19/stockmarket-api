package com.rbc.task.stockmarket.StockData;

/**
 * 
 * Class that store the Dataset details instead of DB operations
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.rbc.task.stockmarket.dto.DataSetDto;

public class ReadStockData {

	private static List<DataSetDto> dataSetDtos;

	public static List<DataSetDto> queryForStock(String stock) {
		List<DataSetDto> dataSetDtosList = new ArrayList();
		if (dataSetDtos != null) {
			dataSetDtosList= dataSetDtos.stream()
				.filter(datasetdto -> datasetdto.getStock().equals(stock)).collect(Collectors.toList());
		}
		return dataSetDtosList;
	}

	public static void addRecord(DataSetDto dataSetDto) {
		if (dataSetDtos == null)
			dataSetDtos = new ArrayList<DataSetDto>();
		dataSetDtos.add(dataSetDto);
	}
}
