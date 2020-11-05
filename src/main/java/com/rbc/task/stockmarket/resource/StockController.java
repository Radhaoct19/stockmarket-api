package com.rbc.task.stockmarket.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rbc.task.stockmarket.dto.DataSetDto;
import com.rbc.task.stockmarket.service.StockService;
import com.rbc.task.stockmarket.vo.DataSetBulkUploadVo;
import com.rbc.task.stockmarket.vo.DataSetVo;
/**
 * 
 * RestControll for all end point
 * 
 * @author Radha
 *
 */
@RestController
@RequestMapping("/stock")
public class StockController {
	
	@Autowired
	private StockService stockService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<String> addRecord(@RequestBody DataSetVo  dataSetVo) {
		String response = stockService.addRecord(dataSetVo);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/querystock/{stock}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<DataSetDto>>  queryStock(@PathVariable String stock) {
		return new ResponseEntity<>(stockService.queryStock(stock), HttpStatus.OK);
	}
	
	@RequestMapping(value ="/bulkuplod", method = RequestMethod.POST)
	public ResponseEntity<Void> builkUpload(@RequestBody DataSetBulkUploadVo dataSetBulkUploadVo) {
		stockService.bulkUpload(dataSetBulkUploadVo);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
