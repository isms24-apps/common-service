package com.collections.commons.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @author chippala
 *
 */
@Data
public class LocaleVO implements Serializable {

  private static final long serialVersionUID = -8120091221979331446L;

  private Long id;

	private String langCode;

	private String countryCode;

}
