package com.collections.commons.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class CouponResponseVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String response;
  private String message;
  private HttpStatus status;

  private List<ImportRowResultVO> failedRowData = new ArrayList<>();

  public CouponResponseVO() {

  }

  public CouponResponseVO(String response, String message, HttpStatus status) {
    this.response = response;
    this.message = message;
    this.status = status;
  }

}
