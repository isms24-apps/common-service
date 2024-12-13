package com.collections.commons.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tejasri
 * 
 */
@Slf4j
public class ImportDataHelper {

  private ImportDataHelper() {
  }

  public static Workbook getWorkBook(File file) {
	  try (FileInputStream fis = new FileInputStream(file)) {
          return new XSSFWorkbook(fis);
      } catch (IOException e) {
          e.printStackTrace(); 
      }
    return null;
  }

  public static Map<String, Integer> getHeaderRowMap(Row headerRow) {
    Map<String, Integer> headerRowMap = new HashMap<>();
    int noOfColumnsInHeaderRow = headerRow.getPhysicalNumberOfCells();
    for(int colIdx = 0; colIdx < noOfColumnsInHeaderRow; ++colIdx) {
      String header = CellUtil.getCell(headerRow, colIdx).toString();
      headerRowMap.put(header, colIdx);
    }
    return headerRowMap;
  }

}
