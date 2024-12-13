package com.collections.commons.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

/**
 * @author rupasrim
 */
@Data
public class CategoryVO implements Serializable {

	private static final long serialVersionUID = -692584083356611788L;

	private Long id;

	private String name;

	private Long cmsCatId;

	private Boolean isEnable;

	private Long parentId;

	private byte[] image;

	private MultipartFile imageFile;

	private LocalDateTime lastModifiedDate;
	
	public CategoryVO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CategoryVO() {
		super();
	}
	
}
